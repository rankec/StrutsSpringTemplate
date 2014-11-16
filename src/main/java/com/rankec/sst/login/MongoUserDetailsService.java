package com.rankec.sst.login;

import com.rankec.sst.login.model.Authority;
import com.rankec.sst.login.repository.AuthorityRepository;
import com.rankec.sst.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/**
 * Created by rankec on 16.11.14.
 */
public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthorityRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.rankec.sst.login.model.User user = repository.findByName(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid username/password.");
        }

        Collection<? extends GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(getAuthGroups(username));
        return new User(user.getName(), user.getPassword(), authorities);
    }


    private String[] getAuthGroups(String username) {
        Authority authority = authRepository.findByUsername(username);
        if (authority != null) {
            return authority.getAuthArray();

        }
        return new String[0];

    }

}

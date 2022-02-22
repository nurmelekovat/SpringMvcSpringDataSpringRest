package com.innova.security;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableWebSecurity
public class _08_AddUserEncrypedBean extends WebSecurityConfigurerAdapter {

    //    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder
//                .inMemoryAuthentication()//bellek üzereinde olsun database düzeyde olmasın
//                .withUser("root") //kullanıc adı
//                .password(passwordEncoder().encode("root"))//şifrelenmiş datatdır artık
//                .roles("USER");
//    }

}
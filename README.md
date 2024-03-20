# DAO Authentication Steps
1. Setup db connecting string in application property file
2. Create entity class with field (email, password, role)
3. Configure the SecurityFilterChain bean


      @Bean
      SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
         --- your filter chain ---
      }
4. And create other customUserDetails class and the implement spring security UserDetails interface
5. Then create CustomService class which implements the Spring Security UserDetails and override loadUserByUsername(Sting username)
6. 

          loadUserByUsername(Sting username){
          --- username fatching code from db ---
          }
7. inset data for email, password and role in to the database use /register api to create data in the db.
8. finally test it from postman.
9. If it does not work refer this application code. 
    

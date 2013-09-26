import org.lilie.services.eliot.tice.securite.rbac.EliotTiceUserDetailsService

beans = {
  userDetailsService(EliotTiceUserDetailsService) {
    utilisateurService = ref("utilisateurService")
    roleUtilisateurService = ref("roleUtilisateurService")
  }
}
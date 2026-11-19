/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd018
 */

GENERAL_NAMES * FUN_00afd018(X509V3_CTX *param_1,char *param_2)

{
  stack_st_CONF_VALUE *nval;
  GENERAL_NAMES *pGVar1;
  
  if (*param_2 == '@') {
    nval = X509V3_get_section(param_1,param_2 + 1);
  }
  else {
    nval = X509V3_parse_list(param_2);
  }
  if (nval == (stack_st_CONF_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_crld.c",0x38,"gnames_from_sectname");
    ERR_set_error(0x22,0x96,0);
    pGVar1 = (GENERAL_NAMES *)0x0;
  }
  else {
    pGVar1 = v2i_GENERAL_NAMES((X509V3_EXT_METHOD *)0x0,param_1,nval);
    if (*param_2 == '@') {
      X509V3_section_free(param_1,nval);
    }
    else {
      OPENSSL_sk_pop_free(nval,X509V3_conf_free);
    }
  }
  return pGVar1;
}


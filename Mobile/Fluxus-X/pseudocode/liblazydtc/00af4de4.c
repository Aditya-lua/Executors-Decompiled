/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4de4
 */

int X509V3_EXT_REQ_add_conf(lhash_st_CONF_VALUE *conf,X509V3_CTX *ctx,char *section,X509_REQ *req)

{
  int iVar1;
  CONF *conf_00;
  stack_st_X509_EXTENSION *local_38;
  
  conf_00 = NCONF_new((CONF_METHOD *)0x0);
  if (conf_00 == (CONF *)0x0) {
    iVar1 = 0;
  }
  else {
    CONF_set_nconf(conf_00,conf);
    local_38 = (stack_st_X509_EXTENSION *)0x0;
    iVar1 = X509V3_EXT_add_nconf_sk(conf_00,ctx,section,&local_38);
    if (((req != (X509_REQ *)0x0) && (iVar1 != 0)) && (local_38 != (stack_st_X509_EXTENSION *)0x0))
    {
      iVar1 = X509_REQ_add_extensions(req,local_38);
    }
    OPENSSL_sk_pop_free(local_38,X509_EXTENSION_free);
    CONF_set_nconf(conf_00,(lhash_st_CONF_VALUE *)0x0);
    NCONF_free(conf_00);
  }
  return iVar1;
}


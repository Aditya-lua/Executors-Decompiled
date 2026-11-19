/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4b80
 */

X509_EXTENSION * X509V3_EXT_conf(lhash_st_CONF_VALUE *conf,X509V3_CTX *ctx,char *name,char *value)

{
  CONF *conf_00;
  X509_EXTENSION *pXVar1;
  
  conf_00 = NCONF_new((CONF_METHOD *)0x0);
  pXVar1 = (X509_EXTENSION *)0x0;
  if (conf_00 != (CONF *)0x0) {
    CONF_set_nconf(conf_00,conf);
    pXVar1 = (X509_EXTENSION *)FUN_00af3e8c(conf_00,ctx,0,name,value);
    CONF_set_nconf(conf_00,(lhash_st_CONF_VALUE *)0x0);
    NCONF_free(conf_00);
  }
  return pXVar1;
}


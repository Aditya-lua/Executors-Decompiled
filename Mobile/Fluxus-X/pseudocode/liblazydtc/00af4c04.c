/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4c04
 */

X509_EXTENSION *
X509V3_EXT_conf_nid(lhash_st_CONF_VALUE *conf,X509V3_CTX *ctx,int ext_nid,char *value)

{
  CONF *conf_00;
  X509_EXTENSION *pXVar1;
  
  conf_00 = NCONF_new((CONF_METHOD *)0x0);
  pXVar1 = (X509_EXTENSION *)0x0;
  if (conf_00 != (CONF *)0x0) {
    CONF_set_nconf(conf_00,conf);
    pXVar1 = X509V3_EXT_nconf_nid(conf_00,ctx,ext_nid,value);
    CONF_set_nconf(conf_00,(lhash_st_CONF_VALUE *)0x0);
    NCONF_free(conf_00);
  }
  return pXVar1;
}


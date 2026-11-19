/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4d5c
 */

int X509V3_EXT_CRL_add_conf(lhash_st_CONF_VALUE *conf,X509V3_CTX *ctx,char *section,X509_CRL *crl)

{
  ASN1_INTEGER **sk;
  int iVar1;
  CONF *conf_00;
  
  conf_00 = NCONF_new((CONF_METHOD *)0x0);
  iVar1 = 0;
  if (conf_00 != (CONF *)0x0) {
    CONF_set_nconf(conf_00,conf);
    sk = (ASN1_INTEGER **)0x0;
    if (crl != (X509_CRL *)0x0) {
      sk = &crl->crl_number;
    }
    iVar1 = X509V3_EXT_add_nconf_sk(conf_00,ctx,section,(stack_st_X509_EXTENSION **)sk);
    CONF_set_nconf(conf_00,(lhash_st_CONF_VALUE *)0x0);
    NCONF_free(conf_00);
  }
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af48d4
 */

int X509V3_EXT_CRL_add_nconf(CONF *conf,X509V3_CTX *ctx,char *section,X509_CRL *crl)

{
  ASN1_INTEGER **sk;
  int iVar1;
  
  sk = (ASN1_INTEGER **)0x0;
  if (crl != (X509_CRL *)0x0) {
    sk = &crl->crl_number;
  }
  iVar1 = X509V3_EXT_add_nconf_sk(conf,ctx,section,(stack_st_X509_EXTENSION **)sk);
  return iVar1;
}


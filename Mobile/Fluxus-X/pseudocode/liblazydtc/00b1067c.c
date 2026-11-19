/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1067c
 */

int X509_STORE_CTX_set_default(X509_STORE_CTX *ctx,char *name)

{
  int iVar1;
  X509_VERIFY_PARAM *from;
  
  from = X509_VERIFY_PARAM_lookup(name);
  if (from == (X509_VERIFY_PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0xa46,"X509_STORE_CTX_set_default");
    ERR_set_error(0xb,0x79,"name=%s",name);
    return 0;
  }
  iVar1 = X509_VERIFY_PARAM_inherit((X509_VERIFY_PARAM *)ctx->crls,from);
  return iVar1;
}


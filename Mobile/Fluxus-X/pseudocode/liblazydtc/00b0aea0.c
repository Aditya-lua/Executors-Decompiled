/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0aea0
 */

int X509_STORE_add_crl(X509_STORE *ctx,X509_CRL *x)

{
  int iVar1;
  
  iVar1 = FUN_00b0ad24(ctx,x,1);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0x198,"X509_STORE_add_crl");
    ERR_set_error(0xb,0xc0100,0);
  }
  return (int)(iVar1 != 0);
}


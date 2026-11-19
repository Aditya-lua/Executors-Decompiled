/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0acc8
 */

int X509_STORE_add_cert(X509_STORE *ctx,X509 *x)

{
  int iVar1;
  
  iVar1 = FUN_00b0ad24(ctx,x,0);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",399,"X509_STORE_add_cert");
    ERR_set_error(0xb,0xc0100,0);
    return 0;
  }
  return 1;
}


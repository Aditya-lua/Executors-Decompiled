/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15a1c
 */

int X509_REQ_sign_ctx(X509_REQ *x,EVP_MD_CTX *ctx)

{
  int iVar1;
  ASN1_ITEM *it;
  
  if (x == (X509_REQ *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x7f,"X509_REQ_sign_ctx");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  *(undefined4 *)&x->signature = 1;
  it = (ASN1_ITEM *)X509_REQ_INFO_it();
  iVar1 = ASN1_item_sign_ctx(it,(X509_ALGOR *)&x[1].references,(X509_ALGOR *)0x0,
                             (ASN1_BIT_STRING *)x[2].sig_alg,x,ctx);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15b44
 */

int X509_CRL_sign_ctx(X509_CRL *x,EVP_MD_CTX *ctx)

{
  int iVar1;
  ASN1_ITEM *it;
  
  if (x == (X509_CRL *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x97,"X509_CRL_sign_ctx");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  x->sha1_hash[8] = '\x01';
  x->sha1_hash[9] = '\0';
  x->sha1_hash[10] = '\0';
  x->sha1_hash[0xb] = '\0';
  it = (ASN1_ITEM *)X509_CRL_INFO_it();
  iVar1 = ASN1_item_sign_ctx(it,(X509_ALGOR *)&x->sig_alg,(X509_ALGOR *)(x->sha1_hash + 0x10),
                             (ASN1_BIT_STRING *)&x->meth,x,ctx);
  return iVar1;
}


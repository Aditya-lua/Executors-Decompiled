/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15848
 */

int X509_sign_ctx(X509 *x,EVP_MD_CTX *ctx)

{
  int iVar1;
  ASN1_ITEM *it;
  
  if (x == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x53,"X509_sign_ctx");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  *(undefined4 *)&x->crldp = 1;
  it = (ASN1_ITEM *)X509_CINF_it();
  iVar1 = ASN1_item_sign_ctx(it,(X509_ALGOR *)&x->name,(X509_ALGOR *)&x->altname,
                             (ASN1_BIT_STRING *)&x->rfc3779_addr,x,ctx);
  return iVar1;
}


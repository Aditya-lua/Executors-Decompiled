/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab3644
 */

int ASN1_item_verify(ASN1_ITEM *it,X509_ALGOR *algor1,ASN1_BIT_STRING *signature,void *data,
                    EVP_PKEY *pkey)

{
  int iVar1;
  long lVar2;
  EVP_PKEY_CTX *ctx;
  
  lVar2 = evp_md_ctx_new_ex(pkey,0,0,0);
  if (lVar2 == 0) {
    iVar1 = -1;
  }
  else {
    iVar1 = ASN1_item_verify_ctx(it,algor1,signature,data,lVar2);
    ctx = (EVP_PKEY_CTX *)EVP_MD_CTX_get_pkey_ctx(lVar2);
    EVP_PKEY_CTX_free(ctx);
    EVP_MD_CTX_free(lVar2);
  }
  return iVar1;
}


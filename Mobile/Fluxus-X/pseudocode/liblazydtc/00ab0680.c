/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0680
 */

int ASN1_item_sign_ex(ASN1_ITEM *param_1,X509_ALGOR *param_2,X509_ALGOR *param_3,
                     ASN1_BIT_STRING *param_4,void *param_5,undefined8 param_6,EVP_PKEY *param_7,
                     EVP_MD *param_8,undefined8 param_9,undefined8 param_10)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  EVP_PKEY_CTX *ctx_00;
  
  ctx = (EVP_MD_CTX *)evp_md_ctx_new_ex(param_7,param_6,param_9,param_10);
  if (ctx == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_sign.c",0x88,"ASN1_item_sign_ex");
    ERR_set_error(0xd,0xc0100,0);
    iVar1 = 0;
  }
  else {
    iVar1 = EVP_DigestSignInit(ctx,(EVP_PKEY_CTX **)0x0,param_8,(ENGINE *)0x0,param_7);
    if (iVar1 == 0) {
      iVar1 = 0;
    }
    else {
      iVar1 = ASN1_item_sign_ctx(param_1,param_2,param_3,param_4,param_5,ctx);
    }
    ctx_00 = (EVP_PKEY_CTX *)EVP_MD_CTX_get_pkey_ctx(ctx);
    EVP_PKEY_CTX_free(ctx_00);
    EVP_MD_CTX_free(ctx);
  }
  return iVar1;
}


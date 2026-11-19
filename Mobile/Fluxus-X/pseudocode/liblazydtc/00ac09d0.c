/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac09d0
 */

int PKCS7_SIGNER_INFO_sign(PKCS7_SIGNER_INFO *si)

{
  int iVar1;
  char *name;
  EVP_MD *pEVar2;
  EVP_MD_CTX *ctx;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  ASN1_ITEM *it;
  ASN1_INTEGER *pAVar6;
  ASN1_VALUE *val;
  int local_50 [2];
  uchar *local_48;
  undefined8 uStack_38;
  
  uStack_38 = 0;
  local_48 = (uchar *)0x0;
  pAVar6 = si[1].version;
  iVar1 = OBJ_obj2nid(si->digest_alg->algorithm);
  name = OBJ_nid2sn(iVar1);
  pEVar2 = EVP_get_digestbyname(name);
  if (pEVar2 != (EVP_MD *)0x0) {
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (ctx == (EVP_MD_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x39a,"PKCS7_SIGNER_INFO_sign");
      ERR_set_error(0x21,0xc0100,0);
    }
    else {
      uVar3 = EVP_MD_get0_name(pEVar2);
      uVar4 = ossl_pkcs7_ctx_get0_libctx(pAVar6);
      uVar5 = ossl_pkcs7_ctx_get0_propq(pAVar6);
      iVar1 = EVP_DigestSignInit_ex(ctx,&uStack_38,uVar3,uVar4,uVar5,si->pkey,0);
      if (0 < iVar1) {
        val = (ASN1_VALUE *)si->auth_attr;
        it = (ASN1_ITEM *)PKCS7_ATTR_SIGN_it();
        iVar1 = ASN1_item_i2d(val,&local_48,it);
        if ((local_48 != (uchar *)0x0) &&
           (iVar1 = EVP_DigestSignUpdate(ctx,local_48,(long)iVar1), 0 < iVar1)) {
          CRYPTO_free(local_48);
          local_48 = (uchar *)0x0;
          iVar1 = EVP_DigestSignFinal(ctx,(uchar *)0x0,(size_t *)local_50);
          if ((0 < iVar1) &&
             ((local_48 = CRYPTO_malloc(local_50[0],"crypto/pkcs7/pk7_doit.c",0x3ae),
              local_48 != (uchar *)0x0 &&
              (iVar1 = EVP_DigestSignFinal(ctx,local_48,(size_t *)local_50), 0 < iVar1)))) {
            EVP_MD_CTX_free(ctx);
            ASN1_STRING_set0(si->enc_digest,local_48,local_50[0]);
            return 1;
          }
        }
      }
    }
    CRYPTO_free(local_48);
    EVP_MD_CTX_free(ctx);
  }
  return 0;
}


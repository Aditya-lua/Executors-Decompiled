/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac0d60
 */

int PKCS7_signatureVerify(BIO *bio,PKCS7 *p7,PKCS7_SIGNER_INFO *si,X509 *x509)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  EVP_MD_CTX *out;
  BIO *bp;
  X509_ATTRIBUTE *attr;
  ASN1_TYPE *pAVar5;
  long lVar6;
  char *pcVar7;
  EVP_MD *type;
  ASN1_ITEM *it;
  ASN1_STRING *pAVar8;
  ASN1_OCTET_STRING *pAVar9;
  EVP_MD *pEVar10;
  ASN1_VALUE *val;
  uint local_a4;
  uchar *local_a0;
  uchar auStack_98 [64];
  EVP_MD_CTX *local_58;
  
  uVar3 = ossl_pkcs7_get0_ctx(p7);
  uVar4 = ossl_pkcs7_ctx_get0_libctx();
  uVar3 = ossl_pkcs7_ctx_get0_propq(uVar3);
  out = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (out == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x408,"PKCS7_signatureVerify");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = OBJ_obj2nid(p7->type);
    if ((iVar1 == 0x16) || (iVar1 = OBJ_obj2nid(p7->type), iVar1 == 0x18)) {
      iVar1 = OBJ_obj2nid(si->digest_alg->algorithm);
      while ((bio != (BIO *)0x0 && (bp = BIO_find_type(bio,0x208), bp != (BIO *)0x0))) {
        BIO_ctrl(bp,0x78,0,&local_58);
        if (local_58 == (EVP_MD_CTX *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x41c,"PKCS7_signatureVerify");
          uVar3 = 0xc0103;
          goto LAB_00ac0fb4;
        }
        EVP_MD_CTX_get0_md();
        iVar2 = EVP_MD_get_type();
        if (iVar2 == iVar1) {
LAB_00ac0ec8:
          iVar2 = EVP_MD_CTX_copy_ex(out,local_58);
          if (iVar2 == 0) goto LAB_00ac0fbc;
          val = (ASN1_VALUE *)si->auth_attr;
          if ((val == (ASN1_VALUE *)0x0) || (iVar2 = OPENSSL_sk_num(val), iVar2 == 0)) {
            pEVar10 = (EVP_MD *)0x0;
LAB_00ac0ff8:
            pAVar9 = si->enc_digest;
            lVar6 = X509_get0_pubkey(x509);
            if (lVar6 != 0) {
              iVar1 = EVP_VerifyFinal_ex(out,pAVar9->data,pAVar9->length,lVar6,uVar4,uVar3);
              if (0 < iVar1) {
                iVar1 = 1;
                goto LAB_00ac0fc4;
              }
              ERR_new();
              ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x46a,"PKCS7_signatureVerify");
              uVar3 = 0x69;
LAB_00ac1074:
              ERR_set_error(0x21,uVar3,0);
            }
          }
          else {
            local_a0 = (uchar *)0x0;
            iVar2 = EVP_DigestFinal_ex(out,auStack_98,&local_a4);
            if (iVar2 == 0) goto LAB_00ac0fbc;
            iVar2 = X509at_get_attr_by_NID((stack_st_X509_ATTRIBUTE *)val,0x33,-1);
            attr = X509at_get_attr((stack_st_X509_ATTRIBUTE *)val,iVar2);
            pAVar5 = X509_ATTRIBUTE_get0_type(attr,0);
            if ((pAVar5 == (ASN1_TYPE *)0x0) ||
               (pAVar8 = (pAVar5->value).asn1_string, pAVar8 == (ASN1_STRING *)0x0)) {
              ERR_new();
              uVar3 = 0x43c;
              goto LAB_00ac0e64;
            }
            if ((pAVar8->length == local_a4) &&
               (iVar2 = memcmp(pAVar8->data,auStack_98,(ulong)(uint)pAVar8->length), iVar2 == 0)) {
              ERR_set_mark();
              pcVar7 = OBJ_nid2sn(iVar1);
              pEVar10 = (EVP_MD *)EVP_MD_fetch(uVar4,pcVar7,uVar3);
              type = pEVar10;
              if (pEVar10 == (EVP_MD *)0x0) {
                pcVar7 = OBJ_nid2sn(iVar1);
                type = EVP_get_digestbyname(pcVar7);
                if (type != (EVP_MD *)0x0) goto LAB_00ac10c0;
              }
              else {
LAB_00ac10c0:
                iVar1 = EVP_DigestInit_ex(out,type,(ENGINE *)0x0);
                if (iVar1 != 0) {
                  iVar1 = ERR_pop_to_mark();
                  it = (ASN1_ITEM *)PKCS7_ATTR_VERIFY_it(iVar1);
                  iVar1 = ASN1_item_i2d(val,&local_a0,it);
                  if (iVar1 < 1) {
                    ERR_new();
                    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x457,"PKCS7_signatureVerify");
                    uVar3 = 0x8000d;
                    goto LAB_00ac1074;
                  }
                  iVar1 = EVP_DigestUpdate(out,local_a0,(long)iVar1);
                  if (iVar1 != 0) {
                    CRYPTO_free(local_a0);
                    goto LAB_00ac0ff8;
                  }
                  iVar1 = 0;
                  goto LAB_00ac0fc4;
                }
              }
              ERR_clear_last_mark();
              iVar1 = 0;
              goto LAB_00ac0fc4;
            }
            ERR_new();
            ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x441,"PKCS7_signatureVerify");
            ERR_set_error(0x21,0x65,0);
            pEVar10 = (EVP_MD *)0x0;
          }
          iVar1 = -1;
          goto LAB_00ac0fc4;
        }
        EVP_MD_CTX_get0_md(local_58);
        iVar2 = EVP_MD_get_pkey_type();
        if (iVar2 == iVar1) goto LAB_00ac0ec8;
        bio = BIO_next(bp);
      }
      ERR_new();
      uVar3 = 0x417;
LAB_00ac0e64:
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar3,"PKCS7_signatureVerify");
      uVar3 = 0x6c;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x40d,"PKCS7_signatureVerify");
      uVar3 = 0x72;
    }
  }
LAB_00ac0fb4:
  ERR_set_error(0x21,uVar3,0);
LAB_00ac0fbc:
  iVar1 = 0;
  pEVar10 = (EVP_MD *)0x0;
LAB_00ac0fc4:
  EVP_MD_CTX_free(out);
  EVP_MD_free(pEVar10);
  return iVar1;
}


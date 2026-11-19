/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac0298
 */

int PKCS7_dataFinal(PKCS7 *p7,BIO *bio)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  EVP_MD_CTX *out;
  PKCS7_SIGNER_INFO *si;
  X509_ATTRIBUTE *attr;
  ASN1_TYPE *pAVar4;
  void *ptr;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  BIO *bp;
  char *pcVar8;
  ASN1_OBJECT *pAVar9;
  PKCS7_ENC_CONTENT *pPVar10;
  stack_st_PKCS7_RECIP_INFO *psVar11;
  ASN1_OBJECT *a;
  EVP_PKEY *pEVar12;
  stack_st_X509_ATTRIBUTE *x;
  EVP_MD_CTX *local_b0;
  uint local_a4;
  int local_a0;
  undefined4 uStack_9c;
  
  if (p7 == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x2e4,"PKCS7_dataFinal");
    uVar3 = 0x8f;
LAB_00ac038c:
    ERR_set_error(0x21,uVar3,0);
    return 0;
  }
  uVar3 = ossl_pkcs7_get0_ctx();
  if ((p7->d).ptr == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x2eb,"PKCS7_dataFinal");
    uVar3 = 0x7a;
    goto LAB_00ac038c;
  }
  out = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (out == (EVP_MD_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x2f1,"PKCS7_dataFinal");
    uVar3 = 0xc0100;
    goto LAB_00ac038c;
  }
  iVar1 = OBJ_obj2nid(p7->type);
  p7->state = 0;
  switch(iVar1) {
  case 0x15:
    a = (ASN1_OBJECT *)(p7->d).data;
    break;
  case 0x16:
    psVar11 = (p7->d).enveloped[1].recipientinfo;
    pPVar10 = (p7->d).enveloped[1].enc_data;
    iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar10->cipher);
    if (iVar1 == 0x15) {
      a = pPVar10[1].content_type;
    }
    else {
      iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar10->cipher);
      a = (ASN1_OBJECT *)0x0;
      if (5 < iVar1 - 0x15U) {
        pAVar9 = pPVar10[1].content_type;
        if (pAVar9 == (ASN1_OBJECT *)0x0) {
          a = (ASN1_OBJECT *)0x0;
        }
        else {
          a = (ASN1_OBJECT *)0x0;
          if (*(int *)&pAVar9->sn == 4) {
            a = (ASN1_OBJECT *)pAVar9->ln;
          }
        }
      }
    }
    iVar1 = OBJ_obj2nid(((p7->d).sign)->contents->type);
    if ((iVar1 == 0x15) && (p7->detached != 0)) {
      ASN1_OCTET_STRING_free((ASN1_STRING *)a);
      a = (ASN1_OBJECT *)0x0;
      (p7->d).enveloped[1].enc_data[1].content_type = (ASN1_OBJECT *)0x0;
    }
LAB_00ac0544:
    if (psVar11 != (stack_st_PKCS7_RECIP_INFO *)0x0) goto LAB_00ac0548;
    break;
  case 0x17:
    a = (ASN1_OBJECT *)((p7->d).enveloped)->enc_data->enc_data;
    if (a == (ASN1_OBJECT *)0x0) {
      a = (ASN1_OBJECT *)ASN1_OCTET_STRING_new();
      if (a == (ASN1_OBJECT *)0x0) {
        ERR_new();
        pcVar8 = "PKCS7_dataFinal";
        uVar3 = 0x30f;
LAB_00ac08a4:
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar3,pcVar8);
        uVar3 = 0xc0100;
        goto LAB_00ac08b4;
      }
      ((p7->d).enveloped)->enc_data->enc_data = (ASN1_OCTET_STRING *)a;
    }
    break;
  case 0x18:
    psVar11 = (p7->d).enveloped[1].recipientinfo;
    a = (ASN1_OBJECT *)((p7->d).enveloped[1].enc_data)->enc_data;
    if (a != (ASN1_OBJECT *)0x0) goto LAB_00ac0544;
    a = (ASN1_OBJECT *)ASN1_OCTET_STRING_new();
    if (a == (ASN1_OBJECT *)0x0) {
      ERR_new();
      pcVar8 = "PKCS7_dataFinal";
      uVar3 = 0x303;
      goto LAB_00ac08a4;
    }
    ((p7->d).enveloped[1].enc_data)->enc_data = (ASN1_OCTET_STRING *)a;
    if (psVar11 == (stack_st_PKCS7_RECIP_INFO *)0x0) break;
LAB_00ac0548:
    iVar1 = OPENSSL_sk_num(psVar11);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        si = (PKCS7_SIGNER_INFO *)OPENSSL_sk_value(psVar11,iVar1);
        if (si->pkey != (EVP_PKEY *)0x0) {
          iVar2 = OBJ_obj2nid(si->digest_alg->algorithm);
          lVar7 = FUN_00ac08ec(&local_b0,bio,iVar2);
          if ((lVar7 == 0) || (iVar2 = EVP_MD_CTX_copy_ex(out,local_b0), iVar2 == 0))
          goto LAB_00ac08bc;
          iVar2 = OPENSSL_sk_num(si->auth_attr);
          if (iVar2 < 1) {
            local_a0 = EVP_PKEY_get_size(si->pkey);
            ptr = CRYPTO_malloc(local_a0,"crypto/pkcs7/pk7_doit.c",0x351);
            if (ptr == (void *)0x0) goto LAB_00ac08bc;
            pEVar12 = si->pkey;
            uVar5 = ossl_pkcs7_ctx_get0_libctx(uVar3);
            uVar6 = ossl_pkcs7_ctx_get0_propq(uVar3);
            iVar2 = EVP_SignFinal_ex(out,ptr,&local_a0,pEVar12,uVar5,uVar6);
            if (iVar2 == 0) {
              CRYPTO_free(ptr);
              ERR_new();
              pcVar8 = "PKCS7_dataFinal";
              uVar3 = 0x359;
              goto LAB_00ac0878;
            }
            ASN1_STRING_set0(si->enc_digest,ptr,local_a0);
          }
          else {
            x = si->auth_attr;
            iVar2 = X509at_get_attr_by_NID(x,0x34,-1);
            attr = X509at_get_attr(x,iVar2);
            pAVar4 = X509_ATTRIBUTE_get0_type(attr,0);
            if ((pAVar4 == (ASN1_TYPE *)0x0) &&
               (iVar2 = PKCS7_add0_attrib_signing_time(si,(ASN1_TIME *)0x0), iVar2 == 0)) {
              ERR_new();
              pcVar8 = "do_pkcs7_signed_attrib";
              uVar3 = 0x2c1;
              goto LAB_00ac08a4;
            }
            iVar2 = EVP_DigestFinal_ex(out,(uchar *)&local_a0,&local_a4);
            if (iVar2 == 0) {
              ERR_new();
              pcVar8 = "do_pkcs7_signed_attrib";
              uVar3 = 0x2c8;
LAB_00ac0878:
              ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar3,pcVar8);
              uVar3 = 0x80006;
              goto LAB_00ac08b4;
            }
            iVar2 = PKCS7_add1_attrib_digest(si,(uchar *)&local_a0,local_a4);
            if (iVar2 == 0) {
              ERR_new();
              pcVar8 = "do_pkcs7_signed_attrib";
              uVar3 = 0x2cc;
              goto LAB_00ac08a4;
            }
            iVar2 = PKCS7_SIGNER_INFO_sign(si);
            if (iVar2 == 0) goto LAB_00ac08bc;
          }
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(psVar11);
      } while (iVar1 < iVar2);
    }
    break;
  case 0x19:
    pPVar10 = ((p7->d).enveloped)->enc_data;
    iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar10->cipher);
    if (iVar1 == 0x15) {
      a = pPVar10[1].content_type;
    }
    else {
      iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar10->cipher);
      a = (ASN1_OBJECT *)0x0;
      if (5 < iVar1 - 0x15U) {
        pAVar9 = pPVar10[1].content_type;
        if (pAVar9 == (ASN1_OBJECT *)0x0) {
          a = (ASN1_OBJECT *)0x0;
        }
        else {
          a = (ASN1_OBJECT *)0x0;
          if (*(int *)&pAVar9->sn == 4) {
            a = (ASN1_OBJECT *)pAVar9->ln;
          }
        }
      }
    }
    iVar1 = OBJ_obj2nid(((p7->d).digest)->contents->type);
    if ((iVar1 == 0x15) && (p7->detached != 0)) {
      ASN1_OCTET_STRING_free((ASN1_STRING *)a);
      a = (ASN1_OBJECT *)0x0;
      ((p7->d).enveloped)->enc_data[1].content_type = (ASN1_OBJECT *)0x0;
    }
    iVar1 = OBJ_obj2nid(((p7->d).digest)->md->algorithm);
    lVar7 = FUN_00ac08ec(&local_b0,bio,iVar1);
    if (((lVar7 != 0) &&
        (iVar1 = EVP_DigestFinal_ex(local_b0,(uchar *)&local_a0,&local_a4), iVar1 != 0)) &&
       (iVar1 = ASN1_OCTET_STRING_set((ASN1_STRING *)((p7->d).sign)->crl,&local_a0,local_a4),
       iVar1 != 0)) break;
    goto LAB_00ac08bc;
  default:
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x32b,"PKCS7_dataFinal");
    uVar3 = 0x70;
LAB_00ac08b4:
    ERR_set_error(0x21,uVar3,0);
    goto LAB_00ac08bc;
  }
  iVar1 = OBJ_obj2nid(p7->type);
  if ((iVar1 != 0x16) || (lVar7 = PKCS7_ctrl(p7,2,0,(char *)0x0), lVar7 == 0)) {
    if (a == (ASN1_OBJECT *)0x0) {
LAB_00ac08bc:
      iVar1 = 0;
      goto LAB_00ac08c0;
    }
    if (((byte)a->nid >> 4 & 1) == 0) {
      bp = BIO_find_type(bio,0x401);
      if (bp == (BIO *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x377,"PKCS7_dataFinal");
        ERR_set_error(0x21,0x6b,0);
        iVar1 = 0;
      }
      else {
        lVar7 = BIO_ctrl(bp,3,0,&local_a0);
        BIO_set_flags(bp,0x200);
        BIO_ctrl(bp,0x82,0,(void *)0x0);
        ASN1_STRING_set0((ASN1_STRING *)a,(void *)CONCAT44(uStack_9c,local_a0),(int)lVar7);
        iVar1 = 1;
      }
      goto LAB_00ac08c0;
    }
  }
  iVar1 = 1;
LAB_00ac08c0:
  EVP_MD_CTX_free(out);
  return iVar1;
}


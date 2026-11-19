/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abeef8
 */

BIO * PKCS7_dataInit(PKCS7 *p7,BIO *bio)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  BIO_METHOD *pBVar8;
  ASN1_OBJECT *pAVar9;
  long lVar10;
  long lVar11;
  EVP_PKEY_CTX *ctx;
  uchar *out;
  ASN1_TYPE *type;
  pkcs7_st *ppVar12;
  PKCS7_SIGNED *pPVar13;
  ASN1_OBJECT *pAVar14;
  ASN1_INTEGER *pAVar15;
  char **ppcVar16;
  BIO *pBVar17;
  EVP_CIPHER *pEVar18;
  EVP_CIPHER *cipher;
  stack_st_PKCS7_RECIP_INFO *psVar19;
  stack_st_PKCS7_RECIP_INFO *psVar20;
  PKCS7_ENC_CONTENT *pPVar21;
  EVP_CIPHER_CTX *local_c8;
  uchar auStack_c0 [16];
  uchar auStack_b0 [64];
  BIO *local_70;
  int local_68 [2];
  
  local_70 = (BIO *)0x0;
  if (p7 == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0xe1,"PKCS7_dataInit");
    uVar4 = 0x8f;
LAB_00abf010:
    ERR_set_error(0x21,uVar4,0);
    return (BIO *)0x0;
  }
  uVar4 = ossl_pkcs7_get0_ctx();
  uVar5 = ossl_pkcs7_ctx_get0_libctx();
  uVar6 = ossl_pkcs7_ctx_get0_propq(uVar4);
  if ((p7->d).ptr == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0xf3,"PKCS7_dataInit");
    uVar4 = 0x7a;
    goto LAB_00abf010;
  }
  iVar1 = OBJ_obj2nid(p7->type);
  p7->state = 0;
  cipher = (EVP_CIPHER *)0x0;
  psVar19 = (stack_st_PKCS7_RECIP_INFO *)0x0;
  pAVar15 = (ASN1_INTEGER *)0x0;
  ppcVar16 = (char **)0x0;
  pAVar14 = (ASN1_OBJECT *)0x0;
  psVar20 = (stack_st_PKCS7_RECIP_INFO *)0x0;
  switch(iVar1) {
  case 0x15:
    break;
  case 0x16:
    pPVar21 = (p7->d).enveloped[1].enc_data;
    psVar19 = ((p7->d).enveloped)->recipientinfo;
    iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar21->cipher);
    if (iVar1 == 0x15) {
      pAVar14 = pPVar21[1].content_type;
    }
    else {
      iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar21->cipher);
      if (((iVar1 - 0x15U < 6) || (pAVar14 = pPVar21[1].content_type, pAVar14 == (ASN1_OBJECT *)0x0)
          ) || (*(int *)&pAVar14->sn != 4)) {
        cipher = (EVP_CIPHER *)0x0;
        pAVar15 = (ASN1_INTEGER *)0x0;
        ppcVar16 = (char **)0x0;
        pAVar14 = (ASN1_OBJECT *)0x0;
        psVar20 = (stack_st_PKCS7_RECIP_INFO *)0x0;
        break;
      }
      pAVar14 = (ASN1_OBJECT *)pAVar14->ln;
    }
    cipher = (EVP_CIPHER *)0x0;
    pAVar15 = (ASN1_INTEGER *)0x0;
    ppcVar16 = (char **)0x0;
    psVar20 = (stack_st_PKCS7_RECIP_INFO *)0x0;
    break;
  case 0x17:
    ppVar12 = (pkcs7_st *)((p7->d).sign)->cert;
    cipher = (EVP_CIPHER *)ppVar12->type;
    if (cipher == (EVP_CIPHER *)0x0) {
      ERR_new();
      uVar4 = 0x10e;
LAB_00abf460:
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar4,"PKCS7_dataInit");
      uVar4 = 0x74;
      goto LAB_00abf46c;
    }
    pAVar15 = (ASN1_INTEGER *)((p7->d).sign)->md_algs;
    psVar19 = (stack_st_PKCS7_RECIP_INFO *)0x0;
    goto LAB_00abf078;
  case 0x18:
    pPVar13 = (p7->d).sign;
    ppVar12 = pPVar13->contents;
    cipher = (EVP_CIPHER *)ppVar12->type;
    if (cipher == (EVP_CIPHER *)0x0) {
      ERR_new();
      uVar4 = 0x105;
      goto LAB_00abf460;
    }
    pAVar15 = pPVar13[1].version;
    psVar19 = (stack_st_PKCS7_RECIP_INFO *)pPVar13->md_algs;
LAB_00abf078:
    pAVar14 = (ASN1_OBJECT *)0x0;
    ppcVar16 = (char **)ppVar12->length;
    psVar20 = (stack_st_PKCS7_RECIP_INFO *)0x0;
    break;
  case 0x19:
    psVar20 = ((p7->d).enveloped)->recipientinfo;
    pPVar21 = ((p7->d).enveloped)->enc_data;
    iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar21->cipher);
    if (iVar1 == 0x15) {
      pAVar14 = pPVar21[1].content_type;
    }
    else {
      iVar1 = OBJ_obj2nid((ASN1_OBJECT *)pPVar21->cipher);
      if (((iVar1 - 0x15U < 6) || (pAVar14 = pPVar21[1].content_type, pAVar14 == (ASN1_OBJECT *)0x0)
          ) || (*(int *)&pAVar14->sn != 4)) {
        cipher = (EVP_CIPHER *)0x0;
        psVar19 = (stack_st_PKCS7_RECIP_INFO *)0x0;
        pAVar15 = (ASN1_INTEGER *)0x0;
        ppcVar16 = (char **)0x0;
        pAVar14 = (ASN1_OBJECT *)0x0;
        break;
      }
      pAVar14 = (ASN1_OBJECT *)pAVar14->ln;
    }
    cipher = (EVP_CIPHER *)0x0;
    psVar19 = (stack_st_PKCS7_RECIP_INFO *)0x0;
    pAVar15 = (ASN1_INTEGER *)0x0;
    ppcVar16 = (char **)0x0;
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x119,"PKCS7_dataInit");
    uVar4 = 0x70;
LAB_00abf46c:
    ERR_set_error(0x21,uVar4,0);
    goto LAB_00abf474;
  }
  iVar1 = OPENSSL_sk_num(psVar19);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      uVar7 = OPENSSL_sk_value(psVar19,iVar1);
      iVar2 = FUN_00abf620(&local_70,uVar7,uVar4);
      if (iVar2 == 0) goto LAB_00abf474;
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(psVar19);
    } while (iVar1 < iVar2);
  }
  if ((psVar20 == (stack_st_PKCS7_RECIP_INFO *)0x0) ||
     (iVar1 = FUN_00abf620(&local_70,psVar20,uVar4), iVar1 != 0)) {
    pBVar17 = local_70;
    if (cipher != (EVP_CIPHER *)0x0) {
      pBVar8 = BIO_f_cipher();
      pBVar17 = BIO_new(pBVar8);
      if (pBVar17 == (BIO *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",299,"PKCS7_dataInit");
        ERR_set_error(0x21,0x80020,0);
        pEVar18 = (EVP_CIPHER *)0x0;
        goto LAB_00abf47c;
      }
      BIO_ctrl(pBVar17,0x81,0,&local_c8);
      iVar1 = EVP_CIPHER_get_key_length(cipher);
      iVar2 = EVP_CIPHER_get_iv_length(cipher);
      iVar3 = EVP_CIPHER_get_type(cipher);
      pAVar9 = OBJ_nid2obj(iVar3);
      *ppcVar16 = (char *)pAVar9;
      if ((iVar2 < 1) || (iVar3 = RAND_bytes_ex(uVar5,auStack_c0,(long)iVar2,0), 0 < iVar3)) {
        ERR_set_mark();
        uVar4 = EVP_CIPHER_get0_name(cipher);
        pEVar18 = (EVP_CIPHER *)EVP_CIPHER_fetch(uVar5,uVar4,uVar6);
        ERR_pop_to_mark();
        if (pEVar18 != (EVP_CIPHER *)0x0) {
          cipher = pEVar18;
        }
        iVar3 = EVP_CipherInit_ex(local_c8,cipher,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,1);
        if (iVar3 < 1) goto LAB_00abf47c;
        EVP_CIPHER_free(pEVar18);
        iVar3 = EVP_CIPHER_CTX_rand_key(local_c8,auStack_b0);
        if ((0 < iVar3) &&
           (iVar3 = EVP_CipherInit_ex(local_c8,(EVP_CIPHER *)0x0,(ENGINE *)0x0,auStack_b0,auStack_c0
                                      ,1), 0 < iVar3)) {
          if (0 < iVar2) {
            type = (ASN1_TYPE *)ppcVar16[1];
            if (type == (ASN1_TYPE *)0x0) {
              type = ASN1_TYPE_new();
              ppcVar16[1] = (char *)type;
              if (type == (ASN1_TYPE *)0x0) goto LAB_00abf618;
            }
            iVar2 = EVP_CIPHER_param_to_asn1(local_c8,type);
            if (iVar2 < 1) goto LAB_00abf618;
          }
          iVar2 = OPENSSL_sk_num(pAVar15);
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              lVar10 = OPENSSL_sk_value(pAVar15,iVar2);
              uVar4 = *(undefined8 *)(lVar10 + 0x28);
              lVar11 = X509_get0_pubkey(*(undefined8 *)(lVar10 + 0x20));
              if (lVar11 == 0) goto LAB_00abf618;
              uVar5 = ossl_pkcs7_ctx_get0_libctx(uVar4);
              uVar4 = ossl_pkcs7_ctx_get0_propq(uVar4);
              ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(uVar5,lVar11,uVar4);
              if (ctx == (EVP_PKEY_CTX *)0x0) goto LAB_00abf618;
              iVar3 = EVP_PKEY_encrypt_init(ctx);
              if ((iVar3 < 1) ||
                 (iVar3 = EVP_PKEY_encrypt(ctx,(uchar *)0x0,(size_t *)local_68,auStack_b0,
                                           (long)iVar1), iVar3 < 1)) {
                EVP_PKEY_CTX_free(ctx);
                out = (uchar *)0x0;
LAB_00abf614:
                CRYPTO_free(out);
                goto LAB_00abf618;
              }
              out = CRYPTO_malloc(local_68[0],"crypto/pkcs7/pk7_doit.c",0x85);
              if (out == (uchar *)0x0) {
                ERR_new();
                ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x88,"pkcs7_encode_rinfo");
                ERR_set_error(0x21,0xc0100,0);
                EVP_PKEY_CTX_free(ctx);
                out = (uchar *)0x0;
                goto LAB_00abf614;
              }
              iVar3 = EVP_PKEY_encrypt(ctx,out,(size_t *)local_68,auStack_b0,(long)iVar1);
              if (iVar3 < 1) {
                EVP_PKEY_CTX_free(ctx);
                goto LAB_00abf614;
              }
              ASN1_STRING_set0(*(ASN1_STRING **)(lVar10 + 0x18),out,local_68[0]);
              EVP_PKEY_CTX_free(ctx);
              CRYPTO_free((void *)0x0);
              iVar2 = iVar2 + 1;
              iVar3 = OPENSSL_sk_num(pAVar15);
            } while (iVar2 < iVar3);
          }
          OPENSSL_cleanse(auStack_b0,(long)iVar1);
          if (local_70 != (BIO *)0x0) {
            BIO_push(local_70,pBVar17);
            pBVar17 = local_70;
          }
          goto joined_r0x00abf504;
        }
      }
LAB_00abf618:
      pEVar18 = (EVP_CIPHER *)0x0;
      goto LAB_00abf47c;
    }
joined_r0x00abf504:
    local_70 = pBVar17;
    pBVar17 = local_70;
    if (bio != (BIO *)0x0) goto joined_r0x00abf5a4;
    iVar1 = OBJ_obj2nid(p7->type);
    if ((iVar1 == 0x16) && (lVar10 = PKCS7_ctrl(p7,2,0,(char *)0x0), lVar10 != 0)) {
      pBVar8 = BIO_s_null();
      bio = BIO_new(pBVar8);
    }
    else {
      if ((pAVar14 == (ASN1_OBJECT *)0x0) || (*(int *)&pAVar14->sn < 1)) {
        pBVar8 = BIO_s_mem();
        bio = BIO_new(pBVar8);
        if (bio != (BIO *)0x0) {
          BIO_ctrl(bio,0x82,0,(void *)0x0);
          pBVar17 = local_70;
          goto joined_r0x00abf5a4;
        }
        goto LAB_00abf474;
      }
      bio = BIO_new_mem_buf(pAVar14->ln,*(int *)&pAVar14->sn);
    }
    pBVar17 = local_70;
    if (bio != (BIO *)0x0) {
joined_r0x00abf5a4:
      if (pBVar17 == (BIO *)0x0) {
        return bio;
      }
      local_70 = pBVar17;
      BIO_push(pBVar17,bio);
      return pBVar17;
    }
  }
LAB_00abf474:
  pEVar18 = (EVP_CIPHER *)0x0;
  pBVar17 = (BIO *)0x0;
LAB_00abf47c:
  EVP_CIPHER_free(pEVar18);
  BIO_free_all(local_70);
  BIO_free_all(pBVar17);
  return (BIO *)0x0;
}


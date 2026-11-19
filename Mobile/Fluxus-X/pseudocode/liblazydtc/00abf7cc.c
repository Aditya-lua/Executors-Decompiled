/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abf7cc
 */

BIO * PKCS7_dataDecode(PKCS7 *p7,EVP_PKEY *pkey,BIO *in_bio,X509 *pcert)

{
  ASN1_OBJECT *pAVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ASN1_OBJECT *pAVar9;
  undefined8 *puVar10;
  BIO_METHOD *pBVar11;
  BIO *bp;
  EVP_MD *pEVar12;
  EVP_MD *parg;
  long lVar13;
  BIO *bp_00;
  X509_NAME *b;
  ASN1_INTEGER *x;
  PKCS7_ENVELOPE *pPVar14;
  uchar *key;
  uchar *puVar15;
  X509_ALGOR *pXVar16;
  PKCS7_ENC_CONTENT *pPVar17;
  X509_NAME *a;
  uchar *key_00;
  BIO *b_00;
  ASN1_OBJECT *pAVar18;
  EVP_CIPHER *pEVar19;
  stack_st_PKCS7_RECIP_INFO *psVar20;
  ASN1_INTEGER *local_b8;
  EVP_CIPHER *local_b0;
  char acStack_a8 [52];
  int local_74;
  uchar *local_70;
  EVP_CIPHER_CTX *local_68;
  
  local_70 = (uchar *)0x0;
  local_68 = (EVP_CIPHER_CTX *)0x0;
  local_74 = 0;
  if (p7 == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x1a2,"PKCS7_dataDecode");
    uVar6 = 0x8f;
LAB_00abf8bc:
    ERR_set_error(0x21,uVar6,0);
    return (BIO *)0x0;
  }
  uVar6 = ossl_pkcs7_get0_ctx();
  uVar7 = ossl_pkcs7_ctx_get0_libctx();
  uVar8 = ossl_pkcs7_ctx_get0_propq(uVar6);
  if ((p7->d).ptr == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x1ab,"PKCS7_dataDecode");
    uVar6 = 0x7a;
    goto LAB_00abf8bc;
  }
  iVar2 = OBJ_obj2nid(p7->type);
  p7->state = 0;
  if (iVar2 == 0x18) {
    pPVar14 = (p7->d).enveloped;
    local_b8 = pPVar14[2].version;
    pXVar16 = (pPVar14[1].enc_data)->algorithm;
    pAVar18 = (ASN1_OBJECT *)(pPVar14[1].enc_data)->enc_data;
    psVar20 = pPVar14->recipientinfo;
    OBJ_obj2txt(acStack_a8,0x32,pXVar16->algorithm,0);
    ERR_set_mark();
    pEVar19 = (EVP_CIPHER *)EVP_CIPHER_fetch(uVar7,acStack_a8,uVar8);
    local_b0 = pEVar19;
    if ((pEVar19 != (EVP_CIPHER *)0x0) ||
       (local_b0 = EVP_get_cipherbyname(acStack_a8), local_b0 != (EVP_CIPHER *)0x0)) {
      uVar3 = ERR_pop_to_mark();
      pAVar9 = (ASN1_OBJECT *)(ulong)uVar3;
      goto joined_r0x00abf9c4;
    }
    ERR_clear_last_mark();
    ERR_new();
    uVar6 = 0x1d3;
LAB_00abfa68:
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar6,"PKCS7_dataDecode");
    uVar6 = 0x6f;
LAB_00abfad0:
    ERR_set_error(0x21,uVar6,0);
    pEVar19 = (EVP_CIPHER *)0x0;
  }
  else {
    if (iVar2 == 0x17) {
      local_b8 = (ASN1_INTEGER *)((p7->d).enveloped)->recipientinfo;
      pPVar17 = ((p7->d).enveloped)->enc_data;
      pXVar16 = pPVar17->algorithm;
      pAVar18 = (ASN1_OBJECT *)pPVar17->enc_data;
      OBJ_obj2txt(acStack_a8,0x32,pXVar16->algorithm,0);
      ERR_set_mark();
      pEVar19 = (EVP_CIPHER *)EVP_CIPHER_fetch(uVar7,acStack_a8,uVar8);
      local_b0 = pEVar19;
      if ((pEVar19 == (EVP_CIPHER *)0x0) &&
         (local_b0 = EVP_get_cipherbyname(acStack_a8), local_b0 == (EVP_CIPHER *)0x0)) {
        ERR_clear_last_mark();
        ERR_new();
        uVar6 = 0x1e8;
        goto LAB_00abfa68;
      }
      uVar3 = ERR_pop_to_mark();
      pAVar9 = (ASN1_OBJECT *)(ulong)uVar3;
      psVar20 = (stack_st_PKCS7_RECIP_INFO *)0x0;
    }
    else {
      if (iVar2 != 0x16) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x1ee,"PKCS7_dataDecode");
        uVar6 = 0x70;
        goto LAB_00abfad0;
      }
      pPVar17 = (p7->d).enveloped[1].enc_data;
      iVar2 = OBJ_obj2nid((ASN1_OBJECT *)pPVar17->cipher);
      if (iVar2 == 0x15) {
        pAVar18 = pPVar17[1].content_type;
      }
      else {
        iVar2 = OBJ_obj2nid((ASN1_OBJECT *)pPVar17->cipher);
        pAVar18 = (ASN1_OBJECT *)0x0;
        if (5 < iVar2 - 0x15U) {
          pAVar9 = pPVar17[1].content_type;
          if (pAVar9 == (ASN1_OBJECT *)0x0) {
            pAVar18 = (ASN1_OBJECT *)0x0;
          }
          else {
            pAVar18 = (ASN1_OBJECT *)0x0;
            if (*(int *)&pAVar9->sn == 4) {
              pAVar18 = (ASN1_OBJECT *)pAVar9->ln;
            }
          }
        }
      }
      uVar3 = OBJ_obj2nid(p7->type);
      pAVar9 = (ASN1_OBJECT *)(ulong)uVar3;
      pAVar1 = pAVar18;
      if (uVar3 == 0x16) {
        pAVar9 = (ASN1_OBJECT *)PKCS7_ctrl(p7,2,0,(char *)0x0);
        pAVar1 = pAVar9;
        if (pAVar18 == (ASN1_OBJECT *)0x0) goto joined_r0x00abfb74;
      }
      else {
joined_r0x00abfb74:
        if (pAVar1 == (ASN1_OBJECT *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x1bc,"PKCS7_dataDecode");
          uVar6 = 0x9b;
          goto LAB_00abfad0;
        }
      }
      local_b8 = (ASN1_INTEGER *)0x0;
      pEVar19 = (EVP_CIPHER *)0x0;
      local_b0 = (EVP_CIPHER *)0x0;
      psVar20 = (stack_st_PKCS7_RECIP_INFO *)((p7->d).data)->data;
      pXVar16 = (X509_ALGOR *)0x0;
    }
joined_r0x00abf9c4:
    if ((in_bio != (BIO *)0x0) || (pAVar18 != (ASN1_OBJECT *)0x0)) {
      if (psVar20 == (stack_st_PKCS7_RECIP_INFO *)0x0) {
        bp = (BIO *)0x0;
LAB_00abfc80:
        b_00 = bp;
        if (local_b0 != (EVP_CIPHER *)0x0) goto LAB_00abfc88;
LAB_00abfd48:
        iVar2 = 0;
joined_r0x00abfd54:
        b_00 = bp;
        if (in_bio != (BIO *)0x0) {
LAB_00abfd58:
          BIO_push(b_00,in_bio);
          EVP_CIPHER_free(pEVar19);
          return b_00;
        }
        if (*(int *)&pAVar18->sn < 1) {
          pBVar11 = BIO_s_mem();
          in_bio = BIO_new(pBVar11);
          if (in_bio != (BIO *)0x0) {
            BIO_ctrl(in_bio,0x82,0,(void *)0x0);
            goto LAB_00abfd58;
          }
        }
        else {
          in_bio = BIO_new_mem_buf(pAVar18->ln,*(int *)&pAVar18->sn);
          if (in_bio != (BIO *)0x0) goto LAB_00abfd58;
        }
        key = (uchar *)0x0;
        bp_00 = (BIO *)0x0;
        bp = (BIO *)0x0;
        goto LAB_00abfaf0;
      }
      iVar2 = OPENSSL_sk_num(psVar20);
      if (0 < iVar2) {
        iVar2 = 0;
        b_00 = (BIO *)0x0;
        do {
          puVar10 = (undefined8 *)OPENSSL_sk_value(psVar20,iVar2);
          pBVar11 = BIO_f_md();
          bp = BIO_new(pBVar11);
          if (bp == (BIO *)0x0) {
            ERR_new();
            uVar6 = 0x1fd;
LAB_00abfde4:
            ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar6,"PKCS7_dataDecode");
            ERR_set_error(0x21,0x80020,0);
LAB_00abfe08:
            bp_00 = (BIO *)0x0;
            key = (uchar *)0x0;
            iVar2 = 0;
            goto LAB_00abfaf0;
          }
          OBJ_obj2txt(acStack_a8,0x32,(ASN1_OBJECT *)*puVar10,0);
          ERR_set_mark();
          pEVar12 = (EVP_MD *)EVP_MD_fetch(uVar7,acStack_a8,uVar8);
          parg = pEVar12;
          if ((pEVar12 == (EVP_MD *)0x0) &&
             (parg = EVP_get_digestbyname(acStack_a8), parg == (EVP_MD *)0x0)) {
            ERR_clear_last_mark();
            ERR_new();
            ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x20c,"PKCS7_dataDecode");
            ERR_set_error(0x21,0x6d,0);
            goto LAB_00abfe08;
          }
          ERR_pop_to_mark();
          lVar13 = BIO_ctrl(bp,0x6f,0,parg);
          EVP_MD_free(pEVar12);
          if (lVar13 < 1) {
            ERR_new();
            uVar6 = 0x213;
            goto LAB_00abfde4;
          }
          if (b_00 != (BIO *)0x0) {
            BIO_push(b_00,bp);
            bp = b_00;
          }
          iVar2 = iVar2 + 1;
          iVar4 = OPENSSL_sk_num(psVar20);
          b_00 = bp;
        } while (iVar2 < iVar4);
        goto LAB_00abfc80;
      }
      bp = (BIO *)0x0;
      b_00 = bp;
      if (local_b0 == (EVP_CIPHER *)0x0) goto LAB_00abfd48;
LAB_00abfc88:
      pBVar11 = BIO_f_cipher();
      bp_00 = BIO_new(pBVar11);
      if (bp_00 == (BIO *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x221,"PKCS7_dataDecode");
        uVar6 = 0x80020;
LAB_00abfd98:
        ERR_set_error(0x21,uVar6,0);
      }
      else {
        if (pcert != (X509 *)0x0) {
          iVar2 = OPENSSL_sk_num(local_b8);
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              lVar13 = OPENSSL_sk_value(local_b8,iVar2);
              a = (X509_NAME *)**(undefined8 **)(lVar13 + 8);
              b = X509_get_issuer_name(pcert);
              iVar4 = X509_NAME_cmp(a,b);
              if (iVar4 == 0) {
                x = (ASN1_INTEGER *)X509_get0_serialNumber(pcert);
                iVar4 = ASN1_INTEGER_cmp(x,*(ASN1_INTEGER **)(*(long *)(lVar13 + 8) + 8));
                if (iVar4 == 0) {
                  if (pcert == (X509 *)0x0) goto LAB_00abfe7c;
                  *(undefined8 *)(lVar13 + 0x28) = uVar6;
                  iVar2 = FUN_00ac00d0(&local_70,&local_74,lVar13,pkey,0);
                  if (iVar2 < 0) goto LAB_00abfda0;
                  ERR_clear_error();
                  goto LAB_00abfee0;
                }
              }
              iVar2 = iVar2 + 1;
              iVar4 = OPENSSL_sk_num(local_b8);
            } while (iVar2 < iVar4);
          }
          ERR_new();
          ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x238,"PKCS7_dataDecode");
          uVar6 = 0x73;
          goto LAB_00abfd98;
        }
LAB_00abfe7c:
        iVar2 = OPENSSL_sk_num(local_b8);
        if (0 < iVar2) {
          iVar2 = 0;
          do {
            lVar13 = OPENSSL_sk_value(local_b8,iVar2);
            *(undefined8 *)(lVar13 + 0x28) = uVar6;
            iVar4 = EVP_CIPHER_get_key_length(local_b0);
            iVar4 = FUN_00ac00d0(&local_70,&local_74,lVar13,pkey,(long)iVar4);
            if (iVar4 < 0) goto LAB_00abfda0;
            ERR_clear_error();
            iVar2 = iVar2 + 1;
            iVar4 = OPENSSL_sk_num(local_b8);
          } while (iVar2 < iVar4);
        }
LAB_00abfee0:
        local_68 = (EVP_CIPHER_CTX *)0x0;
        BIO_ctrl(bp_00,0x81,0,&local_68);
        iVar2 = EVP_CipherInit_ex(local_68,local_b0,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,0);
        if (((0 < iVar2) &&
            (iVar2 = EVP_CIPHER_asn1_to_param(local_68,pXVar16->parameter), 0 < iVar2)) &&
           (iVar2 = EVP_CIPHER_CTX_get_key_length(local_68), 0 < iVar2)) {
          key = CRYPTO_malloc(iVar2,"crypto/pkcs7/pk7_doit.c",0x25e);
          if ((key != (uchar *)0x0) && (iVar4 = EVP_CIPHER_CTX_rand_key(local_68,key), 0 < iVar4)) {
            if (local_70 == (uchar *)0x0) {
              puVar15 = (uchar *)0x0;
              local_74 = iVar2;
              local_70 = key;
            }
            else {
              puVar15 = key;
            }
            key_00 = local_70;
            iVar4 = local_74;
            iVar5 = EVP_CIPHER_CTX_get_key_length(local_68);
            key = puVar15;
            if (iVar4 != iVar5) {
              iVar5 = EVP_CIPHER_CTX_set_key_length(local_68,iVar4);
              if (iVar5 < 1) {
                CRYPTO_clear_free(key_00,(long)iVar4,"crypto/pkcs7/pk7_doit.c",0x271);
                key = (uchar *)0x0;
                key_00 = puVar15;
                iVar4 = iVar2;
                local_74 = iVar2;
                local_70 = puVar15;
              }
            }
            ERR_clear_error();
            iVar5 = EVP_CipherInit_ex(local_68,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key_00,(uchar *)0x0,0
                                     );
            if (0 < iVar5) {
              CRYPTO_clear_free(key_00,(long)iVar4,"crypto/pkcs7/pk7_doit.c",0x27c);
              local_70 = (uchar *)0x0;
              CRYPTO_clear_free(key,(long)iVar2,"crypto/pkcs7/pk7_doit.c",0x27e);
              bp = bp_00;
              if (b_00 != (BIO *)0x0) {
                BIO_push(b_00,bp_00);
                bp = b_00;
              }
              goto joined_r0x00abfd54;
            }
          }
          bp = (BIO *)0x0;
          goto LAB_00abfaf0;
        }
      }
LAB_00abfda0:
      bp = (BIO *)0x0;
      key = (uchar *)0x0;
      iVar2 = 0;
      goto LAB_00abfaf0;
    }
    ERR_new(pAVar9);
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",500,"PKCS7_dataDecode");
    ERR_set_error(0x21,0x7a,0);
  }
  bp_00 = (BIO *)0x0;
  bp = (BIO *)0x0;
  key = (uchar *)0x0;
  iVar2 = 0;
  b_00 = (BIO *)0x0;
LAB_00abfaf0:
  EVP_CIPHER_free(pEVar19);
  CRYPTO_clear_free(local_70,(long)local_74,"crypto/pkcs7/pk7_doit.c",0x29c);
  CRYPTO_clear_free(key,(long)iVar2,"crypto/pkcs7/pk7_doit.c",0x29d);
  BIO_free_all(b_00);
  BIO_free_all(bp);
  BIO_free_all(bp_00);
  BIO_free_all((BIO *)0x0);
  return (BIO *)0x0;
}


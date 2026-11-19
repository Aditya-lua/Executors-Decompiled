/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7f64
 */

/* WARNING: Type propagation algorithm not settling */

EVP_PKEY *
FUN_00ab7f64(BIO *param_1,long *param_2,code *param_3,undefined8 param_4,undefined8 param_5,
            undefined8 param_6,uint param_7)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  BIO_METHOD *type;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  EVP_PKEY_ASN1_METHOD *pEVar9;
  EVP_PKEY *pkey;
  X509_SIG *a;
  PKCS8_PRIV_KEY_INFO *pPVar10;
  code *pcVar11;
  BIO *b;
  undefined8 local_4b8;
  undefined8 uStack_4b0;
  undefined8 local_4a8;
  undefined8 uStack_4a0;
  undefined8 local_498;
  undefined8 uStack_490;
  EVP_PKEY *local_488 [128];
  undefined8 local_88;
  uchar *local_80;
  uchar *local_78;
  char *local_70 [2];
  
  uStack_490 = 0;
  local_498 = 0;
  uStack_4a0 = 0;
  local_4a8 = 0;
  uStack_4b0 = 0;
  local_4b8 = 0;
  lVar5 = BIO_ctrl(param_1,0x85,0,(void *)0x0);
  iVar3 = (int)lVar5;
  if (iVar3 < 0) {
    type = (BIO_METHOD *)BIO_f_readbuffer();
    b = BIO_new(type);
    if (b == (BIO *)0x0) {
      return (EVP_PKEY *)0x0;
    }
    param_1 = BIO_push(b,param_1);
    lVar5 = BIO_ctrl(param_1,0x85,0,(void *)0x0);
    iVar3 = (int)lVar5;
  }
  else {
    b = (BIO *)0x0;
  }
  pcVar11 = PEM_def_callback;
  if (param_3 != (code *)0x0) {
    pcVar11 = param_3;
  }
  iVar2 = ossl_pw_set_pem_password_cb(&local_4b8,pcVar11,param_4);
  if ((iVar2 == 0) || (iVar2 = ossl_pw_enable_passphrase_caching(&local_4b8), iVar2 == 0)) {
    pkey = (EVP_PKEY *)0x0;
    goto LAB_00ab84d4;
  }
  ERR_set_mark();
  local_488[0] = (EVP_PKEY *)0x0;
  uVar6 = BIO_ctrl(param_1,0x85,0,(void *)0x0);
  if (((int)uVar6 < 0) ||
     (lVar5 = OSSL_DECODER_CTX_new_for_pkey(local_488,&DAT_002b956f,0,0,param_7,param_5,param_6),
     lVar5 == 0)) {
LAB_00ab81dc:
    uVar6 = BIO_ctrl(param_1,0x80,(long)iVar3,(void *)0x0);
    if (-1 < (int)uVar6) {
      local_78 = (uchar *)0x0;
      local_70[0] = (char *)0x0;
      local_80 = (uchar *)0x0;
      ERR_set_mark();
      if ((param_7 & 1) == 0) {
        pcVar1 = "PARAMETERS";
        if ((param_7 & 2) != 0) {
          pcVar1 = "PUBLIC KEY";
        }
        iVar3 = PEM_bytes_read_bio(&local_80,&local_88,local_70,pcVar1,param_1,ossl_pw_pem_password,
                                   &local_4b8);
      }
      else {
        iVar3 = PEM_bytes_read_bio_secmem
                          (&local_80,&local_88,local_70,"ANY PRIVATE KEY",param_1,
                           ossl_pw_pem_password,&local_4b8);
      }
      if (iVar3 == 0) {
        uVar4 = ERR_pop_to_mark();
        uVar6 = (ulong)uVar4;
      }
      else {
        ERR_clear_last_mark();
        pcVar1 = local_70[0];
        local_78 = local_80;
        iVar3 = strcmp(local_70[0],"PRIVATE KEY");
        if (iVar3 == 0) {
          pPVar10 = d2i_PKCS8_PRIV_KEY_INFO
                              ((PKCS8_PRIV_KEY_INFO **)0x0,&local_78,
                               CONCAT44(local_88._4_4_,(undefined4)local_88));
          if (pPVar10 == (PKCS8_PRIV_KEY_INFO *)0x0) goto LAB_00ab842c;
          pkey = (EVP_PKEY *)evp_pkcs82pkey_legacy(pPVar10,param_5,param_6);
          if (param_2 != (long *)0x0) {
            EVP_PKEY_free((EVP_PKEY *)*param_2);
            *param_2 = (long)pkey;
          }
          PKCS8_PRIV_KEY_INFO_free(pPVar10);
          if (pkey == (EVP_PKEY *)0x0) goto LAB_00ab842c;
        }
        else {
          iVar3 = strcmp(pcVar1,"ENCRYPTED PRIVATE KEY");
          if (iVar3 == 0) {
            a = d2i_X509_SIG((X509_SIG **)0x0,&local_78,
                             CONCAT44(local_88._4_4_,(undefined4)local_88));
            if (a == (X509_SIG *)0x0) goto LAB_00ab842c;
            iVar3 = ossl_pw_pem_password(local_488,0x400,0,&local_4b8);
            if (-1 < iVar3) {
              pPVar10 = PKCS8_decrypt(a,(char *)local_488,iVar3);
              X509_SIG_free(a);
              OPENSSL_cleanse(local_488,(long)iVar3);
              if (pPVar10 != (PKCS8_PRIV_KEY_INFO *)0x0) {
                pkey = (EVP_PKEY *)evp_pkcs82pkey_legacy(pPVar10,param_5,param_6);
                if (param_2 != (long *)0x0) {
                  EVP_PKEY_free((EVP_PKEY *)*param_2);
                  *param_2 = (long)pkey;
                }
                PKCS8_PRIV_KEY_INFO_free(pPVar10);
                goto joined_r0x00ab840c;
              }
              goto LAB_00ab842c;
            }
            ERR_new();
            ERR_set_debug("crypto/pem/pem_pkey.c",0x9f,"pem_read_bio_key_legacy");
            ERR_set_error(9,0x68,0);
            X509_SIG_free(a);
          }
          else {
            iVar3 = ossl_pem_check_suffix(pcVar1,"PRIVATE KEY");
            if (iVar3 < 1) {
              if ((param_7 & 3) == 2) {
                pkey = (EVP_PKEY *)
                       ossl_d2i_PUBKEY_legacy
                                 (param_2,&local_78,CONCAT44(local_88._4_4_,(undefined4)local_88));
                goto joined_r0x00ab840c;
              }
              if (((param_7 & 0x87) == 0) &&
                 (iVar3 = ossl_pem_check_suffix(local_70[0],"PARAMETERS"), 0 < iVar3)) {
                pkey = EVP_PKEY_new();
                if (pkey != (EVP_PKEY *)0x0) {
                  iVar3 = EVP_PKEY_set_type_str(pkey,local_70[0],iVar3);
                  if (((iVar3 == 0) ||
                      (pcVar11 = *(code **)(*(long *)&pkey->references + 0x70),
                      pcVar11 == (code *)0x0)) ||
                     (iVar3 = (*pcVar11)(pkey,&local_78,(undefined4)local_88), iVar3 == 0)) {
                    EVP_PKEY_free(pkey);
                    goto LAB_00ab84a0;
                  }
                  if (param_2 != (long *)0x0) {
                    EVP_PKEY_free((EVP_PKEY *)*param_2);
                    *param_2 = (long)pkey;
                  }
                }
                goto LAB_00ab84a4;
              }
            }
            else {
              pEVar9 = EVP_PKEY_asn1_find_str((ENGINE **)0x0,local_70[0],iVar3);
              if ((pEVar9 != (EVP_PKEY_ASN1_METHOD *)0x0) && (*(long *)(pEVar9 + 0xb8) != 0)) {
                pkey = (EVP_PKEY *)
                       ossl_d2i_PrivateKey_legacy
                                 (*(undefined4 *)pEVar9,param_2,&local_78,
                                  CONCAT44(local_88._4_4_,(undefined4)local_88),param_5,param_6);
joined_r0x00ab840c:
                if (pkey != (EVP_PKEY *)0x0) goto LAB_00ab84a4;
              }
            }
LAB_00ab842c:
            uVar6 = ERR_peek_last_error();
            pkey = (EVP_PKEY *)0x0;
            if (uVar6 != 0) goto LAB_00ab84a4;
            ERR_new();
            ERR_set_debug("crypto/pem/pem_pkey.c",0xcf,"pem_read_bio_key_legacy");
            ERR_set_error(9,0x8000d,0);
          }
LAB_00ab84a0:
          pkey = (EVP_PKEY *)0x0;
        }
LAB_00ab84a4:
        CRYPTO_secure_free(local_70[0],"crypto/pem/pem_pkey.c",0xd1);
        uVar6 = CRYPTO_secure_clear_free
                          (local_80,CONCAT44(local_88._4_4_,(undefined4)local_88),
                           "crypto/pem/pem_pkey.c",0xd2);
        if (pkey != (EVP_PKEY *)0x0) goto LAB_00ab84d0;
      }
    }
    ERR_clear_last_mark(uVar6);
    pkey = (EVP_PKEY *)0x0;
  }
  else {
    iVar2 = OSSL_DECODER_CTX_set_pem_password_cb(lVar5,ossl_pw_pem_password,&local_4b8);
    if (iVar2 != 0) {
      ERR_set_mark();
      iVar2 = OSSL_DECODER_from_bio(lVar5,param_1);
      if (iVar2 == 0) goto LAB_00ab8104;
      while (local_488[0] == (EVP_PKEY *)0x0) {
LAB_00ab8104:
        do {
          lVar7 = BIO_ctrl(param_1,2,0,(void *)0x0);
          if ((int)lVar7 != 0) {
LAB_00ab8188:
            ERR_clear_last_mark();
            goto LAB_00ab81cc;
          }
          uVar8 = BIO_ctrl(param_1,0x85,0,(void *)0x0);
          if ((((int)uVar8 < 0) || ((int)uVar8 <= (int)uVar6)) ||
             (uVar6 = ERR_peek_error(),
             (((int)(uint)uVar6 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar6) != 0x8010c))
          goto LAB_00ab8188;
          ERR_pop_to_mark();
          ERR_set_mark();
          iVar2 = OSSL_DECODER_from_bio(lVar5,param_1);
          uVar6 = uVar8 & 0xffffffff;
        } while (iVar2 == 0);
        uVar6 = uVar8 & 0xffffffff;
      }
      ERR_pop_to_mark();
      uVar4 = param_7;
      if ((param_7 & 1) != 0) {
        uVar4 = param_7 & 0xfffffffd;
      }
      iVar2 = evp_keymgmt_util_has(local_488[0],uVar4);
      if (iVar2 == 0) {
        EVP_PKEY_free(local_488[0]);
        local_488[0] = (EVP_PKEY *)0x0;
        ERR_new();
        ERR_set_debug("crypto/pem/pem_pkey.c",0x55,"pem_read_bio_key_decoder");
        ERR_set_error(9,0x7e,0);
      }
      else if (param_2 != (long *)0x0) {
        EVP_PKEY_free((EVP_PKEY *)*param_2);
        *param_2 = (long)local_488[0];
      }
    }
LAB_00ab81cc:
    OSSL_DECODER_CTX_free(lVar5);
    pkey = local_488[0];
    if (local_488[0] == (EVP_PKEY *)0x0) goto LAB_00ab81dc;
LAB_00ab84d0:
    ERR_pop_to_mark();
  }
LAB_00ab84d4:
  ossl_pw_clear_passphrase_data(&local_4b8);
  if (b != (BIO *)0x0) {
    BIO_pop(b);
    BIO_free(b);
  }
  return pkey;
}


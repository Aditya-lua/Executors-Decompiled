/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab3e2c
 */

long PEM_X509_INFO_read_bio_ex
               (BIO *param_1,long param_2,undefined1 *param_3,void *param_4,undefined8 param_5,
               undefined8 param_6)

{
  char *pcVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  X509_INFO *pXVar5;
  char *pcVar6;
  X509 *pXVar7;
  long lVar8;
  X509_PKEY *pXVar9;
  size_t sVar10;
  ulong uVar11;
  undefined8 uVar12;
  code *pcVar13;
  X509_INFO *pXVar14;
  EVP_CIPHER_INFO EStack_a0;
  long local_88;
  uchar *local_80;
  uchar *local_78;
  char *local_70;
  char *local_68;
  
  local_70 = (char *)0x0;
  local_68 = (char *)0x0;
  local_78 = (uchar *)0x0;
  lVar4 = param_2;
  if ((param_2 == 0) && (lVar4 = OPENSSL_sk_new_null(), lVar4 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_info.c",0x46,"PEM_X509_INFO_read_bio_ex");
    ERR_set_error(9,0xc0100,0);
    pXVar5 = (X509_INFO *)0x0;
  }
  else {
    pXVar5 = X509_INFO_new();
    if (pXVar5 != (X509_INFO *)0x0) {
      ERR_set_mark();
      iVar2 = PEM_read_bio(param_1,&local_68,&local_70,&local_78,&local_88);
      if (iVar2 != 0) {
LAB_00ab3ecc:
        ERR_clear_last_mark();
        do {
          pcVar1 = local_68;
          iVar2 = strcmp(local_68,"CERTIFICATE");
          if (((iVar2 == 0) || (iVar2 = strcmp(pcVar1,"X509 CERTIFICATE"), iVar2 == 0)) ||
             (iVar2 = strcmp(pcVar1,"TRUSTED CERTIFICATE"), iVar2 == 0)) {
            if (pXVar5->x509 == (X509 *)0x0) {
              iVar2 = strcmp(pcVar1,"TRUSTED CERTIFICATE");
              pXVar7 = (X509 *)X509_new_ex(param_5,param_6);
              pXVar5->x509 = pXVar7;
              if (pXVar7 == (X509 *)0x0) goto LAB_00ab41e4;
              iVar3 = 0;
              pcVar13 = d2i_X509_AUX;
              if (iVar2 != 0) {
                pcVar13 = d2i_X509;
              }
              pXVar14 = pXVar5;
              goto LAB_00ab3fc0;
            }
          }
          else {
            iVar2 = strcmp(pcVar1,"X509 CRL");
            if (iVar2 == 0) {
              if (pXVar5->crl == (X509_CRL *)0x0) {
                pcVar13 = d2i_X509_CRL;
                iVar3 = 0;
                pXVar14 = (X509_INFO *)&pXVar5->crl;
                goto LAB_00ab3fc0;
              }
            }
            else {
              pcVar6 = strstr(pcVar1,"PRIVATE KEY");
              if (pcVar6 == (char *)0x0) goto LAB_00ab40e4;
              if (pXVar5->x_pkey == (X509_PKEY *)0x0) goto LAB_00ab4038;
            }
          }
          iVar2 = OPENSSL_sk_push(lVar4,pXVar5);
          if ((iVar2 == 0) || (pXVar5 = X509_INFO_new(), pXVar5 == (X509_INFO *)0x0))
          goto LAB_00ab41e4;
        } while( true );
      }
LAB_00ab4148:
      uVar11 = ERR_peek_last_error();
      if ((((int)(uint)uVar11 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar11) == 0x6c) {
        ERR_pop_to_mark();
        if ((((pXVar5->x509 == (X509 *)0x0) && (pXVar5->crl == (X509_CRL *)0x0)) &&
            (pXVar5->x_pkey == (X509_PKEY *)0x0)) && (pXVar5->enc_data == (char *)0x0)) {
          X509_INFO_free(pXVar5);
          goto LAB_00ab4238;
        }
        iVar2 = OPENSSL_sk_push(lVar4,pXVar5);
        if (iVar2 != 0) {
          X509_INFO_free((X509_INFO *)0x0);
          goto LAB_00ab4238;
        }
      }
      else {
        ERR_clear_last_mark();
      }
    }
  }
LAB_00ab41e4:
  X509_INFO_free(pXVar5);
  iVar2 = OPENSSL_sk_num(lVar4);
  if (0 < iVar2) {
    iVar2 = 0;
    do {
      pXVar5 = (X509_INFO *)OPENSSL_sk_value(lVar4,iVar2);
      X509_INFO_free(pXVar5);
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(lVar4);
    } while (iVar2 < iVar3);
  }
  if (lVar4 != param_2) {
    OPENSSL_sk_free(lVar4);
  }
  lVar4 = 0;
LAB_00ab4238:
  CRYPTO_free(local_68);
  CRYPTO_free(local_70);
  CRYPTO_free(local_78);
  return lVar4;
LAB_00ab4038:
  if ((pcVar6 == pcVar1) || (iVar2 = strcmp(pcVar1,"ENCRYPTED PRIVATE KEY"), iVar2 == 0)) {
    iVar3 = 0;
  }
  else {
    pcVar6[-1] = '\0';
    iVar3 = evp_pkey_name2type(local_68);
  }
  pXVar5->enc_data = (char *)0x0;
  pXVar5->enc_len = 0;
  pXVar9 = X509_PKEY_new();
  pcVar1 = local_70;
  pXVar5->x_pkey = pXVar9;
  if (pXVar9 == (X509_PKEY *)0x0) goto LAB_00ab41e4;
  sVar10 = strlen(local_70);
  if (((int)sVar10 < 0xb) && (iVar2 = strcmp(local_68,"ENCRYPTED PRIVATE KEY"), iVar2 != 0)) {
    pcVar13 = d2i_AutoPrivateKey;
    pXVar14 = (X509_INFO *)&pXVar9->dec_pkey;
LAB_00ab3fc0:
    iVar2 = PEM_get_EVP_CIPHER_INFO(local_70,&EStack_a0);
    if ((iVar2 == 0) ||
       (iVar2 = PEM_do_header(&EStack_a0,local_78,&local_88,param_3,param_4), iVar2 == 0))
    goto LAB_00ab41e4;
    local_80 = local_78;
    if (iVar3 == 0) {
      lVar8 = (*pcVar13)(pXVar14,&local_80,local_88);
      if (lVar8 == 0) {
        ERR_new();
        uVar12 = 0xa9;
        goto LAB_00ab42d4;
      }
    }
    else {
      lVar8 = d2i_PrivateKey_ex(iVar3,pXVar14,&local_80,local_88,param_5,param_6);
      if (lVar8 == 0) {
        ERR_new();
        uVar12 = 0xa5;
LAB_00ab42d4:
        ERR_set_debug("crypto/pem/pem_info.c",uVar12,"PEM_X509_INFO_read_bio_ex");
        ERR_set_error(9,0x8000d,0);
        goto LAB_00ab41e4;
      }
    }
  }
  else {
    iVar2 = PEM_get_EVP_CIPHER_INFO(pcVar1,&pXVar5->enc_cipher);
    if (iVar2 == 0) goto LAB_00ab41e4;
    pXVar5->enc_data = (char *)local_78;
    pXVar5->enc_len = (int)local_88;
    local_78 = (uchar *)0x0;
  }
LAB_00ab40e4:
  CRYPTO_free(local_68);
  local_68 = (char *)0x0;
  CRYPTO_free(local_70);
  local_70 = (char *)0x0;
  CRYPTO_free(local_78);
  local_78 = (uchar *)0x0;
  ERR_set_mark();
  iVar2 = PEM_read_bio(param_1,&local_68,&local_70,&local_78,&local_88);
  if (iVar2 == 0) goto LAB_00ab4148;
  goto LAB_00ab3ecc;
}


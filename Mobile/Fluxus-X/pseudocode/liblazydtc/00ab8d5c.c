/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8d5c
 */

uint FUN_00ab8d5c(BIO *param_1,EVP_PKEY *param_2,int param_3,int param_4,EVP_CIPHER *param_5,
                 char *param_6,int param_7,code *param_8,char *param_9)

{
  undefined *puVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  size_t sVar5;
  PKCS8_PRIV_KEY_INFO *p8;
  X509_SIG *p8_00;
  undefined8 uVar6;
  char acStack_468 [1032];
  
  puVar1 = &DAT_002b7291;
  if (param_3 == 0) {
    puVar1 = &DAT_002b956f;
  }
  lVar4 = OSSL_ENCODER_CTX_new_for_pkey(param_2,0x87,puVar1,"PrivateKeyInfo",0);
  if (lVar4 == 0) {
    return 0;
  }
  if ((param_6 == (char *)0x0) && (param_8 == (code *)0x0)) {
    if (param_9 == (char *)0x0) {
      param_8 = PEM_def_callback;
      param_6 = (char *)0x0;
    }
    else {
      sVar5 = strlen(param_9);
      param_7 = (int)sVar5;
      param_8 = (code *)0x0;
      param_6 = param_9;
    }
  }
  if ((param_4 == -1) && (iVar3 = OSSL_ENCODER_CTX_get_num_encoders(lVar4), iVar3 != 0)) {
    if (param_5 != (EVP_CIPHER *)0x0) {
      uVar6 = EVP_CIPHER_get0_name(param_5);
      iVar3 = OSSL_ENCODER_CTX_set_cipher(lVar4,uVar6,0);
      if (((iVar3 == 0) ||
          ((param_6 != (char *)0x0 &&
           (iVar3 = OSSL_ENCODER_CTX_set_passphrase(lVar4,param_6,(long)param_7), iVar3 == 0)))) ||
         ((param_8 != (code *)0x0 &&
          (iVar3 = OSSL_ENCODER_CTX_set_pem_password_cb(lVar4,param_8,param_9), iVar3 == 0)))) {
        uVar2 = 0;
        goto LAB_00ab9024;
      }
    }
    iVar3 = OSSL_ENCODER_to_bio(lVar4,param_1);
    uVar2 = (uint)(iVar3 != 0);
    goto LAB_00ab9024;
  }
  p8 = EVP_PKEY2PKCS8(param_2);
  if (p8 == (PKCS8_PRIV_KEY_INFO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pk8.c",0x85,"do_pk8pkey");
    uVar6 = 0x73;
LAB_00ab8e5c:
    ERR_set_error(9,uVar6,0);
    uVar2 = 0;
  }
  else if ((param_4 == -1) && (param_5 == (EVP_CIPHER *)0x0)) {
    if (param_3 == 0) {
      uVar2 = PEM_ASN1_write_bio(i2d_PKCS8_PRIV_KEY_INFO,"PRIVATE KEY",param_1,p8,(EVP_CIPHER *)0x0,
                                 (uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
    }
    else {
      uVar2 = i2d_PKCS8_PRIV_KEY_INFO_bio(param_1,p8);
    }
  }
  else {
    if (param_6 == (char *)0x0) {
      param_7 = (*param_8)(acStack_468,0x400,1,param_9);
      if (param_7 < 0) {
        ERR_new();
        ERR_set_debug("crypto/pem/pem_pk8.c",0x8c,"do_pk8pkey");
        uVar6 = 0x6f;
        goto LAB_00ab8e5c;
      }
      p8_00 = PKCS8_encrypt(param_4,param_5,acStack_468,param_7,(uchar *)0x0,0,0,p8);
LAB_00ab8fc8:
      OPENSSL_cleanse(acStack_468,(long)param_7);
    }
    else {
      p8_00 = PKCS8_encrypt(param_4,param_5,param_6,param_7,(uchar *)0x0,0,0,p8);
      if (param_6 == acStack_468) goto LAB_00ab8fc8;
    }
    if (p8_00 == (X509_SIG *)0x0) {
      uVar2 = 0;
    }
    else {
      if (param_3 == 0) {
        uVar2 = PEM_ASN1_write_bio(i2d_X509_SIG,"ENCRYPTED PRIVATE KEY",param_1,p8_00,
                                   (EVP_CIPHER *)0x0,(uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
      }
      else {
        uVar2 = i2d_PKCS8_bio(param_1,p8_00);
      }
      X509_SIG_free(p8_00);
    }
  }
  PKCS8_PRIV_KEY_INFO_free(p8);
LAB_00ab9024:
  OSSL_ENCODER_CTX_free(lVar4);
  return uVar2;
}


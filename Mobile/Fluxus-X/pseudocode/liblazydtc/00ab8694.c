/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8694
 */

ulong PEM_write_bio_PrivateKey_ex
                (BIO *param_1,EVP_PKEY *param_2,EVP_CIPHER *param_3,char *param_4,int param_5,
                code *param_6,char *param_7,undefined8 param_8,undefined8 param_9)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  size_t sVar4;
  undefined8 uVar5;
  ulong uVar6;
  
  uVar3 = OSSL_ENCODER_CTX_new_for_pkey(param_2,0x87,&DAT_002b956f,"PrivateKeyInfo",param_9);
  iVar1 = OSSL_ENCODER_CTX_get_num_encoders();
  if (iVar1 == 0) {
    OSSL_ENCODER_CTX_free(uVar3);
    if ((param_2 == (EVP_PKEY *)0x0) ||
       ((*(long *)&param_2->references != 0 &&
        (*(long *)(*(long *)&param_2->references + 0x48) == 0)))) {
      uVar6 = PEM_write_bio_PrivateKey_traditional
                        (param_1,param_2,param_3,param_4,param_5,param_6,param_7);
      return uVar6;
    }
    uVar2 = PEM_write_bio_PKCS8PrivateKey(param_1,param_2,param_3,param_4,param_5,param_6,param_7);
    return (ulong)uVar2;
  }
  if ((param_4 == (char *)0x0) && (param_6 == (code *)0x0)) {
    if (param_7 == (char *)0x0) {
      param_6 = PEM_def_callback;
      param_4 = (char *)0x0;
    }
    else {
      sVar4 = strlen(param_7);
      param_5 = (int)sVar4;
      param_6 = (code *)0x0;
      param_4 = param_7;
    }
  }
  if (param_3 != (EVP_CIPHER *)0x0) {
    uVar5 = EVP_CIPHER_get0_name(param_3);
    iVar1 = OSSL_ENCODER_CTX_set_cipher(uVar3,uVar5,0);
    if (((iVar1 == 0) ||
        ((param_4 != (char *)0x0 &&
         (iVar1 = OSSL_ENCODER_CTX_set_passphrase(uVar3,param_4,(long)param_5), iVar1 == 0)))) ||
       ((param_6 != (code *)0x0 &&
        (iVar1 = OSSL_ENCODER_CTX_set_pem_password_cb(uVar3,param_6,param_7), iVar1 == 0)))) {
      OSSL_ENCODER_CTX_free(uVar3);
      return 0;
    }
  }
  uVar6 = OSSL_ENCODER_to_bio(uVar3,param_1);
  OSSL_ENCODER_CTX_free(uVar3);
  return uVar6 & 0xffffffff;
}


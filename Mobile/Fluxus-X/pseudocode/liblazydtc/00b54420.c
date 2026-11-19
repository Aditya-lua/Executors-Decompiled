/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54420
 */

undefined8 FUN_00b54420(undefined8 *param_1,long param_2)

{
  undefined8 *puVar1;
  uchar *key;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  EVP_CIPHER *cipher;
  ENGINE *impl;
  EVP_CIPHER_CTX *ctx;
  EVP_CIPHER_CTX *ctx_00;
  
  ctx = (EVP_CIPHER_CTX *)param_1[1];
  uVar3 = ossl_prov_ctx_get0_libctx(*param_1);
  if (param_2 == 0) {
    return 1;
  }
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
    return 0;
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,"cipher");
  if (lVar4 != 0) {
    puVar1 = param_1 + 2;
    uVar3 = ossl_prov_cipher_load_from_params(puVar1,param_2,uVar3);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
    ossl_prov_cipher_cipher(puVar1);
    iVar2 = EVP_CIPHER_get_mode();
    if (iVar2 != 6) {
      ERR_new();
      ERR_set_debug("providers/implementations/macs/gmac_prov.c",0xdc,"gmac_set_ctx_params");
      uVar3 = 0x7d;
      goto LAB_00b545d4;
    }
    cipher = (EVP_CIPHER *)ossl_prov_cipher_cipher(puVar1);
    impl = (ENGINE *)ossl_prov_cipher_engine(puVar1);
    iVar2 = EVP_EncryptInit_ex(ctx,cipher,impl,(uchar *)0x0,(uchar *)0x0);
    if (iVar2 == 0) {
      return 0;
    }
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
  if (lVar4 != 0) {
    if (*(int *)(lVar4 + 8) != 5) {
      return 0;
    }
    ctx_00 = (EVP_CIPHER_CTX *)param_1[1];
    key = *(uchar **)(lVar4 + 0x10);
    lVar4 = *(long *)(lVar4 + 0x18);
    iVar2 = EVP_CIPHER_CTX_get_key_length(ctx_00);
    if (lVar4 != iVar2) {
      ERR_new();
      ERR_set_debug("providers/implementations/macs/gmac_prov.c",0x6a,"gmac_setkey");
      uVar3 = 0x69;
LAB_00b545d4:
      ERR_set_error(0x39,uVar3,0);
      return 0;
    }
    iVar2 = EVP_EncryptInit_ex(ctx_00,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,(uchar *)0x0);
    if (iVar2 == 0) {
      return 0;
    }
  }
  lVar4 = OSSL_PARAM_locate_const(param_2,&DAT_002bdad8);
  if (lVar4 != 0) {
    if (*(int *)(lVar4 + 8) != 5) {
      return 0;
    }
    iVar2 = EVP_CIPHER_CTX_ctrl(ctx,9,*(int *)(lVar4 + 0x18),(void *)0x0);
    if (iVar2 < 1) {
      return 0;
    }
    iVar2 = EVP_EncryptInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,
                               *(uchar **)(lVar4 + 0x10));
    if (iVar2 == 0) {
      return 0;
    }
  }
  return 1;
}


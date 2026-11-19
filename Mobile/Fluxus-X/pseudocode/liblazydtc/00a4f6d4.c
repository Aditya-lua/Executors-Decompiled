/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f6d4
 */

undefined8
ossl_decoder_ctx_setup_for_pkey
          (long param_1,undefined8 param_2,char *param_3,undefined8 param_4,char *param_5)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 *ptr;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  int iVar8;
  long local_78;
  long local_70;
  ulong uStack_68;
  
  if (param_3 == (char *)0x0) {
    bVar1 = false;
  }
  else {
    iVar2 = strcmp(param_3,"id-ecPublicKey");
    if (iVar2 != 0) {
      iVar2 = strcmp(param_3,"1.2.840.10045.2.1");
      bVar1 = false;
      if (iVar2 != 0) goto LAB_00a4f744;
    }
    bVar1 = true;
  }
LAB_00a4f744:
  ptr = (undefined8 *)CRYPTO_zalloc(0x30,"crypto/encode_decode/decoder_pkey.c",0x150);
  if (ptr == (undefined8 *)0x0) {
LAB_00a4f7e0:
    lVar5 = 0;
LAB_00a4f7e4:
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_pkey.c",0x155,"ossl_decoder_ctx_setup_for_pkey");
    ERR_set_error(0x3c,0xc0100,0);
    uVar7 = 0;
    uVar6 = 0;
    if (ptr == (undefined8 *)0x0) goto LAB_00a4f98c;
  }
  else {
    if (param_5 != (char *)0x0) {
      pcVar4 = CRYPTO_strdup(param_5,"crypto/encode_decode/decoder_pkey.c",0x152);
      ptr[1] = pcVar4;
      if (pcVar4 == (char *)0x0) goto LAB_00a4f7e0;
    }
    lVar5 = OPENSSL_sk_new_null();
    ptr[3] = lVar5;
    if (lVar5 == 0) goto LAB_00a4f7e0;
    lVar5 = OPENSSL_sk_new_null();
    if (lVar5 == 0) goto LAB_00a4f7e4;
    ptr[5] = param_2;
    *ptr = param_4;
    *(undefined4 *)(ptr + 2) = *(undefined4 *)(param_1 + 0x10);
    EVP_KEYMGMT_do_all_provided(param_4,FUN_00a4f9c4,ptr[3]);
    iVar2 = OPENSSL_sk_num(ptr[3]);
    if (0 < iVar2) {
      iVar8 = 0;
      do {
        uVar6 = OPENSSL_sk_value(ptr[3],iVar8);
        if ((((param_3 == (char *)0x0) || (iVar3 = EVP_KEYMGMT_is_a(uVar6,param_3), iVar3 != 0)) ||
            ((bVar1 && (iVar3 = EVP_KEYMGMT_is_a(uVar6,&DAT_002adb94), iVar3 != 0)))) &&
           (iVar3 = EVP_KEYMGMT_names_do_all(uVar6,&LAB_00a4fa10,lVar5), iVar3 == 0)) {
          ERR_new();
          ERR_set_debug("crypto/encode_decode/decoder_pkey.c",0x171,
                        "ossl_decoder_ctx_setup_for_pkey");
          ERR_set_error(0x3c,0xc0103,0);
          goto LAB_00a4f93c;
        }
        iVar8 = iVar8 + 1;
      } while (iVar8 < iVar2);
    }
    uStack_68 = 0;
    local_78 = lVar5;
    local_70 = param_1;
    OSSL_DECODER_do_all_provided(param_4,&LAB_00a4fa20,&local_78);
    OPENSSL_sk_free(lVar5);
    if ((uStack_68 & 0x100000000) == 0) {
      iVar2 = OSSL_DECODER_CTX_get_num_decoders(param_1);
      if (iVar2 != 0) {
        iVar2 = OSSL_DECODER_CTX_set_construct(param_1,FUN_00a4fb3c);
        if (((iVar2 != 0) && (iVar2 = OSSL_DECODER_CTX_set_construct_data(param_1,ptr), iVar2 != 0))
           && (iVar2 = OSSL_DECODER_CTX_set_cleanup(param_1,FUN_00a4fd40), iVar2 != 0)) {
          lVar5 = 0;
          uVar7 = 1;
          goto LAB_00a4f98c;
        }
        goto LAB_00a4f900;
      }
      lVar5 = 0;
      uVar6 = 1;
    }
    else {
LAB_00a4f900:
      lVar5 = 0;
LAB_00a4f93c:
      uVar6 = 0;
    }
  }
  uVar7 = uVar6;
  OPENSSL_sk_pop_free(ptr[3],EVP_KEYMGMT_free);
  CRYPTO_free((void *)ptr[1]);
  CRYPTO_free((void *)ptr[4]);
  CRYPTO_free(ptr);
LAB_00a4f98c:
  OPENSSL_sk_free(lVar5);
  return uVar7;
}


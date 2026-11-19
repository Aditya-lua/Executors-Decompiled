/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a627d0
 */

long OSSL_ENCODER_CTX_new_for_pkey
               (long param_1,undefined4 param_2,undefined8 param_3,long param_4,undefined8 param_5)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *ptr;
  long local_d0;
  byte bStack_c8;
  undefined7 uStack_c7;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined4 local_a4;
  long local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_88;
  long local_80;
  byte local_78;
  int local_74;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_pkey.c",0x147,"OSSL_ENCODER_CTX_new_for_pkey");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  if ((*(long *)(param_1 + 0x20) == 0) && (*(long *)(param_1 + 0x68) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_pkey.c",0x14c,"OSSL_ENCODER_CTX_new_for_pkey");
    ERR_set_error(0x3b,0x80106,"The passed EVP_PKEY must be assigned a key");
    return 0;
  }
  lVar2 = OSSL_ENCODER_CTX_new();
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_pkey.c",0x152,"OSSL_ENCODER_CTX_new_for_pkey");
    ERR_set_error(0x3b,0xc0100,0);
    return 0;
  }
  if (*(long *)(param_1 + 0x60) == 0) {
    uVar3 = 0;
  }
  else {
    EVP_KEYMGMT_get0_provider();
    uVar3 = ossl_provider_libctx();
  }
  iVar1 = OSSL_ENCODER_CTX_set_output_type(lVar2,param_3);
  if ((iVar1 == 0) ||
     (((param_4 != 0 && (iVar1 = OSSL_ENCODER_CTX_set_output_structure(lVar2,param_4), iVar1 == 0))
      || (iVar1 = OSSL_ENCODER_CTX_set_selection(lVar2,param_2), iVar1 == 0)))) goto LAB_00a62b5c;
  if (*(long *)(param_1 + 0x60) != 0) {
    uVar4 = EVP_KEYMGMT_get0_provider();
    uVar5 = ossl_provider_libctx();
    if (*(long *)(param_1 + 0x60) != 0) {
      ptr = (long *)CRYPTO_zalloc(0x28,"crypto/encode_decode/encoder_pkey.c",0xf6);
      if (ptr == (long *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/encode_decode/encoder_pkey.c",0xf7,"ossl_encoder_ctx_setup_for_pkey");
        ERR_set_error(0x3b,0xc0100,0);
        goto LAB_00a62b5c;
      }
      local_d0 = OPENSSL_sk_new_null();
      if (local_d0 == 0) {
        ERR_new();
        uVar3 = 0x101;
LAB_00a62a48:
        ERR_set_debug("crypto/encode_decode/encoder_pkey.c",uVar3,"ossl_encoder_ctx_setup_for_pkey")
        ;
        ERR_set_error(0x3b,0xc0100,0);
      }
      else {
        bStack_c8 = 0;
        EVP_KEYMGMT_names_do_all(*(undefined8 *)(param_1 + 0x60),&LAB_00a62b88,&local_d0);
        if ((bStack_c8 & 1) == 0) {
          local_90 = *(undefined8 *)(lVar2 + 8);
          uStack_98 = *(undefined8 *)(lVar2 + 0x10);
          local_a0 = local_d0;
          local_74 = 0;
          local_78 = 0;
          local_88 = uVar4;
          local_80 = lVar2;
          OSSL_ENCODER_do_all_provided(uVar5,&LAB_00a62bd4,&local_a0);
          local_78 = local_78 | 1;
          OSSL_ENCODER_do_all_provided(uVar5,&LAB_00a62bd4,&local_a0);
          OPENSSL_sk_free(local_d0);
          if (local_74 == 0) {
            iVar1 = OSSL_ENCODER_CTX_get_num_encoders(lVar2);
            if (iVar1 == 0) {
              OSSL_ENCODER_CTX_set_construct_data(lVar2,0);
              CRYPTO_free(ptr);
            }
            else {
              iVar1 = OSSL_ENCODER_CTX_set_construct(lVar2,&LAB_00a62cd4);
              if (((iVar1 == 0) ||
                  (iVar1 = OSSL_ENCODER_CTX_set_construct_data(lVar2,ptr), iVar1 == 0)) ||
                 (iVar1 = OSSL_ENCODER_CTX_set_cleanup(lVar2,&LAB_00a62d74), iVar1 == 0))
              goto LAB_00a62a68;
              *ptr = param_1;
              *(undefined4 *)(ptr + 1) = param_2;
            }
            goto LAB_00a62afc;
          }
          ERR_new();
          uVar3 = 0x123;
          goto LAB_00a62a48;
        }
        OPENSSL_sk_free();
      }
LAB_00a62a68:
      OSSL_ENCODER_CTX_set_construct_data(lVar2,0);
      CRYPTO_free(ptr);
      goto LAB_00a62b5c;
    }
  }
LAB_00a62afc:
  iVar1 = OSSL_ENCODER_CTX_add_extra(lVar2,uVar3,param_5);
  if (iVar1 != 0) {
    memset(&local_a0,0,0x50);
    local_a4 = *(undefined4 *)(param_1 + 0x48);
    OSSL_PARAM_construct_int(&local_d0,"save-parameters",&local_a4);
    uStack_98 = CONCAT71(uStack_c7,bStack_c8);
    local_80 = local_b0;
    local_a0 = local_d0;
    local_88 = uStack_b8;
    local_90 = uStack_c0;
    OSSL_ENCODER_CTX_set_params(lVar2,&local_a0);
    return lVar2;
  }
LAB_00a62b5c:
  OSSL_ENCODER_CTX_free(lVar2);
  return 0;
}


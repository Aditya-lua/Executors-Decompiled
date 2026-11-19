/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a622b0
 */

undefined8 OSSL_ENCODER_CTX_add_encoder(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long *ptr;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x125,"OSSL_ENCODER_CTX_add_encoder");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  OSSL_ENCODER_get0_provider(param_2);
  OSSL_PROVIDER_get0_provider_ctx();
  lVar2 = (**(code **)(param_2 + 0x38))();
  if (lVar2 == 0) {
    return 0;
  }
  ptr = (long *)CRYPTO_zalloc(0x20,"crypto/encode_decode/encoder_lib.c",0xc9);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0xca,"ossl_encoder_instance_new");
    ERR_set_error(0x3b,0xc0100,0);
    goto LAB_00a624dc;
  }
  iVar1 = OSSL_ENCODER_up_ref(param_2);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0xcf,"ossl_encoder_instance_new");
    ERR_set_error(0x3b,0xc0103,0);
    lVar4 = *ptr;
    if (lVar4 != 0) goto LAB_00a6245c;
LAB_00a624b8:
    lVar4 = 0;
  }
  else {
    OSSL_ENCODER_get0_provider(param_2);
    uVar3 = ossl_provider_libctx();
    lVar4 = ossl_encoder_parsed_properties(param_2);
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("crypto/encode_decode/encoder_lib.c",0xd7,"ossl_encoder_instance_new");
      uVar3 = OSSL_ENCODER_get0_name(param_2);
      ERR_set_error(0x3c,0x8010e,"there are no property definitions with encoder %s",uVar3);
      lVar4 = *ptr;
    }
    else {
      uVar5 = ossl_property_find_property(lVar4,uVar3,"output");
      lVar6 = ossl_property_get_string_value(uVar3,uVar5);
      ptr[2] = lVar6;
      if (lVar6 != 0) {
        lVar4 = ossl_property_find_property(lVar4,uVar3,"structure");
        if (lVar4 != 0) {
          lVar4 = ossl_property_get_string_value(uVar3,lVar4);
          ptr[3] = lVar4;
        }
        *ptr = param_2;
        ptr[1] = lVar2;
        lVar2 = *(long *)(param_1 + 0x18);
        if (lVar2 == 0) {
          lVar2 = OPENSSL_sk_new_null();
          *(long *)(param_1 + 0x18) = lVar2;
          if (lVar2 == 0) {
            ERR_new();
            ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x10b,
                          "ossl_encoder_ctx_add_encoder_inst");
            ERR_set_error(0x3b,0xc0100,0);
            goto LAB_00a6258c;
          }
        }
        iVar1 = OPENSSL_sk_push(lVar2,ptr);
        if (0 < iVar1) {
          return 1;
        }
LAB_00a6258c:
        if (*ptr == 0) {
          lVar2 = 0;
        }
        else {
          (**(code **)(*ptr + 0x40))(ptr[1]);
          lVar2 = *ptr;
        }
        ptr[1] = 0;
        OSSL_ENCODER_free(lVar2);
        *ptr = 0;
        CRYPTO_free(ptr);
        return 0;
      }
      ERR_new();
      ERR_set_debug("crypto/encode_decode/encoder_lib.c",0xe1,"ossl_encoder_instance_new");
      uVar3 = OSSL_ENCODER_get0_name(param_2);
      uVar5 = OSSL_ENCODER_get0_properties(param_2);
      ERR_set_error(0x3c,0x8010e,
                    "the mandatory \'output\' property is missing for encoder %s (properties: %s)",
                    uVar3,uVar5);
      lVar4 = *ptr;
    }
    if (lVar4 == 0) goto LAB_00a624b8;
LAB_00a6245c:
    (**(code **)(lVar4 + 0x40))(ptr[1]);
    lVar4 = *ptr;
  }
  ptr[1] = 0;
  OSSL_ENCODER_free(lVar4);
  *ptr = 0;
  CRYPTO_free(ptr);
LAB_00a624dc:
  (**(code **)(param_2 + 0x40))(lVar2);
  return 0;
}


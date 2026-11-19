/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d758
 */

undefined8 OSSL_DECODER_CTX_add_decoder(long param_1,long param_2)

{
  int iVar1;
  long lVar2;
  long *ptr;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x13e,"OSSL_DECODER_CTX_add_decoder");
    ERR_set_error(0x3c,0xc0102,0);
    return 0;
  }
  OSSL_DECODER_get0_provider(param_2);
  OSSL_PROVIDER_get0_provider_ctx();
  lVar2 = (**(code **)(param_2 + 0x38))();
  if (lVar2 == 0) {
    return 0;
  }
  ptr = (long *)ossl_decoder_instance_new(param_2,lVar2);
  if (ptr == (long *)0x0) {
    (**(code **)(param_2 + 0x40))(lVar2);
    return 0;
  }
  lVar2 = *(long *)(param_1 + 0x18);
  if (lVar2 == 0) {
    lVar2 = OPENSSL_sk_new_null();
    *(long *)(param_1 + 0x18) = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x124,"ossl_decoder_ctx_add_decoder_inst");
      ERR_set_error(0x3c,0xc0100,0);
      goto LAB_00a4d85c;
    }
  }
  iVar1 = OPENSSL_sk_push(lVar2,ptr);
  if (0 < iVar1) {
    return 1;
  }
LAB_00a4d85c:
  if (*ptr == 0) {
    lVar2 = 0;
  }
  else {
    (**(code **)(*ptr + 0x40))(ptr[1]);
    lVar2 = *ptr;
  }
  ptr[1] = 0;
  OSSL_DECODER_free(lVar2);
  *ptr = 0;
  CRYPTO_free(ptr);
  return 0;
}


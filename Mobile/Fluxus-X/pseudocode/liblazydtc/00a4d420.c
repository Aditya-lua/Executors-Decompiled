/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d420
 */

long * ossl_decoder_instance_new(long param_1,long param_2)

{
  int iVar1;
  long *ptr;
  undefined8 uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0xde,"ossl_decoder_instance_new");
    ERR_set_error(0x3c,0xc0102,0);
    return (long *)0x0;
  }
  ptr = (long *)CRYPTO_zalloc(0x28,"crypto/encode_decode/decoder_lib.c",0xe2);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0xe3,"ossl_decoder_instance_new");
    ERR_set_error(0x3c,0xc0100,0);
    return (long *)0x0;
  }
  OSSL_DECODER_get0_provider(param_1);
  uVar2 = ossl_provider_libctx();
  lVar3 = ossl_decoder_parsed_properties(param_1);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0xeb,"ossl_decoder_instance_new");
    uVar2 = OSSL_DECODER_get0_name(param_1);
    ERR_set_error(0x3c,0x8010e,"there are no property definitions with decoder %s",uVar2);
    lVar3 = *ptr;
  }
  else {
    uVar4 = ossl_property_find_property(lVar3,uVar2,"input");
    lVar5 = ossl_property_get_string_value(uVar2,uVar4);
    ptr[2] = lVar5;
    if (lVar5 == 0) {
      ERR_new();
      ERR_set_debug("crypto/encode_decode/decoder_lib.c",0xf5,"ossl_decoder_instance_new");
      uVar2 = OSSL_DECODER_get0_name(param_1);
      uVar4 = OSSL_DECODER_get0_properties(param_1);
      ERR_set_error(0x3c,0x8010e,
                    "the mandatory \'input\' property is missing for decoder %s (properties: %s)",
                    uVar2,uVar4);
      lVar3 = *ptr;
    }
    else {
      lVar3 = ossl_property_find_property(lVar3,uVar2,"structure");
      if (lVar3 != 0) {
        lVar3 = ossl_property_get_string_value(uVar2,lVar3);
        ptr[3] = lVar3;
      }
      iVar1 = OSSL_DECODER_up_ref(param_1);
      if (iVar1 != 0) {
        *ptr = param_1;
        ptr[1] = param_2;
        return ptr;
      }
      ERR_new();
      ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x105,"ossl_decoder_instance_new");
      ERR_set_error(0x3c,0xc0103,0);
      lVar3 = *ptr;
    }
  }
  if (lVar3 == 0) {
    lVar3 = 0;
  }
  else {
    (**(code **)(lVar3 + 0x40))(ptr[1]);
    lVar3 = *ptr;
  }
  ptr[1] = 0;
  OSSL_DECODER_free(lVar3);
  *ptr = 0;
  CRYPTO_free(ptr);
  return (long *)0x0;
}


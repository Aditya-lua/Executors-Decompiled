/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5b884
 */

undefined8 FUN_00b5b884(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 local_30;
  undefined8 local_28;
  
  local_30 = 0;
  local_28 = 0;
  if (param_2 != 0) {
    lVar1 = OSSL_PARAM_locate_const(param_2,"strength");
    if ((lVar1 != 0) && (uVar2 = OSSL_PARAM_get_uint(lVar1,param_1 + 0xc), (int)uVar2 == 0)) {
      return uVar2;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"test_entropy");
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_octet_string(lVar1,&local_28,0,&local_30);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      CRYPTO_free(*(void **)(param_1 + 0x18));
      *(undefined8 *)(param_1 + 0x18) = local_28;
      *(undefined8 *)(param_1 + 0x28) = local_30;
      *(undefined8 *)(param_1 + 0x30) = 0;
      local_28 = 0;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"test_nonce");
    if (lVar1 != 0) {
      uVar2 = OSSL_PARAM_get_octet_string(lVar1,&local_28,0,&local_30);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      CRYPTO_free(*(void **)(param_1 + 0x20));
      *(undefined8 *)(param_1 + 0x20) = local_28;
      *(undefined8 *)(param_1 + 0x38) = local_30;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"max_request");
    if ((lVar1 != 0) && (uVar2 = OSSL_PARAM_get_size_t(lVar1,param_1 + 0x10), (int)uVar2 == 0)) {
      return uVar2;
    }
  }
  return 1;
}


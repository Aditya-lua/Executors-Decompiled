/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65b84
 */

undefined8
evp_keymgmt_util_cache_keydata(long param_1,undefined8 param_2,long param_3,undefined4 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 *ptr;
  undefined8 uVar3;
  
  if (param_3 == 0) {
LAB_00a65c00:
    uVar3 = 1;
  }
  else {
    if (*(long *)(param_1 + 0x78) == 0) {
      lVar2 = OPENSSL_sk_new_null();
      *(long *)(param_1 + 0x78) = lVar2;
      if (lVar2 == 0) {
        return 0;
      }
    }
    ptr = CRYPTO_malloc(0x18,"crypto/evp/keymgmt_lib.c",0x110);
    if (ptr == (undefined8 *)0x0) {
      return 0;
    }
    *ptr = param_2;
    ptr[1] = param_3;
    *(undefined4 *)(ptr + 2) = param_4;
    iVar1 = EVP_KEYMGMT_up_ref(param_2);
    if (iVar1 != 0) {
      iVar1 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0x78),ptr);
      if (iVar1 != 0) goto LAB_00a65c00;
      EVP_KEYMGMT_free(param_2);
    }
    CRYPTO_free(ptr);
    uVar3 = 0;
  }
  return uVar3;
}


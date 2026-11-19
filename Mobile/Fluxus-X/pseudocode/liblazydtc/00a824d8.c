/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a824d8
 */

undefined4 ossl_namemap_name2num_n(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  undefined4 uVar3;
  void *local_40;
  undefined4 local_38;
  
  if (((param_1 == 0) && (param_1 = ossl_namemap_stored(), param_1 == 0)) ||
     (iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 8)), iVar1 == 0)) {
    uVar3 = 0;
  }
  else {
    local_40 = (void *)CRYPTO_strndup(param_2,param_3,"crypto/core_namemap.c",0xb6);
    if (local_40 == (void *)0x0) {
      uVar3 = 0;
    }
    else {
      local_38 = 0;
      lVar2 = OPENSSL_LH_retrieve(*(undefined8 *)(param_1 + 0x10),&local_40);
      CRYPTO_free(local_40);
      uVar3 = 0;
      if (lVar2 != 0) {
        uVar3 = *(undefined4 *)(lVar2 + 8);
      }
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
  }
  return uVar3;
}


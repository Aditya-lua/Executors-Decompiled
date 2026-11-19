/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a823c4
 */

undefined8
ossl_namemap_doall_names(long param_1,undefined4 param_2,code *param_3,undefined8 param_4)

{
  undefined8 uVar1;
  long lVar2;
  undefined4 local_48 [2];
  void *local_40;
  int local_38;
  
  local_38 = 0;
  uVar1 = 0;
  if ((param_1 != 0) &&
     (local_48[0] = param_2, uVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 8)),
     (int)uVar1 != 0)) {
    lVar2 = OPENSSL_LH_num_items(*(undefined8 *)(param_1 + 0x10));
    if ((lVar2 != 0) &&
       (local_40 = CRYPTO_malloc((int)(lVar2 << 3),"crypto/core_namemap.c",0xa1),
       local_40 != (void *)0x0)) {
      OPENSSL_LH_doall_arg(*(undefined8 *)(param_1 + 0x10),&LAB_00a824ac,local_48);
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
      if (0 < local_38) {
        lVar2 = 0;
        do {
          (*param_3)(*(undefined8 *)((long)local_40 + lVar2 * 8),param_4);
          lVar2 = lVar2 + 1;
        } while (lVar2 < local_38);
      }
      CRYPTO_free(local_40);
      return 1;
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
    uVar1 = 0;
  }
  return uVar1;
}


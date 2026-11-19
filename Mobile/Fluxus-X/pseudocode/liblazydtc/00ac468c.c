/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac468c
 */

undefined8 ossl_method_store_remove_all_provided(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long local_30;
  undefined8 uStack_28;
  
  uVar1 = 0;
  if ((param_1 != 0) &&
     (uVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x10)), (int)uVar1 != 0)) {
    local_30 = param_1;
    uStack_28 = param_2;
    ossl_sa_doall_arg(*(undefined8 *)(param_1 + 8),&LAB_00ac46e8,&local_30);
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
    uVar1 = 1;
  }
  return uVar1;
}


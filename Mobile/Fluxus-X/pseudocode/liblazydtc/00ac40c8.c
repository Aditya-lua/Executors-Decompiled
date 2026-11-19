/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac40c8
 */

void ossl_method_store_free(void *param_1)

{
  undefined8 uVar1;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  uVar1 = 0;
  if (*(long *)((long)param_1 + 8) != 0) {
    ossl_sa_doall_arg(*(long *)((long)param_1 + 8),&LAB_00ac412c,param_1);
    uVar1 = *(undefined8 *)((long)param_1 + 8);
  }
  ossl_sa_free(uVar1);
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x10));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x18));
  CRYPTO_free(param_1);
  return;
}


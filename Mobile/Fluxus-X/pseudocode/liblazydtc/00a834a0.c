/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a834a0
 */

bool ossl_do_ex_data_init(void)

{
  bool bVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = (long *)ossl_lib_ctx_get_ex_data_global();
  bVar1 = false;
  if (plVar2 != (long *)0x0) {
    lVar3 = CRYPTO_THREAD_lock_new();
    bVar1 = lVar3 != 0;
    *plVar2 = lVar3;
  }
  return bVar1;
}


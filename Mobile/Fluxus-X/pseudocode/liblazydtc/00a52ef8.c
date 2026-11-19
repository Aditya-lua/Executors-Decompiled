/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52ef8
 */

void engine_table_cleanup(long *param_1)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar1 == 0) {
    return;
  }
  if (*param_1 != 0) {
    OPENSSL_LH_doall(*param_1,&LAB_00a52f5c);
    OPENSSL_LH_free(*param_1);
    *param_1 = 0;
  }
  CRYPTO_THREAD_unlock(global_engine_lock);
  return;
}


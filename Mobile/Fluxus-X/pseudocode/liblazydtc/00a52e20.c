/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52e20
 */

void engine_table_unregister(long *param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_write_lock(global_engine_lock);
  if (iVar1 == 0) {
    return;
  }
  if (*param_1 != 0) {
    OPENSSL_LH_doall_arg(*param_1,FUN_00a52e8c,param_2);
  }
  CRYPTO_THREAD_unlock(global_engine_lock);
  return;
}


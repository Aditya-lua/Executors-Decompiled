/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7b70
 */

void RAND_keep_random_devices_open(undefined4 param_1)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
  if ((iVar1 == 0) || (DAT_00d22214 == 0)) {
    return;
  }
  ossl_rand_pool_keep_random_devices_open(param_1);
  return;
}


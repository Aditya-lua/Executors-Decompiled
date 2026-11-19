/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7784
 */

void FUN_00ac7784(undefined8 *param_1)

{
  long lVar1;
  
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  CRYPTO_THREAD_lock_free(*param_1);
  lVar1 = param_1[1];
  if (lVar1 != 0) {
    OPENSSL_LH_doall(lVar1,&LAB_00ac7820);
    OPENSSL_LH_free(lVar1);
    param_1[1] = 0;
  }
  lVar1 = param_1[2];
  if (lVar1 != 0) {
    OPENSSL_LH_doall(lVar1,&LAB_00ac7820);
    OPENSSL_LH_free(lVar1);
    param_1[2] = 0;
  }
  param_1[3] = 0;
  CRYPTO_free(param_1);
  return;
}


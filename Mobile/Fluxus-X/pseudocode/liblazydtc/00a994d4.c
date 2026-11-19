/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a994d4
 */

void ossl_ctx_thread_stop(undefined8 param_1)

{
  undefined8 uVar1;
  
  if (DAT_00cc9130 == -1) {
    return;
  }
  uVar1 = CRYPTO_THREAD_get_local(&DAT_00cc9130);
  FUN_00a99588(param_1,uVar1);
  return;
}


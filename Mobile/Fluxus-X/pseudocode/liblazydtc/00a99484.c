/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99484
 */

void OPENSSL_thread_stop_ex(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar1 = ossl_lib_ctx_get_concrete();
  if (DAT_00cc9130 == -1) {
    return;
  }
  uVar2 = CRYPTO_THREAD_get_local(&DAT_00cc9130);
  FUN_00a99588(uVar1,uVar2);
  return;
}


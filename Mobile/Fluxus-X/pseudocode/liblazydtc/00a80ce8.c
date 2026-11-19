/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80ce8
 */

void ossl_lib_ctx_default_deinit(void)

{
  FUN_00a80d0c(&DAT_00d21b90);
  CRYPTO_THREAD_cleanup_local(&DAT_00d21d58);
  return;
}


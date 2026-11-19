/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54f24
 */

void err_unshelve_state(long param_1)

{
  if (param_1 == -1) {
    return;
  }
  CRYPTO_THREAD_set_local(&DAT_00d21a1c,param_1);
  return;
}


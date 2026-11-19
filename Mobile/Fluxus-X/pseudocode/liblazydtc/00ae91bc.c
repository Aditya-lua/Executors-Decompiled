/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae91bc
 */

void OPENSSL_sk_zero(int *param_1)

{
  if ((param_1 != (int *)0x0) && (*param_1 != 0)) {
    memset(*(void **)(param_1 + 2),0,(long)*param_1 << 3);
    *param_1 = 0;
  }
  return;
}


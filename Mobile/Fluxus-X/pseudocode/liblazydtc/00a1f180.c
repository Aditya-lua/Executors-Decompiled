/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f180
 */

void ossl_dh_set0_libctx(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xb0) = param_2;
  return;
}


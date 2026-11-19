/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2dbd8
 */

void ossl_blake2b_param_set_key_length(long param_1,undefined1 param_2)

{
  *(undefined1 *)(param_1 + 1) = param_2;
  return;
}


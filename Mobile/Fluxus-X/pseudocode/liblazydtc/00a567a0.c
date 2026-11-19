/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a567a0
 */

void EVP_ASYM_CIPHER_is_a(undefined4 *param_1,undefined8 param_2)

{
  evp_is_a(*(undefined8 *)(param_1 + 6),*param_1,0,param_2);
  return;
}


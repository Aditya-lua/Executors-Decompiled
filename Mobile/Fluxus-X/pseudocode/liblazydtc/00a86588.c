/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86588
 */

undefined8 EVP_CIPHER_meth_set_iv_length(long param_1,undefined4 param_2)

{
  if (*(int *)(param_1 + 0xc) == 0) {
    *(undefined4 *)(param_1 + 0xc) = param_2;
    return 1;
  }
  return 0;
}


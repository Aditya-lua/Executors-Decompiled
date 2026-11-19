/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86608
 */

undefined8 EVP_CIPHER_meth_set_do_cipher(long param_1,undefined8 param_2)

{
  if (*(long *)(param_1 + 0x28) == 0) {
    *(undefined8 *)(param_1 + 0x28) = param_2;
    return 1;
  }
  return 0;
}


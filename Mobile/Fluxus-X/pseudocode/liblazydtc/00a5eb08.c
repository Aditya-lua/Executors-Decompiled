/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5eb08
 */

undefined8 EVP_CIPHER_get_flags(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}


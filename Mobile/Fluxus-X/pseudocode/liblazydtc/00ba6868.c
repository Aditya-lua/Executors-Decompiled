/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6868
 */

undefined4 mbedtls_rsa_get_padding_mode(long param_1)

{
  return *(undefined4 *)(param_1 + 0xe0);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6880
 */

undefined8 mbedtls_rsa_get_len(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}


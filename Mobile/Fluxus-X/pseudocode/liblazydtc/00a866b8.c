/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a866b8
 */

undefined8 EVP_CIPHER_meth_get_cleanup(long param_1)

{
  return *(undefined8 *)(param_1 + 0x30);
}


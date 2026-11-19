/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa40
 */

undefined8 EVP_MD_meth_get_copy(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}


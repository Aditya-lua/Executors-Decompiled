/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa28
 */

undefined8 EVP_MD_meth_get_init(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}


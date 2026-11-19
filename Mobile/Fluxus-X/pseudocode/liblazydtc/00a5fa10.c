/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5fa10
 */

undefined4 EVP_MD_meth_get_result_size(long param_1)

{
  return *(undefined4 *)(param_1 + 8);
}


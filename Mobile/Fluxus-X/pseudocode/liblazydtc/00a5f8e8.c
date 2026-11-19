/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f8e8
 */

undefined8 EVP_MD_meth_set_result_size(long param_1,undefined4 param_2)

{
  if (*(int *)(param_1 + 8) == 0) {
    *(undefined4 *)(param_1 + 8) = param_2;
    return 1;
  }
  return 0;
}


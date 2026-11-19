/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f8c8
 */

undefined8 EVP_MD_meth_set_input_blocksize(long param_1,undefined4 param_2)

{
  if (*(int *)(param_1 + 0x48) == 0) {
    *(undefined4 *)(param_1 + 0x48) = param_2;
    return 1;
  }
  return 0;
}


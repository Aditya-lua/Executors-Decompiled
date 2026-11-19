/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f968
 */

undefined8 EVP_MD_meth_set_update(long param_1,undefined8 param_2)

{
  if (*(long *)(param_1 + 0x28) == 0) {
    *(undefined8 *)(param_1 + 0x28) = param_2;
    return 1;
  }
  return 0;
}


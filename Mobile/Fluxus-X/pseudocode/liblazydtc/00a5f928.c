/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f928
 */

undefined8 EVP_MD_meth_set_flags(long param_1,undefined8 param_2)

{
  if (*(long *)(param_1 + 0x10) == 0) {
    *(undefined8 *)(param_1 + 0x10) = param_2;
    return 1;
  }
  return 0;
}


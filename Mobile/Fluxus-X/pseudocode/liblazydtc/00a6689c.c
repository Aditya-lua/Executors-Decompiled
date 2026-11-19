/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6689c
 */

undefined4 evp_keymgmt_get_number(long param_1)

{
  return *(undefined4 *)(param_1 + 4);
}


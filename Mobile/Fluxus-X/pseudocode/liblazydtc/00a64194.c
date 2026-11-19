/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a64194
 */

undefined4 evp_kdf_get_number(long param_1)

{
  return *(undefined4 *)(param_1 + 8);
}


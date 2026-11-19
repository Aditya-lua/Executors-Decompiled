/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f670
 */

undefined4 evp_md_get_number(long param_1)

{
  return *(undefined4 *)(param_1 + 0x58);
}


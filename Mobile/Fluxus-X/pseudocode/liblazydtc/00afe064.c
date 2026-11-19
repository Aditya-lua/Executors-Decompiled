/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe064
 */

undefined8 PROFESSION_INFO_get0_professionItems(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}


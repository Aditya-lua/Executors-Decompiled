/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe0dc
 */

undefined8 PROFESSION_INFO_get0_registrationNumber(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}


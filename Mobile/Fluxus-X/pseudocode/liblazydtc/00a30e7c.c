/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30e7c
 */

undefined8 EC_GROUP_get0_cofactor(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}


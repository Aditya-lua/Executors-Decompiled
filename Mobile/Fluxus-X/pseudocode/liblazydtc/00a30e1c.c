/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30e1c
 */

undefined8 EC_GROUP_get0_order(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}


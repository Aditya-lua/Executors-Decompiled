/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e51d8
 */

undefined8 FUN_008e51d8(long param_1,uint param_2)

{
  return *(undefined8 *)(*(long *)(param_1 + 0x10) + (ulong)param_2 * 8);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0be74
 */

undefined8 COMP_get_name(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}


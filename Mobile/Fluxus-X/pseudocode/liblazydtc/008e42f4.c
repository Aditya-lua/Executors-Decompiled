/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e42f4
 */

undefined4 FUN_008e42f4(long param_1,int param_2)

{
  return *(undefined4 *)(*(long *)(param_1 + 8) + (long)param_2);
}


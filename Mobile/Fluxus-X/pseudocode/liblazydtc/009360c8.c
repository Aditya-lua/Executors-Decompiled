/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009360c8
 */

void FUN_009360c8(long param_1,long param_2)

{
  long *plVar1;
  
  for (plVar1 = *(long **)(param_1 + 0x138); (plVar1 != (long *)0x0 && (*plVar1 != param_2));
      plVar1 = (long *)plVar1[1]) {
  }
  return;
}


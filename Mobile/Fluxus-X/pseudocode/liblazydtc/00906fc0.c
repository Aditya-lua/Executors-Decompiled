/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00906fc0
 */

void FUN_00906fc0(long param_1,int param_2)

{
  long *plVar1;
  
  plVar1 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
  if (plVar1 != (long *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,param_1);
  }
  FUN_009089bc(param_1,param_2);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090803c
 */

void FUN_0090803c(long param_1)

{
  long *plVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x20);
  for (plVar1 = *(long **)(lVar2 + 0x248); plVar1 != (long *)0x0; plVar1 = (long *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x58) != (code *)&LAB_00907bd4) {
      (**(code **)(*plVar1 + 0x58))(plVar1,param_1,8,0,0);
    }
  }
  for (plVar1 = *(long **)(lVar2 + 0x250); plVar1 != (long *)0x0; plVar1 = (long *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x58) != (code *)&LAB_00907bd4) {
      (**(code **)(*plVar1 + 0x58))(plVar1,param_1,8,0,0);
    }
  }
  return;
}


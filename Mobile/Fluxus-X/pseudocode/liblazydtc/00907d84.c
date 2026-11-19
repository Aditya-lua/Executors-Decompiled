/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907d84
 */

void FUN_00907d84(long param_1,undefined8 param_2)

{
  long *plVar1;
  
  for (plVar1 = *(long **)(param_1 + 0x248); plVar1 != (long *)0x0; plVar1 = (long *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x58) != (code *)&LAB_00907bd4) {
      (**(code **)(*plVar1 + 0x58))(plVar1,param_2,1,0,0);
    }
  }
  for (plVar1 = *(long **)(param_1 + 0x250); plVar1 != (long *)0x0; plVar1 = (long *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x58) != (code *)&LAB_00907bd4) {
      (**(code **)(*plVar1 + 0x58))(plVar1,param_2,1,0,0);
    }
  }
  return;
}


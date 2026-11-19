/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00906f54
 */

void FUN_00906f54(undefined8 param_1,long param_2,int param_3)

{
  long *plVar1;
  long *plVar2;
  
  param_2 = param_2 + (long)param_3 * 8;
  plVar2 = *(long **)(param_2 + 0x248);
  if (plVar2 != (long *)0x0) {
    *(undefined8 *)(param_2 + 0x248) = 0;
    do {
      plVar1 = (long *)plVar2[1];
      plVar2[1] = 0;
      (**(code **)(*plVar2 + 0x10))(plVar2,param_1);
      (*(code *)PTR_free_00cc4678)(plVar2);
      plVar2 = plVar1;
    } while (plVar1 != (long *)0x0);
  }
  return;
}


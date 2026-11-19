/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935ad8
 */

int FUN_00935ad8(long param_1,long *param_2)

{
  int iVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x138);
  while (plVar2 != (long *)0x0) {
    *(long *)(param_1 + 0x138) = plVar2[1];
    (**(code **)(*plVar2 + 0x18))(param_1,plVar2);
    (*(code *)PTR_free_00cc4678)(plVar2);
    plVar2 = *(long **)(param_1 + 0x138);
  }
  iVar1 = FUN_00935924(param_1,param_2);
  if ((param_2 != (long *)0x0) && (iVar1 != 0)) {
    (**(code **)(*param_2 + 0x18))(param_1,param_2);
    (*(code *)PTR_free_00cc4678)(param_2);
  }
  return iVar1;
}


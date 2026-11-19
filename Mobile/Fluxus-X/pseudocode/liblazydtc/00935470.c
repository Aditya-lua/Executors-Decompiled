/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935470
 */

int FUN_00935470(long *param_1,undefined8 param_2,long param_3,undefined4 param_4)

{
  long *plVar1;
  int iVar2;
  long *plVar3;
  
  plVar3 = (long *)(*(code *)PTR_calloc_00cc4690)(1,*(undefined8 *)(param_3 + 0x28));
  if (plVar3 == (long *)0x0) {
    *param_1 = 0;
    iVar2 = 0x1b;
  }
  else {
    *plVar3 = param_3;
    plVar3[2] = (long)plVar3;
    *(undefined4 *)(plVar3 + 3) = param_4;
    iVar2 = (**(code **)(param_3 + 0x10))(param_2,plVar3);
    plVar1 = (long *)0x0;
    if (iVar2 == 0) {
      plVar1 = plVar3;
    }
    *param_1 = (long)plVar1;
    if (iVar2 == 0) {
      return 0;
    }
  }
  (*(code *)PTR_free_00cc4678)(plVar3);
  return iVar2;
}


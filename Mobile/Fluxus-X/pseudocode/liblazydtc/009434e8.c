/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009434e8
 */

int thunk_FUN_00937414(long param_1)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46b0)) {
    FUN_009050ec(param_1,"cw-out done");
  }
  lVar3 = FUN_00935644(param_1,&PTR_s_cw_out_00cc4b88);
  if (lVar3 == 0) {
    iVar2 = 0;
  }
  else if ((*(byte *)(lVar3 + 0x28) >> 1 & 1) == 0) {
    iVar2 = 0;
    if ((*(byte *)(lVar3 + 0x28) & 1) == 0) {
      iVar2 = FUN_009377f0(lVar3,param_1,(long *)(lVar3 + 0x20),1);
      if (iVar2 != 0) {
        *(byte *)(lVar3 + 0x28) = *(byte *)(lVar3 + 0x28) | 2;
        plVar1 = (long *)*(long *)(lVar3 + 0x20);
        while (plVar1 != (long *)0x0) {
          lVar4 = *plVar1;
          FUN_00904534(plVar1 + 1);
          (*(code *)PTR_free_00cc4678)(plVar1);
          *(long *)(lVar3 + 0x20) = lVar4;
          plVar1 = (long *)lVar4;
        }
      }
    }
  }
  else {
    iVar2 = 0x17;
  }
  return iVar2;
}


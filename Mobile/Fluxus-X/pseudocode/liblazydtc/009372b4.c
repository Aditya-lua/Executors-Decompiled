/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009372b4
 */

int FUN_009372b4(long param_1)

{
  byte bVar1;
  long *plVar2;
  int iVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46b0)) {
    FUN_009050ec(param_1,"cw-out unpause");
  }
  lVar4 = FUN_00935644(param_1,&PTR_s_cw_out_00cc4b88);
  if (lVar4 == 0) {
    iVar3 = 0;
  }
  else {
    bVar5 = *(byte *)(lVar4 + 0x28);
    if ((bVar5 >> 1 & 1) == 0) {
      if ((bVar5 & 1) != 0) {
        bVar1 = bVar5 & 0xfe;
        bVar5 = 0;
        *(byte *)(lVar4 + 0x28) = bVar1;
      }
      iVar3 = 0;
      if ((bVar5 & 1) == 0) {
        iVar3 = FUN_009377f0(lVar4,param_1,(long *)(lVar4 + 0x20),0);
        if (iVar3 != 0) {
          *(byte *)(lVar4 + 0x28) = *(byte *)(lVar4 + 0x28) | 2;
          plVar2 = (long *)*(long *)(lVar4 + 0x20);
          while (plVar2 != (long *)0x0) {
            lVar6 = *plVar2;
            FUN_00904534(plVar2 + 1);
            (*(code *)PTR_free_00cc4678)(plVar2);
            *(long *)(lVar4 + 0x20) = lVar6;
            plVar2 = (long *)lVar6;
          }
        }
      }
    }
    else {
      iVar3 = 0x17;
    }
  }
  return iVar3;
}


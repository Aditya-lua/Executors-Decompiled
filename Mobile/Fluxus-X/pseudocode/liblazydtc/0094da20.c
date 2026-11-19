/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094da20
 */

void FUN_0094da20(long param_1,undefined1 *param_2)

{
  int iVar1;
  undefined *puVar2;
  long lVar3;
  long lVar4;
  
  lVar3 = *(long *)(param_1 + 0x20);
  *param_2 = 0;
  FUN_00908c4c(lVar3,0);
  *(undefined8 *)(lVar3 + 0x460) = 120000;
  *(undefined1 **)(lVar3 + 0x4b8) = &LAB_0094e3b8;
  *(undefined1 **)(lVar3 + 0x4c0) = &LAB_00950b80;
  if ((*(byte *)(*(long *)(lVar3 + 0x3a8) + 0x94) & 1) != 0) {
    iVar1 = FUN_00907508(param_1,0,1,param_2);
    if (iVar1 != 0) {
      return;
    }
    *(ulong *)(lVar3 + 0x3a0) = *(ulong *)(lVar3 + 0x3a0) | 0x80000;
  }
  FUN_00945250(lVar3 + 0x428);
  lVar4 = *(long *)(param_1 + 0x20);
  lVar3 = lVar4;
  if (((((ulong)*(byte *)(lVar4 + 0x536) != 1) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    if (lVar4 == 0) {
      puVar2 = &DAT_002c11b5;
    }
    else {
      puVar2 = (&PTR_DAT_00c508c0)[*(byte *)(lVar4 + 0x536)];
    }
    FUN_00905258(param_1,"[%s] -> [%s]",puVar2,"WAIT220");
    lVar3 = *(long *)(param_1 + 0x20);
  }
  *(undefined1 *)(lVar4 + 0x536) = 1;
  FUN_009450b4(param_1,lVar3 + 0x428,0,0);
  *param_2 = *(char *)(lVar3 + 0x536) == '\0';
  return;
}


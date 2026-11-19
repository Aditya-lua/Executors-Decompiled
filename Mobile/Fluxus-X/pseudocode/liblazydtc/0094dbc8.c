/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094dbc8
 */

int FUN_0094dbc8(long param_1,undefined8 param_2)

{
  char cVar1;
  int iVar2;
  undefined *puVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x20);
  iVar2 = FUN_009450b4(param_1,lVar4 + 0x428,0,0);
  cVar1 = *(char *)(lVar4 + 0x536);
  *(bool *)param_2 = cVar1 == '\0';
  if (iVar2 != 0) {
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
      return iVar2;
    }
    if ((*(long *)(param_1 + 0x12a0) != 0) && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1)) {
      return iVar2;
    }
    if (DAT_00cc46c0 < 1) {
      return iVar2;
    }
    if (*(long *)(param_1 + 0x20) == 0) {
      puVar3 = &DAT_002c11b5;
    }
    else {
      puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
    }
    FUN_00905258(param_1,"[%s] DO phase failed",puVar3);
    return iVar2;
  }
  if (cVar1 != '\0') {
    return 0;
  }
  lVar4 = *(long *)(param_1 + 0x20);
  if (*(int *)(*(long *)(param_1 + 0x1a0) + 0x10) == 0) {
    *(ulong *)(lVar4 + 0x3a0) = *(ulong *)(lVar4 + 0x3a0) | 0x2000;
  }
  else {
    FUN_00943194(param_1);
  }
  *(byte *)(lVar4 + 0x53a) = *(byte *)(lVar4 + 0x53a) | 4;
  if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) {
    return 0;
  }
  if (*(long *)(param_1 + 0x12a0) == 0) {
    if (DAT_00cc46c0 < 1) {
      return 0;
    }
  }
  else {
    if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) {
      return 0;
    }
    if (DAT_00cc46c0 < 1) {
      return 0;
    }
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    puVar3 = &DAT_002c11b5;
  }
  else {
    puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
  }
  FUN_00905258(param_1,"[%s] DO phase is complete2",puVar3);
  return 0;
}


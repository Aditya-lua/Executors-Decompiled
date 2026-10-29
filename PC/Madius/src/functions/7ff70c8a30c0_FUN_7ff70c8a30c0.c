/* 7ff70c8a30c0 FUN_7ff70c8a30c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8a30c0(uint *param_1,float param_2,char param_3)

{
  code *pcVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  short sVar6;
  uint uVar7;
  short sVar8;
  uint uVar9;
  int iVar10;
  int iVar11;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  uVar2 = 0;
  uVar5 = 0;
  uVar7 = 0;
  uVar9 = 0;
  if (param_3 == '\0') {
    uVar9 = (uint)*(ushort *)((longlong)param_1 + 0x12);
    uVar7 = (uint)(ushort)param_1[5];
    uVar5 = (uint)*(ushort *)((longlong)param_1 + 0x16);
    uVar2 = (uint)(ushort)param_1[6];
  }
  iVar4 = (int)param_2;
  *(short *)(param_1 + 2) = (short)iVar4;
  sVar6 = (short)uVar7;
  iVar11 = 0;
  if (sVar6 != 0) {
    iVar11 = iVar4;
  }
  sVar8 = (short)uVar9;
  iVar3 = 0;
  if (sVar8 == 0) {
    iVar11 = iVar3;
  }
  iVar10 = 0;
  if ((short)uVar5 != 0) {
    iVar10 = iVar4;
  }
  *(short *)(param_1 + 3) = (short)(iVar11 + uVar9);
  if (sVar6 == 0 && sVar8 == 0) {
    iVar10 = iVar3;
  }
  iVar11 = iVar10 + uVar7 + iVar11 + uVar9;
  if ((short)uVar2 == 0) {
    iVar4 = 0;
  }
  *(short *)((longlong)param_1 + 0xe) = (short)iVar11;
  if ((short)uVar5 == 0 && (sVar6 == 0 && sVar8 == 0)) {
    iVar4 = iVar3;
  }
  iVar11 = iVar4 + uVar5 + iVar11;
  *(short *)(param_1 + 4) = (short)iVar11;
  *(undefined8 *)((longlong)param_1 + 0x12) = 0;
  *param_1 = iVar11 + uVar2 & 0xffff;
  param_1[1] = 0;
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}



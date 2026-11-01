
void FUN_000f0c48(int *param_1,int param_2,int param_3)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  long lVar7;
  
  if ((0xffff < (uint)(param_1[0xd] + param_3)) && ((*(byte *)(param_1 + 0xc) >> 3 & 1) != 0)) {
    param_1[0x28] = param_1[8];
    func_0x000f0768(param_1);
  }
  lVar7 = *(long *)(param_1 + 2) + (long)*param_1 * 0x38;
  *(int *)(lVar7 + -0x18) = *(int *)(lVar7 + -0x18) + param_2;
  iVar5 = param_1[8];
  iVar6 = param_1[9];
  param_3 = iVar5 + param_3;
  if (iVar6 < param_3) {
    iVar2 = iVar6;
    if (iVar6 < 0) {
      iVar2 = iVar6 + 1;
    }
    iVar3 = 8;
    if (iVar6 != 0) {
      iVar3 = iVar6 + (iVar2 >> 1);
    }
    if (iVar3 <= param_3) {
      iVar3 = param_3;
    }
    lVar7 = func_0x000b810c((long)iVar3 * 0x14);
    if (*(long *)(param_1 + 10) != 0) {
      _memcpy(lVar7,*(long *)(param_1 + 10),(long)param_1[8] * 0x14);
      func_0x000b83d4(*(undefined8 *)(param_1 + 10));
    }
    *(long *)(param_1 + 10) = lVar7;
    param_1[9] = iVar3;
  }
  else {
    lVar7 = *(long *)(param_1 + 10);
  }
  param_1[8] = param_3;
  *(long *)(param_1 + 0x12) = lVar7 + (long)iVar5 * 0x14;
  iVar5 = param_1[4];
  iVar6 = param_1[5];
  uVar1 = iVar5 + param_2;
  if (iVar6 < (int)uVar1) {
    iVar2 = iVar6;
    if (iVar6 < 0) {
      iVar2 = iVar6 + 1;
    }
    uVar4 = 8;
    if (iVar6 != 0) {
      uVar4 = iVar6 + (iVar2 >> 1);
    }
    if ((int)uVar4 <= (int)uVar1) {
      uVar4 = uVar1;
    }
    lVar7 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar4 << 1);
    if (*(long *)(param_1 + 6) != 0) {
      _memcpy(lVar7,*(long *)(param_1 + 6),(long)param_1[4] << 1);
      func_0x000b83d4(*(undefined8 *)(param_1 + 6));
    }
    *(long *)(param_1 + 6) = lVar7;
    param_1[5] = uVar4;
  }
  else {
    lVar7 = *(long *)(param_1 + 6);
  }
  param_1[4] = uVar1;
  *(long *)(param_1 + 0x14) = lVar7 + (long)iVar5 * 2;
  return;
}


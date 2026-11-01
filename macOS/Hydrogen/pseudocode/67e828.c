
int FUN_0067e828(long param_1)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  long lVar9;
  int iVar10;
  uint uVar11;
  
  lVar4 = (**(code **)(param_1 + 0xa0))();
  lVar9 = 0;
  lVar2 = *(long *)(lVar4 + 0x18);
  iVar10 = (int)lVar2;
  iVar5 = iVar10 * -8;
  do {
    if (lVar2 + lVar9 == 0) {
      return 0;
    }
    lVar1 = lVar9 * 8;
    iVar5 = iVar5 + 8;
    lVar9 = lVar9 + -1;
  } while (*(long *)(*(long *)(lVar4 + 0x20) + lVar2 * 8 + -8 + lVar1) == 0);
  if (iVar10 + (int)lVar9 == -1) {
    return 0;
  }
  uVar7 = *(ulong *)(*(long *)(lVar4 + 0x20) + (ulong)(uint)(iVar10 + (int)lVar9) * 8);
  uVar6 = 0;
  if (uVar7 != 0) {
    uVar8 = 0;
    uVar11 = 0x40;
    do {
      uVar3 = uVar8 + uVar11 >> 1;
      uVar6 = uVar3;
      if (uVar7 >> ((ulong)uVar3 & 0x3f) != 0) {
        uVar6 = uVar11;
        uVar8 = uVar3;
      }
      uVar11 = uVar6;
    } while (8 < uVar6 - uVar8);
    uVar6 = uVar6 >> 3;
  }
  return uVar6 - iVar5;
}


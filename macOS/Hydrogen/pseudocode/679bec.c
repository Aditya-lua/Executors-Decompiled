
bool FUN_00679bec(long param_1)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  ulong uVar4;
  long *plVar5;
  long in_x9;
  ulong uVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  
  uVar6 = *(ulong *)(param_1 + 0x10);
  uVar4 = *(ulong *)(in_x9 + 200);
  uVar1 = uVar4;
  if (uVar6 <= uVar4) {
    uVar1 = uVar6;
  }
  if (uVar1 != 0) {
    plVar5 = *(long **)(param_1 + 0x18);
    plVar8 = plRam0000000000a3d0d0;
    uVar9 = uVar1;
    do {
      if (*plVar5 != *plVar8) {
        return false;
      }
      uVar9 = uVar9 - 1;
      plVar5 = plVar5 + 1;
      plVar8 = plVar8 + 1;
    } while (uVar9 != 0);
  }
  if (uVar4 < uVar6) {
    lVar7 = uVar6 - uVar1;
    plVar5 = (long *)(*(long *)(param_1 + 0x18) + uVar1 * 8);
    do {
      if (*plVar5 != 0) {
        return false;
      }
      lVar7 = lVar7 + -1;
      plVar5 = plVar5 + 1;
    } while (lVar7 != 0);
  }
  if (uVar4 <= uVar6) {
    return true;
  }
  lVar7 = ~uVar1 + uVar4;
  plVar5 = plRam0000000000a3d0d0 + uVar1;
  do {
    bVar3 = *plVar5 == 0;
    bVar2 = lVar7 != 0;
    lVar7 = lVar7 + -1;
    if (*plVar5 != 0) {
      return bVar3;
    }
    plVar5 = plVar5 + 1;
  } while (bVar2);
  return bVar3;
}


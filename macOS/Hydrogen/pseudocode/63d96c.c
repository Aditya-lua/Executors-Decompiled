
/* WARNING: Possible PIC construction at 0x0063d9b0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0063d9b4) */
/* WARNING: Removing unreachable block (ram,0x0063d9b8) */

bool FUN_0063d96c(int param_1)

{
  long lVar1;
  ulong uVar2;
  bool bVar3;
  bool bVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  long lVar8;
  long *plVar9;
  ulong uVar10;
  long unaff_x19;
  long unaff_x20;
  
  lVar1 = unaff_x19 + 200;
  if (param_1 == 0) {
    lVar1 = *(long *)(unaff_x19 + 0x150);
  }
  if ((*(char *)(unaff_x20 + 0x48) != '\0') && (*(char *)(lVar1 + 0x48) != '\0')) {
    return true;
  }
  if (*(char *)(unaff_x20 + 0x48) != '\0' || *(char *)(lVar1 + 0x48) != '\0') {
    return false;
  }
  uVar7 = *(ulong *)(unaff_x20 + 0x18);
  uVar5 = *(ulong *)(lVar1 + 0x18);
  uVar2 = uVar5;
  if (uVar7 <= uVar5) {
    uVar2 = uVar7;
  }
  if (uVar2 != 0) {
    plVar6 = *(long **)(unaff_x20 + 0x20);
    plVar9 = *(long **)(lVar1 + 0x20);
    uVar10 = uVar2;
    do {
      if (*plVar6 != *plVar9) {
        return false;
      }
      uVar10 = uVar10 - 1;
      plVar6 = plVar6 + 1;
      plVar9 = plVar9 + 1;
    } while (uVar10 != 0);
  }
  if (uVar5 < uVar7) {
    lVar8 = uVar7 - uVar2;
    plVar6 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar2 * 8);
    do {
      if (*plVar6 != 0) {
        return false;
      }
      lVar8 = lVar8 + -1;
      plVar6 = plVar6 + 1;
    } while (lVar8 != 0);
  }
  if (uVar5 <= uVar7) {
    return true;
  }
  lVar8 = ~uVar2 + uVar5;
  plVar6 = (long *)(*(long *)(lVar1 + 0x20) + uVar2 * 8);
  do {
    bVar4 = *plVar6 == 0;
    bVar3 = lVar8 != 0;
    lVar8 = lVar8 + -1;
    if (*plVar6 != 0) {
      return bVar4;
    }
    plVar6 = plVar6 + 1;
  } while (bVar3);
  return bVar4;
}


/* 7ff70c910550 FUN_7ff70c910550 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c910550(void)

{
  int iVar1;
  longlong lVar2;
  int *piVar3;
  longlong lVar4;
  int *piVar5;
  longlong lVar6;
  longlong lVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  longlong lStack_50;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  lVar4 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x26b0);
  iVar9 = *(int *)(_DAT_7ff70cc1a3c0 + 0x26a8);
  if (lVar4 == 0) {
    if (iVar9 == 0) {
      return;
    }
    lStack_50 = 0;
    lVar4 = 0;
    iVar8 = 0;
    piVar5 = (int *)0x0;
  }
  else {
    piVar5 = (int *)(lVar4 + 4);
    iVar8 = 0;
    do {
      if (*piVar5 != 0) {
        iVar8 = iVar8 + (short)piVar5[3] * 0x10 + 0x14;
      }
      piVar5 = (int *)((longlong)piVar5 + (longlong)piVar5[-1]);
    } while (piVar5 != (int *)(iVar9 + lVar4 + 4));
    if (iVar8 == iVar9) {
      return;
    }
    lStack_50 = 0;
    if (iVar8 < 1) {
      iVar8 = 0;
    }
    else {
      lStack_50 = FUN_7ff70c802100(iVar8);
      lVar4 = *(longlong *)(lVar2 + 0x26b0);
    }
    piVar5 = (int *)(lVar4 + 4);
    if (lVar4 == 0) {
      piVar5 = (int *)0x0;
    }
  }
  iVar9 = 0;
  lVar7 = lStack_50;
  while (piVar5 != (int *)0x0) {
    if (*piVar5 != 0) {
      iVar10 = (short)piVar5[3] * 0x10 + 0x18;
      iVar1 = iVar10 + iVar9;
      lVar6 = (longlong)iVar9;
      lVar4 = lVar7;
      if (iVar8 < iVar1) {
        if (iVar8 == 0) {
          iVar8 = 8;
        }
        else {
          iVar8 = iVar8 + iVar8 / 2;
        }
        if (iVar8 <= iVar1) {
          iVar8 = iVar1;
        }
        lVar4 = FUN_7ff70c802100((longlong)iVar8);
        lStack_50 = lVar4;
        if (lVar7 != 0) {
          FUN_7ff70cb12b60(lVar4,lVar7,lVar6);
          FUN_7ff70c802510(lVar7);
        }
      }
      *(int *)(lVar4 + lVar6) = iVar10;
      FUN_7ff70cb12b60(lStack_50 + lVar6 + 4,piVar5,(longlong)(short)piVar5[3] * 0x10 + 0x14);
      lVar4 = *(longlong *)(lVar2 + 0x26b0);
      lVar7 = lStack_50;
      iVar9 = iVar1;
    }
    piVar3 = (int *)((longlong)piVar5[-1] + (longlong)piVar5);
    piVar5 = (int *)0x0;
    if (piVar3 != (int *)(*(int *)(lVar2 + 0x26a8) + lVar4 + 4)) {
      piVar5 = piVar3;
    }
  }
  *(int *)(lVar2 + 0x26a8) = iVar9;
  *(int *)(lVar2 + 0x26ac) = iVar8;
  *(longlong *)(lVar2 + 0x26b0) = lVar7;
  if (lVar4 != 0) {
    FUN_7ff70c802510();
  }
  return;
}




void FUN_006b9098(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  long *plVar5;
  int *piVar6;
  int iVar7;
  undefined8 uVar8;
  long unaff_x19;
  int *unaff_x20;
  int unaff_w21;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  iVar4 = *unaff_x20;
  if (unaff_w21 == iVar4) {
    uVar1 = *(ulong *)(unaff_x19 + -0x10);
    plVar5 = (long *)*(long *)(unaff_x19 + -0x18);
    if (-1 < (char)*(byte *)(unaff_x19 + -1)) {
      uVar1 = (ulong)*(byte *)(unaff_x19 + -1);
      plVar5 = (long *)(unaff_x19 + -0x18);
    }
    uVar2 = *(ulong *)(unaff_x20 + 4);
    piVar6 = *(int **)(unaff_x20 + 2);
    if (-1 < (char)*(byte *)((long)unaff_x20 + 0x1f)) {
      uVar2 = (ulong)*(byte *)((long)unaff_x20 + 0x1f);
      piVar6 = unaff_x20 + 2;
    }
    uVar3 = uVar2;
    if (uVar1 <= uVar2) {
      uVar3 = uVar1;
    }
    iVar7 = _memcmp(plVar5,piVar6,uVar3);
    if (iVar7 == 0) {
      if (uVar2 <= uVar1) {
        return;
      }
    }
    else if (-1 < iVar7) {
      return;
    }
  }
  else if (iVar4 <= unaff_w21) {
    return;
  }
  *unaff_x20 = unaff_w21;
  *(int *)(unaff_x19 + -0x20) = iVar4;
  uVar8 = *(undefined8 *)(unaff_x20 + 6);
  uVar11 = *(undefined8 *)(unaff_x20 + 4);
  uVar9 = *(undefined8 *)(unaff_x20 + 2);
  uVar12 = *(undefined8 *)(unaff_x19 + -0x10);
  uVar10 = *(undefined8 *)(unaff_x19 + -0x18);
  *(undefined8 *)(unaff_x20 + 6) = *(undefined8 *)(unaff_x19 + -8);
  *(undefined8 *)(unaff_x20 + 4) = uVar12;
  *(undefined8 *)(unaff_x20 + 2) = uVar10;
  *(undefined8 *)(unaff_x19 + -0x10) = uVar11;
  *(undefined8 *)(unaff_x19 + -0x18) = uVar9;
  *(undefined8 *)(unaff_x19 + -8) = uVar8;
  return;
}


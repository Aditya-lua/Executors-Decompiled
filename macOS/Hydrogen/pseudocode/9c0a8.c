
void FUN_0009c0a8(long *param_1,int param_2)

{
  int iVar1;
  bool in_ZR;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *in_x9;
  long in_x10;
  int in_w11;
  long in_x12;
  int in_w13;
  int iVar5;
  ulong in_x14;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  long lVar10;
  int unaff_w21;
  
  uVar6 = in_x14 / 3;
  if (!in_ZR) {
    uVar6 = uVar6 + 1;
  }
  param_2 = in_w11 - param_2;
  if (2 < uVar6) {
    uVar7 = uVar6 + 1 & 0x7ffffffffffffffc;
    param_2 = param_2 + (int)uVar7 * 3;
    iVar5 = in_w13 - unaff_w21;
    lVar8 = unaff_x20 + -0x10000;
    uVar9 = uVar7;
    do {
      plVar4 = (long *)(lVar8 + in_x12);
      iVar1 = (int)in_x12 + iVar5;
      lVar3 = *(long *)((long)plVar4 + 3);
      lVar10 = *(long *)((long)plVar4 + 6);
      lVar2 = *(long *)((long)plVar4 + 9);
      *(int *)(unaff_x19 + ((ulong)(*plVar4 * in_x10) >> 0x32 & 0x3ffc)) = iVar1;
      *(int *)(unaff_x19 + ((ulong)(lVar3 * in_x10) >> 0x32 & 0x3ffc)) = iVar1 + 3;
      *(int *)(unaff_x19 + ((ulong)(lVar10 * in_x10) >> 0x32 & 0x3ffc)) = iVar1 + 6;
      *(int *)(unaff_x19 + ((ulong)(lVar2 * in_x10) >> 0x32 & 0x3ffc)) = iVar1 + 9;
      iVar5 = iVar5 + 0xc;
      lVar8 = lVar8 + 0xc;
      uVar9 = uVar9 - 4;
    } while (uVar9 != 0);
    param_1 = (long *)((long)param_1 + uVar7 * 3);
    if (uVar6 + 1 == uVar7) {
      return;
    }
  }
  do {
    plVar4 = (long *)((long)param_1 + 3);
    *(int *)(unaff_x19 + ((ulong)(*param_1 * in_x10) >> 0x32 & 0x3ffc)) = param_2;
    param_2 = param_2 + 3;
    param_1 = plVar4;
  } while (plVar4 <= in_x9);
  return;
}


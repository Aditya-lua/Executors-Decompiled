
ulong FUN_002a13b8(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  int iVar4;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long lVar5;
  long lVar6;
  uint uVar7;
  ulong unaff_x23;
  long lVar8;
  ulong uVar9;
  
  uVar3 = 0;
  lVar5 = unaff_x21 << (unaff_x20 & 0x3f);
  lVar8 = *unaff_x19;
  uVar9 = unaff_x23 + 1;
  do {
    lVar1 = (ulong)((int)uVar9 - 2) * 8;
    lVar6 = *(long *)(lVar8 + lVar1);
    lVar2 = func_0x00479b20(lVar6,uVar3,lVar5,0);
    uVar3 = lVar6 - lVar5 * lVar2;
    *(long *)(lVar8 + lVar1) = lVar2;
    uVar9 = uVar9 - 1;
  } while (1 < uVar9);
  uVar7 = (uint)unaff_x23;
  lVar5 = unaff_x23 * 8;
  do {
    lVar5 = lVar5 + -8;
    iVar4 = (int)unaff_x23;
    unaff_x23 = (ulong)(iVar4 - 1);
    if (iVar4 < 1) {
      *(uint *)(unaff_x19 + 1) = uVar7 & (int)uVar7 >> 0x1f;
      if (-1 < (int)uVar7) {
        *(undefined4 *)(unaff_x19 + 2) = 0;
      }
      goto LAB_002a1484;
    }
  } while (*(long *)(*unaff_x19 + lVar5) == 0);
  *(int *)(unaff_x19 + 1) = iVar4;
LAB_002a1484:
  return uVar3 >> (unaff_x20 & 0x3f);
}


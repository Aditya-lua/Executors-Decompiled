
bool FUN_006b2830(long param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  uint uVar1;
  long lVar2;
  uint extraout_w1;
  undefined4 extraout_var;
  ulong *puVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong uVar10;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong *unaff_x21;
  ulong *puVar11;
  ulong unaff_x22;
  long unaff_x23;
  ulong *puVar12;
  ulong *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  
  uVar4 = unaff_x25 + 1;
  if (uVar4 >> 0x3d != 0) {
    func_0x00017f90();
LAB_006b2960:
    lVar2 = func_0x00017514();
    uVar1 = param_4 + ~extraout_w1;
    if (uVar1 < 0x100) {
      lVar5 = CONCAT44(extraout_var,extraout_w1) * 4;
      *(uint *)(*(long *)(lVar2 + 0x28) + lVar5) =
           *(uint *)(*(long *)(lVar2 + 0x28) + lVar5) | uVar1 * 0x1000000;
    }
    return uVar1 < 0x100;
  }
  uVar6 = param_1 - (long)unaff_x24 >> 2;
  if (uVar6 <= uVar4) {
    uVar6 = uVar4;
  }
  if (0x7ffffffffffffff7 < (ulong)(param_1 - (long)unaff_x24)) {
    uVar6 = 0x1fffffffffffffff;
  }
  if (uVar6 == 0) {
    lVar2 = 0;
  }
  else {
    if (uVar6 >> 0x3d != 0) goto LAB_006b2960;
    lVar2 = __Znwm(uVar6 << 3);
  }
  puVar3 = (ulong *)(lVar2 + unaff_x25 * 8);
  puVar12 = puVar3 + 1;
  *puVar3 = unaff_x22 & 0xffffffff | unaff_x23 << 0x20;
  if ((long)unaff_x21 - (long)unaff_x24 == 0) goto LAB_006b2920;
  uVar4 = ((long)unaff_x21 - (long)unaff_x24) - 8;
  puVar11 = unaff_x21;
  if ((uVar4 < 0x58) || ((ulong)((long)unaff_x21 + (-unaff_x26 - lVar2)) < 0x40)) {
LAB_006b290c:
    do {
      puVar11 = puVar11 + -1;
      puVar3 = puVar3 + -1;
      *puVar3 = *puVar11;
    } while (puVar11 != unaff_x24);
  }
  else {
    uVar4 = (uVar4 >> 3) + 1;
    uVar7 = uVar4 & 0x3ffffffffffffff8;
    puVar11 = unaff_x21 + -uVar7;
    puVar3 = puVar3 + -uVar7;
    puVar8 = unaff_x21 + -4;
    puVar9 = (ulong *)(lVar2 + unaff_x25 * 8 + -0x20);
    uVar10 = uVar7;
    do {
      uVar15 = *puVar8;
      uVar14 = puVar8[3];
      uVar13 = puVar8[2];
      uVar19 = puVar8[-3];
      uVar18 = puVar8[-4];
      uVar17 = puVar8[-1];
      uVar16 = puVar8[-2];
      puVar9[1] = puVar8[1];
      *puVar9 = uVar15;
      puVar9[3] = uVar14;
      puVar9[2] = uVar13;
      puVar9[-3] = uVar19;
      puVar9[-4] = uVar18;
      puVar9[-1] = uVar17;
      puVar9[-2] = uVar16;
      puVar8 = puVar8 + -8;
      puVar9 = puVar9 + -8;
      uVar10 = uVar10 - 8;
    } while (uVar10 != 0);
    if (uVar4 != uVar7) goto LAB_006b290c;
  }
  unaff_x21 = (ulong *)*unaff_x20;
LAB_006b2920:
  *(ulong **)(unaff_x19 + 0x88) = puVar3;
  *(ulong **)(unaff_x19 + 0x90) = puVar12;
  *(ulong *)(unaff_x19 + 0x98) = lVar2 + uVar6 * 8;
  if (unaff_x21 != (ulong *)0x0) {
    __ZdlPv(unaff_x21);
  }
  *(ulong **)(unaff_x19 + 0x90) = puVar12;
  return true;
}


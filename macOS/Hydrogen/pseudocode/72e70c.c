
long FUN_0072e70c(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined4 *param_5)

{
  int iVar1;
  char cVar2;
  long lVar3;
  int *piVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  long *unaff_x20;
  long unaff_x21;
  undefined4 *unaff_x23;
  long lVar8;
  long unaff_x29;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 uStack0000000000000018;
  
  *(undefined8 *)(unaff_x29 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  lVar8 = *(long *)(param_1 + 0x10);
  *param_5 = 0;
  lVar3 = _recv(*(undefined4 *)(lVar8 + 0x98),param_3,param_4,0);
  iVar5 = (int)param_4;
  if (lVar3 == -1) {
    piVar4 = (int *)___error();
    iVar1 = *piVar4;
    if (iVar1 == 0x23 || iVar1 == 4) {
      *unaff_x23 = 0x51;
      goto joined_r0x0072e7b4;
    }
    iVar5 = 0x100;
    func_0x0077ea88(iVar1,&uStack0000000000000018);
    func_0x0073c9e4();
    *(int *)(unaff_x21 + 0xc54) = iVar1;
    *unaff_x23 = 0x38;
    cVar2 = *(char *)(unaff_x21 + 0xa1d);
  }
  else {
joined_r0x0072e7b4:
    if (unaff_x21 == 0) goto LAB_0072e7f4;
    cVar2 = *(char *)(unaff_x21 + 0xa1d);
  }
  if ((cVar2 < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x21 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
    iVar5 = 0x8ee126;
    func_0x0073cbdc();
  }
LAB_0072e7f4:
  if ((0 < lVar3) && ((*(byte *)(lVar8 + 0x134) & 1) == 0)) {
    auVar15 = func_0x00782d28();
    *(undefined1 (*) [16])(lVar8 + 0x120) = auVar15;
    *(byte *)(lVar8 + 0x134) = *(byte *)(lVar8 + 0x134) | 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return lVar3;
  }
  auVar15 = ___stack_chk_fail();
  lVar8 = auVar15._8_8_;
  lVar3 = auVar15._0_8_;
  if (iVar5 != 4) {
    if (iVar5 == 0x101) {
      *(undefined4 *)(*(long *)(lVar3 + 0x10) + 0x98) = 0xffffffff;
      return 0;
    }
    if (iVar5 != 0x100) {
      return 0;
    }
    lVar7 = *(long *)(lVar3 + 0x10);
    *(undefined4 *)(*(long *)(lVar3 + 0x18) + (long)*(int *)(lVar3 + 0x20) * 4 + 0x238) =
         *(undefined4 *)(lVar7 + 0x98);
    func_0x0072fadc(lVar7,lVar8);
    lVar6 = *(long *)(lVar3 + 0x18);
    if (*(int *)(lVar3 + 0x20) == 0) {
      uVar10 = *(undefined8 *)(lVar7 + 0xa4);
      uVar9 = *(undefined8 *)(lVar7 + 0x9c);
      uVar11 = *(undefined8 *)(lVar7 + 0xac);
      uVar13 = *(undefined8 *)(lVar7 + 0xc4);
      uVar12 = *(undefined8 *)(lVar7 + 0xbc);
      *(undefined8 *)(lVar6 + 0x130) = *(undefined8 *)(lVar7 + 0xb4);
      *(undefined8 *)(lVar6 + 0x128) = uVar11;
      *(undefined8 *)(lVar6 + 0x140) = uVar13;
      *(undefined8 *)(lVar6 + 0x138) = uVar12;
      *(undefined8 *)(lVar6 + 0x120) = uVar10;
      *(undefined8 *)(lVar6 + 0x118) = uVar9;
      uVar10 = *(undefined8 *)(lVar7 + 0xd4);
      uVar9 = *(undefined8 *)(lVar7 + 0xcc);
      uVar12 = *(undefined8 *)(lVar7 + 0xe4);
      uVar11 = *(undefined8 *)(lVar7 + 0xdc);
      uVar14 = *(undefined8 *)(lVar7 + 0xf4);
      uVar13 = *(undefined8 *)(lVar7 + 0xec);
      *(undefined4 *)(lVar6 + 0x178) = *(undefined4 *)(lVar7 + 0xfc);
      *(undefined8 *)(lVar6 + 0x160) = uVar12;
      *(undefined8 *)(lVar6 + 0x158) = uVar11;
      *(undefined8 *)(lVar6 + 0x170) = uVar14;
      *(undefined8 *)(lVar6 + 0x168) = uVar13;
      *(undefined8 *)(lVar6 + 0x150) = uVar10;
      *(undefined8 *)(lVar6 + 0x148) = uVar9;
      lVar6 = *(long *)(lVar3 + 0x18);
      iVar5 = *(int *)(lVar7 + 8);
      *(int **)(lVar6 + 0x50) = (int *)(lVar7 + 8);
      *(ulong *)(lVar6 + 0x398) =
           *(ulong *)(lVar6 + 0x398) & 0xfffffffffffff000 |
           *(ulong *)(lVar6 + 0x398) & 0x7ff | (ulong)(iVar5 == 0x1e) << 0xb;
    }
    else {
      uVar10 = *(undefined8 *)(lVar7 + 0xa4);
      uVar9 = *(undefined8 *)(lVar7 + 0x9c);
      uVar11 = *(undefined8 *)(lVar7 + 0xac);
      uVar13 = *(undefined8 *)(lVar7 + 0xc4);
      uVar12 = *(undefined8 *)(lVar7 + 0xbc);
      *(undefined8 *)(lVar6 + 0x194) = *(undefined8 *)(lVar7 + 0xb4);
      *(undefined8 *)(lVar6 + 0x18c) = uVar11;
      *(undefined8 *)(lVar6 + 0x1a4) = uVar13;
      *(undefined8 *)(lVar6 + 0x19c) = uVar12;
      *(undefined8 *)(lVar6 + 0x184) = uVar10;
      *(undefined8 *)(lVar6 + 0x17c) = uVar9;
      uVar10 = *(undefined8 *)(lVar7 + 0xd4);
      uVar9 = *(undefined8 *)(lVar7 + 0xcc);
      uVar12 = *(undefined8 *)(lVar7 + 0xe4);
      uVar11 = *(undefined8 *)(lVar7 + 0xdc);
      uVar14 = *(undefined8 *)(lVar7 + 0xf4);
      uVar13 = *(undefined8 *)(lVar7 + 0xec);
      *(undefined4 *)(lVar6 + 0x1dc) = *(undefined4 *)(lVar7 + 0xfc);
      *(undefined8 *)(lVar6 + 0x1c4) = uVar12;
      *(undefined8 *)(lVar6 + 0x1bc) = uVar11;
      *(undefined8 *)(lVar6 + 0x1d4) = uVar14;
      *(undefined8 *)(lVar6 + 0x1cc) = uVar13;
      *(undefined8 *)(lVar6 + 0x1b4) = uVar10;
      *(undefined8 *)(lVar6 + 0x1ac) = uVar9;
    }
    *(byte *)(lVar7 + 0x134) = *(byte *)(lVar7 + 0x134) | 0x10;
  }
  if (((*(byte *)(lVar3 + 0x24) & 1) == 0) || (*(int *)(lVar3 + 0x20) != 0)) {
    return 0;
  }
  lVar7 = *(long *)(lVar3 + 0x10);
  uVar10 = *(undefined8 *)(lVar7 + 0xa4);
  uVar9 = *(undefined8 *)(lVar7 + 0x9c);
  uVar12 = *(undefined8 *)(lVar7 + 0xb4);
  uVar11 = *(undefined8 *)(lVar7 + 0xac);
  uVar13 = *(undefined8 *)(lVar7 + 0xbc);
  *(undefined8 *)(&UNK_000013dc + lVar8) = *(undefined8 *)(lVar7 + 0xc4);
  *(undefined8 *)(&UNK_000013d4 + lVar8) = uVar13;
  *(undefined8 *)(&UNK_000013cc + lVar8) = uVar12;
  *(undefined8 *)(&UNK_000013c4 + lVar8) = uVar11;
  *(undefined8 *)(&UNK_000013bc + lVar8) = uVar10;
  *(undefined8 *)(&UNK_000013b4 + lVar8) = uVar9;
  uVar10 = *(undefined8 *)(lVar7 + 0xd4);
  uVar9 = *(undefined8 *)(lVar7 + 0xcc);
  uVar12 = *(undefined8 *)(lVar7 + 0xe4);
  uVar11 = *(undefined8 *)(lVar7 + 0xdc);
  uVar14 = *(undefined8 *)(lVar7 + 0xf4);
  uVar13 = *(undefined8 *)(lVar7 + 0xec);
  *(undefined4 *)(&UNK_00001414 + lVar8) = *(undefined4 *)(lVar7 + 0xfc);
  *(undefined8 *)(&UNK_0000140c + lVar8) = uVar14;
  *(undefined8 *)(&UNK_00001404 + lVar8) = uVar13;
  *(undefined8 *)(&UNK_000013fc + lVar8) = uVar12;
  *(undefined8 *)(&UNK_000013f4 + lVar8) = uVar11;
  *(undefined8 *)(&UNK_000013ec + lVar8) = uVar10;
  *(undefined8 *)(&UNK_000013e4 + lVar8) = uVar9;
  *(undefined4 *)(&UNK_00001418 + lVar8) = *(undefined4 *)(*(long *)(lVar3 + 0x18) + 0x518);
  return 0;
}


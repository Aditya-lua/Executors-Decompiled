
long FUN_0072e7bc(void)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined4 *unaff_x23;
  undefined4 unaff_w24;
  long unaff_x25;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  
  iVar3 = 0x100;
  func_0x0077ea88();
  func_0x0073c9e4();
  *(undefined4 *)(unaff_x21 + 0xc54) = unaff_w24;
  *unaff_x23 = 0x38;
  if ((*(char *)(unaff_x21 + 0xa1d) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x21 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x21 + 0x18) + 8))) && (0 < *(int *)(*unaff_x20 + 0xc))))) {
    iVar3 = 0x8ee126;
    func_0x0073cbdc();
  }
  if ((0 < unaff_x19) && ((*(byte *)(unaff_x25 + 0x134) & 1) == 0)) {
    auVar12 = func_0x00782d28();
    *(undefined1 (*) [16])(unaff_x25 + 0x120) = auVar12;
    *(byte *)(unaff_x25 + 0x134) = *(byte *)(unaff_x25 + 0x134) | 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return unaff_x19;
  }
  auVar12 = ___stack_chk_fail();
  lVar2 = auVar12._8_8_;
  lVar1 = auVar12._0_8_;
  if (iVar3 != 4) {
    if (iVar3 == 0x101) {
      *(undefined4 *)(*(long *)(lVar1 + 0x10) + 0x98) = 0xffffffff;
      return 0;
    }
    if (iVar3 != 0x100) {
      return 0;
    }
    lVar5 = *(long *)(lVar1 + 0x10);
    *(undefined4 *)(*(long *)(lVar1 + 0x18) + (long)*(int *)(lVar1 + 0x20) * 4 + 0x238) =
         *(undefined4 *)(lVar5 + 0x98);
    func_0x0072fadc(lVar5,lVar2);
    lVar4 = *(long *)(lVar1 + 0x18);
    if (*(int *)(lVar1 + 0x20) == 0) {
      uVar7 = *(undefined8 *)(lVar5 + 0xa4);
      uVar6 = *(undefined8 *)(lVar5 + 0x9c);
      uVar8 = *(undefined8 *)(lVar5 + 0xac);
      uVar10 = *(undefined8 *)(lVar5 + 0xc4);
      uVar9 = *(undefined8 *)(lVar5 + 0xbc);
      *(undefined8 *)(lVar4 + 0x130) = *(undefined8 *)(lVar5 + 0xb4);
      *(undefined8 *)(lVar4 + 0x128) = uVar8;
      *(undefined8 *)(lVar4 + 0x140) = uVar10;
      *(undefined8 *)(lVar4 + 0x138) = uVar9;
      *(undefined8 *)(lVar4 + 0x120) = uVar7;
      *(undefined8 *)(lVar4 + 0x118) = uVar6;
      uVar7 = *(undefined8 *)(lVar5 + 0xd4);
      uVar6 = *(undefined8 *)(lVar5 + 0xcc);
      uVar9 = *(undefined8 *)(lVar5 + 0xe4);
      uVar8 = *(undefined8 *)(lVar5 + 0xdc);
      uVar11 = *(undefined8 *)(lVar5 + 0xf4);
      uVar10 = *(undefined8 *)(lVar5 + 0xec);
      *(undefined4 *)(lVar4 + 0x178) = *(undefined4 *)(lVar5 + 0xfc);
      *(undefined8 *)(lVar4 + 0x160) = uVar9;
      *(undefined8 *)(lVar4 + 0x158) = uVar8;
      *(undefined8 *)(lVar4 + 0x170) = uVar11;
      *(undefined8 *)(lVar4 + 0x168) = uVar10;
      *(undefined8 *)(lVar4 + 0x150) = uVar7;
      *(undefined8 *)(lVar4 + 0x148) = uVar6;
      lVar4 = *(long *)(lVar1 + 0x18);
      iVar3 = *(int *)(lVar5 + 8);
      *(int **)(lVar4 + 0x50) = (int *)(lVar5 + 8);
      *(ulong *)(lVar4 + 0x398) =
           *(ulong *)(lVar4 + 0x398) & 0xfffffffffffff000 |
           *(ulong *)(lVar4 + 0x398) & 0x7ff | (ulong)(iVar3 == 0x1e) << 0xb;
    }
    else {
      uVar7 = *(undefined8 *)(lVar5 + 0xa4);
      uVar6 = *(undefined8 *)(lVar5 + 0x9c);
      uVar8 = *(undefined8 *)(lVar5 + 0xac);
      uVar10 = *(undefined8 *)(lVar5 + 0xc4);
      uVar9 = *(undefined8 *)(lVar5 + 0xbc);
      *(undefined8 *)(lVar4 + 0x194) = *(undefined8 *)(lVar5 + 0xb4);
      *(undefined8 *)(lVar4 + 0x18c) = uVar8;
      *(undefined8 *)(lVar4 + 0x1a4) = uVar10;
      *(undefined8 *)(lVar4 + 0x19c) = uVar9;
      *(undefined8 *)(lVar4 + 0x184) = uVar7;
      *(undefined8 *)(lVar4 + 0x17c) = uVar6;
      uVar7 = *(undefined8 *)(lVar5 + 0xd4);
      uVar6 = *(undefined8 *)(lVar5 + 0xcc);
      uVar9 = *(undefined8 *)(lVar5 + 0xe4);
      uVar8 = *(undefined8 *)(lVar5 + 0xdc);
      uVar11 = *(undefined8 *)(lVar5 + 0xf4);
      uVar10 = *(undefined8 *)(lVar5 + 0xec);
      *(undefined4 *)(lVar4 + 0x1dc) = *(undefined4 *)(lVar5 + 0xfc);
      *(undefined8 *)(lVar4 + 0x1c4) = uVar9;
      *(undefined8 *)(lVar4 + 0x1bc) = uVar8;
      *(undefined8 *)(lVar4 + 0x1d4) = uVar11;
      *(undefined8 *)(lVar4 + 0x1cc) = uVar10;
      *(undefined8 *)(lVar4 + 0x1b4) = uVar7;
      *(undefined8 *)(lVar4 + 0x1ac) = uVar6;
    }
    *(byte *)(lVar5 + 0x134) = *(byte *)(lVar5 + 0x134) | 0x10;
  }
  if (((*(byte *)(lVar1 + 0x24) & 1) == 0) || (*(int *)(lVar1 + 0x20) != 0)) {
    return 0;
  }
  lVar5 = *(long *)(lVar1 + 0x10);
  uVar7 = *(undefined8 *)(lVar5 + 0xa4);
  uVar6 = *(undefined8 *)(lVar5 + 0x9c);
  uVar9 = *(undefined8 *)(lVar5 + 0xb4);
  uVar8 = *(undefined8 *)(lVar5 + 0xac);
  uVar10 = *(undefined8 *)(lVar5 + 0xbc);
  *(undefined8 *)(&UNK_000013dc + lVar2) = *(undefined8 *)(lVar5 + 0xc4);
  *(undefined8 *)(&UNK_000013d4 + lVar2) = uVar10;
  *(undefined8 *)(&UNK_000013cc + lVar2) = uVar9;
  *(undefined8 *)(&UNK_000013c4 + lVar2) = uVar8;
  *(undefined8 *)(&UNK_000013bc + lVar2) = uVar7;
  *(undefined8 *)(&UNK_000013b4 + lVar2) = uVar6;
  uVar7 = *(undefined8 *)(lVar5 + 0xd4);
  uVar6 = *(undefined8 *)(lVar5 + 0xcc);
  uVar9 = *(undefined8 *)(lVar5 + 0xe4);
  uVar8 = *(undefined8 *)(lVar5 + 0xdc);
  uVar11 = *(undefined8 *)(lVar5 + 0xf4);
  uVar10 = *(undefined8 *)(lVar5 + 0xec);
  *(undefined4 *)(&UNK_00001414 + lVar2) = *(undefined4 *)(lVar5 + 0xfc);
  *(undefined8 *)(&UNK_0000140c + lVar2) = uVar11;
  *(undefined8 *)(&UNK_00001404 + lVar2) = uVar10;
  *(undefined8 *)(&UNK_000013fc + lVar2) = uVar9;
  *(undefined8 *)(&UNK_000013f4 + lVar2) = uVar8;
  *(undefined8 *)(&UNK_000013ec + lVar2) = uVar7;
  *(undefined8 *)(&UNK_000013e4 + lVar2) = uVar6;
  *(undefined4 *)(&UNK_00001418 + lVar2) = *(undefined4 *)(*(long *)(lVar1 + 0x18) + 0x518);
  return 0;
}


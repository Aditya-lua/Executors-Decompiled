
long FUN_0072e6b8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined4 *param_5)

{
  int iVar1;
  char cVar2;
  bool in_ZR;
  long *plVar3;
  long lVar4;
  int *piVar5;
  long lVar6;
  int iVar7;
  long lVar8;
  long unaff_x23;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  undefined1 auStack_158 [256];
  long lStack_58;
  
  if (in_ZR) {
    return unaff_x23;
  }
  auVar16 = ___stack_chk_fail();
  lVar6 = auVar16._8_8_;
  plVar3 = auVar16._0_8_;
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar9 = plVar3[2];
  *param_5 = 0;
  lVar4 = _recv(*(undefined4 *)(lVar9 + 0x98),param_3,param_4,0);
  iVar7 = (int)param_4;
  if (lVar4 == -1) {
    piVar5 = (int *)___error();
    iVar1 = *piVar5;
    if (iVar1 == 0x23 || iVar1 == 4) {
      *param_5 = 0x51;
      goto joined_r0x0072e7b4;
    }
    iVar7 = 0x100;
    func_0x0077ea88(iVar1,auStack_158);
    func_0x0073c9e4(lVar6,"Recv failure: %s");
    *(int *)(lVar6 + 0xc54) = iVar1;
    *param_5 = 0x38;
    cVar2 = *(char *)(lVar6 + 0xa1d);
  }
  else {
joined_r0x0072e7b4:
    if (lVar6 == 0) goto code_r0x0072e7f4;
    cVar2 = *(char *)(lVar6 + 0xa1d);
  }
  if ((cVar2 < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar6 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar6 + 0x18) + 8))) && (0 < *(int *)(*plVar3 + 0xc))))) {
    iVar7 = 0x8ee126;
    func_0x0073cbdc(lVar6,plVar3);
  }
code_r0x0072e7f4:
  if ((0 < lVar4) && ((*(byte *)(lVar9 + 0x134) & 1) == 0)) {
    auVar16 = func_0x00782d28();
    *(undefined1 (*) [16])(lVar9 + 0x120) = auVar16;
    *(byte *)(lVar9 + 0x134) = *(byte *)(lVar9 + 0x134) | 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return lVar4;
  }
  auVar16 = ___stack_chk_fail();
  lVar6 = auVar16._8_8_;
  lVar4 = auVar16._0_8_;
  if (iVar7 != 4) {
    if (iVar7 == 0x101) {
      *(undefined4 *)(*(long *)(lVar4 + 0x10) + 0x98) = 0xffffffff;
      return 0;
    }
    if (iVar7 != 0x100) {
      return 0;
    }
    lVar9 = *(long *)(lVar4 + 0x10);
    *(undefined4 *)(*(long *)(lVar4 + 0x18) + (long)*(int *)(lVar4 + 0x20) * 4 + 0x238) =
         *(undefined4 *)(lVar9 + 0x98);
    func_0x0072fadc(lVar9,lVar6);
    lVar8 = *(long *)(lVar4 + 0x18);
    if (*(int *)(lVar4 + 0x20) == 0) {
      uVar11 = *(undefined8 *)(lVar9 + 0xa4);
      uVar10 = *(undefined8 *)(lVar9 + 0x9c);
      uVar12 = *(undefined8 *)(lVar9 + 0xac);
      uVar14 = *(undefined8 *)(lVar9 + 0xc4);
      uVar13 = *(undefined8 *)(lVar9 + 0xbc);
      *(undefined8 *)(lVar8 + 0x130) = *(undefined8 *)(lVar9 + 0xb4);
      *(undefined8 *)(lVar8 + 0x128) = uVar12;
      *(undefined8 *)(lVar8 + 0x140) = uVar14;
      *(undefined8 *)(lVar8 + 0x138) = uVar13;
      *(undefined8 *)(lVar8 + 0x120) = uVar11;
      *(undefined8 *)(lVar8 + 0x118) = uVar10;
      uVar11 = *(undefined8 *)(lVar9 + 0xd4);
      uVar10 = *(undefined8 *)(lVar9 + 0xcc);
      uVar13 = *(undefined8 *)(lVar9 + 0xe4);
      uVar12 = *(undefined8 *)(lVar9 + 0xdc);
      uVar15 = *(undefined8 *)(lVar9 + 0xf4);
      uVar14 = *(undefined8 *)(lVar9 + 0xec);
      *(undefined4 *)(lVar8 + 0x178) = *(undefined4 *)(lVar9 + 0xfc);
      *(undefined8 *)(lVar8 + 0x160) = uVar13;
      *(undefined8 *)(lVar8 + 0x158) = uVar12;
      *(undefined8 *)(lVar8 + 0x170) = uVar15;
      *(undefined8 *)(lVar8 + 0x168) = uVar14;
      *(undefined8 *)(lVar8 + 0x150) = uVar11;
      *(undefined8 *)(lVar8 + 0x148) = uVar10;
      lVar8 = *(long *)(lVar4 + 0x18);
      iVar7 = *(int *)(lVar9 + 8);
      *(int **)(lVar8 + 0x50) = (int *)(lVar9 + 8);
      *(ulong *)(lVar8 + 0x398) =
           *(ulong *)(lVar8 + 0x398) & 0xfffffffffffff000 |
           *(ulong *)(lVar8 + 0x398) & 0x7ff | (ulong)(iVar7 == 0x1e) << 0xb;
    }
    else {
      uVar11 = *(undefined8 *)(lVar9 + 0xa4);
      uVar10 = *(undefined8 *)(lVar9 + 0x9c);
      uVar12 = *(undefined8 *)(lVar9 + 0xac);
      uVar14 = *(undefined8 *)(lVar9 + 0xc4);
      uVar13 = *(undefined8 *)(lVar9 + 0xbc);
      *(undefined8 *)(lVar8 + 0x194) = *(undefined8 *)(lVar9 + 0xb4);
      *(undefined8 *)(lVar8 + 0x18c) = uVar12;
      *(undefined8 *)(lVar8 + 0x1a4) = uVar14;
      *(undefined8 *)(lVar8 + 0x19c) = uVar13;
      *(undefined8 *)(lVar8 + 0x184) = uVar11;
      *(undefined8 *)(lVar8 + 0x17c) = uVar10;
      uVar11 = *(undefined8 *)(lVar9 + 0xd4);
      uVar10 = *(undefined8 *)(lVar9 + 0xcc);
      uVar13 = *(undefined8 *)(lVar9 + 0xe4);
      uVar12 = *(undefined8 *)(lVar9 + 0xdc);
      uVar15 = *(undefined8 *)(lVar9 + 0xf4);
      uVar14 = *(undefined8 *)(lVar9 + 0xec);
      *(undefined4 *)(lVar8 + 0x1dc) = *(undefined4 *)(lVar9 + 0xfc);
      *(undefined8 *)(lVar8 + 0x1c4) = uVar13;
      *(undefined8 *)(lVar8 + 0x1bc) = uVar12;
      *(undefined8 *)(lVar8 + 0x1d4) = uVar15;
      *(undefined8 *)(lVar8 + 0x1cc) = uVar14;
      *(undefined8 *)(lVar8 + 0x1b4) = uVar11;
      *(undefined8 *)(lVar8 + 0x1ac) = uVar10;
    }
    *(byte *)(lVar9 + 0x134) = *(byte *)(lVar9 + 0x134) | 0x10;
  }
  if (((*(byte *)(lVar4 + 0x24) & 1) == 0) || (*(int *)(lVar4 + 0x20) != 0)) {
    return 0;
  }
  lVar9 = *(long *)(lVar4 + 0x10);
  uVar11 = *(undefined8 *)(lVar9 + 0xa4);
  uVar10 = *(undefined8 *)(lVar9 + 0x9c);
  uVar13 = *(undefined8 *)(lVar9 + 0xb4);
  uVar12 = *(undefined8 *)(lVar9 + 0xac);
  uVar14 = *(undefined8 *)(lVar9 + 0xbc);
  *(undefined8 *)(&UNK_000013dc + lVar6) = *(undefined8 *)(lVar9 + 0xc4);
  *(undefined8 *)(&UNK_000013d4 + lVar6) = uVar14;
  *(undefined8 *)(&UNK_000013cc + lVar6) = uVar13;
  *(undefined8 *)(&UNK_000013c4 + lVar6) = uVar12;
  *(undefined8 *)(&UNK_000013bc + lVar6) = uVar11;
  *(undefined8 *)(&UNK_000013b4 + lVar6) = uVar10;
  uVar11 = *(undefined8 *)(lVar9 + 0xd4);
  uVar10 = *(undefined8 *)(lVar9 + 0xcc);
  uVar13 = *(undefined8 *)(lVar9 + 0xe4);
  uVar12 = *(undefined8 *)(lVar9 + 0xdc);
  uVar15 = *(undefined8 *)(lVar9 + 0xf4);
  uVar14 = *(undefined8 *)(lVar9 + 0xec);
  *(undefined4 *)(&UNK_00001414 + lVar6) = *(undefined4 *)(lVar9 + 0xfc);
  *(undefined8 *)(&UNK_0000140c + lVar6) = uVar15;
  *(undefined8 *)(&UNK_00001404 + lVar6) = uVar14;
  *(undefined8 *)(&UNK_000013fc + lVar6) = uVar13;
  *(undefined8 *)(&UNK_000013f4 + lVar6) = uVar12;
  *(undefined8 *)(&UNK_000013ec + lVar6) = uVar11;
  *(undefined8 *)(&UNK_000013e4 + lVar6) = uVar10;
  *(undefined4 *)(&UNK_00001418 + lVar6) = *(undefined4 *)(*(long *)(lVar4 + 0x18) + 0x518);
  return 0;
}


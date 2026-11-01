
/* WARNING: Removing unreachable block (ram,0x006effa8) */
/* WARNING: Removing unreachable block (ram,0x006eff70) */
/* WARNING: Removing unreachable block (ram,0x006efff0) */

ulong FUN_006e8d34(undefined8 param_1)

{
  ulong uVar1;
  uint uVar2;
  undefined1 uVar3;
  short sVar4;
  bool bVar5;
  undefined1 auVar6 [16];
  undefined1 *puVar7;
  bool bVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined *puVar17;
  ulong uVar18;
  ulong uVar19;
  char cVar20;
  ulong uVar21;
  int iVar22;
  long lVar23;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar24;
  double dVar25;
  double dVar26;
  double dVar27;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined8 in_stack_00000000;
  undefined *puStack_8;
  
  auVar6._8_8_ = unaff_x21;
  auVar6._0_8_ = unaff_x19;
  uVar10 = func_0x006e21f8(param_1,0xffffffff);
  if ((int)uVar10 != 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return uVar10;
    }
    ___stack_chk_fail();
    func_0x006e63b0();
  }
  auVar28 = func_0x006e644c();
  puStack_8 = (undefined *)0x6e8db8;
  if (cRam0000000000a336b8 == '\0') {
    uVar24 = 0xffffffff;
    puStack_8 = (undefined *)0x6e8db8;
    goto code_r0x006ee550;
  }
  iVar9 = func_0x006eefb8(auVar28._0_8_);
  uVar10 = (ulong)(iVar9 != 0);
  puVar7 = (undefined1 *)register0x00000008;
  uVar14 = 0xffffffff;
  while( true ) {
    lVar16 = auVar28._8_8_;
    lVar11 = auVar28._0_8_;
    register0x00000008 = (BADSPACEBASE *)(puVar7 + -0x60);
    *(undefined8 *)(puVar7 + -0x60) = unaff_x28;
    *(undefined8 *)(puVar7 + -0x58) = unaff_x27;
    *(undefined8 *)(puVar7 + -0x50) = unaff_x26;
    *(undefined8 *)(puVar7 + -0x48) = unaff_x25;
    *(undefined8 *)(puVar7 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar7 + -0x38) = unaff_x23;
    *(ulong *)(puVar7 + -0x30) = unaff_x22;
    *(long *)(puVar7 + -0x28) = auVar6._8_8_;
    *(undefined8 *)(puVar7 + -0x20) = unaff_x20;
    *(long *)(puVar7 + -0x18) = auVar6._0_8_;
    *(undefined1 **)(puVar7 + -0x10) = unaff_x29;
    *(undefined **)(puVar7 + -8) = puStack_8;
    unaff_x29 = puVar7 + -0x10;
    sVar4 = *(short *)(lVar11 + 0x52);
    *(short *)(lVar11 + 0x52) = sVar4 + 1;
    if ((ushort)(sVar4 + 1U) < 200) break;
    uVar24 = uVar14;
    if ((ushort)(sVar4 + 1U) == 200) {
      func_0x006eceb0(lVar11,"C stack overflow");
    }
    else if ((ushort)(sVar4 + 1U) < 0xe1) break;
    puStack_8 = &LAB_006ee550;
    auVar29 = func_0x006edf6c(lVar11,5);
    unaff_x20 = uVar14;
    unaff_x22 = uVar10;
    auVar6 = auVar28;
    auVar28 = auVar29;
code_r0x006ee550:
    uVar10 = 0;
    puVar7 = (undefined1 *)register0x00000008;
    uVar14 = uVar24;
  }
  lVar23 = *(long *)(lVar11 + 0x20) - *(long *)(lVar11 + 0x40);
  if (((lVar23 == 0) ||
      (lVar15 = **(long **)(*(long *)(lVar11 + 0x20) + 8), *(char *)(lVar15 + 3) == '\0')) ||
     (*(long *)(lVar15 + 0x20) == -0x20 - lVar15)) {
    bVar5 = false;
  }
  else {
    *(short *)(lVar11 + 0x50) = *(short *)(lVar11 + 0x50) + 1;
    bVar5 = true;
  }
  lVar15 = *(long *)(lVar11 + 0x30);
  uVar12 = func_0x00700770(lVar11,lVar16,uVar14);
  iVar9 = (int)uVar14;
  if ((int)uVar12 == 0) {
    *(uint *)(*(long *)(lVar11 + 0x20) + 0x24) = *(uint *)(*(long *)(lVar11 + 0x20) + 0x24) | 1;
    cVar20 = *(char *)(lVar11 + 5);
    *(undefined1 *)(lVar11 + 5) = 1;
    if ((*(byte *)(lVar11 + 1) >> 2 & 1) != 0) {
      uVar12 = func_0x006f0ed4(lVar11,lVar11,lVar11 + 0x68);
    }
    if ((cRam0000000000a336b8 == '\0') || ((int)uVar10 == 0)) {
      uVar12 = (*pcRam0000000000a401e0)(lVar11);
    }
    else {
      *(undefined1 *)(lVar11 + 3) = 0x7f;
    }
    if (cVar20 != '\0') goto code_r0x006ee430;
    *(undefined1 *)(lVar11 + 5) = 0;
    lVar16 = lVar16 - lVar15;
    cVar20 = *(char *)(lVar11 + 3);
    if (cRam0000000000a336b8 == '\0') goto code_r0x006ee40c;
code_r0x006ee440:
    bVar8 = true;
    if (((cVar20 == '\x01') || (cVar20 == '\x06')) || (cVar20 == '\x7f')) goto code_r0x006ee45c;
    bVar8 = false;
    if (bVar5) {
      *(short *)(lVar11 + 0x50) = *(short *)(lVar11 + 0x50) + -1;
    }
code_r0x006ee4bc:
    if ((iVar9 != -1) && (!bVar8)) {
      *(long *)(lVar11 + 8) = *(long *)(lVar11 + 0x30) + lVar16 + (long)iVar9 * 0x10;
    }
  }
  else {
code_r0x006ee430:
    lVar16 = lVar16 - lVar15;
    cVar20 = *(char *)(lVar11 + 3);
    if (cRam0000000000a336b8 != '\0') goto code_r0x006ee440;
code_r0x006ee40c:
    bVar8 = cVar20 == '\x01' || cVar20 == '\x06';
code_r0x006ee45c:
    if ((!bVar5) || (*(short *)(lVar11 + 0x50) = *(short *)(lVar11 + 0x50) + -1, !bVar8))
    goto code_r0x006ee4bc;
    iVar22 = 0;
    if (iVar9 != -1) {
      iVar22 = iVar9;
    }
    *(long *)(*(long *)(lVar11 + 0x40) + lVar23 + 0x10) =
         *(long *)(lVar11 + 0x30) + lVar16 + (long)iVar22 * 0x10;
  }
  *(short *)(lVar11 + 0x52) = *(short *)(lVar11 + 0x52) + -1;
  if (*(ulong *)(*(long *)(lVar11 + 0x18) + 0x48) < *(ulong *)(*(long *)(lVar11 + 0x18) + 0x40)) {
    return uVar12;
  }
  *(undefined8 *)(puVar7 + -0x60) = unaff_d9;
  *(undefined8 *)(puVar7 + -0x58) = unaff_d8;
  *(undefined8 *)(puVar7 + -0x50) = *(undefined8 *)(puVar7 + -0x50);
  *(undefined8 *)(puVar7 + -0x48) = *(undefined8 *)(puVar7 + -0x48);
  *(undefined8 *)(puVar7 + -0x40) = *(undefined8 *)(puVar7 + -0x40);
  *(undefined8 *)(puVar7 + -0x38) = *(undefined8 *)(puVar7 + -0x38);
  *(undefined8 *)(puVar7 + -0x30) = *(undefined8 *)(puVar7 + -0x30);
  *(undefined8 *)(puVar7 + -0x28) = *(undefined8 *)(puVar7 + -0x28);
  *(undefined8 *)(puVar7 + -0x20) = *(undefined8 *)(puVar7 + -0x20);
  *(undefined8 *)(puVar7 + -0x18) = *(undefined8 *)(puVar7 + -0x18);
  *(undefined8 *)(puVar7 + -0x10) = *(undefined8 *)(puVar7 + -0x10);
  *(undefined8 *)(puVar7 + -8) = *(undefined8 *)(puVar7 + -8);
  lVar15 = *(long *)(lVar11 + 0x18);
  iVar9 = *(int *)(lVar15 + 0x54);
  iVar22 = *(int *)(lVar15 + 0x58);
  lVar16 = *(long *)(lVar15 + 0x40);
  lVar23 = *(long *)(lVar15 + 0x48);
  if (*(code **)(lVar15 + 0x4e0) == (code *)0x0) {
    cVar20 = *(char *)(lVar15 + 0x21);
  }
  else {
    (**(code **)(lVar15 + 0x4e0))(lVar11,0);
    cVar20 = *(char *)(lVar15 + 0x21);
  }
  if (cVar20 == '\0') {
    uVar24 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001a00 + lVar15) = uVar24;
    if (*(char *)(lVar15 + 0x21) == '\0') {
      dVar25 = (double)func_0x006f5d58();
      *(double *)(&UNK_00001b20 + lVar15) = dVar25;
      *(double *)(&UNK_00001b18 + lVar15) = dVar25 - *(double *)(&UNK_00001a50 + lVar15);
    }
  }
  dVar25 = (double)func_0x006f5d58();
  uVar3 = *(undefined1 *)(lVar15 + 0x21);
  lVar13 = func_0x006f0258(lVar11,(long)((iVar9 * iVar22) / 100));
  dVar26 = (double)func_0x006f5d58();
  dVar26 = dVar26 - dVar25;
  switch(uVar3) {
  case 0:
    if (*(char *)(lVar15 + 0x21) != '\x01') goto code_r0x006effdc;
    *(double *)(&UNK_00001b30 + lVar15) = dVar26 + *(double *)(&UNK_00001b30 + lVar15);
    break;
  case 1:
  case 2:
    *(double *)(&UNK_00001b30 + lVar15) = dVar26 + *(double *)(&UNK_00001b30 + lVar15);
    *(long *)(&UNK_00001b50 + lVar15) = *(long *)(&UNK_00001b50 + lVar15) + lVar13;
    break;
  case 3:
    *(double *)(&UNK_00001b68 + lVar15) = dVar26 + *(double *)(&UNK_00001b68 + lVar15);
    goto code_r0x006effdc;
  case 4:
    *(double *)(&UNK_00001b90 + lVar15) = dVar26 + *(double *)(&UNK_00001b90 + lVar15);
    *(long *)(&UNK_00001bb0 + lVar15) = *(long *)(&UNK_00001bb0 + lVar15) + lVar13;
    puVar17 = &UNK_00001b98;
    goto code_r0x006effcc;
  default:
    goto code_r0x006effdc;
  }
  puVar17 = &UNK_00001b38;
code_r0x006effcc:
  *(double *)(puVar17 + lVar15) = dVar26 + *(double *)(puVar17 + lVar15);
code_r0x006effdc:
  *(double *)(&UNK_00001a20 + lVar15) = dVar26 + *(double *)(&UNK_00001a20 + lVar15);
  *(long *)(&UNK_00001bb8 + lVar15) = *(long *)(&UNK_00001bb8 + lVar15) + lVar13;
  uVar10 = *(ulong *)(lVar15 + 0x48);
  uVar12 = 0;
  if ((long)*(int *)(lVar15 + 0x54) != 0) {
    uVar12 = (ulong)(lVar13 * 100) / (ulong)(long)*(int *)(lVar15 + 0x54);
  }
  if (*(char *)(lVar15 + 0x21) == '\0') {
    uVar19 = (uVar10 / 100) * (long)*(int *)(lVar15 + 0x50);
    dVar25 = *(double *)(&UNK_00001a08 + lVar15);
    dVar26 = dVar25 - *(double *)(&UNK_00001a10 + lVar15);
    uVar18 = uVar19;
    if (0.001 <= dVar26) {
      uVar2 = *(uint *)(&UNK_000019e0 + lVar15);
      lVar16 = lVar15 + ((ulong)uVar2 & 0x1f) * 4;
      lVar23 = *(long *)(&UNK_000019e8 + lVar15);
      lVar13 = *(long *)(&UNK_000019f0 + lVar15);
      dVar27 = *(double *)(&UNK_00001a00 + lVar15);
      iVar9 = *(int *)(&UNK_00001960 + lVar16);
      iVar22 = (int)((ulong)(lVar23 - *(long *)(&UNK_000019f8 + lVar15)) >> 10);
      *(int *)(&UNK_00001960 + lVar16) = iVar22;
      iVar9 = *(int *)(&UNK_000019e4 + lVar15) + (iVar22 - iVar9);
      *(int *)(&UNK_000019e4 + lVar15) = iVar9;
      *(uint *)(&UNK_000019e0 + lVar15) = uVar2 + 1;
      uVar21 = (uVar19 - (long)(((double)iVar22 * 0.405 + (double)iVar9 * 0.24300000000000002) *
                               1024.0)) -
               (long)((dVar25 - dVar27) * ((double)(ulong)(lVar23 - lVar13) / dVar26));
      uVar1 = uVar21;
      if ((long)uVar19 <= (long)uVar21) {
        uVar1 = uVar19;
      }
      uVar18 = uVar10;
      if ((long)uVar10 <= (long)uVar21) {
        uVar18 = uVar1;
      }
    }
    *(ulong *)(lVar15 + 0x40) = uVar18;
    *(ulong *)(&UNK_000019f8 + lVar15) = uVar19;
    uVar24 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001a10 + lVar15) = uVar24;
    *(undefined8 *)(&UNK_000019f0 + lVar15) = *(undefined8 *)(lVar15 + 0x48);
    uVar24 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001b28 + lVar15) = uVar24;
    *(undefined8 *)(&UNK_00001ad8 + lVar15) = *(undefined8 *)(&UNK_00001bb0 + lVar15);
    *(undefined8 *)(&UNK_00001ad0 + lVar15) = *(undefined8 *)(&UNK_00001ba8 + lVar15);
    *(undefined8 *)(&UNK_00001ae8 + lVar15) = *(undefined8 *)(&UNK_00001bc0 + lVar15);
    *(undefined8 *)(&UNK_00001ae0 + lVar15) = *(undefined8 *)(&UNK_00001bb8 + lVar15);
    *(undefined8 *)(&UNK_00001af8 + lVar15) = *(undefined8 *)(&UNK_00001bd0 + lVar15);
    *(undefined8 *)(&UNK_00001af0 + lVar15) = *(undefined8 *)(&UNK_00001bc8 + lVar15);
    *(undefined8 *)(&UNK_00001a98 + lVar15) = *(undefined8 *)(&UNK_00001b70 + lVar15);
    *(undefined8 *)(&UNK_00001a90 + lVar15) = *(undefined8 *)(&UNK_00001b68 + lVar15);
    *(undefined8 *)(&UNK_00001aa8 + lVar15) = *(undefined8 *)(&UNK_00001b80 + lVar15);
    *(undefined8 *)(&UNK_00001aa0 + lVar15) = *(undefined8 *)(&UNK_00001b78 + lVar15);
    *(undefined8 *)(&UNK_00001ab8 + lVar15) = *(undefined8 *)(&UNK_00001b90 + lVar15);
    *(undefined8 *)(&UNK_00001ab0 + lVar15) = *(undefined8 *)(&UNK_00001b88 + lVar15);
    *(undefined8 *)(&UNK_00001ac8 + lVar15) = *(undefined8 *)(&UNK_00001ba0 + lVar15);
    *(undefined8 *)(&UNK_00001ac0 + lVar15) = *(undefined8 *)(&UNK_00001b98 + lVar15);
    *(undefined8 *)(&UNK_00001a68 + lVar15) = *(undefined8 *)(&UNK_00001b40 + lVar15);
    *(undefined8 *)(&UNK_00001a60 + lVar15) = *(undefined8 *)(&UNK_00001b38 + lVar15);
    *(undefined8 *)(&UNK_00001a78 + lVar15) = *(undefined8 *)(&UNK_00001b50 + lVar15);
    *(undefined8 *)(&UNK_00001a70 + lVar15) = *(undefined8 *)(&UNK_00001b48 + lVar15);
    *(undefined8 *)(&UNK_00001a88 + lVar15) = *(undefined8 *)(&UNK_00001b60 + lVar15);
    *(undefined8 *)(&UNK_00001a80 + lVar15) = *(undefined8 *)(&UNK_00001b58 + lVar15);
    *(undefined8 *)(&UNK_00001a38 + lVar15) = *(undefined8 *)(&UNK_00001b10 + lVar15);
    *(undefined8 *)(&UNK_00001a30 + lVar15) = *(undefined8 *)(&UNK_00001b08 + lVar15);
    *(undefined8 *)(&UNK_00001a48 + lVar15) = *(undefined8 *)(&UNK_00001b20 + lVar15);
    *(undefined8 *)(&UNK_00001a40 + lVar15) = *(undefined8 *)(&UNK_00001b18 + lVar15);
    *(long *)(&UNK_00001a28 + lVar15) = *(long *)(&UNK_00001a28 + lVar15) + 1;
    uVar24 = *(undefined8 *)(lVar15 + 0x40);
    uVar14 = *(undefined8 *)(lVar15 + 0x48);
    *(undefined8 *)(&UNK_00001bd8 + lVar15) = uVar14;
    *(undefined8 *)(&UNK_00001b00 + lVar15) = uVar14;
    *(undefined8 *)(&UNK_00001a58 + lVar15) = *(undefined8 *)(&UNK_00001b30 + lVar15);
    *(undefined8 *)(&UNK_00001a50 + lVar15) = *(undefined8 *)(&UNK_00001b28 + lVar15);
    *(undefined8 *)(&UNK_00001bd8 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001bc0 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001bb8 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001bd0 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001bc8 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001ba0 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b98 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001bb0 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001ba8 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b80 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b78 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b90 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b88 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b60 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b58 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b70 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b68 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b40 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b38 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b50 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b48 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b20 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b18 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b30 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b28 + lVar15) = 0;
    *(undefined8 *)(&UNK_00001b08 + lVar15) = uVar14;
    *(undefined8 *)(&UNK_00001b10 + lVar15) = uVar24;
  }
  else {
    uVar18 = lVar23 - lVar16;
    uVar10 = uVar10 + uVar12;
    *(ulong *)(lVar15 + 0x40) = uVar10;
    if (uVar18 <= uVar10) {
      *(ulong *)(lVar15 + 0x40) = uVar10 - uVar18;
    }
  }
  if (*(code **)(lVar15 + 0x4e0) != (code *)0x0) {
    (**(code **)(lVar15 + 0x4e0))(lVar11,uVar3);
  }
  return uVar12;
}


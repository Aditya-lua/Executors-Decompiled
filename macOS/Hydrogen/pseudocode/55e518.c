
/* WARNING: Possible PIC construction at 0x0055eab4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055ef40: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055ee50: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055eb14: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0055ee54) */
/* WARNING: Removing unreachable block (ram,0x0055ef44) */
/* WARNING: Removing unreachable block (ram,0x0055ef6c) */
/* WARNING: Removing unreachable block (ram,0x0055ef84) */
/* WARNING: Removing unreachable block (ram,0x0055efc8) */
/* WARNING: Removing unreachable block (ram,0x0055efd0) */
/* WARNING: Removing unreachable block (ram,0x0055efe0) */
/* WARNING: Removing unreachable block (ram,0x0055efe4) */
/* WARNING: Removing unreachable block (ram,0x0055eab8) */
/* WARNING: Removing unreachable block (ram,0x0055ead0) */
/* WARNING: Removing unreachable block (ram,0x0055eb18) */
/* WARNING: Removing unreachable block (ram,0x0055eb28) */

long FUN_0055e518(void)

{
  undefined4 *puVar1;
  uint *puVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  ushort uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 *puVar9;
  undefined1 *puVar10;
  long *plVar11;
  undefined8 *puVar12;
  long lVar13;
  long extraout_x8;
  undefined8 uVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  int iVar18;
  long lVar19;
  undefined8 uVar20;
  ulong uVar21;
  ulong unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong uVar22;
  undefined8 unaff_x22;
  undefined *unaff_x23;
  undefined *unaff_x24;
  undefined *puVar23;
  uint uVar24;
  undefined *unaff_x25;
  undefined *unaff_x26;
  long lVar25;
  undefined *unaff_x27;
  undefined *puVar26;
  undefined *unaff_x28;
  undefined1 *unaff_x29;
  undefined1 *puVar27;
  code *pcVar28;
  undefined *puVar29;
  undefined *puVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  
  auVar35._8_8_ = unaff_x22;
  auVar35._0_8_ = unaff_x21;
  pcVar28 = FUN_0055e518 + 4;
  auVar34 = func_0x007a247c();
LAB_0055e51c:
  puVar16 = auVar35._8_8_;
  auVar6._8_8_ = unaff_x20;
  auVar6._0_8_ = auVar35._0_8_;
  puVar9 = auVar34._8_8_;
  plVar11 = auVar34._0_8_;
  *(undefined **)((long)register0x00000008 + -0x60) = unaff_x28;
  *(undefined **)((long)register0x00000008 + -0x58) = unaff_x27;
  *(undefined **)((long)register0x00000008 + -0x50) = unaff_x26;
  *(undefined **)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined **)((long)register0x00000008 + -0x40) = unaff_x24;
  *(undefined **)((long)register0x00000008 + -0x38) = unaff_x23;
  *(undefined8 **)((long)register0x00000008 + -0x30) = puVar16;
  *(long *)((long)register0x00000008 + -0x28) = auVar35._0_8_;
  *(ulong *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(ulong *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = pcVar28;
  unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
  puVar23 = (undefined *)plVar11[3];
  uVar21 = (ulong)*(ushort *)(puVar23 + 0x1c2);
  if ((undefined1 *)((long)&MACH_HEADER.cpusubtype + 3) < puVar9 + uVar21) {
    func_0x007a247c(&UNK_008aba01,0x32,&UNK_009ee168);
  }
  else {
    unaff_x19 = plVar11[5];
    unaff_x28 = (undefined1 *)(ulong)*(ushort *)(unaff_x19 + 0x1c2) + -(long)puVar9;
    auVar6 = auVar34;
    if (puVar9 <= (undefined1 *)(ulong)*(ushort *)(unaff_x19 + 0x1c2)) {
      *(short *)(puVar23 + 0x1c2) = (short)(puVar9 + uVar21);
      *(short *)(unaff_x19 + 0x1c2) = (short)unaff_x28;
      puVar16 = (undefined8 *)(unaff_x19 + 0xb8);
      unaff_x25 = (undefined *)((long)puVar9 * 0x18);
      puVar12 = (undefined8 *)((long)puVar16 + (long)(unaff_x25 + -0x18));
      unaff_x26 = (undefined *)((long)puVar9 * 0x10);
      unaff_x23 = unaff_x26 + -0x10;
      uVar3 = *(undefined4 *)(unaff_x23 + unaff_x19);
      uVar14 = *(undefined8 *)((long)(unaff_x23 + unaff_x19) + 8);
      lVar19 = *plVar11 + plVar11[2] * 0x18;
      puVar1 = (undefined4 *)(*plVar11 + plVar11[2] * 0x10);
      uVar17 = *(undefined8 *)(lVar19 + 200);
      uVar32 = *(undefined8 *)(lVar19 + 0xc0);
      uVar31 = *(undefined8 *)(lVar19 + 0xb8);
      uVar20 = puVar12[2];
      uVar33 = *puVar12;
      *(undefined8 *)(lVar19 + 0xc0) = puVar12[1];
      *(undefined8 *)(lVar19 + 0xb8) = uVar33;
      *(undefined8 *)(lVar19 + 200) = uVar20;
      uVar4 = *puVar1;
      uVar20 = *(undefined8 *)(puVar1 + 2);
      *puVar1 = uVar3;
      *(undefined8 *)(puVar1 + 2) = uVar14;
      *(undefined8 *)(puVar23 + uVar21 * 0x18 + 0xc0) = uVar32;
      *(undefined8 *)(puVar23 + uVar21 * 0x18 + 0xb8) = uVar31;
      *(undefined8 *)(puVar23 + uVar21 * 0x18 + 200) = uVar17;
      *(undefined4 *)(puVar23 + uVar21 * 0x10) = uVar4;
      *(undefined8 *)((long)(puVar23 + uVar21 * 0x10) + 8) = uVar20;
      *(ulong *)((long)register0x00000008 + -0x90) = uVar21;
      unaff_x27 = (undefined *)(uVar21 + 1);
      _memcpy(puVar23 + uVar21 * 0x18 + 0xd0,puVar16);
      _memcpy(puVar23 + (long)unaff_x27 * 0x10,unaff_x19,unaff_x23);
      _memmove(puVar16,puVar16 + (long)puVar9 * 3,(long)unaff_x28 * 0x18);
      *(undefined **)((long)register0x00000008 + -0x88) = unaff_x28;
      lVar19 = _memmove(unaff_x19,unaff_x26 + unaff_x19,(long)unaff_x28 * 0x10);
      if (plVar11[4] == 0) {
        if (plVar11[6] == 0) {
          return lVar19;
        }
      }
      else if (plVar11[6] != 0) {
        lVar19 = unaff_x19 + 0x1c8;
        _memcpy(puVar23 + (long)unaff_x27 * 8 + 0x1c8,lVar19,(long)puVar9 * 8);
        lVar25 = *(long *)((long)register0x00000008 + -0x88);
        lVar19 = _memmove(lVar19,lVar19 + (long)puVar9 * 8,lVar25 * 8 + 8);
        lVar13 = *(long *)(puVar23 + (long)unaff_x27 * 8 + 0x1c8);
        *(undefined **)(lVar13 + 0xb0) = puVar23;
        *(short *)(lVar13 + 0x1c0) = (short)unaff_x27;
        lVar13 = *(long *)((long)register0x00000008 + -0x90);
        if (puVar9 != (undefined1 *)((long)&MACH_HEADER.magic + 1)) {
          lVar15 = *(long *)(puVar23 + (lVar13 + 2) * 8 + 0x1c8);
          *(undefined **)(lVar15 + 0xb0) = puVar23;
          *(short *)(lVar15 + 0x1c0) = (short)(lVar13 + 2);
          if (puVar9 != (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
            lVar15 = *(long *)(puVar23 + (lVar13 + 3) * 8 + 0x1c8);
            *(undefined **)(lVar15 + 0xb0) = puVar23;
            *(short *)(lVar15 + 0x1c0) = (short)(lVar13 + 3);
            if (puVar9 != (undefined1 *)((long)&MACH_HEADER.magic + 3)) {
              lVar15 = *(long *)(puVar23 + (lVar13 + 4) * 8 + 0x1c8);
              *(undefined **)(lVar15 + 0xb0) = puVar23;
              *(short *)(lVar15 + 0x1c0) = (short)(lVar13 + 4);
              if ((dword *)puVar9 != &MACH_HEADER.cputype) {
                lVar15 = *(long *)(puVar23 + (lVar13 + 5) * 8 + 0x1c8);
                *(undefined **)(lVar15 + 0xb0) = puVar23;
                *(short *)(lVar15 + 0x1c0) = (short)(lVar13 + 5);
              }
            }
          }
        }
        lVar13 = 0;
        do {
          lVar15 = *(long *)(unaff_x19 + lVar13 * 8 + 0x1c8);
          *(short *)(lVar15 + 0x1c0) = (short)lVar13;
          lVar13 = lVar13 + 1;
          *(ulong *)(lVar15 + 0xb0) = unaff_x19;
        } while (lVar25 + 1 != lVar13);
        return lVar19;
      }
      goto code_r0x0055e770;
    }
  }
  func_0x007a247c(&UNK_008aba33,0x28,&UNK_009ee180);
code_r0x0055e770:
  puVar29 = &DAT_0055e788;
  puVar12 = (undefined8 *)func_0x007a247c(&UNK_008ab9d9,0x28,&UNK_009ee198);
  puVar9 = (undefined1 *)((long)register0x00000008 + -0x90);
code_r0x0055e788:
  puVar30 = auVar6._0_8_;
  *(undefined **)(puVar9 + -0x60) = unaff_x28;
  *(undefined **)(puVar9 + -0x58) = unaff_x27;
  *(undefined **)(puVar9 + -0x50) = unaff_x26;
  *(undefined **)(puVar9 + -0x48) = unaff_x25;
  *(undefined **)(puVar9 + -0x40) = puVar23;
  *(undefined **)(puVar9 + -0x38) = unaff_x23;
  *(undefined8 **)(puVar9 + -0x30) = puVar16;
  *(undefined1 (*) [16])(puVar9 + -0x28) = auVar6;
  *(ulong *)(puVar9 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar9 + -0x10) = unaff_x29;
  *(undefined **)(puVar9 + -8) = puVar29;
  puVar27 = puVar9 + -0x10;
  lVar19 = puVar12[3];
  uVar21 = (ulong)*(ushort *)(lVar19 + 0x1c2);
  unaff_x23 = (undefined *)puVar12[5];
  puVar23 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
  unaff_x20 = uVar21 + 1;
  puVar29 = puVar23 + unaff_x20;
  if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar29) {
    func_0x007a247c(&UNK_008abae9,0x2a,&UNK_009ee1c8);
    puVar29 = unaff_x27;
  }
  else {
    unaff_x26 = (undefined *)*puVar12;
    uVar14 = puVar12[1];
    uVar5 = *(ushort *)(unaff_x26 + 0x1c2);
    *(ulong *)(puVar9 + -0x90) = (ulong)uVar5;
    *(undefined8 *)(puVar9 + -0x88) = uVar14;
    *(undefined8 *)(puVar9 + -0x98) = puVar12[4];
    uVar22 = puVar12[2];
    *(undefined **)(puVar9 + -0xa8) = puVar29;
    *(short *)(lVar19 + 0x1c2) = (short)puVar29;
    uVar14 = *(undefined8 *)(unaff_x26 + uVar22 * 0x18 + 0xb8);
    *(undefined8 *)(puVar9 + -0x78) = *(undefined8 *)(unaff_x26 + uVar22 * 0x18 + 0xc0);
    *(undefined8 *)(puVar9 + -0x80) = uVar14;
    *(undefined8 *)(puVar9 + -0x70) = *(undefined8 *)(unaff_x26 + uVar22 * 0x18 + 200);
    unaff_x25 = (undefined *)(~uVar22 + (ulong)uVar5);
    _memmove(unaff_x26 + uVar22 * 0x18 + 0xb8,unaff_x26 + uVar22 * 0x18 + 0xd0,
             (long)unaff_x25 * 0x18);
    puVar16 = (undefined8 *)(lVar19 + 0xb8 + uVar21 * 0x18);
    uVar14 = *(undefined8 *)(puVar9 + -0x80);
    puVar16[1] = *(undefined8 *)(puVar9 + -0x78);
    *puVar16 = uVar14;
    puVar16[2] = *(undefined8 *)(puVar9 + -0x70);
    _memcpy(lVar19 + 0xb8 + unaff_x20 * 0x18,unaff_x23 + 0xb8,(long)puVar23 * 0x18);
    puVar1 = (undefined4 *)(unaff_x26 + uVar22 * 0x10);
    uVar3 = *puVar1;
    unaff_x28 = *(undefined **)(puVar1 + 2);
    _memmove(puVar1,puVar1 + 4,(long)unaff_x25 * 0x10);
    *(ulong *)(puVar9 + -0xa0) = uVar21;
    puVar1 = (undefined4 *)(lVar19 + uVar21 * 0x10);
    *puVar1 = uVar3;
    *(undefined **)(puVar1 + 2) = unaff_x28;
    *(ulong *)(puVar9 + -0xb0) = unaff_x20;
    _memcpy(lVar19 + unaff_x20 * 0x10,unaff_x23,(long)puVar23 << 4);
    unaff_x20 = uVar22 + 1;
    _memmove(unaff_x26 + unaff_x20 * 8 + 0x1c8,unaff_x26 + unaff_x20 * 8 + 0x1d0,(long)unaff_x25 * 8
            );
    uVar21 = *(ulong *)(puVar9 + -0x90);
    if (unaff_x20 < uVar21) {
      lVar13 = uVar22 + 0x3a;
      do {
        lVar25 = *(long *)(unaff_x26 + lVar13 * 8);
        *(undefined **)(lVar25 + 0xb0) = unaff_x26;
        *(short *)(lVar25 + 0x1c0) = (short)lVar13 + -0x39;
        lVar13 = lVar13 + 1;
      } while ((1 - uVar21) + lVar13 != 0x3a);
    }
    *(short *)(unaff_x26 + 0x1c2) = *(short *)(unaff_x26 + 0x1c2) + -1;
    if (*(ulong *)(puVar9 + -0x88) < 2) {
      uVar14 = 0x1c8;
      goto LAB_0055e950;
    }
    puVar30 = puVar23 + 1;
    uVar21 = *(ulong *)(puVar9 + -0xa0);
    puVar29 = unaff_x23;
    if (puVar30 == (undefined *)(*(long *)(puVar9 + -0xa8) - uVar21)) {
      _memcpy(lVar19 + 0x1c8 + *(long *)(puVar9 + -0xb0) * 8,unaff_x23 + 0x1c8,(long)puVar30 * 8);
      lVar13 = uVar21 + 0x3a;
      uVar14 = 0x228;
      do {
        lVar25 = *(long *)(lVar19 + lVar13 * 8);
        *(long *)(lVar25 + 0xb0) = lVar19;
        *(short *)(lVar25 + 0x1c0) = (short)lVar13 + -0x39;
        lVar13 = lVar13 + 1;
        puVar30 = puVar30 + -1;
      } while (puVar30 != (undefined *)0x0);
LAB_0055e950:
      func_0x00187bd4(unaff_x23,uVar14,8);
      return lVar19;
    }
  }
  auVar8._8_8_ = uVar21;
  auVar8._0_8_ = puVar30;
  unaff_x27 = &UNK_009ee0c0;
  puVar30 = (undefined *)0x55e9b4;
  auVar35 = func_0x007a247c(&UNK_008ab922,0x28);
  puVar10 = puVar9 + -0xb0;
LAB_0055e9b4:
  puVar16 = auVar35._8_8_;
  puVar12 = auVar35._0_8_;
  puVar9 = puVar10 + -400;
  register0x00000008 = (BADSPACEBASE *)(puVar10 + -400);
  *(undefined **)(puVar10 + -0x60) = unaff_x28;
  *(undefined **)(puVar10 + -0x58) = puVar29;
  *(undefined **)(puVar10 + -0x50) = unaff_x26;
  *(undefined **)(puVar10 + -0x48) = unaff_x25;
  *(undefined **)(puVar10 + -0x40) = puVar23;
  *(undefined **)(puVar10 + -0x38) = unaff_x23;
  *(long *)(puVar10 + -0x30) = auVar8._8_8_;
  *(long *)(puVar10 + -0x28) = auVar8._0_8_;
  *(ulong *)(puVar10 + -0x20) = unaff_x20;
  *(long *)(puVar10 + -0x18) = lVar19;
  *(undefined1 **)(puVar10 + -0x10) = puVar27;
  *(undefined **)(puVar10 + -8) = puVar30;
  unaff_x29 = puVar10 + -0x10;
  puVar23 = (undefined *)*puVar16;
  uVar5 = *(ushort *)(puVar23 + 0x1c2);
  unaff_x19 = (ulong)uVar5;
  unaff_x23 = (undefined *)puVar16[2];
  uVar14 = *(undefined8 *)(puVar23 + (long)unaff_x23 * 0x18 + 0xb8);
  *(undefined8 *)(puVar10 + -0x128) = *(undefined8 *)(puVar23 + (long)unaff_x23 * 0x18 + 0xc0);
  *(undefined8 *)(puVar10 + -0x130) = uVar14;
  *(undefined8 *)(puVar10 + -0x120) = *(undefined8 *)(puVar23 + (long)unaff_x23 * 0x18 + 200);
  _memmove(puVar23 + (long)unaff_x23 * 0x18 + 0xb8,puVar23 + (long)unaff_x23 * 0x18 + 0xd0,
           (~(ulong)unaff_x23 + unaff_x19) * 0x18);
  puVar2 = (uint *)(puVar23 + (long)unaff_x23 * 0x10);
  uVar24 = *puVar2;
  unaff_x25 = (undefined *)(ulong)uVar24;
  unaff_x26 = *(undefined **)(puVar2 + 2);
  lVar19 = _memmove(puVar2,puVar2 + 4,(~(ulong)unaff_x23 + unaff_x19) * 0x10);
  uVar5 = uVar5 - 1;
  *(ushort *)(puVar23 + 0x1c2) = uVar5;
  unaff_x20 = puVar16[1];
  auVar6._8_8_ = unaff_x20;
  auVar6._0_8_ = puVar12;
  auVar7._8_8_ = unaff_x20;
  auVar7._0_8_ = puVar12;
  if (4 < uVar5) goto code_r0x0055ede0;
  lVar13 = *(long *)(puVar23 + 0xb0);
  *(undefined8 **)(puVar10 + -0x158) = puVar12;
  *(uint *)(puVar10 + -0x15c) = uVar24;
  *(undefined **)(puVar10 + -0x168) = unaff_x26;
  *(undefined **)(puVar10 + -0x188) = unaff_x27;
  if (lVar13 == 0) {
code_r0x0055eb4c:
    unaff_x25 = *(undefined **)(puVar23 + 0xb0);
joined_r0x0055edd0:
    if (unaff_x25 == (undefined *)0x0) {
      puVar12 = *(undefined8 **)(puVar10 + -0x158);
      uVar24 = *(uint *)(puVar10 + -0x15c);
      unaff_x26 = *(undefined **)(puVar10 + -0x168);
    }
    else {
      *(undefined **)(puVar10 + -0x178) = unaff_x23;
      *(ulong *)(puVar10 + -0x170) = unaff_x20;
      *(undefined **)(puVar10 + -0x180) = puVar23;
      uVar5 = *(ushort *)(unaff_x25 + 0x1c2);
      if (uVar5 < 5) {
        uVar21 = *(long *)(puVar10 + -0x170) + 1;
        do {
          puVar29 = (undefined *)(ulong)uVar5;
          unaff_x28 = *(undefined **)(unaff_x25 + 0xb0);
          if (unaff_x28 == (undefined *)0x0) {
            if (uVar5 == 0) {
              **(undefined1 **)(puVar10 + -0x188) = 1;
            }
            break;
          }
          lVar19 = uVar21 + 1;
          uVar5 = *(ushort *)(unaff_x25 + 0x1c0);
          *(long *)(puVar10 + -0x138) = lVar19;
          if (uVar5 == 0) {
            uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
            if (uVar5 == 0) goto code_r0x0055ee70;
            puVar23 = *(undefined **)(unaff_x28 + 0x1d0);
            *(undefined **)(puVar10 + -0xd8) = unaff_x28;
            *(long *)(puVar10 + -0xd0) = lVar19;
            *(undefined8 *)(puVar10 + -200) = 0;
            *(undefined **)(puVar10 + -0xc0) = unaff_x25;
            *(ulong *)(puVar10 + -0xb8) = uVar21;
            *(undefined **)(puVar10 + -0xb0) = puVar23;
            *(ulong *)(puVar10 + -0xa8) = uVar21;
            unaff_x26 = puVar29 + 1;
            unaff_x24 = (undefined *)(ulong)*(ushort *)(puVar23 + 0x1c2);
            puVar30 = unaff_x26 + (long)unaff_x24;
            if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar30) {
              auVar34._8_8_ = 5 - (long)puVar29;
              auVar34._0_8_ = puVar10 + -0xd8;
              pcVar28 = (code *)&UNK_0055ee54;
              goto LAB_0055e51c;
            }
            uVar22 = 0;
            unaff_x23 = unaff_x25;
          }
          else {
            uVar22 = (ulong)uVar5 - 1;
            unaff_x23 = *(undefined **)(unaff_x28 + uVar22 * 8 + 0x1c8);
            *(undefined **)(puVar10 + -0x110) = unaff_x28;
            *(long *)(puVar10 + -0x108) = lVar19;
            *(ulong *)(puVar10 + -0x100) = uVar22;
            *(undefined **)(puVar10 + -0xf8) = unaff_x23;
            *(ulong *)(puVar10 + -0xf0) = uVar21;
            *(undefined **)(puVar10 + -0xe8) = unaff_x25;
            *(ulong *)(puVar10 + -0xe0) = uVar21;
            puVar26 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
            if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar29 + (long)puVar26 + 1) {
              lVar19 = func_0x0055e2f4(puVar10 + -0x110,5 - (long)puVar29);
              break;
            }
            uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
            unaff_x26 = puVar26 + 1;
            puVar30 = unaff_x26 + (long)puVar29;
            unaff_x24 = puVar29;
            puVar23 = unaff_x25;
            puVar29 = puVar26;
          }
          unaff_x20 = (ulong)uVar5;
          *(undefined **)(puVar10 + -0x148) = puVar30;
          *(ulong *)(puVar10 + -0x140) = uVar22;
          *(short *)(unaff_x23 + 0x1c2) = (short)puVar30;
          iVar18 = (int)uVar22;
          uVar14 = *(undefined8 *)(unaff_x28 + (long)iVar18 * 0x18 + 0xb8);
          *(undefined8 *)(puVar10 + -0x98) = *(undefined8 *)(unaff_x28 + (long)iVar18 * 0x18 + 0xc0)
          ;
          *(undefined8 *)(puVar10 + -0xa0) = uVar14;
          *(undefined8 *)(puVar10 + -0x90) = *(undefined8 *)(unaff_x28 + (long)iVar18 * 0x18 + 200);
          lVar19 = unaff_x20 + ~uVar22;
          _memmove(unaff_x28 + (long)iVar18 * 0x18 + 0xb8,unaff_x28 + (long)iVar18 * 0x18 + 0xd0,
                   lVar19 * 0x18);
          puVar16 = (undefined8 *)(unaff_x23 + (long)puVar29 * 0x18 + 0xb8);
          uVar14 = *(undefined8 *)(puVar10 + -0x90);
          uVar17 = *(undefined8 *)(puVar10 + -0xa0);
          puVar16[1] = *(undefined8 *)(puVar10 + -0x98);
          *puVar16 = uVar17;
          puVar16[2] = uVar14;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x18 + 0xb8,puVar23 + 0xb8,(long)unaff_x24 * 0x18);
          puVar1 = (undefined4 *)(unaff_x28 + uVar22 * 0x10);
          uVar3 = *puVar1;
          auVar35._8_4_ = uVar3;
          auVar35._0_8_ = lVar19;
          auVar35._12_4_ = 0;
          uVar14 = *(undefined8 *)(puVar1 + 2);
          _memmove(puVar1,puVar1 + 4,lVar19 * 0x10);
          *(undefined **)(puVar10 + -0x150) = puVar29;
          *(undefined4 *)(unaff_x23 + (long)puVar29 * 0x10) = uVar3;
          *(undefined8 *)((long)(unaff_x23 + (long)puVar29 * 0x10) + 8) = uVar14;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x10,puVar23,(long)unaff_x24 << 4);
          uVar21 = *(long *)(puVar10 + -0x140) + 1;
          _memmove(unaff_x28 + uVar21 * 8 + 0x1c8,unaff_x28 + uVar21 * 8 + 0x1d0,lVar19 * 8);
          if (uVar21 < unaff_x20) {
            do {
              lVar19 = *(long *)(unaff_x28 + uVar21 * 8 + 0x1c8);
              *(short *)(lVar19 + 0x1c0) = (short)uVar21;
              uVar21 = uVar21 + 1;
              *(undefined **)(lVar19 + 0xb0) = unaff_x28;
            } while (unaff_x20 != uVar21);
          }
          *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
          uVar21 = *(ulong *)(puVar10 + -0x138);
          unaff_x19 = uVar21;
          unaff_x27 = puVar29;
          if (uVar21 < 2) {
            uVar14 = 0x1c8;
          }
          else {
            unaff_x20 = *(ulong *)(puVar10 + -0x148);
            if (unaff_x24 + 1 != (undefined *)(unaff_x20 - *(long *)(puVar10 + -0x150)))
            goto code_r0x0055ee58;
            _memcpy(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8,puVar23 + 0x1c8,
                    (long)(unaff_x24 + 1) * 8);
            do {
              lVar19 = *(long *)(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8);
              *(short *)(lVar19 + 0x1c0) = (short)unaff_x26;
              unaff_x26 = unaff_x26 + 1;
              *(undefined **)(lVar19 + 0xb0) = unaff_x23;
            } while ((undefined *)(unaff_x20 + 1) != unaff_x26);
            uVar14 = 0x228;
          }
          lVar19 = func_0x00187bd4(puVar23,uVar14,8);
          uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
          unaff_x25 = unaff_x28;
          if (4 < uVar5) break;
        } while( true );
      }
      puVar12 = *(undefined8 **)(puVar10 + -0x158);
      puVar23 = *(undefined **)(puVar10 + -0x180);
      unaff_x23 = *(undefined **)(puVar10 + -0x178);
      uVar24 = *(uint *)(puVar10 + -0x15c);
      unaff_x20 = *(ulong *)(puVar10 + -0x170);
      unaff_x26 = *(undefined **)(puVar10 + -0x168);
    }
code_r0x0055ede0:
    uVar14 = *(undefined8 *)(puVar10 + -0x130);
    puVar12[1] = *(undefined8 *)(puVar10 + -0x128);
    *puVar12 = uVar14;
    puVar12[2] = *(undefined8 *)(puVar10 + -0x120);
    *(uint *)(puVar12 + 3) = uVar24;
    puVar12[4] = unaff_x26;
    puVar12[5] = puVar23;
    puVar12[6] = unaff_x20;
    puVar12[7] = unaff_x23;
    return lVar19;
  }
  lVar19 = unaff_x20 + 1;
  if (*(ushort *)(puVar23 + 0x1c0) == 0) {
    puVar29 = unaff_x27;
    auVar8 = auVar35;
    if (*(short *)(lVar13 + 0x1c2) == 0) goto code_r0x0055eeb4;
    lVar25 = *(long *)(lVar13 + 0x1d0);
    if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) <
        (undefined *)(ulong)uVar5 + (ulong)*(ushort *)(lVar25 + 0x1c2) + 1) {
      *(long *)(puVar10 + -0xd8) = lVar13;
      *(long *)(puVar10 + -0xd0) = lVar19;
      *(undefined8 *)(puVar10 + -200) = 0;
      *(undefined **)(puVar10 + -0xc0) = puVar23;
      *(ulong *)(puVar10 + -0xb8) = unaff_x20;
      *(long *)(puVar10 + -0xb0) = lVar25;
      *(ulong *)(puVar10 + -0xa8) = unaff_x20;
      lVar19 = func_0x0055e51c(puVar10 + -0xd8,1);
      unaff_x25 = *(undefined **)(puVar23 + 0xb0);
      goto joined_r0x0055edd0;
    }
    *(long *)(puVar10 + -0xd8) = lVar13;
    *(long *)(puVar10 + -0xd0) = lVar19;
    *(undefined8 *)(puVar10 + -200) = 0;
    *(undefined **)(puVar10 + -0xc0) = puVar23;
    *(ulong *)(puVar10 + -0xb8) = unaff_x20;
    *(long *)(puVar10 + -0xb0) = lVar25;
    *(ulong *)(puVar10 + -0xa8) = unaff_x20;
    if ((undefined *)(ulong)uVar5 < unaff_x23) goto code_r0x0055ee9c;
    puVar12 = (undefined8 *)(puVar10 + -0xd8);
    puVar29 = &UNK_0055eb18;
  }
  else {
    lVar25 = (ulong)*(ushort *)(puVar23 + 0x1c0) - 1;
    lVar15 = *(long *)(lVar13 + lVar25 * 8 + 0x1c8);
    unaff_x19 = (ulong)*(ushort *)(lVar15 + 0x1c2);
    if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < (undefined *)(ulong)uVar5 + unaff_x19 + 1
       ) {
      *(long *)(puVar10 + -0xd8) = lVar13;
      *(long *)(puVar10 + -0xd0) = lVar19;
      *(long *)(puVar10 + -200) = lVar25;
      *(long *)(puVar10 + -0xc0) = lVar15;
      *(ulong *)(puVar10 + -0xb8) = unaff_x20;
      *(undefined **)(puVar10 + -0xb0) = puVar23;
      *(ulong *)(puVar10 + -0xa8) = unaff_x20;
      lVar19 = func_0x0055e2f4(puVar10 + -0xd8,1);
      unaff_x23 = unaff_x23 + 1;
      goto code_r0x0055eb4c;
    }
    *(long *)(puVar10 + -0xd8) = lVar13;
    *(long *)(puVar10 + -0xd0) = lVar19;
    *(long *)(puVar10 + -200) = lVar25;
    *(long *)(puVar10 + -0xc0) = lVar15;
    *(ulong *)(puVar10 + -0xb8) = unaff_x20;
    *(undefined **)(puVar10 + -0xb0) = puVar23;
    *(ulong *)(puVar10 + -0xa8) = unaff_x20;
    if ((undefined *)(ulong)uVar5 < unaff_x23) goto code_r0x0055ee9c;
    puVar12 = (undefined8 *)(puVar10 + -0xd8);
    puVar29 = &UNK_0055eab8;
    puVar9 = puVar10 + -400;
    auVar6 = auVar7;
  }
  goto code_r0x0055e788;
code_r0x0055ee58:
  func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
  unaff_x25 = unaff_x24;
code_r0x0055ee70:
  *(undefined **)(puVar10 + -0xa0) = &UNK_009ee080;
  *(undefined8 *)(puVar10 + -0x98) = 1;
  *(undefined8 *)(puVar10 + -0x88) = 0;
  *(undefined8 *)(puVar10 + -0x80) = 0;
  *(undefined1 **)(puVar10 + -0x90) = puVar10 + -0x70;
  func_0x007a2420(puVar10 + -0xa0,&UNK_009ee090);
code_r0x0055ee9c:
  func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
  puVar29 = unaff_x27;
  auVar8 = auVar35;
code_r0x0055eeb4:
  *(undefined **)(puVar10 + -0xd8) = &UNK_009ee080;
  *(undefined8 *)(puVar10 + -0xd0) = 1;
  *(undefined8 *)(puVar10 + -0xc0) = 0;
  *(undefined8 *)(puVar10 + -0xb8) = 0;
  *(undefined1 **)(puVar10 + -200) = puVar10 + -0x70;
  auVar34 = func_0x007a2420(puVar10 + -0xd8,&UNK_009ee090);
  unaff_x27 = auVar34._8_8_;
  plVar11 = auVar34._0_8_;
  *(ulong *)(puVar10 + -0x1b0) = unaff_x20;
  *(ulong *)(puVar10 + -0x1a8) = unaff_x19;
  *(undefined1 **)(puVar10 + -0x1a0) = unaff_x29;
  *(undefined **)(puVar10 + -0x198) = &DAT_0055eee0;
  puVar27 = puVar10 + -0x1a0;
  lVar19 = plVar11[1];
  lVar13 = plVar11[2];
  if (lVar19 == 0) {
    *(long *)(puVar10 + -0x240) = *plVar11;
    *(undefined8 *)(puVar10 + -0x238) = 0;
    *(long *)(puVar10 + -0x230) = lVar13;
    lVar19 = func_0x0055e9b4(extraout_x8,puVar10 + -0x240);
    return lVar19;
  }
  lVar13 = *(long *)(*plVar11 + lVar13 * 8 + 0x1c8);
  while (lVar19 = lVar19 + -1, lVar19 != 0) {
    lVar13 = *(long *)(lVar13 + (ulong)*(ushort *)(lVar13 + 0x1c2) * 8 + 0x1c8);
  }
  uVar5 = *(ushort *)(lVar13 + 0x1c2);
  *(long *)(puVar10 + -0x228) = lVar13;
  *(undefined8 *)(puVar10 + -0x220) = 0;
  *(ulong *)(puVar10 + -0x218) = (ulong)uVar5 - 1;
  auVar35._8_8_ = puVar10 + -0x228;
  auVar35._0_8_ = puVar10 + -0x1f0;
  puVar30 = &UNK_0055ef44;
  puVar10 = puVar10 + -0x240;
  lVar19 = extraout_x8;
  goto LAB_0055e9b4;
}


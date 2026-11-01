
/* WARNING: Possible PIC construction at 0x0055eab4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055ef40: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055eb14: Changing call to branch */
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

undefined1  [16] FUN_0055e764(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined4 *puVar1;
  uint *puVar2;
  undefined4 uVar3;
  ushort uVar4;
  undefined1 auVar5 [16];
  undefined1 *puVar6;
  undefined1 *puVar7;
  undefined8 *puVar8;
  long *plVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  long extraout_x8;
  long lVar12;
  long lVar13;
  long lVar14;
  int iVar15;
  ulong unaff_x19;
  long lVar16;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong uVar17;
  undefined8 unaff_x22;
  ulong uVar18;
  undefined *unaff_x23;
  undefined *unaff_x24;
  undefined *puVar19;
  uint uVar20;
  undefined *unaff_x25;
  undefined *unaff_x26;
  undefined *unaff_x27;
  undefined *puVar21;
  undefined *unaff_x28;
  undefined1 *unaff_x29;
  undefined1 *puVar22;
  undefined *puVar23;
  undefined *puVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  
  auVar26._8_8_ = unaff_x22;
  auVar26._0_8_ = unaff_x21;
  func_0x007a247c(param_1,0x28,param_3 + 0x180);
  puVar23 = (undefined *)0x55e788;
  puVar8 = (undefined8 *)func_0x007a247c(&UNK_008ab9d9,0x28,&UNK_009ee198);
  puVar6 = (undefined1 *)register0x00000008;
LAB_0055e788:
  puVar24 = auVar26._0_8_;
  *(undefined **)(puVar6 + -0x60) = unaff_x28;
  *(undefined **)(puVar6 + -0x58) = unaff_x27;
  *(undefined **)(puVar6 + -0x50) = unaff_x26;
  *(undefined **)(puVar6 + -0x48) = unaff_x25;
  *(undefined **)(puVar6 + -0x40) = unaff_x24;
  *(undefined **)(puVar6 + -0x38) = unaff_x23;
  *(long *)(puVar6 + -0x30) = auVar26._8_8_;
  *(undefined **)(puVar6 + -0x28) = puVar24;
  *(ulong *)(puVar6 + -0x20) = unaff_x20;
  *(ulong *)(puVar6 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar6 + -0x10) = unaff_x29;
  *(undefined **)(puVar6 + -8) = puVar23;
  puVar22 = puVar6 + -0x10;
  lVar16 = puVar8[3];
  uVar18 = (ulong)*(ushort *)(lVar16 + 0x1c2);
  unaff_x23 = (undefined *)puVar8[5];
  unaff_x24 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
  unaff_x20 = uVar18 + 1;
  puVar23 = unaff_x24 + unaff_x20;
  if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar23) {
    func_0x007a247c(&UNK_008abae9,0x2a,&UNK_009ee1c8);
    puVar23 = unaff_x27;
  }
  else {
    unaff_x26 = (undefined *)*puVar8;
    uVar10 = puVar8[1];
    uVar4 = *(ushort *)(unaff_x26 + 0x1c2);
    *(ulong *)(puVar6 + -0x90) = (ulong)uVar4;
    *(undefined8 *)(puVar6 + -0x88) = uVar10;
    *(undefined8 *)(puVar6 + -0x98) = puVar8[4];
    uVar17 = puVar8[2];
    *(undefined **)(puVar6 + -0xa8) = puVar23;
    *(short *)(lVar16 + 0x1c2) = (short)puVar23;
    uVar10 = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 0xb8);
    *(undefined8 *)(puVar6 + -0x78) = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 0xc0);
    *(undefined8 *)(puVar6 + -0x80) = uVar10;
    *(undefined8 *)(puVar6 + -0x70) = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 200);
    unaff_x25 = (undefined *)(~uVar17 + (ulong)uVar4);
    _memmove(unaff_x26 + uVar17 * 0x18 + 0xb8,unaff_x26 + uVar17 * 0x18 + 0xd0,
             (long)unaff_x25 * 0x18);
    puVar8 = (undefined8 *)(lVar16 + 0xb8 + uVar18 * 0x18);
    uVar10 = *(undefined8 *)(puVar6 + -0x80);
    puVar8[1] = *(undefined8 *)(puVar6 + -0x78);
    *puVar8 = uVar10;
    puVar8[2] = *(undefined8 *)(puVar6 + -0x70);
    _memcpy(lVar16 + 0xb8 + unaff_x20 * 0x18,unaff_x23 + 0xb8,(long)unaff_x24 * 0x18);
    puVar1 = (undefined4 *)(unaff_x26 + uVar17 * 0x10);
    uVar3 = *puVar1;
    unaff_x28 = *(undefined **)(puVar1 + 2);
    _memmove(puVar1,puVar1 + 4,(long)unaff_x25 * 0x10);
    *(ulong *)(puVar6 + -0xa0) = uVar18;
    puVar1 = (undefined4 *)(lVar16 + uVar18 * 0x10);
    *puVar1 = uVar3;
    *(undefined **)(puVar1 + 2) = unaff_x28;
    *(ulong *)(puVar6 + -0xb0) = unaff_x20;
    _memcpy(lVar16 + unaff_x20 * 0x10,unaff_x23,(long)unaff_x24 << 4);
    unaff_x20 = uVar17 + 1;
    _memmove(unaff_x26 + unaff_x20 * 8 + 0x1c8,unaff_x26 + unaff_x20 * 8 + 0x1d0,(long)unaff_x25 * 8
            );
    uVar18 = *(ulong *)(puVar6 + -0x90);
    if (unaff_x20 < uVar18) {
      lVar12 = uVar17 + 0x3a;
      do {
        lVar13 = *(long *)(unaff_x26 + lVar12 * 8);
        *(undefined **)(lVar13 + 0xb0) = unaff_x26;
        *(short *)(lVar13 + 0x1c0) = (short)lVar12 + -0x39;
        lVar12 = lVar12 + 1;
      } while ((1 - uVar18) + lVar12 != 0x3a);
    }
    *(short *)(unaff_x26 + 0x1c2) = *(short *)(unaff_x26 + 0x1c2) + -1;
    if (*(ulong *)(puVar6 + -0x88) < 2) {
      uVar10 = 0x1c8;
      goto code_r0x0055e950;
    }
    puVar24 = unaff_x24 + 1;
    uVar18 = *(ulong *)(puVar6 + -0xa0);
    puVar23 = unaff_x23;
    if (puVar24 == (undefined *)(*(long *)(puVar6 + -0xa8) - uVar18)) {
      _memcpy(lVar16 + 0x1c8 + *(long *)(puVar6 + -0xb0) * 8,unaff_x23 + 0x1c8,(long)puVar24 * 8);
      lVar12 = uVar18 + 0x3a;
      uVar10 = 0x228;
      do {
        lVar13 = *(long *)(lVar16 + lVar12 * 8);
        *(long *)(lVar13 + 0xb0) = lVar16;
        *(short *)(lVar13 + 0x1c0) = (short)lVar12 + -0x39;
        lVar12 = lVar12 + 1;
        puVar24 = puVar24 + -1;
      } while (puVar24 != (undefined *)0x0);
code_r0x0055e950:
      func_0x00187bd4(unaff_x23,uVar10,8);
      auVar27._8_8_ = *(undefined8 *)(puVar6 + -0x98);
      auVar27._0_8_ = lVar16;
      return auVar27;
    }
  }
  auVar5._8_8_ = uVar18;
  auVar5._0_8_ = puVar24;
  unaff_x27 = &UNK_009ee0c0;
  puVar24 = &DAT_0055e9b4;
  auVar26 = func_0x007a247c(&UNK_008ab922,0x28);
  puVar7 = puVar6 + -0xb0;
code_r0x0055e9b4:
  puVar11 = auVar26._8_8_;
  puVar8 = auVar26._0_8_;
  puVar6 = puVar7 + -400;
  *(undefined **)(puVar7 + -0x60) = unaff_x28;
  *(undefined **)(puVar7 + -0x58) = puVar23;
  *(undefined **)(puVar7 + -0x50) = unaff_x26;
  *(undefined **)(puVar7 + -0x48) = unaff_x25;
  *(undefined **)(puVar7 + -0x40) = unaff_x24;
  *(undefined **)(puVar7 + -0x38) = unaff_x23;
  *(long *)(puVar7 + -0x30) = auVar5._8_8_;
  *(long *)(puVar7 + -0x28) = auVar5._0_8_;
  *(ulong *)(puVar7 + -0x20) = unaff_x20;
  *(long *)(puVar7 + -0x18) = lVar16;
  *(undefined1 **)(puVar7 + -0x10) = puVar22;
  *(undefined **)(puVar7 + -8) = puVar24;
  unaff_x29 = puVar7 + -0x10;
  unaff_x24 = (undefined *)*puVar11;
  uVar4 = *(ushort *)(unaff_x24 + 0x1c2);
  unaff_x19 = (ulong)uVar4;
  unaff_x23 = (undefined *)puVar11[2];
  uVar10 = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 0xb8);
  *(undefined8 *)(puVar7 + -0x128) = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 0xc0);
  *(undefined8 *)(puVar7 + -0x130) = uVar10;
  *(undefined8 *)(puVar7 + -0x120) = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 200);
  _memmove(unaff_x24 + (long)unaff_x23 * 0x18 + 0xb8,unaff_x24 + (long)unaff_x23 * 0x18 + 0xd0,
           (~(ulong)unaff_x23 + unaff_x19) * 0x18);
  puVar2 = (uint *)(unaff_x24 + (long)unaff_x23 * 0x10);
  uVar20 = *puVar2;
  unaff_x25 = (undefined *)(ulong)uVar20;
  unaff_x26 = *(undefined **)(puVar2 + 2);
  auVar27 = _memmove(puVar2,puVar2 + 4,(~(ulong)unaff_x23 + unaff_x19) * 0x10);
  uVar4 = uVar4 - 1;
  *(ushort *)(unaff_x24 + 0x1c2) = uVar4;
  unaff_x20 = puVar11[1];
  if (4 < uVar4) goto code_r0x0055ede0;
  lVar16 = *(long *)(unaff_x24 + 0xb0);
  *(undefined8 **)(puVar7 + -0x158) = puVar8;
  *(uint *)(puVar7 + -0x15c) = uVar20;
  *(undefined **)(puVar7 + -0x168) = unaff_x26;
  *(undefined **)(puVar7 + -0x188) = unaff_x27;
  if (lVar16 == 0) {
code_r0x0055eb4c:
    unaff_x25 = *(undefined **)(unaff_x24 + 0xb0);
joined_r0x0055edd0:
    if (unaff_x25 == (undefined *)0x0) {
      puVar8 = *(undefined8 **)(puVar7 + -0x158);
      uVar20 = *(uint *)(puVar7 + -0x15c);
      unaff_x26 = *(undefined **)(puVar7 + -0x168);
    }
    else {
      *(undefined **)(puVar7 + -0x178) = unaff_x23;
      *(ulong *)(puVar7 + -0x170) = unaff_x20;
      *(undefined **)(puVar7 + -0x180) = unaff_x24;
      uVar4 = *(ushort *)(unaff_x25 + 0x1c2);
      if (uVar4 < 5) {
        uVar18 = *(long *)(puVar7 + -0x170) + 1;
        do {
          puVar23 = (undefined *)(ulong)uVar4;
          unaff_x28 = *(undefined **)(unaff_x25 + 0xb0);
          if (unaff_x28 == (undefined *)0x0) {
            if (uVar4 == 0) {
              **(undefined1 **)(puVar7 + -0x188) = 1;
            }
            break;
          }
          lVar16 = uVar18 + 1;
          uVar4 = *(ushort *)(unaff_x25 + 0x1c0);
          *(long *)(puVar7 + -0x138) = lVar16;
          if (uVar4 == 0) {
            uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
            if (uVar4 == 0) goto LAB_0055ee70;
            unaff_x24 = *(undefined **)(unaff_x28 + 0x1d0);
            *(undefined **)(puVar7 + -0xd8) = unaff_x28;
            *(long *)(puVar7 + -0xd0) = lVar16;
            *(undefined8 *)(puVar7 + -200) = 0;
            *(undefined **)(puVar7 + -0xc0) = unaff_x25;
            *(ulong *)(puVar7 + -0xb8) = uVar18;
            *(undefined **)(puVar7 + -0xb0) = unaff_x24;
            *(ulong *)(puVar7 + -0xa8) = uVar18;
            unaff_x26 = puVar23 + 1;
            puVar19 = (undefined *)(ulong)*(ushort *)(unaff_x24 + 0x1c2);
            puVar24 = unaff_x26 + (long)puVar19;
            if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar24) {
              auVar27 = func_0x0055e51c(puVar7 + -0xd8,5 - (long)puVar23);
              break;
            }
            uVar17 = 0;
            unaff_x23 = unaff_x25;
          }
          else {
            uVar17 = (ulong)uVar4 - 1;
            unaff_x23 = *(undefined **)(unaff_x28 + uVar17 * 8 + 0x1c8);
            *(undefined **)(puVar7 + -0x110) = unaff_x28;
            *(long *)(puVar7 + -0x108) = lVar16;
            *(ulong *)(puVar7 + -0x100) = uVar17;
            *(undefined **)(puVar7 + -0xf8) = unaff_x23;
            *(ulong *)(puVar7 + -0xf0) = uVar18;
            *(undefined **)(puVar7 + -0xe8) = unaff_x25;
            *(ulong *)(puVar7 + -0xe0) = uVar18;
            puVar21 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
            if ((undefined *)0xb < puVar23 + (long)puVar21 + 1) {
              auVar27 = func_0x0055e2f4(puVar7 + -0x110,5 - (long)puVar23);
              break;
            }
            uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
            unaff_x26 = puVar21 + 1;
            puVar24 = unaff_x26 + (long)puVar23;
            puVar19 = puVar23;
            unaff_x24 = unaff_x25;
            puVar23 = puVar21;
          }
          unaff_x20 = (ulong)uVar4;
          *(undefined **)(puVar7 + -0x148) = puVar24;
          *(ulong *)(puVar7 + -0x140) = uVar17;
          *(short *)(unaff_x23 + 0x1c2) = (short)puVar24;
          iVar15 = (int)uVar17;
          uVar10 = *(undefined8 *)(unaff_x28 + (long)iVar15 * 0x18 + 0xb8);
          *(undefined8 *)(puVar7 + -0x98) = *(undefined8 *)(unaff_x28 + (long)iVar15 * 0x18 + 0xc0);
          *(undefined8 *)(puVar7 + -0xa0) = uVar10;
          *(undefined8 *)(puVar7 + -0x90) = *(undefined8 *)(unaff_x28 + (long)iVar15 * 0x18 + 200);
          lVar16 = unaff_x20 + ~uVar17;
          _memmove(unaff_x28 + (long)iVar15 * 0x18 + 0xb8,unaff_x28 + (long)iVar15 * 0x18 + 0xd0,
                   lVar16 * 0x18);
          puVar8 = (undefined8 *)(unaff_x23 + (long)puVar23 * 0x18 + 0xb8);
          uVar10 = *(undefined8 *)(puVar7 + -0x90);
          uVar25 = *(undefined8 *)(puVar7 + -0xa0);
          puVar8[1] = *(undefined8 *)(puVar7 + -0x98);
          *puVar8 = uVar25;
          puVar8[2] = uVar10;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x18 + 0xb8,unaff_x24 + 0xb8,(long)puVar19 * 0x18);
          puVar1 = (undefined4 *)(unaff_x28 + uVar17 * 0x10);
          uVar3 = *puVar1;
          auVar26._8_4_ = uVar3;
          auVar26._0_8_ = lVar16;
          auVar26._12_4_ = 0;
          uVar10 = *(undefined8 *)(puVar1 + 2);
          _memmove(puVar1,puVar1 + 4,lVar16 * 0x10);
          *(undefined **)(puVar7 + -0x150) = puVar23;
          *(undefined4 *)(unaff_x23 + (long)puVar23 * 0x10) = uVar3;
          *(undefined8 *)((long)(unaff_x23 + (long)puVar23 * 0x10) + 8) = uVar10;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x10,unaff_x24,(long)puVar19 << 4);
          uVar18 = *(long *)(puVar7 + -0x140) + 1;
          _memmove(unaff_x28 + uVar18 * 8 + 0x1c8,unaff_x28 + uVar18 * 8 + 0x1d0,lVar16 * 8);
          if (uVar18 < unaff_x20) {
            do {
              lVar16 = *(long *)(unaff_x28 + uVar18 * 8 + 0x1c8);
              *(short *)(lVar16 + 0x1c0) = (short)uVar18;
              uVar18 = uVar18 + 1;
              *(undefined **)(lVar16 + 0xb0) = unaff_x28;
            } while (unaff_x20 != uVar18);
          }
          *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
          uVar18 = *(ulong *)(puVar7 + -0x138);
          unaff_x19 = uVar18;
          unaff_x27 = puVar23;
          if (uVar18 < 2) {
            uVar10 = 0x1c8;
          }
          else {
            unaff_x20 = *(ulong *)(puVar7 + -0x148);
            if (puVar19 + 1 != (undefined *)(unaff_x20 - *(long *)(puVar7 + -0x150)))
            goto LAB_0055ee58;
            _memcpy(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8,unaff_x24 + 0x1c8,
                    (long)(puVar19 + 1) * 8);
            do {
              lVar16 = *(long *)(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8);
              *(short *)(lVar16 + 0x1c0) = (short)unaff_x26;
              unaff_x26 = unaff_x26 + 1;
              *(undefined **)(lVar16 + 0xb0) = unaff_x23;
            } while ((undefined *)(unaff_x20 + 1) != unaff_x26);
            uVar10 = 0x228;
          }
          auVar27 = func_0x00187bd4(unaff_x24,uVar10,8);
          uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
          unaff_x25 = unaff_x28;
          if (4 < uVar4) break;
        } while( true );
      }
      puVar8 = *(undefined8 **)(puVar7 + -0x158);
      unaff_x24 = *(undefined **)(puVar7 + -0x180);
      unaff_x23 = *(undefined **)(puVar7 + -0x178);
      uVar20 = *(uint *)(puVar7 + -0x15c);
      unaff_x20 = *(ulong *)(puVar7 + -0x170);
      unaff_x26 = *(undefined **)(puVar7 + -0x168);
    }
code_r0x0055ede0:
    uVar10 = *(undefined8 *)(puVar7 + -0x130);
    puVar8[1] = *(undefined8 *)(puVar7 + -0x128);
    *puVar8 = uVar10;
    puVar8[2] = *(undefined8 *)(puVar7 + -0x120);
    *(uint *)(puVar8 + 3) = uVar20;
    puVar8[4] = unaff_x26;
    puVar8[5] = unaff_x24;
    puVar8[6] = unaff_x20;
    puVar8[7] = unaff_x23;
    return auVar27;
  }
  lVar12 = unaff_x20 + 1;
  if (*(ushort *)(unaff_x24 + 0x1c0) == 0) {
    puVar23 = unaff_x27;
    auVar5 = auVar26;
    if (*(short *)(lVar16 + 0x1c2) == 0) goto code_r0x0055eeb4;
    lVar13 = *(long *)(lVar16 + 0x1d0);
    if ((undefined *)0xb < (undefined *)(ulong)uVar4 + (ulong)*(ushort *)(lVar13 + 0x1c2) + 1) {
      *(long *)(puVar7 + -0xd8) = lVar16;
      *(long *)(puVar7 + -0xd0) = lVar12;
      *(undefined8 *)(puVar7 + -200) = 0;
      *(undefined **)(puVar7 + -0xc0) = unaff_x24;
      *(ulong *)(puVar7 + -0xb8) = unaff_x20;
      *(long *)(puVar7 + -0xb0) = lVar13;
      *(ulong *)(puVar7 + -0xa8) = unaff_x20;
      auVar27 = func_0x0055e51c(puVar7 + -0xd8,1);
      unaff_x25 = *(undefined **)(unaff_x24 + 0xb0);
      goto joined_r0x0055edd0;
    }
    *(long *)(puVar7 + -0xd8) = lVar16;
    *(long *)(puVar7 + -0xd0) = lVar12;
    *(undefined8 *)(puVar7 + -200) = 0;
    *(undefined **)(puVar7 + -0xc0) = unaff_x24;
    *(ulong *)(puVar7 + -0xb8) = unaff_x20;
    *(long *)(puVar7 + -0xb0) = lVar13;
    *(ulong *)(puVar7 + -0xa8) = unaff_x20;
    if ((undefined *)(ulong)uVar4 < unaff_x23) goto code_r0x0055ee9c;
    puVar8 = (undefined8 *)(puVar7 + -0xd8);
    puVar23 = &UNK_0055eb18;
  }
  else {
    lVar13 = (ulong)*(ushort *)(unaff_x24 + 0x1c0) - 1;
    lVar14 = *(long *)(lVar16 + lVar13 * 8 + 0x1c8);
    unaff_x19 = (ulong)*(ushort *)(lVar14 + 0x1c2);
    if ((undefined *)0xb < (undefined *)(ulong)uVar4 + unaff_x19 + 1) {
      *(long *)(puVar7 + -0xd8) = lVar16;
      *(long *)(puVar7 + -0xd0) = lVar12;
      *(long *)(puVar7 + -200) = lVar13;
      *(long *)(puVar7 + -0xc0) = lVar14;
      *(ulong *)(puVar7 + -0xb8) = unaff_x20;
      *(undefined **)(puVar7 + -0xb0) = unaff_x24;
      *(ulong *)(puVar7 + -0xa8) = unaff_x20;
      auVar27 = func_0x0055e2f4(puVar7 + -0xd8,1);
      unaff_x23 = unaff_x23 + 1;
      goto code_r0x0055eb4c;
    }
    *(long *)(puVar7 + -0xd8) = lVar16;
    *(long *)(puVar7 + -0xd0) = lVar12;
    *(long *)(puVar7 + -200) = lVar13;
    *(long *)(puVar7 + -0xc0) = lVar14;
    *(ulong *)(puVar7 + -0xb8) = unaff_x20;
    *(undefined **)(puVar7 + -0xb0) = unaff_x24;
    *(ulong *)(puVar7 + -0xa8) = unaff_x20;
    if ((undefined *)(ulong)uVar4 < unaff_x23) goto code_r0x0055ee9c;
    puVar8 = (undefined8 *)(puVar7 + -0xd8);
    puVar23 = &UNK_0055eab8;
    puVar6 = puVar7 + -400;
  }
  goto LAB_0055e788;
LAB_0055ee58:
  func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
  unaff_x25 = puVar19;
LAB_0055ee70:
  *(undefined **)(puVar7 + -0xa0) = &UNK_009ee080;
  *(undefined8 *)(puVar7 + -0x98) = 1;
  *(undefined8 *)(puVar7 + -0x88) = 0;
  *(undefined8 *)(puVar7 + -0x80) = 0;
  *(undefined1 **)(puVar7 + -0x90) = puVar7 + -0x70;
  func_0x007a2420(puVar7 + -0xa0,&UNK_009ee090);
code_r0x0055ee9c:
  func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
  puVar23 = unaff_x27;
  auVar5 = auVar26;
code_r0x0055eeb4:
  *(undefined **)(puVar7 + -0xd8) = &UNK_009ee080;
  *(undefined8 *)(puVar7 + -0xd0) = 1;
  *(undefined8 *)(puVar7 + -0xc0) = 0;
  *(undefined8 *)(puVar7 + -0xb8) = 0;
  *(undefined1 **)(puVar7 + -200) = puVar7 + -0x70;
  auVar26 = func_0x007a2420(puVar7 + -0xd8,&UNK_009ee090);
  unaff_x27 = auVar26._8_8_;
  plVar9 = auVar26._0_8_;
  *(ulong *)(puVar7 + -0x1b0) = unaff_x20;
  *(ulong *)(puVar7 + -0x1a8) = unaff_x19;
  *(undefined1 **)(puVar7 + -0x1a0) = unaff_x29;
  *(undefined **)(puVar7 + -0x198) = &DAT_0055eee0;
  puVar22 = puVar7 + -0x1a0;
  lVar16 = plVar9[1];
  lVar12 = plVar9[2];
  if (lVar16 == 0) {
    *(long *)(puVar7 + -0x240) = *plVar9;
    *(undefined8 *)(puVar7 + -0x238) = 0;
    *(long *)(puVar7 + -0x230) = lVar12;
    auVar26 = func_0x0055e9b4(extraout_x8,puVar7 + -0x240);
    return auVar26;
  }
  lVar12 = *(long *)(*plVar9 + lVar12 * 8 + 0x1c8);
  while (lVar16 = lVar16 + -1, lVar16 != 0) {
    lVar12 = *(long *)(lVar12 + (ulong)*(ushort *)(lVar12 + 0x1c2) * 8 + 0x1c8);
  }
  uVar4 = *(ushort *)(lVar12 + 0x1c2);
  *(long *)(puVar7 + -0x228) = lVar12;
  *(undefined8 *)(puVar7 + -0x220) = 0;
  *(ulong *)(puVar7 + -0x218) = (ulong)uVar4 - 1;
  auVar26._8_8_ = puVar7 + -0x228;
  auVar26._0_8_ = puVar7 + -0x1f0;
  puVar24 = &UNK_0055ef44;
  puVar7 = puVar7 + -0x240;
  lVar16 = extraout_x8;
  goto code_r0x0055e9b4;
}


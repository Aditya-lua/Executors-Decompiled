
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

long FUN_0055e614(void)

{
  undefined4 *puVar1;
  uint *puVar2;
  undefined4 uVar3;
  ushort uVar4;
  undefined1 auVar5 [16];
  undefined1 *puVar6;
  long lVar7;
  undefined8 *puVar8;
  long *plVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  long lVar12;
  long extraout_x8;
  undefined *puVar13;
  undefined1 *puVar14;
  long lVar15;
  int iVar16;
  ulong unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x21;
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
  undefined8 uVar24;
  undefined1 auVar25 [16];
  long in_stack_00000000;
  
  auVar25._8_8_ = unaff_x22;
  auVar25._0_8_ = unaff_x21;
  _memmove();
  lVar7 = _memmove();
  if (*(long *)(unaff_x21 + 0x20) == 0) {
    if (*(long *)(unaff_x21 + 0x30) != 0) goto LAB_0055e770;
  }
  else {
    if (*(long *)(unaff_x21 + 0x30) == 0) {
LAB_0055e770:
      puVar13 = (undefined *)0x55e788;
      puVar8 = (undefined8 *)func_0x007a247c(&UNK_008ab9d9,0x28,&UNK_009ee198);
      puVar6 = (undefined1 *)register0x00000008;
LAB_0055e788:
      puVar23 = auVar25._0_8_;
      *(undefined **)(puVar6 + -0x60) = unaff_x28;
      *(undefined **)(puVar6 + -0x58) = unaff_x27;
      *(undefined **)(puVar6 + -0x50) = unaff_x26;
      *(undefined **)(puVar6 + -0x48) = unaff_x25;
      *(undefined **)(puVar6 + -0x40) = unaff_x24;
      *(undefined **)(puVar6 + -0x38) = unaff_x23;
      *(long *)(puVar6 + -0x30) = auVar25._8_8_;
      *(undefined **)(puVar6 + -0x28) = puVar23;
      *(undefined1 **)(puVar6 + -0x20) = unaff_x20;
      *(ulong *)(puVar6 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar6 + -0x10) = unaff_x29;
      *(undefined **)(puVar6 + -8) = puVar13;
      puVar22 = puVar6 + -0x10;
      lVar7 = puVar8[3];
      uVar18 = (ulong)*(ushort *)(lVar7 + 0x1c2);
      unaff_x23 = (undefined *)puVar8[5];
      unaff_x24 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
      unaff_x20 = (undefined1 *)(uVar18 + 1);
      puVar14 = unaff_x20 + (long)unaff_x24;
      if ((undefined1 *)((long)&MACH_HEADER.cpusubtype + 3) < puVar14) {
        func_0x007a247c(&UNK_008abae9,0x2a,&UNK_009ee1c8);
        puVar13 = unaff_x27;
      }
      else {
        unaff_x26 = (undefined *)*puVar8;
        uVar10 = puVar8[1];
        uVar4 = *(ushort *)(unaff_x26 + 0x1c2);
        *(ulong *)(puVar6 + -0x90) = (ulong)uVar4;
        *(undefined8 *)(puVar6 + -0x88) = uVar10;
        *(undefined8 *)(puVar6 + -0x98) = puVar8[4];
        uVar17 = puVar8[2];
        *(undefined1 **)(puVar6 + -0xa8) = puVar14;
        *(short *)(lVar7 + 0x1c2) = (short)puVar14;
        uVar10 = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 0xb8);
        *(undefined8 *)(puVar6 + -0x78) = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 0xc0);
        *(undefined8 *)(puVar6 + -0x80) = uVar10;
        *(undefined8 *)(puVar6 + -0x70) = *(undefined8 *)(unaff_x26 + uVar17 * 0x18 + 200);
        unaff_x25 = (undefined *)(~uVar17 + (ulong)uVar4);
        _memmove(unaff_x26 + uVar17 * 0x18 + 0xb8,unaff_x26 + uVar17 * 0x18 + 0xd0,
                 (long)unaff_x25 * 0x18);
        puVar8 = (undefined8 *)(lVar7 + 0xb8 + uVar18 * 0x18);
        uVar10 = *(undefined8 *)(puVar6 + -0x80);
        puVar8[1] = *(undefined8 *)(puVar6 + -0x78);
        *puVar8 = uVar10;
        puVar8[2] = *(undefined8 *)(puVar6 + -0x70);
        _memcpy(lVar7 + 0xb8 + (long)unaff_x20 * 0x18,unaff_x23 + 0xb8,(long)unaff_x24 * 0x18);
        puVar1 = (undefined4 *)(unaff_x26 + uVar17 * 0x10);
        uVar3 = *puVar1;
        unaff_x28 = *(undefined **)(puVar1 + 2);
        _memmove(puVar1,puVar1 + 4,(long)unaff_x25 * 0x10);
        *(ulong *)(puVar6 + -0xa0) = uVar18;
        puVar1 = (undefined4 *)(lVar7 + uVar18 * 0x10);
        *puVar1 = uVar3;
        *(undefined **)(puVar1 + 2) = unaff_x28;
        *(undefined1 **)(puVar6 + -0xb0) = unaff_x20;
        _memcpy(lVar7 + (long)unaff_x20 * 0x10,unaff_x23,(long)unaff_x24 << 4);
        unaff_x20 = (undefined1 *)(uVar17 + 1);
        _memmove(unaff_x26 + (long)unaff_x20 * 8 + 0x1c8,unaff_x26 + (long)unaff_x20 * 8 + 0x1d0,
                 (long)unaff_x25 * 8);
        puVar14 = *(undefined1 **)(puVar6 + -0x90);
        if (unaff_x20 < puVar14) {
          lVar12 = uVar17 + 0x3a;
          do {
            lVar15 = *(long *)(unaff_x26 + lVar12 * 8);
            *(undefined **)(lVar15 + 0xb0) = unaff_x26;
            *(short *)(lVar15 + 0x1c0) = (short)lVar12 + -0x39;
            lVar12 = lVar12 + 1;
          } while ((1 - (long)puVar14) + lVar12 != 0x3a);
        }
        *(short *)(unaff_x26 + 0x1c2) = *(short *)(unaff_x26 + 0x1c2) + -1;
        if (*(ulong *)(puVar6 + -0x88) < 2) {
          uVar10 = 0x1c8;
          goto code_r0x0055e950;
        }
        puVar23 = unaff_x24 + 1;
        uVar18 = *(ulong *)(puVar6 + -0xa0);
        puVar13 = unaff_x23;
        if (puVar23 == (undefined *)(*(long *)(puVar6 + -0xa8) - uVar18)) {
          _memcpy(lVar7 + 0x1c8 + *(long *)(puVar6 + -0xb0) * 8,unaff_x23 + 0x1c8,(long)puVar23 * 8)
          ;
          lVar12 = uVar18 + 0x3a;
          uVar10 = 0x228;
          do {
            lVar15 = *(long *)(lVar7 + lVar12 * 8);
            *(long *)(lVar15 + 0xb0) = lVar7;
            *(short *)(lVar15 + 0x1c0) = (short)lVar12 + -0x39;
            lVar12 = lVar12 + 1;
            puVar23 = puVar23 + -1;
          } while (puVar23 != (undefined *)0x0);
code_r0x0055e950:
          func_0x00187bd4(unaff_x23,uVar10,8);
          return lVar7;
        }
      }
      auVar5._8_8_ = uVar18;
      auVar5._0_8_ = puVar23;
      unaff_x27 = &UNK_009ee0c0;
      puVar23 = &DAT_0055e9b4;
      auVar25 = func_0x007a247c(&UNK_008ab922,0x28);
      puVar14 = puVar6 + -0xb0;
code_r0x0055e9b4:
      puVar11 = auVar25._8_8_;
      puVar8 = auVar25._0_8_;
      puVar6 = puVar14 + -400;
      *(undefined **)(puVar14 + -0x60) = unaff_x28;
      *(undefined **)(puVar14 + -0x58) = puVar13;
      *(undefined **)(puVar14 + -0x50) = unaff_x26;
      *(undefined **)(puVar14 + -0x48) = unaff_x25;
      *(undefined **)(puVar14 + -0x40) = unaff_x24;
      *(undefined **)(puVar14 + -0x38) = unaff_x23;
      *(long *)(puVar14 + -0x30) = auVar5._8_8_;
      *(long *)(puVar14 + -0x28) = auVar5._0_8_;
      *(undefined1 **)(puVar14 + -0x20) = unaff_x20;
      *(long *)(puVar14 + -0x18) = lVar7;
      *(undefined1 **)(puVar14 + -0x10) = puVar22;
      *(undefined **)(puVar14 + -8) = puVar23;
      unaff_x29 = puVar14 + -0x10;
      unaff_x24 = (undefined *)*puVar11;
      uVar4 = *(ushort *)(unaff_x24 + 0x1c2);
      unaff_x19 = (ulong)uVar4;
      unaff_x23 = (undefined *)puVar11[2];
      uVar10 = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 0xb8);
      *(undefined8 *)(puVar14 + -0x128) = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 0xc0)
      ;
      *(undefined8 *)(puVar14 + -0x130) = uVar10;
      *(undefined8 *)(puVar14 + -0x120) = *(undefined8 *)(unaff_x24 + (long)unaff_x23 * 0x18 + 200);
      _memmove(unaff_x24 + (long)unaff_x23 * 0x18 + 0xb8,unaff_x24 + (long)unaff_x23 * 0x18 + 0xd0,
               (~(ulong)unaff_x23 + unaff_x19) * 0x18);
      puVar2 = (uint *)(unaff_x24 + (long)unaff_x23 * 0x10);
      uVar20 = *puVar2;
      unaff_x25 = (undefined *)(ulong)uVar20;
      unaff_x26 = *(undefined **)(puVar2 + 2);
      lVar7 = _memmove(puVar2,puVar2 + 4,(~(ulong)unaff_x23 + unaff_x19) * 0x10);
      uVar4 = uVar4 - 1;
      *(ushort *)(unaff_x24 + 0x1c2) = uVar4;
      unaff_x20 = (undefined1 *)puVar11[1];
      if (4 < uVar4) goto code_r0x0055ede0;
      lVar12 = *(long *)(unaff_x24 + 0xb0);
      *(undefined8 **)(puVar14 + -0x158) = puVar8;
      *(uint *)(puVar14 + -0x15c) = uVar20;
      *(undefined **)(puVar14 + -0x168) = unaff_x26;
      *(undefined **)(puVar14 + -0x188) = unaff_x27;
      if (lVar12 == 0) {
code_r0x0055eb4c:
        unaff_x25 = *(undefined **)(unaff_x24 + 0xb0);
joined_r0x0055edd0:
        if (unaff_x25 == (undefined *)0x0) {
          puVar8 = *(undefined8 **)(puVar14 + -0x158);
          uVar20 = *(uint *)(puVar14 + -0x15c);
          unaff_x26 = *(undefined **)(puVar14 + -0x168);
        }
        else {
          *(undefined **)(puVar14 + -0x178) = unaff_x23;
          *(undefined1 **)(puVar14 + -0x170) = unaff_x20;
          *(undefined **)(puVar14 + -0x180) = unaff_x24;
          uVar4 = *(ushort *)(unaff_x25 + 0x1c2);
          if (uVar4 < 5) {
            uVar18 = *(long *)(puVar14 + -0x170) + 1;
            do {
              puVar13 = (undefined *)(ulong)uVar4;
              unaff_x28 = *(undefined **)(unaff_x25 + 0xb0);
              if (unaff_x28 == (undefined *)0x0) {
                if (uVar4 == 0) {
                  **(undefined1 **)(puVar14 + -0x188) = 1;
                }
                break;
              }
              lVar7 = uVar18 + 1;
              uVar4 = *(ushort *)(unaff_x25 + 0x1c0);
              *(long *)(puVar14 + -0x138) = lVar7;
              if (uVar4 == 0) {
                uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
                if (uVar4 == 0) goto LAB_0055ee70;
                unaff_x24 = *(undefined **)(unaff_x28 + 0x1d0);
                *(undefined **)(puVar14 + -0xd8) = unaff_x28;
                *(long *)(puVar14 + -0xd0) = lVar7;
                *(undefined8 *)(puVar14 + -200) = 0;
                *(undefined **)(puVar14 + -0xc0) = unaff_x25;
                *(ulong *)(puVar14 + -0xb8) = uVar18;
                *(undefined **)(puVar14 + -0xb0) = unaff_x24;
                *(ulong *)(puVar14 + -0xa8) = uVar18;
                unaff_x26 = puVar13 + 1;
                puVar19 = (undefined *)(ulong)*(ushort *)(unaff_x24 + 0x1c2);
                puVar23 = unaff_x26 + (long)puVar19;
                if ((undefined *)((long)&MACH_HEADER.cpusubtype + 3) < puVar23) {
                  lVar7 = func_0x0055e51c(puVar14 + -0xd8,5 - (long)puVar13);
                  break;
                }
                uVar17 = 0;
                unaff_x23 = unaff_x25;
              }
              else {
                uVar17 = (ulong)uVar4 - 1;
                unaff_x23 = *(undefined **)(unaff_x28 + uVar17 * 8 + 0x1c8);
                *(undefined **)(puVar14 + -0x110) = unaff_x28;
                *(long *)(puVar14 + -0x108) = lVar7;
                *(ulong *)(puVar14 + -0x100) = uVar17;
                *(undefined **)(puVar14 + -0xf8) = unaff_x23;
                *(ulong *)(puVar14 + -0xf0) = uVar18;
                *(undefined **)(puVar14 + -0xe8) = unaff_x25;
                *(ulong *)(puVar14 + -0xe0) = uVar18;
                puVar21 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
                if ((undefined *)0xb < puVar13 + (long)puVar21 + 1) {
                  lVar7 = func_0x0055e2f4(puVar14 + -0x110,5 - (long)puVar13);
                  break;
                }
                uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
                unaff_x26 = puVar21 + 1;
                puVar23 = unaff_x26 + (long)puVar13;
                puVar19 = puVar13;
                unaff_x24 = unaff_x25;
                puVar13 = puVar21;
              }
              unaff_x20 = (undefined1 *)(ulong)uVar4;
              *(undefined **)(puVar14 + -0x148) = puVar23;
              *(ulong *)(puVar14 + -0x140) = uVar17;
              *(short *)(unaff_x23 + 0x1c2) = (short)puVar23;
              iVar16 = (int)uVar17;
              uVar10 = *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 0xb8);
              *(undefined8 *)(puVar14 + -0x98) =
                   *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 0xc0);
              *(undefined8 *)(puVar14 + -0xa0) = uVar10;
              *(undefined8 *)(puVar14 + -0x90) =
                   *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 200);
              puVar22 = unaff_x20 + ~uVar17;
              _memmove(unaff_x28 + (long)iVar16 * 0x18 + 0xb8,unaff_x28 + (long)iVar16 * 0x18 + 0xd0
                       ,(long)puVar22 * 0x18);
              puVar8 = (undefined8 *)(unaff_x23 + (long)puVar13 * 0x18 + 0xb8);
              uVar10 = *(undefined8 *)(puVar14 + -0x90);
              uVar24 = *(undefined8 *)(puVar14 + -0xa0);
              puVar8[1] = *(undefined8 *)(puVar14 + -0x98);
              *puVar8 = uVar24;
              puVar8[2] = uVar10;
              _memcpy(unaff_x23 + (long)unaff_x26 * 0x18 + 0xb8,unaff_x24 + 0xb8,
                      (long)puVar19 * 0x18);
              puVar1 = (undefined4 *)(unaff_x28 + uVar17 * 0x10);
              uVar3 = *puVar1;
              auVar25._8_4_ = uVar3;
              auVar25._0_8_ = puVar22;
              auVar25._12_4_ = 0;
              uVar10 = *(undefined8 *)(puVar1 + 2);
              _memmove(puVar1,puVar1 + 4,(long)puVar22 * 0x10);
              *(undefined **)(puVar14 + -0x150) = puVar13;
              *(undefined4 *)(unaff_x23 + (long)puVar13 * 0x10) = uVar3;
              *(undefined8 *)((long)(unaff_x23 + (long)puVar13 * 0x10) + 8) = uVar10;
              _memcpy(unaff_x23 + (long)unaff_x26 * 0x10,unaff_x24,(long)puVar19 << 4);
              puVar6 = (undefined1 *)(*(long *)(puVar14 + -0x140) + 1);
              _memmove(unaff_x28 + (long)puVar6 * 8 + 0x1c8,unaff_x28 + (long)puVar6 * 8 + 0x1d0,
                       (long)puVar22 * 8);
              if (puVar6 < unaff_x20) {
                do {
                  lVar7 = *(long *)(unaff_x28 + (long)puVar6 * 8 + 0x1c8);
                  *(short *)(lVar7 + 0x1c0) = (short)puVar6;
                  puVar6 = puVar6 + 1;
                  *(undefined **)(lVar7 + 0xb0) = unaff_x28;
                } while (unaff_x20 != puVar6);
              }
              *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
              uVar18 = *(ulong *)(puVar14 + -0x138);
              unaff_x19 = uVar18;
              unaff_x27 = puVar13;
              if (uVar18 < 2) {
                uVar10 = 0x1c8;
              }
              else {
                unaff_x20 = *(undefined1 **)(puVar14 + -0x148);
                if (puVar19 + 1 != unaff_x20 + -*(long *)(puVar14 + -0x150)) goto LAB_0055ee58;
                _memcpy(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8,unaff_x24 + 0x1c8,
                        (long)(puVar19 + 1) * 8);
                do {
                  lVar7 = *(long *)(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8);
                  *(short *)(lVar7 + 0x1c0) = (short)unaff_x26;
                  unaff_x26 = unaff_x26 + 1;
                  *(undefined **)(lVar7 + 0xb0) = unaff_x23;
                } while (unaff_x20 + 1 != unaff_x26);
                uVar10 = 0x228;
              }
              lVar7 = func_0x00187bd4(unaff_x24,uVar10,8);
              uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
              unaff_x25 = unaff_x28;
              if (4 < uVar4) break;
            } while( true );
          }
          puVar8 = *(undefined8 **)(puVar14 + -0x158);
          unaff_x24 = *(undefined **)(puVar14 + -0x180);
          unaff_x23 = *(undefined **)(puVar14 + -0x178);
          uVar20 = *(uint *)(puVar14 + -0x15c);
          unaff_x20 = *(undefined1 **)(puVar14 + -0x170);
          unaff_x26 = *(undefined **)(puVar14 + -0x168);
        }
code_r0x0055ede0:
        uVar10 = *(undefined8 *)(puVar14 + -0x130);
        puVar8[1] = *(undefined8 *)(puVar14 + -0x128);
        *puVar8 = uVar10;
        puVar8[2] = *(undefined8 *)(puVar14 + -0x120);
        *(uint *)(puVar8 + 3) = uVar20;
        puVar8[4] = unaff_x26;
        puVar8[5] = unaff_x24;
        puVar8[6] = unaff_x20;
        puVar8[7] = unaff_x23;
        return lVar7;
      }
      puVar22 = unaff_x20 + 1;
      if (*(ushort *)(unaff_x24 + 0x1c0) == 0) {
        puVar13 = unaff_x27;
        auVar5 = auVar25;
        if (*(short *)(lVar12 + 0x1c2) == 0) goto code_r0x0055eeb4;
        lVar7 = *(long *)(lVar12 + 0x1d0);
        if ((undefined *)0xb < (undefined *)(ulong)uVar4 + (ulong)*(ushort *)(lVar7 + 0x1c2) + 1) {
          *(long *)(puVar14 + -0xd8) = lVar12;
          *(undefined1 **)(puVar14 + -0xd0) = puVar22;
          *(undefined8 *)(puVar14 + -200) = 0;
          *(undefined **)(puVar14 + -0xc0) = unaff_x24;
          *(undefined1 **)(puVar14 + -0xb8) = unaff_x20;
          *(long *)(puVar14 + -0xb0) = lVar7;
          *(undefined1 **)(puVar14 + -0xa8) = unaff_x20;
          lVar7 = func_0x0055e51c(puVar14 + -0xd8,1);
          unaff_x25 = *(undefined **)(unaff_x24 + 0xb0);
          goto joined_r0x0055edd0;
        }
        *(long *)(puVar14 + -0xd8) = lVar12;
        *(undefined1 **)(puVar14 + -0xd0) = puVar22;
        *(undefined8 *)(puVar14 + -200) = 0;
        *(undefined **)(puVar14 + -0xc0) = unaff_x24;
        *(undefined1 **)(puVar14 + -0xb8) = unaff_x20;
        *(long *)(puVar14 + -0xb0) = lVar7;
        *(undefined1 **)(puVar14 + -0xa8) = unaff_x20;
        if ((undefined *)(ulong)uVar4 < unaff_x23) goto code_r0x0055ee9c;
        puVar8 = (undefined8 *)(puVar14 + -0xd8);
        puVar13 = &UNK_0055eb18;
      }
      else {
        lVar7 = (ulong)*(ushort *)(unaff_x24 + 0x1c0) - 1;
        lVar15 = *(long *)(lVar12 + lVar7 * 8 + 0x1c8);
        unaff_x19 = (ulong)*(ushort *)(lVar15 + 0x1c2);
        if ((undefined *)0xb < (undefined *)(ulong)uVar4 + unaff_x19 + 1) {
          *(long *)(puVar14 + -0xd8) = lVar12;
          *(undefined1 **)(puVar14 + -0xd0) = puVar22;
          *(long *)(puVar14 + -200) = lVar7;
          *(long *)(puVar14 + -0xc0) = lVar15;
          *(undefined1 **)(puVar14 + -0xb8) = unaff_x20;
          *(undefined **)(puVar14 + -0xb0) = unaff_x24;
          *(undefined1 **)(puVar14 + -0xa8) = unaff_x20;
          lVar7 = func_0x0055e2f4(puVar14 + -0xd8,1);
          unaff_x23 = unaff_x23 + 1;
          goto code_r0x0055eb4c;
        }
        *(long *)(puVar14 + -0xd8) = lVar12;
        *(undefined1 **)(puVar14 + -0xd0) = puVar22;
        *(long *)(puVar14 + -200) = lVar7;
        *(long *)(puVar14 + -0xc0) = lVar15;
        *(undefined1 **)(puVar14 + -0xb8) = unaff_x20;
        *(undefined **)(puVar14 + -0xb0) = unaff_x24;
        *(undefined1 **)(puVar14 + -0xa8) = unaff_x20;
        if ((undefined *)(ulong)uVar4 < unaff_x23) goto code_r0x0055ee9c;
        puVar8 = (undefined8 *)(puVar14 + -0xd8);
        puVar13 = &UNK_0055eab8;
        puVar6 = puVar14 + -400;
      }
      goto LAB_0055e788;
    }
    lVar7 = unaff_x19 + 0x1c8;
    _memcpy(unaff_x24 + (long)unaff_x27 * 8 + 0x1c8,lVar7,(long)unaff_x20 * 8);
    lVar7 = _memmove(lVar7,lVar7 + (long)unaff_x20 * 8,(long)unaff_x28 * 8 + 8);
    lVar12 = *(long *)(unaff_x24 + (long)unaff_x27 * 8 + 0x1c8);
    *(undefined **)(lVar12 + 0xb0) = unaff_x24;
    *(short *)(lVar12 + 0x1c0) = (short)unaff_x27;
    if (unaff_x20 != (undefined1 *)((long)&MACH_HEADER.magic + 1U)) {
      lVar12 = *(long *)(unaff_x24 + (in_stack_00000000 + 2) * 8 + 0x1c8);
      *(undefined **)(lVar12 + 0xb0) = unaff_x24;
      *(short *)(lVar12 + 0x1c0) = (short)(in_stack_00000000 + 2);
      if (unaff_x20 != (undefined1 *)((long)&MACH_HEADER.magic + 2U)) {
        lVar12 = *(long *)(unaff_x24 + (in_stack_00000000 + 3) * 8 + 0x1c8);
        *(undefined **)(lVar12 + 0xb0) = unaff_x24;
        *(short *)(lVar12 + 0x1c0) = (short)(in_stack_00000000 + 3);
        if (unaff_x20 != (undefined1 *)((long)&MACH_HEADER.magic + 3U)) {
          lVar12 = *(long *)(unaff_x24 + (in_stack_00000000 + 4) * 8 + 0x1c8);
          *(undefined **)(lVar12 + 0xb0) = unaff_x24;
          *(short *)(lVar12 + 0x1c0) = (short)(in_stack_00000000 + 4);
          if ((dword *)unaff_x20 != &MACH_HEADER.cputype) {
            lVar12 = *(long *)(unaff_x24 + (in_stack_00000000 + 5) * 8 + 0x1c8);
            *(undefined **)(lVar12 + 0xb0) = unaff_x24;
            *(short *)(lVar12 + 0x1c0) = (short)(in_stack_00000000 + 5);
          }
        }
      }
    }
    puVar13 = (undefined *)0x0;
    do {
      lVar12 = *(long *)(unaff_x19 + (long)puVar13 * 8 + 0x1c8);
      *(short *)(lVar12 + 0x1c0) = (short)puVar13;
      puVar13 = puVar13 + 1;
      *(ulong *)(lVar12 + 0xb0) = unaff_x19;
    } while (unaff_x28 + 1 != puVar13);
  }
  return lVar7;
LAB_0055ee58:
  func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
  unaff_x25 = puVar19;
LAB_0055ee70:
  *(undefined **)(puVar14 + -0xa0) = &UNK_009ee080;
  *(undefined8 *)(puVar14 + -0x98) = 1;
  *(undefined8 *)(puVar14 + -0x88) = 0;
  *(undefined8 *)(puVar14 + -0x80) = 0;
  *(undefined1 **)(puVar14 + -0x90) = puVar14 + -0x70;
  func_0x007a2420(puVar14 + -0xa0,&UNK_009ee090);
code_r0x0055ee9c:
  func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
  puVar13 = unaff_x27;
  auVar5 = auVar25;
code_r0x0055eeb4:
  *(undefined **)(puVar14 + -0xd8) = &UNK_009ee080;
  *(undefined8 *)(puVar14 + -0xd0) = 1;
  *(undefined8 *)(puVar14 + -0xc0) = 0;
  *(undefined8 *)(puVar14 + -0xb8) = 0;
  *(undefined1 **)(puVar14 + -200) = puVar14 + -0x70;
  auVar25 = func_0x007a2420(puVar14 + -0xd8,&UNK_009ee090);
  unaff_x27 = auVar25._8_8_;
  plVar9 = auVar25._0_8_;
  *(undefined1 **)(puVar14 + -0x1b0) = unaff_x20;
  *(ulong *)(puVar14 + -0x1a8) = unaff_x19;
  *(undefined1 **)(puVar14 + -0x1a0) = unaff_x29;
  *(undefined **)(puVar14 + -0x198) = &DAT_0055eee0;
  puVar22 = puVar14 + -0x1a0;
  lVar7 = plVar9[1];
  lVar12 = plVar9[2];
  if (lVar7 == 0) {
    *(long *)(puVar14 + -0x240) = *plVar9;
    *(undefined8 *)(puVar14 + -0x238) = 0;
    *(long *)(puVar14 + -0x230) = lVar12;
    lVar7 = func_0x0055e9b4(extraout_x8,puVar14 + -0x240);
    return lVar7;
  }
  lVar12 = *(long *)(*plVar9 + lVar12 * 8 + 0x1c8);
  while (lVar7 = lVar7 + -1, lVar7 != 0) {
    lVar12 = *(long *)(lVar12 + (ulong)*(ushort *)(lVar12 + 0x1c2) * 8 + 0x1c8);
  }
  uVar4 = *(ushort *)(lVar12 + 0x1c2);
  *(long *)(puVar14 + -0x228) = lVar12;
  *(undefined8 *)(puVar14 + -0x220) = 0;
  *(ulong *)(puVar14 + -0x218) = (ulong)uVar4 - 1;
  auVar25._8_8_ = puVar14 + -0x228;
  auVar25._0_8_ = puVar14 + -0x1f0;
  puVar23 = &UNK_0055ef44;
  puVar14 = puVar14 + -0x240;
  lVar7 = extraout_x8;
  goto code_r0x0055e9b4;
}


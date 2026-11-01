
/* WARNING: Possible PIC construction at 0x0055ef40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0055ef44) */
/* WARNING: Removing unreachable block (ram,0x0055ef6c) */
/* WARNING: Removing unreachable block (ram,0x0055ef84) */
/* WARNING: Removing unreachable block (ram,0x0055efc8) */
/* WARNING: Removing unreachable block (ram,0x0055efd0) */
/* WARNING: Removing unreachable block (ram,0x0055efe0) */
/* WARNING: Removing unreachable block (ram,0x0055efe4) */

void FUN_0055e988(long param_1)

{
  long lVar1;
  uint *puVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  ushort uVar5;
  undefined1 auVar6 [16];
  undefined1 *puVar7;
  long *plVar8;
  undefined *puVar9;
  long lVar10;
  long lVar11;
  undefined8 extraout_x8;
  ulong uVar12;
  undefined8 uVar13;
  long lVar14;
  undefined *puVar15;
  long lVar16;
  int iVar17;
  undefined8 unaff_x19;
  ulong uVar18;
  ulong uVar19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 *puVar20;
  undefined8 unaff_x22;
  undefined *unaff_x23;
  undefined8 unaff_x24;
  long lVar21;
  undefined *puVar22;
  uint uVar23;
  undefined *unaff_x25;
  undefined *unaff_x26;
  undefined *unaff_x27;
  undefined *puVar24;
  undefined *unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar25;
  undefined8 uVar26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  
  auVar28._8_8_ = unaff_x20;
  auVar28._0_8_ = unaff_x24;
  auVar6._8_8_ = unaff_x22;
  auVar6._0_8_ = unaff_x21;
  func_0x007a247c(param_1 + 0xae9,0x2a,&UNK_009ee1c8);
  puVar9 = &UNK_009ee0c0;
  puVar25 = (undefined *)0x55e9b4;
  auVar27 = func_0x007a247c(&UNK_008ab922,0x28);
  puVar7 = (undefined1 *)register0x00000008;
LAB_0055e9b4:
  plVar8 = auVar27._8_8_;
  puVar20 = auVar27._0_8_;
  *(undefined **)(puVar7 + -0x60) = unaff_x28;
  *(undefined **)(puVar7 + -0x58) = unaff_x27;
  *(undefined **)(puVar7 + -0x50) = unaff_x26;
  *(undefined **)(puVar7 + -0x48) = unaff_x25;
  *(long *)(puVar7 + -0x40) = auVar28._0_8_;
  *(undefined **)(puVar7 + -0x38) = unaff_x23;
  *(long *)(puVar7 + -0x30) = auVar6._8_8_;
  *(long *)(puVar7 + -0x28) = auVar6._0_8_;
  *(long *)(puVar7 + -0x20) = auVar28._8_8_;
  *(undefined8 *)(puVar7 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar7 + -0x10) = unaff_x29;
  *(undefined **)(puVar7 + -8) = puVar25;
  lVar21 = *plVar8;
  uVar5 = *(ushort *)(lVar21 + 0x1c2);
  uVar18 = (ulong)uVar5;
  unaff_x23 = (undefined *)plVar8[2];
  lVar10 = lVar21 + (long)unaff_x23 * 0x18;
  uVar13 = *(undefined8 *)(lVar10 + 0xb8);
  *(undefined8 *)(puVar7 + -0x128) = *(undefined8 *)(lVar10 + 0xc0);
  *(undefined8 *)(puVar7 + -0x130) = uVar13;
  *(undefined8 *)(puVar7 + -0x120) = *(undefined8 *)(lVar10 + 200);
  _memmove(lVar10 + 0xb8,lVar10 + 0xd0,(~(ulong)unaff_x23 + uVar18) * 0x18);
  puVar2 = (uint *)(lVar21 + (long)unaff_x23 * 0x10);
  uVar23 = *puVar2;
  unaff_x25 = (undefined *)(ulong)uVar23;
  unaff_x26 = *(undefined **)(puVar2 + 2);
  _memmove(puVar2,puVar2 + 4,(~(ulong)unaff_x23 + uVar18) * 0x10);
  uVar5 = uVar5 - 1;
  *(ushort *)(lVar21 + 0x1c2) = uVar5;
  lVar10 = plVar8[1];
  auVar28._8_8_ = lVar10;
  auVar28._0_8_ = lVar21;
  if (uVar5 < 5) {
    lVar11 = *(long *)(lVar21 + 0xb0);
    *(undefined8 **)(puVar7 + -0x158) = puVar20;
    *(uint *)(puVar7 + -0x15c) = uVar23;
    *(undefined **)(puVar7 + -0x168) = unaff_x26;
    *(undefined **)(puVar7 + -0x188) = puVar9;
    if (lVar11 != 0) {
      lVar1 = lVar10 + 1;
      if (*(ushort *)(lVar21 + 0x1c0) != 0) {
        lVar14 = (ulong)*(ushort *)(lVar21 + 0x1c0) - 1;
        lVar16 = *(long *)(lVar11 + lVar14 * 8 + 0x1c8);
        uVar18 = (ulong)*(ushort *)(lVar16 + 0x1c2);
        if ((undefined *)0xb < (undefined *)(ulong)uVar5 + uVar18 + 1) {
          *(long *)(puVar7 + -0xd8) = lVar11;
          *(long *)(puVar7 + -0xd0) = lVar1;
          *(long *)(puVar7 + -200) = lVar14;
          *(long *)(puVar7 + -0xc0) = lVar16;
          *(long *)(puVar7 + -0xb8) = lVar10;
          *(long *)(puVar7 + -0xb0) = lVar21;
          *(long *)(puVar7 + -0xa8) = lVar10;
          func_0x0055e2f4(puVar7 + -0xd8,1);
          unaff_x23 = unaff_x23 + 1;
          goto code_r0x0055eb4c;
        }
        *(long *)(puVar7 + -0xd8) = lVar11;
        *(long *)(puVar7 + -0xd0) = lVar1;
        *(long *)(puVar7 + -200) = lVar14;
        *(long *)(puVar7 + -0xc0) = lVar16;
        *(long *)(puVar7 + -0xb8) = lVar10;
        *(long *)(puVar7 + -0xb0) = lVar21;
        *(long *)(puVar7 + -0xa8) = lVar10;
        if (unaff_x23 <= (undefined *)(ulong)uVar5) {
          auVar28 = func_0x0055e788(puVar7 + -0xd8);
          unaff_x23 = unaff_x23 + uVar18 + 1;
          unaff_x25 = *(undefined **)(auVar28._0_8_ + 0xb0);
          goto joined_r0x0055eacc;
        }
        goto code_r0x0055ee9c;
      }
      unaff_x27 = puVar9;
      auVar6 = auVar27;
      if (*(short *)(lVar11 + 0x1c2) != 0) {
        lVar14 = *(long *)(lVar11 + 0x1d0);
        if ((undefined *)(ulong)uVar5 + (ulong)*(ushort *)(lVar14 + 0x1c2) + 1 < (undefined *)0xc) {
          *(long *)(puVar7 + -0xd8) = lVar11;
          *(long *)(puVar7 + -0xd0) = lVar1;
          *(undefined8 *)(puVar7 + -200) = 0;
          *(long *)(puVar7 + -0xc0) = lVar21;
          *(long *)(puVar7 + -0xb8) = lVar10;
          *(long *)(puVar7 + -0xb0) = lVar14;
          *(long *)(puVar7 + -0xa8) = lVar10;
          if ((undefined *)(ulong)uVar5 < unaff_x23) goto code_r0x0055ee9c;
          auVar28 = func_0x0055e788(puVar7 + -0xd8);
          unaff_x25 = *(undefined **)(auVar28._0_8_ + 0xb0);
        }
        else {
          *(long *)(puVar7 + -0xd8) = lVar11;
          *(long *)(puVar7 + -0xd0) = lVar1;
          *(undefined8 *)(puVar7 + -200) = 0;
          *(long *)(puVar7 + -0xc0) = lVar21;
          *(long *)(puVar7 + -0xb8) = lVar10;
          *(long *)(puVar7 + -0xb0) = lVar14;
          *(long *)(puVar7 + -0xa8) = lVar10;
          func_0x0055e51c(puVar7 + -0xd8,1);
          unaff_x25 = *(undefined **)(lVar21 + 0xb0);
        }
        goto joined_r0x0055eacc;
      }
      goto code_r0x0055eeb4;
    }
code_r0x0055eb4c:
    unaff_x25 = *(undefined **)(lVar21 + 0xb0);
joined_r0x0055eacc:
    if (unaff_x25 == (undefined *)0x0) {
      puVar20 = *(undefined8 **)(puVar7 + -0x158);
      uVar23 = *(uint *)(puVar7 + -0x15c);
      unaff_x26 = *(undefined **)(puVar7 + -0x168);
    }
    else {
      *(undefined **)(puVar7 + -0x178) = unaff_x23;
      *(long *)(puVar7 + -0x170) = auVar28._8_8_;
      *(long *)(puVar7 + -0x180) = auVar28._0_8_;
      uVar5 = *(ushort *)(unaff_x25 + 0x1c2);
      if (uVar5 < 5) {
        uVar19 = *(long *)(puVar7 + -0x170) + 1;
        do {
          puVar25 = (undefined *)(ulong)uVar5;
          unaff_x28 = *(undefined **)(unaff_x25 + 0xb0);
          if (unaff_x28 == (undefined *)0x0) {
            if (uVar5 == 0) {
              **(undefined1 **)(puVar7 + -0x188) = 1;
            }
            break;
          }
          lVar10 = uVar19 + 1;
          uVar5 = *(ushort *)(unaff_x25 + 0x1c0);
          *(long *)(puVar7 + -0x138) = lVar10;
          if (uVar5 == 0) {
            uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
            if (uVar5 == 0) goto code_r0x0055ee70;
            puVar15 = *(undefined **)(unaff_x28 + 0x1d0);
            *(undefined **)(puVar7 + -0xd8) = unaff_x28;
            *(long *)(puVar7 + -0xd0) = lVar10;
            *(undefined8 *)(puVar7 + -200) = 0;
            *(undefined **)(puVar7 + -0xc0) = unaff_x25;
            *(ulong *)(puVar7 + -0xb8) = uVar19;
            *(undefined **)(puVar7 + -0xb0) = puVar15;
            *(ulong *)(puVar7 + -0xa8) = uVar19;
            unaff_x26 = puVar25 + 1;
            puVar22 = (undefined *)(ulong)*(ushort *)(puVar15 + 0x1c2);
            puVar9 = unaff_x26 + (long)puVar22;
            if ((undefined *)0xb < puVar9) {
              func_0x0055e51c(puVar7 + -0xd8,5 - (long)puVar25);
              break;
            }
            uVar18 = 0;
            unaff_x23 = unaff_x25;
          }
          else {
            uVar18 = (ulong)uVar5 - 1;
            unaff_x23 = *(undefined **)(unaff_x28 + uVar18 * 8 + 0x1c8);
            *(undefined **)(puVar7 + -0x110) = unaff_x28;
            *(long *)(puVar7 + -0x108) = lVar10;
            *(ulong *)(puVar7 + -0x100) = uVar18;
            *(undefined **)(puVar7 + -0xf8) = unaff_x23;
            *(ulong *)(puVar7 + -0xf0) = uVar19;
            *(undefined **)(puVar7 + -0xe8) = unaff_x25;
            *(ulong *)(puVar7 + -0xe0) = uVar19;
            puVar24 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
            if ((undefined *)0xb < puVar25 + (long)puVar24 + 1) {
              func_0x0055e2f4(puVar7 + -0x110,5 - (long)puVar25);
              break;
            }
            uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
            unaff_x26 = puVar24 + 1;
            puVar9 = unaff_x26 + (long)puVar25;
            puVar22 = puVar25;
            puVar15 = unaff_x25;
            puVar25 = puVar24;
          }
          uVar12 = (ulong)uVar5;
          *(undefined **)(puVar7 + -0x148) = puVar9;
          *(ulong *)(puVar7 + -0x140) = uVar18;
          *(short *)(unaff_x23 + 0x1c2) = (short)puVar9;
          iVar17 = (int)uVar18;
          uVar13 = *(undefined8 *)(unaff_x28 + (long)iVar17 * 0x18 + 0xb8);
          *(undefined8 *)(puVar7 + -0x98) = *(undefined8 *)(unaff_x28 + (long)iVar17 * 0x18 + 0xc0);
          *(undefined8 *)(puVar7 + -0xa0) = uVar13;
          *(undefined8 *)(puVar7 + -0x90) = *(undefined8 *)(unaff_x28 + (long)iVar17 * 0x18 + 200);
          lVar10 = ~uVar18 + uVar12;
          _memmove(unaff_x28 + (long)iVar17 * 0x18 + 0xb8,unaff_x28 + (long)iVar17 * 0x18 + 0xd0,
                   lVar10 * 0x18);
          puVar20 = (undefined8 *)(unaff_x23 + (long)puVar25 * 0x18 + 0xb8);
          uVar13 = *(undefined8 *)(puVar7 + -0x90);
          uVar26 = *(undefined8 *)(puVar7 + -0xa0);
          puVar20[1] = *(undefined8 *)(puVar7 + -0x98);
          *puVar20 = uVar26;
          puVar20[2] = uVar13;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x18 + 0xb8,puVar15 + 0xb8,(long)puVar22 * 0x18);
          puVar3 = (undefined4 *)(unaff_x28 + uVar18 * 0x10);
          uVar4 = *puVar3;
          auVar27._8_4_ = uVar4;
          auVar27._0_8_ = lVar10;
          auVar27._12_4_ = 0;
          uVar13 = *(undefined8 *)(puVar3 + 2);
          _memmove(puVar3,puVar3 + 4,lVar10 * 0x10);
          *(undefined **)(puVar7 + -0x150) = puVar25;
          *(undefined4 *)(unaff_x23 + (long)puVar25 * 0x10) = uVar4;
          *(undefined8 *)((long)(unaff_x23 + (long)puVar25 * 0x10) + 8) = uVar13;
          _memcpy(unaff_x23 + (long)unaff_x26 * 0x10,puVar15,(long)puVar22 << 4);
          uVar18 = *(long *)(puVar7 + -0x140) + 1;
          _memmove(unaff_x28 + uVar18 * 8 + 0x1c8,unaff_x28 + uVar18 * 8 + 0x1d0,lVar10 * 8);
          if (uVar18 < uVar12) {
            do {
              lVar10 = *(long *)(unaff_x28 + uVar18 * 8 + 0x1c8);
              *(short *)(lVar10 + 0x1c0) = (short)uVar18;
              uVar18 = uVar18 + 1;
              *(undefined **)(lVar10 + 0xb0) = unaff_x28;
            } while (uVar12 != uVar18);
          }
          *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
          uVar19 = *(ulong *)(puVar7 + -0x138);
          uVar18 = uVar19;
          puVar9 = puVar25;
          if (uVar19 < 2) {
            uVar13 = 0x1c8;
          }
          else {
            uVar12 = *(ulong *)(puVar7 + -0x148);
            auVar28._8_8_ = uVar12;
            auVar28._0_8_ = puVar15;
            if (puVar22 + 1 != (undefined *)(uVar12 - *(long *)(puVar7 + -0x150)))
            goto code_r0x0055ee58;
            _memcpy(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8,puVar15 + 0x1c8,(long)(puVar22 + 1) * 8)
            ;
            do {
              lVar10 = *(long *)(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8);
              *(short *)(lVar10 + 0x1c0) = (short)unaff_x26;
              unaff_x26 = unaff_x26 + 1;
              *(undefined **)(lVar10 + 0xb0) = unaff_x23;
            } while ((undefined *)(uVar12 + 1) != unaff_x26);
            uVar13 = 0x228;
          }
          auVar28._8_8_ = uVar12;
          auVar28._0_8_ = puVar15;
          func_0x00187bd4(puVar15,uVar13,8);
          uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
          unaff_x25 = unaff_x28;
          if (4 < uVar5) break;
        } while( true );
      }
      puVar20 = *(undefined8 **)(puVar7 + -0x158);
      unaff_x23 = *(undefined **)(puVar7 + -0x178);
      uVar23 = *(uint *)(puVar7 + -0x15c);
      auVar28._8_8_ = *(undefined8 *)(puVar7 + -0x170);
      auVar28._0_8_ = *(undefined8 *)(puVar7 + -0x180);
      unaff_x26 = *(undefined **)(puVar7 + -0x168);
    }
  }
  uVar13 = *(undefined8 *)(puVar7 + -0x130);
  puVar20[1] = *(undefined8 *)(puVar7 + -0x128);
  *puVar20 = uVar13;
  puVar20[2] = *(undefined8 *)(puVar7 + -0x120);
  *(uint *)(puVar20 + 3) = uVar23;
  puVar20[4] = unaff_x26;
  *(undefined1 (*) [16])(puVar20 + 5) = auVar28;
  puVar20[7] = unaff_x23;
  return;
code_r0x0055ee58:
  func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
  unaff_x25 = puVar22;
code_r0x0055ee70:
  *(undefined **)(puVar7 + -0xa0) = &UNK_009ee080;
  *(undefined8 *)(puVar7 + -0x98) = 1;
  *(undefined8 *)(puVar7 + -0x88) = 0;
  *(undefined8 *)(puVar7 + -0x80) = 0;
  *(undefined1 **)(puVar7 + -0x90) = puVar7 + -0x70;
  func_0x007a2420(puVar7 + -0xa0,&UNK_009ee090);
code_r0x0055ee9c:
  func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
  unaff_x27 = puVar9;
  auVar6 = auVar27;
code_r0x0055eeb4:
  *(undefined **)(puVar7 + -0xd8) = &UNK_009ee080;
  *(undefined8 *)(puVar7 + -0xd0) = 1;
  *(undefined8 *)(puVar7 + -0xc0) = 0;
  *(undefined8 *)(puVar7 + -0xb8) = 0;
  *(undefined1 **)(puVar7 + -200) = puVar7 + -0x70;
  auVar27 = func_0x007a2420(puVar7 + -0xd8,&UNK_009ee090);
  puVar9 = auVar27._8_8_;
  plVar8 = auVar27._0_8_;
  *(long *)(puVar7 + -0x1b0) = auVar28._8_8_;
  *(ulong *)(puVar7 + -0x1a8) = uVar18;
  *(undefined1 **)(puVar7 + -0x1a0) = puVar7 + -0x10;
  *(undefined **)(puVar7 + -0x198) = &DAT_0055eee0;
  unaff_x29 = puVar7 + -0x1a0;
  lVar10 = plVar8[1];
  lVar21 = plVar8[2];
  if (lVar10 == 0) {
    *(long *)(puVar7 + -0x240) = *plVar8;
    *(undefined8 *)(puVar7 + -0x238) = 0;
    *(long *)(puVar7 + -0x230) = lVar21;
    func_0x0055e9b4(extraout_x8,puVar7 + -0x240);
    return;
  }
  lVar21 = *(long *)(*plVar8 + lVar21 * 8 + 0x1c8);
  while (lVar10 = lVar10 + -1, lVar10 != 0) {
    lVar21 = *(long *)(lVar21 + (ulong)*(ushort *)(lVar21 + 0x1c2) * 8 + 0x1c8);
  }
  uVar5 = *(ushort *)(lVar21 + 0x1c2);
  *(long *)(puVar7 + -0x228) = lVar21;
  *(undefined8 *)(puVar7 + -0x220) = 0;
  *(ulong *)(puVar7 + -0x218) = (ulong)uVar5 - 1;
  auVar27._8_8_ = puVar7 + -0x228;
  auVar27._0_8_ = puVar7 + -0x1f0;
  puVar25 = &UNK_0055ef44;
  puVar7 = puVar7 + -0x240;
  unaff_x19 = extraout_x8;
  goto LAB_0055e9b4;
}


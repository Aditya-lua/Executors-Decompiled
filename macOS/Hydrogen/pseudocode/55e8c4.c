
/* WARNING: Possible PIC construction at 0x0055ef40: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0055ef44) */
/* WARNING: Removing unreachable block (ram,0x0055ef6c) */
/* WARNING: Removing unreachable block (ram,0x0055ef84) */
/* WARNING: Removing unreachable block (ram,0x0055efc8) */
/* WARNING: Removing unreachable block (ram,0x0055efd0) */
/* WARNING: Removing unreachable block (ram,0x0055efe0) */
/* WARNING: Removing unreachable block (ram,0x0055efe4) */

void FUN_0055e8c4(long param_1)

{
  uint *puVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  ushort uVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  long *plVar7;
  undefined *puVar8;
  long lVar9;
  long extraout_x8;
  long lVar10;
  long in_x9;
  long lVar11;
  ulong uVar12;
  long in_x10;
  int in_w11;
  long lVar13;
  undefined *puVar14;
  long lVar15;
  int iVar16;
  long unaff_x19;
  ulong uVar17;
  ulong uVar18;
  undefined8 unaff_x20;
  undefined8 *puVar19;
  undefined *unaff_x23;
  long unaff_x24;
  long lVar20;
  undefined *puVar21;
  uint uVar22;
  undefined *unaff_x25;
  undefined *unaff_x26;
  undefined *unaff_x27;
  undefined *puVar23;
  undefined *unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  ulong in_stack_00000028;
  
  lVar9 = in_stack_00000010;
  auVar27._8_8_ = unaff_x20;
  auVar27._0_8_ = unaff_x24;
  while( true ) {
    *(short *)(in_x10 + 0x1c0) = (short)in_w11;
    param_1 = param_1 + 1;
    if (in_x9 + param_1 == 0x3a) break;
    in_x10 = *(long *)(unaff_x26 + param_1 * 8);
    in_w11 = (int)param_1 + -0x39;
    *(undefined **)(in_x10 + 0xb0) = unaff_x26;
  }
  *(short *)(unaff_x26 + 0x1c2) = *(short *)(unaff_x26 + 0x1c2) + -1;
  if (in_stack_00000028 < 2) {
    uVar6 = 0x1c8;
  }
  else {
    lVar20 = unaff_x24 + 1;
    if (lVar20 != in_stack_00000008 - in_stack_00000010) {
      puVar8 = &UNK_009ee0c0;
      puVar24 = (undefined *)0x55e9b4;
      auVar26 = func_0x007a247c(&UNK_008ab922,0x28);
      puVar5 = (undefined1 *)register0x00000008;
LAB_0055e9b4:
      plVar7 = auVar26._8_8_;
      puVar19 = auVar26._0_8_;
      *(undefined **)(puVar5 + -0x60) = unaff_x28;
      *(undefined **)(puVar5 + -0x58) = unaff_x27;
      *(undefined **)(puVar5 + -0x50) = unaff_x26;
      *(undefined **)(puVar5 + -0x48) = unaff_x25;
      *(long *)(puVar5 + -0x40) = auVar27._0_8_;
      *(undefined **)(puVar5 + -0x38) = unaff_x23;
      *(long *)(puVar5 + -0x30) = lVar9;
      *(long *)(puVar5 + -0x28) = lVar20;
      *(long *)(puVar5 + -0x20) = auVar27._8_8_;
      *(long *)(puVar5 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
      *(undefined **)(puVar5 + -8) = puVar24;
      lVar20 = *plVar7;
      uVar4 = *(ushort *)(lVar20 + 0x1c2);
      uVar17 = (ulong)uVar4;
      unaff_x23 = (undefined *)plVar7[2];
      lVar9 = lVar20 + (long)unaff_x23 * 0x18;
      uVar6 = *(undefined8 *)(lVar9 + 0xb8);
      *(undefined8 *)(puVar5 + -0x128) = *(undefined8 *)(lVar9 + 0xc0);
      *(undefined8 *)(puVar5 + -0x130) = uVar6;
      *(undefined8 *)(puVar5 + -0x120) = *(undefined8 *)(lVar9 + 200);
      _memmove(lVar9 + 0xb8,lVar9 + 0xd0,(~(ulong)unaff_x23 + uVar17) * 0x18);
      puVar1 = (uint *)(lVar20 + (long)unaff_x23 * 0x10);
      uVar22 = *puVar1;
      unaff_x25 = (undefined *)(ulong)uVar22;
      unaff_x26 = *(undefined **)(puVar1 + 2);
      _memmove(puVar1,puVar1 + 4,(~(ulong)unaff_x23 + uVar17) * 0x10);
      uVar4 = uVar4 - 1;
      *(ushort *)(lVar20 + 0x1c2) = uVar4;
      lVar9 = plVar7[1];
      auVar27._8_8_ = lVar9;
      auVar27._0_8_ = lVar20;
      if (uVar4 < 5) {
        lVar11 = *(long *)(lVar20 + 0xb0);
        *(undefined8 **)(puVar5 + -0x158) = puVar19;
        *(uint *)(puVar5 + -0x15c) = uVar22;
        *(undefined **)(puVar5 + -0x168) = unaff_x26;
        *(undefined **)(puVar5 + -0x188) = puVar8;
        if (lVar11 != 0) {
          lVar10 = lVar9 + 1;
          if (*(ushort *)(lVar20 + 0x1c0) != 0) {
            lVar13 = (ulong)*(ushort *)(lVar20 + 0x1c0) - 1;
            lVar15 = *(long *)(lVar11 + lVar13 * 8 + 0x1c8);
            uVar17 = (ulong)*(ushort *)(lVar15 + 0x1c2);
            if ((undefined *)0xb < (undefined *)(ulong)uVar4 + uVar17 + 1) {
              *(long *)(puVar5 + -0xd8) = lVar11;
              *(long *)(puVar5 + -0xd0) = lVar10;
              *(long *)(puVar5 + -200) = lVar13;
              *(long *)(puVar5 + -0xc0) = lVar15;
              *(long *)(puVar5 + -0xb8) = lVar9;
              *(long *)(puVar5 + -0xb0) = lVar20;
              *(long *)(puVar5 + -0xa8) = lVar9;
              func_0x0055e2f4(puVar5 + -0xd8,1);
              unaff_x23 = unaff_x23 + 1;
              goto code_r0x0055eb4c;
            }
            *(long *)(puVar5 + -0xd8) = lVar11;
            *(long *)(puVar5 + -0xd0) = lVar10;
            *(long *)(puVar5 + -200) = lVar13;
            *(long *)(puVar5 + -0xc0) = lVar15;
            *(long *)(puVar5 + -0xb8) = lVar9;
            *(long *)(puVar5 + -0xb0) = lVar20;
            *(long *)(puVar5 + -0xa8) = lVar9;
            if (unaff_x23 <= (undefined *)(ulong)uVar4) {
              auVar27 = func_0x0055e788(puVar5 + -0xd8);
              unaff_x23 = unaff_x23 + uVar17 + 1;
              unaff_x25 = *(undefined **)(auVar27._0_8_ + 0xb0);
              goto joined_r0x0055eacc;
            }
            goto code_r0x0055ee9c;
          }
          unaff_x27 = puVar8;
          if (*(short *)(lVar11 + 0x1c2) != 0) {
            lVar13 = *(long *)(lVar11 + 0x1d0);
            if ((undefined *)(ulong)uVar4 + (ulong)*(ushort *)(lVar13 + 0x1c2) + 1 <
                (undefined *)0xc) {
              *(long *)(puVar5 + -0xd8) = lVar11;
              *(long *)(puVar5 + -0xd0) = lVar10;
              *(undefined8 *)(puVar5 + -200) = 0;
              *(long *)(puVar5 + -0xc0) = lVar20;
              *(long *)(puVar5 + -0xb8) = lVar9;
              *(long *)(puVar5 + -0xb0) = lVar13;
              *(long *)(puVar5 + -0xa8) = lVar9;
              if ((undefined *)(ulong)uVar4 < unaff_x23) goto code_r0x0055ee9c;
              auVar27 = func_0x0055e788(puVar5 + -0xd8);
              unaff_x25 = *(undefined **)(auVar27._0_8_ + 0xb0);
            }
            else {
              *(long *)(puVar5 + -0xd8) = lVar11;
              *(long *)(puVar5 + -0xd0) = lVar10;
              *(undefined8 *)(puVar5 + -200) = 0;
              *(long *)(puVar5 + -0xc0) = lVar20;
              *(long *)(puVar5 + -0xb8) = lVar9;
              *(long *)(puVar5 + -0xb0) = lVar13;
              *(long *)(puVar5 + -0xa8) = lVar9;
              func_0x0055e51c(puVar5 + -0xd8,1);
              unaff_x25 = *(undefined **)(lVar20 + 0xb0);
            }
            goto joined_r0x0055eacc;
          }
          goto code_r0x0055eeb4;
        }
code_r0x0055eb4c:
        unaff_x25 = *(undefined **)(lVar20 + 0xb0);
joined_r0x0055eacc:
        if (unaff_x25 == (undefined *)0x0) {
          puVar19 = *(undefined8 **)(puVar5 + -0x158);
          uVar22 = *(uint *)(puVar5 + -0x15c);
          unaff_x26 = *(undefined **)(puVar5 + -0x168);
        }
        else {
          *(undefined **)(puVar5 + -0x178) = unaff_x23;
          *(long *)(puVar5 + -0x170) = auVar27._8_8_;
          *(long *)(puVar5 + -0x180) = auVar27._0_8_;
          uVar4 = *(ushort *)(unaff_x25 + 0x1c2);
          if (uVar4 < 5) {
            uVar18 = *(long *)(puVar5 + -0x170) + 1;
            do {
              puVar24 = (undefined *)(ulong)uVar4;
              unaff_x28 = *(undefined **)(unaff_x25 + 0xb0);
              if (unaff_x28 == (undefined *)0x0) {
                if (uVar4 == 0) {
                  **(undefined1 **)(puVar5 + -0x188) = 1;
                }
                break;
              }
              lVar9 = uVar18 + 1;
              uVar4 = *(ushort *)(unaff_x25 + 0x1c0);
              *(long *)(puVar5 + -0x138) = lVar9;
              if (uVar4 == 0) {
                uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
                if (uVar4 == 0) goto code_r0x0055ee70;
                puVar14 = *(undefined **)(unaff_x28 + 0x1d0);
                *(undefined **)(puVar5 + -0xd8) = unaff_x28;
                *(long *)(puVar5 + -0xd0) = lVar9;
                *(undefined8 *)(puVar5 + -200) = 0;
                *(undefined **)(puVar5 + -0xc0) = unaff_x25;
                *(ulong *)(puVar5 + -0xb8) = uVar18;
                *(undefined **)(puVar5 + -0xb0) = puVar14;
                *(ulong *)(puVar5 + -0xa8) = uVar18;
                unaff_x26 = puVar24 + 1;
                puVar21 = (undefined *)(ulong)*(ushort *)(puVar14 + 0x1c2);
                puVar8 = unaff_x26 + (long)puVar21;
                if ((undefined *)0xb < puVar8) {
                  func_0x0055e51c(puVar5 + -0xd8,5 - (long)puVar24);
                  break;
                }
                uVar17 = 0;
                unaff_x23 = unaff_x25;
              }
              else {
                uVar17 = (ulong)uVar4 - 1;
                unaff_x23 = *(undefined **)(unaff_x28 + uVar17 * 8 + 0x1c8);
                *(undefined **)(puVar5 + -0x110) = unaff_x28;
                *(long *)(puVar5 + -0x108) = lVar9;
                *(ulong *)(puVar5 + -0x100) = uVar17;
                *(undefined **)(puVar5 + -0xf8) = unaff_x23;
                *(ulong *)(puVar5 + -0xf0) = uVar18;
                *(undefined **)(puVar5 + -0xe8) = unaff_x25;
                *(ulong *)(puVar5 + -0xe0) = uVar18;
                puVar23 = (undefined *)(ulong)*(ushort *)(unaff_x23 + 0x1c2);
                if ((undefined *)0xb < puVar24 + (long)puVar23 + 1) {
                  func_0x0055e2f4(puVar5 + -0x110,5 - (long)puVar24);
                  break;
                }
                uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
                unaff_x26 = puVar23 + 1;
                puVar8 = unaff_x26 + (long)puVar24;
                puVar21 = puVar24;
                puVar14 = unaff_x25;
                puVar24 = puVar23;
              }
              uVar12 = (ulong)uVar4;
              *(undefined **)(puVar5 + -0x148) = puVar8;
              *(ulong *)(puVar5 + -0x140) = uVar17;
              *(short *)(unaff_x23 + 0x1c2) = (short)puVar8;
              iVar16 = (int)uVar17;
              uVar6 = *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 0xb8);
              *(undefined8 *)(puVar5 + -0x98) =
                   *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 0xc0);
              *(undefined8 *)(puVar5 + -0xa0) = uVar6;
              *(undefined8 *)(puVar5 + -0x90) =
                   *(undefined8 *)(unaff_x28 + (long)iVar16 * 0x18 + 200);
              lVar9 = ~uVar17 + uVar12;
              _memmove(unaff_x28 + (long)iVar16 * 0x18 + 0xb8,unaff_x28 + (long)iVar16 * 0x18 + 0xd0
                       ,lVar9 * 0x18);
              puVar19 = (undefined8 *)(unaff_x23 + (long)puVar24 * 0x18 + 0xb8);
              uVar6 = *(undefined8 *)(puVar5 + -0x90);
              uVar25 = *(undefined8 *)(puVar5 + -0xa0);
              puVar19[1] = *(undefined8 *)(puVar5 + -0x98);
              *puVar19 = uVar25;
              puVar19[2] = uVar6;
              _memcpy(unaff_x23 + (long)unaff_x26 * 0x18 + 0xb8,puVar14 + 0xb8,(long)puVar21 * 0x18)
              ;
              puVar2 = (undefined4 *)(unaff_x28 + uVar17 * 0x10);
              uVar3 = *puVar2;
              auVar26._8_4_ = uVar3;
              auVar26._0_8_ = lVar9;
              auVar26._12_4_ = 0;
              uVar6 = *(undefined8 *)(puVar2 + 2);
              _memmove(puVar2,puVar2 + 4,lVar9 * 0x10);
              *(undefined **)(puVar5 + -0x150) = puVar24;
              *(undefined4 *)(unaff_x23 + (long)puVar24 * 0x10) = uVar3;
              *(undefined8 *)((long)(unaff_x23 + (long)puVar24 * 0x10) + 8) = uVar6;
              _memcpy(unaff_x23 + (long)unaff_x26 * 0x10,puVar14,(long)puVar21 << 4);
              uVar17 = *(long *)(puVar5 + -0x140) + 1;
              _memmove(unaff_x28 + uVar17 * 8 + 0x1c8,unaff_x28 + uVar17 * 8 + 0x1d0,lVar9 * 8);
              if (uVar17 < uVar12) {
                do {
                  lVar9 = *(long *)(unaff_x28 + uVar17 * 8 + 0x1c8);
                  *(short *)(lVar9 + 0x1c0) = (short)uVar17;
                  uVar17 = uVar17 + 1;
                  *(undefined **)(lVar9 + 0xb0) = unaff_x28;
                } while (uVar12 != uVar17);
              }
              *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
              uVar18 = *(ulong *)(puVar5 + -0x138);
              uVar17 = uVar18;
              puVar8 = puVar24;
              if (uVar18 < 2) {
                uVar6 = 0x1c8;
              }
              else {
                uVar12 = *(ulong *)(puVar5 + -0x148);
                auVar27._8_8_ = uVar12;
                auVar27._0_8_ = puVar14;
                if (puVar21 + 1 != (undefined *)(uVar12 - *(long *)(puVar5 + -0x150)))
                goto code_r0x0055ee58;
                _memcpy(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8,puVar14 + 0x1c8,
                        (long)(puVar21 + 1) * 8);
                do {
                  lVar9 = *(long *)(unaff_x23 + (long)unaff_x26 * 8 + 0x1c8);
                  *(short *)(lVar9 + 0x1c0) = (short)unaff_x26;
                  unaff_x26 = unaff_x26 + 1;
                  *(undefined **)(lVar9 + 0xb0) = unaff_x23;
                } while ((undefined *)(uVar12 + 1) != unaff_x26);
                uVar6 = 0x228;
              }
              auVar27._8_8_ = uVar12;
              auVar27._0_8_ = puVar14;
              func_0x00187bd4(puVar14,uVar6,8);
              uVar4 = *(ushort *)(unaff_x28 + 0x1c2);
              unaff_x25 = unaff_x28;
              if (4 < uVar4) break;
            } while( true );
          }
          puVar19 = *(undefined8 **)(puVar5 + -0x158);
          unaff_x23 = *(undefined **)(puVar5 + -0x178);
          uVar22 = *(uint *)(puVar5 + -0x15c);
          auVar27._8_8_ = *(undefined8 *)(puVar5 + -0x170);
          auVar27._0_8_ = *(undefined8 *)(puVar5 + -0x180);
          unaff_x26 = *(undefined **)(puVar5 + -0x168);
        }
      }
      uVar6 = *(undefined8 *)(puVar5 + -0x130);
      puVar19[1] = *(undefined8 *)(puVar5 + -0x128);
      *puVar19 = uVar6;
      puVar19[2] = *(undefined8 *)(puVar5 + -0x120);
      *(uint *)(puVar19 + 3) = uVar22;
      puVar19[4] = unaff_x26;
      *(undefined1 (*) [16])(puVar19 + 5) = auVar27;
      puVar19[7] = unaff_x23;
      return;
    }
    _memcpy(unaff_x19 + 0x1c8 + in_stack_00000000 * 8,unaff_x27 + 0x1c8,lVar20 * 8);
    lVar9 = lVar9 + 0x3a;
    uVar6 = 0x228;
    do {
      lVar11 = *(long *)(unaff_x19 + lVar9 * 8);
      *(long *)(lVar11 + 0xb0) = unaff_x19;
      *(short *)(lVar11 + 0x1c0) = (short)lVar9 + -0x39;
      lVar9 = lVar9 + 1;
      lVar20 = lVar20 + -1;
    } while (lVar20 != 0);
  }
  func_0x00187bd4(unaff_x27,uVar6,8);
  return;
code_r0x0055ee58:
  func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
  unaff_x25 = puVar21;
code_r0x0055ee70:
  *(undefined **)(puVar5 + -0xa0) = &UNK_009ee080;
  *(undefined8 *)(puVar5 + -0x98) = 1;
  *(undefined8 *)(puVar5 + -0x88) = 0;
  *(undefined8 *)(puVar5 + -0x80) = 0;
  *(undefined1 **)(puVar5 + -0x90) = puVar5 + -0x70;
  func_0x007a2420(puVar5 + -0xa0,&UNK_009ee090);
code_r0x0055ee9c:
  func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
  unaff_x27 = puVar8;
code_r0x0055eeb4:
  lVar9 = auVar26._8_8_;
  lVar20 = auVar26._0_8_;
  *(undefined **)(puVar5 + -0xd8) = &UNK_009ee080;
  *(undefined8 *)(puVar5 + -0xd0) = 1;
  *(undefined8 *)(puVar5 + -0xc0) = 0;
  *(undefined8 *)(puVar5 + -0xb8) = 0;
  *(undefined1 **)(puVar5 + -200) = puVar5 + -0x70;
  auVar26 = func_0x007a2420(puVar5 + -0xd8,&UNK_009ee090);
  puVar8 = auVar26._8_8_;
  plVar7 = auVar26._0_8_;
  *(long *)(puVar5 + -0x1b0) = auVar27._8_8_;
  *(ulong *)(puVar5 + -0x1a8) = uVar17;
  *(undefined1 **)(puVar5 + -0x1a0) = puVar5 + -0x10;
  *(undefined **)(puVar5 + -0x198) = &DAT_0055eee0;
  unaff_x29 = puVar5 + -0x1a0;
  lVar11 = plVar7[1];
  lVar10 = plVar7[2];
  if (lVar11 == 0) {
    *(long *)(puVar5 + -0x240) = *plVar7;
    *(undefined8 *)(puVar5 + -0x238) = 0;
    *(long *)(puVar5 + -0x230) = lVar10;
    func_0x0055e9b4(extraout_x8,puVar5 + -0x240);
    return;
  }
  lVar10 = *(long *)(*plVar7 + lVar10 * 8 + 0x1c8);
  while (lVar11 = lVar11 + -1, lVar11 != 0) {
    lVar10 = *(long *)(lVar10 + (ulong)*(ushort *)(lVar10 + 0x1c2) * 8 + 0x1c8);
  }
  uVar4 = *(ushort *)(lVar10 + 0x1c2);
  *(long *)(puVar5 + -0x228) = lVar10;
  *(undefined8 *)(puVar5 + -0x220) = 0;
  *(ulong *)(puVar5 + -0x218) = (ulong)uVar4 - 1;
  auVar26._8_8_ = puVar5 + -0x228;
  auVar26._0_8_ = puVar5 + -0x1f0;
  puVar24 = &UNK_0055ef44;
  puVar5 = puVar5 + -0x240;
  unaff_x19 = extraout_x8;
  goto LAB_0055e9b4;
}


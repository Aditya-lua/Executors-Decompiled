
byte * FUN_005162c4(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long *plVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  byte bVar9;
  long *plVar10;
  byte *pbVar11;
  code *pcVar12;
  byte *pbVar13;
  long lVar14;
  byte *pbVar15;
  byte *pbVar16;
  undefined8 *extraout_x8;
  ulong uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long *plVar22;
  undefined8 *puVar23;
  long lVar24;
  undefined1 auVar25 [16];
  long *plStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  
  __Unwind_Resume();
  pbVar13 = (byte *)func_0x007a2668();
  bVar9 = *pbVar13;
  if (bVar9 < 4) {
    if (1 < bVar9) {
      *extraout_x8 = 0;
      return pbVar13;
    }
  }
  else if ((bVar9 < 6) && (bVar9 == 4)) {
    pbVar13 = (byte *)func_0x00187bd0(0x20,8);
    if (pbVar13 != (byte *)0x0) {
      pbVar13[0] = 0;
      pbVar13[1] = 0;
      pbVar13[2] = 0;
      pbVar13[3] = 0;
      pbVar13[4] = 0;
      pbVar13[5] = 0;
      pbVar13[6] = 0;
      pbVar13[7] = 0;
      pbVar13[8] = 0;
      pbVar13[9] = 0;
      pbVar13[10] = 0;
      pbVar13[0xb] = 0;
      pbVar13[0xc] = 0;
      pbVar13[0xd] = 0;
      pbVar13[0xe] = 0;
      pbVar13[0xf] = 0;
      pbVar13[0x10] = 0;
      pbVar13[0x11] = 0;
      pbVar13[0x12] = 0;
      pbVar13[0x13] = 0;
      pbVar13[0x14] = 0;
      pbVar13[0x15] = 0;
      pbVar13[0x16] = 0;
      pbVar13[0x17] = 0;
      pbVar13[0x18] = 0xff;
      pbVar13[0x19] = 0;
      pbVar13[0x1a] = 0;
      pbVar13[0x1b] = 0;
      pbVar13[0x1c] = 0;
      pbVar13[0x1d] = 0;
      pbVar13[0x1e] = 0;
      pbVar13[0x1f] = 0;
      *extraout_x8 = 4;
      extraout_x8[1] = pbVar13;
      extraout_x8[2] = &UNK_009e9950;
      return pbVar13;
    }
    lVar14 = func_0x007a1f18(8,0x20);
    lVar18 = 0;
    lVar19 = *(long *)(lVar14 + 0x10) << 4;
    uVar17 = 0xffffffffffffffff;
    plVar22 = *(long **)(lVar14 + 8);
    do {
      if (lVar19 == 0) goto code_r0x00516434;
      lVar24 = *plVar22;
      plVar5 = plVar22 + 1;
      uVar17 = uVar17 + 1;
      lVar18 = lVar18 + 0x20;
      lVar19 = lVar19 + -0x10;
      plVar22 = plVar22 + 2;
    } while (lVar24 != 0x685ba8649839ce27 || *plVar5 != 0xe9d7039e0c4cbbe);
    if (uVar17 < *(ulong *)(lVar14 + 0x28)) {
      lVar18 = *(long *)(lVar14 + 0x20) + lVar18;
      lVar14 = *(long *)(lVar18 + -0x18);
      pbVar13 = (byte *)(*(long *)(lVar18 + -0x20) +
                         (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar25 = (**(code **)(lVar14 + 0x18))(pbVar13);
      if (auVar25._0_8_ != 0x685ba8649839ce27 || auVar25._8_8_ != 0xe9d7039e0c4cbbe) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
code_r0x00516434:
        pbVar13 = (byte *)0x0;
      }
      return pbVar13;
    }
    lVar14 = func_0x007a2570(uVar17,*(ulong *)(lVar14 + 0x28),&UNK_009e9b68);
    lVar18 = 0;
    lVar19 = *(long *)(lVar14 + 0x10) << 4;
    uVar17 = 0xffffffffffffffff;
    plVar22 = *(long **)(lVar14 + 8);
    do {
      if (lVar19 == 0) goto code_r0x00516514;
      lVar24 = *plVar22;
      plVar5 = plVar22 + 1;
      uVar17 = uVar17 + 1;
      lVar18 = lVar18 + 0x20;
      lVar19 = lVar19 + -0x10;
      plVar22 = plVar22 + 2;
    } while (lVar24 != 0x6e67c376f6ef4484 || *plVar5 != -0x3355110ba46b19a7);
    if (uVar17 < *(ulong *)(lVar14 + 0x28)) {
      lVar18 = *(long *)(lVar14 + 0x20) + lVar18;
      lVar14 = *(long *)(lVar18 + -0x18);
      pbVar13 = (byte *)(*(long *)(lVar18 + -0x20) +
                         (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar25 = (**(code **)(lVar14 + 0x18))(pbVar13);
      if (auVar25._0_8_ != 0x6e67c376f6ef4484 || auVar25._8_8_ != -0x3355110ba46b19a7) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
code_r0x00516514:
        pbVar13 = (byte *)0x0;
      }
      return pbVar13;
    }
    lVar14 = func_0x007a2570(uVar17,*(ulong *)(lVar14 + 0x28),&UNK_009e9b68);
    lVar18 = 0;
    lVar19 = *(long *)(lVar14 + 0x10) << 4;
    uVar17 = 0xffffffffffffffff;
    plVar22 = *(long **)(lVar14 + 8);
    do {
      if (lVar19 == 0) goto code_r0x005165f4;
      lVar24 = *plVar22;
      plVar5 = plVar22 + 1;
      uVar17 = uVar17 + 1;
      lVar18 = lVar18 + 0x20;
      lVar19 = lVar19 + -0x10;
      plVar22 = plVar22 + 2;
    } while (lVar24 != 0x1414db8803bc16e0 || *plVar5 != 0x4f7557bbe08e4383);
    if (uVar17 < *(ulong *)(lVar14 + 0x28)) {
      lVar18 = *(long *)(lVar14 + 0x20) + lVar18;
      lVar14 = *(long *)(lVar18 + -0x18);
      pbVar13 = (byte *)(*(long *)(lVar18 + -0x20) +
                         (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar25 = (**(code **)(lVar14 + 0x18))(pbVar13);
      if (auVar25._0_8_ != 0x1414db8803bc16e0 || auVar25._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
code_r0x005165f4:
        pbVar13 = (byte *)0x0;
      }
      return pbVar13;
    }
    lVar14 = func_0x007a2570(uVar17,*(ulong *)(lVar14 + 0x28),&UNK_009e9b68);
    lVar18 = 0;
    lVar19 = *(long *)(lVar14 + 0x10) << 4;
    uVar17 = 0xffffffffffffffff;
    plVar22 = *(long **)(lVar14 + 8);
    do {
      if (lVar19 == 0) goto code_r0x005166d4;
      lVar24 = *plVar22;
      plVar5 = plVar22 + 1;
      uVar17 = uVar17 + 1;
      lVar18 = lVar18 + 0x20;
      lVar19 = lVar19 + -0x10;
      plVar22 = plVar22 + 2;
    } while (lVar24 != 0x7e4eeee09022dc8a || *plVar5 != -0x1771d961439572bf);
    if (uVar17 < *(ulong *)(lVar14 + 0x28)) {
      lVar18 = *(long *)(lVar14 + 0x20) + lVar18;
      lVar14 = *(long *)(lVar18 + -0x18);
      pbVar13 = (byte *)(*(long *)(lVar18 + -0x20) +
                         (*(long *)(lVar14 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar25 = (**(code **)(lVar14 + 0x18))(pbVar13);
      if (auVar25._0_8_ != 0x7e4eeee09022dc8a || auVar25._8_8_ != -0x1771d961439572bf) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
code_r0x005166d4:
        pbVar13 = (byte *)0x0;
      }
      return pbVar13;
    }
    auVar25 = func_0x007a2570(uVar17,*(ulong *)(lVar14 + 0x28),&UNK_009e9b68);
    lVar18 = auVar25._8_8_;
    pbVar15 = auVar25._0_8_;
    pbVar13 = pbVar15;
    if (*(long *)(lVar18 + 0x10) != 0) {
      plVar22 = *(long **)(lVar18 + 8);
      plVar5 = plVar22 + *(long *)(lVar18 + 0x10) * 2;
      puVar2 = *(undefined8 **)(lVar18 + 0x20);
      lVar18 = *(long *)(lVar18 + 0x28);
      pbVar16 = pbVar15;
      puVar23 = puVar2;
      do {
        if (puVar23 == puVar2 + lVar18 * 4) {
          auVar25 = func_0x007a23bc(&UNK_009e9bf8);
code_r0x005168e4:
          func_0x007a2570(auVar25._0_8_,auVar25._8_8_,&UNK_009e9af0);
code_r0x005168f0:
                    /* WARNING: Does not return */
          pcVar12 = (code *)SoftwareBreakpoint(1,0x5168f4);
          (*pcVar12)();
        }
        lVar24 = plVar22[1];
        lVar19 = *plVar22;
        lVar14 = *(long *)*puVar23;
        *(long *)*puVar23 = lVar14 + 1;
        if (lVar14 < 0) goto code_r0x005168f0;
        lVar14 = 0;
        plVar22 = plVar22 + 2;
        plVar3 = (long *)*puVar23;
        uVar6 = puVar23[1];
        uVar4 = puVar23[2];
        uVar7 = puVar23[3];
        lVar20 = *(long *)(pbVar15 + 8);
        lVar8 = *(long *)(pbVar15 + 0x10);
        lVar21 = lVar8 << 4;
        pbVar11 = (byte *)0x0;
        do {
          pbVar13 = pbVar11;
          if (lVar21 == 0) {
            pbVar13 = pbVar16;
            if (lVar8 == *(long *)pbVar15) {
              pbVar13 = (byte *)func_0x0050c0c0(pbVar15,&UNK_009e9b08);
              lVar20 = *(long *)(pbVar15 + 8);
            }
            plVar10 = (long *)(lVar20 + lVar8 * 0x10);
            plVar10[1] = lVar24;
            *plVar10 = lVar19;
            *(long *)(pbVar15 + 0x10) = lVar8 + 1;
            lVar14 = *(long *)(pbVar15 + 0x28);
            plStack_160 = plVar3;
            uStack_158 = uVar6;
            uStack_150 = uVar4;
            uStack_148 = uVar7;
            if (lVar14 == *(long *)(pbVar15 + 0x18)) {
              pbVar13 = (byte *)func_0x0050c2ec(pbVar15 + 0x18,&UNK_009e9b20);
            }
            puVar1 = (undefined8 *)(*(long *)(pbVar15 + 0x20) + lVar14 * 0x20);
            puVar1[1] = uVar6;
            *puVar1 = plVar3;
            puVar1[3] = uVar7;
            puVar1[2] = uVar4;
            *(long *)(pbVar15 + 0x28) = lVar14 + 1;
            goto code_r0x00516764;
          }
          plVar10 = (long *)(lVar20 + (long)pbVar13 * 0x10);
          lVar21 = lVar21 + -0x10;
          lVar14 = lVar14 + 0x20;
          pbVar11 = pbVar13 + 1;
        } while (*plVar10 != lVar19 || plVar10[1] != lVar24);
        auVar25._8_8_ = *(byte **)(pbVar15 + 0x28);
        auVar25._0_8_ = pbVar13;
        if (*(byte **)(pbVar15 + 0x28) <= pbVar13) goto code_r0x005168e4;
        lVar14 = *(long *)(pbVar15 + 0x20) + lVar14;
        plStack_160 = *(long **)(lVar14 + -0x20);
        *(long **)(lVar14 + -0x20) = plVar3;
        uStack_158 = *(undefined8 *)(lVar14 + -0x18);
        *(undefined8 *)(lVar14 + -0x18) = uVar6;
        uStack_150 = *(undefined8 *)(lVar14 + -0x10);
        *(undefined8 *)(lVar14 + -0x10) = uVar4;
        uStack_148 = *(undefined8 *)(lVar14 + -8);
        *(undefined8 *)(lVar14 + -8) = uVar7;
        if (plStack_160 != (long *)0x0) {
          lVar14 = *plStack_160;
          *plStack_160 = lVar14 + -1;
          LORelease();
          if (lVar14 == 1) {
            DataMemoryBarrier(2,1);
            pbVar13 = (byte *)func_0x00525414(&plStack_160);
          }
        }
code_r0x00516764:
        pbVar16 = pbVar13;
        puVar23 = puVar23 + 4;
      } while (plVar22 != plVar5);
    }
    return pbVar13;
  }
  *extraout_x8 = 5;
  return pbVar13;
}


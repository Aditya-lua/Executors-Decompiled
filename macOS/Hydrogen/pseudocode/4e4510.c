
void FUN_004e4510(void)

{
  long *plVar1;
  undefined8 uVar2;
  undefined1 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *extraout_x8;
  undefined1 *puVar10;
  ulong *extraout_x8_00;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *unaff_x20;
  ulong uVar14;
  ulong uVar15;
  undefined8 uVar16;
  ulong uVar17;
  undefined8 *puVar18;
  long lVar19;
  undefined8 unaff_x24;
  long lVar20;
  long lVar21;
  ulong uVar22;
  ulong *puVar23;
  undefined1 auVar24 [16];
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  long lStack_c0;
  long lStack_b8;
  
  lVar7 = func_0x00187bd0();
  if (lVar7 != 0) {
    _memcpy(lVar7);
    *unaff_x20 = unaff_x24;
    unaff_x20[1] = lVar7;
    unaff_x20[2] = unaff_x24;
    return;
  }
  lVar7 = func_0x007a1f00();
  uVar16 = 0;
  uVar17 = *(ulong *)(lVar7 + 0x10);
  auVar24._8_8_ = 0;
  auVar24._0_8_ = uVar17;
  uVar14 = uVar17 * 0x18;
  if ((SUB168(auVar24 * ZEXT816(0x18),8) == 0) && (uVar14 < 0x7ffffffffffffff9)) {
    if (uVar14 == 0) {
      uVar8 = 8;
LAB_004e461c:
      *extraout_x8 = uVar17;
      extraout_x8[1] = uVar8;
      extraout_x8[2] = uVar17;
      return;
    }
    puVar18 = *(undefined8 **)(lVar7 + 8);
    uVar16 = 8;
    uVar8 = func_0x00187bd0(uVar14,8);
    if (uVar8 != 0) {
      if (uVar17 != 0) {
        puVar10 = (undefined1 *)(uVar8 + 0x10);
        uVar12 = uVar17;
        do {
          if (uVar14 == 0) break;
          uVar16 = *puVar18;
          uVar2 = puVar18[1];
          uVar3 = *(undefined1 *)(puVar18 + 2);
          puVar18 = puVar18 + 3;
          *(undefined8 *)(puVar10 + -0x10) = uVar16;
          *(undefined8 *)(puVar10 + -8) = uVar2;
          *puVar10 = uVar3;
          uVar14 = uVar14 - 0x18;
          uVar12 = uVar12 - 1;
          puVar10 = puVar10 + 0x18;
        } while (uVar12 != 0);
      }
      goto LAB_004e461c;
    }
  }
  lVar7 = func_0x007a1f00(uVar16,uVar14,&UNK_009e7fc8);
  uVar16 = 0;
  uVar17 = *(ulong *)(lVar7 + 0x10);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar17;
  uVar14 = uVar17 * 0x18;
  if ((SUB168(auVar4 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar14)) {
LAB_004e4888:
    uVar16 = func_0x007a1f00(uVar16,uVar14,&UNK_009e7fc8);
    if (lStack_b8 != 0) goto LAB_004e48d8;
    do {
      func_0x00187bd4(lStack_c0,uStack_e8,8);
      __Unwind_Resume(uVar16);
LAB_004e48d8:
      lVar7 = 0;
      do {
        plVar1 = (long *)(lStack_c0 + lVar7 * 0x18);
        lVar20 = plVar1[2];
        if (lVar20 != 0) {
          puVar18 = (undefined8 *)(plVar1[1] + 8);
          do {
            if (puVar18[-1] != 0) {
              func_0x00187bd4(*puVar18,puVar18[-1],1);
            }
            puVar18 = puVar18 + 3;
            lVar20 = lVar20 + -1;
          } while (lVar20 != 0);
        }
        if (*plVar1 != 0) {
          func_0x00187bd4(plVar1[1],*plVar1 * 0x18,8);
        }
        lVar7 = lVar7 + 1;
      } while (lVar7 != lStack_b8);
    } while( true );
  }
  if (uVar14 == 0) {
    uVar8 = 8;
  }
  else {
    lVar7 = *(long *)(lVar7 + 8);
    uVar16 = 8;
    auVar24 = func_0x00187bd0(uVar14,8);
    uVar12 = auVar24._8_8_;
    uVar8 = auVar24._0_8_;
    if (uVar8 == 0) goto LAB_004e4888;
    if (uVar17 != 0) {
      lVar20 = 0;
      lVar21 = lVar7 + uVar17 * 0x18;
      uStack_e0 = 1;
      uVar14 = uVar17;
      uVar9 = uVar17;
      do {
        if (lVar7 == lVar21) break;
        uVar16 = 0;
        uVar13 = *(ulong *)(lVar7 + 0x10);
        auVar5._8_8_ = 0;
        auVar5._0_8_ = uVar13;
        if (SUB168(auVar5 * ZEXT816(0x18),8) != 0) {
LAB_004e4874:
          func_0x007a1f00(uVar16,uVar12,&UNK_009e7fc8);
LAB_004e4884:
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x4e4888);
          (*pcVar6)();
        }
        uVar11 = uVar13 * 0x18;
        if (0x7ffffffffffffff8 < uVar11) goto LAB_004e4874;
        if (uVar11 == 0) {
          uVar12 = 8;
        }
        else {
          lVar19 = *(long *)(lVar7 + 8);
          uVar12 = func_0x00187bd0(uVar11,8);
          if (uVar12 == 0) {
            uVar16 = 8;
            uVar12 = uVar11;
            goto LAB_004e4874;
          }
          if (uVar13 != 0) {
            uVar15 = 0;
            puVar23 = (ulong *)(uVar12 + 0x10);
            do {
              if (uVar11 == 0) break;
              uVar22 = *(ulong *)(lVar19 + 0x10);
              if ((long)uVar22 < 0) {
                uStack_e0 = 0;
LAB_004e4854:
                func_0x007a1f00(uStack_e0,uVar9,&UNK_009e7fe0);
                goto LAB_004e4884;
              }
              uVar16 = *(undefined8 *)(lVar19 + 8);
              if (uVar22 == 0) {
                uVar9 = 1;
              }
              else {
                uVar9 = func_0x00187bd0(uVar22,1);
                if (uVar9 == 0) {
                  uVar9 = uVar22;
                  goto LAB_004e4854;
                }
              }
              lVar19 = lVar19 + 0x18;
              uVar15 = uVar15 + 1;
              _memcpy(uVar9,uVar16,uVar22);
              puVar23[-2] = uVar22;
              puVar23[-1] = uVar9;
              uVar11 = uVar11 - 0x18;
              *puVar23 = uVar22;
              puVar23 = puVar23 + 3;
            } while (uVar13 != uVar15);
          }
        }
        lVar7 = lVar7 + 0x18;
        lVar19 = lVar20 * 0x18;
        lVar20 = lVar20 + 1;
        puVar23 = (ulong *)(uVar8 + lVar19);
        *puVar23 = uVar13;
        puVar23[1] = uVar12;
        puVar23[2] = uVar13;
        uVar14 = uVar14 - 1;
      } while (uVar14 != 0);
    }
  }
  *extraout_x8_00 = uVar17;
  extraout_x8_00[1] = uVar8;
  extraout_x8_00[2] = uVar17;
  return;
}


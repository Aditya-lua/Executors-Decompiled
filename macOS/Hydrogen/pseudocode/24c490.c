
void FUN_0024c490(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  undefined1 uVar2;
  ulong uVar3;
  code *pcVar4;
  bool bVar5;
  ulong uVar6;
  long *plVar7;
  long *extraout_x8;
  ulong uVar8;
  long in_x9;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  long lVar21;
  long lVar22;
  long unaff_x29;
  undefined1 auVar23 [16];
  undefined1 uStack00000000000000b0;
  ulong uStack_1b8;
  ulong uStack_1b0;
  long lStack_1a8;
  long lStack_1a0;
  long lStack_198;
  undefined2 uStack_190;
  short sStack_18e;
  undefined4 uStack_18c;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  long lStack_168;
  undefined2 uStack_160;
  short sStack_15e;
  undefined4 uStack_15c;
  long lStack_158;
  long lStack_150;
  undefined8 *puStack_148;
  long lStack_140;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  undefined8 *puStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  
  *(undefined8 *)(in_x9 + 0x30) = *(undefined8 *)(unaff_x29 + -0xa0);
  func_0x00245b38(&uStack00000000000000b0);
  __Unwind_Resume();
  auVar23 = func_0x007a2668();
  lVar11 = auVar23._8_8_;
  lVar16 = auVar23._0_8_;
  plVar7 = (long *)(lVar16 + 0x388);
  lStack_120 = *(long *)(lVar16 + 0x388);
  lVar18 = *(long *)(lVar16 + 0x390);
  puVar19 = *(undefined8 **)(lVar16 + 0x398);
  *(undefined8 *)(lVar16 + 0x388) = 0x8000000000000021;
  if (lStack_120 != -0x7fffffffffffffd9) {
    lStack_100 = *(long *)(lVar16 + 0x3a8);
    lStack_108 = *(long *)(lVar16 + 0x3a0);
    lStack_f0 = *(long *)(lVar16 + 0x3b8);
    lStack_f8 = *(long *)(lVar16 + 0x3b0);
    lStack_118 = lVar18;
    puStack_110 = puVar19;
    func_0x00253cc8(&lStack_a8,&lStack_120);
    uStack_d8 = uStack_a0;
    lStack_e0 = lStack_a8;
    uStack_c8 = uStack_90;
    uStack_d0 = uStack_98;
    uStack_b8 = uStack_80;
    uStack_c0 = uStack_88;
    uStack_b0 = uStack_78;
    if (*plVar7 == -0x7fffffffffffffd9) {
      uVar17 = *(undefined8 *)(lVar16 + 0x390);
      puVar19 = *(undefined8 **)(lVar16 + 0x398);
      if ((code *)*puVar19 != (code *)0x0) {
        (*(code *)*puVar19)(uVar17);
      }
      if (puVar19[1] != 0) {
        func_0x00187bd4(uVar17,puVar19[1],puVar19[2]);
      }
    }
    else {
      func_0x00245b38(plVar7);
    }
    *(undefined8 *)(lVar16 + 0x390) = uStack_d8;
    *plVar7 = lStack_e0;
    *(undefined8 *)(lVar16 + 0x3a0) = uStack_c8;
    *(undefined8 *)(lVar16 + 0x398) = uStack_d0;
    *(undefined8 *)(lVar16 + 0x3b0) = uStack_b8;
    *(undefined8 *)(lVar16 + 0x3a8) = uStack_c0;
    *(undefined8 *)(lVar16 + 0x3b8) = uStack_b0;
    extraout_x8[1] = lStack_118;
    *extraout_x8 = lStack_120;
    extraout_x8[3] = lStack_108;
    extraout_x8[2] = (long)puStack_110;
    extraout_x8[5] = lStack_f8;
    extraout_x8[4] = lStack_100;
    extraout_x8[6] = lStack_f0;
    return;
  }
  uStack_1b8 = *(ulong *)(lVar16 + 0x380);
  uStack_1b0 = 0;
  uVar8 = *(ulong *)(lVar11 + 0x10);
  uVar6 = *(ulong *)(lVar11 + 0x18);
  if (uVar6 <= uVar8) {
    lVar21 = *(long *)(lVar11 + 8);
    do {
      func_0x0024d99c(&lStack_1a8,lVar16,lVar18,puVar19,lVar21,uVar6,&uStack_1b8);
      if (lStack_1a8 != -0x7fffffffffffffd9) {
        lStack_108 = CONCAT44(uStack_18c,CONCAT22(sStack_18e,uStack_190));
        lStack_118 = lStack_1a0;
        lStack_120 = lStack_1a8;
        puStack_110 = (undefined8 *)lStack_198;
        lStack_f8 = lStack_180;
        lStack_100 = lStack_188;
        lStack_f0 = lStack_178;
        func_0x00253cc8(&lStack_a8,&lStack_120);
        uStack_d8 = uStack_a0;
        lStack_e0 = lStack_a8;
        uStack_c8 = uStack_90;
        uStack_d0 = uStack_98;
        uStack_b8 = uStack_80;
        uStack_c0 = uStack_88;
        uStack_b0 = uStack_78;
        if (*plVar7 == -0x7fffffffffffffd9) {
          uVar17 = *(undefined8 *)(lVar16 + 0x390);
          puVar20 = *(undefined8 **)(lVar16 + 0x398);
          if ((code *)*puVar20 != (code *)0x0) {
            (*(code *)*puVar20)(uVar17);
          }
          if (puVar20[1] != 0) {
            func_0x00187bd4(uVar17,puVar20[1],puVar20[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(lVar16 + 0x390) = uStack_d8;
        *plVar7 = lStack_e0;
        *(undefined8 *)(lVar16 + 0x3a0) = uStack_c8;
        *(undefined8 *)(lVar16 + 0x398) = uStack_d0;
        *(undefined8 *)(lVar16 + 0x3b0) = uStack_b8;
        *(undefined8 *)(lVar16 + 0x3a8) = uStack_c0;
        *(undefined8 *)(lVar16 + 0x3b8) = uStack_b0;
        lVar16 = uVar6 - uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar16 == 0) {
          lVar16 = 0;
        }
        else {
          _memmove(lVar21,lVar21 + uStack_1b0,lVar16);
        }
        *(long *)(lVar11 + 0x18) = lVar16;
        extraout_x8[1] = lStack_118;
        *extraout_x8 = lStack_120;
        extraout_x8[3] = lStack_108;
        extraout_x8[2] = (long)puStack_110;
        extraout_x8[5] = lStack_f8;
        extraout_x8[4] = lStack_100;
        extraout_x8[6] = lStack_f0;
        if ((code *)*puVar19 != (code *)0x0) {
          (*(code *)*puVar19)(lVar18);
        }
        if (puVar19[1] == 0) {
          return;
        }
        func_0x00187bd4(lVar18,puVar19[1],puVar19[2]);
        return;
      }
      if (sStack_18e == 10) {
        lVar22 = uVar6 - uStack_1b0;
        uVar8 = uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar22 == 0) goto LAB_0024c918;
code_r0x0024c868:
        _memmove(lVar21,lVar21 + uVar8,lVar22);
LAB_0024c91c:
        *(long *)(lVar11 + 0x18) = lVar22;
        if (*plVar7 == -0x7fffffffffffffd9) {
          uVar17 = *(undefined8 *)(lVar16 + 0x390);
          puVar20 = *(undefined8 **)(lVar16 + 0x398);
          if ((code *)*puVar20 != (code *)0x0) {
            (*(code *)*puVar20)(uVar17);
          }
          if (puVar20[1] != 0) {
            func_0x00187bd4(uVar17,puVar20[1],puVar20[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(lVar16 + 0x388) = 0x8000000000000027;
        *(long *)(lVar16 + 0x390) = lVar18;
        *(undefined8 **)(lVar16 + 0x398) = puVar19;
        uVar8 = *(ulong *)(lVar16 + 0xb0);
        if (uVar8 == 0) {
          lVar18 = 0;
          goto code_r0x0024cc18;
        }
        lVar18 = 0;
        lVar11 = *(long *)(lVar16 + 0xa0);
        uVar3 = *(ulong *)(lVar16 + 0xa8);
        uVar10 = *(ulong *)(lVar16 + 0x98);
        uVar6 = 0;
        if (uVar10 <= uVar3) {
          uVar6 = uVar10;
        }
        lVar21 = uVar3 - uVar6;
        uVar9 = uVar10 - lVar21;
        if (uVar8 <= uVar9) {
          uVar10 = lVar21 + uVar8;
        }
        uVar1 = 0;
        if (uVar9 <= uVar8) {
          uVar1 = uVar8 - uVar9;
        }
        if (uVar10 - lVar21 == 0) goto code_r0x0024cb7c;
        uVar10 = (uVar10 - lVar21) * 0x18;
        uVar12 = uVar10 / 0x18;
        if (uVar10 < 0x60) {
          lVar18 = 0;
          uVar10 = 0;
          goto code_r0x0024cb50;
        }
        lVar18 = 0;
        lVar21 = 0;
        lVar22 = 0;
        lVar13 = 0;
        uVar10 = uVar12 & 0xffffffffffffffc;
        plVar7 = (long *)(uVar3 * 0x18 + uVar6 * -0x18 + lVar11 + 0x40);
        uVar14 = uVar10;
        do {
          lVar18 = plVar7[-6] + lVar18;
          lVar21 = plVar7[-3] + lVar21;
          lVar22 = *plVar7 + lVar22;
          lVar13 = plVar7[3] + lVar13;
          plVar7 = plVar7 + 0xc;
          uVar14 = uVar14 - 4;
        } while (uVar14 != 0);
        lVar18 = lVar13 + lVar22 + lVar21 + lVar18;
        if (uVar12 != uVar10) {
code_r0x0024cb50:
          lVar21 = uVar10 - uVar12;
          plVar7 = (long *)(uVar3 * 0x18 + uVar10 * 0x18 + uVar6 * -0x18 + lVar11 + 0x10);
          do {
            lVar18 = *plVar7 + lVar18;
            bVar5 = lVar21 != -1;
            lVar21 = lVar21 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cb7c:
        if (uVar9 < uVar8) {
          if (uVar1 < 4) {
            uVar10 = 0;
          }
          else {
            lVar21 = 0;
            lVar22 = 0;
            lVar13 = 0;
            uVar10 = uVar1 & 0xfffffffffffffffc;
            plVar7 = (long *)(lVar11 + 0x40);
            uVar6 = uVar10;
            do {
              lVar18 = plVar7[-6] + lVar18;
              lVar21 = plVar7[-3] + lVar21;
              lVar22 = *plVar7 + lVar22;
              lVar13 = plVar7[3] + lVar13;
              plVar7 = plVar7 + 0xc;
              uVar6 = uVar6 - 4;
            } while (uVar6 != 0);
            lVar18 = lVar13 + lVar22 + lVar21 + lVar18;
            if (uVar1 == uVar10) goto code_r0x0024cc18;
          }
          uVar6 = uVar8;
          if (uVar9 <= uVar8) {
            uVar6 = uVar9;
          }
          lVar21 = (uVar10 + uVar6) - uVar8;
          plVar7 = (long *)(lVar11 + uVar10 * 0x18 + 0x10);
          do {
            lVar18 = *plVar7 + lVar18;
            bVar5 = lVar21 != -1;
            lVar21 = lVar21 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cc18:
        uVar8 = *(ulong *)(lVar16 + 0x78);
        if (uVar8 == 0) {
          lVar11 = 0;
          goto code_r0x0024cdc8;
        }
        lVar11 = 0;
        lVar21 = *(long *)(lVar16 + 0x68);
        uVar3 = *(ulong *)(lVar16 + 0x70);
        uVar10 = *(ulong *)(lVar16 + 0x60);
        uVar6 = 0;
        if (uVar10 <= uVar3) {
          uVar6 = uVar10;
        }
        lVar22 = uVar3 - uVar6;
        uVar9 = uVar10 - lVar22;
        if (uVar8 <= uVar9) {
          uVar10 = lVar22 + uVar8;
        }
        uVar1 = 0;
        if (uVar9 <= uVar8) {
          uVar1 = uVar8 - uVar9;
        }
        if (uVar10 - lVar22 != 0) {
          uVar10 = (uVar10 - lVar22) * 0x18;
          uVar12 = uVar10 / 0x18;
          if (uVar10 < 0x60) {
            lVar11 = 0;
            uVar14 = 0;
          }
          else {
            lVar11 = 0;
            lVar22 = 0;
            lVar13 = 0;
            lVar15 = 0;
            uVar14 = uVar12 & 0xffffffffffffffc;
            plVar7 = (long *)(uVar3 * 0x18 + uVar6 * -0x18 + lVar21 + 0x40);
            uVar10 = uVar14;
            do {
              lVar11 = plVar7[-6] + lVar11;
              lVar22 = plVar7[-3] + lVar22;
              lVar13 = *plVar7 + lVar13;
              lVar15 = plVar7[3] + lVar15;
              plVar7 = plVar7 + 0xc;
              uVar10 = uVar10 - 4;
            } while (uVar10 != 0);
            lVar11 = lVar15 + lVar13 + lVar22 + lVar11;
            if (uVar12 == uVar14) goto code_r0x0024cd2c;
          }
          lVar22 = uVar14 - uVar12;
          plVar7 = (long *)(uVar3 * 0x18 + uVar14 * 0x18 + uVar6 * -0x18 + lVar21 + 0x10);
          do {
            lVar11 = *plVar7 + lVar11;
            bVar5 = lVar22 != -1;
            lVar22 = lVar22 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cd2c:
        if (uVar9 < uVar8) {
          if (uVar1 < 4) {
            uVar10 = 0;
          }
          else {
            lVar22 = 0;
            lVar13 = 0;
            lVar15 = 0;
            uVar10 = uVar1 & 0xfffffffffffffffc;
            plVar7 = (long *)(lVar21 + 0x40);
            uVar6 = uVar10;
            do {
              lVar11 = plVar7[-6] + lVar11;
              lVar22 = plVar7[-3] + lVar22;
              lVar13 = *plVar7 + lVar13;
              lVar15 = plVar7[3] + lVar15;
              plVar7 = plVar7 + 0xc;
              uVar6 = uVar6 - 4;
            } while (uVar6 != 0);
            lVar11 = lVar15 + lVar13 + lVar22 + lVar11;
            if (uVar1 == uVar10) goto code_r0x0024cdc8;
          }
          uVar6 = uVar8;
          if (uVar9 <= uVar8) {
            uVar6 = uVar9;
          }
          lVar22 = (uVar10 + uVar6) - uVar8;
          plVar7 = (long *)(lVar21 + uVar10 * 0x18 + 0x10);
          do {
            lVar11 = *plVar7 + lVar11;
            bVar5 = lVar22 != -1;
            lVar22 = lVar22 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cdc8:
        lVar21 = *(long *)(lVar16 + 0x80);
        uVar2 = *(undefined1 *)(lVar16 + 0x337);
        extraout_x8[1] = lVar18 - *(long *)(lVar16 + 0xb8);
        extraout_x8[2] = lVar11 - lVar21;
        *(undefined1 *)(extraout_x8 + 3) = uVar2;
        *extraout_x8 = -0x7fffffffffffffd9;
        return;
      }
      lStack_168 = lStack_198;
      lStack_170 = lStack_1a0;
      uStack_160 = uStack_190;
      sStack_15e = sStack_18e;
      uStack_15c = uStack_18c;
      func_0x0024e9cc(&lStack_158,lVar16,&lStack_170,lVar18,puVar19,param_3);
      puVar19 = puStack_148;
      lVar18 = lStack_150;
      uVar10 = uStack_1b0;
      if (lStack_158 != -0x7fffffffffffffd9) {
        lStack_118 = lStack_150;
        lStack_120 = lStack_158;
        lStack_108 = lStack_140;
        puStack_110 = puStack_148;
        lStack_f8 = lStack_130;
        lStack_100 = lStack_138;
        lStack_f0 = lStack_128;
        func_0x00253cc8(&lStack_a8,&lStack_120);
        uStack_d8 = uStack_a0;
        lStack_e0 = lStack_a8;
        uStack_c8 = uStack_90;
        uStack_d0 = uStack_98;
        uStack_b8 = uStack_80;
        uStack_c0 = uStack_88;
        uStack_b0 = uStack_78;
        if (*plVar7 == -0x7fffffffffffffd9) {
          uVar17 = *(undefined8 *)(lVar16 + 0x390);
          puVar19 = *(undefined8 **)(lVar16 + 0x398);
          if ((code *)*puVar19 != (code *)0x0) {
            (*(code *)*puVar19)(uVar17);
          }
          if (puVar19[1] != 0) {
            func_0x00187bd4(uVar17,puVar19[1],puVar19[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(lVar16 + 0x390) = uStack_d8;
        *plVar7 = lStack_e0;
        *(undefined8 *)(lVar16 + 0x3a0) = uStack_c8;
        *(undefined8 *)(lVar16 + 0x398) = uStack_d0;
        *(undefined8 *)(lVar16 + 0x3b0) = uStack_b8;
        *(undefined8 *)(lVar16 + 0x3a8) = uStack_c0;
        *(undefined8 *)(lVar16 + 0x3b8) = uStack_b0;
        lVar18 = uVar6 - uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar18 == 0) {
          lVar18 = 0;
        }
        else {
          _memmove(lVar21,lVar21 + uStack_1b0,lVar18);
        }
        *(long *)(lVar11 + 0x18) = lVar18;
        extraout_x8[1] = lStack_118;
        *extraout_x8 = lStack_120;
        extraout_x8[3] = lStack_108;
        extraout_x8[2] = (long)puStack_110;
        extraout_x8[5] = lStack_f8;
        extraout_x8[4] = lStack_100;
        extraout_x8[6] = lStack_f0;
        return;
      }
      if ((*(byte *)(lVar16 + 0x337) & 1) != 0) {
        uVar8 = uStack_1b0 + uVar6;
        lVar22 = uVar6 - uVar8;
        if (uVar8 <= uVar6 && lVar22 != 0) goto code_r0x0024c868;
LAB_0024c918:
        lVar22 = 0;
        goto LAB_0024c91c;
      }
      bVar5 = uStack_1b0 <= uStack_1b8;
      uStack_1b0 = uStack_1b8 - uStack_1b0;
      uStack_1b8 = 0;
      if (bVar5) {
        uStack_1b8 = uStack_1b0;
      }
      uStack_1b0 = 0;
      bVar5 = uVar10 <= uVar6;
      uVar3 = uVar6 - uVar10;
      uVar6 = 0;
      if (bVar5 && uVar3 != 0) {
        _memmove(lVar21,lVar21 + uVar10,uVar3);
        uVar6 = uVar3;
      }
      *(ulong *)(lVar11 + 0x18) = uVar6;
    } while (uVar6 <= uVar8);
  }
  func_0x007a28b0(uVar6,uVar8,&UNK_009c9bb0);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x24ce18);
  (*pcVar4)();
}


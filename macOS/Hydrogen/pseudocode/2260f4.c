
void FUN_002260f4(long *param_1,long param_2)

{
  ulong uVar1;
  undefined1 uVar2;
  ulong uVar3;
  code *pcVar4;
  bool bVar5;
  ulong uVar6;
  long *plVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  undefined8 uVar16;
  long lVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  long lVar20;
  long lVar21;
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
  
  plVar7 = (long *)(param_2 + 0x390);
  lStack_120 = *(long *)(param_2 + 0x390);
  lVar17 = *(long *)(param_2 + 0x398);
  puVar18 = *(undefined8 **)(param_2 + 0x3a0);
  *(undefined8 *)(param_2 + 0x390) = 0x8000000000000021;
  if (lStack_120 != -0x7fffffffffffffd9) {
    lStack_100 = *(long *)(param_2 + 0x3b0);
    lStack_108 = *(long *)(param_2 + 0x3a8);
    lStack_f0 = *(long *)(param_2 + 0x3c0);
    lStack_f8 = *(long *)(param_2 + 0x3b8);
    lStack_118 = lVar17;
    puStack_110 = puVar18;
    func_0x00253cc8(&lStack_a8,&lStack_120);
    uStack_d8 = uStack_a0;
    lStack_e0 = lStack_a8;
    uStack_c8 = uStack_90;
    uStack_d0 = uStack_98;
    uStack_b8 = uStack_80;
    uStack_c0 = uStack_88;
    uStack_b0 = uStack_78;
    if (*plVar7 == -0x7fffffffffffffd9) {
      uVar16 = *(undefined8 *)(param_2 + 0x398);
      puVar18 = *(undefined8 **)(param_2 + 0x3a0);
      if ((code *)*puVar18 != (code *)0x0) {
        (*(code *)*puVar18)(uVar16);
      }
      if (puVar18[1] != 0) {
        func_0x00187bd4(uVar16,puVar18[1],puVar18[2]);
      }
    }
    else {
      func_0x00245b38(plVar7);
    }
    *(undefined8 *)(param_2 + 0x398) = uStack_d8;
    *plVar7 = lStack_e0;
    *(undefined8 *)(param_2 + 0x3a8) = uStack_c8;
    *(undefined8 *)(param_2 + 0x3a0) = uStack_d0;
    *(undefined8 *)(param_2 + 0x3b8) = uStack_b8;
    *(undefined8 *)(param_2 + 0x3b0) = uStack_c0;
    *(undefined8 *)(param_2 + 0x3c0) = uStack_b0;
    param_1[1] = lStack_118;
    *param_1 = lStack_120;
    param_1[3] = lStack_108;
    param_1[2] = (long)puStack_110;
    param_1[5] = lStack_f8;
    param_1[4] = lStack_100;
    param_1[6] = lStack_f0;
    return;
  }
  uStack_1b8 = *(ulong *)(param_2 + 0x388);
  uStack_1b0 = 0;
  uVar8 = *(ulong *)(param_2 + 0x418);
  uVar6 = *(ulong *)(param_2 + 0x420);
  if (uVar6 <= uVar8) {
    lVar20 = *(long *)(param_2 + 0x410);
    do {
      func_0x0024d99c(&lStack_1a8,param_2 + 8,lVar17,puVar18,lVar20,uVar6,&uStack_1b8);
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
          uVar16 = *(undefined8 *)(param_2 + 0x398);
          puVar19 = *(undefined8 **)(param_2 + 0x3a0);
          if ((code *)*puVar19 != (code *)0x0) {
            (*(code *)*puVar19)(uVar16);
          }
          if (puVar19[1] != 0) {
            func_0x00187bd4(uVar16,puVar19[1],puVar19[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(param_2 + 0x398) = uStack_d8;
        *plVar7 = lStack_e0;
        *(undefined8 *)(param_2 + 0x3a8) = uStack_c8;
        *(undefined8 *)(param_2 + 0x3a0) = uStack_d0;
        *(undefined8 *)(param_2 + 0x3b8) = uStack_b8;
        *(undefined8 *)(param_2 + 0x3b0) = uStack_c0;
        *(undefined8 *)(param_2 + 0x3c0) = uStack_b0;
        lVar21 = uVar6 - uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar21 == 0) {
          lVar21 = 0;
        }
        else {
          _memmove(lVar20,lVar20 + uStack_1b0,lVar21);
        }
        *(long *)(param_2 + 0x420) = lVar21;
        param_1[1] = lStack_118;
        *param_1 = lStack_120;
        param_1[3] = lStack_108;
        param_1[2] = (long)puStack_110;
        param_1[5] = lStack_f8;
        param_1[4] = lStack_100;
        param_1[6] = lStack_f0;
        if ((code *)*puVar18 != (code *)0x0) {
          (*(code *)*puVar18)(lVar17);
        }
        if (puVar18[1] == 0) {
          return;
        }
        func_0x00187bd4(lVar17,puVar18[1],puVar18[2]);
        return;
      }
      if (sStack_18e == 10) {
        lVar21 = uVar6 - uStack_1b0;
        uVar8 = uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar21 == 0) goto code_r0x0024c918;
code_r0x0024c868:
        _memmove(lVar20,lVar20 + uVar8,lVar21);
code_r0x0024c91c:
        *(long *)(param_2 + 0x420) = lVar21;
        if (*plVar7 == -0x7fffffffffffffd9) {
          uVar16 = *(undefined8 *)(param_2 + 0x398);
          puVar19 = *(undefined8 **)(param_2 + 0x3a0);
          if ((code *)*puVar19 != (code *)0x0) {
            (*(code *)*puVar19)(uVar16);
          }
          if (puVar19[1] != 0) {
            func_0x00187bd4(uVar16,puVar19[1],puVar19[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(param_2 + 0x390) = 0x8000000000000027;
        *(long *)(param_2 + 0x398) = lVar17;
        *(undefined8 **)(param_2 + 0x3a0) = puVar18;
        uVar8 = *(ulong *)(param_2 + 0xb8);
        if (uVar8 == 0) {
          lVar17 = 0;
          goto code_r0x0024cc18;
        }
        lVar17 = 0;
        lVar20 = *(long *)(param_2 + 0xa8);
        uVar3 = *(ulong *)(param_2 + 0xb0);
        uVar10 = *(ulong *)(param_2 + 0xa0);
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
        if (uVar10 - lVar21 == 0) goto LAB_0024cb7c;
        uVar10 = (uVar10 - lVar21) * 0x18;
        uVar11 = uVar10 / 0x18;
        if (uVar10 < 0x60) {
          lVar17 = 0;
          uVar10 = 0;
          goto LAB_0024cb50;
        }
        lVar17 = 0;
        lVar21 = 0;
        lVar12 = 0;
        lVar13 = 0;
        uVar10 = uVar11 & 0xffffffffffffffc;
        plVar7 = (long *)(uVar3 * 0x18 + uVar6 * -0x18 + lVar20 + 0x40);
        uVar14 = uVar10;
        do {
          lVar17 = plVar7[-6] + lVar17;
          lVar21 = plVar7[-3] + lVar21;
          lVar12 = *plVar7 + lVar12;
          lVar13 = plVar7[3] + lVar13;
          plVar7 = plVar7 + 0xc;
          uVar14 = uVar14 - 4;
        } while (uVar14 != 0);
        lVar17 = lVar13 + lVar12 + lVar21 + lVar17;
        if (uVar11 != uVar10) {
LAB_0024cb50:
          lVar21 = uVar10 - uVar11;
          plVar7 = (long *)(uVar3 * 0x18 + uVar10 * 0x18 + uVar6 * -0x18 + lVar20 + 0x10);
          do {
            lVar17 = *plVar7 + lVar17;
            bVar5 = lVar21 != -1;
            lVar21 = lVar21 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
LAB_0024cb7c:
        if (uVar9 < uVar8) {
          if (uVar1 < 4) {
            uVar10 = 0;
          }
          else {
            lVar21 = 0;
            lVar12 = 0;
            lVar13 = 0;
            uVar10 = uVar1 & 0xfffffffffffffffc;
            plVar7 = (long *)(lVar20 + 0x40);
            uVar6 = uVar10;
            do {
              lVar17 = plVar7[-6] + lVar17;
              lVar21 = plVar7[-3] + lVar21;
              lVar12 = *plVar7 + lVar12;
              lVar13 = plVar7[3] + lVar13;
              plVar7 = plVar7 + 0xc;
              uVar6 = uVar6 - 4;
            } while (uVar6 != 0);
            lVar17 = lVar13 + lVar12 + lVar21 + lVar17;
            if (uVar1 == uVar10) goto code_r0x0024cc18;
          }
          uVar6 = uVar8;
          if (uVar9 <= uVar8) {
            uVar6 = uVar9;
          }
          lVar21 = (uVar10 + uVar6) - uVar8;
          plVar7 = (long *)(lVar20 + uVar10 * 0x18 + 0x10);
          do {
            lVar17 = *plVar7 + lVar17;
            bVar5 = lVar21 != -1;
            lVar21 = lVar21 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cc18:
        uVar8 = *(ulong *)(param_2 + 0x80);
        if (uVar8 == 0) {
          lVar20 = 0;
          goto code_r0x0024cdc8;
        }
        lVar20 = 0;
        lVar21 = *(long *)(param_2 + 0x70);
        uVar3 = *(ulong *)(param_2 + 0x78);
        uVar10 = *(ulong *)(param_2 + 0x68);
        uVar6 = 0;
        if (uVar10 <= uVar3) {
          uVar6 = uVar10;
        }
        lVar12 = uVar3 - uVar6;
        uVar9 = uVar10 - lVar12;
        if (uVar8 <= uVar9) {
          uVar10 = lVar12 + uVar8;
        }
        uVar1 = 0;
        if (uVar9 <= uVar8) {
          uVar1 = uVar8 - uVar9;
        }
        if (uVar10 - lVar12 != 0) {
          uVar10 = (uVar10 - lVar12) * 0x18;
          uVar11 = uVar10 / 0x18;
          if (uVar10 < 0x60) {
            lVar20 = 0;
            uVar14 = 0;
          }
          else {
            lVar20 = 0;
            lVar12 = 0;
            lVar13 = 0;
            lVar15 = 0;
            uVar14 = uVar11 & 0xffffffffffffffc;
            plVar7 = (long *)(uVar3 * 0x18 + uVar6 * -0x18 + lVar21 + 0x40);
            uVar10 = uVar14;
            do {
              lVar20 = plVar7[-6] + lVar20;
              lVar12 = plVar7[-3] + lVar12;
              lVar13 = *plVar7 + lVar13;
              lVar15 = plVar7[3] + lVar15;
              plVar7 = plVar7 + 0xc;
              uVar10 = uVar10 - 4;
            } while (uVar10 != 0);
            lVar20 = lVar15 + lVar13 + lVar12 + lVar20;
            if (uVar11 == uVar14) goto code_r0x0024cd2c;
          }
          lVar12 = uVar14 - uVar11;
          plVar7 = (long *)(uVar3 * 0x18 + uVar14 * 0x18 + uVar6 * -0x18 + lVar21 + 0x10);
          do {
            lVar20 = *plVar7 + lVar20;
            bVar5 = lVar12 != -1;
            lVar12 = lVar12 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cd2c:
        if (uVar9 < uVar8) {
          if (uVar1 < 4) {
            uVar10 = 0;
          }
          else {
            lVar12 = 0;
            lVar13 = 0;
            lVar15 = 0;
            uVar10 = uVar1 & 0xfffffffffffffffc;
            plVar7 = (long *)(lVar21 + 0x40);
            uVar6 = uVar10;
            do {
              lVar20 = plVar7[-6] + lVar20;
              lVar12 = plVar7[-3] + lVar12;
              lVar13 = *plVar7 + lVar13;
              lVar15 = plVar7[3] + lVar15;
              plVar7 = plVar7 + 0xc;
              uVar6 = uVar6 - 4;
            } while (uVar6 != 0);
            lVar20 = lVar15 + lVar13 + lVar12 + lVar20;
            if (uVar1 == uVar10) goto code_r0x0024cdc8;
          }
          uVar6 = uVar8;
          if (uVar9 <= uVar8) {
            uVar6 = uVar9;
          }
          lVar12 = (uVar10 + uVar6) - uVar8;
          plVar7 = (long *)(lVar21 + uVar10 * 0x18 + 0x10);
          do {
            lVar20 = *plVar7 + lVar20;
            bVar5 = lVar12 != -1;
            lVar12 = lVar12 + 1;
            plVar7 = plVar7 + 3;
          } while (bVar5);
        }
code_r0x0024cdc8:
        lVar21 = *(long *)(param_2 + 0x88);
        uVar2 = *(undefined1 *)(param_2 + 0x33f);
        param_1[1] = lVar17 - *(long *)(param_2 + 0xc0);
        param_1[2] = lVar20 - lVar21;
        *(undefined1 *)(param_1 + 3) = uVar2;
        *param_1 = -0x7fffffffffffffd9;
        return;
      }
      lStack_168 = lStack_198;
      lStack_170 = lStack_1a0;
      uStack_160 = uStack_190;
      sStack_15e = sStack_18e;
      uStack_15c = uStack_18c;
      func_0x0024e9cc(&lStack_158,param_2 + 8,&lStack_170,lVar17,puVar18,param_2 + 0x3d0);
      puVar18 = puStack_148;
      lVar17 = lStack_150;
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
          uVar16 = *(undefined8 *)(param_2 + 0x398);
          puVar18 = *(undefined8 **)(param_2 + 0x3a0);
          if ((code *)*puVar18 != (code *)0x0) {
            (*(code *)*puVar18)(uVar16);
          }
          if (puVar18[1] != 0) {
            func_0x00187bd4(uVar16,puVar18[1],puVar18[2]);
          }
        }
        else {
          func_0x00245b38(plVar7);
        }
        *(undefined8 *)(param_2 + 0x398) = uStack_d8;
        *plVar7 = lStack_e0;
        *(undefined8 *)(param_2 + 0x3a8) = uStack_c8;
        *(undefined8 *)(param_2 + 0x3a0) = uStack_d0;
        *(undefined8 *)(param_2 + 0x3b8) = uStack_b8;
        *(undefined8 *)(param_2 + 0x3b0) = uStack_c0;
        *(undefined8 *)(param_2 + 0x3c0) = uStack_b0;
        lVar17 = uVar6 - uStack_1b0;
        if (uVar6 < uStack_1b0 || lVar17 == 0) {
          lVar17 = 0;
        }
        else {
          _memmove(lVar20,lVar20 + uStack_1b0,lVar17);
        }
        *(long *)(param_2 + 0x420) = lVar17;
        param_1[1] = lStack_118;
        *param_1 = lStack_120;
        param_1[3] = lStack_108;
        param_1[2] = (long)puStack_110;
        param_1[5] = lStack_f8;
        param_1[4] = lStack_100;
        param_1[6] = lStack_f0;
        return;
      }
      if ((*(byte *)(param_2 + 0x33f) & 1) != 0) {
        uVar8 = uStack_1b0 + uVar6;
        lVar21 = uVar6 - uVar8;
        if (uVar8 <= uVar6 && lVar21 != 0) goto code_r0x0024c868;
code_r0x0024c918:
        lVar21 = 0;
        goto code_r0x0024c91c;
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
        _memmove(lVar20,lVar20 + uVar10,uVar3);
        uVar6 = uVar3;
      }
      *(ulong *)(param_2 + 0x420) = uVar6;
    } while (uVar6 <= uVar8);
  }
  func_0x007a28b0(uVar6,uVar8,&UNK_009c9bb0);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x24ce18);
  (*pcVar4)();
}


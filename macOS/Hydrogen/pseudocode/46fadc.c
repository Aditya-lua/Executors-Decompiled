
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_0046fadc(ulong param_1,uint *param_2,int param_3,undefined8 param_4,uint *param_5)

{
  bool bVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  uint *puVar6;
  int *piVar7;
  undefined *puVar8;
  undefined8 *puVar9;
  long lVar10;
  long lVar11;
  byte bVar12;
  undefined1 (*pauVar13) [16];
  undefined *puVar14;
  undefined *puVar15;
  ulong extraout_x8;
  undefined *extraout_x8_00;
  uint uVar16;
  ulong uVar17;
  ulong extraout_x9;
  uint *puVar18;
  uint *extraout_x9_00;
  ulong extraout_x9_01;
  long in_x10;
  long extraout_x10;
  undefined *puVar19;
  uint in_w11;
  ulong extraout_x11;
  uint *puVar20;
  long in_x14;
  ulong uVar21;
  long extraout_x14;
  uint *extraout_x14_00;
  ulong uVar22;
  long lVar23;
  uint *puVar24;
  ulong uVar25;
  ulong uVar26;
  long lVar27;
  long extraout_x17;
  long extraout_x17_00;
  long lVar28;
  bool bVar29;
  undefined1 auVar30 [16];
  int iVar31;
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  uVar17 = param_1 - 1;
  if (0x27 < uVar17) {
LAB_0046fcac:
    func_0x007a2570(uVar17,0x28,&UNK_009e0b68);
    auVar33 = func_0x007a2570(0x28,0x28,&UNK_009e0b68);
    uVar17 = auVar33._8_8_;
    puVar24 = auVar33._0_8_;
    if (0xc < uVar17) {
      uVar26 = *(ulong *)(puVar24 + 0x28);
      do {
        if (0x28 < uVar26) goto code_r0x0046fe38;
        if (uVar26 != 0) {
          uVar21 = 0;
          lVar23 = uVar26 << 2;
          puVar6 = puVar24;
          do {
            uVar22 = uVar21 + (ulong)*puVar6 * 0x48c27395;
            *puVar6 = (uint)uVar22;
            uVar21 = uVar22 >> 0x20;
            lVar23 = lVar23 + -4;
            puVar6 = puVar6 + 1;
          } while (lVar23 != 0);
          if (uVar21 != 0) {
            if (uVar26 == 0x28) goto code_r0x0046fe4c;
            puVar24[uVar26] = (uint)(uVar22 >> 0x20);
            uVar26 = uVar26 + 1;
          }
        }
        *(ulong *)(puVar24 + 0x28) = uVar26;
        uVar17 = uVar17 - 0xd;
      } while (0xc < uVar17);
    }
    if (uVar17 == 0) {
      uVar16 = 1;
    }
    else {
      uVar16 = (int)uVar17 + 3U & 0x1c;
      uVar17 = uVar17 - 1;
      if (uVar16 == 4) {
        bVar12 = 0;
        auVar33._8_4_ = 5;
        auVar33._0_8_ = 0x500000005;
        auVar33._12_4_ = 5;
        auVar35._8_4_ = 1;
        auVar35._0_8_ = 0x100000001;
        auVar35._12_4_ = 1;
      }
      else if (uVar16 == 8) {
        auVar33._8_4_ = 0x19;
        auVar33._0_8_ = 0x1900000019;
        auVar33._12_4_ = 0x19;
        auVar35._8_4_ = 5;
        auVar35._0_8_ = 0x500000005;
        auVar35._12_4_ = 5;
        bVar12 = 4;
      }
      else {
        auVar33._8_4_ = 0x7d;
        auVar33._0_8_ = 0x7d0000007d;
        auVar33._12_4_ = 0x7d;
        auVar35._8_4_ = 0x19;
        auVar35._0_8_ = 0x1900000019;
        auVar35._12_4_ = 0x19;
        bVar12 = 8;
      }
      auVar34._0_8_ =
           CONCAT17((char)((ulong)_UNK_007fc2d0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_007fc2d0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_007fc2d0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_007fc2d0 >> 0x20),
                                               CONCAT13((char)((ulong)_UNK_007fc2d0 >> 0x18),
                                                        CONCAT12((char)((ulong)_UNK_007fc2d0 >> 0x10
                                                                       ),CONCAT11((char)((ulong)
                                                  _UNK_007fc2d0 >> 8),bVar12 | (byte)_UNK_007fc2d0))
                                                  )))));
      auVar34[8] = bVar12 | (byte)_UNK_007fc2d8;
      auVar34[9] = (undefined1)((ulong)_UNK_007fc2d8 >> 8);
      auVar34[10] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x10);
      auVar34[0xb] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x18);
      auVar34[0xc] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x20);
      auVar34[0xd] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x28);
      auVar34[0xe] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x30);
      auVar34[0xf] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x38);
      auVar38._0_8_ =
           CONCAT17((char)((ulong)_UNK_007fc2c0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_007fc2c0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_007fc2c0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_007fc2c0 >> 0x20),
                                               CONCAT13((char)((ulong)_UNK_007fc2c0 >> 0x18),
                                                        CONCAT12((char)((ulong)_UNK_007fc2c0 >> 0x10
                                                                       ),CONCAT11((char)((ulong)
                                                  _UNK_007fc2c0 >> 8),bVar12 | (byte)_UNK_007fc2c0))
                                                  )))));
      auVar38[8] = bVar12 | (byte)_UNK_007fc2c8;
      auVar38[9] = (char)((ulong)_UNK_007fc2c8 >> 8);
      auVar38[10] = (char)((ulong)_UNK_007fc2c8 >> 0x10);
      auVar38[0xb] = (char)((ulong)_UNK_007fc2c8 >> 0x18);
      auVar38[0xc] = (char)((ulong)_UNK_007fc2c8 >> 0x20);
      auVar38[0xd] = (char)((ulong)_UNK_007fc2c8 >> 0x28);
      auVar38[0xe] = (char)((ulong)_UNK_007fc2c8 >> 0x30);
      auVar38[0xf] = (char)((ulong)_UNK_007fc2c8 >> 0x38);
      auVar37._4_4_ = -(uint)(uVar17 < auVar34._8_8_);
      auVar37._0_4_ = -(uint)(uVar17 < auVar34._0_8_);
      auVar37._8_4_ = -(uint)(uVar17 < auVar38._0_8_);
      auVar37._12_4_ = -(uint)(uVar17 < auVar38._8_8_);
      auVar33 = auVar33 ^ (auVar33 ^ auVar35) & auVar37;
      auVar35 = NEON_ext(auVar33,auVar33,8,1);
      uVar16 = auVar33._0_4_ * auVar35._0_4_ * auVar33._4_4_ * auVar35._4_4_;
    }
    uVar26 = *(ulong *)(puVar24 + 0x28);
    if (uVar26 < 0x29) {
      if (uVar26 == 0) {
code_r0x0046fe2c:
        *(ulong *)(puVar24 + 0x28) = uVar26;
        return puVar24;
      }
      uVar17 = 0;
      lVar23 = uVar26 << 2;
      puVar6 = puVar24;
      do {
        uVar21 = uVar17 + (ulong)uVar16 * (ulong)*puVar6;
        *puVar6 = (uint)uVar21;
        uVar17 = uVar21 >> 0x20;
        lVar23 = lVar23 + -4;
        puVar6 = puVar6 + 1;
      } while (lVar23 != 0);
      if (uVar17 == 0) goto code_r0x0046fe2c;
      if (uVar26 != 0x28) {
        puVar24[uVar26] = (uint)(uVar21 >> 0x20);
        uVar26 = uVar26 + 1;
        goto code_r0x0046fe2c;
      }
    }
    else {
code_r0x0046fe38:
      func_0x007a28b0(uVar26,0x28,&UNK_009e0b68);
    }
code_r0x0046fe4c:
    puVar8 = &UNK_009e0b68;
    auVar33 = func_0x007a2570(0x28,0x28);
    piVar7 = auVar33._8_8_;
    puVar24 = auVar33._0_8_;
    uStack_48 = 0;
    uStack_50 = 0;
    uStack_38 = 0;
    uStack_40 = 0;
    uStack_68 = 0;
    uStack_70 = 0;
    uStack_58 = 0;
    uStack_60 = 0;
    uStack_88 = 0;
    uStack_90 = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    uStack_98 = 0;
    uStack_a0 = 0;
    uStack_c8 = 0;
    uStack_d0 = 0;
    uStack_b8 = 0;
    uStack_c0 = 0;
    puVar14 = *(undefined **)(puVar24 + 0x28);
    if (puVar14 < puVar8) {
      if (puVar14 < (undefined *)0x29) {
        puVar19 = (undefined *)0x0;
        uVar17 = 0;
        puVar6 = puVar24;
        do {
          lVar10 = 0;
          lVar23 = 0;
          param_5 = (uint *)((long)&uStack_d8 + uVar17 * 4 + 4);
          uVar26 = uVar17;
          do {
            uVar21 = uVar26;
            if ((uint *)((long)puVar6 + lVar10) == puVar24 + (long)puVar14) goto code_r0x0047009c;
            uVar16 = puVar6[lVar23];
            lVar23 = lVar23 + 1;
            param_5 = param_5 + 1;
            lVar10 = lVar10 + 4;
            uVar26 = uVar21 + 1;
          } while (uVar16 == 0);
          lVar28 = 0;
          uVar26 = 0;
          puVar6 = (uint *)((long)puVar6 + lVar10);
          do {
            if (0x27 < uVar21) goto code_r0x004700ec;
            uVar22 = uVar26 + *(uint *)((long)param_5 + lVar28) +
                     (ulong)*(uint *)((long)piVar7 + lVar28) * (ulong)uVar16;
            uVar26 = uVar22 >> 0x20;
            *(int *)((long)param_5 + lVar28) = (int)uVar22;
            lVar28 = lVar28 + 4;
            uVar21 = uVar21 + 1;
          } while ((long)puVar8 * 4 != lVar28);
          puVar15 = puVar8;
          if (uVar26 != 0) {
            if ((undefined *)0x27 < puVar8 + lVar23 + (uVar17 - 1)) goto LAB_00470114;
            *(int *)((long)&uStack_d8 + lVar23 * 4 + (long)(puVar8 + uVar17) * 4 + 4) =
                 (int)(uVar22 >> 0x20);
            puVar15 = puVar8 + 1;
          }
          if (puVar19 <= puVar15 + lVar23 + uVar17 + -1) {
            puVar19 = puVar15 + lVar23 + uVar17 + -1;
          }
          uVar17 = uVar17 + lVar23;
        } while( true );
      }
    }
    else if (puVar14 < (undefined *)0x29) {
      piVar2 = piVar7 + (long)puVar8;
      if (puVar14 == (undefined *)0x0) {
        puVar14 = (undefined *)0x0;
        puVar19 = (undefined *)0x0;
        while (piVar7 != piVar2) {
          puVar8 = puVar19;
          if (puVar19 <= puVar14) {
            puVar8 = puVar14;
          }
          if (*piVar7 == 0) {
            puVar8 = puVar19;
          }
          puVar14 = puVar14 + 1;
          puVar19 = puVar8;
          piVar7 = piVar7 + 1;
        }
code_r0x0047009c:
        *(undefined8 *)(puVar24 + 0x1a) = uStack_68;
        *(undefined8 *)(puVar24 + 0x18) = uStack_70;
        *(undefined8 *)(puVar24 + 0x1e) = uStack_58;
        *(undefined8 *)(puVar24 + 0x1c) = uStack_60;
        *(undefined8 *)(puVar24 + 0x22) = uStack_48;
        *(undefined8 *)(puVar24 + 0x20) = uStack_50;
        *(undefined8 *)(puVar24 + 0x26) = uStack_38;
        *(undefined8 *)(puVar24 + 0x24) = uStack_40;
        *(undefined8 *)(puVar24 + 10) = uStack_a8;
        *(undefined8 *)(puVar24 + 8) = uStack_b0;
        *(undefined8 *)(puVar24 + 0xe) = uStack_98;
        *(undefined8 *)(puVar24 + 0xc) = uStack_a0;
        *(undefined8 *)(puVar24 + 0x12) = uStack_88;
        *(undefined8 *)(puVar24 + 0x10) = uStack_90;
        *(undefined8 *)(puVar24 + 0x16) = uStack_78;
        *(undefined8 *)(puVar24 + 0x14) = uStack_80;
        *(undefined8 *)(puVar24 + 2) = uStack_c8;
        *(undefined8 *)puVar24 = uStack_d0;
        *(undefined8 *)(puVar24 + 6) = uStack_b8;
        *(undefined8 *)(puVar24 + 4) = uStack_c0;
        *(undefined **)(puVar24 + 0x28) = puVar19;
        return puVar24;
      }
      puVar19 = (undefined *)0x0;
      puVar6 = (uint *)0x0;
      do {
        lVar28 = 0;
        lVar10 = (long)&uStack_d8 + (long)puVar6 * 4 + 4;
        puVar20 = puVar6;
        lVar23 = 0;
        do {
          lVar27 = lVar23;
          puVar18 = puVar20;
          if ((int *)((long)piVar7 + lVar28) == piVar2) goto code_r0x0047009c;
          uVar16 = piVar7[lVar27];
          lVar23 = lVar27 + 1;
          lVar10 = lVar10 + 4;
          lVar28 = lVar28 + 4;
          puVar20 = (uint *)((long)puVar18 + 1);
        } while (uVar16 == 0);
        lVar11 = 0;
        uVar17 = 0;
        param_5 = (uint *)((long)puVar6 + lVar23);
        piVar7 = (int *)((long)piVar7 + lVar28);
        do {
          if ((uint *)((long)&segment_command_00000020.cmdsize + 3) < puVar18)
          goto code_r0x00470100;
          uVar26 = uVar17 + *(uint *)(lVar10 + lVar11) +
                   (ulong)*(uint *)((long)puVar24 + lVar11) * (ulong)uVar16;
          uVar17 = uVar26 >> 0x20;
          *(int *)(lVar10 + lVar11) = (int)uVar26;
          lVar11 = lVar11 + 4;
          puVar18 = (uint *)((long)puVar18 + 1);
        } while ((long)puVar14 * 4 != lVar11);
        puVar8 = puVar14;
        if (uVar17 != 0) {
          if ((undefined *)0x27 < (undefined *)((long)puVar6 + (long)(puVar14 + lVar27)))
          goto code_r0x00470130;
          *(int *)((long)&uStack_d8 + lVar23 * 4 + (long)(puVar14 + (long)puVar6) * 4 + 4) =
               (int)(uVar26 >> 0x20);
          puVar8 = puVar14 + 1;
        }
        if (puVar19 <= (undefined *)((long)puVar6 + (long)(puVar8 + lVar27))) {
          puVar19 = (undefined *)((long)puVar6 + (long)(puVar8 + lVar27));
        }
        puVar6 = param_5;
      } while( true );
    }
    func_0x007a28b0(puVar14,0x28,&UNK_009e0b68);
    uVar21 = extraout_x8;
code_r0x004700ec:
    func_0x007a2570(uVar21,0x28,&UNK_009e0b68);
    puVar18 = extraout_x9_00;
code_r0x00470100:
    puVar8 = &UNK_009e0b68;
    func_0x007a2570(puVar18,0x28,&UNK_009e0b68);
    uVar17 = extraout_x11;
    lVar23 = extraout_x17;
LAB_00470114:
    func_0x007a2570(puVar8 + lVar23 + uVar17 + -1,0x28,&UNK_009e0b68);
    puVar14 = extraout_x8_00;
    puVar6 = extraout_x14_00;
    lVar23 = extraout_x17_00;
code_r0x00470130:
    auVar33 = func_0x007a2570((undefined *)((long)puVar6 + (long)(puVar14 + lVar23 + -1)),0x28,
                              &UNK_009e0b68);
    puVar24 = auVar33._0_8_;
    uStack_d8 = 0x47014c;
    if (auVar33._8_4_ == 0) {
      func_0x007a247c(&UNK_00894dc0,0x1b,&UNK_009e0b68);
      uVar17 = extraout_x9_01;
    }
    else {
      uVar17 = *(ulong *)(puVar24 + 0x28);
      if (uVar17 < 0x29) {
        if (uVar17 != 0) {
          lVar10 = 0;
          lVar23 = uVar17 << 2;
          uVar17 = auVar33._8_8_ & 0xffffffff;
          do {
            uVar21 = (ulong)*(uint *)((long)puVar24 + lVar23 + -4) | lVar10 << 0x20;
            uVar26 = 0;
            if (uVar17 != 0) {
              uVar26 = uVar21 / uVar17;
            }
            lVar10 = uVar21 - uVar26 * uVar17;
            *(int *)((long)puVar24 + lVar23 + -4) = (int)uVar26;
            lVar23 = lVar23 + -4;
          } while (lVar23 != 0);
        }
        return puVar24;
      }
    }
    puVar9 = (undefined8 *)&UNK_009e0b68;
    auVar33 = func_0x007a28b0(uVar17,0x28);
    puVar24 = auVar33._8_8_;
    lVar23 = auVar33._0_8_;
    uVar17 = *(ulong *)(puVar24 + 0x28);
    if (uVar17 < 0x29) {
      lVar10 = uVar17 << 2;
      puVar6 = puVar24;
      do {
        if (lVar10 == 0) goto LAB_00470414;
        uVar16 = *puVar6;
        lVar10 = lVar10 + -4;
        puVar6 = puVar6 + 1;
      } while (uVar16 == 0);
      puVar9[0x11] = 0;
      puVar9[0x10] = 0;
      puVar9[0x13] = 0;
      puVar9[0x12] = 0;
      puVar9[0xd] = 0;
      puVar9[0xc] = 0;
      puVar9[0xf] = 0;
      puVar9[0xe] = 0;
      puVar9[9] = 0;
      puVar9[8] = 0;
      puVar9[0xb] = 0;
      puVar9[10] = 0;
      puVar9[5] = 0;
      puVar9[4] = 0;
      puVar9[7] = 0;
      puVar9[6] = 0;
      puVar9[1] = 0;
      *puVar9 = 0;
      puVar9[3] = 0;
      puVar9[2] = 0;
      param_5[2] = 0;
      param_5[3] = 0;
      param_5[0] = 0;
      param_5[1] = 0;
      param_5[6] = 0;
      param_5[7] = 0;
      param_5[4] = 0;
      param_5[5] = 0;
      param_5[10] = 0;
      param_5[0xb] = 0;
      param_5[8] = 0;
      param_5[9] = 0;
      param_5[0xe] = 0;
      param_5[0xf] = 0;
      param_5[0xc] = 0;
      param_5[0xd] = 0;
      param_5[0x12] = 0;
      param_5[0x13] = 0;
      param_5[0x10] = 0;
      param_5[0x11] = 0;
      param_5[0x16] = 0;
      param_5[0x17] = 0;
      param_5[0x14] = 0;
      param_5[0x15] = 0;
      param_5[0x1a] = 0;
      param_5[0x1b] = 0;
      param_5[0x18] = 0;
      param_5[0x19] = 0;
      param_5[0x1e] = 0;
      param_5[0x1f] = 0;
      param_5[0x1c] = 0;
      param_5[0x1d] = 0;
      param_5[0x22] = 0;
      param_5[0x23] = 0;
      param_5[0x20] = 0;
      param_5[0x21] = 0;
      param_5[0x26] = 0;
      param_5[0x27] = 0;
      param_5[0x24] = 0;
      param_5[0x25] = 0;
      *(ulong *)(param_5 + 0x28) = uVar17;
      puVar9[0x14] = 1;
      puVar6 = *(uint **)(lVar23 + 0xa0);
      if (puVar6 < segment_command_00000020.segname + 1) {
        piVar7 = (int *)(lVar23 + (long)puVar6 * 4);
        lVar10 = (long)puVar6 * -4;
        uVar26 = (long)puVar6 << 5 ^ 0xffffffffffffffff;
        do {
          if (lVar10 == 0) {
            return puVar6;
          }
          piVar7 = piVar7 + -1;
          lVar10 = lVar10 + 4;
          uVar26 = uVar26 + 0x20;
        } while (*piVar7 == 0);
        if (*piVar7 != 0) {
          uVar26 = ((uint)LZCOUNT(*piVar7) ^ 0x1f) - uVar26;
          if (uVar26 != 0) {
            bVar29 = true;
            do {
              uVar21 = uVar26 - 1;
              func_0x0046f88c(param_5,1);
              puVar6 = (uint *)(uVar21 >> 5);
              if (0x500 < uVar26) goto code_r0x0047042c;
              *param_5 = *(uint *)(lVar23 + (long)puVar6 * 4) >> (ulong)((uint)uVar21 & 0x1f) & 1 |
                         *param_5;
              uVar26 = uVar17;
              if (uVar17 <= *(ulong *)(param_5 + 0x28)) {
                uVar26 = *(ulong *)(param_5 + 0x28);
              }
              if (0x28 < uVar26) {
                func_0x007a28b0(uVar26,0x28,&UNK_009e0b68);
code_r0x004703cc:
                func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b68);
                goto LAB_004703e4;
              }
              lVar10 = uVar26 << 2;
              do {
                if (lVar10 == 0) goto code_r0x00470368;
                uVar16 = *(uint *)((long)param_5 + lVar10 + -4);
                uVar3 = *(uint *)((long)puVar24 + lVar10 + -4);
                lVar10 = lVar10 + -4;
              } while (uVar16 == uVar3);
              if (uVar3 <= uVar16) {
code_r0x00470368:
                uVar22 = uVar26;
                puVar20 = param_5;
                puVar18 = puVar24;
                bVar4 = true;
                do {
                  uVar16 = *puVar20;
                  uVar3 = ~*puVar18;
                  bVar1 = CARRY4(uVar16 + uVar3,(uint)bVar4);
                  *puVar20 = uVar3 + uVar16 + (uint)bVar4;
                  uVar22 = uVar22 - 1;
                  puVar20 = puVar20 + 1;
                  puVar18 = puVar18 + 1;
                  bVar4 = CARRY4(uVar16,uVar3) || bVar1;
                } while (uVar22 != 0);
                if (!CARRY4(uVar16,uVar3) && !bVar1) goto code_r0x004703cc;
                *(ulong *)(param_5 + 0x28) = uVar26;
                if (bVar29) {
                  puVar9[0x14] = (undefined1 *)((long)puVar6 + 1);
                }
                bVar29 = false;
                *(uint *)((long)puVar9 + (long)puVar6 * 4) =
                     *(uint *)((long)puVar9 + (long)puVar6 * 4) | 1 << ((uint)uVar21 & 0x1f);
              }
              uVar26 = uVar21;
            } while (uVar21 != 0);
          }
          return puVar6;
        }
        goto code_r0x00470408;
      }
    }
    else {
LAB_004703e4:
      puVar6 = (uint *)func_0x007a28b0(uVar17,0x28,&UNK_009e0b68);
    }
    func_0x007a28b0(puVar6,0x28,&UNK_009e0b68);
code_r0x00470408:
    func_0x007a20e8(&UNK_009e0b68);
LAB_00470414:
    puVar6 = (uint *)func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b68);
code_r0x0047042c:
    auVar33 = func_0x007a2570(puVar6,0x28,&UNK_009e0b68);
    iVar5 = _memcmp(auVar33._0_8_,auVar33._8_8_,0xa0);
    return (uint *)(ulong)(iVar5 == 0);
  }
  uVar3 = -param_3;
  uVar16 = param_2[uVar17] >> (ulong)(uVar3 & 0x1f);
  uVar17 = param_1;
  if (uVar16 != 0) {
    if (0x27 < param_1) {
      func_0x007a2570(param_1,0x28,&UNK_009e0b68);
      func_0x007a2570(extraout_x10 + extraout_x14 + -1,0x28,&UNK_009e0b68);
      uVar17 = extraout_x9;
      goto LAB_0046fcac;
    }
    param_2[param_1] = uVar16;
    uVar17 = param_1 + 1;
  }
  if (param_1 <= in_x10 + 1U) goto LAB_0046fc50;
  uVar16 = uVar3 & 0x1f;
  uVar21 = in_x14 - 1;
  uVar26 = param_1;
  if (3 < uVar21) {
    uVar26 = CONCAT44(uVar3,uVar3) & 0x1f0000001f;
    auVar30._4_4_ = in_w11;
    auVar30._0_4_ = in_w11;
    auVar30._8_4_ = in_w11;
    auVar30._12_4_ = in_w11;
    iVar5 = (int)uVar26;
    iVar31 = (int)(uVar26 >> 0x20);
    if (uVar21 < 0x10) {
      uVar22 = 0;
    }
    else {
      uVar22 = uVar21 & 0xfffffffffffffff0;
      pauVar13 = (undefined1 (*) [16])(param_2 + (param_1 - 8));
      auVar32._0_4_ = -iVar5;
      auVar32._4_4_ = -iVar31;
      auVar32._8_4_ = -uVar16;
      auVar32._12_4_ = -uVar16;
      uVar26 = uVar22;
      do {
        auVar38 = pauVar13[-2];
        auVar33 = pauVar13[-1];
        auVar35 = *(undefined1 (*) [16])(pauVar13[-2] + 0xc);
        auVar37 = *(undefined1 (*) [16])(pauVar13[-3] + 0xc);
        auVar39 = NEON_ushl(*(undefined1 (*) [16])(*pauVar13 + 0xc),auVar32,4);
        auVar34 = NEON_ushl(pauVar13[1],auVar30,4);
        auVar40 = NEON_ushl(*(undefined1 (*) [16])(pauVar13[-1] + 0xc),auVar32,4);
        auVar36 = NEON_ushl(*pauVar13,auVar30,4);
        (*pauVar13)[8] = auVar40[8] | auVar36[8];
        (*pauVar13)[9] = auVar40[9] | auVar36[9];
        (*pauVar13)[10] = auVar40[10] | auVar36[10];
        (*pauVar13)[0xb] = auVar40[0xb] | auVar36[0xb];
        (*pauVar13)[0xc] = auVar40[0xc] | auVar36[0xc];
        (*pauVar13)[0xd] = auVar40[0xd] | auVar36[0xd];
        (*pauVar13)[0xe] = auVar40[0xe] | auVar36[0xe];
        (*pauVar13)[0xf] = auVar40[0xf] | auVar36[0xf];
        (*pauVar13)[0] = auVar40[0] | auVar36[0];
        (*pauVar13)[1] = auVar40[1] | auVar36[1];
        (*pauVar13)[2] = auVar40[2] | auVar36[2];
        (*pauVar13)[3] = auVar40[3] | auVar36[3];
        (*pauVar13)[4] = auVar40[4] | auVar36[4];
        (*pauVar13)[5] = auVar40[5] | auVar36[5];
        (*pauVar13)[6] = auVar40[6] | auVar36[6];
        (*pauVar13)[7] = auVar40[7] | auVar36[7];
        pauVar13[1][8] = auVar39[8] | auVar34[8];
        pauVar13[1][9] = auVar39[9] | auVar34[9];
        pauVar13[1][10] = auVar39[10] | auVar34[10];
        pauVar13[1][0xb] = auVar39[0xb] | auVar34[0xb];
        pauVar13[1][0xc] = auVar39[0xc] | auVar34[0xc];
        pauVar13[1][0xd] = auVar39[0xd] | auVar34[0xd];
        pauVar13[1][0xe] = auVar39[0xe] | auVar34[0xe];
        pauVar13[1][0xf] = auVar39[0xf] | auVar34[0xf];
        pauVar13[1][0] = auVar39[0] | auVar34[0];
        pauVar13[1][1] = auVar39[1] | auVar34[1];
        pauVar13[1][2] = auVar39[2] | auVar34[2];
        pauVar13[1][3] = auVar39[3] | auVar34[3];
        pauVar13[1][4] = auVar39[4] | auVar34[4];
        pauVar13[1][5] = auVar39[5] | auVar34[5];
        pauVar13[1][6] = auVar39[6] | auVar34[6];
        pauVar13[1][7] = auVar39[7] | auVar34[7];
        auVar35 = NEON_ushl(auVar35,auVar32,4);
        auVar33 = NEON_ushl(auVar33,auVar30,4);
        auVar37 = NEON_ushl(auVar37,auVar32,4);
        auVar38 = NEON_ushl(auVar38,auVar30,4);
        pauVar13[-2][8] = auVar37[8] | auVar38[8];
        pauVar13[-2][9] = auVar37[9] | auVar38[9];
        pauVar13[-2][10] = auVar37[10] | auVar38[10];
        pauVar13[-2][0xb] = auVar37[0xb] | auVar38[0xb];
        pauVar13[-2][0xc] = auVar37[0xc] | auVar38[0xc];
        pauVar13[-2][0xd] = auVar37[0xd] | auVar38[0xd];
        pauVar13[-2][0xe] = auVar37[0xe] | auVar38[0xe];
        pauVar13[-2][0xf] = auVar37[0xf] | auVar38[0xf];
        pauVar13[-2][0] = auVar37[0] | auVar38[0];
        pauVar13[-2][1] = auVar37[1] | auVar38[1];
        pauVar13[-2][2] = auVar37[2] | auVar38[2];
        pauVar13[-2][3] = auVar37[3] | auVar38[3];
        pauVar13[-2][4] = auVar37[4] | auVar38[4];
        pauVar13[-2][5] = auVar37[5] | auVar38[5];
        pauVar13[-2][6] = auVar37[6] | auVar38[6];
        pauVar13[-2][7] = auVar37[7] | auVar38[7];
        pauVar13[-1][8] = auVar35[8] | auVar33[8];
        pauVar13[-1][9] = auVar35[9] | auVar33[9];
        pauVar13[-1][10] = auVar35[10] | auVar33[10];
        pauVar13[-1][0xb] = auVar35[0xb] | auVar33[0xb];
        pauVar13[-1][0xc] = auVar35[0xc] | auVar33[0xc];
        pauVar13[-1][0xd] = auVar35[0xd] | auVar33[0xd];
        pauVar13[-1][0xe] = auVar35[0xe] | auVar33[0xe];
        pauVar13[-1][0xf] = auVar35[0xf] | auVar33[0xf];
        pauVar13[-1][0] = auVar35[0] | auVar33[0];
        pauVar13[-1][1] = auVar35[1] | auVar33[1];
        pauVar13[-1][2] = auVar35[2] | auVar33[2];
        pauVar13[-1][3] = auVar35[3] | auVar33[3];
        pauVar13[-1][4] = auVar35[4] | auVar33[4];
        pauVar13[-1][5] = auVar35[5] | auVar33[5];
        pauVar13[-1][6] = auVar35[6] | auVar33[6];
        pauVar13[-1][7] = auVar35[7] | auVar33[7];
        pauVar13 = pauVar13 + -4;
        uVar26 = uVar26 - 0x10;
      } while (uVar26 != 0);
      if (uVar21 == uVar22) goto LAB_0046fc50;
      if ((uVar21 & 0xc) == 0) {
        uVar26 = param_1 - uVar22;
        goto LAB_0046fc1c;
      }
    }
    uVar25 = uVar21 & 0xfffffffffffffffc;
    uVar26 = param_1 - uVar25;
    pauVar13 = (undefined1 (*) [16])(param_2 + ((param_1 - 5) - uVar22));
    lVar23 = uVar22 - uVar25;
    auVar36._0_4_ = -iVar5;
    auVar36._4_4_ = -iVar31;
    auVar36._8_4_ = -uVar16;
    auVar36._12_4_ = -uVar16;
    do {
      auVar35 = NEON_ushl(*pauVar13,auVar36,4);
      auVar33 = NEON_ushl(*(undefined1 (*) [16])(*pauVar13 + 4),auVar30,4);
      (*pauVar13)[0xc] = auVar35[8] | auVar33[8];
      (*pauVar13)[0xd] = auVar35[9] | auVar33[9];
      (*pauVar13)[0xe] = auVar35[10] | auVar33[10];
      (*pauVar13)[0xf] = auVar35[0xb] | auVar33[0xb];
      pauVar13[1][0] = auVar35[0xc] | auVar33[0xc];
      pauVar13[1][1] = auVar35[0xd] | auVar33[0xd];
      pauVar13[1][2] = auVar35[0xe] | auVar33[0xe];
      pauVar13[1][3] = auVar35[0xf] | auVar33[0xf];
      (*pauVar13)[4] = auVar35[0] | auVar33[0];
      (*pauVar13)[5] = auVar35[1] | auVar33[1];
      (*pauVar13)[6] = auVar35[2] | auVar33[2];
      (*pauVar13)[7] = auVar35[3] | auVar33[3];
      (*pauVar13)[8] = auVar35[4] | auVar33[4];
      (*pauVar13)[9] = auVar35[5] | auVar33[5];
      (*pauVar13)[10] = auVar35[6] | auVar33[6];
      (*pauVar13)[0xb] = auVar35[7] | auVar33[7];
      pauVar13 = pauVar13 + -1;
      lVar23 = lVar23 + 4;
    } while (lVar23 != 0);
    if (uVar21 == uVar25) goto LAB_0046fc50;
  }
LAB_0046fc1c:
  puVar24 = param_2 + (uVar26 - 1);
  do {
    uVar26 = uVar26 - 1;
    *puVar24 = puVar24[-1] >> (ulong)uVar16 | *puVar24 << (ulong)(in_w11 & 0x1f);
    puVar24 = puVar24 + -1;
  } while (in_x10 + 1U < uVar26);
LAB_0046fc50:
  param_2[in_x10] = param_2[in_x10] << (ulong)(in_w11 & 0x1f);
  *(ulong *)(param_2 + 0x28) = uVar17;
  return param_2;
}



undefined1  [16]
FUN_0046ff2c(ulong param_1,undefined8 *param_2,long param_3,undefined *param_4,uint *param_5,
            ulong param_6,ulong param_7,ulong param_8,undefined8 param_9,undefined8 param_10,
            undefined8 param_11,undefined8 param_12,undefined8 param_13,undefined8 param_14,
            undefined8 param_15,undefined8 param_16,undefined8 param_17,undefined8 param_18,
            undefined8 param_19,undefined8 param_20,undefined8 param_21,undefined8 param_22,
            undefined8 param_23,undefined8 param_24,undefined8 param_25,undefined8 param_26,
            undefined8 param_27,undefined8 param_28,undefined8 param_29)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  int iVar5;
  uint *puVar6;
  uint *puVar7;
  uint *extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  undefined *puVar11;
  long extraout_x8;
  undefined *in_x9;
  undefined8 extraout_x9;
  ulong uVar12;
  long lVar13;
  ulong extraout_x9_00;
  int *piVar14;
  undefined *in_x10;
  ulong uVar15;
  ulong in_x11;
  ulong extraout_x11;
  ulong uVar16;
  long in_x12;
  long in_x13;
  uint *puVar17;
  long in_x14;
  long extraout_x14;
  long in_x15;
  long in_x16;
  long in_x17;
  long extraout_x17;
  long extraout_x17_00;
  long unaff_x19;
  ulong uVar18;
  bool bVar19;
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  
  while( true ) {
    param_1 = param_1 + 1;
    uVar12 = param_6;
    if (in_x14 == unaff_x19) {
      puVar11 = param_4;
      if (param_8 != 0) {
        if (0x27 < in_x12 + in_x11 + in_x17) goto LAB_00470114;
        *(int *)(in_x13 + (long)(param_4 + in_x11) * 4 + in_x17 * 4) = (int)param_8;
        puVar11 = in_x9;
      }
      if (in_x10 <= puVar11 + in_x17 + in_x11 + -1) {
        in_x10 = puVar11 + in_x17 + in_x11 + -1;
      }
      lVar9 = 0;
      in_x17 = 0;
      param_5 = (uint *)(in_x13 + param_6 * 4);
      do {
        param_1 = uVar12;
        if (in_x15 + lVar9 == in_x16) {
          param_2[0xd] = param_23;
          param_2[0xc] = param_22;
          param_2[0xf] = param_25;
          param_2[0xe] = param_24;
          param_2[0x11] = param_27;
          param_2[0x10] = param_26;
          param_2[0x13] = param_29;
          param_2[0x12] = param_28;
          param_2[5] = param_15;
          param_2[4] = param_14;
          param_2[7] = param_17;
          param_2[6] = param_16;
          param_2[9] = param_19;
          param_2[8] = param_18;
          param_2[0xb] = param_21;
          param_2[10] = param_20;
          param_2[1] = param_11;
          *param_2 = param_10;
          param_2[3] = param_13;
          param_2[2] = param_12;
          param_2[0x14] = in_x10;
          auVar20._8_8_ = param_3;
          auVar20._0_8_ = param_2;
          return auVar20;
        }
        uVar2 = *(uint *)(in_x15 + in_x17 * 4);
        param_7 = (ulong)uVar2;
        in_x17 = in_x17 + 1;
        param_5 = param_5 + 1;
        lVar9 = lVar9 + 4;
        uVar12 = param_1 + 1;
      } while (uVar2 == 0);
      unaff_x19 = 0;
      param_8 = 0;
      uVar12 = param_6 + in_x17;
      in_x15 = in_x15 + lVar9;
      in_x11 = param_6;
    }
    if (0x27 < param_1) break;
    uVar10 = param_8 + *(uint *)((long)param_5 + unaff_x19) +
             (ulong)*(uint *)(param_3 + unaff_x19) * (param_7 & 0xffffffff);
    param_8 = uVar10 >> 0x20;
    *(int *)((long)param_5 + unaff_x19) = (int)uVar10;
    unaff_x19 = unaff_x19 + 4;
    param_6 = uVar12;
  }
  func_0x007a2570(param_1,0x28,&UNK_009e0b68);
  param_4 = &UNK_009e0b68;
  func_0x007a2570(extraout_x9,0x28,&UNK_009e0b68);
  in_x11 = extraout_x11;
  in_x17 = extraout_x17;
LAB_00470114:
  func_0x007a2570(param_4 + in_x17 + in_x11 + -1,0x28,&UNK_009e0b68);
  auVar20 = func_0x007a2570(extraout_x8 + extraout_x14 + extraout_x17_00 + -1,0x28,&UNK_009e0b68);
  auVar21._0_8_ = auVar20._0_8_;
  if (auVar20._8_4_ == 0) {
    func_0x007a247c(&UNK_00894dc0,0x1b,&UNK_009e0b68);
    uVar12 = extraout_x9_00;
  }
  else {
    uVar12 = *(ulong *)(auVar21._0_8_ + 0xa0);
    if (uVar12 < 0x29) {
      if (uVar12 == 0) {
        lVar9 = 0;
      }
      else {
        lVar9 = 0;
        lVar13 = uVar12 << 2;
        uVar12 = auVar20._8_8_ & 0xffffffff;
        do {
          uVar16 = (ulong)*(uint *)(auVar21._0_8_ + -4 + lVar13) | lVar9 << 0x20;
          uVar10 = 0;
          if (uVar12 != 0) {
            uVar10 = uVar16 / uVar12;
          }
          lVar9 = uVar16 - uVar10 * uVar12;
          *(int *)(auVar21._0_8_ + -4 + lVar13) = (int)uVar10;
          lVar13 = lVar13 + -4;
        } while (lVar13 != 0);
      }
      auVar21._8_8_ = lVar9;
      return auVar21;
    }
  }
  puVar8 = (undefined8 *)&UNK_009e0b68;
  auVar20 = func_0x007a28b0(uVar12,0x28);
  puVar6 = auVar20._8_8_;
  lVar9 = auVar20._0_8_;
  uVar12 = *(ulong *)(puVar6 + 0x28);
  if (uVar12 < 0x29) {
    lVar13 = uVar12 << 2;
    puVar7 = puVar6;
    do {
      if (lVar13 == 0) goto LAB_00470414;
      uVar2 = *puVar7;
      lVar13 = lVar13 + -4;
      puVar7 = puVar7 + 1;
    } while (uVar2 == 0);
    puVar8[0x11] = 0;
    puVar8[0x10] = 0;
    puVar8[0x13] = 0;
    puVar8[0x12] = 0;
    puVar8[0xd] = 0;
    puVar8[0xc] = 0;
    puVar8[0xf] = 0;
    puVar8[0xe] = 0;
    puVar8[9] = 0;
    puVar8[8] = 0;
    puVar8[0xb] = 0;
    puVar8[10] = 0;
    puVar8[5] = 0;
    puVar8[4] = 0;
    puVar8[7] = 0;
    puVar8[6] = 0;
    puVar8[1] = 0;
    *puVar8 = 0;
    puVar8[3] = 0;
    puVar8[2] = 0;
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
    *(ulong *)(param_5 + 0x28) = uVar12;
    puVar8[0x14] = 1;
    uVar10 = *(ulong *)(lVar9 + 0xa0);
    if (uVar10 < 0x29) {
      piVar14 = (int *)(lVar9 + uVar10 * 4);
      lVar13 = uVar10 * -4;
      uVar16 = uVar10 << 5 ^ 0xffffffffffffffff;
      do {
        puVar7 = puVar6;
        if (lVar13 == 0) goto code_r0x004702a8;
        piVar14 = piVar14 + -1;
        lVar13 = lVar13 + 4;
        uVar16 = uVar16 + 0x20;
      } while (*piVar14 == 0);
      if (*piVar14 != 0) {
        uVar16 = ((uint)LZCOUNT(*piVar14) ^ 0x1f) - uVar16;
        if (uVar16 != 0) {
          bVar19 = true;
          do {
            uVar18 = uVar16 - 1;
            func_0x0046f88c(param_5,1);
            uVar10 = uVar18 >> 5;
            if (0x500 < uVar16) goto code_r0x0047042c;
            *param_5 = *(uint *)(lVar9 + uVar10 * 4) >> (ulong)((uint)uVar18 & 0x1f) & 1 | *param_5;
            uVar16 = uVar12;
            if (uVar12 <= *(ulong *)(param_5 + 0x28)) {
              uVar16 = *(ulong *)(param_5 + 0x28);
            }
            if (0x28 < uVar16) {
              func_0x007a28b0(uVar16,0x28,&UNK_009e0b68);
code_r0x004703cc:
              func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b68);
              goto LAB_004703e4;
            }
            lVar13 = uVar16 << 2;
            do {
              if (lVar13 == 0) goto code_r0x00470368;
              uVar2 = *(uint *)((long)param_5 + lVar13 + -4);
              uVar3 = *(uint *)((long)puVar6 + lVar13 + -4);
              lVar13 = lVar13 + -4;
            } while (uVar2 == uVar3);
            if (uVar3 <= uVar2) {
code_r0x00470368:
              uVar15 = uVar16;
              puVar7 = param_5;
              puVar17 = puVar6;
              bVar4 = true;
              do {
                uVar2 = *puVar7;
                uVar3 = ~*puVar17;
                bVar1 = CARRY4(uVar2 + uVar3,(uint)bVar4);
                *puVar7 = uVar3 + uVar2 + (uint)bVar4;
                uVar15 = uVar15 - 1;
                puVar7 = puVar7 + 1;
                puVar17 = puVar17 + 1;
                bVar4 = CARRY4(uVar2,uVar3) || bVar1;
              } while (uVar15 != 0);
              if (!CARRY4(uVar2,uVar3) && !bVar1) goto code_r0x004703cc;
              *(ulong *)(param_5 + 0x28) = uVar16;
              if (bVar19) {
                puVar8[0x14] = uVar10 + 1;
              }
              bVar19 = false;
              *(uint *)((long)puVar8 + uVar10 * 4) =
                   *(uint *)((long)puVar8 + uVar10 * 4) | 1 << ((uint)uVar18 & 0x1f);
            }
            puVar7 = extraout_x1;
            uVar16 = uVar18;
          } while (uVar18 != 0);
        }
code_r0x004702a8:
        auVar22._8_8_ = puVar7;
        auVar22._0_8_ = uVar10;
        return auVar22;
      }
      goto code_r0x00470408;
    }
  }
  else {
LAB_004703e4:
    uVar10 = func_0x007a28b0(uVar12,0x28,&UNK_009e0b68);
  }
  func_0x007a28b0(uVar10,0x28,&UNK_009e0b68);
code_r0x00470408:
  func_0x007a20e8(&UNK_009e0b68);
LAB_00470414:
  uVar10 = func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b68);
code_r0x0047042c:
  auVar20 = func_0x007a2570(uVar10,0x28,&UNK_009e0b68);
  iVar5 = _memcmp(auVar20._0_8_,auVar20._8_8_,0xa0);
  auVar23._1_7_ = 0;
  auVar23[0] = iVar5 == 0;
  auVar23._8_8_ = extraout_x1_00;
  return auVar23;
}


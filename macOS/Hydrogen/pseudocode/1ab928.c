
void FUN_001ab928(undefined8 param_1)

{
  ulong *puVar1;
  undefined1 uVar2;
  byte bVar3;
  char cVar4;
  ushort uVar5;
  long lVar6;
  ushort uVar7;
  code *pcVar8;
  long *plVar9;
  undefined8 uVar10;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  ulong extraout_x1_02;
  long lVar11;
  ulong extraout_x1_03;
  ulong extraout_x1_04;
  ulong uVar12;
  undefined8 *extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  undefined8 *extraout_x8_02;
  ulong extraout_x8_03;
  ulong extraout_x8_04;
  undefined8 *extraout_x8_05;
  ulong extraout_x8_06;
  ulong extraout_x8_07;
  ulong uVar13;
  long *extraout_x8_08;
  ulong extraout_x9;
  ulong extraout_x9_00;
  ulong extraout_x9_01;
  ulong extraout_x9_02;
  ulong extraout_x9_03;
  ulong uVar14;
  ulong extraout_x9_04;
  long lVar15;
  uint uVar16;
  uint extraout_w13;
  undefined8 *puVar17;
  undefined8 *puVar18;
  undefined1 uVar19;
  long unaff_x22;
  long lVar20;
  long unaff_x23;
  ulong uVar21;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long lStack_258;
  long lStack_250;
  long lStack_248;
  long lStack_1e0;
  ulong uStack_1d8;
  ulong uStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  long lStack_1b8;
  long lStack_1b0;
  long lStack_1a8;
  long lStack_1a0;
  long lStack_198;
  long lStack_190;
  long lStack_188;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  undefined4 uStack_80;
  ushort uStack_7c;
  undefined2 uStack_7a;
  ulong uStack_78;
  ushort uStack_70;
  ushort uStack_6e;
  uint uStack_6c;
  ulong uStack_68;
  
  if (in_stack_00000020 != 0) {
    func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 2,2);
  }
  plVar9 = (long *)__Unwind_Resume(param_1);
  uVar12 = plVar9[1];
  uVar14 = plVar9[2];
  if (uVar12 - uVar14 < 2) {
    extraout_x8[2] = &UNK_008298da;
    extraout_x8[3] = 3;
    *(undefined1 *)(extraout_x8 + 1) = 0xc;
    *extraout_x8 = 1;
    return;
  }
  uVar13 = uVar14 + 2;
  plVar9[2] = uVar13;
  if (uVar14 < 0xfffffffffffffffe) {
    if (uVar12 < uVar13) goto code_r0x001abbe4;
    uVar5 = *(ushort *)(*plVar9 + uVar14);
    uStack_a8 = (ulong)((uint)(uVar5 >> 8) | (uVar5 & 0xff00ff) << 8);
    if (uVar12 - uVar13 < uStack_a8) {
      extraout_x8[2] = uStack_a8;
      extraout_x8[3] = 0;
      *extraout_x8 = 1;
      extraout_x8[1] = 0xb;
      return;
    }
    uVar14 = uVar13 + uStack_a8;
    plVar9[2] = uVar14;
    if (CARRY8(uVar13,uStack_a8)) goto code_r0x001abbf4;
    if (uVar14 <= uVar12) {
      lStack_b0 = *plVar9 + uVar13;
      uStack_a0 = 0;
      lStack_98 = 0;
      lStack_90 = 8;
      lStack_88 = 0;
      if (uVar5 != 0) {
        do {
          func_0x001f2140(&uStack_80,&lStack_b0);
          uVar7 = uStack_7c;
          uVar5 = uStack_80._2_2_;
          if ((char)uStack_80 != '\x15') {
            uVar19 = (undefined1)((uint)uStack_80 >> 8);
            uVar16 = (uint)uStack_7c;
            uStack_68 = (ulong)uStack_70;
            uVar12 = uStack_78;
code_r0x001abb34:
            *(char *)(extraout_x8 + 1) = (char)uStack_80;
            *(undefined1 *)((long)extraout_x8 + 9) = uVar19;
            *(ushort *)((long)extraout_x8 + 10) = uStack_80._2_2_;
            *(short *)((long)extraout_x8 + 0xc) = (short)uVar16;
            *(undefined2 *)((long)extraout_x8 + 0xe) = uStack_7a;
            extraout_x8[2] = uVar12;
            *(short *)(extraout_x8 + 3) = (short)uStack_68;
            *(ushort *)((long)extraout_x8 + 0x1a) = uStack_6e;
            *(uint *)((long)extraout_x8 + 0x1c) = uStack_6c;
            *extraout_x8 = 1;
            if (lStack_88 != 0) {
              puVar17 = (undefined8 *)(lStack_90 + 8);
              lVar15 = lStack_88;
              do {
                if (puVar17[-1] != 0) {
                  func_0x00187bd4(*puVar17,puVar17[-1],1);
                }
                puVar17 = puVar17 + 4;
                lVar15 = lVar15 + -1;
              } while (lVar15 != 0);
            }
            if (lStack_98 == 0) {
              return;
            }
            func_0x00187bd4(lStack_90,lStack_98 << 5,8);
            return;
          }
          uVar21 = (ulong)uStack_80._2_2_;
          func_0x00223f7c(&uStack_80,&lStack_b0);
          uVar13 = uStack_68;
          uVar14 = uStack_78;
          lVar15 = lStack_88;
          uVar12 = CONCAT44(uStack_6c,CONCAT22(uStack_6e,uStack_70));
          if (uStack_80 == 1) {
            uVar19 = (undefined1)(uStack_78 >> 8);
            uStack_80._0_1_ = (char)uStack_78;
            uStack_80._2_2_ = (ushort)(uStack_78 >> 0x10);
            uVar16 = (uint)(uStack_78 >> 0x20);
            uStack_7a = (undefined2)(uStack_78 >> 0x30);
            uStack_6e = (ushort)(uStack_68 >> 0x10);
            uStack_6c = (uint)(uStack_68 >> 0x20);
            goto code_r0x001abb34;
          }
          if (uStack_78 == 0x8000000000000000) {
            uStack_80._0_1_ = (char)uStack_70;
            uVar19 = (undefined1)(uStack_70 >> 8);
            uStack_7a = (undefined2)(uStack_6c >> 0x10);
            uVar12 = uStack_68;
            uStack_68 = uVar21;
            uVar16 = uStack_6c;
            uStack_6c = extraout_w13;
            uStack_80._2_2_ = uStack_6e;
            uStack_6e = uVar7;
            goto code_r0x001abb34;
          }
          if (lStack_88 == lStack_98) {
            func_0x001d8840(&lStack_98,&UNK_009c24d8);
          }
          puVar1 = (ulong *)(lStack_90 + lVar15 * 0x20);
          *puVar1 = uVar14;
          puVar1[1] = uVar12;
          puVar1[2] = uVar13;
          *(ushort *)(puVar1 + 3) = uVar5;
          *(ushort *)((long)puVar1 + 0x1a) = uVar7;
          lStack_88 = lVar15 + 1;
        } while (uStack_a0 < uStack_a8);
      }
      extraout_x8[2] = lStack_90;
      extraout_x8[1] = lStack_98;
      extraout_x8[3] = lStack_88;
      *extraout_x8 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(uVar14,uVar13,&UNK_009c9a78);
    uVar12 = extraout_x1;
    uVar13 = extraout_x8_00;
code_r0x001abbe4:
    func_0x007a28b0(uVar13,uVar12,&UNK_009c9a78);
    uVar13 = extraout_x8_01;
    uVar14 = extraout_x9;
code_r0x001abbf4:
    func_0x007a28bc(uVar13,uVar14,&UNK_009c9a78);
    uVar12 = extraout_x1_00;
    uVar14 = extraout_x9_00;
  }
  uVar10 = func_0x007a28b0(uVar14,uVar12,&UNK_009c9a78);
  if (unaff_x22 != 0) {
    func_0x00187bd4();
    func_0x001a0dec(&lStack_98);
    uVar10 = __Unwind_Resume(uVar10);
  }
  func_0x001a0dec(&lStack_98);
  plVar9 = (long *)__Unwind_Resume(uVar10);
  uVar12 = plVar9[1];
  uVar14 = plVar9[2];
  if (uVar12 == uVar14) {
    extraout_x8_02[2] = &UNK_008298d8;
    extraout_x8_02[3] = 2;
    *(undefined1 *)(extraout_x8_02 + 1) = 0xc;
    *extraout_x8_02 = 1;
    return;
  }
  uVar13 = uVar14 + 1;
  plVar9[2] = uVar13;
  if (uVar14 < 0xffffffffffffffff) {
    if (uVar12 < uVar13) goto code_r0x001abdc0;
    lVar15 = *plVar9;
    bVar3 = *(byte *)(lVar15 + uVar14);
    uVar21 = (ulong)bVar3;
    if (uVar12 - uVar13 < uVar21) {
      extraout_x8_02[2] = uVar21;
      extraout_x8_02[3] = 0;
      *extraout_x8_02 = 1;
      extraout_x8_02[1] = 0xb;
      return;
    }
    uVar14 = uVar13 + uVar21;
    plVar9[2] = uVar14;
    if (CARRY8(uVar13,uVar21)) goto code_r0x001abdd0;
    if (uVar14 <= uVar12) {
      lStack_128 = 0;
      lStack_120 = 1;
      lStack_118 = 0;
      if (bVar3 != 0) {
        lVar20 = 0;
        do {
          lVar11 = lStack_118;
          cVar4 = *(char *)(lVar15 + uVar13 + lStack_118);
          uVar19 = 1;
          if (cVar4 != '\x02') {
            uVar19 = 2;
          }
          uVar2 = 0;
          if (cVar4 != '\0') {
            uVar2 = uVar19;
          }
          if (lStack_118 == lStack_128) {
            func_0x001d8c88(&lStack_128,&UNK_009c24d8);
          }
          *(undefined1 *)(lStack_120 + lVar20) = uVar2;
          ((undefined1 *)(lStack_120 + lVar20))[1] = cVar4;
          lStack_118 = lVar11 + 1;
          lVar20 = lVar20 + 2;
        } while (lVar11 != uVar21 - 1);
      }
      extraout_x8_02[2] = lStack_120;
      extraout_x8_02[1] = lStack_128;
      extraout_x8_02[3] = lStack_118;
      *extraout_x8_02 = 0;
      return;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar13,&UNK_009c9a78);
    uVar12 = extraout_x1_01;
    uVar13 = extraout_x8_03;
code_r0x001abdc0:
    func_0x007a28b0(uVar13,uVar12,&UNK_009c9a78);
    uVar13 = extraout_x8_04;
    uVar14 = extraout_x9_01;
code_r0x001abdd0:
    func_0x007a28bc(uVar13,uVar14,&UNK_009c9a78);
    uVar12 = extraout_x1_02;
    uVar14 = extraout_x9_02;
  }
  uVar10 = func_0x007a28b0(uVar14,uVar12,&UNK_009c9a78);
  if (lStack_128 != 0) {
    func_0x00187bd4(lStack_120,lStack_128 << 1,1);
  }
  plVar9 = (long *)__Unwind_Resume(uVar10);
  uVar12 = plVar9[1];
  uVar14 = plVar9[2];
  if (uVar12 - uVar14 < 2) {
    extraout_x8_05[2] = &UNK_008298da;
    extraout_x8_05[3] = 3;
    *(undefined1 *)(extraout_x8_05 + 1) = 0xc;
    *extraout_x8_05 = 1;
    return;
  }
  uVar13 = uVar14 + 2;
  plVar9[2] = uVar13;
  if (uVar14 < 0xfffffffffffffffe) {
    if (uVar12 < uVar13) goto LAB_001ac00c;
    uVar5 = *(ushort *)(*plVar9 + uVar14);
    uStack_1d8 = (ulong)((uint)(uVar5 >> 8) | (uVar5 & 0xff00ff) << 8);
    if (uVar12 - uVar13 < uStack_1d8) {
      extraout_x8_05[2] = uStack_1d8;
      extraout_x8_05[3] = 0;
      *extraout_x8_05 = 1;
      extraout_x8_05[1] = 0xb;
      return;
    }
    uVar14 = uVar13 + uStack_1d8;
    plVar9[2] = uVar14;
    if (!CARRY8(uVar13,uStack_1d8)) {
      if (uVar14 <= uVar12) {
        lStack_1e0 = *plVar9 + uVar13;
        uStack_1d0 = 0;
        lStack_1c8 = 0;
        lStack_1c0 = 8;
        lStack_1b8 = 0;
        if (uVar5 != 0) {
          do {
            func_0x001b932c(&lStack_1a0,&lStack_1e0);
            lVar6 = lStack_198;
            lVar11 = lStack_1a0;
            lVar20 = lStack_1b8;
            lVar15 = lStack_1c0;
            lStack_1a8 = lStack_188;
            lStack_1b0 = lStack_190;
            if (lStack_1a0 == -0x7ffffffffffffffe) {
              extraout_x8_05[3] = lStack_188;
              extraout_x8_05[2] = lStack_190;
              *extraout_x8_05 = 1;
              extraout_x8_05[1] = lStack_198;
              if (lStack_1b8 != 0) {
                puVar17 = (undefined8 *)(lStack_1c0 + 8);
                do {
                  lVar11 = puVar17[-1];
                  if (-0x7fffffffffffffff < lVar11 && lVar11 != 0) {
                    func_0x00187bd4(*puVar17,lVar11,1);
                  }
                  puVar17 = puVar17 + 4;
                  lVar20 = lVar20 + -1;
                } while (lVar20 != 0);
              }
              if (lStack_1c8 == 0) {
                return;
              }
              func_0x00187bd4(lVar15,lStack_1c8 << 5,8);
              return;
            }
            if (lStack_1b8 == lStack_1c8) {
              func_0x001d8840(&lStack_1c8,&UNK_009c24d8);
            }
            plVar9 = (long *)(lStack_1c0 + lVar20 * 0x20);
            *plVar9 = lVar11;
            plVar9[1] = lVar6;
            plVar9[3] = lStack_1a8;
            plVar9[2] = lStack_1b0;
            lStack_1b8 = lVar20 + 1;
          } while (uStack_1d0 < uStack_1d8);
        }
        extraout_x8_05[2] = lStack_1c0;
        extraout_x8_05[1] = lStack_1c8;
        extraout_x8_05[3] = lStack_1b8;
        *extraout_x8_05 = 0;
        return;
      }
      goto LAB_001ac030;
    }
  }
  else {
    func_0x007a28bc(uVar14,uVar13,&UNK_009c9a78);
    uVar12 = extraout_x1_03;
    uVar13 = extraout_x8_06;
LAB_001ac00c:
    func_0x007a28b0(uVar13,uVar12,&UNK_009c9a78);
    uVar13 = extraout_x8_07;
    uVar14 = extraout_x9_03;
  }
  func_0x007a28bc(uVar13,uVar14,&UNK_009c9a78);
  uVar12 = extraout_x1_04;
  uVar14 = extraout_x9_04;
LAB_001ac030:
  uVar10 = func_0x007a28b0(uVar14,uVar12,&UNK_009c9a78);
  if ((-0x7fffffffffffffff < unaff_x22) && (unaff_x22 != 0)) {
    func_0x00187bd4();
    func_0x00183ef0(&lStack_1c8);
    uVar10 = __Unwind_Resume(uVar10);
  }
  func_0x00183ef0(&lStack_1c8);
  auVar23 = __Unwind_Resume(uVar10);
  puVar17 = auVar23._0_8_;
  lStack_258 = 0;
  lStack_250 = 8;
  lStack_248 = 0;
  if (auVar23._8_8_ == 0) {
code_r0x001ac170:
    extraout_x8_08[1] = lStack_250;
    *extraout_x8_08 = lStack_258;
    extraout_x8_08[2] = lStack_248;
    return;
  }
  lVar15 = puVar17[1];
  if (lVar15 < 0) {
    uVar10 = 0;
  }
  else {
    uVar10 = 1;
    puVar18 = puVar17;
    do {
      uVar22 = *puVar18;
      if (lVar15 == 0) {
        unaff_x23 = 1;
      }
      else {
        unaff_x23 = func_0x00187bd0(lVar15,1);
        if (unaff_x23 == 0) {
          unaff_x23 = lVar15;
          goto code_r0x001ac1a4;
        }
      }
      _memcpy(unaff_x23,uVar22,lVar15);
      lVar20 = lStack_248;
      if (lStack_248 == lStack_258) {
        func_0x001d88f4(&lStack_258,&UNK_009c24f0);
      }
      plVar9 = (long *)(lStack_250 + lVar20 * 0x18);
      *plVar9 = lVar15;
      plVar9[1] = unaff_x23;
      plVar9[2] = lVar15;
      lStack_248 = lVar20 + 1;
      if (puVar18 + 2 == puVar17 + auVar23._8_8_ * 2) goto code_r0x001ac170;
      lVar15 = puVar18[3];
      puVar18 = puVar18 + 2;
    } while (-1 < lVar15);
    uVar10 = 0;
  }
code_r0x001ac1a4:
  func_0x007a1f00(uVar10,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x1ac1bc);
  (*pcVar8)();
}


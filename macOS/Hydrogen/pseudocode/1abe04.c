
void FUN_001abe04(long param_1,undefined8 param_2)

{
  ushort uVar1;
  long lVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong uVar7;
  undefined8 *extraout_x8;
  ulong extraout_x8_00;
  ulong extraout_x8_01;
  ulong uVar8;
  long *extraout_x8_02;
  ulong extraout_x9;
  ulong uVar9;
  ulong extraout_x9_00;
  long lVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long unaff_x22;
  long lVar13;
  long unaff_x23;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  func_0x00187bd4(param_2,param_1 << 1,1);
  plVar4 = (long *)__Unwind_Resume();
  uVar7 = plVar4[1];
  uVar9 = plVar4[2];
  if (uVar7 - uVar9 < 2) {
    extraout_x8[2] = &UNK_008298da;
    extraout_x8[3] = 3;
    *(undefined1 *)(extraout_x8 + 1) = 0xc;
    *extraout_x8 = 1;
    return;
  }
  uVar8 = uVar9 + 2;
  plVar4[2] = uVar8;
  if (uVar9 < 0xfffffffffffffffe) {
    if (uVar7 < uVar8) goto LAB_001ac00c;
    uVar1 = *(ushort *)(*plVar4 + uVar9);
    uStack_a8 = (ulong)((uint)(uVar1 >> 8) | (uVar1 & 0xff00ff) << 8);
    if (uVar7 - uVar8 < uStack_a8) {
      extraout_x8[2] = uStack_a8;
      extraout_x8[3] = 0;
      *extraout_x8 = 1;
      extraout_x8[1] = 0xb;
      return;
    }
    uVar9 = uVar8 + uStack_a8;
    plVar4[2] = uVar9;
    if (!CARRY8(uVar8,uStack_a8)) {
      if (uVar9 <= uVar7) {
        lStack_b0 = *plVar4 + uVar8;
        uStack_a0 = 0;
        lStack_98 = 0;
        lStack_90 = 8;
        lStack_88 = 0;
        if (uVar1 != 0) {
          do {
            func_0x001b932c(&lStack_70,&lStack_b0);
            lVar2 = lStack_68;
            lVar6 = lStack_70;
            lVar10 = lStack_88;
            lVar13 = lStack_90;
            lStack_78 = lStack_58;
            lStack_80 = lStack_60;
            if (lStack_70 == -0x7ffffffffffffffe) {
              extraout_x8[3] = lStack_58;
              extraout_x8[2] = lStack_60;
              *extraout_x8 = 1;
              extraout_x8[1] = lStack_68;
              if (lStack_88 != 0) {
                puVar12 = (undefined8 *)(lStack_90 + 8);
                do {
                  lVar6 = puVar12[-1];
                  if (-0x7fffffffffffffff < lVar6 && lVar6 != 0) {
                    func_0x00187bd4(*puVar12,lVar6,1);
                  }
                  puVar12 = puVar12 + 4;
                  lVar10 = lVar10 + -1;
                } while (lVar10 != 0);
              }
              if (lStack_98 == 0) {
                return;
              }
              func_0x00187bd4(lVar13,lStack_98 << 5,8);
              return;
            }
            if (lStack_88 == lStack_98) {
              func_0x001d8840(&lStack_98,&UNK_009c24d8);
            }
            plVar4 = (long *)(lStack_90 + lVar10 * 0x20);
            *plVar4 = lVar6;
            plVar4[1] = lVar2;
            plVar4[3] = lStack_78;
            plVar4[2] = lStack_80;
            lStack_88 = lVar10 + 1;
          } while (uStack_a0 < uStack_a8);
        }
        extraout_x8[2] = lStack_90;
        extraout_x8[1] = lStack_98;
        extraout_x8[3] = lStack_88;
        *extraout_x8 = 0;
        return;
      }
      goto LAB_001ac030;
    }
  }
  else {
    func_0x007a28bc(uVar9,uVar8,&UNK_009c9a78);
    uVar7 = extraout_x1;
    uVar8 = extraout_x8_00;
LAB_001ac00c:
    func_0x007a28b0(uVar8,uVar7,&UNK_009c9a78);
    uVar8 = extraout_x8_01;
    uVar9 = extraout_x9;
  }
  func_0x007a28bc(uVar8,uVar9,&UNK_009c9a78);
  uVar7 = extraout_x1_00;
  uVar9 = extraout_x9_00;
LAB_001ac030:
  uVar5 = func_0x007a28b0(uVar9,uVar7,&UNK_009c9a78);
  if ((-0x7fffffffffffffff < unaff_x22) && (unaff_x22 != 0)) {
    func_0x00187bd4();
    func_0x00183ef0(&lStack_98);
    uVar5 = __Unwind_Resume(uVar5);
  }
  func_0x00183ef0(&lStack_98);
  auVar15 = __Unwind_Resume(uVar5);
  puVar12 = auVar15._0_8_;
  lStack_128 = 0;
  lStack_120 = 8;
  lStack_118 = 0;
  if (auVar15._8_8_ == 0) {
code_r0x001ac170:
    extraout_x8_02[1] = lStack_120;
    *extraout_x8_02 = lStack_128;
    extraout_x8_02[2] = lStack_118;
    return;
  }
  lVar13 = puVar12[1];
  if (lVar13 < 0) {
    uVar5 = 0;
  }
  else {
    uVar5 = 1;
    puVar11 = puVar12;
    do {
      uVar14 = *puVar11;
      if (lVar13 == 0) {
        unaff_x23 = 1;
      }
      else {
        unaff_x23 = func_0x00187bd0(lVar13,1);
        if (unaff_x23 == 0) {
          unaff_x23 = lVar13;
          goto code_r0x001ac1a4;
        }
      }
      _memcpy(unaff_x23,uVar14,lVar13);
      lVar10 = lStack_118;
      if (lStack_118 == lStack_128) {
        func_0x001d88f4(&lStack_128,&UNK_009c24f0);
      }
      plVar4 = (long *)(lStack_120 + lVar10 * 0x18);
      *plVar4 = lVar13;
      plVar4[1] = unaff_x23;
      plVar4[2] = lVar13;
      lStack_118 = lVar10 + 1;
      if (puVar11 + 2 == puVar12 + auVar15._8_8_ * 2) goto code_r0x001ac170;
      lVar13 = puVar11[3];
      puVar11 = puVar11 + 2;
    } while (-1 < lVar13);
    uVar5 = 0;
  }
code_r0x001ac1a4:
  func_0x007a1f00(uVar5,unaff_x23,&UNK_009c24c0);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x1ac1bc);
  (*pcVar3)();
}


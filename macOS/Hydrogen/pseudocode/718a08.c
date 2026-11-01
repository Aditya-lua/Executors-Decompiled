
undefined1  [16]
thunk_FUN_00718a0c(undefined8 param_1,undefined8 param_2,undefined4 *param_3,undefined8 param_4,
                  undefined8 *param_5,undefined8 *param_6)

{
  ulong *puVar1;
  long *plVar2;
  long lVar3;
  undefined4 uVar4;
  int iVar5;
  bool bVar6;
  code *pcVar7;
  undefined1 uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  int iVar14;
  ulong *puVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  ulong uVar19;
  long lVar20;
  ulong *puVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong *puVar25;
  ulong uVar26;
  undefined8 uVar27;
  ulong *puVar28;
  ulong *puVar29;
  ulong *puVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  uint uStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  undefined4 uStack_128;
  undefined4 uStack_124;
  uint uStack_120;
  undefined4 uStack_11c;
  undefined4 uStack_118;
  undefined4 uStack_114;
  undefined4 uStack_110;
  undefined4 uStack_10c;
  undefined8 uStack_108;
  undefined8 uStack_100;
  ulong uStack_f8;
  undefined8 uStack_f0;
  undefined1 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long *plStack_c8;
  long lStack_c0;
  undefined8 uStack_b8;
  int iStack_ac;
  ulong uStack_a8;
  undefined1 auStack_a0 [16];
  undefined1 auStack_90 [16];
  undefined8 uStack_80;
  undefined8 uStack_78;
  
  lVar18 = *in_stack_00000008 + in_stack_00000010 * 8;
  if (lVar18 != in_stack_00000008[1]) {
    in_stack_00000008[1] = lVar18;
  }
  auVar38 = __Unwind_Resume();
  uVar24 = auVar38._8_8_;
  lVar18 = auVar38._0_8_;
  uStack_78 = *(undefined8 *)(param_3 + 3);
  uStack_80 = *(undefined8 *)(param_3 + 1);
  if (param_6[1] != 0) {
    uStack_78 = *(undefined8 *)(*(long *)*param_6 + 0x14);
    uStack_80 = *(undefined8 *)(*(long *)*param_6 + 0xc);
  }
  if (*(char *)(lVar18 + 0x58) == '\0') {
code_r0x00718acc:
    func_0x00719504(auStack_a0,lVar18,0,0,0,0);
    lVar9 = 0;
    bVar6 = true;
  }
  else {
    lVar9 = func_0x00704c24(*(undefined8 *)(lVar18 + 0xd8),0x60);
    lVar10 = func_0x0070947c();
    if (lVar10 == 0) goto code_r0x00718acc;
    func_0x00719504(auStack_a0,lVar18,0,lVar9 + 0xc,lVar9 + 0x18,lVar9 + 0x28);
    bVar6 = false;
  }
  puVar29 = (ulong *)(lVar18 + 0x84);
  uStack_a8 = *puVar29;
  iVar5 = *(int *)(lVar18 + 0x80);
  iStack_ac = iVar5;
  if (iVar5 == 0x28) {
    func_0x00710d48(lVar18);
  }
  else {
    func_0x0072447c(lVar18,0x28,"function");
  }
  *(int *)(*(long *)(lVar18 + 0x1c0) + 0xa4) = *(int *)(*(long *)(lVar18 + 0x1c0) + 0xa4) + 1;
  lStack_c0 = (*(long *)(lVar18 + 0x2a0) - *(long *)(lVar18 + 0x298) >> 3) * -0x3333333333333333;
  plStack_c8 = (long *)(lVar18 + 0x298);
  uStack_b8 = 0;
  uStack_e0 = 0;
  uStack_d8 = 0;
  if (*(int *)(lVar18 + 0x80) == 0x29) {
    uStack_134 = 0;
    uStack_158 = 0;
    iVar14 = *(int *)(lVar18 + 0x80);
joined_r0x00718c3c:
    uStack_f8 = uStack_f8 & 0xffffffffffffff00;
    if (iVar5 == 0x28) goto code_r0x00718c40;
code_r0x00718be4:
    uStack_e8 = 0;
    if (iVar14 != 0x29) goto code_r0x00718c68;
code_r0x00718c5c:
    func_0x00710d48(lVar18);
  }
  else {
    if (!bVar6) {
      func_0x00717434(&uStack_120,lVar18,&plStack_c8,1,lVar9 + 0x40,0,lVar9 + 0x50);
      uStack_134 = uStack_120 & 0xff;
      uStack_d8 = CONCAT44(uStack_110,uStack_114);
      uStack_e0 = CONCAT44(uStack_118,uStack_11c);
      iVar14 = *(int *)(lVar18 + 0x80);
      uStack_158 = uStack_108;
      iVar5 = iStack_ac;
      goto joined_r0x00718c3c;
    }
    func_0x00717434(&uStack_120,lVar18,&plStack_c8,1,0,0,0);
    uStack_134 = uStack_120 & 0xff;
    uStack_d8 = CONCAT44(uStack_110,uStack_114);
    uStack_e0 = CONCAT44(uStack_118,uStack_11c);
    uStack_158 = uStack_108;
    uStack_f8 = uStack_f8 & 0xffffffffffffff00;
    iVar14 = *(int *)(lVar18 + 0x80);
    if (iVar5 != 0x28) goto code_r0x00718be4;
code_r0x00718c40:
    if (iVar14 == 0x29) {
      uStack_f0 = *(undefined8 *)(lVar18 + 0x8c);
      uStack_f8 = uStack_a8;
      uStack_e8 = 1;
      goto code_r0x00718c5c;
    }
code_r0x00718c68:
    uStack_e8 = 0;
    func_0x00721808(lVar18,0x29,&iStack_ac,0);
    func_0x007244d4(lVar18,0x29);
  }
  *(int *)(*(long *)(lVar18 + 0x1c0) + 0xa4) = *(int *)(*(long *)(lVar18 + 0x1c0) + 0xa4) + -1;
  if (*(int *)(lVar18 + 0x80) == 0x3a) {
code_r0x00718cc4:
    if (!bVar6) {
      *(ulong *)(lVar9 + 0x58) = *puVar29;
    }
    func_0x00710d48(lVar18);
    uVar4 = *(undefined4 *)(lVar18 + 0x114);
    uStack_160 = func_0x0071c0b4(lVar18);
    if (*(int *)(lVar18 + 0x80) == 0x2c) {
      func_0x007181dc(lVar18,puVar29,
                      "Expected a statement, got \',\'; did you forget to wrap the list of return types in parentheses?"
                     );
      func_0x00710d48(lVar18);
    }
    *(undefined4 *)(lVar18 + 0x114) = uVar4;
    if (param_5 != (undefined8 *)0x0) goto code_r0x00718d18;
code_r0x00718d68:
    lVar10 = *(long *)(lVar18 + 400);
    lVar17 = *(long *)(lVar18 + 0x198);
    puVar29 = *(ulong **)(lVar18 + 0x150);
    puVar15 = *(ulong **)(lVar18 + 0x158);
    uStack_168 = 0;
    if (puVar15 <= puVar29) goto code_r0x00718d80;
  }
  else {
    if (*(int *)(lVar18 + 0x80) == 0x107) {
      func_0x007181dc(lVar18,puVar29,
                      "Function return type annotations are written after \':\' instead of \'->\'");
      goto code_r0x00718cc4;
    }
    uStack_160 = 0;
    if (param_5 == (undefined8 *)0x0) goto code_r0x00718d68;
code_r0x00718d18:
    uStack_118 = (undefined4)param_5[1];
    uStack_114 = (undefined4)((ulong)param_5[1] >> 0x20);
    uStack_120 = (uint)*param_5;
    uStack_11c = (undefined4)((ulong)*param_5 >> 0x20);
    uStack_108 = 0;
    uStack_100 = 0;
    uStack_110 = (undefined4)param_5[2];
    uStack_10c = (undefined4)((ulong)param_5[2] >> 0x20);
    uStack_168 = func_0x007170f8(lVar18,&uStack_120);
    lVar10 = *(long *)(lVar18 + 400);
    lVar17 = *(long *)(lVar18 + 0x198);
    puVar29 = *(ulong **)(lVar18 + 0x150);
    puVar15 = *(ulong **)(lVar18 + 0x158);
    if (puVar15 <= puVar29) {
code_r0x00718d80:
      puVar1 = (ulong *)(lVar18 + 0x148);
      puVar28 = (ulong *)*puVar1;
      lVar20 = (long)puVar29 - (long)puVar28 >> 3;
      uVar26 = lVar20 + 1;
      if (uVar26 >> 0x3d != 0) {
        func_0x00017f90(puVar1);
code_r0x007191b8:
                    /* WARNING: Does not return */
        pcVar7 = (code *)SoftwareBreakpoint(1,0x7191bc);
        (*pcVar7)();
      }
      uVar22 = (long)puVar15 - (long)puVar28 >> 2;
      if (uVar22 <= uVar26) {
        uVar22 = uVar26;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)puVar15 - (long)puVar28)) {
        uVar22 = 0x1fffffffffffffff;
      }
      if (uVar22 == 0) {
        lVar11 = 0;
      }
      else {
        if (uVar22 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x007191b8;
        }
        lVar11 = __Znwm(uVar22 << 3);
      }
      puVar15 = (ulong *)(lVar11 + lVar20 * 8);
      puVar25 = puVar15 + 1;
      *puVar15 = (ulong)uStack_134;
      if ((long)puVar29 - (long)puVar28 != 0) {
        uVar26 = ((long)puVar29 - (long)puVar28) - 8;
        puVar30 = puVar29;
        if ((uVar26 < 0x58) ||
           ((ulong)((long)puVar29 - (((long)puVar29 - (long)puVar28) + lVar11)) < 0x40)) {
code_r0x00718e6c:
          do {
            puVar30 = puVar30 + -1;
            puVar15 = puVar15 + -1;
            *puVar15 = *puVar30;
          } while (puVar30 != puVar28);
        }
        else {
          uVar26 = (uVar26 >> 3) + 1;
          uVar19 = uVar26 & 0x3ffffffffffffff8;
          puVar30 = puVar29 + -uVar19;
          puVar15 = puVar15 + -uVar19;
          puVar29 = puVar29 + -4;
          puVar21 = (ulong *)(lVar11 + lVar20 * 8 + -0x20);
          uVar23 = uVar19;
          do {
            uVar33 = *puVar29;
            uVar32 = puVar29[3];
            uVar31 = puVar29[2];
            uVar37 = puVar29[-3];
            uVar36 = puVar29[-4];
            uVar35 = puVar29[-1];
            uVar34 = puVar29[-2];
            puVar21[1] = puVar29[1];
            *puVar21 = uVar33;
            puVar21[3] = uVar32;
            puVar21[2] = uVar31;
            puVar21[-3] = uVar37;
            puVar21[-4] = uVar36;
            puVar21[-1] = uVar35;
            puVar21[-2] = uVar34;
            puVar29 = puVar29 + -8;
            puVar21 = puVar21 + -8;
            uVar23 = uVar23 - 8;
          } while (uVar23 != 0);
          if (uVar26 != uVar19) goto code_r0x00718e6c;
        }
        puVar29 = (ulong *)*puVar1;
      }
      *(ulong **)(lVar18 + 0x148) = puVar15;
      *(ulong **)(lVar18 + 0x150) = puVar25;
      *(ulong *)(lVar18 + 0x158) = lVar11 + uVar22 * 8;
      uVar24 = uVar24 & 0xffffffff;
      if (puVar29 != (ulong *)0x0) {
        __ZdlPv(puVar29);
      }
      goto code_r0x00718e98;
    }
  }
  puVar25 = puVar29 + 1;
  *puVar29 = (ulong)uStack_134;
code_r0x00718e98:
  *(ulong **)(lVar18 + 0x150) = puVar25;
  func_0x0071b484(&uStack_120,lVar18,&uStack_80,uVar24,&plStack_c8);
  lVar11 = *(long *)(lVar18 + 400);
  lVar3 = *(long *)(lVar18 + 0x198);
  lVar12 = func_0x00711360(lVar18);
  plVar2 = (long *)(lVar18 + 400);
  lVar16 = *(long *)(lVar18 + 400);
  lVar20 = *(long *)(lVar18 + 0x198);
  uVar24 = lVar20 - lVar16 >> 3;
  uVar26 = (ulong)(lVar3 - lVar11) >> 3 & 0xffffffff;
  if (uVar26 < uVar24) {
    do {
      uVar27 = *(undefined8 *)(*(long *)(*plVar2 + uVar24 * 8 + -8) + 0x18);
      puVar13 = (undefined8 *)func_0x006db828(lVar18 + 0x168);
      uVar24 = uVar24 - 1;
      *puVar13 = uVar27;
    } while (uVar26 < uVar24);
    lVar16 = *(long *)(lVar18 + 400);
    lVar20 = *(long *)(lVar18 + 0x198);
    uVar24 = lVar20 - lVar16 >> 3;
  }
  if (uVar26 < uVar24 || uVar26 - uVar24 == 0) {
    if (uVar26 < uVar24) {
      lVar20 = lVar16 + uVar26 * 8;
      *(long *)(lVar18 + 0x198) = lVar20;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar26 - uVar24);
    lVar16 = *(long *)(lVar18 + 400);
    lVar20 = *(long *)(lVar18 + 0x198);
  }
  *(long *)(lVar18 + 0x150) = *(long *)(lVar18 + 0x150) + -8;
  uVar24 = lVar20 - lVar16 >> 3;
  uVar26 = (ulong)(lVar17 - lVar10) >> 3 & 0xffffffff;
  if (uVar26 < uVar24) {
    do {
      uVar27 = *(undefined8 *)(*(long *)(*plVar2 + uVar24 * 8 + -8) + 0x18);
      puVar13 = (undefined8 *)func_0x006db828(lVar18 + 0x168);
      uVar24 = uVar24 - 1;
      *puVar13 = uVar27;
    } while (uVar26 < uVar24);
    lVar16 = *(long *)(lVar18 + 400);
    uVar24 = *(long *)(lVar18 + 0x198) - lVar16 >> 3;
  }
  if (uVar26 < uVar24 || uVar26 - uVar24 == 0) {
    if (uVar26 < uVar24) {
      *(ulong *)(lVar18 + 0x198) = lVar16 + uVar26 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar26 - uVar24);
  }
  uVar27 = *(undefined8 *)(lVar18 + 0x8c);
  uStack_130 = *param_3;
  uStack_12c = (undefined4)*(undefined8 *)(param_3 + 1);
  uStack_128 = (undefined4)((ulong)*(undefined8 *)(param_3 + 1) >> 0x20);
  uVar8 = func_0x00716f30(lVar18,0x128,&uStack_130);
  *(undefined1 *)(lVar12 + 0x30) = uVar8;
  uStack_130 = (undefined4)uStack_80;
  uStack_12c = (undefined4)((ulong)uStack_80 >> 0x20);
  uStack_128 = (undefined4)uVar27;
  uStack_124 = (undefined4)((ulong)uVar27 >> 0x20);
  lVar10 = *(long *)(lVar18 + 0x148);
  lVar17 = *(long *)(lVar18 + 0x150);
  auVar38._0_8_ = func_0x00704c24(*(undefined8 *)(lVar18 + 0xd8),0xc0);
  func_0x00706378(auVar38._0_8_,&uStack_130,param_6,auStack_a0,auStack_90,
                  CONCAT44(uStack_11c,uStack_120),&uStack_118,uStack_134 != 0,&uStack_e0,lVar12,
                  lVar17 - lVar10 >> 3,param_4,uStack_160,uStack_158,&uStack_f8);
  if (*(char *)(lVar18 + 0x58) != '\0') {
    *(undefined8 *)(lVar9 + 4) = *(undefined8 *)(param_3 + 1);
    auVar39 = func_0x00717910(lVar18,&plStack_c8);
    *(undefined1 (*) [16])(lVar9 + 0x30) = auVar39;
    lVar10 = *(long *)(lVar18 + 0x420);
    if ((ulong)(lVar10 * 3) >> 2 <= *(ulong *)(lVar18 + 0x428)) {
      if ((*(ulong *)(lVar18 + 0x428) != 0) && (auVar38._0_8_ != *(ulong *)(lVar18 + 0x430))) {
        uVar24 = 0;
        uVar26 = auVar38._0_8_ >> 4 ^ auVar38._0_8_ >> 9;
        do {
          uVar26 = uVar26 & lVar10 - 1U;
          uVar22 = *(ulong *)(*(long *)(lVar18 + 0x418) + uVar26 * 0x10);
          if (uVar22 == auVar38._0_8_) goto code_r0x007190f8;
          uVar24 = uVar24 + 1;
          uVar26 = uVar24 + uVar26;
        } while (uVar22 != *(ulong *)(lVar18 + 0x430) && uVar24 <= lVar10 - 1U);
      }
      func_0x006db93c();
      lVar10 = *(long *)(lVar18 + 0x420);
    }
code_r0x007190f8:
    lVar17 = *(long *)(lVar18 + 0x418);
    uVar24 = lVar10 - 1U & (auVar38._0_8_ >> 4 ^ auVar38._0_8_ >> 9);
    uVar26 = *(ulong *)(lVar17 + uVar24 * 0x10);
    if (uVar26 != *(ulong *)(lVar18 + 0x430)) {
      lVar20 = 1;
      do {
        if (uVar26 == auVar38._0_8_) goto code_r0x00719158;
        uVar24 = uVar24 + lVar20 & lVar10 - 1U;
        uVar26 = *(ulong *)(lVar17 + uVar24 * 0x10);
        lVar20 = lVar20 + 1;
      } while (uVar26 != *(ulong *)(lVar18 + 0x430));
    }
    *(ulong *)(lVar17 + uVar24 * 0x10) = auVar38._0_8_;
    *(long *)(lVar18 + 0x428) = *(long *)(lVar18 + 0x428) + 1;
code_r0x00719158:
    *(long *)(lVar17 + uVar24 * 0x10 + 8) = lVar9;
  }
  lVar18 = *plStack_c8 + lStack_c0 * 0x28;
  if (lVar18 != plStack_c8[1]) {
    plStack_c8[1] = lVar18;
  }
  auVar38._8_8_ = uStack_168;
  return auVar38;
}


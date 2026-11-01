
ulong FUN_00714774(long param_1,ulong param_2)

{
  uint uVar1;
  long **pplVar2;
  int iVar3;
  ulong uVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 *puVar14;
  ulong uVar15;
  ulong uVar16;
  ulong *puVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  ulong uVar20;
  ulong unaff_x24;
  long lVar21;
  undefined8 unaff_x28;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  undefined4 uStack0000000000000014;
  long lStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined4 uStack0000000000000058;
  undefined4 uStack000000000000005c;
  long lStack_100;
  ulong uStack_f8;
  long lStack_f0;
  ulong uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long *plStack_d0;
  long lStack_c8;
  ulong uStack_c0;
  long *plStack_b8;
  long lStack_b0;
  ulong uStack_a8;
  long *plStack_a0;
  long lStack_98;
  ulong uStack_90;
  long *plStack_88;
  long lStack_80;
  ulong uStack_78;
  long alStack_70 [2];
  undefined8 uStack_60;
  ulong uStack_58;
  ulong uStack_50;
  undefined8 *puStack_48;
  ulong uStack_40;
  ulong uStack_38;
  undefined8 uStack_30;
  ulong uStack_28;
  ulong *puStack_20;
  long lStack_18;
  
  lStack0000000000000020 = param_1 + 0x60;
  puVar17 = (ulong *)(param_1 + 0x84);
  uVar20 = *puVar17;
  uVar4 = func_0x00721730();
  uStack0000000000000014 = *(undefined4 *)(param_1 + 0x114);
  do {
    iVar3 = *(int *)(param_1 + 0x80);
    if (iVar3 < 0x5b) {
      if (iVar3 == 0x28) {
        if (((param_2 & 1) == 0) && (*(int *)(uVar4 + 0x14) != *(int *)puVar17)) {
          func_0x00721ce8(param_1);
          goto LAB_00714af4;
        }
        goto LAB_007147b4;
      }
      if (iVar3 != 0x2e) {
        if (iVar3 == 0x3a) {
          uVar4 = func_0x00721a60(param_1,uVar20,uVar4);
        }
        else {
LAB_00714838:
          if ((iVar3 != 0x3c) || (cRam0000000000a337b8 == '\0')) {
LAB_00714af4:
            *(undefined4 *)(param_1 + 0x114) = uStack0000000000000014;
            return uVar4;
          }
          func_0x0070c3d0(&uStack0000000000000028,lStack0000000000000020);
          if ((int)uStack0000000000000028 != 0x3c) goto LAB_00714af4;
          uVar4 = func_0x00722484(param_1,uVar20,uVar4);
        }
        goto LAB_007147c4;
      }
      uStack0000000000000048 = *(undefined8 *)(param_1 + 0x84);
      func_0x00710d48(param_1);
      if (*(int *)(param_1 + 0x80) == 0x119) {
        unaff_x24 = *(ulong *)(param_1 + 0x98);
        uStack0000000000000058 = (undefined4)*(undefined8 *)(param_1 + 0x8c);
        uStack000000000000005c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x8c) >> 0x20);
        uStack0000000000000050._0_4_ = (int)*puVar17;
        uStack0000000000000050._4_4_ = (undefined4)(*puVar17 >> 0x20);
        func_0x00710d48(param_1);
        in_stack_00000038 = CONCAT44(uStack000000000000005c,uStack0000000000000058);
        uStack0000000000000030 = CONCAT44(uStack0000000000000050._4_4_,(int)uStack0000000000000050);
        uStack0000000000000028 = unaff_x24;
      }
      else {
        func_0x0072415c(param_1,0);
        if ((*(int *)(param_1 + 0x80) - 0x123U < 0x15) &&
           (*(int *)puVar17 == (int)uStack0000000000000048)) {
          uStack0000000000000028 = *(ulong *)(param_1 + 0x98);
          in_stack_00000038 = *(ulong *)(param_1 + 0x8c);
          uStack0000000000000030 = *puVar17;
          func_0x00710d48(param_1);
        }
        else {
          uStack0000000000000030 = *(ulong *)(param_1 + 0x84);
          uStack0000000000000028 = *(ulong *)(param_1 + 0x128);
          in_stack_00000038 = uStack0000000000000030;
        }
      }
      uStack0000000000000050._0_4_ = (int)uVar20;
      uStack0000000000000050._4_4_ = (undefined4)(uVar20 >> 0x20);
      uStack0000000000000058 = (undefined4)in_stack_00000038;
      uStack000000000000005c = (undefined4)(in_stack_00000038 >> 0x20);
      uVar7 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x50);
      func_0x00706238(uVar7,&uStack0000000000000050,uVar4,&uStack0000000000000028,
                      &uStack0000000000000030,&uStack0000000000000048,0x2e);
      uVar4 = uVar7;
    }
    else {
      if (1 < iVar3 - 0x116U) {
        if (iVar3 == 0x5b) {
          uStack0000000000000050._4_4_ = (undefined4)*(undefined8 *)(param_1 + 0x84);
          uStack0000000000000058 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x84) >> 0x20);
          uStack0000000000000050._0_4_ = iVar3;
          func_0x00710d48(param_1);
          unaff_x24 = func_0x007168a8(param_1,0);
          unaff_x28 = *(undefined8 *)(param_1 + 0x84);
          uVar7 = *(ulong *)(param_1 + 0x8c);
          if (*(int *)(param_1 + 0x80) == 0x5d) {
            func_0x00710d48(param_1);
          }
          else {
            func_0x00721808(param_1,0x5d,&uStack0000000000000050,0);
            func_0x007244d4(param_1,0x5d);
          }
          uStack0000000000000028 = uVar20;
          uStack0000000000000030 = uVar7;
          uVar7 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x30);
          func_0x007062dc(uVar7,&uStack0000000000000028,uVar4,unaff_x24);
          uVar4 = uVar7;
          if (*(char *)(param_1 + 0x58) != '\0') {
            uVar18 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x14);
            func_0x00709464(uVar18,CONCAT44(uStack0000000000000058,uStack0000000000000050._4_4_),
                            unaff_x28);
            lVar6 = *(long *)(param_1 + 0x420);
            unaff_x24 = uVar7 >> 4;
            if ((ulong)(lVar6 * 3) >> 2 <= *(ulong *)(param_1 + 0x428)) {
              if ((*(ulong *)(param_1 + 0x428) != 0) && (uVar7 != *(ulong *)(param_1 + 0x430))) {
                uVar8 = 0;
                uVar15 = unaff_x24 ^ uVar7 >> 9;
                do {
                  uVar15 = uVar15 & lVar6 - 1U;
                  uVar16 = *(ulong *)(*(long *)(param_1 + 0x418) + uVar15 * 0x10);
                  if (uVar16 == uVar7) goto LAB_00714a80;
                  uVar8 = uVar8 + 1;
                  uVar15 = uVar8 + uVar15;
                } while (uVar16 != *(ulong *)(param_1 + 0x430) && uVar8 <= lVar6 - 1U);
              }
              func_0x006db93c((long *)(param_1 + 0x418));
              lVar6 = *(long *)(param_1 + 0x420);
            }
LAB_00714a80:
            lVar10 = *(long *)(param_1 + 0x418);
            uVar8 = (unaff_x24 ^ uVar7 >> 9) & lVar6 - 1U;
            uVar15 = *(ulong *)(lVar10 + uVar8 * 0x10);
            if (uVar15 != *(ulong *)(param_1 + 0x430)) {
              lVar21 = 1;
              do {
                if (uVar15 == uVar7) goto LAB_00714ae0;
                uVar8 = uVar8 + lVar21 & lVar6 - 1U;
                uVar15 = *(ulong *)(lVar10 + uVar8 * 0x10);
                lVar21 = lVar21 + 1;
              } while (uVar15 != *(ulong *)(param_1 + 0x430));
            }
            *(ulong *)(lVar10 + uVar8 * 0x10) = uVar7;
            *(long *)(param_1 + 0x428) = *(long *)(param_1 + 0x428) + 1;
LAB_00714ae0:
            *(undefined8 *)(lVar10 + uVar8 * 0x10 + 8) = uVar18;
          }
          goto LAB_007147c8;
        }
        if (iVar3 != 0x7b) goto LAB_00714838;
      }
LAB_007147b4:
      uVar4 = func_0x00721cf8(param_1,uVar4,0);
LAB_007147c4:
    }
LAB_007147c8:
    uVar1 = *(int *)(param_1 + 0x114) + 1;
    *(uint *)(param_1 + 0x114) = uVar1;
  } while (uVar1 <= uRam0000000000a33728);
  auVar29 = func_0x0070f408(puVar17,
                            "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                           );
  lVar10 = auVar29._8_8_;
  lVar6 = auVar29._0_8_;
  uStack_30 = 0xa33000;
  iVar3 = *(int *)(lVar10 + 8);
  alStack_70[0] = lVar10;
  uStack_60 = unaff_x28;
  uStack_58 = uVar4;
  uStack_50 = uVar4;
  puStack_48 = &uStack0000000000000030;
  uStack_40 = unaff_x24;
  uStack_38 = uVar20;
  uStack_28 = param_2;
  puStack_20 = puVar17;
  lStack_18 = param_1;
  if (((iRam0000000000a27a98 != iVar3 && iRam0000000000a27aa8 != iVar3) &&
      iRam0000000000a27ae8 != iVar3) && iRam0000000000a27ad8 != iVar3) {
    plStack_88 = (long *)func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),8);
    *plStack_88 = lVar10;
    lStack_80 = 1;
    alStack_70[0] =
         func_0x0071b400(lVar6,lVar10 + 0xc,&plStack_88,
                         "Assigned expression must be a variable or a field");
  }
  plStack_88 = (long *)(lVar6 + 0x238);
  lStack_80 = *(long *)(lVar6 + 0x240) - *(long *)(lVar6 + 0x238) >> 3;
  uStack_78 = 0;
  lStack_98 = *(long *)(lVar6 + 0x3d8) - *(long *)(lVar6 + 0x3d0) >> 3;
  uStack_90 = 0;
  plStack_a0 = (long *)(lVar6 + 0x3d0);
  func_0x00711dac(&plStack_88,alStack_70);
  iVar3 = *(int *)(lVar6 + 0x80);
  if (iVar3 == 0x2c) {
    do {
      if (*(char *)(lVar6 + 0x58) != '\0') {
        func_0x00711dac(&plStack_a0,lVar6 + 0x84);
      }
      func_0x00710d48(lVar6);
      plVar5 = (long *)func_0x00714754(lVar6,1);
      iVar3 = (int)plVar5[1];
      plStack_d0 = plVar5;
      if (((iRam0000000000a27a98 != iVar3 && iRam0000000000a27aa8 != iVar3) &&
          iRam0000000000a27ae8 != iVar3) && iRam0000000000a27ad8 != iVar3) {
        plStack_b8 = (long *)func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),8);
        *plStack_b8 = (long)plVar5;
        lStack_b0 = 1;
        plStack_d0 = (long *)func_0x0071b400(lVar6,(long)plVar5 + 0xc,&plStack_b8,
                                             "Assigned expression must be a variable or a field");
      }
      func_0x00711dac(&plStack_88,&plStack_d0);
      iVar3 = *(int *)(lVar6 + 0x80);
    } while (iVar3 == 0x2c);
  }
  uVar18 = *(undefined8 *)(lVar6 + 0x84);
  if (iVar3 == 0x3d) {
    func_0x00710d48(lVar6);
  }
  else {
    func_0x0072447c(lVar6,0x3d,"assignment");
  }
  plStack_b8 = (long *)(lVar6 + 0x250);
  lStack_b0 = *(long *)(lVar6 + 600) - *(long *)(lVar6 + 0x250) >> 3;
  uStack_a8 = 0;
  lStack_c8 = *(long *)(lVar6 + 0x3d8) - *(long *)(lVar6 + 0x3d0) >> 3;
  uStack_c0 = 0;
  pplVar2 = (long **)0x0;
  if (*(char *)(lVar6 + 0x58) != '\0') {
    pplVar2 = &plStack_d0;
  }
  plStack_d0 = (long *)(lVar6 + 0x3d0);
  func_0x00717804(lVar6,&plStack_b8,pplVar2);
  uStack_e8 = uStack_78;
  lVar10 = lStack_80;
  uVar19 = *(undefined8 *)(lVar6 + 0xd8);
  uStack_e0 = *(undefined8 *)(alStack_70[0] + 0xc);
  uStack_d8 = *(undefined8 *)(*(long *)(plStack_b8[1] + -8) + 0x14);
  if (uStack_78 == 0) {
    lStack_f0 = 0;
  }
  else {
    lVar21 = *plStack_88;
    lStack_f0 = func_0x00704c24(uVar19,uStack_78 << 3);
    if ((uStack_e8 < 8) || ((ulong)((lStack_f0 + lVar10 * -8) - lVar21) < 0x40)) {
      uVar4 = 0;
    }
    else {
      uVar4 = uStack_e8 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lStack_f0 + 0x20);
      puVar14 = (undefined8 *)(lVar10 * 8 + lVar21 + 0x20);
      uVar20 = uVar4;
      do {
        uVar22 = puVar14[-4];
        uVar24 = puVar14[-1];
        uVar23 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar28 = puVar14[3];
        uVar27 = puVar14[2];
        puVar9[-3] = puVar14[-3];
        puVar9[-4] = uVar22;
        puVar9[-1] = uVar24;
        puVar9[-2] = uVar23;
        puVar9[1] = uVar26;
        *puVar9 = uVar25;
        puVar9[3] = uVar28;
        puVar9[2] = uVar27;
        uVar20 = uVar20 - 8;
        puVar9 = puVar9 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar20 != 0);
      if (uStack_e8 == uVar4) goto LAB_00714dd8;
    }
    lVar11 = uStack_e8 - uVar4;
    puVar9 = (undefined8 *)(lVar21 + uVar4 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(lStack_f0 + uVar4 * 8);
    do {
      *puVar14 = *puVar9;
      lVar11 = lVar11 + -1;
      puVar9 = puVar9 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar11 != 0);
  }
LAB_00714dd8:
  uVar4 = uStack_a8;
  lVar10 = lStack_b0;
  if (uStack_a8 == 0) {
    lStack_100 = 0;
  }
  else {
    lVar21 = *plStack_b8;
    lStack_100 = func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),uStack_a8 << 3);
    if ((uVar4 < 8) || (lVar11 = lVar10 * 8 + lVar21, (ulong)(lStack_100 - lVar11) < 0x40)) {
      uVar20 = 0;
    }
    else {
      uVar20 = uVar4 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lStack_100 + 0x20);
      puVar14 = (undefined8 *)(lVar11 + 0x20);
      uVar7 = uVar20;
      do {
        uVar22 = puVar14[-4];
        uVar24 = puVar14[-1];
        uVar23 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar28 = puVar14[3];
        uVar27 = puVar14[2];
        puVar9[-3] = puVar14[-3];
        puVar9[-4] = uVar22;
        puVar9[-1] = uVar24;
        puVar9[-2] = uVar23;
        puVar9[1] = uVar26;
        *puVar9 = uVar25;
        puVar9[3] = uVar28;
        puVar9[2] = uVar27;
        uVar7 = uVar7 - 8;
        puVar9 = puVar9 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar7 != 0);
      if (uVar4 == uVar20) goto LAB_00714e44;
    }
    lVar11 = uVar4 - uVar20;
    puVar9 = (undefined8 *)(lVar21 + uVar20 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(lStack_100 + uVar20 * 8);
    do {
      *puVar14 = *puVar9;
      lVar11 = lVar11 + -1;
      puVar9 = puVar9 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar11 != 0);
  }
LAB_00714e44:
  uStack_f8 = uVar4;
  uVar20 = func_0x00704c24(uVar19,0x40);
  func_0x007074bc(uVar20,&uStack_e0,&lStack_f0,&lStack_100);
  uVar4 = uStack_90;
  lVar10 = lStack_98;
  uVar19 = *(undefined8 *)(lVar6 + 0xd8);
  if (uStack_90 == 0) {
    lVar21 = 0;
  }
  else {
    lVar11 = *plStack_a0;
    lVar21 = func_0x00704c24(uVar19,uStack_90 << 3);
    if ((uVar4 < 8) || ((ulong)((lVar21 + lVar10 * -8) - lVar11) < 0x40)) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar4 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lVar21 + 0x20);
      puVar14 = (undefined8 *)(lVar10 * 8 + lVar11 + 0x20);
      uVar8 = uVar7;
      do {
        uVar22 = puVar14[-4];
        uVar24 = puVar14[-1];
        uVar23 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar28 = puVar14[3];
        uVar27 = puVar14[2];
        puVar9[-3] = puVar14[-3];
        puVar9[-4] = uVar22;
        puVar9[-1] = uVar24;
        puVar9[-2] = uVar23;
        puVar9[1] = uVar26;
        *puVar9 = uVar25;
        puVar9[3] = uVar28;
        puVar9[2] = uVar27;
        uVar8 = uVar8 - 8;
        puVar9 = puVar9 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar8 != 0);
      if (uVar4 == uVar7) goto code_r0x00714ed8;
    }
    lVar12 = uVar4 - uVar7;
    puVar9 = (undefined8 *)(lVar11 + uVar7 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(lVar21 + uVar7 * 8);
    do {
      *puVar14 = *puVar9;
      lVar12 = lVar12 + -1;
      puVar9 = puVar9 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar12 != 0);
  }
code_r0x00714ed8:
  uVar7 = uStack_c0;
  lVar10 = lStack_c8;
  if (uStack_c0 == 0) {
    lVar11 = 0;
  }
  else {
    lVar12 = *plStack_d0;
    lVar11 = func_0x00704c24(*(undefined8 *)(lVar6 + 0xd8),uStack_c0 << 3);
    if ((uVar7 < 8) || (lVar13 = lVar10 * 8 + lVar12, (ulong)(lVar11 - lVar13) < 0x40)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar7 & 0xfffffffffffffff8;
      puVar9 = (undefined8 *)(lVar11 + 0x20);
      puVar14 = (undefined8 *)(lVar13 + 0x20);
      uVar15 = uVar8;
      do {
        uVar22 = puVar14[-4];
        uVar24 = puVar14[-1];
        uVar23 = puVar14[-2];
        uVar26 = puVar14[1];
        uVar25 = *puVar14;
        uVar28 = puVar14[3];
        uVar27 = puVar14[2];
        puVar9[-3] = puVar14[-3];
        puVar9[-4] = uVar22;
        puVar9[-1] = uVar24;
        puVar9[-2] = uVar23;
        puVar9[1] = uVar26;
        *puVar9 = uVar25;
        puVar9[3] = uVar28;
        puVar9[2] = uVar27;
        uVar15 = uVar15 - 8;
        puVar9 = puVar9 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar15 != 0);
      if (uVar7 == uVar8) goto code_r0x00714f44;
    }
    lVar13 = uVar7 - uVar8;
    puVar9 = (undefined8 *)(lVar12 + uVar8 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(lVar11 + uVar8 * 8);
    do {
      *puVar14 = *puVar9;
      lVar13 = lVar13 + -1;
      puVar9 = puVar9 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar13 != 0);
  }
code_r0x00714f44:
  uVar19 = func_0x00704c24(uVar19,0x30);
  func_0x007095f4(uVar19,lVar21,uVar4,uVar18,lVar11,uVar7);
  lVar10 = *(long *)(lVar6 + 0x420);
  if ((ulong)(lVar10 * 3) >> 2 <= *(ulong *)(lVar6 + 0x428)) {
    if ((*(ulong *)(lVar6 + 0x428) != 0) && (uVar20 != *(ulong *)(lVar6 + 0x430))) {
      uVar4 = 0;
      uVar7 = uVar20 >> 4 ^ uVar20 >> 9;
      do {
        uVar7 = uVar7 & lVar10 - 1U;
        uVar8 = *(ulong *)(*(long *)(lVar6 + 0x418) + uVar7 * 0x10);
        if (uVar8 == uVar20) goto code_r0x00714fd8;
        uVar4 = uVar4 + 1;
        uVar7 = uVar4 + uVar7;
      } while (uVar8 != *(ulong *)(lVar6 + 0x430) && uVar4 <= lVar10 - 1U);
    }
    func_0x006db93c();
    lVar10 = *(long *)(lVar6 + 0x420);
  }
code_r0x00714fd8:
  lVar21 = *(long *)(lVar6 + 0x418);
  uVar4 = (uVar20 >> 4 ^ uVar20 >> 9) & lVar10 - 1U;
  uVar7 = *(ulong *)(lVar21 + uVar4 * 0x10);
  if (uVar7 != *(ulong *)(lVar6 + 0x430)) {
    lVar11 = 1;
    do {
      if (uVar7 == uVar20) goto code_r0x00715038;
      uVar4 = uVar4 + lVar11 & lVar10 - 1U;
      uVar7 = *(ulong *)(lVar21 + uVar4 * 0x10);
      lVar11 = lVar11 + 1;
    } while (uVar7 != *(ulong *)(lVar6 + 0x430));
  }
  *(ulong *)(lVar21 + uVar4 * 0x10) = uVar20;
  *(long *)(lVar6 + 0x428) = *(long *)(lVar6 + 0x428) + 1;
code_r0x00715038:
  *(undefined8 *)(lVar21 + uVar4 * 0x10 + 8) = uVar19;
  lVar6 = *plStack_d0 + lStack_c8 * 8;
  if (lVar6 != plStack_d0[1]) {
    plStack_d0[1] = lVar6;
  }
  lVar6 = *plStack_b8 + lStack_b0 * 8;
  if (lVar6 != plStack_b8[1]) {
    plStack_b8[1] = lVar6;
  }
  lVar6 = *plStack_a0 + lStack_98 * 8;
  if (lVar6 != plStack_a0[1]) {
    plStack_a0[1] = lVar6;
  }
  lVar6 = *plStack_88 + lStack_80 * 8;
  if (lVar6 != plStack_88[1]) {
    plStack_88[1] = lVar6;
  }
  return uVar20;
}


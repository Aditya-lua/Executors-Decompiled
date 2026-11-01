
long * FUN_0064b4d8(long *param_1,ulong param_2,ulong param_3,undefined1 *param_4,
                   undefined1 *param_5)

{
  ulong uVar1;
  byte bVar2;
  long *plVar3;
  long *plVar4;
  undefined8 uVar5;
  uint uVar6;
  ulong uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  undefined8 *puVar18;
  long lVar19;
  long lVar20;
  long *plVar21;
  ulong uVar22;
  ulong unaff_x28;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined8 in_stack_00000020;
  long lStack_138;
  long lStack_130;
  long *plStack_128;
  long lStack_120;
  long *plStack_118;
  undefined8 uStack_110;
  ulong uStack_108;
  undefined1 *puStack_100;
  long lStack_f8;
  long lStack_f0;
  long *plStack_e8;
  long **pplStack_e0;
  undefined *puStack_d8;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long *plStack_a8;
  undefined8 uStack_a0;
  ulong uStack_98;
  undefined1 *puStack_90;
  undefined1 *puStack_88;
  ulong uStack_80;
  long *plStack_78;
  long *plStack_70;
  undefined *puStack_68;
  ulong uStack_60;
  ulong uStack_58;
  long lStack_10;
  undefined *puStack_8;
  
  lVar16 = (long)register0x00000008 + 0x50;
  bVar2 = *(byte *)((long)param_1 + 0x17);
  uVar6 = (uint)(char)bVar2;
  if ((char)bVar2 < '\0') {
    uVar22 = param_1[1];
    uVar17 = param_1[2] & 0x7fffffffffffffff;
    unaff_x28 = uVar17 - 1;
    if (param_2 <= unaff_x28 - uVar22) {
      uVar6 = (uint)(byte)((ulong)param_1[2] >> 0x38);
      lVar16 = uVar22 - param_3;
      plVar3 = (long *)*param_1;
      goto joined_r0x0064b778;
    }
    uVar15 = uVar22 + param_2;
    if (0x7ffffffffffffff8 - uVar17 < uVar15 - unaff_x28) goto LAB_0064b864;
    plVar4 = (long *)*param_1;
    if (unaff_x28 < 0x3ffffffffffffff3) goto LAB_0064b660;
    uVar17 = 0x7ffffffffffffff7;
    plVar3 = (long *)__Znwm(0x7ffffffffffffff7);
joined_r0x0064b7a4:
    if (param_3 != 0) {
      _memmove(plVar3,plVar4,param_3);
    }
    if (uVar22 - param_3 != 0) {
      _memmove((long)plVar3 + param_2 + param_3,(long)plVar4 + param_3,uVar22 - param_3);
    }
    if (unaff_x28 != 0x16) {
      __ZdlPv(plVar4);
    }
    *param_1 = (long)plVar3;
    param_1[2] = uVar17 | 0x8000000000000000;
    lVar16 = uVar22 + param_2;
code_r0x0064b72c:
    param_1[1] = lVar16;
    *(undefined1 *)((long)plVar3 + lVar16) = 0;
  }
  else {
    uVar22 = (ulong)bVar2;
    if (0x16 - uVar22 < param_2) {
      uVar15 = uVar22 + param_2;
      if (0x800000000000001d < uVar15 + 0x8000000000000008) {
        unaff_x28 = 0x16;
        plVar4 = param_1;
LAB_0064b660:
        if (uVar15 <= unaff_x28 * 2) {
          uVar15 = unaff_x28 * 2;
        }
        uVar9 = (uVar15 & 0xfffffffffffffff8) + 8;
        if ((uVar15 | 7) != 0x17) {
          uVar9 = uVar15 | 7;
        }
        uVar17 = 0x17;
        if (0x16 < uVar15) {
          uVar17 = uVar9 + 1;
        }
        plVar3 = (long *)__Znwm(uVar17);
        goto joined_r0x0064b7a4;
      }
LAB_0064b864:
      auVar29 = func_0x0001748c(param_1);
      uVar17 = auVar29._8_8_;
      plVar3 = auVar29._0_8_;
      puStack_8 = &DAT_0064b86c;
      bVar2 = *(byte *)((long)plVar3 + 0x17);
      uVar6 = (uint)(char)bVar2;
      uStack_60 = unaff_x28;
      uStack_58 = uVar22;
      lStack_10 = lVar16;
      if ((char)bVar2 < '\0') {
        uVar22 = plVar3[1];
        uVar9 = plVar3[2] & 0x7fffffffffffffff;
        uVar15 = uVar9 - 1;
        if (uVar17 <= uVar15 - uVar22) {
          uVar6 = (uint)(byte)((ulong)plVar3[2] >> 0x38);
          lVar16 = uVar22 - param_3;
          plVar4 = (long *)*plVar3;
          goto joined_r0x0064ba4c;
        }
        uVar7 = uVar22 + uVar17;
        if (0x7ffffffffffffff8 - uVar9 < uVar7 - uVar15) goto code_r0x0064bb28;
        plVar21 = (long *)*plVar3;
        if (uVar15 < 0x3ffffffffffffff3) goto code_r0x0064b928;
        uVar9 = 0x7ffffffffffffff7;
        plVar4 = (long *)__Znwm(0x7ffffffffffffff7);
joined_r0x0064ba68:
        if (param_3 != 0) {
          _memmove(plVar4,plVar21,param_3);
        }
        if (uVar22 - param_3 != 0) {
          _memmove((long)plVar4 + uVar17 + param_3,(long)plVar21 + param_3,uVar22 - param_3);
        }
        if (uVar15 != 0x16) {
          __ZdlPv(plVar21);
        }
        *plVar3 = (long)plVar4;
        plVar3[2] = uVar9 | 0x8000000000000000;
        lVar16 = uVar22 + uVar17;
code_r0x0064b9f4:
        plVar3[1] = lVar16;
        *(undefined1 *)((long)plVar4 + lVar16) = 0;
      }
      else {
        uVar22 = (ulong)bVar2;
        if (0x16 - uVar22 < uVar17) {
          uVar7 = uVar22 + uVar17;
          if (uVar7 + 0x8000000000000008 < 0x800000000000001e) {
code_r0x0064bb28:
            auVar30 = func_0x0001748c(plVar3);
            uVar22 = auVar30._8_8_;
            plVar4 = auVar30._0_8_;
            uStack_a0 = in_stack_00000020;
            puStack_68 = &DAT_0064bb30;
            plVar21 = plVar4 + 2;
            lVar16 = plVar4[1];
            puStack_90 = param_4;
            puStack_88 = param_5;
            uStack_80 = param_3;
            plStack_70 = &lStack_10;
            if (uVar22 <= (ulong)((*plVar21 - lVar16 >> 4) * -0x5555555555555555)) {
              plVar3 = plVar4;
              lVar20 = lVar16;
              if (uVar22 != 0) {
                lVar20 = lVar16 + uVar22 * 0x30;
                lVar13 = uVar22 * 0x30;
                do {
                  uStack_98 = auVar29._8_8_;
                  plStack_78 = auVar29._0_8_;
                  plVar3 = (long *)func_0x005fdd18(lVar16);
                  auVar29._8_8_ = uStack_98;
                  auVar29._0_8_ = plStack_78;
                  lVar16 = lVar16 + 0x30;
                  lVar13 = lVar13 + -0x30;
                } while (lVar13 != 0);
              }
              plVar4[1] = lVar20;
              return plVar3;
            }
            lVar16 = lVar16 - *plVar4 >> 4;
            lVar20 = lVar16 * -0x5555555555555555;
            puVar8 = (undefined1 *)(lVar20 + uVar22);
            uStack_98 = uVar17;
            plStack_78 = plVar3;
            if (puVar8 < (undefined1 *)0x555555555555556) {
              lVar13 = *plVar21 - *plVar4 >> 4;
              param_4 = (undefined1 *)(lVar13 * 0x5555555555555556);
              if (param_4 <= puVar8) {
                param_4 = puVar8;
              }
              if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar13 * -0x5555555555555555)) {
                param_4 = (undefined1 *)0x555555555555555;
              }
              plStack_a8 = plVar21;
              if (param_4 == (undefined1 *)0x0) {
                lStack_c8 = 0;
code_r0x0064bc38:
                lVar16 = lStack_c8 + lVar16 * 0x10;
                lStack_b0 = lStack_c8 + (long)param_4 * 0x30;
                lVar13 = uVar22 * 0x30;
                lVar20 = lVar16 + lVar13;
                lStack_c0 = lVar16;
                lStack_b8 = lVar16;
                do {
                  uStack_98 = auVar29._8_8_;
                  plStack_78 = auVar29._0_8_;
                  plVar3 = (long *)func_0x005fdd18(lVar16);
                  lVar14 = lStack_c0;
                  auVar29._8_8_ = uStack_98;
                  auVar29._0_8_ = plStack_78;
                  lVar16 = lVar16 + 0x30;
                  lVar13 = lVar13 + -0x30;
                } while (lVar13 != 0);
                lVar16 = *plVar4;
                lVar13 = plVar4[1];
                lVar19 = 0;
                lStack_b8 = lVar20;
                while (lVar13 + lVar19 != lVar16) {
                  lVar19 = lVar19 + -0x30;
                  plVar3 = (long *)func_0x005fe0b4(lVar19 + lVar14,lVar19 + lVar13);
                }
                puVar11 = (undefined8 *)*plVar4;
                puVar18 = (undefined8 *)plVar4[1];
                *plVar4 = lVar14 + lVar19;
                plVar4[2] = lStack_b0;
                plVar4[1] = lStack_b8;
                while (puVar18 != puVar11) {
                  puVar18 = puVar18 + -6;
                  plVar3 = (long *)(**(code **)*puVar18)(puVar18);
                }
                if (puVar11 == (undefined8 *)0x0) {
                  return plVar3;
                }
                plVar3 = (long *)__ZdlPv(puVar11);
                return plVar3;
              }
              if (param_4 < (undefined1 *)0x555555555555556) {
                lStack_c8 = __Znwm((long)param_4 * 0x30);
                auVar29._8_8_ = uStack_98;
                auVar29._0_8_ = plStack_78;
                goto code_r0x0064bc38;
              }
            }
            else {
              func_0x00017f90(plVar4);
              auVar29._8_8_ = uStack_98;
              auVar29._0_8_ = plStack_78;
            }
            uStack_98 = auVar29._8_8_;
            plStack_78 = auVar29._0_8_;
            func_0x00017514();
            plVar4[1] = lVar20;
            lVar16 = __Unwind_Resume();
            if (uVar22 != 0xffffffffffffffd0) {
              lVar13 = uVar22 + 0x30;
              do {
                (*(code *)**(undefined8 **)(lVar20 + lVar13))();
                lVar13 = lVar13 + 0x30;
              } while (lVar13 != 0);
              plVar4 = (long *)0x0;
            }
            func_0x0064b2f0(&lStack_c8);
            auVar29 = __Unwind_Resume(lVar16);
            plVar3 = auVar29._0_8_;
            uStack_110 = in_stack_00000020;
            puStack_d8 = &DAT_0064bd5c;
            lVar14 = plVar3[1] - *plVar3 >> 4;
            lVar13 = lVar14 * -0x5555555555555555;
            uVar22 = lVar13 + 1;
            uStack_108 = uVar17;
            puStack_100 = param_4;
            lStack_f8 = lVar20;
            lStack_f0 = lVar16;
            plStack_e8 = plVar4;
            pplStack_e0 = &plStack_70;
            if (0x555555555555555 < uVar22) {
              func_0x00017f90(plVar3);
code_r0x0064bec8:
              uVar5 = func_0x00017514();
              func_0x0064b2f0(&lStack_138);
              uVar5 = __Unwind_Resume(uVar5);
              if (lVar13 != -0x30) {
                lVar13 = lVar13 + 0x30;
                do {
                  (*(code *)**(undefined8 **)(lVar16 + lVar13))();
                  lVar13 = lVar13 + 0x30;
                } while (lVar13 != 0);
              }
              func_0x0064b2f0(&lStack_138);
              plVar3 = (long *)__Unwind_Resume(uVar5);
              func_0x0064c1b0(plVar3,plVar3[1]);
              if (*plVar3 != 0) {
                __ZdlPv();
              }
              return plVar3;
            }
            plStack_118 = plVar3 + 2;
            lVar16 = *plStack_118 - *plVar3 >> 4;
            uVar17 = lVar16 * 0x5555555555555556;
            if (uVar17 <= uVar22) {
              uVar17 = uVar22;
            }
            if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar16 * -0x5555555555555555)) {
              uVar17 = 0x555555555555555;
            }
            if (uVar17 == 0) {
              lStack_138 = 0;
            }
            else {
              lVar16 = auVar29._8_8_;
              if (0x555555555555555 < uVar17) goto code_r0x0064bec8;
              lStack_138 = __Znwm(uVar17 * 0x30);
            }
            lStack_130 = lStack_138 + lVar14 * 0x10;
            lStack_120 = lStack_138 + uVar17 * 0x30;
            plStack_128 = (long *)lStack_130;
            func_0x005fe0b4(lStack_130,auVar29._8_8_);
            lVar13 = lStack_130;
            lVar14 = 0;
            plStack_128 = (long *)((long)plStack_128 + 0x30);
            lVar16 = *plVar3;
            lVar20 = plVar3[1];
            while (plVar4 = plStack_128, lVar20 + lVar14 != lVar16) {
              lVar14 = lVar14 + -0x30;
              func_0x005fe0b4(lVar14 + lVar13,lVar14 + lVar20);
            }
            puVar11 = (undefined8 *)*plVar3;
            puVar18 = (undefined8 *)plVar3[1];
            *plVar3 = lVar13 + lVar14;
            plVar3[2] = lStack_120;
            plVar3[1] = (long)plStack_128;
            while (puVar18 != puVar11) {
              puVar18 = puVar18 + -6;
              (**(code **)*puVar18)(puVar18);
            }
            if (puVar11 != (undefined8 *)0x0) {
              __ZdlPv(puVar11);
            }
            return plVar4;
          }
          uVar15 = 0x16;
          plVar21 = plVar3;
code_r0x0064b928:
          if (uVar7 <= uVar15 * 2) {
            uVar7 = uVar15 * 2;
          }
          uVar1 = (uVar7 & 0xfffffffffffffff8) + 8;
          if ((uVar7 | 7) != 0x17) {
            uVar1 = uVar7 | 7;
          }
          uVar9 = 0x17;
          if (0x16 < uVar7) {
            uVar9 = uVar1 + 1;
          }
          plVar4 = (long *)__Znwm(uVar9);
          goto joined_r0x0064ba68;
        }
        lVar16 = uVar22 - param_3;
        plVar4 = plVar3;
joined_r0x0064ba4c:
        uVar15 = param_3;
        if (lVar16 != 0) {
          _memmove((long)plVar4 + param_3 + uVar17,(long)plVar4 + param_3,lVar16);
          uVar6 = (uint)*(byte *)((long)plVar3 + 0x17);
          uVar15 = uVar22;
        }
        lVar16 = uVar15 + uVar17;
        if ((uVar6 >> 7 & 1) != 0) goto code_r0x0064b9f4;
        *(byte *)((long)plVar3 + 0x17) = (byte)lVar16 & 0x7f;
        *(undefined1 *)((long)plVar4 + lVar16) = 0;
      }
      if (param_4 == param_5) goto code_r0x0064bafc;
      puVar8 = (undefined1 *)((long)plVar4 + param_3);
      uVar22 = (long)param_5 - (long)param_4;
      if (uVar22 < 8) {
        puVar12 = param_4;
      }
      else {
        puVar12 = param_4;
        if (0x3f < (ulong)((long)puVar8 - (long)param_4)) {
          if (uVar22 < 0x40) {
            uVar15 = 0;
          }
          else {
            uVar15 = uVar22 & 0xffffffffffffffc0;
            puVar11 = (undefined8 *)((long)plVar4 + param_3 + 0x20);
            puVar18 = (undefined8 *)(param_4 + 0x20);
            uVar17 = uVar15;
            do {
              uVar5 = puVar18[-4];
              uVar24 = puVar18[-1];
              uVar23 = puVar18[-2];
              uVar26 = puVar18[1];
              uVar25 = *puVar18;
              uVar28 = puVar18[3];
              uVar27 = puVar18[2];
              puVar11[-3] = puVar18[-3];
              puVar11[-4] = uVar5;
              puVar11[-1] = uVar24;
              puVar11[-2] = uVar23;
              puVar11[1] = uVar26;
              *puVar11 = uVar25;
              puVar11[3] = uVar28;
              puVar11[2] = uVar27;
              uVar17 = uVar17 - 0x40;
              puVar11 = puVar11 + 8;
              puVar18 = puVar18 + 8;
            } while (uVar17 != 0);
            if (uVar22 == uVar15) goto code_r0x0064bafc;
            if ((uVar22 & 0x38) == 0) {
              puVar12 = param_4 + uVar15;
              puVar8 = puVar8 + uVar15;
              goto code_r0x0064baec;
            }
          }
          uVar17 = uVar22 & 0xfffffffffffffff8;
          puVar8 = puVar8 + uVar17;
          puVar12 = param_4 + uVar17;
          lVar16 = uVar15 - uVar17;
          puVar11 = (undefined8 *)(param_4 + uVar15);
          puVar18 = (undefined8 *)((long)plVar4 + uVar15 + param_3);
          do {
            *puVar18 = *puVar11;
            lVar16 = lVar16 + 8;
            puVar11 = puVar11 + 1;
            puVar18 = puVar18 + 1;
          } while (lVar16 != 0);
          if (uVar22 == uVar17) goto code_r0x0064bafc;
        }
      }
code_r0x0064baec:
      do {
        puVar10 = puVar12 + 1;
        *puVar8 = *puVar12;
        puVar8 = puVar8 + 1;
        puVar12 = puVar10;
      } while (puVar10 != param_5);
code_r0x0064bafc:
      if (*(char *)((long)plVar3 + 0x17) < '\0') {
        plVar3 = (long *)*plVar3;
      }
      return (long *)((long)plVar3 + param_3);
    }
    lVar16 = uVar22 - param_3;
    plVar3 = param_1;
joined_r0x0064b778:
    uVar17 = param_3;
    if (lVar16 != 0) {
      _memmove((long)plVar3 + param_3 + param_2,(long)plVar3 + param_3,lVar16);
      uVar6 = (uint)*(byte *)((long)param_1 + 0x17);
      uVar17 = uVar22;
    }
    lVar16 = uVar17 + param_2;
    if ((uVar6 >> 7 & 1) != 0) goto code_r0x0064b72c;
    *(byte *)((long)param_1 + 0x17) = (byte)lVar16 & 0x7f;
    *(undefined1 *)((long)plVar3 + lVar16) = 0;
  }
  if (param_4 == param_5) goto code_r0x0064b838;
  puVar8 = (undefined1 *)((long)plVar3 + param_3);
  uVar22 = (long)param_5 - (long)param_4;
  if (uVar22 < 8) {
    puVar12 = param_4;
  }
  else if ((ulong)((long)puVar8 - (long)param_4) < 0x40) {
    puVar12 = param_4;
  }
  else {
    if (uVar22 < 0x40) {
      uVar15 = 0;
    }
    else {
      uVar15 = uVar22 & 0xffffffffffffffc0;
      puVar11 = (undefined8 *)(param_4 + 0x20);
      puVar18 = (undefined8 *)((long)plVar3 + param_3 + 0x20);
      uVar17 = uVar15;
      do {
        uVar5 = puVar11[-4];
        uVar24 = puVar11[-1];
        uVar23 = puVar11[-2];
        uVar26 = puVar11[1];
        uVar25 = *puVar11;
        uVar28 = puVar11[3];
        uVar27 = puVar11[2];
        puVar18[-3] = puVar11[-3];
        puVar18[-4] = uVar5;
        puVar18[-1] = uVar24;
        puVar18[-2] = uVar23;
        puVar18[1] = uVar26;
        *puVar18 = uVar25;
        puVar18[3] = uVar28;
        puVar18[2] = uVar27;
        uVar17 = uVar17 - 0x40;
        puVar11 = puVar11 + 8;
        puVar18 = puVar18 + 8;
      } while (uVar17 != 0);
      if (uVar22 == uVar15) goto code_r0x0064b838;
      if ((uVar22 & 0x38) == 0) {
        puVar8 = puVar8 + uVar15;
        puVar12 = param_4 + uVar15;
        goto code_r0x0064b828;
      }
    }
    uVar17 = uVar22 & 0xfffffffffffffff8;
    puVar12 = param_4 + uVar17;
    puVar8 = puVar8 + uVar17;
    lVar16 = uVar15 - uVar17;
    puVar11 = (undefined8 *)((long)plVar3 + uVar15 + param_3);
    puVar18 = (undefined8 *)(param_4 + uVar15);
    do {
      *puVar11 = *puVar18;
      lVar16 = lVar16 + 8;
      puVar11 = puVar11 + 1;
      puVar18 = puVar18 + 1;
    } while (lVar16 != 0);
    if (uVar22 == uVar17) goto code_r0x0064b838;
  }
code_r0x0064b828:
  do {
    puVar10 = puVar12 + 1;
    *puVar8 = *puVar12;
    puVar8 = puVar8 + 1;
    puVar12 = puVar10;
  } while (puVar10 != param_5);
code_r0x0064b838:
  if (*(char *)((long)param_1 + 0x17) < '\0') {
    param_1 = (long *)*param_1;
  }
  return (long *)((long)param_1 + param_3);
}



/* WARNING: Removing unreachable block (ram,0x000330a0) */
/* WARNING: Removing unreachable block (ram,0x0003309c) */
/* WARNING: Removing unreachable block (ram,0x000330b0) */
/* WARNING: Type propagation algorithm not settling */

undefined8 *
FUN_00032364(undefined8 param_1,undefined8 param_2,undefined1 *param_3,undefined8 param_4)

{
  byte bVar1;
  undefined1 uVar2;
  unkbyte9 Var3;
  undefined8 *******pppppppuVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined *puVar10;
  undefined8 *extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 *******pppppppuVar11;
  undefined1 *puVar12;
  undefined8 *puVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined1 *puVar17;
  undefined8 *puVar18;
  ulong uVar19;
  long lVar20;
  undefined1 *puVar21;
  undefined8 *puVar22;
  undefined8 *puVar23;
  undefined8 *unaff_x19;
  undefined1 *puVar24;
  long lVar25;
  long lVar26;
  ulong uVar27;
  undefined1 *puVar28;
  undefined8 ******ppppppuVar29;
  undefined8 ******ppppppuVar30;
  undefined8 uVar31;
  undefined8 ******ppppppuVar32;
  undefined8 ******ppppppuVar33;
  undefined8 uVar34;
  undefined8 ******ppppppuVar35;
  undefined8 uVar36;
  undefined8 ******ppppppuVar37;
  undefined8 uVar38;
  undefined8 ******ppppppuVar39;
  undefined8 uVar40;
  undefined1 auVar41 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 *******pppppppuStack_208;
  ulong uStack_200;
  undefined8 uStack_1f8;
  undefined1 *puStack_1f0;
  long lStack_1e8;
  undefined8 uStack_1e0;
  undefined1 *puStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  undefined1 *****pppppuStack_1c0;
  undefined *puStack_1b8;
  undefined1 ****ppppuStack_170;
  undefined *puStack_168;
  undefined8 *******pppppppuStack_158;
  ulong uStack_150;
  undefined8 uStack_148;
  undefined1 ***pppuStack_100;
  undefined *puStack_f8;
  undefined8 *puStack_f0;
  undefined8 uStack_e8;
  undefined1 **ppuStack_e0;
  undefined *puStack_d8;
  undefined8 *puStack_c8;
  undefined8 *puStack_c0;
  undefined8 *puStack_b8;
  undefined8 *puStack_b0;
  long *plStack_a8;
  ulong uStack_a0;
  undefined1 *puStack_70;
  undefined *puStack_68;
  undefined8 *******pppppppuStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  undefined1 auStack_6 [6];
  
  while (__ZdlPv(*unaff_x19), -1 < in_stack_00000028) {
    __Unwind_Resume();
  }
  __ZdlPv(in_stack_00000018);
  auVar41 = __Unwind_Resume();
  puVar24 = auVar41._8_8_;
  puVar12 = auStack_6 + -10;
  uVar27 = (long)param_3 - (long)puVar24;
  if (uVar27 < 0x7ffffffffffffff8) {
    if (uVar27 < 0x17) {
      uStack_48 = CONCAT17((char)uVar27,(undefined7)uStack_48);
      pppppppuVar4 = &pppppppuStack_58;
    }
    else {
      uVar19 = (uVar27 & 0xfffffffffffffff8) + 8;
      if ((uVar27 | 7) != 0x17) {
        uVar19 = uVar27 | 7;
      }
      pppppppuVar4 = (undefined8 *******)__Znwm(uVar19 + 1);
      uStack_48 = uVar19 + 1 | 0x8000000000000000;
      uStack_50 = uVar27;
      pppppppuStack_58 = pppppppuVar4;
    }
    if (puVar24 == param_3) {
      pppppppuVar11 = pppppppuVar4;
    }
    else {
      if ((0x3f < uVar27) && (0x3f < (ulong)((long)pppppppuVar4 - (long)puVar24))) {
        uVar15 = uVar27 & 0xffffffffffffffc0;
        pppppppuVar11 = (undefined8 *******)((long)pppppppuVar4 + uVar15);
        pppppppuVar4 = (undefined8 *******)((long)pppppppuVar4 + 0x20);
        puVar6 = (undefined8 *)(puVar24 + 0x20);
        uVar19 = uVar15;
        do {
          ppppppuVar29 = (undefined8 ******)puVar6[-4];
          ppppppuVar32 = (undefined8 ******)puVar6[-1];
          ppppppuVar30 = (undefined8 ******)puVar6[-2];
          ppppppuVar35 = (undefined8 ******)puVar6[1];
          ppppppuVar33 = (undefined8 ******)*puVar6;
          ppppppuVar39 = (undefined8 ******)puVar6[3];
          ppppppuVar37 = (undefined8 ******)puVar6[2];
          pppppppuVar4[-3] = (undefined8 ******)puVar6[-3];
          pppppppuVar4[-4] = ppppppuVar29;
          pppppppuVar4[-1] = ppppppuVar32;
          pppppppuVar4[-2] = ppppppuVar30;
          pppppppuVar4[1] = ppppppuVar35;
          *pppppppuVar4 = ppppppuVar33;
          pppppppuVar4[3] = ppppppuVar39;
          pppppppuVar4[2] = ppppppuVar37;
          uVar19 = uVar19 - 0x40;
          pppppppuVar4 = pppppppuVar4 + 8;
          puVar6 = puVar6 + 8;
        } while (uVar19 != 0);
        pppppppuVar4 = pppppppuVar11;
        puVar24 = puVar24 + uVar15;
        if (uVar27 == uVar15) goto code_r0x00032478;
      }
      do {
        puVar12 = puVar24 + 1;
        *(undefined1 *)pppppppuVar4 = *puVar24;
        pppppppuVar11 = (undefined8 *******)((long)pppppppuVar4 + 1);
        pppppppuVar4 = (undefined8 *******)((long)pppppppuVar4 + 1);
        puVar24 = puVar12;
      } while (puVar12 != param_3);
    }
code_r0x00032478:
    *(undefined1 *)pppppppuVar11 = 0;
    plVar5 = *(long **)(auVar41._0_8_ + 0x10);
    uVar27 = uStack_50;
    pppppppuVar4 = pppppppuStack_58;
    if (-1 < (long)uStack_48) {
      uVar27 = uStack_48 >> 0x38;
      pppppppuVar4 = &pppppppuStack_58;
    }
    puVar6 = (undefined8 *)
             (**(code **)(*plVar5 + 0x20))
                       (extraout_x8,plVar5,pppppppuVar4,(undefined1 *)((long)pppppppuVar4 + uVar27))
    ;
    bVar1 = *(byte *)((long)extraout_x8 + 0x17);
    uVar27 = extraout_x8[1];
    if (-1 < (char)bVar1) {
      uVar27 = (ulong)bVar1;
    }
    if (uVar27 != 1) {
      if (uVar27 == 0xc) {
        puVar13 = (undefined8 *)*extraout_x8;
        if (-1 < (char)bVar1) {
          puVar13 = extraout_x8;
        }
        *(undefined1 *)((long)puVar13 + 0xb) = *(undefined1 *)((long)puVar13 + 3);
      }
      else if ((char)bVar1 < '\0') {
        *(undefined1 *)*extraout_x8 = 0;
        extraout_x8[1] = 0;
      }
      else {
        *(undefined1 *)extraout_x8 = 0;
        *(undefined1 *)((long)extraout_x8 + 0x17) = 0;
      }
    }
    if ((long)uStack_48 < 0) {
      puVar6 = (undefined8 *)__ZdlPv(pppppppuStack_58);
      return puVar6;
    }
    return puVar6;
  }
  uVar7 = func_0x0001748c(&pppppppuStack_58);
  if ((long)uStack_48 < 0) {
    __ZdlPv(pppppppuStack_58);
  }
  auVar41 = __Unwind_Resume(uVar7);
  puVar9 = auVar41._8_8_;
  plVar5 = auVar41._0_8_;
  puStack_68 = &DAT_00032578;
  puVar6 = (undefined8 *)*plVar5;
  puVar13 = (undefined8 *)plVar5[1];
  lVar14 = (long)puVar13 - (long)puVar6 >> 3;
  lVar26 = lVar14 * -0x5555555555555555;
  uVar19 = lVar26 + 1;
  uStack_a0 = uVar27;
  puStack_70 = puVar12;
  if (0xaaaaaaaaaaaaaaa < uVar19) {
    func_0x00017f90(plVar5);
code_r0x00032734:
    uVar7 = func_0x00017514();
    func_0x0002341c(&puStack_c8);
    __Unwind_Resume(uVar7);
    puStack_d8 = &DAT_0003274c;
    puStack_f0 = puVar6;
    uStack_e8 = uVar7;
    ppuStack_e0 = &puStack_70;
    uVar7 = ___cxa_allocate_exception(0x18);
    __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,2);
    puVar10 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
    uVar8 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0);
    ___cxa_free_exception(uVar7);
    auVar41 = __Unwind_Resume(uVar8);
    puVar12 = auVar41._8_8_;
    puStack_f8 = &DAT_00032798;
    uVar27 = (long)puVar10 - (long)puVar12;
    pppuStack_100 = &ppuStack_e0;
    if (uVar27 < 0x7ffffffffffffff8) {
      if (uVar27 < 0x17) {
        uStack_148 = CONCAT17((char)uVar27,(undefined7)uStack_148);
        pppppppuVar4 = &pppppppuStack_158;
      }
      else {
        uVar19 = (uVar27 & 0xfffffffffffffff8) + 8;
        if ((uVar27 | 7) != 0x17) {
          uVar19 = uVar27 | 7;
        }
        pppppppuVar4 = (undefined8 *******)__Znwm(uVar19 + 1);
        uStack_148 = uVar19 + 1 | 0x8000000000000000;
        uStack_150 = uVar27;
        pppppppuStack_158 = pppppppuVar4;
      }
      if (puVar12 != puVar10) {
        _memcpy(pppppppuVar4,puVar12,uVar27);
        pppppppuVar4 = (undefined8 *******)((long)pppppppuVar4 + uVar27);
      }
      *(undefined1 *)pppppppuVar4 = 0;
      plVar5 = *(long **)(auVar41._0_8_ + 8);
      uVar27 = uStack_150;
      pppppppuVar4 = pppppppuStack_158;
      if (-1 < (long)uStack_148) {
        uVar27 = uStack_148 >> 0x38;
        pppppppuVar4 = &pppppppuStack_158;
      }
      (**(code **)(*plVar5 + 0x30))(plVar5,pppppppuVar4,(undefined1 *)((long)pppppppuVar4 + uVar27))
      ;
      pppppppuVar4 = pppppppuStack_158;
      if (-1 < (long)uStack_148) {
        pppppppuVar4 = &pppppppuStack_158;
      }
      puVar6 = (undefined8 *)__ZNSt3__115__get_classnameEPKcb(pppppppuVar4,param_4);
      if ((long)uStack_148 < 0) {
        __ZdlPv(pppppppuStack_158);
      }
      return puVar6;
    }
    uVar7 = func_0x0001748c(&pppppppuStack_158);
    if ((long)uStack_148 < 0) {
      __ZdlPv(pppppppuStack_158);
    }
    auVar41 = __Unwind_Resume(uVar7);
    Var3 = auVar41._0_9_;
    uVar7 = auVar41._8_8_;
    lVar14 = auVar41._0_8_;
    puStack_168 = &DAT_000328e0;
    ppppuStack_170 = &pppuStack_100;
    if (*(char *)(lVar14 + 0xa9) == '\0') {
      puVar12 = *(undefined1 **)(lVar14 + 0x48);
      puVar24 = *(undefined1 **)(lVar14 + 0x50);
      uVar2 = auVar41[8];
      if (*(char *)(lVar14 + 0xaa) == '\0') {
        if (puVar24 <= puVar12) {
          puVar28 = *(undefined1 **)(lVar14 + 0x40);
          puVar6 = (undefined8 *)(puVar12 + -(long)puVar28);
          puVar21 = (undefined1 *)((long)puVar6 + 1);
          if ((long)puVar21 < 0) goto code_r0x00032d68;
          puVar17 = (undefined1 *)(((long)puVar24 - (long)puVar28) * 2);
          if (puVar17 <= puVar21) {
            puVar17 = puVar21;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar24 - (long)puVar28)) {
            puVar17 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar17 == (undefined1 *)0x0) {
            puVar9 = (undefined8 *)0x0;
            *(undefined1 *)puVar6 = uVar2;
            puVar17 = (undefined1 *)0x0;
            puVar13 = puVar6;
          }
          else {
            puVar9 = (undefined8 *)__Znwm(puVar17);
            puVar13 = (undefined8 *)((long)puVar9 + (long)puVar6);
            puVar17 = (undefined1 *)((long)puVar9 + (long)puVar17);
            *(undefined1 *)puVar13 = uVar2;
          }
          puVar24 = (undefined1 *)((long)puVar13 + 1);
          if (puVar12 == puVar28) goto code_r0x00032b38;
          puVar21 = puVar12;
          if (((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar6) &&
             (0x3f < (ulong)((long)puVar28 - (long)puVar9))) {
            if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar6) {
              puVar16 = (undefined8 *)((ulong)puVar6 & 0xffffffffffffffc0);
              puVar18 = (undefined8 *)(puVar12 + -0x20);
              puVar22 = (undefined8 *)((long)puVar9 + ((long)puVar18 - (long)puVar28));
              puVar23 = puVar16;
              do {
                uVar31 = *puVar18;
                uVar8 = puVar18[3];
                uVar7 = puVar18[2];
                uVar40 = puVar18[-3];
                uVar38 = puVar18[-4];
                uVar36 = puVar18[-1];
                uVar34 = puVar18[-2];
                puVar22[1] = puVar18[1];
                *puVar22 = uVar31;
                puVar22[3] = uVar8;
                puVar22[2] = uVar7;
                puVar22[-3] = uVar40;
                puVar22[-4] = uVar38;
                puVar22[-1] = uVar36;
                puVar22[-2] = uVar34;
                puVar18 = puVar18 + -8;
                puVar22 = puVar22 + -8;
                puVar23 = puVar23 + -8;
              } while (puVar23 != (undefined8 *)0x0);
              if (puVar6 == puVar16) goto code_r0x00032d34;
              if (((ulong)puVar6 & 0x38) == 0) {
                puVar13 = (undefined8 *)((long)puVar13 - (long)puVar16);
                puVar21 = puVar12 + -(long)puVar16;
                goto code_r0x00032d24;
              }
            }
            else {
              puVar16 = (undefined8 *)0x0;
            }
            puVar18 = (undefined8 *)((ulong)puVar6 & 0xfffffffffffffff8);
            puVar21 = puVar12 + -(long)puVar18;
            puVar13 = (undefined8 *)((long)puVar13 - (long)puVar18);
            lVar26 = (long)puVar16 - (long)puVar18;
            puVar22 = (undefined8 *)(puVar12 + (-8 - (long)puVar16));
            puVar23 = (undefined8 *)
                      ((long)puVar9 + ((long)(puVar12 + (-8 - (long)puVar16)) - (long)puVar28));
            do {
              *puVar23 = *puVar22;
              lVar26 = lVar26 + 8;
              puVar22 = puVar22 + -1;
              puVar23 = puVar23 + -1;
            } while (lVar26 != 0);
            if (puVar6 == puVar18) goto code_r0x00032d34;
          }
code_r0x00032d24:
          do {
            puVar13 = (undefined8 *)((long)puVar13 + -1);
            puVar21 = puVar21 + -1;
            *(undefined1 *)puVar13 = *puVar21;
          } while (puVar21 != puVar28);
          goto code_r0x00032d34;
        }
      }
      else if (puVar24 <= puVar12) {
        puVar28 = *(undefined1 **)(lVar14 + 0x40);
        puVar6 = (undefined8 *)(puVar12 + -(long)puVar28);
        puVar21 = (undefined1 *)((long)puVar6 + 1);
        if ((long)puVar21 < 0) {
code_r0x00032d68:
          lVar20 = lVar14 + 0x40;
          auVar41 = func_0x00017f90(lVar20);
          puVar24 = auVar41._8_8_;
          puStack_1b8 = &DAT_00032d70;
          uVar27 = (long)puVar10 - (long)puVar24;
          puStack_1f0 = puVar28;
          lStack_1e8 = lVar26;
          uStack_1e0 = uVar7;
          puStack_1d8 = puVar12;
          lStack_1d0 = lVar20;
          lStack_1c8 = lVar14;
          pppppuStack_1c0 = &ppppuStack_170;
          if (uVar27 < 0x7ffffffffffffff8) {
            if (uVar27 < 0x17) {
              uStack_1f8 = CONCAT17((char)uVar27,(undefined7)uStack_1f8);
              pppppppuVar4 = &pppppppuStack_208;
            }
            else {
              uVar19 = (uVar27 & 0xfffffffffffffff8) + 8;
              if ((uVar27 | 7) != 0x17) {
                uVar19 = uVar27 | 7;
              }
              pppppppuVar4 = (undefined8 *******)__Znwm(uVar19 + 1);
              uStack_1f8 = uVar19 + 1 | 0x8000000000000000;
              uStack_200 = uVar27;
              pppppppuStack_208 = pppppppuVar4;
            }
            if (puVar24 == puVar10) {
              pppppppuVar11 = pppppppuVar4;
            }
            else {
              if ((0x3f < uVar27) && (0x3f < (ulong)((long)pppppppuVar4 - (long)puVar24))) {
                uVar15 = uVar27 & 0xffffffffffffffc0;
                pppppppuVar11 = (undefined8 *******)((long)pppppppuVar4 + uVar15);
                pppppppuVar4 = pppppppuVar4 + 4;
                puVar6 = (undefined8 *)(puVar24 + 0x20);
                uVar19 = uVar15;
                do {
                  ppppppuVar29 = (undefined8 ******)puVar6[-4];
                  ppppppuVar32 = (undefined8 ******)puVar6[-1];
                  ppppppuVar30 = (undefined8 ******)puVar6[-2];
                  ppppppuVar35 = (undefined8 ******)puVar6[1];
                  ppppppuVar33 = (undefined8 ******)*puVar6;
                  ppppppuVar39 = (undefined8 ******)puVar6[3];
                  ppppppuVar37 = (undefined8 ******)puVar6[2];
                  pppppppuVar4[-3] = (undefined8 ******)puVar6[-3];
                  pppppppuVar4[-4] = ppppppuVar29;
                  pppppppuVar4[-1] = ppppppuVar32;
                  pppppppuVar4[-2] = ppppppuVar30;
                  pppppppuVar4[1] = ppppppuVar35;
                  *pppppppuVar4 = ppppppuVar33;
                  pppppppuVar4[3] = ppppppuVar39;
                  pppppppuVar4[2] = ppppppuVar37;
                  uVar19 = uVar19 - 0x40;
                  pppppppuVar4 = pppppppuVar4 + 8;
                  puVar6 = puVar6 + 8;
                } while (uVar19 != 0);
                pppppppuVar4 = pppppppuVar11;
                puVar24 = puVar24 + uVar15;
                if (uVar27 == uVar15) goto code_r0x00032e64;
              }
              do {
                puVar12 = puVar24 + 1;
                *(undefined1 *)pppppppuVar4 = *puVar24;
                pppppppuVar11 = (undefined8 *******)((long)pppppppuVar4 + 1);
                pppppppuVar4 = (undefined8 *******)((long)pppppppuVar4 + 1);
                puVar24 = puVar12;
              } while (puVar12 != puVar10);
            }
code_r0x00032e64:
            *(undefined1 *)pppppppuVar11 = 0;
            plVar5 = *(long **)(auVar41._0_8_ + 0x10);
            uVar27 = uStack_200;
            pppppppuVar4 = pppppppuStack_208;
            if (-1 < (long)uStack_1f8) {
              uVar27 = uStack_1f8 >> 0x38;
              pppppppuVar4 = &pppppppuStack_208;
            }
            puVar6 = (undefined8 *)
                     (**(code **)(*plVar5 + 0x20))
                               (extraout_x8_00,plVar5,pppppppuVar4,
                                (undefined1 *)((long)pppppppuVar4 + uVar27));
            if ((long)uStack_1f8 < 0) {
              puVar6 = (undefined8 *)__ZdlPv(pppppppuStack_208);
              return puVar6;
            }
            return puVar6;
          }
          uVar7 = func_0x0001748c(&pppppppuStack_208);
          if ((long)uStack_1f8 < 0) {
            __ZdlPv(pppppppuStack_208);
          }
          __Unwind_Resume(uVar7);
          uVar7 = ___cxa_allocate_exception(0x18);
          __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,9);
          uVar8 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0,
                               PTR___ZNSt3__111regex_errorD1Ev_009b0070);
          ___cxa_free_exception(uVar7);
          auVar41 = __Unwind_Resume(uVar8);
          puVar6 = auVar41._8_8_;
          plVar5 = auVar41._0_8_;
          lVar14 = plVar5[1] - *plVar5 >> 4;
          uVar27 = lVar14 * -0x5555555555555555 + 1;
          if (0x555555555555555 < uVar27) {
            func_0x00017f90(plVar5);
code_r0x000330f8:
            puVar6 = (undefined8 *)func_0x00017514();
            *puVar6 = &UNK_009b3050;
            if ((long *)puVar6[1] != (long *)0x0) {
              (**(code **)(*(long *)puVar6[1] + 8))();
            }
            return puVar6;
          }
          lVar26 = plVar5[2] - *plVar5 >> 4;
          uVar19 = lVar26 * 0x5555555555555556;
          if (uVar19 <= uVar27) {
            uVar19 = uVar27;
          }
          if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar26 * -0x5555555555555555)) {
            uVar19 = 0x555555555555555;
          }
          if (uVar19 == 0) {
            lVar26 = 0;
          }
          else {
            if (0x555555555555555 < uVar19) goto code_r0x000330f8;
            lVar26 = __Znwm(uVar19 * 0x30);
          }
          puVar13 = (undefined8 *)(lVar26 + lVar14 * 0x10);
          puVar13[2] = puVar6[2];
          uVar7 = *puVar6;
          puVar13[1] = puVar6[1];
          *puVar13 = uVar7;
          lVar26 = lVar26 + uVar19 * 0x30;
          uVar7 = puVar6[3];
          puVar6[2] = 0;
          puVar6[3] = 0;
          *puVar6 = 0;
          puVar6[1] = 0;
          puVar13[4] = puVar6[4];
          puVar13[3] = uVar7;
          puVar13[5] = puVar6[5];
          puVar6[4] = 0;
          puVar6[5] = 0;
          puVar6 = puVar13 + 6;
          lVar14 = *plVar5;
          lVar20 = plVar5[1];
          if (lVar20 == lVar14) {
            *plVar5 = (long)puVar13;
            plVar5[1] = (long)puVar6;
            plVar5[2] = lVar26;
          }
          else {
            do {
              uVar8 = *(undefined8 *)(lVar20 + -0x28);
              uVar7 = *(undefined8 *)(lVar20 + -0x30);
              puVar13[-4] = *(undefined8 *)(lVar20 + -0x20);
              puVar13[-5] = uVar8;
              puVar13[-6] = uVar7;
              *(undefined8 *)(lVar20 + -0x28) = 0;
              *(undefined8 *)(lVar20 + -0x20) = 0;
              *(undefined8 *)(lVar20 + -0x30) = 0;
              uVar8 = *(undefined8 *)(lVar20 + -0x10);
              uVar7 = *(undefined8 *)(lVar20 + -0x18);
              puVar13[-1] = *(undefined8 *)(lVar20 + -8);
              puVar13[-2] = uVar8;
              puVar13[-3] = uVar7;
              puVar13 = puVar13 + -6;
              *(undefined8 *)(lVar20 + -0x10) = 0;
              *(undefined8 *)(lVar20 + -8) = 0;
              *(undefined8 *)(lVar20 + -0x18) = 0;
              lVar20 = lVar20 + -0x30;
            } while (lVar20 != lVar14);
            lVar14 = *plVar5;
            lVar25 = plVar5[1];
            *plVar5 = (long)puVar13;
            plVar5[1] = (long)puVar6;
            plVar5[2] = lVar26;
            lVar20 = lVar25;
            for (; lVar25 != lVar14; lVar25 = lVar25 + -0x30) {
              lVar20 = lVar14;
            }
          }
          if (lVar20 != 0) {
            __ZdlPv(lVar20);
          }
          return puVar6;
        }
        puVar17 = (undefined1 *)(((long)puVar24 - (long)puVar28) * 2);
        if (puVar17 <= puVar21) {
          puVar17 = puVar21;
        }
        if (0x3ffffffffffffffe < (ulong)((long)puVar24 - (long)puVar28)) {
          puVar17 = (undefined1 *)0x7fffffffffffffff;
        }
        if (puVar17 == (undefined1 *)0x0) {
          puVar9 = (undefined8 *)0x0;
          *(undefined1 *)puVar6 = uVar2;
          puVar17 = (undefined1 *)0x0;
          puVar13 = puVar6;
        }
        else {
          puVar9 = (undefined8 *)__Znwm(puVar17);
          puVar13 = (undefined8 *)((long)puVar9 + (long)puVar6);
          puVar17 = (undefined1 *)((long)puVar9 + (long)puVar17);
          *(undefined1 *)puVar13 = uVar2;
        }
        puVar24 = (undefined1 *)((long)puVar13 + 1);
        if (puVar12 != puVar28) {
          puVar21 = puVar12;
          if (((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar6) &&
             (0x3f < (ulong)((long)puVar28 - (long)puVar9))) {
            if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar6) {
              puVar16 = (undefined8 *)((ulong)puVar6 & 0xffffffffffffffc0);
              puVar18 = (undefined8 *)(puVar12 + -0x20);
              puVar22 = (undefined8 *)((long)puVar9 + ((long)puVar18 - (long)puVar28));
              puVar23 = puVar16;
              do {
                uVar31 = *puVar18;
                uVar8 = puVar18[3];
                uVar7 = puVar18[2];
                uVar40 = puVar18[-3];
                uVar38 = puVar18[-4];
                uVar36 = puVar18[-1];
                uVar34 = puVar18[-2];
                puVar22[1] = puVar18[1];
                *puVar22 = uVar31;
                puVar22[3] = uVar8;
                puVar22[2] = uVar7;
                puVar22[-3] = uVar40;
                puVar22[-4] = uVar38;
                puVar22[-1] = uVar36;
                puVar22[-2] = uVar34;
                puVar18 = puVar18 + -8;
                puVar22 = puVar22 + -8;
                puVar23 = puVar23 + -8;
              } while (puVar23 != (undefined8 *)0x0);
              if (puVar6 == puVar16) goto code_r0x00032d34;
              if (((ulong)puVar6 & 0x38) == 0) {
                puVar13 = (undefined8 *)((long)puVar13 - (long)puVar16);
                puVar21 = puVar12 + -(long)puVar16;
                goto code_r0x00032d04;
              }
            }
            else {
              puVar16 = (undefined8 *)0x0;
            }
            puVar18 = (undefined8 *)((ulong)puVar6 & 0xfffffffffffffff8);
            puVar21 = puVar12 + -(long)puVar18;
            puVar13 = (undefined8 *)((long)puVar13 - (long)puVar18);
            lVar26 = (long)puVar16 - (long)puVar18;
            puVar22 = (undefined8 *)(puVar12 + (-8 - (long)puVar16));
            puVar23 = (undefined8 *)
                      ((long)puVar9 + ((long)(puVar12 + (-8 - (long)puVar16)) - (long)puVar28));
            do {
              *puVar23 = *puVar22;
              lVar26 = lVar26 + 8;
              puVar22 = puVar22 + -1;
              puVar23 = puVar23 + -1;
            } while (lVar26 != 0);
            if (puVar6 == puVar18) goto code_r0x00032d34;
          }
code_r0x00032d04:
          do {
            puVar13 = (undefined8 *)((long)puVar13 + -1);
            puVar21 = puVar21 + -1;
            *(undefined1 *)puVar13 = *puVar21;
          } while (puVar21 != puVar28);
          goto code_r0x00032d34;
        }
code_r0x00032b38:
        *(undefined8 **)(lVar14 + 0x40) = puVar13;
        *(undefined1 **)(lVar14 + 0x48) = puVar24;
        *(undefined1 **)(lVar14 + 0x50) = puVar17;
        puVar9 = puVar13;
        goto joined_r0x00032b44;
      }
    }
    else {
      uVar7 = (**(code **)(**(long **)(lVar14 + 0x18) + 0x28))(*(long **)(lVar14 + 0x18),uVar7);
      auVar41._8_8_ = uVar7;
      auVar41._0_8_ = uVar7;
      Var3 = auVar41._0_9_;
      puVar12 = *(undefined1 **)(lVar14 + 0x48);
      if (*(undefined1 **)(lVar14 + 0x50) <= puVar12) {
        puVar28 = *(undefined1 **)(lVar14 + 0x40);
        puVar6 = (undefined8 *)(puVar12 + -(long)puVar28);
        puVar24 = (undefined1 *)((long)puVar6 + 1);
        if ((long)puVar24 < 0) goto code_r0x00032d68;
        uVar27 = (long)*(undefined1 **)(lVar14 + 0x50) - (long)puVar28;
        puVar17 = (undefined1 *)(uVar27 * 2);
        if (puVar17 <= puVar24) {
          puVar17 = puVar24;
        }
        if (0x3ffffffffffffffe < uVar27) {
          puVar17 = (undefined1 *)0x7fffffffffffffff;
        }
        if (puVar17 == (undefined1 *)0x0) {
          puVar9 = (undefined8 *)0x0;
          *(char *)puVar6 = (char)uVar7;
          puVar17 = (undefined1 *)0x0;
          puVar13 = puVar6;
        }
        else {
          puVar9 = (undefined8 *)__Znwm(puVar17);
          puVar13 = (undefined8 *)((long)puVar9 + (long)puVar6);
          puVar17 = (undefined1 *)((long)puVar9 + (long)puVar17);
          *(char *)puVar13 = (char)uVar7;
        }
        puVar24 = (undefined1 *)((long)puVar13 + 1);
        if (puVar12 == puVar28) goto code_r0x00032b38;
        puVar21 = puVar12;
        if ((&MACH_HEADER.cpusubtype <= puVar6) && (0x3f < (ulong)((long)puVar28 - (long)puVar9))) {
          if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar6) {
            puVar16 = (undefined8 *)((ulong)puVar6 & 0xffffffffffffffc0);
            puVar18 = (undefined8 *)(puVar12 + -0x20);
            puVar22 = (undefined8 *)((long)puVar9 + ((long)puVar18 - (long)puVar28));
            puVar23 = puVar16;
            do {
              uVar31 = *puVar18;
              uVar8 = puVar18[3];
              uVar7 = puVar18[2];
              uVar40 = puVar18[-3];
              uVar38 = puVar18[-4];
              uVar36 = puVar18[-1];
              uVar34 = puVar18[-2];
              puVar22[1] = puVar18[1];
              *puVar22 = uVar31;
              puVar22[3] = uVar8;
              puVar22[2] = uVar7;
              puVar22[-3] = uVar40;
              puVar22[-4] = uVar38;
              puVar22[-1] = uVar36;
              puVar22[-2] = uVar34;
              puVar18 = puVar18 + -8;
              puVar22 = puVar22 + -8;
              puVar23 = puVar23 + -8;
            } while (puVar23 != (undefined8 *)0x0);
            if (puVar6 == puVar16) goto code_r0x00032d34;
            if (((ulong)puVar6 & 0x38) == 0) {
              puVar13 = (undefined8 *)((long)puVar13 - (long)puVar16);
              puVar21 = puVar12 + -(long)puVar16;
              goto code_r0x00032ce4;
            }
          }
          else {
            puVar16 = (undefined8 *)0x0;
          }
          puVar18 = (undefined8 *)((ulong)puVar6 & 0xfffffffffffffff8);
          puVar21 = puVar12 + -(long)puVar18;
          puVar13 = (undefined8 *)((long)puVar13 - (long)puVar18);
          lVar26 = (long)puVar16 - (long)puVar18;
          puVar22 = (undefined8 *)(puVar12 + (-8 - (long)puVar16));
          puVar23 = (undefined8 *)
                    ((long)puVar9 + ((long)(puVar12 + (-8 - (long)puVar16)) - (long)puVar28));
          do {
            *puVar23 = *puVar22;
            lVar26 = lVar26 + 8;
            puVar22 = puVar22 + -1;
            puVar23 = puVar23 + -1;
          } while (lVar26 != 0);
          if (puVar6 == puVar18) goto code_r0x00032d34;
        }
code_r0x00032ce4:
        do {
          puVar13 = (undefined8 *)((long)puVar13 + -1);
          puVar21 = puVar21 + -1;
          *(undefined1 *)puVar13 = *puVar21;
        } while (puVar21 != puVar28);
code_r0x00032d34:
        puVar12 = *(undefined1 **)(lVar14 + 0x40);
        *(undefined8 **)(lVar14 + 0x40) = puVar9;
        *(undefined1 **)(lVar14 + 0x48) = puVar24;
        *(undefined1 **)(lVar14 + 0x50) = puVar17;
joined_r0x00032b44:
        if (puVar12 != (undefined1 *)0x0) {
          puVar9 = (undefined8 *)__ZdlPv(puVar12);
        }
        goto code_r0x00032d4c;
      }
    }
    puVar9 = (undefined8 *)Var3;
    puVar24 = puVar12 + 1;
    *puVar12 = (char)((unkuint9)Var3 >> 0x40);
code_r0x00032d4c:
    *(undefined1 **)(lVar14 + 0x48) = puVar24;
    return puVar9;
  }
  plStack_a8 = plVar5 + 2;
  lVar20 = *plStack_a8 - (long)puVar6 >> 3;
  uVar27 = lVar20 * 0x5555555555555556;
  if (uVar27 <= uVar19) {
    uVar27 = uVar19;
  }
  if (0x555555555555554 < (ulong)(lVar20 * -0x5555555555555555)) {
    uVar27 = 0xaaaaaaaaaaaaaaa;
  }
  if (uVar27 == 0) {
    puStack_c8 = (undefined8 *)0x0;
  }
  else {
    if (0xaaaaaaaaaaaaaaa < uVar27) goto code_r0x00032734;
    puStack_c8 = (undefined8 *)__Znwm(uVar27 * 0x18);
  }
  puStack_c0 = puStack_c8 + lVar14;
  puStack_b0 = puStack_c8 + uVar27 * 3;
  puStack_b8 = puStack_c0;
  if (*(char *)((long)puVar9 + 0x17) < '\0') {
    func_0x00017634(puStack_c0,*puVar9,puVar9[1]);
    puVar6 = (undefined8 *)*plVar5;
    puVar13 = (undefined8 *)plVar5[1];
    puVar9 = puStack_b8 + 3;
    if (puVar13 != puVar6) goto code_r0x00032678;
  }
  else {
    uVar7 = *puVar9;
    puStack_c0[1] = puVar9[1];
    *puStack_c0 = uVar7;
    puStack_c0[2] = puVar9[2];
    puVar9 = puStack_c0 + 3;
    if (puVar13 != puVar6) {
code_r0x00032678:
      do {
        uVar8 = puVar13[-2];
        uVar7 = puVar13[-3];
        puStack_c0[-1] = puVar13[-1];
        puStack_c0[-2] = uVar8;
        puStack_c0[-3] = uVar7;
        puStack_c0 = puStack_c0 + -3;
        puVar13[-2] = 0;
        puVar13[-1] = 0;
        puVar13[-3] = 0;
        puVar13 = puVar13 + -3;
      } while (puVar13 != puVar6);
      puVar13 = (undefined8 *)*plVar5;
      puVar6 = (undefined8 *)plVar5[1];
      goto code_r0x000326b0;
    }
  }
  puVar13 = puVar6;
code_r0x000326b0:
  *plVar5 = (long)puStack_c0;
  plVar5[1] = (long)puVar9;
  lVar14 = plVar5[2];
  plVar5[2] = (long)puStack_b0;
  puStack_c8 = puVar13;
  puStack_c0 = puVar13;
  puStack_b0 = (undefined8 *)lVar14;
  if (puVar6 != puVar13) {
    do {
      puVar22 = puVar6 + -3;
      puStack_b8 = puVar22;
      if (*(char *)((long)puVar6 + -1) < '\0') {
        __ZdlPv(*puVar22);
      }
      puVar6 = puVar22;
    } while (puVar22 != puVar13);
    puVar6 = puVar13;
  }
  if (puVar6 != (undefined8 *)0x0) {
    __ZdlPv(puVar6);
  }
  return puVar9;
}



/* WARNING: Removing unreachable block (ram,0x000330a0) */
/* WARNING: Removing unreachable block (ram,0x0003309c) */
/* WARNING: Removing unreachable block (ram,0x000330b0) */
/* WARNING: Type propagation algorithm not settling */

undefined8 *
FUN_0003210c(undefined8 *param_1,undefined8 *param_2,undefined1 *param_3,undefined1 *param_4,
            undefined8 param_5)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  unkbyte9 Var4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 *******pppppppuVar8;
  long *plVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  undefined *puVar12;
  undefined8 *extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 *******pppppppuVar13;
  undefined1 *puVar14;
  long lVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined1 *puVar18;
  undefined8 *puVar19;
  ulong uVar20;
  long lVar21;
  undefined1 *puVar22;
  undefined8 *puVar23;
  undefined8 *puVar24;
  undefined1 *puVar25;
  long lVar26;
  ulong uVar27;
  long lVar28;
  undefined1 *puVar29;
  undefined8 ******ppppppuVar30;
  undefined8 ******ppppppuVar31;
  undefined8 uVar32;
  undefined8 ******ppppppuVar33;
  undefined8 ******ppppppuVar34;
  undefined8 uVar35;
  undefined8 ******ppppppuVar36;
  undefined8 uVar37;
  undefined8 ******ppppppuVar38;
  undefined8 uVar39;
  undefined8 ******ppppppuVar40;
  undefined8 uVar41;
  undefined1 auVar42 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  byte bStack000000000000002f;
  undefined8 *******pppppppuStack_208;
  ulong uStack_200;
  undefined8 uStack_1f8;
  undefined1 *puStack_1f0;
  long lStack_1e8;
  undefined8 uStack_1e0;
  undefined1 *puStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  long ****pppplStack_1c0;
  undefined *puStack_1b8;
  long ***ppplStack_170;
  undefined *puStack_168;
  undefined8 *******pppppppuStack_158;
  ulong uStack_150;
  undefined8 uStack_148;
  long **pplStack_100;
  undefined *puStack_f8;
  undefined8 *puStack_f0;
  undefined8 uStack_e8;
  long *plStack_e0;
  undefined *puStack_d8;
  undefined8 *puStack_c8;
  undefined8 *puStack_c0;
  undefined8 *puStack_b8;
  undefined8 *puStack_b0;
  long *plStack_a8;
  ulong uStack_a0;
  long lStack_70;
  undefined *puStack_68;
  undefined8 *******pppppppuStack_58;
  ulong uStack_50;
  undefined8 uStack_48;
  
  uVar27 = (long)param_4 - (long)param_3;
  if (uVar27 < 0x7ffffffffffffff8) {
    if (uVar27 < 0x17) {
      _uStack0000000000000028 = CONCAT17((char)uVar27,uStack0000000000000028);
      puVar5 = &uStack0000000000000018;
      puVar6 = param_2;
    }
    else {
      uVar20 = (uVar27 & 0xfffffffffffffff8) + 8;
      if ((uVar27 | 7) != 0x17) {
        uVar20 = uVar27 | 7;
      }
      puVar5 = (undefined8 *)__Znwm(uVar20 + 1);
      _uStack0000000000000028 = uVar20 + 1 | 0x8000000000000000;
      in_stack_00000020 = uVar27;
      puVar6 = puVar5;
      uStack0000000000000018 = puVar5;
    }
    if (param_3 != param_4) {
      puVar6 = (undefined8 *)_memcpy(puVar5,param_3,uVar27);
      puVar5 = (undefined8 *)((long)puVar5 + uVar27);
    }
    *(undefined1 *)puVar5 = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    if ((long)_uStack0000000000000028 < 0) {
      if (in_stack_00000020 == 0) goto LAB_000321f0;
      puVar5 = uStack0000000000000018;
    }
    else {
      if (bStack000000000000002f == '\0') {
        return puVar6;
      }
      puVar5 = &uStack0000000000000018;
    }
    puVar6 = (undefined8 *)__ZNSt3__120__get_collation_nameEPKc(puVar5);
    param_1[1] = in_stack_00000008;
    *param_1 = in_stack_00000000;
    param_1[2] = in_stack_00000010;
    uVar27 = param_1[1];
    if (-1 < (long)in_stack_00000010) {
      uVar27 = in_stack_00000010 >> 0x38;
    }
    if (uVar27 == 0) {
      if ((long)_uStack0000000000000028 < 0) {
        if (2 < in_stack_00000020) goto LAB_000321f0;
        puVar5 = uStack0000000000000018;
        uVar27 = in_stack_00000020;
      }
      else {
        if (2 < bStack000000000000002f) {
          return puVar6;
        }
        puVar5 = &uStack0000000000000018;
        uVar27 = (ulong)bStack000000000000002f;
      }
      puVar6 = (undefined8 *)
               (**(code **)(*(long *)param_2[2] + 0x20))
                         ((long *)param_2[2],puVar5,(long)puVar5 + uVar27);
      if (*(char *)((long)param_1 + 0x17) < '\0') {
        puVar6 = (undefined8 *)__ZdlPv(*param_1);
      }
      param_1[1] = in_stack_00000008;
      *param_1 = in_stack_00000000;
      param_1[2] = in_stack_00000010;
      cVar2 = *(char *)((long)param_1 + 0x17);
      if (cVar2 < '\0') {
        if ((param_1[1] == 1) || (param_1[1] == 0xc)) {
          if (&uStack0000000000000018 != param_1) {
            uVar27 = in_stack_00000020;
            puVar5 = uStack0000000000000018;
            if (-1 < (long)_uStack0000000000000028) {
              uVar27 = _uStack0000000000000028 >> 0x38;
              puVar5 = &uStack0000000000000018;
            }
            puVar6 = (undefined8 *)func_0x00017784(param_1,puVar5,uVar27);
          }
        }
        else {
          *(undefined1 *)*param_1 = 0;
          param_1[1] = 0;
        }
      }
      else if ((cVar2 == '\x01') || (cVar2 == '\f')) {
        if (&uStack0000000000000018 != param_1) {
          if ((long)_uStack0000000000000028 < 0) {
            puVar6 = (undefined8 *)func_0x000176c0(param_1,uStack0000000000000018,in_stack_00000020)
            ;
          }
          else {
            param_1[1] = in_stack_00000020;
            *param_1 = uStack0000000000000018;
            param_1[2] = _uStack0000000000000028;
          }
        }
      }
      else {
        *(undefined1 *)param_1 = 0;
        *(undefined1 *)((long)param_1 + 0x17) = 0;
      }
    }
LAB_000321f0:
    if ((long)_uStack0000000000000028 < 0) {
      puVar6 = (undefined8 *)__ZdlPv(uStack0000000000000018);
    }
    return puVar6;
  }
  uVar7 = func_0x0001748c(&uStack0000000000000018);
  if (*(char *)((long)param_1 + 0x17) < '\0') goto code_r0x00032364;
  while (-1 < (long)_uStack0000000000000028) {
    __Unwind_Resume(uVar7);
code_r0x00032364:
    __ZdlPv(*param_1);
  }
  __ZdlPv(uStack0000000000000018);
  auVar42 = __Unwind_Resume(uVar7);
  puVar25 = auVar42._8_8_;
  lVar21 = (long)register0x00000008 + -0x10;
  uVar27 = (long)param_4 - (long)puVar25;
  if (uVar27 < 0x7ffffffffffffff8) {
    if (uVar27 < 0x17) {
      uStack_48 = CONCAT17((char)uVar27,(undefined7)uStack_48);
      pppppppuVar8 = &pppppppuStack_58;
    }
    else {
      uVar20 = (uVar27 & 0xfffffffffffffff8) + 8;
      if ((uVar27 | 7) != 0x17) {
        uVar20 = uVar27 | 7;
      }
      pppppppuVar8 = (undefined8 *******)__Znwm(uVar20 + 1);
      uStack_48 = uVar20 + 1 | 0x8000000000000000;
      uStack_50 = uVar27;
      pppppppuStack_58 = pppppppuVar8;
    }
    if (puVar25 == param_4) {
      pppppppuVar13 = pppppppuVar8;
    }
    else {
      if ((0x3f < uVar27) && (0x3f < (ulong)((long)pppppppuVar8 - (long)puVar25))) {
        uVar16 = uVar27 & 0xffffffffffffffc0;
        pppppppuVar13 = (undefined8 *******)((long)pppppppuVar8 + uVar16);
        pppppppuVar8 = (undefined8 *******)((long)pppppppuVar8 + 0x20);
        puVar5 = (undefined8 *)(puVar25 + 0x20);
        uVar20 = uVar16;
        do {
          ppppppuVar30 = (undefined8 ******)puVar5[-4];
          ppppppuVar33 = (undefined8 ******)puVar5[-1];
          ppppppuVar31 = (undefined8 ******)puVar5[-2];
          ppppppuVar36 = (undefined8 ******)puVar5[1];
          ppppppuVar34 = (undefined8 ******)*puVar5;
          ppppppuVar40 = (undefined8 ******)puVar5[3];
          ppppppuVar38 = (undefined8 ******)puVar5[2];
          pppppppuVar8[-3] = (undefined8 ******)puVar5[-3];
          pppppppuVar8[-4] = ppppppuVar30;
          pppppppuVar8[-1] = ppppppuVar33;
          pppppppuVar8[-2] = ppppppuVar31;
          pppppppuVar8[1] = ppppppuVar36;
          *pppppppuVar8 = ppppppuVar34;
          pppppppuVar8[3] = ppppppuVar40;
          pppppppuVar8[2] = ppppppuVar38;
          uVar20 = uVar20 - 0x40;
          pppppppuVar8 = pppppppuVar8 + 8;
          puVar5 = puVar5 + 8;
        } while (uVar20 != 0);
        pppppppuVar8 = pppppppuVar13;
        puVar25 = puVar25 + uVar16;
        if (uVar27 == uVar16) goto LAB_00032478;
      }
      do {
        puVar14 = puVar25 + 1;
        *(undefined1 *)pppppppuVar8 = *puVar25;
        pppppppuVar13 = (undefined8 *******)((long)pppppppuVar8 + 1);
        pppppppuVar8 = (undefined8 *******)((long)pppppppuVar8 + 1);
        puVar25 = puVar14;
      } while (puVar14 != param_4);
    }
LAB_00032478:
    *(undefined1 *)pppppppuVar13 = 0;
    plVar9 = *(long **)(auVar42._0_8_ + 0x10);
    uVar27 = uStack_50;
    pppppppuVar8 = pppppppuStack_58;
    if (-1 < (long)uStack_48) {
      uVar27 = uStack_48 >> 0x38;
      pppppppuVar8 = &pppppppuStack_58;
    }
    puVar5 = (undefined8 *)
             (**(code **)(*plVar9 + 0x20))
                       (extraout_x8,plVar9,pppppppuVar8,(undefined1 *)((long)pppppppuVar8 + uVar27))
    ;
    bVar1 = *(byte *)((long)extraout_x8 + 0x17);
    uVar27 = extraout_x8[1];
    if (-1 < (char)bVar1) {
      uVar27 = (ulong)bVar1;
    }
    if (uVar27 != 1) {
      if (uVar27 == 0xc) {
        puVar6 = (undefined8 *)*extraout_x8;
        if (-1 < (char)bVar1) {
          puVar6 = extraout_x8;
        }
        *(undefined1 *)((long)puVar6 + 0xb) = *(undefined1 *)((long)puVar6 + 3);
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
      puVar5 = (undefined8 *)__ZdlPv(pppppppuStack_58);
      return puVar5;
    }
    return puVar5;
  }
  uVar7 = func_0x0001748c(&pppppppuStack_58);
  if ((long)uStack_48 < 0) {
    __ZdlPv(pppppppuStack_58);
  }
  auVar42 = __Unwind_Resume(uVar7);
  puVar11 = auVar42._8_8_;
  plVar9 = auVar42._0_8_;
  puStack_68 = &DAT_00032578;
  puVar5 = (undefined8 *)*plVar9;
  puVar6 = (undefined8 *)plVar9[1];
  lVar15 = (long)puVar6 - (long)puVar5 >> 3;
  lVar28 = lVar15 * -0x5555555555555555;
  uVar20 = lVar28 + 1;
  uStack_a0 = uVar27;
  lStack_70 = lVar21;
  if (0xaaaaaaaaaaaaaaa < uVar20) {
    func_0x00017f90(plVar9);
code_r0x00032734:
    uVar7 = func_0x00017514();
    func_0x0002341c(&puStack_c8);
    __Unwind_Resume(uVar7);
    puStack_d8 = &DAT_0003274c;
    puStack_f0 = puVar5;
    uStack_e8 = uVar7;
    plStack_e0 = &lStack_70;
    uVar7 = ___cxa_allocate_exception(0x18);
    __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,2);
    puVar12 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
    uVar10 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0);
    ___cxa_free_exception(uVar7);
    auVar42 = __Unwind_Resume(uVar10);
    puVar25 = auVar42._8_8_;
    puStack_f8 = &DAT_00032798;
    uVar27 = (long)puVar12 - (long)puVar25;
    pplStack_100 = &plStack_e0;
    if (uVar27 < 0x7ffffffffffffff8) {
      if (uVar27 < 0x17) {
        uStack_148 = CONCAT17((char)uVar27,(undefined7)uStack_148);
        pppppppuVar8 = &pppppppuStack_158;
      }
      else {
        uVar20 = (uVar27 & 0xfffffffffffffff8) + 8;
        if ((uVar27 | 7) != 0x17) {
          uVar20 = uVar27 | 7;
        }
        pppppppuVar8 = (undefined8 *******)__Znwm(uVar20 + 1);
        uStack_148 = uVar20 + 1 | 0x8000000000000000;
        uStack_150 = uVar27;
        pppppppuStack_158 = pppppppuVar8;
      }
      if (puVar25 != puVar12) {
        _memcpy(pppppppuVar8,puVar25,uVar27);
        pppppppuVar8 = (undefined8 *******)((long)pppppppuVar8 + uVar27);
      }
      *(undefined1 *)pppppppuVar8 = 0;
      plVar9 = *(long **)(auVar42._0_8_ + 8);
      uVar27 = uStack_150;
      pppppppuVar8 = pppppppuStack_158;
      if (-1 < (long)uStack_148) {
        uVar27 = uStack_148 >> 0x38;
        pppppppuVar8 = &pppppppuStack_158;
      }
      (**(code **)(*plVar9 + 0x30))(plVar9,pppppppuVar8,(undefined1 *)((long)pppppppuVar8 + uVar27))
      ;
      pppppppuVar8 = pppppppuStack_158;
      if (-1 < (long)uStack_148) {
        pppppppuVar8 = &pppppppuStack_158;
      }
      puVar5 = (undefined8 *)__ZNSt3__115__get_classnameEPKcb(pppppppuVar8,param_5);
      if ((long)uStack_148 < 0) {
        __ZdlPv(pppppppuStack_158);
      }
      return puVar5;
    }
    uVar7 = func_0x0001748c(&pppppppuStack_158);
    if ((long)uStack_148 < 0) {
      __ZdlPv(pppppppuStack_158);
    }
    auVar42 = __Unwind_Resume(uVar7);
    Var4 = auVar42._0_9_;
    uVar7 = auVar42._8_8_;
    lVar21 = auVar42._0_8_;
    puStack_168 = &DAT_000328e0;
    ppplStack_170 = &pplStack_100;
    if (*(char *)(lVar21 + 0xa9) == '\0') {
      puVar25 = *(undefined1 **)(lVar21 + 0x48);
      puVar14 = *(undefined1 **)(lVar21 + 0x50);
      uVar3 = auVar42[8];
      if (*(char *)(lVar21 + 0xaa) == '\0') {
        if (puVar14 <= puVar25) {
          puVar29 = *(undefined1 **)(lVar21 + 0x40);
          puVar5 = (undefined8 *)(puVar25 + -(long)puVar29);
          puVar22 = (undefined1 *)((long)puVar5 + 1);
          if ((long)puVar22 < 0) goto code_r0x00032d68;
          puVar18 = (undefined1 *)(((long)puVar14 - (long)puVar29) * 2);
          if (puVar18 <= puVar22) {
            puVar18 = puVar22;
          }
          if (0x3ffffffffffffffe < (ulong)((long)puVar14 - (long)puVar29)) {
            puVar18 = (undefined1 *)0x7fffffffffffffff;
          }
          if (puVar18 == (undefined1 *)0x0) {
            puVar11 = (undefined8 *)0x0;
            *(undefined1 *)puVar5 = uVar3;
            puVar18 = (undefined1 *)0x0;
            puVar6 = puVar5;
          }
          else {
            puVar11 = (undefined8 *)__Znwm(puVar18);
            puVar6 = (undefined8 *)((long)puVar11 + (long)puVar5);
            puVar18 = (undefined1 *)((long)puVar11 + (long)puVar18);
            *(undefined1 *)puVar6 = uVar3;
          }
          puVar14 = (undefined1 *)((long)puVar6 + 1);
          if (puVar25 == puVar29) goto code_r0x00032b38;
          puVar22 = puVar25;
          if (((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar5) &&
             (0x3f < (ulong)((long)puVar29 - (long)puVar11))) {
            if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar5) {
              puVar17 = (undefined8 *)((ulong)puVar5 & 0xffffffffffffffc0);
              puVar19 = (undefined8 *)(puVar25 + -0x20);
              puVar23 = (undefined8 *)((long)puVar11 + ((long)puVar19 - (long)puVar29));
              puVar24 = puVar17;
              do {
                uVar32 = *puVar19;
                uVar10 = puVar19[3];
                uVar7 = puVar19[2];
                uVar41 = puVar19[-3];
                uVar39 = puVar19[-4];
                uVar37 = puVar19[-1];
                uVar35 = puVar19[-2];
                puVar23[1] = puVar19[1];
                *puVar23 = uVar32;
                puVar23[3] = uVar10;
                puVar23[2] = uVar7;
                puVar23[-3] = uVar41;
                puVar23[-4] = uVar39;
                puVar23[-1] = uVar37;
                puVar23[-2] = uVar35;
                puVar19 = puVar19 + -8;
                puVar23 = puVar23 + -8;
                puVar24 = puVar24 + -8;
              } while (puVar24 != (undefined8 *)0x0);
              if (puVar5 == puVar17) goto code_r0x00032d34;
              if (((ulong)puVar5 & 0x38) == 0) {
                puVar6 = (undefined8 *)((long)puVar6 - (long)puVar17);
                puVar22 = puVar25 + -(long)puVar17;
                goto code_r0x00032d24;
              }
            }
            else {
              puVar17 = (undefined8 *)0x0;
            }
            puVar19 = (undefined8 *)((ulong)puVar5 & 0xfffffffffffffff8);
            puVar22 = puVar25 + -(long)puVar19;
            puVar6 = (undefined8 *)((long)puVar6 - (long)puVar19);
            lVar15 = (long)puVar17 - (long)puVar19;
            puVar23 = (undefined8 *)(puVar25 + (-8 - (long)puVar17));
            puVar24 = (undefined8 *)
                      ((long)puVar11 + ((long)(puVar25 + (-8 - (long)puVar17)) - (long)puVar29));
            do {
              *puVar24 = *puVar23;
              lVar15 = lVar15 + 8;
              puVar23 = puVar23 + -1;
              puVar24 = puVar24 + -1;
            } while (lVar15 != 0);
            if (puVar5 == puVar19) goto code_r0x00032d34;
          }
code_r0x00032d24:
          do {
            puVar6 = (undefined8 *)((long)puVar6 + -1);
            puVar22 = puVar22 + -1;
            *(undefined1 *)puVar6 = *puVar22;
          } while (puVar22 != puVar29);
          goto code_r0x00032d34;
        }
      }
      else if (puVar14 <= puVar25) {
        puVar29 = *(undefined1 **)(lVar21 + 0x40);
        puVar5 = (undefined8 *)(puVar25 + -(long)puVar29);
        puVar22 = (undefined1 *)((long)puVar5 + 1);
        if ((long)puVar22 < 0) {
code_r0x00032d68:
          lVar15 = lVar21 + 0x40;
          auVar42 = func_0x00017f90(lVar15);
          puVar14 = auVar42._8_8_;
          puStack_1b8 = &DAT_00032d70;
          uVar27 = (long)puVar12 - (long)puVar14;
          puStack_1f0 = puVar29;
          lStack_1e8 = lVar28;
          uStack_1e0 = uVar7;
          puStack_1d8 = puVar25;
          lStack_1d0 = lVar15;
          lStack_1c8 = lVar21;
          pppplStack_1c0 = &ppplStack_170;
          if (uVar27 < 0x7ffffffffffffff8) {
            if (uVar27 < 0x17) {
              uStack_1f8 = CONCAT17((char)uVar27,(undefined7)uStack_1f8);
              pppppppuVar8 = &pppppppuStack_208;
            }
            else {
              uVar20 = (uVar27 & 0xfffffffffffffff8) + 8;
              if ((uVar27 | 7) != 0x17) {
                uVar20 = uVar27 | 7;
              }
              pppppppuVar8 = (undefined8 *******)__Znwm(uVar20 + 1);
              uStack_1f8 = uVar20 + 1 | 0x8000000000000000;
              uStack_200 = uVar27;
              pppppppuStack_208 = pppppppuVar8;
            }
            if (puVar14 == puVar12) {
              pppppppuVar13 = pppppppuVar8;
            }
            else {
              if ((0x3f < uVar27) && (0x3f < (ulong)((long)pppppppuVar8 - (long)puVar14))) {
                uVar16 = uVar27 & 0xffffffffffffffc0;
                pppppppuVar13 = (undefined8 *******)((long)pppppppuVar8 + uVar16);
                pppppppuVar8 = pppppppuVar8 + 4;
                puVar5 = (undefined8 *)(puVar14 + 0x20);
                uVar20 = uVar16;
                do {
                  ppppppuVar30 = (undefined8 ******)puVar5[-4];
                  ppppppuVar33 = (undefined8 ******)puVar5[-1];
                  ppppppuVar31 = (undefined8 ******)puVar5[-2];
                  ppppppuVar36 = (undefined8 ******)puVar5[1];
                  ppppppuVar34 = (undefined8 ******)*puVar5;
                  ppppppuVar40 = (undefined8 ******)puVar5[3];
                  ppppppuVar38 = (undefined8 ******)puVar5[2];
                  pppppppuVar8[-3] = (undefined8 ******)puVar5[-3];
                  pppppppuVar8[-4] = ppppppuVar30;
                  pppppppuVar8[-1] = ppppppuVar33;
                  pppppppuVar8[-2] = ppppppuVar31;
                  pppppppuVar8[1] = ppppppuVar36;
                  *pppppppuVar8 = ppppppuVar34;
                  pppppppuVar8[3] = ppppppuVar40;
                  pppppppuVar8[2] = ppppppuVar38;
                  uVar20 = uVar20 - 0x40;
                  pppppppuVar8 = pppppppuVar8 + 8;
                  puVar5 = puVar5 + 8;
                } while (uVar20 != 0);
                pppppppuVar8 = pppppppuVar13;
                puVar14 = puVar14 + uVar16;
                if (uVar27 == uVar16) goto code_r0x00032e64;
              }
              do {
                puVar25 = puVar14 + 1;
                *(undefined1 *)pppppppuVar8 = *puVar14;
                pppppppuVar13 = (undefined8 *******)((long)pppppppuVar8 + 1);
                pppppppuVar8 = (undefined8 *******)((long)pppppppuVar8 + 1);
                puVar14 = puVar25;
              } while (puVar25 != puVar12);
            }
code_r0x00032e64:
            *(undefined1 *)pppppppuVar13 = 0;
            plVar9 = *(long **)(auVar42._0_8_ + 0x10);
            uVar27 = uStack_200;
            pppppppuVar8 = pppppppuStack_208;
            if (-1 < (long)uStack_1f8) {
              uVar27 = uStack_1f8 >> 0x38;
              pppppppuVar8 = &pppppppuStack_208;
            }
            puVar5 = (undefined8 *)
                     (**(code **)(*plVar9 + 0x20))
                               (extraout_x8_00,plVar9,pppppppuVar8,
                                (undefined1 *)((long)pppppppuVar8 + uVar27));
            if ((long)uStack_1f8 < 0) {
              puVar5 = (undefined8 *)__ZdlPv(pppppppuStack_208);
              return puVar5;
            }
            return puVar5;
          }
          uVar7 = func_0x0001748c(&pppppppuStack_208);
          if ((long)uStack_1f8 < 0) {
            __ZdlPv(pppppppuStack_208);
          }
          __Unwind_Resume(uVar7);
          uVar7 = ___cxa_allocate_exception(0x18);
          __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,9);
          uVar10 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0,
                                PTR___ZNSt3__111regex_errorD1Ev_009b0070);
          ___cxa_free_exception(uVar7);
          auVar42 = __Unwind_Resume(uVar10);
          puVar5 = auVar42._8_8_;
          plVar9 = auVar42._0_8_;
          lVar21 = plVar9[1] - *plVar9 >> 4;
          uVar27 = lVar21 * -0x5555555555555555 + 1;
          if (0x555555555555555 < uVar27) {
            func_0x00017f90(plVar9);
code_r0x000330f8:
            puVar5 = (undefined8 *)func_0x00017514();
            *puVar5 = &UNK_009b3050;
            if ((long *)puVar5[1] != (long *)0x0) {
              (**(code **)(*(long *)puVar5[1] + 8))();
            }
            return puVar5;
          }
          lVar15 = plVar9[2] - *plVar9 >> 4;
          uVar20 = lVar15 * 0x5555555555555556;
          if (uVar20 <= uVar27) {
            uVar20 = uVar27;
          }
          if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar15 * -0x5555555555555555)) {
            uVar20 = 0x555555555555555;
          }
          if (uVar20 == 0) {
            lVar15 = 0;
          }
          else {
            if (0x555555555555555 < uVar20) goto code_r0x000330f8;
            lVar15 = __Znwm(uVar20 * 0x30);
          }
          puVar6 = (undefined8 *)(lVar15 + lVar21 * 0x10);
          puVar6[2] = puVar5[2];
          uVar7 = *puVar5;
          puVar6[1] = puVar5[1];
          *puVar6 = uVar7;
          lVar15 = lVar15 + uVar20 * 0x30;
          uVar7 = puVar5[3];
          puVar5[2] = 0;
          puVar5[3] = 0;
          *puVar5 = 0;
          puVar5[1] = 0;
          puVar6[4] = puVar5[4];
          puVar6[3] = uVar7;
          puVar6[5] = puVar5[5];
          puVar5[4] = 0;
          puVar5[5] = 0;
          puVar5 = puVar6 + 6;
          lVar21 = *plVar9;
          lVar28 = plVar9[1];
          if (lVar28 == lVar21) {
            *plVar9 = (long)puVar6;
            plVar9[1] = (long)puVar5;
            plVar9[2] = lVar15;
          }
          else {
            do {
              uVar10 = *(undefined8 *)(lVar28 + -0x28);
              uVar7 = *(undefined8 *)(lVar28 + -0x30);
              puVar6[-4] = *(undefined8 *)(lVar28 + -0x20);
              puVar6[-5] = uVar10;
              puVar6[-6] = uVar7;
              *(undefined8 *)(lVar28 + -0x28) = 0;
              *(undefined8 *)(lVar28 + -0x20) = 0;
              *(undefined8 *)(lVar28 + -0x30) = 0;
              uVar10 = *(undefined8 *)(lVar28 + -0x10);
              uVar7 = *(undefined8 *)(lVar28 + -0x18);
              puVar6[-1] = *(undefined8 *)(lVar28 + -8);
              puVar6[-2] = uVar10;
              puVar6[-3] = uVar7;
              puVar6 = puVar6 + -6;
              *(undefined8 *)(lVar28 + -0x10) = 0;
              *(undefined8 *)(lVar28 + -8) = 0;
              *(undefined8 *)(lVar28 + -0x18) = 0;
              lVar28 = lVar28 + -0x30;
            } while (lVar28 != lVar21);
            lVar21 = *plVar9;
            lVar26 = plVar9[1];
            *plVar9 = (long)puVar6;
            plVar9[1] = (long)puVar5;
            plVar9[2] = lVar15;
            lVar28 = lVar26;
            for (; lVar26 != lVar21; lVar26 = lVar26 + -0x30) {
              lVar28 = lVar21;
            }
          }
          if (lVar28 != 0) {
            __ZdlPv(lVar28);
          }
          return puVar5;
        }
        puVar18 = (undefined1 *)(((long)puVar14 - (long)puVar29) * 2);
        if (puVar18 <= puVar22) {
          puVar18 = puVar22;
        }
        if (0x3ffffffffffffffe < (ulong)((long)puVar14 - (long)puVar29)) {
          puVar18 = (undefined1 *)0x7fffffffffffffff;
        }
        if (puVar18 == (undefined1 *)0x0) {
          puVar11 = (undefined8 *)0x0;
          *(undefined1 *)puVar5 = uVar3;
          puVar18 = (undefined1 *)0x0;
          puVar6 = puVar5;
        }
        else {
          puVar11 = (undefined8 *)__Znwm(puVar18);
          puVar6 = (undefined8 *)((long)puVar11 + (long)puVar5);
          puVar18 = (undefined1 *)((long)puVar11 + (long)puVar18);
          *(undefined1 *)puVar6 = uVar3;
        }
        puVar14 = (undefined1 *)((long)puVar6 + 1);
        if (puVar25 != puVar29) {
          puVar22 = puVar25;
          if (((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar5) &&
             (0x3f < (ulong)((long)puVar29 - (long)puVar11))) {
            if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar5) {
              puVar17 = (undefined8 *)((ulong)puVar5 & 0xffffffffffffffc0);
              puVar19 = (undefined8 *)(puVar25 + -0x20);
              puVar23 = (undefined8 *)((long)puVar11 + ((long)puVar19 - (long)puVar29));
              puVar24 = puVar17;
              do {
                uVar32 = *puVar19;
                uVar10 = puVar19[3];
                uVar7 = puVar19[2];
                uVar41 = puVar19[-3];
                uVar39 = puVar19[-4];
                uVar37 = puVar19[-1];
                uVar35 = puVar19[-2];
                puVar23[1] = puVar19[1];
                *puVar23 = uVar32;
                puVar23[3] = uVar10;
                puVar23[2] = uVar7;
                puVar23[-3] = uVar41;
                puVar23[-4] = uVar39;
                puVar23[-1] = uVar37;
                puVar23[-2] = uVar35;
                puVar19 = puVar19 + -8;
                puVar23 = puVar23 + -8;
                puVar24 = puVar24 + -8;
              } while (puVar24 != (undefined8 *)0x0);
              if (puVar5 == puVar17) goto code_r0x00032d34;
              if (((ulong)puVar5 & 0x38) == 0) {
                puVar6 = (undefined8 *)((long)puVar6 - (long)puVar17);
                puVar22 = puVar25 + -(long)puVar17;
                goto code_r0x00032d04;
              }
            }
            else {
              puVar17 = (undefined8 *)0x0;
            }
            puVar19 = (undefined8 *)((ulong)puVar5 & 0xfffffffffffffff8);
            puVar22 = puVar25 + -(long)puVar19;
            puVar6 = (undefined8 *)((long)puVar6 - (long)puVar19);
            lVar15 = (long)puVar17 - (long)puVar19;
            puVar23 = (undefined8 *)(puVar25 + (-8 - (long)puVar17));
            puVar24 = (undefined8 *)
                      ((long)puVar11 + ((long)(puVar25 + (-8 - (long)puVar17)) - (long)puVar29));
            do {
              *puVar24 = *puVar23;
              lVar15 = lVar15 + 8;
              puVar23 = puVar23 + -1;
              puVar24 = puVar24 + -1;
            } while (lVar15 != 0);
            if (puVar5 == puVar19) goto code_r0x00032d34;
          }
code_r0x00032d04:
          do {
            puVar6 = (undefined8 *)((long)puVar6 + -1);
            puVar22 = puVar22 + -1;
            *(undefined1 *)puVar6 = *puVar22;
          } while (puVar22 != puVar29);
          goto code_r0x00032d34;
        }
code_r0x00032b38:
        *(undefined8 **)(lVar21 + 0x40) = puVar6;
        *(undefined1 **)(lVar21 + 0x48) = puVar14;
        *(undefined1 **)(lVar21 + 0x50) = puVar18;
        puVar11 = puVar6;
        goto joined_r0x00032b44;
      }
    }
    else {
      uVar7 = (**(code **)(**(long **)(lVar21 + 0x18) + 0x28))(*(long **)(lVar21 + 0x18),uVar7);
      auVar42._8_8_ = uVar7;
      auVar42._0_8_ = uVar7;
      Var4 = auVar42._0_9_;
      puVar25 = *(undefined1 **)(lVar21 + 0x48);
      if (*(undefined1 **)(lVar21 + 0x50) <= puVar25) {
        puVar29 = *(undefined1 **)(lVar21 + 0x40);
        puVar5 = (undefined8 *)(puVar25 + -(long)puVar29);
        puVar14 = (undefined1 *)((long)puVar5 + 1);
        if ((long)puVar14 < 0) goto code_r0x00032d68;
        uVar27 = (long)*(undefined1 **)(lVar21 + 0x50) - (long)puVar29;
        puVar18 = (undefined1 *)(uVar27 * 2);
        if (puVar18 <= puVar14) {
          puVar18 = puVar14;
        }
        if (0x3ffffffffffffffe < uVar27) {
          puVar18 = (undefined1 *)0x7fffffffffffffff;
        }
        if (puVar18 == (undefined1 *)0x0) {
          puVar11 = (undefined8 *)0x0;
          *(char *)puVar5 = (char)uVar7;
          puVar18 = (undefined1 *)0x0;
          puVar6 = puVar5;
        }
        else {
          puVar11 = (undefined8 *)__Znwm(puVar18);
          puVar6 = (undefined8 *)((long)puVar11 + (long)puVar5);
          puVar18 = (undefined1 *)((long)puVar11 + (long)puVar18);
          *(char *)puVar6 = (char)uVar7;
        }
        puVar14 = (undefined1 *)((long)puVar6 + 1);
        if (puVar25 == puVar29) goto code_r0x00032b38;
        puVar22 = puVar25;
        if ((&MACH_HEADER.cpusubtype <= puVar5) && (0x3f < (ulong)((long)puVar29 - (long)puVar11)))
        {
          if ((undefined8 *)((long)&segment_command_00000020.vmaddr + 7) < puVar5) {
            puVar17 = (undefined8 *)((ulong)puVar5 & 0xffffffffffffffc0);
            puVar19 = (undefined8 *)(puVar25 + -0x20);
            puVar23 = (undefined8 *)((long)puVar11 + ((long)puVar19 - (long)puVar29));
            puVar24 = puVar17;
            do {
              uVar32 = *puVar19;
              uVar10 = puVar19[3];
              uVar7 = puVar19[2];
              uVar41 = puVar19[-3];
              uVar39 = puVar19[-4];
              uVar37 = puVar19[-1];
              uVar35 = puVar19[-2];
              puVar23[1] = puVar19[1];
              *puVar23 = uVar32;
              puVar23[3] = uVar10;
              puVar23[2] = uVar7;
              puVar23[-3] = uVar41;
              puVar23[-4] = uVar39;
              puVar23[-1] = uVar37;
              puVar23[-2] = uVar35;
              puVar19 = puVar19 + -8;
              puVar23 = puVar23 + -8;
              puVar24 = puVar24 + -8;
            } while (puVar24 != (undefined8 *)0x0);
            if (puVar5 == puVar17) goto code_r0x00032d34;
            if (((ulong)puVar5 & 0x38) == 0) {
              puVar6 = (undefined8 *)((long)puVar6 - (long)puVar17);
              puVar22 = puVar25 + -(long)puVar17;
              goto code_r0x00032ce4;
            }
          }
          else {
            puVar17 = (undefined8 *)0x0;
          }
          puVar19 = (undefined8 *)((ulong)puVar5 & 0xfffffffffffffff8);
          puVar22 = puVar25 + -(long)puVar19;
          puVar6 = (undefined8 *)((long)puVar6 - (long)puVar19);
          lVar15 = (long)puVar17 - (long)puVar19;
          puVar23 = (undefined8 *)(puVar25 + (-8 - (long)puVar17));
          puVar24 = (undefined8 *)
                    ((long)puVar11 + ((long)(puVar25 + (-8 - (long)puVar17)) - (long)puVar29));
          do {
            *puVar24 = *puVar23;
            lVar15 = lVar15 + 8;
            puVar23 = puVar23 + -1;
            puVar24 = puVar24 + -1;
          } while (lVar15 != 0);
          if (puVar5 == puVar19) goto code_r0x00032d34;
        }
code_r0x00032ce4:
        do {
          puVar6 = (undefined8 *)((long)puVar6 + -1);
          puVar22 = puVar22 + -1;
          *(undefined1 *)puVar6 = *puVar22;
        } while (puVar22 != puVar29);
code_r0x00032d34:
        puVar25 = *(undefined1 **)(lVar21 + 0x40);
        *(undefined8 **)(lVar21 + 0x40) = puVar11;
        *(undefined1 **)(lVar21 + 0x48) = puVar14;
        *(undefined1 **)(lVar21 + 0x50) = puVar18;
joined_r0x00032b44:
        if (puVar25 != (undefined1 *)0x0) {
          puVar11 = (undefined8 *)__ZdlPv(puVar25);
        }
        goto code_r0x00032d4c;
      }
    }
    puVar11 = (undefined8 *)Var4;
    puVar14 = puVar25 + 1;
    *puVar25 = (char)((unkuint9)Var4 >> 0x40);
code_r0x00032d4c:
    *(undefined1 **)(lVar21 + 0x48) = puVar14;
    return puVar11;
  }
  plStack_a8 = plVar9 + 2;
  lVar21 = *plStack_a8 - (long)puVar5 >> 3;
  uVar27 = lVar21 * 0x5555555555555556;
  if (uVar27 <= uVar20) {
    uVar27 = uVar20;
  }
  if (0x555555555555554 < (ulong)(lVar21 * -0x5555555555555555)) {
    uVar27 = 0xaaaaaaaaaaaaaaa;
  }
  if (uVar27 == 0) {
    puStack_c8 = (undefined8 *)0x0;
  }
  else {
    if (0xaaaaaaaaaaaaaaa < uVar27) goto code_r0x00032734;
    puStack_c8 = (undefined8 *)__Znwm(uVar27 * 0x18);
  }
  puStack_c0 = puStack_c8 + lVar15;
  puStack_b0 = puStack_c8 + uVar27 * 3;
  puStack_b8 = puStack_c0;
  if (*(char *)((long)puVar11 + 0x17) < '\0') {
    func_0x00017634(puStack_c0,*puVar11,puVar11[1]);
    puVar5 = (undefined8 *)*plVar9;
    puVar6 = (undefined8 *)plVar9[1];
    puVar11 = puStack_b8 + 3;
    if (puVar6 != puVar5) goto code_r0x00032678;
  }
  else {
    uVar7 = *puVar11;
    puStack_c0[1] = puVar11[1];
    *puStack_c0 = uVar7;
    puStack_c0[2] = puVar11[2];
    puVar11 = puStack_c0 + 3;
    if (puVar6 != puVar5) {
code_r0x00032678:
      do {
        uVar10 = puVar6[-2];
        uVar7 = puVar6[-3];
        puStack_c0[-1] = puVar6[-1];
        puStack_c0[-2] = uVar10;
        puStack_c0[-3] = uVar7;
        puStack_c0 = puStack_c0 + -3;
        puVar6[-2] = 0;
        puVar6[-1] = 0;
        puVar6[-3] = 0;
        puVar6 = puVar6 + -3;
      } while (puVar6 != puVar5);
      puVar6 = (undefined8 *)*plVar9;
      puVar5 = (undefined8 *)plVar9[1];
      goto code_r0x000326b0;
    }
  }
  puVar6 = puVar5;
code_r0x000326b0:
  *plVar9 = (long)puStack_c0;
  plVar9[1] = (long)puVar11;
  lVar21 = plVar9[2];
  plVar9[2] = (long)puStack_b0;
  puStack_c8 = puVar6;
  puStack_c0 = puVar6;
  puStack_b0 = (undefined8 *)lVar21;
  if (puVar5 != puVar6) {
    do {
      puVar23 = puVar5 + -3;
      puStack_b8 = puVar23;
      if (*(char *)((long)puVar5 + -1) < '\0') {
        __ZdlPv(*puVar23);
      }
      puVar5 = puVar23;
    } while (puVar23 != puVar6);
    puVar5 = puVar6;
  }
  if (puVar5 != (undefined8 *)0x0) {
    __ZdlPv(puVar5);
  }
  return puVar11;
}


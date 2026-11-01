
/* WARNING: Removing unreachable block (ram,0x000330a0) */
/* WARNING: Removing unreachable block (ram,0x0003309c) */
/* WARNING: Removing unreachable block (ram,0x000330b0) */
/* WARNING: Type propagation algorithm not settling */

undefined8 ******* FUN_00031dc4(long param_1)

{
  byte bVar1;
  char cVar2;
  undefined1 uVar3;
  unkbyte9 Var4;
  undefined2 *puVar5;
  undefined8 *******pppppppuVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 *******pppppppuVar9;
  undefined8 ******ppppppuVar10;
  long *plVar11;
  undefined8 *******pppppppuVar12;
  undefined8 *puVar13;
  undefined *puVar14;
  undefined8 in_x3;
  ulong uVar15;
  undefined8 *******extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 extraout_x8_01;
  ulong in_x9;
  undefined2 *puVar16;
  undefined1 *puVar17;
  undefined8 *puVar18;
  long lVar19;
  ulong uVar20;
  undefined8 *******pppppppuVar21;
  ulong uVar22;
  undefined1 *puVar23;
  undefined8 *******pppppppuVar24;
  long lVar25;
  undefined8 *puVar26;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined2 *unaff_x21;
  undefined2 *puVar27;
  undefined1 *puVar28;
  undefined1 *puVar29;
  long lVar30;
  undefined2 unaff_w22;
  undefined8 ******ppppppuVar31;
  undefined2 *unaff_x23;
  long lVar32;
  undefined1 *puVar33;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 uVar34;
  undefined8 ******ppppppuVar35;
  undefined8 uVar36;
  undefined8 ******ppppppuVar37;
  undefined8 uVar38;
  undefined8 ******ppppppuVar39;
  undefined8 uVar40;
  undefined8 ******ppppppuVar41;
  undefined8 uVar42;
  undefined8 ******ppppppuVar43;
  undefined1 auVar44 [16];
  undefined8 *******pppppppuStack_2a8;
  ulong uStack_2a0;
  undefined8 uStack_298;
  undefined1 *puStack_290;
  long lStack_288;
  undefined8 uStack_280;
  undefined1 *puStack_278;
  long lStack_270;
  long lStack_268;
  long ******pppppplStack_260;
  undefined *puStack_258;
  undefined1 ******ppppppuStack_210;
  undefined *puStack_208;
  undefined8 *******pppppppuStack_1f8;
  ulong uStack_1f0;
  undefined8 uStack_1e8;
  undefined1 *****pppppuStack_1a0;
  undefined *puStack_198;
  undefined8 *puStack_190;
  undefined8 uStack_188;
  undefined1 ****ppppuStack_180;
  undefined *puStack_178;
  undefined8 *puStack_168;
  undefined8 *puStack_160;
  undefined8 *puStack_158;
  undefined8 *puStack_150;
  long *plStack_148;
  ulong uStack_140;
  undefined1 ***pppuStack_110;
  undefined *puStack_108;
  undefined8 *******pppppppuStack_f8;
  ulong uStack_f0;
  undefined8 uStack_e8;
  ulong uStack_e0;
  undefined1 **ppuStack_b0;
  undefined *puStack_a8;
  undefined8 ******ppppppuStack_a0;
  undefined8 ******ppppppuStack_98;
  undefined8 ******ppppppuStack_90;
  undefined8 *******pppppppuStack_88;
  undefined8 ******ppppppuStack_80;
  undefined8 uStack_78;
  undefined1 *puStack_30;
  undefined *puStack_28;
  undefined1 auStack_6 [6];
  
  uVar15 = param_1 - (long)unaff_x23;
  uVar20 = uVar15;
  if (uVar15 <= in_x9) {
    uVar20 = unaff_x25 + 1;
  }
  if (0x7ffffffffffffffd < uVar15) {
    uVar20 = 0x7fffffffffffffff;
  }
  if (uVar20 == 0) {
    pppppppuVar6 = (undefined8 *******)0x0;
    puVar16 = (undefined2 *)(unaff_x25 * 2);
    lVar19 = 0;
    *puVar16 = unaff_w22;
  }
  else {
    if ((long)uVar20 < 0) {
      func_0x00017514();
      puVar29 = auStack_6 + -10;
      uVar7 = ___cxa_allocate_exception(0x18);
      __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,1);
      puVar28 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
      uVar8 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0);
      ___cxa_free_exception(uVar7);
      auVar44 = __Unwind_Resume(uVar8);
      puVar17 = auVar44._8_8_;
      puStack_28 = &DAT_000320f0;
      ppppppuVar31 = (undefined8 ******)(puVar28 + -(long)puVar17);
      puStack_30 = puVar29;
      if (ppppppuVar31 < (undefined8 ******)0x7ffffffffffffff8) {
        if (ppppppuVar31 < (undefined8 ******)0x17) {
          uStack_78 = (undefined8 ******)CONCAT17((char)ppppppuVar31,(undefined7)uStack_78);
          pppppppuVar6 = &pppppppuStack_88;
          pppppppuVar9 = auVar44._0_8_;
        }
        else {
          uVar20 = ((ulong)ppppppuVar31 & 0xfffffffffffffff8) + 8;
          if (((ulong)ppppppuVar31 | 7) != 0x17) {
            uVar20 = (ulong)ppppppuVar31 | 7;
          }
          pppppppuVar6 = (undefined8 *******)__Znwm(uVar20 + 1);
          uStack_78 = (undefined8 ******)(uVar20 + 1 | 0x8000000000000000);
          ppppppuStack_80 = ppppppuVar31;
          pppppppuVar9 = pppppppuVar6;
          pppppppuStack_88 = pppppppuVar6;
        }
        if (puVar17 != puVar28) {
          pppppppuVar9 = (undefined8 *******)_memcpy(pppppppuVar6,puVar17,ppppppuVar31);
          pppppppuVar6 = (undefined8 *******)((long)pppppppuVar6 + (long)ppppppuVar31);
        }
        *(undefined1 *)pppppppuVar6 = 0;
        *extraout_x8 = (undefined8 ******)0x0;
        extraout_x8[1] = (undefined8 ******)0x0;
        extraout_x8[2] = (undefined8 ******)0x0;
        if ((long)uStack_78 < 0) {
          if (ppppppuStack_80 == (undefined8 ******)0x0) goto LAB_000321f0;
          pppppppuVar6 = pppppppuStack_88;
        }
        else {
          if (uStack_78._7_1_ == '\0') {
            return pppppppuVar9;
          }
          pppppppuVar6 = &pppppppuStack_88;
        }
        pppppppuVar9 = (undefined8 *******)
                       __ZNSt3__120__get_collation_nameEPKc(&ppppppuStack_a0,pppppppuVar6);
        extraout_x8[1] = ppppppuStack_98;
        *extraout_x8 = ppppppuStack_a0;
        extraout_x8[2] = ppppppuStack_90;
        ppppppuVar31 = extraout_x8[1];
        if (-1 < (long)ppppppuStack_90) {
          ppppppuVar31 = (undefined8 ******)((ulong)ppppppuStack_90 >> 0x38);
        }
        if (ppppppuVar31 == (undefined8 ******)0x0) {
          if ((long)uStack_78 < 0) {
            if ((undefined8 ******)0x2 < ppppppuStack_80) goto LAB_000321f0;
            pppppppuVar6 = pppppppuStack_88;
            ppppppuVar31 = ppppppuStack_80;
          }
          else {
            if (2 < uStack_78._7_1_) {
              return pppppppuVar9;
            }
            pppppppuVar6 = &pppppppuStack_88;
            ppppppuVar31 = (undefined8 ******)(ulong)uStack_78._7_1_;
          }
          ppppppuVar10 = auVar44._0_8_[2];
          pppppppuVar9 = (undefined8 *******)
                         (*(code *)(*ppppppuVar10)[4])
                                   (&ppppppuStack_a0,ppppppuVar10,pppppppuVar6,
                                    (undefined1 *)((long)pppppppuVar6 + (long)ppppppuVar31));
          if (*(char *)((long)extraout_x8 + 0x17) < '\0') {
            pppppppuVar9 = (undefined8 *******)__ZdlPv(*extraout_x8);
          }
          extraout_x8[1] = ppppppuStack_98;
          *extraout_x8 = ppppppuStack_a0;
          extraout_x8[2] = ppppppuStack_90;
          cVar2 = *(char *)((long)extraout_x8 + 0x17);
          if (cVar2 < '\0') {
            if ((extraout_x8[1] == (undefined8 ******)0x1) ||
               (extraout_x8[1] == (undefined8 ******)0xc)) {
              if (&pppppppuStack_88 != (undefined8 ********)extraout_x8) {
                ppppppuVar31 = ppppppuStack_80;
                pppppppuVar6 = pppppppuStack_88;
                if (-1 < (long)uStack_78) {
                  ppppppuVar31 = (undefined8 ******)((ulong)uStack_78 >> 0x38);
                  pppppppuVar6 = &pppppppuStack_88;
                }
                pppppppuVar9 = (undefined8 *******)
                               func_0x00017784(extraout_x8,pppppppuVar6,ppppppuVar31);
              }
            }
            else {
              *(undefined1 *)*extraout_x8 = 0;
              extraout_x8[1] = (undefined8 ******)0x0;
            }
          }
          else if ((cVar2 == '\x01') || (cVar2 == '\f')) {
            if (&pppppppuStack_88 != (undefined8 ********)extraout_x8) {
              if ((long)uStack_78 < 0) {
                pppppppuVar9 = (undefined8 *******)
                               func_0x000176c0(extraout_x8,pppppppuStack_88,ppppppuStack_80);
              }
              else {
                extraout_x8[1] = ppppppuStack_80;
                *extraout_x8 = pppppppuStack_88;
                extraout_x8[2] = uStack_78;
              }
            }
          }
          else {
            *(undefined1 *)extraout_x8 = 0;
            *(undefined1 *)((long)extraout_x8 + 0x17) = 0;
          }
        }
LAB_000321f0:
        if ((long)uStack_78 < 0) {
          pppppppuVar9 = (undefined8 *******)__ZdlPv(pppppppuStack_88);
        }
        return pppppppuVar9;
      }
      uVar7 = func_0x0001748c(&pppppppuStack_88);
      if (*(char *)((long)extraout_x8 + 0x17) < '\0') goto code_r0x00032364;
      while (-1 < (long)uStack_78) {
        __Unwind_Resume(uVar7);
code_r0x00032364:
        __ZdlPv(*extraout_x8);
      }
      __ZdlPv(pppppppuStack_88);
      auVar44 = __Unwind_Resume(uVar7);
      puVar29 = auVar44._8_8_;
      puStack_a8 = &DAT_00032384;
      uVar15 = (long)puVar28 - (long)puVar29;
      uStack_e0 = uVar20;
      ppuStack_b0 = &puStack_30;
      if (uVar15 < 0x7ffffffffffffff8) {
        if (uVar15 < 0x17) {
          uStack_e8 = CONCAT17((char)uVar15,(undefined7)uStack_e8);
          pppppppuVar6 = &pppppppuStack_f8;
        }
        else {
          uVar20 = (uVar15 & 0xfffffffffffffff8) + 8;
          if ((uVar15 | 7) != 0x17) {
            uVar20 = uVar15 | 7;
          }
          pppppppuVar6 = (undefined8 *******)__Znwm(uVar20 + 1);
          uStack_e8 = uVar20 + 1 | 0x8000000000000000;
          uStack_f0 = uVar15;
          pppppppuStack_f8 = pppppppuVar6;
        }
        if (puVar29 == puVar28) {
          pppppppuVar9 = pppppppuVar6;
        }
        else {
          if ((0x3f < uVar15) && (0x3f < (ulong)((long)pppppppuVar6 - (long)puVar29))) {
            uVar22 = uVar15 & 0xffffffffffffffc0;
            pppppppuVar9 = (undefined8 *******)((long)pppppppuVar6 + uVar22);
            pppppppuVar6 = (undefined8 *******)((long)pppppppuVar6 + 0x20);
            puVar18 = (undefined8 *)(puVar29 + 0x20);
            uVar20 = uVar22;
            do {
              ppppppuVar31 = (undefined8 ******)puVar18[-4];
              ppppppuVar35 = (undefined8 ******)puVar18[-1];
              ppppppuVar10 = (undefined8 ******)puVar18[-2];
              ppppppuVar39 = (undefined8 ******)puVar18[1];
              ppppppuVar37 = (undefined8 ******)*puVar18;
              ppppppuVar43 = (undefined8 ******)puVar18[3];
              ppppppuVar41 = (undefined8 ******)puVar18[2];
              pppppppuVar6[-3] = (undefined8 ******)puVar18[-3];
              pppppppuVar6[-4] = ppppppuVar31;
              pppppppuVar6[-1] = ppppppuVar35;
              pppppppuVar6[-2] = ppppppuVar10;
              pppppppuVar6[1] = ppppppuVar39;
              *pppppppuVar6 = ppppppuVar37;
              pppppppuVar6[3] = ppppppuVar43;
              pppppppuVar6[2] = ppppppuVar41;
              uVar20 = uVar20 - 0x40;
              pppppppuVar6 = pppppppuVar6 + 8;
              puVar18 = puVar18 + 8;
            } while (uVar20 != 0);
            pppppppuVar6 = pppppppuVar9;
            puVar29 = puVar29 + uVar22;
            if (uVar15 == uVar22) goto code_r0x00032478;
          }
          do {
            puVar17 = puVar29 + 1;
            *(undefined1 *)pppppppuVar6 = *puVar29;
            pppppppuVar9 = (undefined8 *******)((long)pppppppuVar6 + 1);
            pppppppuVar6 = (undefined8 *******)((long)pppppppuVar6 + 1);
            puVar29 = puVar17;
          } while (puVar17 != puVar28);
        }
code_r0x00032478:
        *(undefined1 *)pppppppuVar9 = 0;
        plVar11 = *(long **)(auVar44._0_8_ + 0x10);
        uVar20 = uStack_f0;
        pppppppuVar6 = pppppppuStack_f8;
        if (-1 < (long)uStack_e8) {
          uVar20 = uStack_e8 >> 0x38;
          pppppppuVar6 = &pppppppuStack_f8;
        }
        pppppppuVar6 = (undefined8 *******)
                       (**(code **)(*plVar11 + 0x20))
                                 (extraout_x8_00,plVar11,pppppppuVar6,
                                  (undefined1 *)((long)pppppppuVar6 + uVar20));
        bVar1 = *(byte *)((long)extraout_x8_00 + 0x17);
        uVar20 = extraout_x8_00[1];
        if (-1 < (char)bVar1) {
          uVar20 = (ulong)bVar1;
        }
        if (uVar20 != 1) {
          if (uVar20 == 0xc) {
            puVar18 = (undefined8 *)*extraout_x8_00;
            if (-1 < (char)bVar1) {
              puVar18 = extraout_x8_00;
            }
            *(undefined1 *)((long)puVar18 + 0xb) = *(undefined1 *)((long)puVar18 + 3);
          }
          else if ((char)bVar1 < '\0') {
            *(undefined1 *)*extraout_x8_00 = 0;
            extraout_x8_00[1] = 0;
          }
          else {
            *(undefined1 *)extraout_x8_00 = 0;
            *(undefined1 *)((long)extraout_x8_00 + 0x17) = 0;
          }
        }
        if ((long)uStack_e8 < 0) {
          pppppppuVar6 = (undefined8 *******)__ZdlPv(pppppppuStack_f8);
          return pppppppuVar6;
        }
        return pppppppuVar6;
      }
      uVar7 = func_0x0001748c(&pppppppuStack_f8);
      if ((long)uStack_e8 < 0) {
        __ZdlPv(pppppppuStack_f8);
      }
      auVar44 = __Unwind_Resume(uVar7);
      puVar13 = auVar44._8_8_;
      plVar11 = auVar44._0_8_;
      puStack_108 = &DAT_00032578;
      puVar18 = (undefined8 *)*plVar11;
      puVar26 = (undefined8 *)plVar11[1];
      lVar19 = (long)puVar26 - (long)puVar18 >> 3;
      lVar32 = lVar19 * -0x5555555555555555;
      uVar20 = lVar32 + 1;
      uStack_140 = uVar15;
      pppuStack_110 = &ppuStack_b0;
      if (0xaaaaaaaaaaaaaaa < uVar20) {
        func_0x00017f90(plVar11);
code_r0x00032734:
        uVar7 = func_0x00017514();
        func_0x0002341c(&puStack_168);
        __Unwind_Resume(uVar7);
        puStack_178 = &DAT_0003274c;
        puStack_190 = puVar18;
        uStack_188 = uVar7;
        ppppuStack_180 = &pppuStack_110;
        uVar7 = ___cxa_allocate_exception(0x18);
        __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,2);
        puVar14 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
        uVar8 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0);
        ___cxa_free_exception(uVar7);
        auVar44 = __Unwind_Resume(uVar8);
        puVar29 = auVar44._8_8_;
        puStack_198 = &DAT_00032798;
        uVar20 = (long)puVar14 - (long)puVar29;
        pppppuStack_1a0 = &ppppuStack_180;
        if (uVar20 < 0x7ffffffffffffff8) {
          if (uVar20 < 0x17) {
            uStack_1e8 = CONCAT17((char)uVar20,(undefined7)uStack_1e8);
            pppppppuVar6 = &pppppppuStack_1f8;
          }
          else {
            uVar15 = (uVar20 & 0xfffffffffffffff8) + 8;
            if ((uVar20 | 7) != 0x17) {
              uVar15 = uVar20 | 7;
            }
            pppppppuVar6 = (undefined8 *******)__Znwm(uVar15 + 1);
            uStack_1e8 = uVar15 + 1 | 0x8000000000000000;
            uStack_1f0 = uVar20;
            pppppppuStack_1f8 = pppppppuVar6;
          }
          if (puVar29 != puVar14) {
            _memcpy(pppppppuVar6,puVar29,uVar20);
            pppppppuVar6 = (undefined8 *******)((long)pppppppuVar6 + uVar20);
          }
          *(undefined1 *)pppppppuVar6 = 0;
          plVar11 = *(long **)(auVar44._0_8_ + 8);
          uVar20 = uStack_1f0;
          pppppppuVar6 = pppppppuStack_1f8;
          if (-1 < (long)uStack_1e8) {
            uVar20 = uStack_1e8 >> 0x38;
            pppppppuVar6 = &pppppppuStack_1f8;
          }
          (**(code **)(*plVar11 + 0x30))
                    (plVar11,pppppppuVar6,(undefined1 *)((long)pppppppuVar6 + uVar20));
          pppppppuVar6 = pppppppuStack_1f8;
          if (-1 < (long)uStack_1e8) {
            pppppppuVar6 = &pppppppuStack_1f8;
          }
          pppppppuVar6 = (undefined8 *******)__ZNSt3__115__get_classnameEPKcb(pppppppuVar6,in_x3);
          if ((long)uStack_1e8 < 0) {
            __ZdlPv(pppppppuStack_1f8);
          }
          return pppppppuVar6;
        }
        uVar7 = func_0x0001748c(&pppppppuStack_1f8);
        if ((long)uStack_1e8 < 0) {
          __ZdlPv(pppppppuStack_1f8);
        }
        auVar44 = __Unwind_Resume(uVar7);
        Var4 = auVar44._0_9_;
        uVar7 = auVar44._8_8_;
        lVar19 = auVar44._0_8_;
        puStack_208 = &DAT_000328e0;
        ppppppuStack_210 = &pppppuStack_1a0;
        if (*(char *)(lVar19 + 0xa9) == '\0') {
          puVar29 = *(undefined1 **)(lVar19 + 0x48);
          puVar28 = *(undefined1 **)(lVar19 + 0x50);
          uVar3 = auVar44[8];
          if (*(char *)(lVar19 + 0xaa) == '\0') {
            if (puVar28 <= puVar29) {
              puVar33 = *(undefined1 **)(lVar19 + 0x40);
              pppppppuVar6 = (undefined8 *******)(puVar29 + -(long)puVar33);
              puVar17 = (undefined1 *)((long)pppppppuVar6 + 1);
              if ((long)puVar17 < 0) goto code_r0x00032d68;
              puVar23 = (undefined1 *)(((long)puVar28 - (long)puVar33) * 2);
              if (puVar23 <= puVar17) {
                puVar23 = puVar17;
              }
              if (0x3ffffffffffffffe < (ulong)((long)puVar28 - (long)puVar33)) {
                puVar23 = (undefined1 *)0x7fffffffffffffff;
              }
              if (puVar23 == (undefined1 *)0x0) {
                pppppppuVar12 = (undefined8 *******)0x0;
                *(undefined1 *)pppppppuVar6 = uVar3;
                puVar23 = (undefined1 *)0x0;
                pppppppuVar9 = pppppppuVar6;
              }
              else {
                pppppppuVar12 = (undefined8 *******)__Znwm(puVar23);
                pppppppuVar9 = (undefined8 *******)((long)pppppppuVar12 + (long)pppppppuVar6);
                puVar23 = (undefined1 *)((long)pppppppuVar12 + (long)puVar23);
                *(undefined1 *)pppppppuVar9 = uVar3;
              }
              puVar28 = (undefined1 *)((long)pppppppuVar9 + 1);
              if (puVar29 == puVar33) goto code_r0x00032b38;
              puVar17 = puVar29;
              if (((undefined8 *******)((long)&MACH_HEADER.cputype + 3) < pppppppuVar6) &&
                 (0x3f < (ulong)((long)puVar33 - (long)pppppppuVar12))) {
                if ((undefined8 *******)((long)&segment_command_00000020.vmaddr + 7) < pppppppuVar6)
                {
                  pppppppuVar21 = (undefined8 *******)((ulong)pppppppuVar6 & 0xffffffffffffffc0);
                  puVar26 = (undefined8 *)(puVar29 + -0x20);
                  puVar18 = (undefined8 *)((long)pppppppuVar12 + ((long)puVar26 - (long)puVar33));
                  pppppppuVar24 = pppppppuVar21;
                  do {
                    uVar34 = *puVar26;
                    uVar8 = puVar26[3];
                    uVar7 = puVar26[2];
                    uVar42 = puVar26[-3];
                    uVar40 = puVar26[-4];
                    uVar38 = puVar26[-1];
                    uVar36 = puVar26[-2];
                    puVar18[1] = puVar26[1];
                    *puVar18 = uVar34;
                    puVar18[3] = uVar8;
                    puVar18[2] = uVar7;
                    puVar18[-3] = uVar42;
                    puVar18[-4] = uVar40;
                    puVar18[-1] = uVar38;
                    puVar18[-2] = uVar36;
                    puVar26 = puVar26 + -8;
                    puVar18 = puVar18 + -8;
                    pppppppuVar24 = pppppppuVar24 + -8;
                  } while (pppppppuVar24 != (undefined8 *******)0x0);
                  if (pppppppuVar6 == pppppppuVar21) goto code_r0x00032d34;
                  if (((ulong)pppppppuVar6 & 0x38) == 0) {
                    pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar21);
                    puVar17 = puVar29 + -(long)pppppppuVar21;
                    goto code_r0x00032d24;
                  }
                }
                else {
                  pppppppuVar21 = (undefined8 *******)0x0;
                }
                pppppppuVar24 = (undefined8 *******)((ulong)pppppppuVar6 & 0xfffffffffffffff8);
                puVar17 = puVar29 + -(long)pppppppuVar24;
                pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar24);
                lVar32 = (long)pppppppuVar21 - (long)pppppppuVar24;
                puVar18 = (undefined8 *)(puVar29 + (-8 - (long)pppppppuVar21));
                puVar26 = (undefined8 *)
                          ((long)pppppppuVar12 +
                          ((long)(puVar29 + (-8 - (long)pppppppuVar21)) - (long)puVar33));
                do {
                  *puVar26 = *puVar18;
                  lVar32 = lVar32 + 8;
                  puVar18 = puVar18 + -1;
                  puVar26 = puVar26 + -1;
                } while (lVar32 != 0);
                if (pppppppuVar6 == pppppppuVar24) goto code_r0x00032d34;
              }
code_r0x00032d24:
              do {
                pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 + -1);
                puVar17 = puVar17 + -1;
                *(undefined1 *)pppppppuVar9 = *puVar17;
              } while (puVar17 != puVar33);
              goto code_r0x00032d34;
            }
          }
          else if (puVar28 <= puVar29) {
            puVar33 = *(undefined1 **)(lVar19 + 0x40);
            pppppppuVar6 = (undefined8 *******)(puVar29 + -(long)puVar33);
            puVar17 = (undefined1 *)((long)pppppppuVar6 + 1);
            if ((long)puVar17 < 0) {
code_r0x00032d68:
              lVar25 = lVar19 + 0x40;
              auVar44 = func_0x00017f90(lVar25);
              puVar28 = auVar44._8_8_;
              puStack_258 = &DAT_00032d70;
              uVar20 = (long)puVar14 - (long)puVar28;
              puStack_290 = puVar33;
              lStack_288 = lVar32;
              uStack_280 = uVar7;
              puStack_278 = puVar29;
              lStack_270 = lVar25;
              lStack_268 = lVar19;
              pppppplStack_260 = (long ******)&ppppppuStack_210;
              if (uVar20 < 0x7ffffffffffffff8) {
                if (uVar20 < 0x17) {
                  uStack_298 = CONCAT17((char)uVar20,(undefined7)uStack_298);
                  pppppppuVar6 = &pppppppuStack_2a8;
                }
                else {
                  uVar15 = (uVar20 & 0xfffffffffffffff8) + 8;
                  if ((uVar20 | 7) != 0x17) {
                    uVar15 = uVar20 | 7;
                  }
                  pppppppuVar6 = (undefined8 *******)__Znwm(uVar15 + 1);
                  uStack_298 = uVar15 + 1 | 0x8000000000000000;
                  uStack_2a0 = uVar20;
                  pppppppuStack_2a8 = pppppppuVar6;
                }
                if (puVar28 == puVar14) {
                  pppppppuVar9 = pppppppuVar6;
                }
                else {
                  if ((0x3f < uVar20) && (0x3f < (ulong)((long)pppppppuVar6 - (long)puVar28))) {
                    uVar22 = uVar20 & 0xffffffffffffffc0;
                    pppppppuVar9 = (undefined8 *******)((long)pppppppuVar6 + uVar22);
                    pppppppuVar6 = pppppppuVar6 + 4;
                    puVar18 = (undefined8 *)(puVar28 + 0x20);
                    uVar15 = uVar22;
                    do {
                      ppppppuVar31 = (undefined8 ******)puVar18[-4];
                      ppppppuVar35 = (undefined8 ******)puVar18[-1];
                      ppppppuVar10 = (undefined8 ******)puVar18[-2];
                      ppppppuVar39 = (undefined8 ******)puVar18[1];
                      ppppppuVar37 = (undefined8 ******)*puVar18;
                      ppppppuVar43 = (undefined8 ******)puVar18[3];
                      ppppppuVar41 = (undefined8 ******)puVar18[2];
                      pppppppuVar6[-3] = (undefined8 ******)puVar18[-3];
                      pppppppuVar6[-4] = ppppppuVar31;
                      pppppppuVar6[-1] = ppppppuVar35;
                      pppppppuVar6[-2] = ppppppuVar10;
                      pppppppuVar6[1] = ppppppuVar39;
                      *pppppppuVar6 = ppppppuVar37;
                      pppppppuVar6[3] = ppppppuVar43;
                      pppppppuVar6[2] = ppppppuVar41;
                      uVar15 = uVar15 - 0x40;
                      pppppppuVar6 = pppppppuVar6 + 8;
                      puVar18 = puVar18 + 8;
                    } while (uVar15 != 0);
                    pppppppuVar6 = pppppppuVar9;
                    puVar28 = puVar28 + uVar22;
                    if (uVar20 == uVar22) goto code_r0x00032e64;
                  }
                  do {
                    puVar29 = puVar28 + 1;
                    *(undefined1 *)pppppppuVar6 = *puVar28;
                    pppppppuVar9 = (undefined8 *******)((long)pppppppuVar6 + 1);
                    pppppppuVar6 = (undefined8 *******)((long)pppppppuVar6 + 1);
                    puVar28 = puVar29;
                  } while (puVar29 != puVar14);
                }
code_r0x00032e64:
                *(undefined1 *)pppppppuVar9 = 0;
                plVar11 = *(long **)(auVar44._0_8_ + 0x10);
                uVar20 = uStack_2a0;
                pppppppuVar6 = pppppppuStack_2a8;
                if (-1 < (long)uStack_298) {
                  uVar20 = uStack_298 >> 0x38;
                  pppppppuVar6 = &pppppppuStack_2a8;
                }
                pppppppuVar6 = (undefined8 *******)
                               (**(code **)(*plVar11 + 0x20))
                                         (extraout_x8_01,plVar11,pppppppuVar6,
                                          (undefined1 *)((long)pppppppuVar6 + uVar20));
                if ((long)uStack_298 < 0) {
                  pppppppuVar6 = (undefined8 *******)__ZdlPv(pppppppuStack_2a8);
                  return pppppppuVar6;
                }
                return pppppppuVar6;
              }
              uVar7 = func_0x0001748c(&pppppppuStack_2a8);
              if ((long)uStack_298 < 0) {
                __ZdlPv(pppppppuStack_2a8);
              }
              __Unwind_Resume(uVar7);
              uVar7 = ___cxa_allocate_exception(0x18);
              __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar7,9);
              uVar8 = ___cxa_throw(uVar7,PTR___ZTINSt3__111regex_errorE_009b00f0,
                                   PTR___ZNSt3__111regex_errorD1Ev_009b0070);
              ___cxa_free_exception(uVar7);
              auVar44 = __Unwind_Resume(uVar8);
              puVar18 = auVar44._8_8_;
              plVar11 = auVar44._0_8_;
              lVar19 = plVar11[1] - *plVar11 >> 4;
              uVar20 = lVar19 * -0x5555555555555555 + 1;
              if (0x555555555555555 < uVar20) {
                func_0x00017f90(plVar11);
code_r0x000330f8:
                pppppppuVar6 = (undefined8 *******)func_0x00017514();
                *pppppppuVar6 = (undefined8 ******)&UNK_009b3050;
                if (pppppppuVar6[1] != (undefined8 ******)0x0) {
                  (*(code *)(*pppppppuVar6[1])[1])();
                }
                return pppppppuVar6;
              }
              lVar32 = plVar11[2] - *plVar11 >> 4;
              uVar15 = lVar32 * 0x5555555555555556;
              if (uVar15 <= uVar20) {
                uVar15 = uVar20;
              }
              if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar32 * -0x5555555555555555)) {
                uVar15 = 0x555555555555555;
              }
              if (uVar15 == 0) {
                lVar32 = 0;
              }
              else {
                if (0x555555555555555 < uVar15) goto code_r0x000330f8;
                lVar32 = __Znwm(uVar15 * 0x30);
              }
              puVar26 = (undefined8 *)(lVar32 + lVar19 * 0x10);
              puVar26[2] = puVar18[2];
              uVar7 = *puVar18;
              puVar26[1] = puVar18[1];
              *puVar26 = uVar7;
              lVar32 = lVar32 + uVar15 * 0x30;
              uVar7 = puVar18[3];
              puVar18[2] = 0;
              puVar18[3] = 0;
              *puVar18 = 0;
              puVar18[1] = 0;
              puVar26[4] = puVar18[4];
              puVar26[3] = uVar7;
              puVar26[5] = puVar18[5];
              puVar18[4] = 0;
              puVar18[5] = 0;
              pppppppuVar6 = (undefined8 *******)(puVar26 + 6);
              lVar19 = *plVar11;
              lVar25 = plVar11[1];
              if (lVar25 == lVar19) {
                *plVar11 = (long)puVar26;
                plVar11[1] = (long)pppppppuVar6;
                plVar11[2] = lVar32;
              }
              else {
                do {
                  uVar8 = *(undefined8 *)(lVar25 + -0x28);
                  uVar7 = *(undefined8 *)(lVar25 + -0x30);
                  puVar26[-4] = *(undefined8 *)(lVar25 + -0x20);
                  puVar26[-5] = uVar8;
                  puVar26[-6] = uVar7;
                  *(undefined8 *)(lVar25 + -0x28) = 0;
                  *(undefined8 *)(lVar25 + -0x20) = 0;
                  *(undefined8 *)(lVar25 + -0x30) = 0;
                  uVar8 = *(undefined8 *)(lVar25 + -0x10);
                  uVar7 = *(undefined8 *)(lVar25 + -0x18);
                  puVar26[-1] = *(undefined8 *)(lVar25 + -8);
                  puVar26[-2] = uVar8;
                  puVar26[-3] = uVar7;
                  puVar26 = puVar26 + -6;
                  *(undefined8 *)(lVar25 + -0x10) = 0;
                  *(undefined8 *)(lVar25 + -8) = 0;
                  *(undefined8 *)(lVar25 + -0x18) = 0;
                  lVar25 = lVar25 + -0x30;
                } while (lVar25 != lVar19);
                lVar19 = *plVar11;
                lVar30 = plVar11[1];
                *plVar11 = (long)puVar26;
                plVar11[1] = (long)pppppppuVar6;
                plVar11[2] = lVar32;
                lVar25 = lVar30;
                for (; lVar30 != lVar19; lVar30 = lVar30 + -0x30) {
                  lVar25 = lVar19;
                }
              }
              if (lVar25 != 0) {
                __ZdlPv(lVar25);
              }
              return pppppppuVar6;
            }
            puVar23 = (undefined1 *)(((long)puVar28 - (long)puVar33) * 2);
            if (puVar23 <= puVar17) {
              puVar23 = puVar17;
            }
            if (0x3ffffffffffffffe < (ulong)((long)puVar28 - (long)puVar33)) {
              puVar23 = (undefined1 *)0x7fffffffffffffff;
            }
            if (puVar23 == (undefined1 *)0x0) {
              pppppppuVar12 = (undefined8 *******)0x0;
              *(undefined1 *)pppppppuVar6 = uVar3;
              puVar23 = (undefined1 *)0x0;
              pppppppuVar9 = pppppppuVar6;
            }
            else {
              pppppppuVar12 = (undefined8 *******)__Znwm(puVar23);
              pppppppuVar9 = (undefined8 *******)((long)pppppppuVar12 + (long)pppppppuVar6);
              puVar23 = (undefined1 *)((long)pppppppuVar12 + (long)puVar23);
              *(undefined1 *)pppppppuVar9 = uVar3;
            }
            puVar28 = (undefined1 *)((long)pppppppuVar9 + 1);
            if (puVar29 != puVar33) {
              puVar17 = puVar29;
              if (((undefined8 *******)((long)&MACH_HEADER.cputype + 3) < pppppppuVar6) &&
                 (0x3f < (ulong)((long)puVar33 - (long)pppppppuVar12))) {
                if ((undefined8 *******)((long)&segment_command_00000020.vmaddr + 7) < pppppppuVar6)
                {
                  pppppppuVar21 = (undefined8 *******)((ulong)pppppppuVar6 & 0xffffffffffffffc0);
                  puVar26 = (undefined8 *)(puVar29 + -0x20);
                  puVar18 = (undefined8 *)((long)pppppppuVar12 + ((long)puVar26 - (long)puVar33));
                  pppppppuVar24 = pppppppuVar21;
                  do {
                    uVar34 = *puVar26;
                    uVar8 = puVar26[3];
                    uVar7 = puVar26[2];
                    uVar42 = puVar26[-3];
                    uVar40 = puVar26[-4];
                    uVar38 = puVar26[-1];
                    uVar36 = puVar26[-2];
                    puVar18[1] = puVar26[1];
                    *puVar18 = uVar34;
                    puVar18[3] = uVar8;
                    puVar18[2] = uVar7;
                    puVar18[-3] = uVar42;
                    puVar18[-4] = uVar40;
                    puVar18[-1] = uVar38;
                    puVar18[-2] = uVar36;
                    puVar26 = puVar26 + -8;
                    puVar18 = puVar18 + -8;
                    pppppppuVar24 = pppppppuVar24 + -8;
                  } while (pppppppuVar24 != (undefined8 *******)0x0);
                  if (pppppppuVar6 == pppppppuVar21) goto code_r0x00032d34;
                  if (((ulong)pppppppuVar6 & 0x38) == 0) {
                    pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar21);
                    puVar17 = puVar29 + -(long)pppppppuVar21;
                    goto code_r0x00032d04;
                  }
                }
                else {
                  pppppppuVar21 = (undefined8 *******)0x0;
                }
                pppppppuVar24 = (undefined8 *******)((ulong)pppppppuVar6 & 0xfffffffffffffff8);
                puVar17 = puVar29 + -(long)pppppppuVar24;
                pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar24);
                lVar32 = (long)pppppppuVar21 - (long)pppppppuVar24;
                puVar18 = (undefined8 *)(puVar29 + (-8 - (long)pppppppuVar21));
                puVar26 = (undefined8 *)
                          ((long)pppppppuVar12 +
                          ((long)(puVar29 + (-8 - (long)pppppppuVar21)) - (long)puVar33));
                do {
                  *puVar26 = *puVar18;
                  lVar32 = lVar32 + 8;
                  puVar18 = puVar18 + -1;
                  puVar26 = puVar26 + -1;
                } while (lVar32 != 0);
                if (pppppppuVar6 == pppppppuVar24) goto code_r0x00032d34;
              }
code_r0x00032d04:
              do {
                pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 + -1);
                puVar17 = puVar17 + -1;
                *(undefined1 *)pppppppuVar9 = *puVar17;
              } while (puVar17 != puVar33);
              goto code_r0x00032d34;
            }
code_r0x00032b38:
            *(undefined8 ********)(lVar19 + 0x40) = pppppppuVar9;
            *(undefined1 **)(lVar19 + 0x48) = puVar28;
            *(undefined1 **)(lVar19 + 0x50) = puVar23;
            pppppppuVar12 = pppppppuVar9;
            goto joined_r0x00032b44;
          }
        }
        else {
          uVar7 = (**(code **)(**(long **)(lVar19 + 0x18) + 0x28))(*(long **)(lVar19 + 0x18),uVar7);
          auVar44._8_8_ = uVar7;
          auVar44._0_8_ = uVar7;
          Var4 = auVar44._0_9_;
          puVar29 = *(undefined1 **)(lVar19 + 0x48);
          if (*(undefined1 **)(lVar19 + 0x50) <= puVar29) {
            puVar33 = *(undefined1 **)(lVar19 + 0x40);
            pppppppuVar6 = (undefined8 *******)(puVar29 + -(long)puVar33);
            puVar28 = (undefined1 *)((long)pppppppuVar6 + 1);
            if ((long)puVar28 < 0) goto code_r0x00032d68;
            uVar20 = (long)*(undefined1 **)(lVar19 + 0x50) - (long)puVar33;
            puVar23 = (undefined1 *)(uVar20 * 2);
            if (puVar23 <= puVar28) {
              puVar23 = puVar28;
            }
            if (0x3ffffffffffffffe < uVar20) {
              puVar23 = (undefined1 *)0x7fffffffffffffff;
            }
            if (puVar23 == (undefined1 *)0x0) {
              pppppppuVar12 = (undefined8 *******)0x0;
              *(char *)pppppppuVar6 = (char)uVar7;
              puVar23 = (undefined1 *)0x0;
              pppppppuVar9 = pppppppuVar6;
            }
            else {
              pppppppuVar12 = (undefined8 *******)__Znwm(puVar23);
              pppppppuVar9 = (undefined8 *******)((long)pppppppuVar12 + (long)pppppppuVar6);
              puVar23 = (undefined1 *)((long)pppppppuVar12 + (long)puVar23);
              *(char *)pppppppuVar9 = (char)uVar7;
            }
            puVar28 = (undefined1 *)((long)pppppppuVar9 + 1);
            if (puVar29 == puVar33) goto code_r0x00032b38;
            puVar17 = puVar29;
            if ((&MACH_HEADER.cpusubtype <= pppppppuVar6) &&
               (0x3f < (ulong)((long)puVar33 - (long)pppppppuVar12))) {
              if ((undefined8 *******)((long)&segment_command_00000020.vmaddr + 7) < pppppppuVar6) {
                pppppppuVar21 = (undefined8 *******)((ulong)pppppppuVar6 & 0xffffffffffffffc0);
                puVar26 = (undefined8 *)(puVar29 + -0x20);
                puVar18 = (undefined8 *)((long)pppppppuVar12 + ((long)puVar26 - (long)puVar33));
                pppppppuVar24 = pppppppuVar21;
                do {
                  uVar34 = *puVar26;
                  uVar8 = puVar26[3];
                  uVar7 = puVar26[2];
                  uVar42 = puVar26[-3];
                  uVar40 = puVar26[-4];
                  uVar38 = puVar26[-1];
                  uVar36 = puVar26[-2];
                  puVar18[1] = puVar26[1];
                  *puVar18 = uVar34;
                  puVar18[3] = uVar8;
                  puVar18[2] = uVar7;
                  puVar18[-3] = uVar42;
                  puVar18[-4] = uVar40;
                  puVar18[-1] = uVar38;
                  puVar18[-2] = uVar36;
                  puVar26 = puVar26 + -8;
                  puVar18 = puVar18 + -8;
                  pppppppuVar24 = pppppppuVar24 + -8;
                } while (pppppppuVar24 != (undefined8 *******)0x0);
                if (pppppppuVar6 == pppppppuVar21) goto code_r0x00032d34;
                if (((ulong)pppppppuVar6 & 0x38) == 0) {
                  pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar21);
                  puVar17 = puVar29 + -(long)pppppppuVar21;
                  goto code_r0x00032ce4;
                }
              }
              else {
                pppppppuVar21 = (undefined8 *******)0x0;
              }
              pppppppuVar24 = (undefined8 *******)((ulong)pppppppuVar6 & 0xfffffffffffffff8);
              puVar17 = puVar29 + -(long)pppppppuVar24;
              pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 - (long)pppppppuVar24);
              lVar32 = (long)pppppppuVar21 - (long)pppppppuVar24;
              puVar18 = (undefined8 *)(puVar29 + (-8 - (long)pppppppuVar21));
              puVar26 = (undefined8 *)
                        ((long)pppppppuVar12 +
                        ((long)(puVar29 + (-8 - (long)pppppppuVar21)) - (long)puVar33));
              do {
                *puVar26 = *puVar18;
                lVar32 = lVar32 + 8;
                puVar18 = puVar18 + -1;
                puVar26 = puVar26 + -1;
              } while (lVar32 != 0);
              if (pppppppuVar6 == pppppppuVar24) goto code_r0x00032d34;
            }
code_r0x00032ce4:
            do {
              pppppppuVar9 = (undefined8 *******)((long)pppppppuVar9 + -1);
              puVar17 = puVar17 + -1;
              *(undefined1 *)pppppppuVar9 = *puVar17;
            } while (puVar17 != puVar33);
code_r0x00032d34:
            puVar29 = *(undefined1 **)(lVar19 + 0x40);
            *(undefined8 ********)(lVar19 + 0x40) = pppppppuVar12;
            *(undefined1 **)(lVar19 + 0x48) = puVar28;
            *(undefined1 **)(lVar19 + 0x50) = puVar23;
joined_r0x00032b44:
            if (puVar29 != (undefined1 *)0x0) {
              pppppppuVar12 = (undefined8 *******)__ZdlPv(puVar29);
            }
            goto code_r0x00032d4c;
          }
        }
        pppppppuVar12 = (undefined8 *******)Var4;
        puVar28 = puVar29 + 1;
        *puVar29 = (char)((unkuint9)Var4 >> 0x40);
code_r0x00032d4c:
        *(undefined1 **)(lVar19 + 0x48) = puVar28;
        return pppppppuVar12;
      }
      plStack_148 = plVar11 + 2;
      lVar25 = *plStack_148 - (long)puVar18 >> 3;
      uVar15 = lVar25 * 0x5555555555555556;
      if (uVar15 <= uVar20) {
        uVar15 = uVar20;
      }
      if (0x555555555555554 < (ulong)(lVar25 * -0x5555555555555555)) {
        uVar15 = 0xaaaaaaaaaaaaaaa;
      }
      if (uVar15 == 0) {
        puStack_168 = (undefined8 *)0x0;
      }
      else {
        if (0xaaaaaaaaaaaaaaa < uVar15) goto code_r0x00032734;
        puStack_168 = (undefined8 *)__Znwm(uVar15 * 0x18);
      }
      puStack_160 = puStack_168 + lVar19;
      puStack_150 = puStack_168 + uVar15 * 3;
      puStack_158 = puStack_160;
      if (*(char *)((long)puVar13 + 0x17) < '\0') {
        func_0x00017634(puStack_160,*puVar13,puVar13[1]);
        puVar18 = (undefined8 *)*plVar11;
        puVar26 = (undefined8 *)plVar11[1];
        pppppppuVar6 = (undefined8 *******)(puStack_158 + 3);
        if (puVar26 != puVar18) goto code_r0x00032678;
      }
      else {
        uVar7 = *puVar13;
        puStack_160[1] = puVar13[1];
        *puStack_160 = uVar7;
        puStack_160[2] = puVar13[2];
        pppppppuVar6 = (undefined8 *******)(puStack_160 + 3);
        if (puVar26 != puVar18) {
code_r0x00032678:
          do {
            uVar8 = puVar26[-2];
            uVar7 = puVar26[-3];
            puStack_160[-1] = puVar26[-1];
            puStack_160[-2] = uVar8;
            puStack_160[-3] = uVar7;
            puStack_160 = puStack_160 + -3;
            puVar26[-2] = 0;
            puVar26[-1] = 0;
            puVar26[-3] = 0;
            puVar26 = puVar26 + -3;
          } while (puVar26 != puVar18);
          puVar26 = (undefined8 *)*plVar11;
          puVar18 = (undefined8 *)plVar11[1];
          goto code_r0x000326b0;
        }
      }
      puVar26 = puVar18;
code_r0x000326b0:
      *plVar11 = (long)puStack_160;
      plVar11[1] = (long)pppppppuVar6;
      lVar19 = plVar11[2];
      plVar11[2] = (long)puStack_150;
      puStack_168 = puVar26;
      puStack_160 = puVar26;
      puStack_150 = (undefined8 *)lVar19;
      if (puVar18 != puVar26) {
        do {
          puVar13 = puVar18 + -3;
          puStack_158 = puVar13;
          if (*(char *)((long)puVar18 + -1) < '\0') {
            __ZdlPv(*puVar13);
          }
          puVar18 = puVar13;
        } while (puVar13 != puVar26);
        puVar18 = puVar26;
      }
      if (puVar18 != (undefined8 *)0x0) {
        __ZdlPv(puVar18);
      }
      return pppppppuVar6;
    }
    pppppppuVar6 = (undefined8 *******)__Znwm(uVar20 << 1);
    puVar16 = (undefined2 *)((long)pppppppuVar6 + unaff_x25 * 2);
    lVar19 = (long)pppppppuVar6 + uVar20 * 2;
    *puVar16 = unaff_w22;
  }
  puVar5 = puVar16 + 1;
  if ((long)unaff_x21 - (long)unaff_x23 == 0) goto LAB_00032068;
  uVar20 = ((long)unaff_x21 - (long)unaff_x23) - 2;
  puVar27 = unaff_x21;
  if ((uVar20 < 0x3e) ||
     ((long)unaff_x21 - ((unaff_x26 & 0xfffffffffffffffe) + (long)pppppppuVar6) < 0x40)) {
LAB_00031fb0:
    do {
      puVar27 = puVar27 + -1;
      puVar16 = puVar16 + -1;
      *puVar16 = *puVar27;
    } while (puVar27 != unaff_x23);
  }
  else {
    uVar20 = (uVar20 >> 1) + 1;
    uVar22 = uVar20 & 0xffffffffffffffe0;
    puVar27 = unaff_x21 + -uVar22;
    puVar16 = puVar16 + -uVar22;
    puVar18 = (undefined8 *)(unaff_x21 + -0x10);
    puVar26 = (undefined8 *)((long)pppppppuVar6 + unaff_x25 * 2 + -0x20);
    uVar15 = uVar22;
    do {
      uVar34 = *puVar18;
      uVar8 = puVar18[3];
      uVar7 = puVar18[2];
      uVar42 = puVar18[-3];
      uVar40 = puVar18[-4];
      uVar38 = puVar18[-1];
      uVar36 = puVar18[-2];
      puVar26[1] = puVar18[1];
      *puVar26 = uVar34;
      puVar26[3] = uVar8;
      puVar26[2] = uVar7;
      puVar26[-3] = uVar42;
      puVar26[-4] = uVar40;
      puVar26[-1] = uVar38;
      puVar26[-2] = uVar36;
      puVar18 = puVar18 + -8;
      puVar26 = puVar26 + -8;
      uVar15 = uVar15 - 0x20;
    } while (uVar15 != 0);
    if (uVar20 != uVar22) goto LAB_00031fb0;
  }
  unaff_x21 = (undefined2 *)*unaff_x20;
LAB_00032068:
  *(undefined2 **)(unaff_x19 + 0x70) = puVar16;
  *(undefined2 **)(unaff_x19 + 0x78) = puVar5;
  *(long *)(unaff_x19 + 0x80) = lVar19;
  if (unaff_x21 != (undefined2 *)0x0) {
    pppppppuVar6 = (undefined8 *******)__ZdlPv(unaff_x21);
  }
  *(undefined2 **)(unaff_x19 + 0x78) = puVar5;
  return pppppppuVar6;
}


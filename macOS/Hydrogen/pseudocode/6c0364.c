
/* WARNING: Removing unreachable block (ram,0x006c0520) */
/* WARNING: Removing unreachable block (ram,0x006c0534) */
/* WARNING: Removing unreachable block (ram,0x006c05a4) */

void FUN_006c0364(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  long *plVar1;
  ulong *puVar2;
  ulong *puVar3;
  undefined2 uVar4;
  code *pcVar5;
  int iVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  ulong uVar14;
  long in_x9;
  long lVar15;
  long *plVar16;
  long lVar17;
  ulong *puVar18;
  long lVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  byte bVar22;
  byte bVar23;
  long lVar24;
  bool bVar25;
  undefined8 *puVar26;
  undefined8 *puVar27;
  ulong uVar28;
  ulong uVar29;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *puVar30;
  long *plVar31;
  ulong uVar32;
  ulong *puVar33;
  undefined8 *puVar34;
  long *plVar35;
  ulong uVar36;
  long lVar37;
  long *plVar38;
  ulong *puVar39;
  long unaff_x25;
  ulong *puVar40;
  ulong unaff_x26;
  long lVar41;
  ulong unaff_x28;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  long in_stack_00000008;
  undefined1 uStack_130;
  undefined1 uStack_12f;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  ulong uStack_110;
  long lStack_108;
  ulong *puStack_100;
  long lStack_f8;
  undefined8 *puStack_f0;
  undefined8 *puStack_e8;
  undefined8 *puStack_e0;
  ulong *puStack_d8;
  long **pplStack_d0;
  undefined *puStack_c8;
  ulong *puStack_c0;
  ulong *puStack_b8;
  ulong *puStack_b0;
  ulong uStack_a8;
  undefined8 uStack_a0;
  undefined8 *puStack_98;
  long *plStack_90;
  undefined *puStack_88;
  undefined4 uStack_7c;
  undefined8 *puStack_78;
  undefined8 *puStack_70;
  undefined8 uStack_68;
  ulong uStack_60;
  long lStack_58;
  
  lVar37 = param_1 - in_x9 >> 3;
  plVar31 = (long *)unaff_x19[0x9e];
  if (plVar31 < (long *)unaff_x19[0x9f]) {
    *plVar31 = lVar37;
    plVar31[1] = lVar37;
    plVar38 = plVar31 + 3;
    plVar31[2] = 0;
    goto LAB_006c0464;
  }
  puVar33 = unaff_x19 + 0x9d;
  plVar35 = (long *)*puVar33;
  lVar24 = (long)plVar31 - (long)plVar35 >> 3;
  lVar41 = lVar24 * -0x5555555555555555;
  uVar9 = lVar41 + 1;
  if (uVar9 < 0xaaaaaaaaaaaaaab) {
    lVar15 = (long)unaff_x19[0x9f] - (long)plVar35 >> 3;
    unaff_x28 = lVar15 * 0x5555555555555556;
    if (unaff_x28 <= uVar9) {
      unaff_x28 = uVar9;
    }
    if (0x555555555555554 < (ulong)(lVar15 * -0x5555555555555555)) {
      unaff_x28 = 0xaaaaaaaaaaaaaaa;
    }
    if (unaff_x28 == 0) {
      lVar41 = 0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < unaff_x28) goto LAB_006c05e8;
      lVar41 = __Znwm(unaff_x28 * 0x18);
    }
    plVar16 = (long *)(lVar41 + lVar24 * 8);
    *plVar16 = lVar37;
    plVar16[1] = lVar37;
    plVar16[2] = 0;
    plVar38 = plVar16 + 3;
    if (plVar31 != plVar35) {
      do {
        lVar24 = plVar31[-2];
        lVar37 = plVar31[-3];
        plVar1 = plVar31 + -1;
        plVar31 = plVar31 + -3;
        plVar16[-1] = *plVar1;
        plVar16[-2] = lVar24;
        plVar16[-3] = lVar37;
        plVar16 = plVar16 + -3;
      } while (plVar31 != plVar35);
      plVar31 = (long *)*puVar33;
    }
    unaff_x19[0x9d] = plVar16;
    unaff_x19[0x9e] = plVar38;
    unaff_x19[0x9f] = lVar41 + unaff_x28 * 0x18;
    if (plVar31 != (long *)0x0) {
      __ZdlPv(plVar31);
    }
LAB_006c0464:
    unaff_x19[0x9e] = plVar38;
    *(undefined1 *)(unaff_x19 + 0x93) = 1;
    uVar7 = func_0x006b2784(*unaff_x19);
    func_0x006c526c();
    func_0x006bed0c();
    func_0x006b2784(*unaff_x19);
    uVar8 = func_0x006b2784(*unaff_x19);
    if (0 < *(int *)((long)unaff_x19 + 0xc)) {
      func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(unaff_x20 + 0x20) + 0xc) + 1);
    }
    func_0x006b1f78(*unaff_x19,0x18,0,0);
    func_0x006b2784(*unaff_x19);
    uVar9 = func_0x006b2794(*unaff_x19,uVar8,uVar7);
    if ((uVar9 & 1) == 0) {
      func_0x006bc388(unaff_x20 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x6c05e0);
      (*pcVar5)();
    }
    uVar32 = (long)(unaff_x25 - unaff_x26) >> 4;
    func_0x006cb1e0();
    uVar9 = (long)(unaff_x19[0x9b] - unaff_x19[0x9a]) >> 4;
    if (uVar32 < uVar9 || uVar32 - uVar9 == 0) {
      if (uVar32 < uVar9) {
        unaff_x19[0x9b] = unaff_x19[0x9a] + uVar32 * 0x10;
      }
    }
    else {
      func_0x006cb2a8(unaff_x19 + 0x9a,uVar32 - uVar9);
    }
    unaff_x19[0x9e] = unaff_x19[0x9e] + -0x18;
    return;
  }
  func_0x00017f90(puVar33);
LAB_006c05e8:
  uVar7 = func_0x00017514();
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  auVar44 = __Unwind_Resume(uVar7);
  lVar37 = auVar44._8_8_;
  puVar26 = auVar44._0_8_;
  plVar31 = (long *)((long)register0x00000008 + -0x10);
  lVar15 = puVar26[0x9b];
  lVar24 = puVar26[0x9a];
  uVar9 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
  puVar33 = (ulong *)puVar26[0x9e];
  uStack_60 = unaff_x28;
  lStack_58 = lVar41;
  if (puVar33 < (ulong *)puVar26[0x9f]) {
    *puVar33 = uVar9;
    puVar33[1] = uVar9;
    puVar40 = puVar33 + 3;
    puVar33[2] = 0;
    goto LAB_006c0750;
  }
  puVar3 = puVar26 + 0x9d;
  puVar39 = (ulong *)*puVar3;
  lVar41 = (long)puVar33 - (long)puVar39 >> 3;
  lVar19 = lVar41 * -0x5555555555555555;
  uVar32 = lVar19 + 1;
  if (uVar32 < 0xaaaaaaaaaaaaaab) {
    lVar17 = (long)puVar26[0x9f] - (long)puVar39 >> 3;
    unaff_x26 = lVar17 * 0x5555555555555556;
    if (unaff_x26 <= uVar32) {
      unaff_x26 = uVar32;
    }
    if (0x555555555555554 < (ulong)(lVar17 * -0x5555555555555555)) {
      unaff_x26 = 0xaaaaaaaaaaaaaaa;
    }
    if (unaff_x26 == 0) {
      lVar19 = 0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < unaff_x26) goto LAB_006c0d8c;
      lVar19 = __Znwm(unaff_x26 * 0x18);
    }
    puVar18 = (ulong *)(lVar19 + lVar41 * 8);
    *puVar18 = uVar9;
    puVar18[1] = uVar9;
    puVar18[2] = 0;
    puVar40 = puVar18 + 3;
    if (puVar33 != puVar39) {
      do {
        uVar36 = puVar33[-2];
        uVar32 = puVar33[-3];
        puVar2 = puVar33 + -1;
        puVar33 = puVar33 + -3;
        puVar18[-1] = *puVar2;
        puVar18[-2] = uVar36;
        puVar18[-3] = uVar32;
        puVar18 = puVar18 + -3;
      } while (puVar33 != puVar39);
      puVar33 = (ulong *)*puVar3;
    }
    puVar26[0x9d] = puVar18;
    puVar26[0x9e] = puVar40;
    puVar26[0x9f] = lVar19 + unaff_x26 * 0x18;
    if (puVar33 != (ulong *)0x0) {
      __ZdlPv(puVar33);
    }
LAB_006c0750:
    puVar26[0x9e] = puVar40;
    *(undefined1 *)(puVar26 + 0x93) = 1;
    uVar7 = func_0x006b2784(*puVar26);
    lVar41 = *(long *)(lVar37 + 0x28);
    uStack_7c = *(undefined4 *)((long)puVar26 + 0x484);
    if (*(long *)(lVar41 + 0x28) != 0) {
      bVar25 = false;
      uVar36 = 0;
      uVar32 = 0;
      do {
        while( true ) {
          func_0x006bed0c(puVar26,*(undefined8 *)(*(long *)(lVar41 + 0x20) + uVar32 * 8));
          lVar19 = puVar26[0x9e];
          *(long *)(lVar19 + -0x10) = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
          lVar19 = *(long *)(lVar19 + -8);
          if (lVar19 == 0 || bVar25) break;
          uVar32 = uVar32 + 1;
          func_0x006cb3d0(puVar26,lVar19,*(undefined8 *)(lVar37 + 0x20),lVar41,uVar32);
          uVar36 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
          bVar25 = true;
          uVar14 = *(ulong *)(lVar41 + 0x28);
          if (uVar14 <= uVar32) goto code_r0x006c0810;
        }
        uVar32 = uVar32 + 1;
        uVar14 = *(ulong *)(lVar41 + 0x28);
      } while (uVar32 < uVar14);
code_r0x006c0810:
      if (bVar25) {
        if (0 < *(int *)((long)puVar26 + 0xc)) {
          func_0x006b2e98(*puVar26,*(int *)(*(long *)(*(long *)(lVar41 + 0x20) + uVar14 * 8 + -8) +
                                           0x14) + 1);
        }
        uVar32 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
        if ((uVar36 < uVar32) && (puVar26[0x13] != 0)) {
          bVar25 = false;
          uVar14 = uVar36;
          bVar22 = 0xff;
code_r0x006c0870:
          do {
            uVar28 = *(ulong *)(puVar26[0x94] + uVar14 * 8);
            if (uVar28 != puVar26[0x14]) {
              uVar29 = 0;
              uVar13 = uVar28 >> 4 ^ uVar28 >> 9;
              do {
                uVar13 = uVar13 & puVar26[0x12] - 1;
                puVar33 = (ulong *)(puVar26[0x11] + uVar13 * 0x18);
                if (*puVar33 == uVar28) goto code_r0x006c08c0;
                if (*puVar33 == puVar26[0x14]) break;
                uVar29 = uVar29 + 1;
                uVar13 = uVar29 + uVar13;
              } while (uVar29 <= puVar26[0x12] - 1);
            }
            puVar33 = (ulong *)0x0;
code_r0x006c08c0:
            puVar40 = (ulong *)0x0;
            if (puVar33 != (ulong *)0x0) {
              puVar40 = puVar33 + 1;
            }
            if (*(byte *)((long)puVar40 + 2) == 0) {
              uVar14 = uVar14 + 1;
              if (uVar14 == uVar32) {
                bVar23 = bVar22;
                if (!bVar25) goto code_r0x006c0924;
                break;
              }
              goto code_r0x006c0870;
            }
            bVar23 = (byte)*puVar40;
            if (bVar22 <= (byte)*puVar40) {
              bVar23 = bVar22;
            }
            uVar14 = uVar14 + 1;
            bVar25 = true;
            bVar22 = bVar23;
          } while (uVar14 != uVar32);
          func_0x006b1ccc(*puVar26,0xb,bVar23,0,0);
        }
code_r0x006c0924:
        func_0x006bf744(puVar26,uVar36);
      }
    }
    uVar8 = func_0x006b2784(*puVar26);
    if (0 < *(int *)((long)puVar26 + 0xc)) {
      func_0x006b2e98(*puVar26,*(int *)(*(long *)(lVar37 + 0x20) + 0xc) + 1);
    }
    iVar6 = func_0x006cae38(puVar26,*(undefined8 *)(lVar37 + 0x20));
    if (iVar6 == 0) {
      puStack_78 = (undefined8 *)0x0;
      puStack_70 = (undefined8 *)0x0;
      uStack_68 = 0;
      func_0x006c526c(puVar26,*(undefined8 *)(lVar37 + 0x20),0,&puStack_78,1);
      uVar32 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
      if ((uVar9 < uVar32) && (puVar26[0x13] != 0)) {
        bVar25 = false;
        uVar36 = uVar9;
        bVar22 = 0xff;
code_r0x006c0a8c:
        do {
          uVar14 = *(ulong *)(puVar26[0x94] + uVar36 * 8);
          if (uVar14 != puVar26[0x14]) {
            uVar28 = 0;
            uVar29 = uVar14 >> 4 ^ uVar14 >> 9;
            do {
              uVar29 = uVar29 & puVar26[0x12] - 1;
              puVar33 = (ulong *)(puVar26[0x11] + uVar29 * 0x18);
              if (*puVar33 == uVar14) goto code_r0x006c0adc;
              if (*puVar33 == puVar26[0x14]) break;
              uVar28 = uVar28 + 1;
              uVar29 = uVar28 + uVar29;
            } while (uVar28 <= puVar26[0x12] - 1);
          }
          puVar33 = (ulong *)0x0;
code_r0x006c0adc:
          puVar40 = (ulong *)0x0;
          if (puVar33 != (ulong *)0x0) {
            puVar40 = puVar33 + 1;
          }
          if (*(byte *)((long)puVar40 + 2) == 0) {
            uVar36 = uVar36 + 1;
            if (uVar36 == uVar32) {
              bVar23 = bVar22;
              if (!bVar25) goto code_r0x006c0b6c;
              break;
            }
            goto code_r0x006c0a8c;
          }
          bVar23 = (byte)*puVar40;
          if (bVar22 <= (byte)*puVar40) {
            bVar23 = bVar22;
          }
          uVar36 = uVar36 + 1;
          bVar25 = true;
          bVar22 = bVar23;
        } while (uVar36 != uVar32);
        func_0x006b1ccc(*puVar26,0xb,bVar23,0,0);
      }
code_r0x006c0b6c:
      uVar11 = func_0x006b2784(*puVar26);
      func_0x006b1f78(*puVar26,0x18,0,0);
      uVar12 = func_0x006b2784(*puVar26);
      uVar32 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
      if ((uVar9 < uVar32) && (puVar26[0x13] != 0)) {
        bVar25 = false;
        uVar36 = uVar9;
        bVar22 = 0xff;
code_r0x006c0bcc:
        do {
          uVar14 = *(ulong *)(puVar26[0x94] + uVar36 * 8);
          if (uVar14 != puVar26[0x14]) {
            uVar28 = 0;
            uVar29 = uVar14 >> 4 ^ uVar14 >> 9;
            do {
              uVar29 = uVar29 & puVar26[0x12] - 1;
              puVar33 = (ulong *)(puVar26[0x11] + uVar29 * 0x18);
              if (*puVar33 == uVar14) goto code_r0x006c0c1c;
              if (*puVar33 == puVar26[0x14]) break;
              uVar28 = uVar28 + 1;
              uVar29 = uVar28 + uVar29;
            } while (uVar28 <= puVar26[0x12] - 1);
          }
          puVar33 = (ulong *)0x0;
code_r0x006c0c1c:
          puVar40 = (ulong *)0x0;
          if (puVar33 != (ulong *)0x0) {
            puVar40 = puVar33 + 1;
          }
          if (*(byte *)((long)puVar40 + 2) == 0) {
            uVar36 = uVar36 + 1;
            if (uVar36 == uVar32) {
              bVar23 = bVar22;
              if (!bVar25) goto code_r0x006c0c80;
              break;
            }
            goto code_r0x006c0bcc;
          }
          bVar23 = (byte)*puVar40;
          if (bVar22 <= (byte)*puVar40) {
            bVar23 = bVar22;
          }
          uVar36 = uVar36 + 1;
          bVar25 = true;
          bVar22 = bVar23;
        } while (uVar36 != uVar32);
        func_0x006b1ccc(*puVar26,0xb,bVar23,0,0);
      }
code_r0x006c0c80:
      uVar10 = func_0x006b2784(*puVar26);
      uVar32 = func_0x006b2794(*puVar26,uVar11,uVar7);
      puVar21 = puStack_70;
      puVar30 = puStack_78;
      if ((uVar32 & 1) == 0) {
code_r0x006c0d70:
        func_0x006bc388(lVar37 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x6c0d84);
        (*pcVar5)();
      }
      for (; puVar30 != puVar21; puVar30 = puVar30 + 1) {
        uVar32 = func_0x006b2794(*puVar26,*puVar30,uVar12);
        if ((uVar32 & 1) == 0) goto code_r0x006c0d70;
      }
      if (puStack_78 != (undefined8 *)0x0) {
        puStack_70 = puStack_78;
        __ZdlPv(puStack_78);
      }
    }
    else {
      uVar32 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
      if ((uVar9 < uVar32) && (puVar26[0x13] != 0)) {
        bVar25 = false;
        uVar36 = uVar9;
        bVar22 = 0xff;
code_r0x006c09a0:
        do {
          uVar14 = *(ulong *)(puVar26[0x94] + uVar36 * 8);
          if (uVar14 != puVar26[0x14]) {
            uVar28 = 0;
            uVar29 = uVar14 >> 4 ^ uVar14 >> 9;
            do {
              uVar29 = uVar29 & puVar26[0x12] - 1;
              puVar33 = (ulong *)(puVar26[0x11] + uVar29 * 0x18);
              if (*puVar33 == uVar14) goto code_r0x006c09f0;
              if (*puVar33 == puVar26[0x14]) break;
              uVar28 = uVar28 + 1;
              uVar29 = uVar28 + uVar29;
            } while (uVar28 <= puVar26[0x12] - 1);
          }
          puVar33 = (ulong *)0x0;
code_r0x006c09f0:
          puVar40 = (ulong *)0x0;
          if (puVar33 != (ulong *)0x0) {
            puVar40 = puVar33 + 1;
          }
          if (*(byte *)((long)puVar40 + 2) == 0) {
            uVar36 = uVar36 + 1;
            if (uVar36 == uVar32) {
              bVar23 = bVar22;
              if (!bVar25) goto code_r0x006c0b40;
              break;
            }
            goto code_r0x006c09a0;
          }
          bVar23 = (byte)*puVar40;
          if (bVar22 <= (byte)*puVar40) {
            bVar23 = bVar22;
          }
          uVar36 = uVar36 + 1;
          bVar25 = true;
          bVar22 = bVar23;
        } while (uVar36 != uVar32);
        func_0x006b1ccc(*puVar26,0xb,bVar23,0,0);
      }
code_r0x006c0b40:
      uVar10 = func_0x006b2784(*puVar26);
    }
    func_0x006bf744(puVar26,uVar9);
    uVar32 = lVar15 - lVar24 >> 4;
    func_0x006cb1e0(puVar26,lVar37,uVar32,uVar10,uVar8);
    uVar9 = (long)(puVar26[0x9b] - puVar26[0x9a]) >> 4;
    if (uVar32 < uVar9 || uVar32 - uVar9 == 0) {
      if (uVar32 < uVar9) {
        puVar26[0x9b] = puVar26[0x9a] + uVar32 * 0x10;
      }
    }
    else {
      func_0x006cb2a8(puVar26 + 0x9a,uVar32 - uVar9);
    }
    puVar26[0x9e] = puVar26[0x9e] + -0x18;
    *(undefined4 *)((long)puVar26 + 0x484) = uStack_7c;
    return;
  }
  func_0x00017f90(puVar3);
LAB_006c0d8c:
  uVar7 = func_0x00017514();
  *(undefined4 *)((long)puVar26 + 0x484) = uStack_7c;
  auVar44 = __Unwind_Resume(uVar7);
  puVar21 = auVar44._8_8_;
  puVar40 = auVar44._0_8_;
  puStack_88 = &DAT_006c0de0;
  puVar30 = (undefined8 *)puVar40[1];
  if (puVar30 < (undefined8 *)puVar40[2]) {
    uVar7 = *puVar21;
    puVar30[1] = puVar21[1];
    *puVar30 = uVar7;
    puVar26 = puVar30 + 2;
    goto code_r0x006c0e14;
  }
  puVar34 = (undefined8 *)*puVar40;
  lVar37 = (long)puVar30 - (long)puVar34 >> 4;
  puVar18 = (ulong *)(lVar37 + 1);
  puStack_c0 = puVar39;
  puStack_b8 = puVar3;
  puStack_b0 = puVar33;
  uStack_a8 = uVar9;
  uStack_a0 = uVar7;
  puStack_98 = puVar26;
  plStack_90 = plVar31;
  if ((ulong)puVar18 >> 0x3c == 0) {
    uVar9 = (long)puVar40[2] - (long)puVar34;
    puVar33 = (ulong *)((long)uVar9 >> 3);
    if (puVar33 <= puVar18) {
      puVar33 = puVar18;
    }
    if (0x7fffffffffffffef < uVar9) {
      puVar33 = (ulong *)0xfffffffffffffff;
    }
    if (puVar33 == (ulong *)0x0) {
      lVar24 = 0;
    }
    else {
      puStack_100 = puVar33;
      if ((ulong)puVar33 >> 0x3c != 0) goto code_r0x006c0ef0;
      lVar24 = __Znwm((long)puVar33 << 4);
    }
    puVar20 = (undefined8 *)(lVar24 + lVar37 * 0x10);
    uVar7 = *puVar21;
    puVar20[1] = puVar21[1];
    *puVar20 = uVar7;
    puVar26 = puVar20 + 2;
    if (puVar30 != puVar34) {
      do {
        puVar21 = puVar30 + -1;
        uVar7 = puVar30[-2];
        puVar30 = puVar30 + -2;
        puVar20[-1] = *puVar21;
        puVar20[-2] = uVar7;
        puVar20 = puVar20 + -2;
      } while (puVar30 != puVar34);
      puVar30 = (undefined8 *)*puVar40;
    }
    *puVar40 = (ulong)puVar20;
    puVar40[1] = (ulong)puVar26;
    puVar40[2] = lVar24 + (long)puVar33 * 0x10;
    if (puVar30 != (undefined8 *)0x0) {
      __ZdlPv(puVar30);
      puVar40[1] = (ulong)puVar26;
      return;
    }
code_r0x006c0e14:
    puVar40[1] = (ulong)puVar26;
    return;
  }
  func_0x00017f90(puVar40);
  puStack_100 = puVar39;
code_r0x006c0ef0:
  auVar45 = func_0x00017514();
  puVar26 = auVar45._0_8_;
  puStack_c8 = &DAT_006c0ef4;
  uStack_110 = unaff_x26;
  lStack_108 = lVar19;
  lStack_f8 = lVar37;
  puStack_f0 = puVar34;
  puStack_e0 = puVar30;
  pplStack_d0 = &plStack_90;
  if (0 < *(int *)((long)puVar26 + 0xc)) {
    puStack_e8 = puVar21;
    puStack_d8 = puVar40;
    func_0x006b2e98(*puVar26,*(int *)(auVar45._8_8_ + 0xc) + 1);
    auVar44._8_8_ = puStack_e8;
    auVar44._0_8_ = puStack_d8;
  }
  puStack_e8 = auVar44._8_8_;
  puStack_d8 = auVar44._0_8_;
  lVar24 = puVar26[0xa1];
  uVar4 = *(undefined2 *)(lVar24 + -0x20);
  uVar9 = *(ulong *)(lVar24 + -0x28);
  uStack_120 = 0;
  uStack_118 = 0;
  uStack_128 = 0;
  lVar37 = *(long *)(lVar24 + -0x18);
  lVar24 = *(long *)(lVar24 + -0x10) - lVar37;
  if (lVar24 == 0) {
    lVar41 = 0;
  }
  else {
    if (lVar24 < 0) {
      func_0x00017f90(&uStack_128);
      goto code_r0x006c1398;
    }
    lVar41 = __Znwm(lVar24);
    _memcpy(lVar41,lVar37,lVar24);
    auVar44._8_8_ = puStack_e8;
    auVar44._0_8_ = puStack_d8;
  }
  puStack_e8 = auVar44._8_8_;
  puStack_d8 = auVar44._0_8_;
  uStack_130 = (undefined1)uVar4;
  uStack_12f = (undefined1)((ushort)uVar4 >> 8);
  func_0x006cba58(puVar26,auVar45._8_8_ + 0x20,uStack_130,uStack_12f,0);
  uVar32 = (long)(puVar26[0x95] - puVar26[0x94]) >> 3;
  if ((uVar9 < uVar32) && (puVar26[0x13] != 0)) {
    bVar25 = false;
    bVar22 = 0xff;
code_r0x006c0fd0:
    do {
      uVar36 = *(ulong *)(puVar26[0x94] + uVar9 * 8);
      if (uVar36 != puVar26[0x14]) {
        uVar14 = 0;
        uVar28 = uVar36 >> 4 ^ uVar36 >> 9;
        do {
          uVar28 = uVar28 & puVar26[0x12] - 1;
          puVar33 = (ulong *)(puVar26[0x11] + uVar28 * 0x18);
          if (*puVar33 == uVar36) goto code_r0x006c1020;
          if (*puVar33 == puVar26[0x14]) break;
          uVar14 = uVar14 + 1;
          uVar28 = uVar14 + uVar28;
        } while (uVar14 <= puVar26[0x12] - 1);
      }
      puVar33 = (ulong *)0x0;
code_r0x006c1020:
      puVar40 = (ulong *)0x0;
      if (puVar33 != (ulong *)0x0) {
        puVar40 = puVar33 + 1;
      }
      if (*(byte *)((long)puVar40 + 2) == 0) {
        uVar9 = uVar9 + 1;
        if (uVar9 == uVar32) {
          bVar23 = bVar22;
          if (!bVar25) goto code_r0x006c1084;
          break;
        }
        goto code_r0x006c0fd0;
      }
      bVar23 = (byte)*puVar40;
      if (bVar22 <= (byte)*puVar40) {
        bVar23 = bVar22;
      }
      uVar9 = uVar9 + 1;
      bVar25 = true;
      bVar22 = bVar23;
    } while (uVar9 != uVar32);
    func_0x006b1ccc(*puVar26,0xb,bVar23,0,0);
  }
code_r0x006c1084:
  if (cRam0000000000a33610 == '\0') {
    if ((param_4 & 1) != 0) goto code_r0x006c132c;
    uVar7 = func_0x006b2784(*puVar26);
    func_0x006b1f78(*puVar26,0x17,0,0);
    lVar37 = puVar26[0xa1];
    puVar26 = *(undefined8 **)(lVar37 + -0x10);
    if (puVar26 < *(undefined8 **)(lVar37 + -8)) goto code_r0x006c1160;
    puVar30 = *(undefined8 **)(lVar37 + -0x18);
    lVar24 = (long)puVar26 - (long)puVar30 >> 3;
    uVar9 = lVar24 + 1;
    if (uVar9 >> 0x3d != 0) {
      func_0x00017f90();
      goto code_r0x006c1398;
    }
    uVar36 = (long)*(undefined8 **)(lVar37 + -8) - (long)puVar30;
    uVar32 = (long)uVar36 >> 2;
    if (uVar32 <= uVar9) {
      uVar32 = uVar9;
    }
    if (0x7ffffffffffffff7 < uVar36) {
      uVar32 = 0x1fffffffffffffff;
    }
    if (uVar32 == 0) {
      lVar19 = 0;
      puVar21 = (undefined8 *)(lVar24 * 8);
      lVar15 = 0;
      *puVar21 = uVar7;
    }
    else {
      if (uVar32 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c1398;
      }
      lVar19 = __Znwm(uVar32 << 3);
      puVar21 = (undefined8 *)(lVar19 + lVar24 * 8);
      lVar15 = lVar19 + uVar32 * 8;
      *puVar21 = uVar7;
    }
    puVar34 = puVar21 + 1;
    if ((long)puVar26 - (long)puVar30 != 0) {
      uVar9 = ((long)puVar26 - (long)puVar30) - 8;
      puVar20 = puVar26;
      if ((0x57 < uVar9) &&
         (0x3f < (ulong)((long)puVar26 + (-((long)puVar26 - (long)puVar30) - lVar19)))) {
        uVar9 = (uVar9 >> 3) + 1;
        uVar36 = uVar9 & 0x3ffffffffffffff8;
        puVar20 = puVar26 + -uVar36;
        puVar21 = puVar21 + -uVar36;
        puVar26 = puVar26 + -4;
        puVar27 = (undefined8 *)(lVar19 + lVar24 * 8 + -0x20);
        uVar32 = uVar36;
        do {
          uVar11 = *puVar26;
          uVar8 = puVar26[3];
          uVar7 = puVar26[2];
          uVar43 = puVar26[-3];
          uVar42 = puVar26[-4];
          uVar10 = puVar26[-1];
          uVar12 = puVar26[-2];
          puVar27[1] = puVar26[1];
          *puVar27 = uVar11;
          puVar27[3] = uVar8;
          puVar27[2] = uVar7;
          puVar27[-3] = uVar43;
          puVar27[-4] = uVar42;
          puVar27[-1] = uVar10;
          puVar27[-2] = uVar12;
          puVar26 = puVar26 + -8;
          puVar27 = puVar27 + -8;
          uVar32 = uVar32 - 8;
        } while (uVar32 != 0);
        if (uVar9 == uVar36) goto code_r0x006c1314;
      }
      do {
        puVar20 = puVar20 + -1;
        puVar21 = puVar21 + -1;
        *puVar21 = *puVar20;
      } while (puVar20 != puVar30);
    }
    goto code_r0x006c1314;
  }
  uVar7 = func_0x006b2784(*puVar26);
  func_0x006b1f78(*puVar26,0x17,0,0);
  lVar37 = puVar26[0xa1];
  puVar26 = *(undefined8 **)(lVar37 + -0x10);
  if (puVar26 < *(undefined8 **)(lVar37 + -8)) {
code_r0x006c1160:
    puVar34 = puVar26 + 1;
    *puVar26 = uVar7;
  }
  else {
    puVar30 = *(undefined8 **)(lVar37 + -0x18);
    lVar24 = (long)puVar26 - (long)puVar30 >> 3;
    uVar9 = lVar24 + 1;
    if (uVar9 >> 0x3d != 0) {
      func_0x00017f90();
code_r0x006c1398:
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x6c139c);
      (*pcVar5)();
    }
    uVar36 = (long)*(undefined8 **)(lVar37 + -8) - (long)puVar30;
    uVar32 = (long)uVar36 >> 2;
    if (uVar32 <= uVar9) {
      uVar32 = uVar9;
    }
    if (0x7ffffffffffffff7 < uVar36) {
      uVar32 = 0x1fffffffffffffff;
    }
    if (uVar32 == 0) {
      lVar19 = 0;
      puVar21 = (undefined8 *)(lVar24 * 8);
      lVar15 = 0;
      *puVar21 = uVar7;
    }
    else {
      if (uVar32 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c1398;
      }
      lVar19 = __Znwm(uVar32 << 3);
      puVar21 = (undefined8 *)(lVar19 + lVar24 * 8);
      lVar15 = lVar19 + uVar32 * 8;
      *puVar21 = uVar7;
    }
    puVar34 = puVar21 + 1;
    if ((long)puVar26 - (long)puVar30 != 0) {
      uVar9 = ((long)puVar26 - (long)puVar30) - 8;
      puVar20 = puVar26;
      if ((0x57 < uVar9) &&
         (0x3f < (ulong)((long)puVar26 + (-((long)puVar26 - (long)puVar30) - lVar19)))) {
        uVar9 = (uVar9 >> 3) + 1;
        uVar36 = uVar9 & 0x3ffffffffffffff8;
        puVar20 = puVar26 + -uVar36;
        puVar21 = puVar21 + -uVar36;
        puVar26 = puVar26 + -4;
        puVar27 = (undefined8 *)(lVar19 + lVar24 * 8 + -0x20);
        uVar32 = uVar36;
        do {
          uVar11 = *puVar26;
          uVar8 = puVar26[3];
          uVar7 = puVar26[2];
          uVar43 = puVar26[-3];
          uVar42 = puVar26[-4];
          uVar10 = puVar26[-1];
          uVar12 = puVar26[-2];
          puVar27[1] = puVar26[1];
          *puVar27 = uVar11;
          puVar27[3] = uVar8;
          puVar27[2] = uVar7;
          puVar27[-3] = uVar43;
          puVar27[-4] = uVar42;
          puVar27[-1] = uVar10;
          puVar27[-2] = uVar12;
          puVar26 = puVar26 + -8;
          puVar27 = puVar27 + -8;
          uVar32 = uVar32 - 8;
        } while (uVar32 != 0);
        if (uVar9 == uVar36) goto code_r0x006c1314;
      }
      do {
        puVar20 = puVar20 + -1;
        puVar21 = puVar21 + -1;
        *puVar21 = *puVar20;
      } while (puVar20 != puVar30);
    }
code_r0x006c1314:
    *(undefined8 **)(lVar37 + -0x18) = puVar21;
    *(undefined8 **)(lVar37 + -0x10) = puVar34;
    *(long *)(lVar37 + -8) = lVar15;
    if (puVar30 != (undefined8 *)0x0) {
      __ZdlPv(puVar30);
    }
  }
  *(undefined8 **)(lVar37 + -0x10) = puVar34;
code_r0x006c132c:
  if (lVar41 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(lVar41);
  return;
}


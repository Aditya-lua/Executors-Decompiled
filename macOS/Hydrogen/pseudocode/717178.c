
/* WARNING: Possible PIC construction at 0x007174d4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00717510: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071755c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0071758c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00717560) */
/* WARNING: Removing unreachable block (ram,0x0071756c) */
/* WARNING: Removing unreachable block (ram,0x00717514) */
/* WARNING: Removing unreachable block (ram,0x00717520) */
/* WARNING: Removing unreachable block (ram,0x007174d8) */
/* WARNING: Removing unreachable block (ram,0x007174e4) */
/* WARNING: Removing unreachable block (ram,0x00717590) */
/* WARNING: Removing unreachable block (ram,0x007175a8) */
/* WARNING: Removing unreachable block (ram,0x007175ac) */
/* WARNING: Removing unreachable block (ram,0x00717654) */
/* WARNING: Removing unreachable block (ram,0x007175b4) */
/* WARNING: Removing unreachable block (ram,0x007175d0) */
/* WARNING: Removing unreachable block (ram,0x00717710) */
/* WARNING: Removing unreachable block (ram,0x00717724) */
/* WARNING: Removing unreachable block (ram,0x0071773c) */
/* WARNING: Removing unreachable block (ram,0x00717744) */
/* WARNING: Removing unreachable block (ram,0x007175e4) */
/* WARNING: Removing unreachable block (ram,0x007175e8) */
/* WARNING: Removing unreachable block (ram,0x007175fc) */
/* WARNING: Removing unreachable block (ram,0x0071760c) */
/* WARNING: Removing unreachable block (ram,0x00717658) */
/* WARNING: Removing unreachable block (ram,0x0071765c) */
/* WARNING: Removing unreachable block (ram,0x0071759c) */

undefined8 *
FUN_00717178(long *param_1,undefined8 param_2,undefined8 param_3,ulong param_4,long *param_5,
            long param_6,long *param_7)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 *extraout_x8;
  long *plVar10;
  undefined8 *puVar11;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  undefined1 *unaff_x19;
  long *unaff_x20;
  ulong *puVar17;
  long *unaff_x21;
  undefined8 *puVar18;
  long unaff_x23;
  undefined8 *puVar19;
  long *plVar20;
  long lVar21;
  ulong unaff_x25;
  long *plVar22;
  long *unaff_x26;
  long lVar23;
  undefined1 *unaff_x29;
  undefined *puVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  long lVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long lVar30;
  long lVar31;
  undefined8 uVar32;
  long lVar33;
  undefined8 uVar34;
  long lVar35;
  undefined8 uVar36;
  undefined1 auVar37 [16];
  
  if (unaff_x26 < param_1) {
    plVar22 = unaff_x21 + 1;
    *unaff_x21 = unaff_x23;
    goto LAB_007172a8;
  }
  puVar8 = (undefined8 *)(unaff_x19 + 400);
  plVar20 = (long *)*puVar8;
  lVar23 = (long)unaff_x26 - (long)plVar20 >> 3;
  uVar12 = lVar23 + 1;
  if (uVar12 >> 0x3d != 0) {
    func_0x00017f90(puVar8);
LAB_007172d4:
    puVar24 = (undefined *)0x7172d8;
    auVar37 = func_0x00017514();
    puVar4 = (undefined1 *)register0x00000008;
LAB_007172d8:
    do {
      puVar9 = auVar37._8_8_;
      puVar6 = auVar37._0_8_;
      *(long **)(puVar4 + -0x50) = unaff_x26;
      *(ulong *)(puVar4 + -0x48) = unaff_x25;
      *(long **)(puVar4 + -0x40) = plVar20;
      *(long *)(puVar4 + -0x38) = unaff_x23;
      *(undefined8 **)(puVar4 + -0x30) = puVar8;
      *(long **)(puVar4 + -0x28) = unaff_x21;
      *(long **)(puVar4 + -0x20) = unaff_x20;
      *(undefined1 **)(puVar4 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar4 + -0x10) = unaff_x29;
      *(undefined **)(puVar4 + -8) = puVar24;
      puVar17 = (ulong *)*puVar6;
      puVar18 = (undefined8 *)puVar17[1];
      if (puVar18 < (undefined8 *)puVar17[2]) {
        uVar26 = puVar9[1];
        uVar25 = *puVar9;
        uVar29 = puVar9[3];
        uVar28 = puVar9[2];
        puVar18[4] = puVar9[4];
        puVar18[1] = uVar26;
        *puVar18 = uVar25;
        puVar18[3] = uVar29;
        puVar18[2] = uVar28;
        puVar8 = puVar18 + 5;
        puVar7 = puVar6;
LAB_00717400:
        puVar17[1] = (ulong)puVar8;
        puVar6[2] = puVar6[2] + 1;
        return puVar7;
      }
      puVar19 = (undefined8 *)*puVar17;
      lVar23 = (long)puVar18 - (long)puVar19 >> 3;
      lVar21 = lVar23 * -0x3333333333333333;
      uVar12 = lVar21 + 1;
      if (uVar12 < 0x666666666666667) {
        lVar5 = (long)puVar17[2] - (long)puVar19 >> 3;
        unaff_x25 = lVar5 * -0x6666666666666666;
        if (unaff_x25 <= uVar12) {
          unaff_x25 = uVar12;
        }
        if (0x333333333333332 < (ulong)(lVar5 * -0x3333333333333333)) {
          unaff_x25 = 0x666666666666666;
        }
        if (unaff_x25 == 0) {
          puVar7 = (undefined8 *)0x0;
        }
        else {
          uVar12 = param_4;
          unaff_x20 = param_5;
          plVar20 = param_7;
          if (0x666666666666666 < unaff_x25) goto code_r0x00717430;
          puVar7 = (undefined8 *)__Znwm(unaff_x25 * 0x28);
        }
        puVar11 = puVar7 + lVar23;
        uVar25 = *puVar9;
        uVar28 = puVar9[3];
        uVar26 = puVar9[2];
        puVar11[1] = puVar9[1];
        *puVar11 = uVar25;
        puVar11[3] = uVar28;
        puVar11[2] = uVar26;
        puVar11[4] = puVar9[4];
        puVar8 = puVar11 + 5;
        if (puVar18 != puVar19) {
          do {
            uVar26 = puVar18[-4];
            uVar25 = puVar18[-5];
            uVar29 = puVar18[-2];
            uVar28 = puVar18[-3];
            puVar9 = puVar18 + -1;
            puVar18 = puVar18 + -5;
            puVar11[-1] = *puVar9;
            puVar11[-2] = uVar29;
            puVar11[-3] = uVar28;
            puVar11[-4] = uVar26;
            puVar11[-5] = uVar25;
            puVar11 = puVar11 + -5;
          } while (puVar18 != puVar19);
          puVar18 = (undefined8 *)*puVar17;
        }
        *puVar17 = (ulong)puVar11;
        puVar17[1] = (ulong)puVar8;
        puVar17[2] = (ulong)(puVar7 + unaff_x25 * 5);
        if (puVar18 != (undefined8 *)0x0) {
          puVar7 = (undefined8 *)__ZdlPv(puVar18);
        }
        goto LAB_00717400;
      }
      func_0x00017f90(puVar17);
      uVar12 = param_4;
      unaff_x20 = param_5;
      plVar20 = param_7;
code_r0x00717430:
      auVar37 = func_0x00017514();
      puVar8 = auVar37._8_8_;
      unaff_x21 = auVar37._0_8_;
      auVar1._8_8_ = puVar4 + -0xe0;
      auVar1._0_8_ = puVar8;
      auVar2._8_8_ = puVar4 + -0xe0;
      auVar2._0_8_ = puVar8;
      auVar3._8_8_ = puVar4 + -0xe0;
      auVar3._0_8_ = puVar8;
      auVar37._8_8_ = puVar4 + -0xe0;
      auVar37._0_8_ = puVar8;
      *(long **)(puVar4 + -0xa0) = unaff_x26;
      *(ulong *)(puVar4 + -0x98) = unaff_x25;
      *(long *)(puVar4 + -0x90) = lVar21;
      *(undefined8 **)(puVar4 + -0x88) = puVar19;
      *(undefined8 **)(puVar4 + -0x80) = puVar9;
      *(undefined8 **)(puVar4 + -0x78) = puVar18;
      *(ulong **)(puVar4 + -0x70) = puVar17;
      *(undefined8 **)(puVar4 + -0x68) = puVar6;
      *(undefined1 **)(puVar4 + -0x60) = puVar4 + -0x10;
      *(undefined **)(puVar4 + -0x58) = &DAT_00717434;
      unaff_x29 = puVar4 + -0x60;
      lVar23 = unaff_x21[0x7b];
      lVar21 = unaff_x21[0x7a];
      *(long **)(puVar4 + -0xb8) = unaff_x21 + 0x7a;
      *(long *)(puVar4 + -0xb0) = lVar23 - lVar21 >> 3;
      *(undefined8 *)(puVar4 + -0xa8) = 0;
      unaff_x25 = uVar12;
      param_4 = uVar12;
      param_5 = unaff_x20;
      param_7 = plVar20;
      unaff_x19 = extraout_x8;
      if ((unaff_x20 != (long *)0x0) && (param_6 != 0)) {
        func_0x00711dac(puVar4 + -0xb8,param_6);
code_r0x007174b0:
        unaff_x26 = unaff_x21 + 0x10;
        unaff_x23 = (long)unaff_x21 + 0x84;
        if ((uVar12 & 1) == 0) {
          func_0x00716f98(puVar4 + -0xe0,unaff_x21);
          puVar24 = &UNK_00717514;
          puVar4 = puVar4 + -0xe0;
          auVar37 = auVar2;
        }
        else {
          if ((int)*unaff_x26 == 0x106) {
code_r0x00717610:
            lVar23 = *(long *)((long)unaff_x21 + 0x84);
            *(undefined8 *)(puVar4 + -0xd8) = *(undefined8 *)((long)unaff_x21 + 0x8c);
            *(long *)(puVar4 + -0xe0) = lVar23;
            puVar8 = (undefined8 *)func_0x00710d48(unaff_x21);
            if ((int)unaff_x21[0x10] == 0x3a) {
              if (plVar20 != (long *)0x0) {
                *plVar20 = *(long *)((long)unaff_x21 + 0x84);
              }
              func_0x00710d48(unaff_x21);
              puVar18 = (undefined8 *)func_0x0071b6ec(unaff_x21);
              puVar8 = puVar18;
            }
            else {
              puVar18 = (undefined8 *)0x0;
            }
            if (unaff_x20 == (long *)0x0) goto code_r0x00717750;
            uVar12 = *(ulong *)(puVar4 + -0xa8);
            if (uVar12 == 0) {
              puVar8 = (undefined8 *)0x0;
              goto code_r0x0071774c;
            }
            lVar23 = *(long *)(puVar4 + -0xb0);
            lVar21 = **(long **)(puVar4 + -0xb8);
            puVar8 = (undefined8 *)func_0x00704c24(unaff_x21[0x1b],uVar12 << 3);
            if ((uVar12 < 8) || ((ulong)((long)puVar8 + (lVar23 * -8 - lVar21)) < 0x40)) {
              uVar13 = 0;
              goto code_r0x007176e8;
            }
            uVar13 = uVar12 & 0xfffffffffffffff8;
            puVar6 = puVar8 + 4;
            puVar9 = (undefined8 *)(lVar23 * 8 + lVar21 + 0x20);
            uVar16 = uVar13;
            do {
              uVar25 = puVar9[-4];
              uVar28 = puVar9[-1];
              uVar26 = puVar9[-2];
              uVar32 = puVar9[1];
              uVar29 = *puVar9;
              uVar36 = puVar9[3];
              uVar34 = puVar9[2];
              puVar6[-3] = puVar9[-3];
              puVar6[-4] = uVar25;
              puVar6[-1] = uVar28;
              puVar6[-2] = uVar26;
              puVar6[1] = uVar32;
              *puVar6 = uVar29;
              puVar6[3] = uVar36;
              puVar6[2] = uVar34;
              uVar16 = uVar16 - 8;
              puVar6 = puVar6 + 8;
              puVar9 = puVar9 + 8;
            } while (uVar16 != 0);
            if (uVar12 != uVar13) {
code_r0x007176e8:
              lVar5 = uVar12 - uVar13;
              puVar6 = (undefined8 *)(lVar21 + uVar13 * 8 + lVar23 * 8);
              puVar9 = puVar8 + uVar13;
              do {
                *puVar9 = *puVar6;
                lVar5 = lVar5 + -1;
                puVar6 = puVar6 + 1;
                puVar9 = puVar9 + 1;
              } while (lVar5 != 0);
            }
code_r0x0071774c:
            *unaff_x20 = (long)puVar8;
            unaff_x20[1] = uVar12;
code_r0x00717750:
            *extraout_x8 = 1;
            uVar25 = *(undefined8 *)(puVar4 + -0xe0);
            *(undefined8 *)(extraout_x8 + 0xc) = *(undefined8 *)(puVar4 + -0xd8);
            *(undefined8 *)(extraout_x8 + 4) = uVar25;
            *(undefined8 **)(extraout_x8 + 0x18) = puVar18;
            plVar22 = *(long **)(puVar4 + -0xb8);
            if (*plVar22 + *(long *)(puVar4 + -0xb0) * 8 != plVar22[1]) {
              plVar22[1] = *plVar22 + *(long *)(puVar4 + -0xb0) * 8;
            }
            return puVar8;
          }
          func_0x00716f98(puVar4 + -0xe0,unaff_x21);
          puVar24 = &UNK_007174d8;
          puVar4 = puVar4 + -0xe0;
          auVar37 = auVar1;
        }
        goto LAB_007172d8;
      }
      unaff_x26 = unaff_x21 + 0x10;
      unaff_x23 = (long)unaff_x21 + 0x84;
      if (unaff_x20 != (long *)0x0) goto code_r0x007174b0;
      if ((uVar12 & 1) == 0) {
        func_0x00716f98(puVar4 + -0xe0,unaff_x21);
        puVar24 = &UNK_00717590;
        puVar4 = puVar4 + -0xe0;
      }
      else {
        if ((int)*unaff_x26 == 0x106) goto code_r0x00717610;
        func_0x00716f98(puVar4 + -0xe0,unaff_x21);
        puVar24 = &UNK_00717560;
        puVar4 = puVar4 + -0xe0;
        auVar37 = auVar3;
      }
    } while( true );
  }
  unaff_x25 = (long)param_1 - (long)plVar20 >> 2;
  if (unaff_x25 <= uVar12) {
    unaff_x25 = uVar12;
  }
  if (0x7ffffffffffffff7 < (ulong)((long)param_1 - (long)plVar20)) {
    unaff_x25 = 0x1fffffffffffffff;
  }
  if (unaff_x25 == 0) {
    lVar5 = 0;
    plVar10 = (long *)(lVar23 * 8);
    lVar21 = 0;
    *plVar10 = unaff_x23;
  }
  else {
    if (unaff_x25 >> 0x3d != 0) goto LAB_007172d4;
    lVar5 = __Znwm(unaff_x25 << 3);
    plVar10 = (long *)(lVar5 + lVar23 * 8);
    lVar21 = lVar5 + unaff_x25 * 8;
    *plVar10 = unaff_x23;
  }
  plVar22 = plVar10 + 1;
  if ((long)unaff_x26 - (long)plVar20 != 0) {
    uVar12 = ((long)unaff_x26 - (long)plVar20) - 8;
    if ((uVar12 < 0x58) ||
       ((ulong)((long)unaff_x26 + (-((long)unaff_x26 - (long)plVar20) - lVar5)) < 0x40)) {
LAB_00717280:
      do {
        unaff_x21 = unaff_x21 + -1;
        plVar10 = plVar10 + -1;
        *plVar10 = *unaff_x21;
      } while (unaff_x21 != plVar20);
    }
    else {
      uVar12 = (uVar12 >> 3) + 1;
      uVar13 = uVar12 & 0x3ffffffffffffff8;
      unaff_x21 = unaff_x26 + -uVar13;
      plVar10 = plVar10 + -uVar13;
      plVar14 = unaff_x26 + -4;
      plVar15 = (long *)(lVar5 + lVar23 * 8 + -0x20);
      uVar16 = uVar13;
      do {
        lVar27 = *plVar14;
        lVar5 = plVar14[3];
        lVar23 = plVar14[2];
        lVar35 = plVar14[-3];
        lVar33 = plVar14[-4];
        lVar31 = plVar14[-1];
        lVar30 = plVar14[-2];
        plVar15[1] = plVar14[1];
        *plVar15 = lVar27;
        plVar15[3] = lVar5;
        plVar15[2] = lVar23;
        plVar15[-3] = lVar35;
        plVar15[-4] = lVar33;
        plVar15[-1] = lVar31;
        plVar15[-2] = lVar30;
        plVar14 = plVar14 + -8;
        plVar15 = plVar15 + -8;
        uVar16 = uVar16 - 8;
      } while (uVar16 != 0);
      if (uVar12 != uVar13) goto LAB_00717280;
    }
    unaff_x21 = (long *)*puVar8;
  }
  *(long **)(unaff_x19 + 400) = plVar10;
  *(long **)(unaff_x19 + 0x198) = plVar22;
  *(long *)(unaff_x19 + 0x1a0) = lVar21;
  if (unaff_x21 != (long *)0x0) {
    __ZdlPv(unaff_x21);
  }
LAB_007172a8:
  *(long **)(unaff_x19 + 0x198) = plVar22;
  return (undefined8 *)*unaff_x20;
}


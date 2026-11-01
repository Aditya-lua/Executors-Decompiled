
/* WARNING: Possible PIC construction at 0x00470300: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00470304) */
/* WARNING: Removing unreachable block (ram,0x00470310) */
/* WARNING: Removing unreachable block (ram,0x00470330) */
/* WARNING: Removing unreachable block (ram,0x004703b8) */
/* WARNING: Removing unreachable block (ram,0x0047033c) */
/* WARNING: Removing unreachable block (ram,0x00470344) */
/* WARNING: Removing unreachable block (ram,0x00470364) */
/* WARNING: Removing unreachable block (ram,0x00470348) */
/* WARNING: Removing unreachable block (ram,0x0047035c) */
/* WARNING: Removing unreachable block (ram,0x00470360) */
/* WARNING: Removing unreachable block (ram,0x00470368) */
/* WARNING: Removing unreachable block (ram,0x00470378) */
/* WARNING: Removing unreachable block (ram,0x004703a0) */
/* WARNING: Removing unreachable block (ram,0x004703cc) */
/* WARNING: Removing unreachable block (ram,0x004703a4) */
/* WARNING: Removing unreachable block (ram,0x004703ac) */
/* WARNING: Removing unreachable block (ram,0x004702d4) */
/* WARNING: Removing unreachable block (ram,0x004702ec) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_0046f7a8(uint *param_1,undefined8 param_2,uint *param_3,undefined8 param_4,
                   undefined8 *param_5)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined1 *puVar5;
  bool bVar6;
  int iVar7;
  ulong uVar8;
  uint *puVar9;
  undefined8 uVar10;
  int *piVar11;
  undefined *puVar12;
  undefined1 *puVar13;
  undefined8 *puVar14;
  long lVar15;
  long lVar16;
  byte bVar17;
  undefined1 (*pauVar18) [16];
  ulong extraout_x8;
  undefined *puVar19;
  ulong extraout_x8_00;
  undefined *extraout_x8_01;
  byte in_w9;
  uint uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong extraout_x9;
  undefined8 *puVar24;
  undefined8 *extraout_x9_00;
  ulong extraout_x9_01;
  int *piVar25;
  uint *in_x10;
  long lVar26;
  ulong extraout_x10;
  undefined *puVar27;
  undefined4 uVar28;
  long in_x11;
  uint *puVar29;
  ulong extraout_x11;
  uint in_w12;
  uint in_w13;
  ulong uVar30;
  ulong extraout_x14;
  undefined8 *extraout_x14_00;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  long lVar34;
  long extraout_x17;
  long extraout_x17_00;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  int *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  undefined *puVar35;
  int iVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auStack_90 [128];
  
  auVar38._8_8_ = unaff_x22;
  auVar38._0_8_ = unaff_x23;
  while( true ) {
    uVar20 = ~in_w13;
    bVar6 = (in_w9 & 1) != 0;
    in_w9 = CARRY4(in_w12,uVar20) || CARRY4(in_w12 + uVar20,(uint)bVar6);
    *in_x10 = uVar20 + in_w12 + (uint)bVar6;
    in_x11 = in_x11 + -1;
    if (in_x11 == 0) break;
    in_w12 = in_x10[1];
    in_w13 = *param_3;
    param_3 = param_3 + 1;
    in_x10 = in_x10 + 1;
  }
  if ((bool)in_w9) {
    *(undefined8 *)(param_1 + 0x28) = param_2;
    return param_1;
  }
  auVar45 = func_0x007a247c(&UNK_00894d89,0x1a,&UNK_009e0b68);
  puVar9 = auVar45._0_8_;
  puVar13 = auStack_90 + 0x80;
  uVar8 = *(ulong *)(puVar9 + 0x28);
  if (uVar8 < 0x29) {
    if (uVar8 != 0) {
      uVar21 = 0;
      lVar26 = uVar8 << 2;
      puVar29 = puVar9;
      do {
        uVar22 = uVar21 + (ulong)*puVar29 * (auVar45._8_8_ & 0xffffffff);
        *puVar29 = (uint)uVar22;
        uVar21 = uVar22 >> 0x20;
        lVar26 = lVar26 + -4;
        puVar29 = puVar29 + 1;
      } while (lVar26 != 0);
      if (uVar21 != 0) {
        if (uVar8 == 0x28) goto LAB_0046f87c;
        puVar9[uVar8] = (uint)(uVar22 >> 0x20);
        uVar8 = uVar8 + 1;
      }
    }
    *(ulong *)(puVar9 + 0x28) = uVar8;
    return puVar9;
  }
  uVar8 = func_0x007a28b0(uVar8,0x28,&UNK_009e0b68);
LAB_0046f87c:
  puVar35 = &__ZN4core3num6bignum8Big32x408mul_pow217h35832a30719f6047E;
  auVar45 = func_0x007a2570(uVar8,0x28,&UNK_009e0b68);
  puVar5 = auStack_90 + 0x80;
  do {
    uVar8 = auVar45._8_8_;
    puVar9 = auVar45._0_8_;
    *(undefined1 **)(puVar5 + -0x10) = puVar13;
    *(undefined **)(puVar5 + -8) = puVar35;
    if (uVar8 < 0x500) {
      uVar22 = uVar8 >> 5;
      uVar23 = *(ulong *)(puVar9 + 0x28);
      if (uVar23 != 0) {
        uVar33 = uVar23;
        do {
          uVar21 = uVar33 - 1;
          if (0x28 < uVar23) goto LAB_0046fc80;
          if (0x27 < (uVar22 - 1) + uVar33) goto code_r0x0046fc94;
          puVar9[uVar22 + (uVar33 - 1)] = puVar9[uVar33 - 1];
          uVar33 = uVar21;
        } while (uVar21 != 0);
      }
      if ((((((uVar8 < 0x20) || (*puVar9 = 0, uVar22 == 1)) || (puVar9[1] = 0, uVar22 == 2)) ||
           (((puVar9[2] = 0, uVar22 == 3 || (puVar9[3] = 0, uVar22 == 4)) ||
            ((puVar9[4] = 0, uVar22 == 5 ||
             ((puVar9[5] = 0, uVar22 == 6 || (puVar9[6] = 0, uVar22 == 7)))))))) ||
          ((((puVar9[7] = 0, uVar22 == 8 ||
             ((((puVar9[8] = 0, uVar22 == 9 || (puVar9[9] = 0, uVar22 == 10)) ||
               (puVar9[10] = 0, uVar22 == 0xb)) ||
              ((puVar9[0xb] = 0, uVar22 == 0xc || (puVar9[0xc] = 0, uVar22 == 0xd)))))) ||
            (((puVar9[0xd] = 0, uVar22 == 0xe ||
              ((puVar9[0xe] = 0, uVar22 == 0xf || (puVar9[0xf] = 0, uVar22 == 0x10)))) ||
             (puVar9[0x10] = 0, uVar22 == 0x11)))) ||
           ((((puVar9[0x11] = 0, uVar22 == 0x12 || (puVar9[0x12] = 0, uVar22 == 0x13)) ||
             (puVar9[0x13] = 0, uVar22 == 0x14)) ||
            ((puVar9[0x14] = 0, uVar22 == 0x15 || (puVar9[0x15] = 0, uVar22 == 0x16)))))))) ||
         ((((puVar9[0x16] = 0, uVar22 == 0x17 ||
            ((puVar9[0x17] = 0, uVar22 == 0x18 || (puVar9[0x18] = 0, uVar22 == 0x19)))) ||
           (puVar9[0x19] = 0, uVar22 == 0x1a)) ||
          ((((puVar9[0x1a] = 0, uVar22 == 0x1b || (puVar9[0x1b] = 0, uVar22 == 0x1c)) ||
            (puVar9[0x1c] = 0, uVar22 == 0x1d)) ||
           (((((puVar9[0x1d] = 0, uVar22 == 0x1e || (puVar9[0x1e] = 0, uVar22 == 0x1f)) ||
              ((puVar9[0x1f] = 0, uVar22 == 0x20 ||
               ((puVar9[0x20] = 0, uVar22 == 0x21 || (puVar9[0x21] = 0, uVar22 == 0x22)))))) ||
             (puVar9[0x22] = 0, uVar22 == 0x23)) ||
            ((((puVar9[0x23] = 0, uVar22 == 0x24 || (puVar9[0x24] = 0, uVar22 == 0x25)) ||
              (puVar9[0x25] = 0, uVar22 == 0x26)) ||
             ((puVar9[0x26] = 0, uVar22 == 0x27 || (puVar9[0x27] = 0, uVar22 == 0x28)))))))))))) {
        lVar26 = *(long *)(puVar9 + 0x28);
        uVar21 = lVar26 + uVar22;
        uVar8 = uVar8 & 0x1f;
        if (uVar8 == 0) goto code_r0x0046fc5c;
        uVar23 = uVar21 - 1;
        if (0x27 < uVar23) goto LAB_0046fcac;
        uVar1 = -auVar45._8_4_;
        uVar20 = puVar9[uVar23] >> (ulong)(uVar1 & 0x1f);
        uVar23 = uVar21;
        if (uVar20 != 0) {
          if (0x27 < uVar21) goto LAB_0046fc80;
          puVar9[uVar21] = uVar20;
          uVar23 = uVar21 + 1;
        }
        uVar28 = (undefined4)uVar8;
        if (uVar21 <= uVar22 + 1) goto LAB_0046fc50;
        uVar20 = uVar1 & 0x1f;
        uVar30 = lVar26 - 1;
        uVar33 = uVar21;
        if (uVar30 < 4) goto LAB_0046fc1c;
        uVar33 = CONCAT44(uVar1,uVar1) & 0x1f0000001f;
        auVar46._4_4_ = uVar28;
        auVar46._0_4_ = uVar28;
        auVar46._8_4_ = uVar28;
        auVar46._12_4_ = uVar28;
        iVar7 = (int)uVar33;
        iVar36 = (int)(uVar33 >> 0x20);
        if (uVar30 < 0x10) {
          uVar31 = 0;
          goto LAB_0046fbc8;
        }
        uVar31 = uVar30 & 0xfffffffffffffff0;
        pauVar18 = (undefined1 (*) [16])(puVar9 + (uVar21 - 8));
        auVar37._0_4_ = -iVar7;
        auVar37._4_4_ = -iVar36;
        auVar37._8_4_ = -uVar20;
        auVar37._12_4_ = -uVar20;
        uVar33 = uVar31;
        do {
          auVar42 = pauVar18[-2];
          auVar38 = pauVar18[-1];
          auVar45 = *(undefined1 (*) [16])((long)pauVar18[-2] + 0xc);
          auVar41 = *(undefined1 (*) [16])((long)pauVar18[-3] + 0xc);
          auVar43 = NEON_ushl(*(undefined1 (*) [16])((long)*pauVar18 + 0xc),auVar37,4);
          auVar39 = NEON_ushl(pauVar18[1],auVar46,4);
          auVar44 = NEON_ushl(*(undefined1 (*) [16])((long)pauVar18[-1] + 0xc),auVar37,4);
          auVar40 = NEON_ushl(*pauVar18,auVar46,4);
          *(byte *)((long)*pauVar18 + 8) = auVar44[8] | auVar40[8];
          *(byte *)((long)*pauVar18 + 9) = auVar44[9] | auVar40[9];
          *(byte *)((long)*pauVar18 + 10) = auVar44[10] | auVar40[10];
          *(byte *)((long)*pauVar18 + 0xb) = auVar44[0xb] | auVar40[0xb];
          *(byte *)((long)*pauVar18 + 0xc) = auVar44[0xc] | auVar40[0xc];
          *(byte *)((long)*pauVar18 + 0xd) = auVar44[0xd] | auVar40[0xd];
          *(byte *)((long)*pauVar18 + 0xe) = auVar44[0xe] | auVar40[0xe];
          *(byte *)((long)*pauVar18 + 0xf) = auVar44[0xf] | auVar40[0xf];
          (*pauVar18)[0] = auVar44[0] | auVar40[0];
          *(byte *)((long)*pauVar18 + 1) = auVar44[1] | auVar40[1];
          *(byte *)((long)*pauVar18 + 2) = auVar44[2] | auVar40[2];
          *(byte *)((long)*pauVar18 + 3) = auVar44[3] | auVar40[3];
          *(byte *)((long)*pauVar18 + 4) = auVar44[4] | auVar40[4];
          *(byte *)((long)*pauVar18 + 5) = auVar44[5] | auVar40[5];
          *(byte *)((long)*pauVar18 + 6) = auVar44[6] | auVar40[6];
          *(byte *)((long)*pauVar18 + 7) = auVar44[7] | auVar40[7];
          *(byte *)((long)pauVar18[1] + 8) = auVar43[8] | auVar39[8];
          *(byte *)((long)pauVar18[1] + 9) = auVar43[9] | auVar39[9];
          *(byte *)((long)pauVar18[1] + 10) = auVar43[10] | auVar39[10];
          *(byte *)((long)pauVar18[1] + 0xb) = auVar43[0xb] | auVar39[0xb];
          *(byte *)((long)pauVar18[1] + 0xc) = auVar43[0xc] | auVar39[0xc];
          *(byte *)((long)pauVar18[1] + 0xd) = auVar43[0xd] | auVar39[0xd];
          *(byte *)((long)pauVar18[1] + 0xe) = auVar43[0xe] | auVar39[0xe];
          *(byte *)((long)pauVar18[1] + 0xf) = auVar43[0xf] | auVar39[0xf];
          pauVar18[1][0] = auVar43[0] | auVar39[0];
          *(byte *)((long)pauVar18[1] + 1) = auVar43[1] | auVar39[1];
          *(byte *)((long)pauVar18[1] + 2) = auVar43[2] | auVar39[2];
          *(byte *)((long)pauVar18[1] + 3) = auVar43[3] | auVar39[3];
          *(byte *)((long)pauVar18[1] + 4) = auVar43[4] | auVar39[4];
          *(byte *)((long)pauVar18[1] + 5) = auVar43[5] | auVar39[5];
          *(byte *)((long)pauVar18[1] + 6) = auVar43[6] | auVar39[6];
          *(byte *)((long)pauVar18[1] + 7) = auVar43[7] | auVar39[7];
          auVar45 = NEON_ushl(auVar45,auVar37,4);
          auVar38 = NEON_ushl(auVar38,auVar46,4);
          auVar41 = NEON_ushl(auVar41,auVar37,4);
          auVar42 = NEON_ushl(auVar42,auVar46,4);
          *(byte *)((long)pauVar18[-2] + 8) = auVar41[8] | auVar42[8];
          *(byte *)((long)pauVar18[-2] + 9) = auVar41[9] | auVar42[9];
          *(byte *)((long)pauVar18[-2] + 10) = auVar41[10] | auVar42[10];
          *(byte *)((long)pauVar18[-2] + 0xb) = auVar41[0xb] | auVar42[0xb];
          *(byte *)((long)pauVar18[-2] + 0xc) = auVar41[0xc] | auVar42[0xc];
          *(byte *)((long)pauVar18[-2] + 0xd) = auVar41[0xd] | auVar42[0xd];
          *(byte *)((long)pauVar18[-2] + 0xe) = auVar41[0xe] | auVar42[0xe];
          *(byte *)((long)pauVar18[-2] + 0xf) = auVar41[0xf] | auVar42[0xf];
          pauVar18[-2][0] = auVar41[0] | auVar42[0];
          *(byte *)((long)pauVar18[-2] + 1) = auVar41[1] | auVar42[1];
          *(byte *)((long)pauVar18[-2] + 2) = auVar41[2] | auVar42[2];
          *(byte *)((long)pauVar18[-2] + 3) = auVar41[3] | auVar42[3];
          *(byte *)((long)pauVar18[-2] + 4) = auVar41[4] | auVar42[4];
          *(byte *)((long)pauVar18[-2] + 5) = auVar41[5] | auVar42[5];
          *(byte *)((long)pauVar18[-2] + 6) = auVar41[6] | auVar42[6];
          *(byte *)((long)pauVar18[-2] + 7) = auVar41[7] | auVar42[7];
          *(byte *)((long)pauVar18[-1] + 8) = auVar45[8] | auVar38[8];
          *(byte *)((long)pauVar18[-1] + 9) = auVar45[9] | auVar38[9];
          *(byte *)((long)pauVar18[-1] + 10) = auVar45[10] | auVar38[10];
          *(byte *)((long)pauVar18[-1] + 0xb) = auVar45[0xb] | auVar38[0xb];
          *(byte *)((long)pauVar18[-1] + 0xc) = auVar45[0xc] | auVar38[0xc];
          *(byte *)((long)pauVar18[-1] + 0xd) = auVar45[0xd] | auVar38[0xd];
          *(byte *)((long)pauVar18[-1] + 0xe) = auVar45[0xe] | auVar38[0xe];
          *(byte *)((long)pauVar18[-1] + 0xf) = auVar45[0xf] | auVar38[0xf];
          pauVar18[-1][0] = auVar45[0] | auVar38[0];
          *(byte *)((long)pauVar18[-1] + 1) = auVar45[1] | auVar38[1];
          *(byte *)((long)pauVar18[-1] + 2) = auVar45[2] | auVar38[2];
          *(byte *)((long)pauVar18[-1] + 3) = auVar45[3] | auVar38[3];
          *(byte *)((long)pauVar18[-1] + 4) = auVar45[4] | auVar38[4];
          *(byte *)((long)pauVar18[-1] + 5) = auVar45[5] | auVar38[5];
          *(byte *)((long)pauVar18[-1] + 6) = auVar45[6] | auVar38[6];
          *(byte *)((long)pauVar18[-1] + 7) = auVar45[7] | auVar38[7];
          pauVar18 = pauVar18 + -4;
          uVar33 = uVar33 - 0x10;
        } while (uVar33 != 0);
        if (uVar30 != uVar31) {
          if ((uVar30 & 0xc) == 0) {
            uVar33 = uVar21 - uVar31;
          }
          else {
LAB_0046fbc8:
            uVar32 = uVar30 & 0xfffffffffffffffc;
            uVar33 = uVar21 - uVar32;
            pauVar18 = (undefined1 (*) [16])(puVar9 + ((uVar21 - 5) - uVar31));
            lVar26 = uVar31 - uVar32;
            auVar41._0_4_ = -iVar7;
            auVar41._4_4_ = -iVar36;
            auVar41._8_4_ = -uVar20;
            auVar41._12_4_ = -uVar20;
            do {
              auVar45 = NEON_ushl(*pauVar18,auVar41,4);
              auVar38 = NEON_ushl(*(undefined1 (*) [16])((long)*pauVar18 + 4),auVar46,4);
              *(byte *)((long)*pauVar18 + 0xc) = auVar45[8] | auVar38[8];
              *(byte *)((long)*pauVar18 + 0xd) = auVar45[9] | auVar38[9];
              *(byte *)((long)*pauVar18 + 0xe) = auVar45[10] | auVar38[10];
              *(byte *)((long)*pauVar18 + 0xf) = auVar45[0xb] | auVar38[0xb];
              pauVar18[1][0] = auVar45[0xc] | auVar38[0xc];
              *(byte *)((long)pauVar18[1] + 1) = auVar45[0xd] | auVar38[0xd];
              *(byte *)((long)pauVar18[1] + 2) = auVar45[0xe] | auVar38[0xe];
              *(byte *)((long)pauVar18[1] + 3) = auVar45[0xf] | auVar38[0xf];
              *(byte *)((long)*pauVar18 + 4) = auVar45[0] | auVar38[0];
              *(byte *)((long)*pauVar18 + 5) = auVar45[1] | auVar38[1];
              *(byte *)((long)*pauVar18 + 6) = auVar45[2] | auVar38[2];
              *(byte *)((long)*pauVar18 + 7) = auVar45[3] | auVar38[3];
              *(byte *)((long)*pauVar18 + 8) = auVar45[4] | auVar38[4];
              *(byte *)((long)*pauVar18 + 9) = auVar45[5] | auVar38[5];
              *(byte *)((long)*pauVar18 + 10) = auVar45[6] | auVar38[6];
              *(byte *)((long)*pauVar18 + 0xb) = auVar45[7] | auVar38[7];
              pauVar18 = pauVar18 + -1;
              lVar26 = lVar26 + 4;
            } while (lVar26 != 0);
            if (uVar30 == uVar32) goto LAB_0046fc50;
          }
LAB_0046fc1c:
          puVar29 = puVar9 + (uVar33 - 1);
          do {
            uVar33 = uVar33 - 1;
            *puVar29 = puVar29[-1] >> (ulong)uVar20 | *puVar29 << uVar8;
            puVar29 = puVar29 + -1;
          } while (uVar22 + 1 < uVar33);
        }
LAB_0046fc50:
        puVar9[uVar22] = puVar9[uVar22] << uVar8;
        uVar21 = uVar23;
code_r0x0046fc5c:
        *(ulong *)(puVar9 + 0x28) = uVar21;
        return puVar9;
      }
    }
    else {
      func_0x007a247c(&UNK_00894da3,0x1d,&UNK_009e0b68);
      uVar21 = extraout_x8;
LAB_0046fc80:
      func_0x007a2570(uVar21,0x28,&UNK_009e0b68);
      uVar22 = extraout_x10;
      uVar33 = extraout_x14;
code_r0x0046fc94:
      func_0x007a2570(uVar22 + uVar33 + -1,0x28,&UNK_009e0b68);
      uVar23 = extraout_x9;
LAB_0046fcac:
      func_0x007a2570(uVar23,0x28,&UNK_009e0b68);
    }
    auVar45 = func_0x007a2570(0x28,0x28,&UNK_009e0b68);
    uVar8 = auVar45._8_8_;
    puVar9 = auVar45._0_8_;
    *(undefined1 **)(puVar5 + -0x20) = puVar5 + -0x10;
    *(undefined **)(puVar5 + -0x18) = &__ZN4core3num6bignum8Big32x408mul_pow517hdb22bee78203696aE;
    if (0xc < uVar8) {
      uVar21 = *(ulong *)(puVar9 + 0x28);
      do {
        if (0x28 < uVar21) goto code_r0x0046fe38;
        if (uVar21 != 0) {
          uVar22 = 0;
          lVar26 = uVar21 << 2;
          puVar29 = puVar9;
          do {
            uVar23 = uVar22 + (ulong)*puVar29 * 0x48c27395;
            *puVar29 = (uint)uVar23;
            uVar22 = uVar23 >> 0x20;
            lVar26 = lVar26 + -4;
            puVar29 = puVar29 + 1;
          } while (lVar26 != 0);
          if (uVar22 != 0) {
            if (uVar21 == 0x28) goto code_r0x0046fe4c;
            puVar9[uVar21] = (uint)(uVar23 >> 0x20);
            uVar21 = uVar21 + 1;
          }
        }
        *(ulong *)(puVar9 + 0x28) = uVar21;
        uVar8 = uVar8 - 0xd;
      } while (0xc < uVar8);
    }
    if (uVar8 == 0) {
      uVar20 = 1;
    }
    else {
      uVar20 = (int)uVar8 + 3U & 0x1c;
      uVar8 = uVar8 - 1;
      if (uVar20 == 4) {
        bVar17 = 0;
        auVar42._8_4_ = 5;
        auVar42._0_8_ = 0x500000005;
        auVar42._12_4_ = 5;
        auVar39._8_4_ = 1;
        auVar39._0_8_ = 0x100000001;
        auVar39._12_4_ = 1;
      }
      else if (uVar20 == 8) {
        auVar42._8_4_ = 0x19;
        auVar42._0_8_ = 0x1900000019;
        auVar42._12_4_ = 0x19;
        auVar39._8_4_ = 5;
        auVar39._0_8_ = 0x500000005;
        auVar39._12_4_ = 5;
        bVar17 = 4;
      }
      else {
        auVar42._8_4_ = 0x7d;
        auVar42._0_8_ = 0x7d0000007d;
        auVar42._12_4_ = 0x7d;
        auVar39._8_4_ = 0x19;
        auVar39._0_8_ = 0x1900000019;
        auVar39._12_4_ = 0x19;
        bVar17 = 8;
      }
      auVar44._0_8_ =
           CONCAT17((char)((ulong)_UNK_007fc2d0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_007fc2d0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_007fc2d0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_007fc2d0 >> 0x20),
                                               CONCAT13((char)((ulong)_UNK_007fc2d0 >> 0x18),
                                                        CONCAT12((char)((ulong)_UNK_007fc2d0 >> 0x10
                                                                       ),CONCAT11((char)((ulong)
                                                  _UNK_007fc2d0 >> 8),bVar17 | (byte)_UNK_007fc2d0))
                                                  )))));
      auVar44[8] = bVar17 | (byte)_UNK_007fc2d8;
      auVar44[9] = (undefined1)((ulong)_UNK_007fc2d8 >> 8);
      auVar44[10] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x10);
      auVar44[0xb] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x18);
      auVar44[0xc] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x20);
      auVar44[0xd] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x28);
      auVar44[0xe] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x30);
      auVar44[0xf] = (undefined1)((ulong)_UNK_007fc2d8 >> 0x38);
      auVar43._0_8_ =
           CONCAT17((char)((ulong)_UNK_007fc2c0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_007fc2c0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_007fc2c0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_007fc2c0 >> 0x20),
                                               CONCAT13((char)((ulong)_UNK_007fc2c0 >> 0x18),
                                                        CONCAT12((char)((ulong)_UNK_007fc2c0 >> 0x10
                                                                       ),CONCAT11((char)((ulong)
                                                  _UNK_007fc2c0 >> 8),bVar17 | (byte)_UNK_007fc2c0))
                                                  )))));
      auVar43[8] = bVar17 | (byte)_UNK_007fc2c8;
      auVar43[9] = (char)((ulong)_UNK_007fc2c8 >> 8);
      auVar43[10] = (char)((ulong)_UNK_007fc2c8 >> 0x10);
      auVar43[0xb] = (char)((ulong)_UNK_007fc2c8 >> 0x18);
      auVar43[0xc] = (char)((ulong)_UNK_007fc2c8 >> 0x20);
      auVar43[0xd] = (char)((ulong)_UNK_007fc2c8 >> 0x28);
      auVar43[0xe] = (char)((ulong)_UNK_007fc2c8 >> 0x30);
      auVar43[0xf] = (char)((ulong)_UNK_007fc2c8 >> 0x38);
      auVar40._4_4_ = -(uint)(uVar8 < auVar44._8_8_);
      auVar40._0_4_ = -(uint)(uVar8 < auVar44._0_8_);
      auVar40._8_4_ = -(uint)(uVar8 < auVar43._0_8_);
      auVar40._12_4_ = -(uint)(uVar8 < auVar43._8_8_);
      auVar42 = auVar42 ^ (auVar42 ^ auVar39) & auVar40;
      auVar45 = NEON_ext(auVar42,auVar42,8,1);
      uVar20 = auVar42._0_4_ * auVar45._0_4_ * auVar42._4_4_ * auVar45._4_4_;
    }
    uVar21 = *(ulong *)(puVar9 + 0x28);
    if (uVar21 < 0x29) {
      if (uVar21 == 0) {
code_r0x0046fe2c:
        *(ulong *)(puVar9 + 0x28) = uVar21;
        return puVar9;
      }
      uVar8 = 0;
      lVar26 = uVar21 << 2;
      puVar29 = puVar9;
      do {
        uVar22 = uVar8 + (ulong)uVar20 * (ulong)*puVar29;
        *puVar29 = (uint)uVar22;
        uVar8 = uVar22 >> 0x20;
        lVar26 = lVar26 + -4;
        puVar29 = puVar29 + 1;
      } while (lVar26 != 0);
      if (uVar8 == 0) goto code_r0x0046fe2c;
      if (uVar21 != 0x28) {
        puVar9[uVar21] = (uint)(uVar22 >> 0x20);
        uVar21 = uVar21 + 1;
        goto code_r0x0046fe2c;
      }
    }
    else {
code_r0x0046fe38:
      func_0x007a28b0(uVar21,0x28,&UNK_009e0b68);
    }
code_r0x0046fe4c:
    puVar12 = &UNK_009e0b68;
    auVar45 = func_0x007a2570(0x28,0x28);
    piVar11 = auVar45._8_8_;
    puVar9 = auVar45._0_8_;
    *(undefined8 **)(puVar5 + -0x40) = unaff_x20;
    *(ulong *)(puVar5 + -0x38) = unaff_x19;
    *(undefined1 **)(puVar5 + -0x30) = puVar5 + -0x20;
    *(undefined **)(puVar5 + -0x28) = &__ZN4core3num6bignum8Big32x4010mul_digits17h03feebb2b110339fE
    ;
    *(undefined8 *)(puVar5 + -0x58) = 0;
    *(undefined8 *)(puVar5 + -0x60) = 0;
    *(undefined8 *)(puVar5 + -0x48) = 0;
    *(undefined8 *)(puVar5 + -0x50) = 0;
    *(undefined8 *)(puVar5 + -0x78) = 0;
    *(undefined8 *)(puVar5 + -0x80) = 0;
    *(undefined8 *)(puVar5 + -0x68) = 0;
    *(undefined8 *)(puVar5 + -0x70) = 0;
    *(undefined8 *)(puVar5 + -0x98) = 0;
    *(undefined8 *)(puVar5 + -0xa0) = 0;
    *(undefined8 *)(puVar5 + -0x88) = 0;
    *(undefined8 *)(puVar5 + -0x90) = 0;
    *(undefined8 *)(puVar5 + -0xb8) = 0;
    *(undefined8 *)(puVar5 + -0xc0) = 0;
    *(undefined8 *)(puVar5 + -0xa8) = 0;
    *(undefined8 *)(puVar5 + -0xb0) = 0;
    *(undefined8 *)(puVar5 + -0xd8) = 0;
    *(undefined8 *)(puVar5 + -0xe0) = 0;
    *(undefined8 *)(puVar5 + -200) = 0;
    *(undefined8 *)(puVar5 + -0xd0) = 0;
    puVar35 = *(undefined **)(puVar9 + 0x28);
    if (puVar35 < puVar12) {
      if (puVar35 < (undefined *)0x29) {
        puVar27 = (undefined *)0x0;
        uVar8 = 0;
        puVar29 = puVar9;
        do {
          lVar15 = 0;
          lVar26 = 0;
          param_5 = (undefined8 *)(puVar5 + uVar8 * 4 + -0xe4);
          uVar21 = uVar8;
          do {
            uVar22 = uVar21;
            if ((uint *)((long)puVar29 + lVar15) == puVar9 + (long)puVar35) goto code_r0x0047009c;
            uVar20 = puVar29[lVar26];
            lVar26 = lVar26 + 1;
            param_5 = (undefined8 *)((long)param_5 + 4);
            lVar15 = lVar15 + 4;
            uVar21 = uVar22 + 1;
          } while (uVar20 == 0);
          unaff_x19 = 0;
          uVar21 = 0;
          puVar29 = (uint *)((long)puVar29 + lVar15);
          do {
            if (0x27 < uVar22) goto code_r0x004700ec;
            unaff_x20 = (undefined8 *)(ulong)*(uint *)((long)param_5 + unaff_x19);
            uVar23 = (long)unaff_x20 +
                     (ulong)*(uint *)((long)piVar11 + unaff_x19) * (ulong)uVar20 + uVar21;
            uVar21 = uVar23 >> 0x20;
            *(int *)((long)param_5 + unaff_x19) = (int)uVar23;
            unaff_x19 = unaff_x19 + 4;
            uVar22 = uVar22 + 1;
          } while ((long)puVar12 * 4 != unaff_x19);
          puVar19 = puVar12;
          if (uVar21 != 0) {
            if ((undefined *)0x27 < puVar12 + lVar26 + (uVar8 - 1)) goto LAB_00470114;
            *(int *)(puVar5 + lVar26 * 4 + (long)(puVar12 + uVar8) * 4 + -0xe4) =
                 (int)(uVar23 >> 0x20);
            puVar19 = puVar12 + 1;
          }
          if (puVar27 <= puVar19 + lVar26 + uVar8 + -1) {
            puVar27 = puVar19 + lVar26 + uVar8 + -1;
          }
          uVar8 = uVar8 + lVar26;
        } while( true );
      }
    }
    else if (puVar35 < (undefined *)0x29) {
      piVar25 = piVar11 + (long)puVar12;
      if (puVar35 == (undefined *)0x0) {
        puVar35 = (undefined *)0x0;
        puVar27 = (undefined *)0x0;
        for (; piVar11 != piVar25; piVar11 = piVar11 + 1) {
          puVar12 = puVar27;
          if (puVar27 <= puVar35) {
            puVar12 = puVar35;
          }
          if (*piVar11 == 0) {
            puVar12 = puVar27;
          }
          puVar35 = puVar35 + 1;
          puVar27 = puVar12;
        }
code_r0x0047009c:
        uVar10 = *(undefined8 *)(puVar5 + -0x80);
        uVar2 = *(undefined8 *)(puVar5 + -0x70);
        uVar3 = *(undefined8 *)(puVar5 + -0x68);
        *(undefined8 *)(puVar9 + 0x1a) = *(undefined8 *)(puVar5 + -0x78);
        *(undefined8 *)(puVar9 + 0x18) = uVar10;
        *(undefined8 *)(puVar9 + 0x1e) = uVar3;
        *(undefined8 *)(puVar9 + 0x1c) = uVar2;
        uVar10 = *(undefined8 *)(puVar5 + -0x60);
        uVar2 = *(undefined8 *)(puVar5 + -0x50);
        uVar3 = *(undefined8 *)(puVar5 + -0x48);
        *(undefined8 *)(puVar9 + 0x22) = *(undefined8 *)(puVar5 + -0x58);
        *(undefined8 *)(puVar9 + 0x20) = uVar10;
        *(undefined8 *)(puVar9 + 0x26) = uVar3;
        *(undefined8 *)(puVar9 + 0x24) = uVar2;
        uVar10 = *(undefined8 *)(puVar5 + -0xc0);
        uVar2 = *(undefined8 *)(puVar5 + -0xb0);
        uVar3 = *(undefined8 *)(puVar5 + -0xa8);
        *(undefined8 *)(puVar9 + 10) = *(undefined8 *)(puVar5 + -0xb8);
        *(undefined8 *)(puVar9 + 8) = uVar10;
        *(undefined8 *)(puVar9 + 0xe) = uVar3;
        *(undefined8 *)(puVar9 + 0xc) = uVar2;
        uVar10 = *(undefined8 *)(puVar5 + -0xa0);
        uVar2 = *(undefined8 *)(puVar5 + -0x90);
        uVar3 = *(undefined8 *)(puVar5 + -0x88);
        *(undefined8 *)(puVar9 + 0x12) = *(undefined8 *)(puVar5 + -0x98);
        *(undefined8 *)(puVar9 + 0x10) = uVar10;
        *(undefined8 *)(puVar9 + 0x16) = uVar3;
        *(undefined8 *)(puVar9 + 0x14) = uVar2;
        uVar10 = *(undefined8 *)(puVar5 + -0xe0);
        uVar2 = *(undefined8 *)(puVar5 + -0xd0);
        uVar3 = *(undefined8 *)(puVar5 + -200);
        *(undefined8 *)(puVar9 + 2) = *(undefined8 *)(puVar5 + -0xd8);
        *(undefined8 *)puVar9 = uVar10;
        *(undefined8 *)(puVar9 + 6) = uVar3;
        *(undefined8 *)(puVar9 + 4) = uVar2;
        *(undefined **)(puVar9 + 0x28) = puVar27;
        return puVar9;
      }
      puVar27 = (undefined *)0x0;
      puVar14 = (undefined8 *)0x0;
      do {
        lVar15 = 0;
        puVar13 = puVar5 + (long)puVar14 * 4 + -0xe4;
        puVar4 = puVar14;
        lVar26 = 0;
        do {
          lVar34 = lVar26;
          puVar24 = puVar4;
          if ((int *)((long)piVar11 + lVar15) == piVar25) goto code_r0x0047009c;
          uVar20 = piVar11[lVar34];
          lVar26 = lVar34 + 1;
          puVar13 = puVar13 + 4;
          lVar15 = lVar15 + 4;
          puVar4 = (undefined8 *)((long)puVar24 + 1);
        } while (uVar20 == 0);
        lVar16 = 0;
        uVar8 = 0;
        param_5 = (undefined8 *)((long)puVar14 + lVar26);
        piVar11 = (int *)((long)piVar11 + lVar15);
        do {
          if ((undefined8 *)((long)&segment_command_00000020.cmdsize + 3) < puVar24)
          goto code_r0x00470100;
          unaff_x19 = (ulong)*(uint *)(puVar13 + lVar16);
          uVar21 = uVar8 + unaff_x19 + (ulong)*(uint *)((long)puVar9 + lVar16) * (ulong)uVar20;
          uVar8 = uVar21 >> 0x20;
          *(int *)(puVar13 + lVar16) = (int)uVar21;
          lVar16 = lVar16 + 4;
          puVar24 = (undefined8 *)((long)puVar24 + 1);
        } while ((long)puVar35 * 4 != lVar16);
        puVar12 = puVar35;
        if (uVar8 != 0) {
          if ((undefined *)0x27 < (undefined *)((long)puVar14 + (long)(puVar35 + lVar34)))
          goto code_r0x00470130;
          *(int *)(puVar5 + lVar26 * 4 + (long)(puVar35 + (long)puVar14) * 4 + -0xe4) =
               (int)(uVar21 >> 0x20);
          puVar12 = puVar35 + 1;
        }
        if (puVar27 <= (undefined *)((long)puVar14 + (long)(puVar12 + lVar34))) {
          puVar27 = (undefined *)((long)puVar14 + (long)(puVar12 + lVar34));
        }
        puVar14 = param_5;
      } while( true );
    }
    func_0x007a28b0(puVar35,0x28,&UNK_009e0b68);
    uVar22 = extraout_x8_00;
code_r0x004700ec:
    func_0x007a2570(uVar22,0x28,&UNK_009e0b68);
    puVar24 = extraout_x9_00;
code_r0x00470100:
    puVar12 = &UNK_009e0b68;
    func_0x007a2570(puVar24,0x28,&UNK_009e0b68);
    uVar8 = extraout_x11;
    lVar26 = extraout_x17;
LAB_00470114:
    func_0x007a2570(puVar12 + lVar26 + uVar8 + -1,0x28,&UNK_009e0b68);
    puVar35 = extraout_x8_01;
    puVar14 = extraout_x14_00;
    lVar26 = extraout_x17_00;
code_r0x00470130:
    auVar45 = func_0x007a2570((undefined *)((long)puVar14 + (long)(puVar35 + lVar26 + -1)),0x28,
                              &UNK_009e0b68);
    puVar9 = auVar45._0_8_;
    *(undefined1 **)(puVar5 + -0xf0) = puVar5 + -0x30;
    *(undefined8 *)(puVar5 + -0xe8) = 0x47014c;
    if (auVar45._8_4_ == 0) {
      func_0x007a247c(&UNK_00894dc0,0x1b,&UNK_009e0b68);
      uVar8 = extraout_x9_01;
    }
    else {
      uVar8 = *(ulong *)(puVar9 + 0x28);
      if (uVar8 < 0x29) {
        if (uVar8 != 0) {
          lVar15 = 0;
          lVar26 = uVar8 << 2;
          uVar8 = auVar45._8_8_ & 0xffffffff;
          do {
            uVar22 = (ulong)*(uint *)((long)puVar9 + lVar26 + -4) | lVar15 << 0x20;
            uVar21 = 0;
            if (uVar8 != 0) {
              uVar21 = uVar22 / uVar8;
            }
            lVar15 = uVar22 - uVar21 * uVar8;
            *(int *)((long)puVar9 + lVar26 + -4) = (int)uVar21;
            lVar26 = lVar26 + -4;
          } while (lVar26 != 0);
        }
        return puVar9;
      }
    }
    puVar14 = (undefined8 *)&UNK_009e0b68;
    auVar46 = func_0x007a28b0(uVar8,0x28);
    piVar11 = auVar46._8_8_;
    *(undefined8 *)(puVar5 + -0x150) = unaff_x28;
    *(long *)(puVar5 + -0x148) = unaff_x27;
    *(long *)(puVar5 + -0x140) = unaff_x26;
    *(int **)(puVar5 + -0x138) = unaff_x25;
    *(long *)(puVar5 + -0x130) = unaff_x24;
    *(undefined1 (*) [16])(puVar5 + -0x128) = auVar38;
    *(undefined8 **)(puVar5 + -0x118) = unaff_x21;
    *(undefined8 **)(puVar5 + -0x110) = unaff_x20;
    *(ulong *)(puVar5 + -0x108) = unaff_x19;
    *(undefined1 **)(puVar5 + -0x100) = puVar5 + -0xf0;
    *(undefined8 *)(puVar5 + -0xf8) = 0x4701d4;
    puVar13 = puVar5 + -0x100;
    unaff_x19 = *(ulong *)(piVar11 + 0x28);
    if (0x28 < unaff_x19) {
      puVar9 = (uint *)func_0x007a28b0(unaff_x19,0x28,&UNK_009e0b68);
code_r0x004703f8:
      func_0x007a28b0(puVar9,0x28,&UNK_009e0b68);
code_r0x00470408:
      func_0x007a20e8(&UNK_009e0b68);
LAB_00470414:
      uVar10 = func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b68);
      auVar38 = func_0x007a2570(uVar10,0x28,&UNK_009e0b68);
      *(undefined1 **)(puVar5 + -0x160) = puVar13;
      *(undefined **)(puVar5 + -0x158) =
           &
           __ZN68__LT_core__num__bignum__Big32x40_u20_as_u20_core__cmp__PartialEq_GT_2eq17h37df48bcdc16fcdcE
      ;
      iVar7 = _memcmp(auVar38._0_8_,auVar38._8_8_,0xa0);
      return (uint *)(ulong)(iVar7 == 0);
    }
    lVar26 = unaff_x19 << 2;
    piVar25 = piVar11;
    do {
      if (lVar26 == 0) goto LAB_00470414;
      iVar7 = *piVar25;
      lVar26 = lVar26 + -4;
      piVar25 = piVar25 + 1;
    } while (iVar7 == 0);
    puVar14[0x11] = 0;
    puVar14[0x10] = 0;
    puVar14[0x13] = 0;
    puVar14[0x12] = 0;
    puVar14[0xd] = 0;
    puVar14[0xc] = 0;
    puVar14[0xf] = 0;
    puVar14[0xe] = 0;
    puVar14[9] = 0;
    puVar14[8] = 0;
    puVar14[0xb] = 0;
    puVar14[10] = 0;
    puVar14[5] = 0;
    puVar14[4] = 0;
    puVar14[7] = 0;
    puVar14[6] = 0;
    puVar14[1] = 0;
    *puVar14 = 0;
    puVar14[3] = 0;
    puVar14[2] = 0;
    param_5[1] = 0;
    *param_5 = 0;
    param_5[3] = 0;
    param_5[2] = 0;
    param_5[5] = 0;
    param_5[4] = 0;
    param_5[7] = 0;
    param_5[6] = 0;
    param_5[9] = 0;
    param_5[8] = 0;
    param_5[0xb] = 0;
    param_5[10] = 0;
    param_5[0xd] = 0;
    param_5[0xc] = 0;
    param_5[0xf] = 0;
    param_5[0xe] = 0;
    param_5[0x11] = 0;
    param_5[0x10] = 0;
    param_5[0x13] = 0;
    param_5[0x12] = 0;
    param_5[0x14] = unaff_x19;
    puVar14[0x14] = 1;
    puVar9 = *(uint **)(auVar46._0_8_ + 0xa0);
    if (segment_command_00000020.segname + 1 <= puVar9) goto code_r0x004703f8;
    piVar25 = (int *)(auVar46._0_8_ + (long)puVar9 * 4);
    lVar26 = (long)puVar9 * -4;
    uVar8 = (long)puVar9 << 5 ^ 0xffffffffffffffff;
    do {
      if (lVar26 == 0) {
        return puVar9;
      }
      piVar25 = piVar25 + -1;
      lVar26 = lVar26 + 4;
      uVar8 = uVar8 + 0x20;
    } while (*piVar25 == 0);
    if (*piVar25 == 0) goto code_r0x00470408;
    unaff_x24 = ((uint)LZCOUNT(*piVar25) ^ 0x1f) - uVar8;
    if (unaff_x24 == 0) {
      return puVar9;
    }
    unaff_x25 = piVar11 + -1;
    unaff_x26 = (long)param_5 + -4;
    unaff_x28 = 1;
    unaff_x27 = unaff_x24 + -1;
    auVar45._8_8_ = 1;
    auVar45._0_8_ = param_5;
    puVar35 = &UNK_00470304;
    puVar5 = puVar5 + -0x150;
    unaff_x20 = param_5;
    unaff_x21 = puVar14;
    auVar38 = auVar46;
  } while( true );
}


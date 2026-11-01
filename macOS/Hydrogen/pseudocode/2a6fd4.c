
undefined8 FUN_002a6fd4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  byte *pbVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined1 auVar8 [16];
  bool bVar9;
  ulong uVar10;
  undefined8 uVar11;
  int iVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  int iVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 *puVar20;
  long lVar21;
  undefined1 (*pauVar22) [16];
  long lVar23;
  undefined8 *puVar24;
  ulong uVar25;
  long unaff_x19;
  ulong uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined1 auVar36 [16];
  undefined1 auStack_b0 [128];
  ulong in_stack_ffffffffffffffd8;
  uint uVar37;
  
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return param_1;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar13 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar13;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar13 * 8);
    return param_1;
  }
  auVar36 = func_0x0079db4c();
  auVar36._0_8_ = auVar36._0_8_;
  uVar11 = func_0x002a7034(auVar36._0_8_,auStack_b0 + 0x8c,auVar36._8_8_,param_3,param_4);
  if ((int)uVar11 == 0) {
    return uVar11;
  }
  uVar37 = (uint)(in_stack_ffffffffffffffd8 >> 0x20);
  if ((long)in_stack_ffffffffffffffd8 < 0) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/shift.c",0x49);
    return 0;
  }
  *(int *)(auVar36._0_8_ + 2) = (int)auVar36._0_8_[2];
  uVar7 = uVar37 >> 6;
  uVar26 = (ulong)uVar7;
  uVar11 = func_0x0029afb8(auVar36._0_8_,(long)(int)(uVar7 + (int)auVar36._0_8_[1] + 1));
  if ((int)uVar11 == 0) {
    return uVar11;
  }
  uVar15 = *auVar36._0_8_;
  uVar10 = *auVar36._0_8_;
  uVar6 = (uint)auVar36._0_8_[1];
  uVar14 = (ulong)uVar6;
  iVar12 = uVar6 + uVar7;
  *(undefined8 *)(uVar10 + (long)iVar12 * 8) = 0;
  uVar5 = uVar37 & 0x3f;
  uVar17 = CONCAT44(0,uVar5);
  if ((in_stack_ffffffffffffffd8 & 0x3f00000000) != 0) {
    if (0 < (int)uVar6) {
      uVar18 = (ulong)(0x40 - uVar5);
      uVar19 = uVar14;
      if (0x25 < uVar6) {
        lVar13 = uVar14 - 1;
        lVar21 = uVar14 * 8;
        uVar25 = (lVar21 + uVar15) - 8;
        if (uVar25 + lVar13 * -8 <= uVar25) {
          lVar23 = (uVar26 + uVar14) * 8;
          uVar25 = uVar10 + lVar23;
          if ((((uVar25 - 8) + lVar13 * -8 <= uVar25 - 8) && (uVar25 + lVar13 * -8 <= uVar25)) &&
             (iVar12 - (int)lVar13 <= iVar12)) {
            uVar2 = uVar10 + lVar23 + 8 + uVar14 * -8;
            uVar3 = uVar10 + uVar26 * 8;
            uVar4 = uVar10 + lVar23 + 8;
            if (((uVar4 <= uVar3 || uVar25 <= uVar2) &&
                (uVar15 + lVar21 <= uVar2 || uVar4 <= uVar15)) &&
               (uVar15 + lVar21 <= uVar3 || uVar25 <= uVar15)) {
              uVar19 = uVar14 & 3;
              pauVar22 = (undefined1 (*) [16])(lVar21 + uVar15 + -0x10);
              puVar24 = (undefined8 *)(lVar23 + uVar10 + -0x10);
              uVar25 = uVar14 & 0xfffffffc;
              iVar16 = iVar12;
              do {
                auVar30 = NEON_ext(*pauVar22,*pauVar22,8,1);
                auVar31 = NEON_ext(pauVar22[-1],pauVar22[-1],8,1);
                auVar32._8_8_ = -uVar18;
                auVar32._0_8_ = -uVar18;
                auVar36 = NEON_ushl(auVar30,auVar32,8);
                auVar8._8_8_ = -uVar18;
                auVar8._0_8_ = -uVar18;
                auVar32 = NEON_ushl(auVar31,auVar8,8);
                pbVar1 = (byte *)(uVar10 + (long)iVar16 * 8);
                uVar33 = *(undefined8 *)pbVar1;
                uVar11 = *(undefined8 *)(pbVar1 + -8);
                uVar35 = *(undefined8 *)(pbVar1 + -0x10);
                uVar34 = *(undefined8 *)(pbVar1 + -0x18);
                auVar36 = NEON_ext(auVar36,auVar36,8,1);
                *pbVar1 = (byte)uVar33 | auVar36[8];
                pbVar1[1] = (byte)((ulong)uVar33 >> 8) | auVar36[9];
                pbVar1[2] = (byte)((ulong)uVar33 >> 0x10) | auVar36[10];
                pbVar1[3] = (byte)((ulong)uVar33 >> 0x18) | auVar36[0xb];
                pbVar1[4] = (byte)((ulong)uVar33 >> 0x20) | auVar36[0xc];
                pbVar1[5] = (byte)((ulong)uVar33 >> 0x28) | auVar36[0xd];
                pbVar1[6] = (byte)((ulong)uVar33 >> 0x30) | auVar36[0xe];
                pbVar1[7] = (byte)((ulong)uVar33 >> 0x38) | auVar36[0xf];
                pbVar1[-8] = (byte)uVar11 | auVar36[0];
                pbVar1[-7] = (byte)((ulong)uVar11 >> 8) | auVar36[1];
                pbVar1[-6] = (byte)((ulong)uVar11 >> 0x10) | auVar36[2];
                pbVar1[-5] = (byte)((ulong)uVar11 >> 0x18) | auVar36[3];
                pbVar1[-4] = (byte)((ulong)uVar11 >> 0x20) | auVar36[4];
                pbVar1[-3] = (byte)((ulong)uVar11 >> 0x28) | auVar36[5];
                pbVar1[-2] = (byte)((ulong)uVar11 >> 0x30) | auVar36[6];
                pbVar1[-1] = (byte)((ulong)uVar11 >> 0x38) | auVar36[7];
                auVar36 = NEON_ext(auVar32,auVar32,8,1);
                pbVar1[-0x10] = (byte)uVar35 | auVar36[8];
                pbVar1[-0xf] = (byte)((ulong)uVar35 >> 8) | auVar36[9];
                pbVar1[-0xe] = (byte)((ulong)uVar35 >> 0x10) | auVar36[10];
                pbVar1[-0xd] = (byte)((ulong)uVar35 >> 0x18) | auVar36[0xb];
                pbVar1[-0xc] = (byte)((ulong)uVar35 >> 0x20) | auVar36[0xc];
                pbVar1[-0xb] = (byte)((ulong)uVar35 >> 0x28) | auVar36[0xd];
                pbVar1[-10] = (byte)((ulong)uVar35 >> 0x30) | auVar36[0xe];
                pbVar1[-9] = (byte)((ulong)uVar35 >> 0x38) | auVar36[0xf];
                pbVar1[-0x18] = (byte)uVar34 | auVar36[0];
                pbVar1[-0x17] = (byte)((ulong)uVar34 >> 8) | auVar36[1];
                pbVar1[-0x16] = (byte)((ulong)uVar34 >> 0x10) | auVar36[2];
                pbVar1[-0x15] = (byte)((ulong)uVar34 >> 0x18) | auVar36[3];
                pbVar1[-0x14] = (byte)((ulong)uVar34 >> 0x20) | auVar36[4];
                pbVar1[-0x13] = (byte)((ulong)uVar34 >> 0x28) | auVar36[5];
                pbVar1[-0x12] = (byte)((ulong)uVar34 >> 0x30) | auVar36[6];
                pbVar1[-0x11] = (byte)((ulong)uVar34 >> 0x38) | auVar36[7];
                auVar36._8_4_ = uVar5;
                auVar36._0_8_ = uVar17;
                auVar36._12_4_ = 0;
                auVar36 = NEON_ushl(auVar30,auVar36,8);
                auVar30._8_4_ = uVar5;
                auVar30._0_8_ = uVar17;
                auVar30._12_4_ = 0;
                auVar30 = NEON_ushl(auVar31,auVar30,8);
                auVar32 = NEON_ext(auVar36,auVar36,8,1);
                auVar36 = NEON_ext(auVar30,auVar30,8,1);
                puVar24[-1] = auVar36._8_8_;
                puVar24[-2] = auVar36._0_8_;
                puVar24[1] = auVar32._8_8_;
                *puVar24 = auVar32._0_8_;
                pauVar22 = pauVar22 + -2;
                iVar16 = iVar16 + -4;
                puVar24 = puVar24 + -4;
                uVar25 = uVar25 - 4;
              } while (uVar25 != 0);
              if ((uVar14 & 0xfffffffc) == uVar14) goto code_r0x0029ee70;
            }
          }
        }
      }
      do {
        uVar14 = *(ulong *)((uVar15 - 8) + uVar19 * 8);
        uVar5 = uVar7 + (int)uVar19;
        uVar25 = -(ulong)(uVar5 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar5 << 3;
        *(ulong *)(uVar10 + uVar25) = *(ulong *)(uVar10 + uVar25) | uVar14 >> (uVar18 & 0x3f);
        *(ulong *)(uVar10 + uVar26 * 8 + -8 + uVar19 * 8) = uVar14 << uVar17;
        bVar9 = uVar19 != 0;
        uVar19 = uVar19 - 1;
      } while (bVar9 && uVar19 != 0);
    }
    goto code_r0x0029ee70;
  }
  if ((int)uVar6 < 1) goto code_r0x0029ee70;
  if (uVar6 < 0xe) {
code_r0x0029ee4c:
    uVar17 = uVar14;
  }
  else {
    lVar13 = uVar14 * 8 + uVar15;
    lVar21 = (uVar26 + uVar14) * 8 + uVar10;
    if ((ulong)(lVar13 - lVar21) < 0x40) goto code_r0x0029ee4c;
    uVar17 = uVar14 & 7;
    puVar24 = (undefined8 *)(lVar21 + -0x20);
    puVar20 = (undefined8 *)(lVar13 + -0x20);
    uVar19 = uVar14 & 0xfffffff8;
    do {
      uVar29 = *puVar20;
      uVar28 = puVar20[3];
      uVar27 = puVar20[2];
      uVar34 = puVar20[-4];
      uVar35 = puVar20[-3];
      uVar11 = puVar20[-2];
      uVar33 = puVar20[-1];
      puVar24[1] = puVar20[1];
      *puVar24 = uVar29;
      puVar24[3] = uVar28;
      puVar24[2] = uVar27;
      puVar24[-3] = uVar35;
      puVar24[-4] = uVar34;
      puVar24[-1] = uVar33;
      puVar24[-2] = uVar11;
      puVar24 = puVar24 + -8;
      puVar20 = puVar20 + -8;
      uVar19 = uVar19 - 8;
    } while (uVar19 != 0);
    if ((uVar14 & 0xfffffff8) == uVar14) goto code_r0x0029ee70;
  }
  do {
    *(undefined8 *)(uVar10 + uVar26 * 8 + -8 + uVar17 * 8) =
         *(undefined8 *)((uVar15 - 8) + uVar17 * 8);
    bVar9 = uVar17 != 0;
    uVar17 = uVar17 - 1;
  } while (bVar9 && uVar17 != 0);
code_r0x0029ee70:
  if (0x3f < uVar37) {
    _bzero(uVar10,uVar7 << 3);
    iVar12 = (int)auVar36._0_8_[1] + uVar7;
  }
  uVar37 = iVar12 + 1;
  lVar13 = (ulong)uVar37 * 8;
  iVar16 = iVar12 + 2;
  do {
    lVar13 = lVar13 + -8;
    iVar16 = iVar16 + -1;
    if (iVar16 < 1) {
      *(uint *)(auVar36._0_8_ + 1) = uVar37 & (int)uVar37 >> 0x1f;
      if (iVar12 < -1) {
        return 1;
      }
      *(undefined4 *)(auVar36._0_8_ + 2) = 0;
      return 1;
    }
  } while (*(long *)(*auVar36._0_8_ + lVar13) == 0);
  *(int *)(auVar36._0_8_ + 1) = iVar16;
  return 1;
}


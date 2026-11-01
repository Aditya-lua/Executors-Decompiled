
undefined8
FUN_002a6e50(undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4,
            undefined8 param_5)

{
  byte *pbVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  undefined1 auVar9 [16];
  bool bVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  ulong *puVar15;
  undefined8 *puVar16;
  int iVar17;
  undefined4 uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  int iVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  undefined8 *puVar26;
  long lVar27;
  undefined1 (*pauVar28) [16];
  long lVar29;
  ulong uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined1 auVar40 [16];
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 *puStack_68;
  undefined1 *puStack_60;
  undefined *puStack_58;
  undefined1 auStack_6 [6];
  
  auVar40 = func_0x0079db4c();
  puVar16 = param_3;
  puVar26 = param_4;
  if (*(char *)(param_4 + 5) == '\0') {
    uVar14 = param_4[4];
    uVar19 = param_4[2];
    if (uVar19 != param_4[3]) {
      lVar12 = param_4[1];
LAB_002a6ee0:
      *(undefined8 *)(lVar12 + uVar19 * 8) = uVar14;
      param_4[2] = param_4[2] + 1;
      goto LAB_002a6ef0;
    }
    uVar11 = 0x20;
    if (uVar19 != 0) {
      uVar11 = uVar19 * 3 >> 1;
    }
    if ((uVar19 < uVar11 && uVar11 >> 0x3d == 0) &&
       (lVar12 = func_0x0036e48c(param_4[1],uVar11 << 3), lVar12 != 0)) {
      param_4[1] = lVar12;
      param_4[3] = uVar11;
      uVar19 = param_4[2];
      goto LAB_002a6ee0;
    }
    *(undefined2 *)(param_4 + 5) = 0x101;
    puVar13 = (undefined8 *)func_0x0029e340(param_4);
    if (puVar13 != (undefined8 *)0x0) goto LAB_002a6efc;
    uVar14 = 0;
  }
  else {
LAB_002a6ef0:
    puVar13 = (undefined8 *)func_0x0029e340(param_4);
    uVar14 = 0;
    if (puVar13 != (undefined8 *)0x0) {
LAB_002a6efc:
      if (puVar13 != param_3) {
        uVar14 = func_0x0029afb8(puVar13,(long)*(int *)(param_3 + 1));
        if ((int)uVar14 == 0) goto LAB_002a6f6c;
        uVar18 = 0;
        if (*(int *)(param_3 + 1) != 0) {
          puVar16 = (undefined8 *)((long)*(int *)(param_3 + 1) << 3);
          _memcpy(*puVar13,*param_3,puVar16);
          uVar18 = *(undefined4 *)(param_3 + 1);
        }
        *(undefined4 *)(puVar13 + 1) = uVar18;
        *(undefined4 *)(puVar13 + 2) = *(undefined4 *)(param_3 + 2);
      }
      uVar14 = func_0x0029b490(puVar13,2);
      if ((int)uVar14 != 0) {
        puVar26 = param_3;
        uVar14 = func_0x002a42a0(auVar40._0_8_,auVar40._8_8_,puVar13,param_3,param_4,param_5);
        puVar16 = puVar13;
      }
    }
  }
LAB_002a6f6c:
  if (*(char *)(param_4 + 5) != '\0') {
    return uVar14;
  }
  if (param_4[2] != 0) {
    lVar12 = param_4[2] + -1;
    param_4[2] = lVar12;
    param_4[4] = *(undefined8 *)(param_4[1] + lVar12 * 8);
    return uVar14;
  }
  auVar40 = func_0x0079db4c();
  puVar15 = auVar40._0_8_;
  puStack_58 = &_aws_lc_0_24_0_BN_gcd;
  uStack_70 = param_5;
  puStack_68 = param_4;
  puStack_60 = auStack_6 + -10;
  uVar14 = func_0x002a7034(puVar15,(long)&uStack_78 + 4,auVar40._8_8_,puVar16,puVar26);
  uVar2 = uStack_78._4_4_;
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  uStack_78 = param_3;
  if ((int)uStack_78._4_4_ < 0) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/shift.c",0x49);
    return 0;
  }
  *(int *)(puVar15 + 2) = (int)puVar15[2];
  uVar8 = uStack_78._4_4_ >> 6;
  uVar19 = (ulong)uVar8;
  uVar14 = func_0x0029afb8(puVar15,(long)(int)(uVar8 + (int)puVar15[1] + 1));
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  uVar21 = *puVar15;
  uVar11 = *puVar15;
  uVar7 = (uint)puVar15[1];
  uVar20 = (ulong)uVar7;
  iVar17 = uVar7 + uVar8;
  *(undefined8 *)(uVar11 + (long)iVar17 * 8) = 0;
  uVar6 = uVar2 & 0x3f;
  uVar23 = CONCAT44(0,uVar6);
  if (uVar6 != 0) {
    if (0 < (int)uVar7) {
      uVar24 = (ulong)(0x40 - uVar6);
      uVar25 = uVar20;
      if (0x25 < uVar7) {
        lVar12 = uVar20 - 1;
        lVar27 = uVar20 * 8;
        uVar30 = (lVar27 + uVar21) - 8;
        if (uVar30 + lVar12 * -8 <= uVar30) {
          lVar29 = (uVar19 + uVar20) * 8;
          uVar30 = uVar11 + lVar29;
          if ((((uVar30 - 8) + lVar12 * -8 <= uVar30 - 8) && (uVar30 + lVar12 * -8 <= uVar30)) &&
             (iVar17 - (int)lVar12 <= iVar17)) {
            uVar3 = uVar11 + lVar29 + 8 + uVar20 * -8;
            uVar4 = uVar11 + uVar19 * 8;
            uVar5 = uVar11 + lVar29 + 8;
            if (((uVar5 <= uVar4 || uVar30 <= uVar3) &&
                (uVar21 + lVar27 <= uVar3 || uVar5 <= uVar21)) &&
               (uVar21 + lVar27 <= uVar4 || uVar30 <= uVar21)) {
              uVar25 = uVar20 & 3;
              pauVar28 = (undefined1 (*) [16])(lVar27 + uVar21 + -0x10);
              puVar16 = (undefined8 *)(lVar29 + uVar11 + -0x10);
              uVar30 = uVar20 & 0xfffffffc;
              iVar22 = iVar17;
              do {
                auVar34 = NEON_ext(*pauVar28,*pauVar28,8,1);
                auVar35 = NEON_ext(pauVar28[-1],pauVar28[-1],8,1);
                auVar36._8_8_ = -uVar24;
                auVar36._0_8_ = -uVar24;
                auVar40 = NEON_ushl(auVar34,auVar36,8);
                auVar9._8_8_ = -uVar24;
                auVar9._0_8_ = -uVar24;
                auVar36 = NEON_ushl(auVar35,auVar9,8);
                pbVar1 = (byte *)(uVar11 + (long)iVar22 * 8);
                uVar37 = *(undefined8 *)pbVar1;
                uVar14 = *(undefined8 *)(pbVar1 + -8);
                uVar39 = *(undefined8 *)(pbVar1 + -0x10);
                uVar38 = *(undefined8 *)(pbVar1 + -0x18);
                auVar40 = NEON_ext(auVar40,auVar40,8,1);
                *pbVar1 = (byte)uVar37 | auVar40[8];
                pbVar1[1] = (byte)((ulong)uVar37 >> 8) | auVar40[9];
                pbVar1[2] = (byte)((ulong)uVar37 >> 0x10) | auVar40[10];
                pbVar1[3] = (byte)((ulong)uVar37 >> 0x18) | auVar40[0xb];
                pbVar1[4] = (byte)((ulong)uVar37 >> 0x20) | auVar40[0xc];
                pbVar1[5] = (byte)((ulong)uVar37 >> 0x28) | auVar40[0xd];
                pbVar1[6] = (byte)((ulong)uVar37 >> 0x30) | auVar40[0xe];
                pbVar1[7] = (byte)((ulong)uVar37 >> 0x38) | auVar40[0xf];
                pbVar1[-8] = (byte)uVar14 | auVar40[0];
                pbVar1[-7] = (byte)((ulong)uVar14 >> 8) | auVar40[1];
                pbVar1[-6] = (byte)((ulong)uVar14 >> 0x10) | auVar40[2];
                pbVar1[-5] = (byte)((ulong)uVar14 >> 0x18) | auVar40[3];
                pbVar1[-4] = (byte)((ulong)uVar14 >> 0x20) | auVar40[4];
                pbVar1[-3] = (byte)((ulong)uVar14 >> 0x28) | auVar40[5];
                pbVar1[-2] = (byte)((ulong)uVar14 >> 0x30) | auVar40[6];
                pbVar1[-1] = (byte)((ulong)uVar14 >> 0x38) | auVar40[7];
                auVar40 = NEON_ext(auVar36,auVar36,8,1);
                pbVar1[-0x10] = (byte)uVar39 | auVar40[8];
                pbVar1[-0xf] = (byte)((ulong)uVar39 >> 8) | auVar40[9];
                pbVar1[-0xe] = (byte)((ulong)uVar39 >> 0x10) | auVar40[10];
                pbVar1[-0xd] = (byte)((ulong)uVar39 >> 0x18) | auVar40[0xb];
                pbVar1[-0xc] = (byte)((ulong)uVar39 >> 0x20) | auVar40[0xc];
                pbVar1[-0xb] = (byte)((ulong)uVar39 >> 0x28) | auVar40[0xd];
                pbVar1[-10] = (byte)((ulong)uVar39 >> 0x30) | auVar40[0xe];
                pbVar1[-9] = (byte)((ulong)uVar39 >> 0x38) | auVar40[0xf];
                pbVar1[-0x18] = (byte)uVar38 | auVar40[0];
                pbVar1[-0x17] = (byte)((ulong)uVar38 >> 8) | auVar40[1];
                pbVar1[-0x16] = (byte)((ulong)uVar38 >> 0x10) | auVar40[2];
                pbVar1[-0x15] = (byte)((ulong)uVar38 >> 0x18) | auVar40[3];
                pbVar1[-0x14] = (byte)((ulong)uVar38 >> 0x20) | auVar40[4];
                pbVar1[-0x13] = (byte)((ulong)uVar38 >> 0x28) | auVar40[5];
                pbVar1[-0x12] = (byte)((ulong)uVar38 >> 0x30) | auVar40[6];
                pbVar1[-0x11] = (byte)((ulong)uVar38 >> 0x38) | auVar40[7];
                auVar40._8_4_ = uVar6;
                auVar40._0_8_ = uVar23;
                auVar40._12_4_ = 0;
                auVar40 = NEON_ushl(auVar34,auVar40,8);
                auVar34._8_4_ = uVar6;
                auVar34._0_8_ = uVar23;
                auVar34._12_4_ = 0;
                auVar34 = NEON_ushl(auVar35,auVar34,8);
                auVar36 = NEON_ext(auVar40,auVar40,8,1);
                auVar40 = NEON_ext(auVar34,auVar34,8,1);
                puVar16[-1] = auVar40._8_8_;
                puVar16[-2] = auVar40._0_8_;
                puVar16[1] = auVar36._8_8_;
                *puVar16 = auVar36._0_8_;
                pauVar28 = pauVar28 + -2;
                iVar22 = iVar22 + -4;
                puVar16 = puVar16 + -4;
                uVar30 = uVar30 - 4;
              } while (uVar30 != 0);
              if ((uVar20 & 0xfffffffc) == uVar20) goto code_r0x0029ee70;
            }
          }
        }
      }
      do {
        uVar20 = *(ulong *)((uVar21 - 8) + uVar25 * 8);
        uVar6 = uVar8 + (int)uVar25;
        uVar30 = -(ulong)(uVar6 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar6 << 3;
        *(ulong *)(uVar11 + uVar30) = *(ulong *)(uVar11 + uVar30) | uVar20 >> (uVar24 & 0x3f);
        *(ulong *)(uVar11 + uVar19 * 8 + -8 + uVar25 * 8) = uVar20 << uVar23;
        bVar10 = uVar25 != 0;
        uVar25 = uVar25 - 1;
      } while (bVar10 && uVar25 != 0);
    }
    goto code_r0x0029ee70;
  }
  if ((int)uVar7 < 1) goto code_r0x0029ee70;
  if (uVar7 < 0xe) {
code_r0x0029ee4c:
    uVar23 = uVar20;
  }
  else {
    lVar12 = uVar20 * 8 + uVar21;
    lVar27 = (uVar19 + uVar20) * 8 + uVar11;
    if ((ulong)(lVar12 - lVar27) < 0x40) goto code_r0x0029ee4c;
    uVar23 = uVar20 & 7;
    puVar16 = (undefined8 *)(lVar27 + -0x20);
    puVar26 = (undefined8 *)(lVar12 + -0x20);
    uVar25 = uVar20 & 0xfffffff8;
    do {
      uVar33 = *puVar26;
      uVar32 = puVar26[3];
      uVar31 = puVar26[2];
      uVar38 = puVar26[-4];
      uVar39 = puVar26[-3];
      uVar14 = puVar26[-2];
      uVar37 = puVar26[-1];
      puVar16[1] = puVar26[1];
      *puVar16 = uVar33;
      puVar16[3] = uVar32;
      puVar16[2] = uVar31;
      puVar16[-3] = uVar39;
      puVar16[-4] = uVar38;
      puVar16[-1] = uVar37;
      puVar16[-2] = uVar14;
      puVar16 = puVar16 + -8;
      puVar26 = puVar26 + -8;
      uVar25 = uVar25 - 8;
    } while (uVar25 != 0);
    if ((uVar20 & 0xfffffff8) == uVar20) goto code_r0x0029ee70;
  }
  do {
    *(undefined8 *)(uVar11 + uVar19 * 8 + -8 + uVar23 * 8) =
         *(undefined8 *)((uVar21 - 8) + uVar23 * 8);
    bVar10 = uVar23 != 0;
    uVar23 = uVar23 - 1;
  } while (bVar10 && uVar23 != 0);
code_r0x0029ee70:
  if (0x3f < uVar2) {
    _bzero(uVar11,uVar8 << 3);
    iVar17 = (int)puVar15[1] + uVar8;
  }
  uVar2 = iVar17 + 1;
  lVar12 = (ulong)uVar2 * 8;
  iVar22 = iVar17 + 2;
  do {
    lVar12 = lVar12 + -8;
    iVar22 = iVar22 + -1;
    if (iVar22 < 1) {
      *(uint *)(puVar15 + 1) = uVar2 & (int)uVar2 >> 0x1f;
      if (iVar17 < -1) {
        return 1;
      }
      *(undefined4 *)(puVar15 + 2) = 0;
      return 1;
    }
  } while (*(long *)(*puVar15 + lVar12) == 0);
  *(int *)(puVar15 + 1) = iVar22;
  return 1;
}


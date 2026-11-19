/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc0714
 */

ulong HUF_readStats_wksp(byte *param_1,ulong param_2,undefined8 *param_3,int *param_4,int *param_5,
                        byte *param_6,ulong param_7,undefined8 param_8,undefined8 param_9)

{
  bool bVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  byte *pbVar5;
  ulong uVar6;
  ulong uVar7;
  int iVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  undefined8 uVar16;
  byte bVar23;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  undefined8 uVar24;
  byte bVar31;
  byte bVar39;
  uint7 uVar32;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  undefined8 uVar33;
  byte bVar40;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  undefined8 uVar41;
  byte bVar48;
  ulong uVar49;
  
  if (param_7 == 0) {
    return 0xffffffffffffffb8;
  }
  uVar15 = (ulong)*param_6;
  if (-1 < (char)*param_6) {
    if (param_7 <= uVar15) {
      return 0xffffffffffffffb8;
    }
    uVar6 = FSE_decompress_wksp_bmi2(param_1,param_2 - 1,param_6 + 1,uVar15,6,param_8,param_9,0);
    uVar7 = uVar15;
    if (0xffffffffffffff88 < uVar6) {
      return uVar6;
    }
    goto LAB_00bc082c;
  }
  uVar7 = uVar15 - 0x7e >> 1;
  if (param_7 <= uVar7) {
    return 0xffffffffffffffb8;
  }
  uVar6 = uVar15 - 0x7f;
  if (param_2 <= uVar6) {
    return 0xffffffffffffffec;
  }
  if (uVar6 == 0) {
    *(undefined4 *)(param_3 + 6) = 0;
    param_3[3] = 0;
    param_3[2] = 0;
    param_3[5] = 0;
    param_3[4] = 0;
    param_3[1] = 0;
    *param_3 = 0;
    return 0xffffffffffffffec;
  }
  uVar11 = uVar15 - 0x80;
  if ((uVar11 < 0xe) ||
     ((pbVar2 = param_6 + 1, param_1 < param_6 + (uVar11 >> 1) + 2 &&
      (pbVar2 < param_1 + (uVar15 & 0x7e) + 2)))) {
    uVar15 = 0;
  }
  else {
    uVar12 = (uVar11 >> 1) + 1;
    if (uVar11 < 0x3e) {
      uVar11 = 0;
    }
    else {
      uVar15 = 0;
      uVar11 = uVar12 & 0x60;
      pbVar5 = param_1 + 0x20;
      do {
        uVar13 = uVar15 & 0x7fffffffffffffe0;
        uVar15 = uVar15 + 0x20;
        pbVar3 = pbVar2 + uVar13;
        uVar24 = *(undefined8 *)(pbVar3 + 8);
        uVar16 = *(undefined8 *)pbVar3;
        uVar41 = *(undefined8 *)(pbVar3 + 0x18);
        uVar33 = *(undefined8 *)(pbVar3 + 0x10);
        bVar34 = (byte)((ulong)uVar33 >> 8);
        bVar35 = (byte)((ulong)uVar33 >> 0x10);
        bVar36 = (byte)((ulong)uVar33 >> 0x18);
        bVar37 = (byte)((ulong)uVar33 >> 0x20);
        bVar38 = (byte)((ulong)uVar33 >> 0x28);
        bVar39 = (byte)((ulong)uVar33 >> 0x30);
        bVar40 = (byte)((ulong)uVar33 >> 0x38);
        bVar42 = (byte)((ulong)uVar41 >> 8);
        bVar43 = (byte)((ulong)uVar41 >> 0x10);
        bVar44 = (byte)((ulong)uVar41 >> 0x18);
        bVar45 = (byte)((ulong)uVar41 >> 0x20);
        bVar46 = (byte)((ulong)uVar41 >> 0x28);
        bVar47 = (byte)((ulong)uVar41 >> 0x30);
        bVar48 = (byte)((ulong)uVar41 >> 0x38);
        bVar17 = (byte)((ulong)uVar16 >> 8);
        bVar18 = (byte)((ulong)uVar16 >> 0x10);
        bVar19 = (byte)((ulong)uVar16 >> 0x18);
        bVar20 = (byte)((ulong)uVar16 >> 0x20);
        bVar21 = (byte)((ulong)uVar16 >> 0x28);
        bVar22 = (byte)((ulong)uVar16 >> 0x30);
        bVar23 = (byte)((ulong)uVar16 >> 0x38);
        bVar25 = (byte)((ulong)uVar24 >> 8);
        bVar26 = (byte)((ulong)uVar24 >> 0x10);
        bVar27 = (byte)((ulong)uVar24 >> 0x18);
        bVar28 = (byte)((ulong)uVar24 >> 0x20);
        bVar29 = (byte)((ulong)uVar24 >> 0x28);
        bVar30 = (byte)((ulong)uVar24 >> 0x30);
        bVar31 = (byte)((ulong)uVar24 >> 0x38);
        *pbVar5 = (byte)uVar33 >> 4;
        pbVar5[1] = (byte)uVar33 & 0xf;
        pbVar5[2] = bVar34 >> 4;
        pbVar5[3] = bVar34 & 0xf;
        pbVar5[4] = bVar35 >> 4;
        pbVar5[5] = bVar35 & 0xf;
        pbVar5[6] = bVar36 >> 4;
        pbVar5[7] = bVar36 & 0xf;
        pbVar5[8] = bVar37 >> 4;
        pbVar5[9] = bVar37 & 0xf;
        pbVar5[10] = bVar38 >> 4;
        pbVar5[0xb] = bVar38 & 0xf;
        pbVar5[0xc] = bVar39 >> 4;
        pbVar5[0xd] = bVar39 & 0xf;
        pbVar5[0xe] = bVar40 >> 4;
        pbVar5[0xf] = bVar40 & 0xf;
        pbVar5[0x10] = (byte)uVar41 >> 4;
        pbVar5[0x11] = (byte)uVar41 & 0xf;
        pbVar5[0x12] = bVar42 >> 4;
        pbVar5[0x13] = bVar42 & 0xf;
        pbVar5[0x14] = bVar43 >> 4;
        pbVar5[0x15] = bVar43 & 0xf;
        pbVar5[0x16] = bVar44 >> 4;
        pbVar5[0x17] = bVar44 & 0xf;
        pbVar5[0x18] = bVar45 >> 4;
        pbVar5[0x19] = bVar45 & 0xf;
        pbVar5[0x1a] = bVar46 >> 4;
        pbVar5[0x1b] = bVar46 & 0xf;
        pbVar5[0x1c] = bVar47 >> 4;
        pbVar5[0x1d] = bVar47 & 0xf;
        pbVar5[0x1e] = bVar48 >> 4;
        pbVar5[0x1f] = bVar48 & 0xf;
        pbVar5[-0x20] = (byte)uVar16 >> 4;
        pbVar5[-0x1f] = (byte)uVar16 & 0xf;
        pbVar5[-0x1e] = bVar17 >> 4;
        pbVar5[-0x1d] = bVar17 & 0xf;
        pbVar5[-0x1c] = bVar18 >> 4;
        pbVar5[-0x1b] = bVar18 & 0xf;
        pbVar5[-0x1a] = bVar19 >> 4;
        pbVar5[-0x19] = bVar19 & 0xf;
        pbVar5[-0x18] = bVar20 >> 4;
        pbVar5[-0x17] = bVar20 & 0xf;
        pbVar5[-0x16] = bVar21 >> 4;
        pbVar5[-0x15] = bVar21 & 0xf;
        pbVar5[-0x14] = bVar22 >> 4;
        pbVar5[-0x13] = bVar22 & 0xf;
        pbVar5[-0x12] = bVar23 >> 4;
        pbVar5[-0x11] = bVar23 & 0xf;
        pbVar5[-0x10] = (byte)uVar24 >> 4;
        pbVar5[-0xf] = (byte)uVar24 & 0xf;
        pbVar5[-0xe] = bVar25 >> 4;
        pbVar5[-0xd] = bVar25 & 0xf;
        pbVar5[-0xc] = bVar26 >> 4;
        pbVar5[-0xb] = bVar26 & 0xf;
        pbVar5[-10] = bVar27 >> 4;
        pbVar5[-9] = bVar27 & 0xf;
        pbVar5[-8] = bVar28 >> 4;
        pbVar5[-7] = bVar28 & 0xf;
        pbVar5[-6] = bVar29 >> 4;
        pbVar5[-5] = bVar29 & 0xf;
        pbVar5[-4] = bVar30 >> 4;
        pbVar5[-3] = bVar30 & 0xf;
        pbVar5[-2] = bVar31 >> 4;
        pbVar5[-1] = bVar31 & 0xf;
        pbVar5 = pbVar5 + 0x40;
      } while (uVar11 != uVar15);
      if (uVar12 == uVar11) goto LAB_00bc082c;
      if ((uVar12 & 0x18) == 0) {
        uVar15 = uVar11 << 1;
        goto LAB_00bc07f4;
      }
    }
    uVar13 = uVar12 & 0x78;
    pbVar5 = param_1 + uVar11 * 2;
    uVar15 = uVar13 << 1;
    do {
      uVar14 = uVar11 & 0x7ffffffffffffff8;
      uVar11 = uVar11 + 8;
      uVar14 = *(ulong *)(pbVar2 + uVar14);
      uVar32 = CONCAT16((byte)(uVar14 >> 0x30) >> 4,
                        CONCAT15((byte)(uVar14 >> 0x28) >> 4,
                                 CONCAT14((byte)(uVar14 >> 0x20) >> 4,
                                          CONCAT13((byte)(uVar14 >> 0x18) >> 4,
                                                   CONCAT12((byte)(uVar14 >> 0x10) >> 4,
                                                            CONCAT11((byte)(uVar14 >> 8) >> 4,
                                                                     (char)(uVar14 >> 4))))))) &
               0xffffffffffff0f;
      uVar49 = uVar14 & 0xf0f0f0f0f0f0f0f;
      *pbVar5 = (byte)uVar32;
      pbVar5[1] = (byte)uVar49;
      pbVar5[2] = (byte)(uVar32 >> 8);
      pbVar5[3] = (byte)(uVar49 >> 8);
      pbVar5[4] = (byte)(uVar32 >> 0x10);
      pbVar5[5] = (byte)(uVar49 >> 0x10);
      pbVar5[6] = (byte)(uVar32 >> 0x18);
      pbVar5[7] = (byte)(uVar49 >> 0x18);
      pbVar5[8] = (byte)(uVar32 >> 0x20);
      pbVar5[9] = (byte)(uVar49 >> 0x20);
      pbVar5[10] = (byte)(uVar32 >> 0x28);
      pbVar5[0xb] = (byte)(uVar49 >> 0x28);
      pbVar5[0xc] = (byte)(uVar32 >> 0x30);
      pbVar5[0xd] = (byte)(uVar49 >> 0x30);
      pbVar5[0xe] = (byte)(uVar14 >> 0x3c);
      pbVar5[0xf] = (byte)(uVar49 >> 0x38);
      pbVar5 = pbVar5 + 0x10;
    } while (uVar13 != uVar11);
    if (uVar12 == uVar13) goto LAB_00bc082c;
  }
LAB_00bc07f4:
  param_6 = param_6 + (uVar15 >> 1);
  do {
    param_6 = param_6 + 1;
    pbVar2 = param_1 + uVar15;
    uVar15 = uVar15 + 2;
    *pbVar2 = *param_6 >> 4;
    pbVar2[1] = *param_6 & 0xf;
  } while (uVar15 < uVar6);
LAB_00bc082c:
  *(undefined4 *)(param_3 + 6) = 0;
  param_3[3] = 0;
  param_3[2] = 0;
  param_3[5] = 0;
  param_3[4] = 0;
  param_3[1] = 0;
  *param_3 = 0;
  if (uVar6 != 0) {
    iVar8 = 0;
    uVar15 = 0;
    uVar11 = 1;
    do {
      uVar12 = (ulong)param_1[uVar15];
      if (0xc < uVar12) {
        return 0xffffffffffffffec;
      }
      *(int *)((long)param_3 + uVar12 * 4) = *(int *)((long)param_3 + uVar12 * 4) + 1;
      iVar8 = iVar8 + ((1 << (ulong)(param_1[uVar15] & 0x1f)) >> 1);
      bVar1 = uVar11 < uVar6;
      uVar15 = uVar11;
      uVar11 = (ulong)((int)uVar11 + 1);
    } while (bVar1);
    if ((iVar8 != 0) && (uVar10 = (uint)LZCOUNT(iVar8), (uVar10 ^ 0x1c) < 0xc)) {
      uVar4 = (1 << (ulong)(-uVar10 & 0x1f)) - iVar8;
      uVar9 = (uint)LZCOUNT(uVar4);
      *param_5 = 0x20 - uVar10;
      if (0x80000000U >> (ulong)(uVar9 & 0x1f) == uVar4) {
        uVar9 = 0x20 - uVar9;
        param_1[uVar6] = (byte)uVar9;
        *(int *)((long)param_3 + (ulong)uVar9 * 4) = *(int *)((long)param_3 + (ulong)uVar9 * 4) + 1;
        if (*(uint *)((long)param_3 + 4) < 2) {
          return 0xffffffffffffffec;
        }
        if ((*(uint *)((long)param_3 + 4) & 1) == 0) {
          *param_4 = (int)uVar6 + 1;
          return uVar7 + 1;
        }
        return 0xffffffffffffffec;
      }
    }
  }
  return 0xffffffffffffffec;
}


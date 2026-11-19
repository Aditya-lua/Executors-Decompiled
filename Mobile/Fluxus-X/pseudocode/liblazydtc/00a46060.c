/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a46060
 */

void FUN_00a46060(int *param_1,int *param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  int iVar29;
  int iVar30;
  int iVar31;
  int iVar32;
  int iVar33;
  int iVar34;
  int iVar35;
  int iVar36;
  int iVar37;
  int iVar38;
  long lVar39;
  long lVar40;
  long lVar41;
  long lVar42;
  long lVar43;
  long lVar44;
  long lVar45;
  long lVar46;
  long lVar47;
  long lVar48;
  long lVar49;
  long lVar50;
  long lVar51;
  long lVar52;
  int local_78;
  int local_74;
  int local_70;
  int local_6c;
  int local_68;
  int local_64;
  int local_60;
  int local_5c;
  int local_58;
  int local_54;
  
  FUN_00a46500();
  FUN_00a46500(param_1 + 0x14,param_2 + 10);
  lVar20 = (long)param_2[0x14];
  lVar25 = (long)param_2[0x15];
  lVar21 = (long)param_2[0x16];
  lVar26 = (long)param_2[0x17];
  lVar22 = (long)param_2[0x18];
  lVar27 = (long)param_2[0x19];
  lVar23 = (long)param_2[0x1a];
  lVar28 = (long)param_2[0x1b];
  lVar44 = lVar20 * 2;
  lVar39 = lVar25 * 2;
  lVar42 = lVar21 * 2;
  lVar24 = (long)param_2[0x1c];
  lVar43 = (long)param_2[0x1d];
  lVar45 = lVar26 * 2;
  lVar40 = lVar22 * 2;
  lVar49 = lVar27 * 2;
  lVar51 = lVar23 * 0x13;
  lVar52 = lVar28 * 0x26;
  lVar50 = lVar24 * 0x13;
  lVar47 = lVar28 * 2;
  lVar41 = lVar43 * 0x26;
  lVar46 = (lVar20 * lVar20 + lVar27 * lVar27 * 0x26 + lVar51 * lVar40 + lVar52 * lVar45 +
            lVar50 * lVar42 + lVar41 * lVar39) * 2;
  lVar48 = (lVar21 * lVar21 + lVar45 * lVar39 + lVar22 * lVar44 + lVar52 * lVar28 +
            lVar23 * lVar50 * 2 + lVar41 * lVar49) * 2;
  uVar11 = lVar46 + 0x2000000;
  uVar12 = lVar48 + 0x2000000;
  lVar20 = ((long)uVar11 >> 0x1a) +
           (lVar44 * lVar25 + lVar51 * lVar49 + lVar52 * lVar22 + lVar50 * lVar45 + lVar41 * lVar21)
           * 2;
  lVar13 = ((long)uVar12 >> 0x1a) +
           (lVar42 * lVar26 + lVar22 * lVar39 + lVar27 * lVar44 + lVar50 * lVar47 + lVar41 * lVar23)
           * 2;
  lVar14 = lVar20 + 0x1000000;
  lVar15 = lVar13 + 0x1000000;
  lVar25 = (lVar14 >> 0x19) +
           (lVar39 * lVar25 + lVar21 * lVar44 + lVar51 * lVar23 + lVar52 * lVar49 + lVar50 * lVar40
           + lVar41 * lVar45) * 2;
  lVar51 = (lVar15 >> 0x19) +
           (lVar22 * lVar42 + lVar45 * lVar26 + lVar49 * lVar39 + lVar23 * lVar44 + lVar50 * lVar24
           + lVar41 * lVar47) * 2;
  lVar16 = lVar51 + 0x2000000;
  lVar17 = (lVar16 >> 0x1a) +
           (lVar45 * lVar22 + lVar27 * lVar42 + lVar23 * lVar39 + lVar28 * lVar44 + lVar41 * lVar24)
           * 2;
  lVar18 = lVar17 + 0x1000000;
  lVar47 = (lVar18 >> 0x19) +
           (lVar22 * lVar22 + lVar23 * lVar42 + lVar49 * lVar45 + lVar47 * lVar39 + lVar24 * lVar44
           + lVar41 * lVar43) * 2;
  lVar19 = lVar47 + 0x2000000;
  lVar24 = (lVar19 >> 0x1a) +
           (lVar40 * lVar27 + lVar23 * lVar45 + lVar28 * lVar42 + lVar24 * lVar39 + lVar43 * lVar44)
           * 2;
  lVar27 = lVar24 + 0x1000000;
  lVar43 = (lVar46 - (uVar11 & 0xfffffffffc000000)) + (lVar27 >> 0x19) * 0x13;
  lVar28 = lVar25 + 0x2000000;
  lVar21 = (lVar28 >> 0x1a) +
           (lVar39 * lVar21 + lVar26 * lVar44 + lVar52 * lVar23 + lVar50 * lVar49 + lVar41 * lVar22)
           * 2;
  lVar22 = lVar21 + 0x1000000;
  lVar23 = (lVar48 - (uVar12 & 0xfffffffffc000000)) + (lVar22 >> 0x19);
  param_1[0x20] = (int)lVar25 - ((uint)lVar28 & 0xfc000000);
  param_1[0x21] = (int)lVar21 - ((uint)lVar22 & 0xfe000000);
  uVar11 = lVar23 + 0x2000000;
  param_1[0x24] = (int)lVar51 - ((uint)lVar16 & 0xfc000000);
  param_1[0x25] = (int)lVar17 - ((uint)lVar18 & 0xfe000000);
  param_1[0x22] = (int)lVar23 - ((uint)uVar11 & 0xfc000000);
  param_1[0x23] = ((int)lVar13 - ((uint)lVar15 & 0xfe000000)) + (int)(uVar11 >> 0x1a);
  uVar11 = lVar43 + 0x2000000;
  param_1[0x26] = (int)lVar47 - ((uint)lVar19 & 0xfc000000);
  param_1[0x27] = (int)lVar24 - ((uint)lVar27 & 0xfe000000);
  param_1[0x1e] = (int)lVar43 - ((uint)uVar11 & 0xfc000000);
  param_1[0x1f] = ((int)lVar20 - ((uint)lVar14 & 0xfe000000)) + (int)(uVar11 >> 0x1a);
  param_1[10] = param_2[10] + *param_2;
  param_1[0xb] = param_2[0xb] + param_2[1];
  param_1[0xc] = param_2[0xc] + param_2[2];
  param_1[0xd] = param_2[0xd] + param_2[3];
  param_1[0xe] = param_2[0xe] + param_2[4];
  param_1[0xf] = param_2[0xf] + param_2[5];
  param_1[0x10] = param_2[0x10] + param_2[6];
  param_1[0x11] = param_2[0x11] + param_2[7];
  param_1[0x12] = param_2[0x12] + param_2[8];
  param_1[0x13] = param_2[0x13] + param_2[9];
  FUN_00a46500(&local_78,param_1 + 10);
  iVar1 = *param_1 + param_1[0x14];
  iVar29 = param_1[0x14] - *param_1;
  iVar2 = param_1[1] + param_1[0x15];
  iVar30 = param_1[0x15] - param_1[1];
  iVar3 = param_1[2] + param_1[0x16];
  iVar31 = param_1[0x16] - param_1[2];
  iVar4 = param_1[3] + param_1[0x17];
  iVar32 = param_1[0x17] - param_1[3];
  iVar5 = param_1[4] + param_1[0x18];
  iVar33 = param_1[0x18] - param_1[4];
  iVar6 = param_1[5] + param_1[0x19];
  iVar34 = param_1[0x19] - param_1[5];
  iVar7 = param_1[6] + param_1[0x1a];
  iVar35 = param_1[0x1a] - param_1[6];
  iVar8 = param_1[7] + param_1[0x1b];
  iVar36 = param_1[0x1b] - param_1[7];
  iVar9 = param_1[8] + param_1[0x1c];
  iVar37 = param_1[0x1c] - param_1[8];
  iVar10 = param_1[9] + param_1[0x1d];
  iVar38 = param_1[0x1d] - param_1[9];
  param_1[10] = iVar1;
  param_1[0xb] = iVar2;
  param_1[0xc] = iVar3;
  param_1[0xd] = iVar4;
  param_1[0xe] = iVar5;
  param_1[0xf] = iVar6;
  param_1[0x10] = iVar7;
  param_1[0x11] = iVar8;
  param_1[0x12] = iVar9;
  param_1[0x13] = iVar10;
  param_1[0x14] = iVar29;
  param_1[0x15] = iVar30;
  param_1[0x16] = iVar31;
  param_1[0x17] = iVar32;
  param_1[0x18] = iVar33;
  param_1[0x19] = iVar34;
  param_1[0x1a] = iVar35;
  param_1[0x1b] = iVar36;
  param_1[0x1c] = iVar37;
  param_1[0x1d] = iVar38;
  *param_1 = local_78 - iVar1;
  param_1[1] = local_74 - iVar2;
  param_1[2] = local_70 - iVar3;
  param_1[3] = local_6c - iVar4;
  param_1[4] = local_68 - iVar5;
  param_1[5] = local_64 - iVar6;
  param_1[6] = local_60 - iVar7;
  param_1[7] = local_5c - iVar8;
  param_1[8] = local_58 - iVar9;
  param_1[0x1e] = param_1[0x1e] - iVar29;
  param_1[0x1f] = param_1[0x1f] - iVar30;
  param_1[0x20] = param_1[0x20] - iVar31;
  param_1[0x21] = param_1[0x21] - iVar32;
  param_1[0x22] = param_1[0x22] - iVar33;
  param_1[0x23] = param_1[0x23] - iVar34;
  param_1[0x24] = param_1[0x24] - iVar35;
  param_1[0x25] = param_1[0x25] - iVar36;
  param_1[0x26] = param_1[0x26] - iVar37;
  param_1[0x27] = param_1[0x27] - iVar38;
  param_1[9] = local_54 - iVar10;
  return;
}


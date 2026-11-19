/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4812c
 */

void FUN_00a4812c(long *param_1,long param_2,int param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  long *plVar18;
  ulong uVar19;
  long local_130;
  long local_128;
  long lStack_120;
  long local_118;
  long lStack_110;
  long local_108;
  long local_100;
  long lStack_f8;
  long local_f0;
  long local_e8;
  long local_e0;
  long local_d8;
  long local_d0;
  long local_c8;
  long local_c0;
  long lStack_b8;
  long local_b0;
  long lStack_a8;
  long local_a0;
  long lStack_98;
  long local_90;
  long lStack_88;
  long local_80;
  long lStack_78;
  
  plVar18 = param_1 + 8;
  uVar8 = (param_1[9] + 0x1fffffffffffffe) - param_1[1];
  uVar10 = (param_1[10] + 0x1fffffffffffffe) - param_1[2];
  uVar4 = (*plVar18 + 0x1fffffffffffffe) - *param_1;
  uVar14 = (param_1[0xb] + 0x1fffffffffffffe) - param_1[3];
  uVar11 = (param_1[0xd] + 0x1fffffffffffffe) - param_1[5];
  uVar15 = (param_1[0xf] + 0x1fffffffffffffe) - param_1[7];
  uVar12 = (param_1[0xe] + 0x1fffffffffffffe) - param_1[6];
  uVar16 = uVar15 >> 0x38;
  local_d8 = (uVar14 & 0xffffffffffffff) + (uVar10 >> 0x38);
  lStack_b8 = (uVar15 & 0xffffffffffffff) + (uVar12 >> 0x38);
  local_e0 = (uVar10 & 0xffffffffffffff) + (uVar8 >> 0x38);
  uVar10 = uVar16 + ((param_1[0xc] + 0x1fffffffffffffc) - param_1[4]);
  local_c0 = (uVar12 & 0xffffffffffffff) + (uVar11 >> 0x38);
  local_e8 = (uVar8 & 0xffffffffffffff) + (uVar4 >> 0x38);
  local_c8 = (uVar11 & 0xffffffffffffff) + (uVar10 >> 0x38);
  local_f0 = uVar16 + (uVar4 & 0xffffffffffffff);
  local_d0 = (uVar10 & 0xffffffffffffff) + (uVar14 >> 0x38);
  gf_mul(&local_b0,param_2,&local_f0);
  uVar4 = (ulong)(param_1[0xf] + param_1[7]) >> 0x38;
  local_d8 = (param_1[0xb] + param_1[3] & 0xffffffffffffffU) +
             ((ulong)(param_1[10] + param_1[2]) >> 0x38);
  lStack_b8 = (param_1[0xf] + param_1[7] & 0xffffffffffffffU) +
              ((ulong)(param_1[0xe] + param_1[6]) >> 0x38);
  local_e0 = (param_1[10] + param_1[2] & 0xffffffffffffffU) +
             ((ulong)(param_1[9] + param_1[1]) >> 0x38);
  uVar10 = uVar4 + param_1[0xc] + param_1[4];
  local_c0 = (param_1[0xe] + param_1[6] & 0xffffffffffffffU) +
             ((ulong)(param_1[0xd] + param_1[5]) >> 0x38);
  local_e8 = (param_1[9] + param_1[1] & 0xffffffffffffffU) + ((ulong)(*plVar18 + *param_1) >> 0x38);
  local_c8 = (param_1[0xd] + param_1[5] & 0xffffffffffffffU) + (uVar10 >> 0x38);
  local_f0 = uVar4 + (*plVar18 + *param_1 & 0xffffffffffffffU);
  local_d0 = (uVar10 & 0xffffffffffffff) + ((ulong)(param_1[0xb] + param_1[3]) >> 0x38);
  gf_mul(plVar18,param_2 + 0x40,&local_f0);
  gf_mul(param_1,param_2 + 0x80,param_1 + 0x18);
  uVar10 = *plVar18 + local_b0;
  uVar4 = param_1[9] + lStack_a8;
  uVar8 = param_1[0xe] + local_80;
  uVar11 = param_1[0xf] + lStack_78;
  uVar12 = param_1[10] + local_a0;
  uVar14 = param_1[0xd] + lStack_88;
  uVar15 = (0x1fffffffffffffe - local_b0) + *plVar18;
  uVar6 = uVar11 >> 0x38;
  uVar16 = (0x1fffffffffffffe - lStack_a8) + param_1[9];
  uVar1 = (0x1fffffffffffffe - local_80) + param_1[0xe];
  uVar2 = (0x1fffffffffffffe - lStack_78) + param_1[0xf];
  uVar3 = param_1[0xb] + lStack_98;
  uVar7 = (0x1fffffffffffffe - local_a0) + param_1[10];
  uVar9 = (0x1fffffffffffffe - lStack_88) + param_1[0xd];
  uVar13 = uVar6 + param_1[0xc] + local_90;
  lStack_f8 = (uVar11 & 0xffffffffffffff) + (uVar8 >> 0x38);
  local_100 = (uVar8 & 0xffffffffffffff) + (uVar14 >> 0x38);
  local_130 = uVar6 + (uVar10 & 0xffffffffffffff);
  uVar6 = uVar2 >> 0x38;
  uVar8 = (0x1fffffffffffffe - lStack_98) + param_1[0xb];
  lStack_120 = (uVar12 & 0xffffffffffffff) + (uVar4 >> 0x38);
  local_108 = (uVar14 & 0xffffffffffffff) + (uVar13 >> 0x38);
  uVar11 = uVar6 + (0x1fffffffffffffc - local_90) + param_1[0xc];
  local_118 = (uVar3 & 0xffffffffffffff) + (uVar12 >> 0x38);
  local_128 = (uVar4 & 0xffffffffffffff) + (uVar10 >> 0x38);
  lStack_110 = (uVar13 & 0xffffffffffffff) + (uVar3 >> 0x38);
  local_c8 = (uVar9 & 0xffffffffffffff) + (uVar11 >> 0x38);
  lStack_b8 = (uVar2 & 0xffffffffffffff) + (uVar1 >> 0x38);
  local_c0 = (uVar1 & 0xffffffffffffff) + (uVar9 >> 0x38);
  local_d8 = (uVar8 & 0xffffffffffffff) + (uVar7 >> 0x38);
  local_e0 = (uVar7 & 0xffffffffffffff) + (uVar16 >> 0x38);
  local_e8 = (uVar16 & 0xffffffffffffff) + (uVar15 >> 0x38);
  local_f0 = uVar6 + (uVar15 & 0xffffffffffffff);
  local_d0 = (uVar11 & 0xffffffffffffff) + (uVar8 >> 0x38);
  lVar5 = param_1[0x10];
  uVar10 = param_1[3] + param_1[0x13];
  uVar4 = param_1[6] + param_1[0x16];
  uVar8 = param_1[7] + param_1[0x17];
  uVar1 = (param_1[0x16] + 0x1fffffffffffffe) - param_1[6];
  uVar2 = (param_1[0x17] + 0x1fffffffffffffe) - param_1[7];
  uVar11 = param_1[1] + param_1[0x11];
  uVar12 = param_1[2] + param_1[0x12];
  uVar14 = param_1[5] + param_1[0x15];
  uVar9 = (param_1[0x11] + 0x1fffffffffffffe) - param_1[1];
  uVar13 = (param_1[0x12] + 0x1fffffffffffffe) - param_1[2];
  uVar17 = (param_1[0x15] + 0x1fffffffffffffe) - param_1[5];
  uVar19 = uVar2 >> 0x38;
  uVar15 = *param_1 + lVar5;
  uVar7 = (lVar5 + 0x1fffffffffffffe) - *param_1;
  uVar6 = (param_1[0x13] + 0x1fffffffffffffe) - param_1[3];
  uVar3 = uVar8 >> 0x38;
  local_80 = (uVar4 & 0xffffffffffffff) + (uVar14 >> 0x38);
  lStack_98 = (uVar10 & 0xffffffffffffff) + (uVar12 >> 0x38);
  uVar16 = uVar19 + ((param_1[0x14] + 0x1fffffffffffffc) - param_1[4]);
  lStack_78 = (uVar8 & 0xffffffffffffff) + (uVar4 >> 0x38);
  local_a0 = (uVar12 & 0xffffffffffffff) + (uVar11 >> 0x38);
  uVar4 = uVar3 + param_1[4] + param_1[0x14];
  param_1[0xe] = (uVar1 & 0xffffffffffffff) + (uVar17 >> 0x38);
  param_1[0xf] = (uVar2 & 0xffffffffffffff) + (uVar1 >> 0x38);
  lStack_88 = (uVar14 & 0xffffffffffffff) + (uVar4 >> 0x38);
  param_1[9] = (uVar9 & 0xffffffffffffff) + (uVar7 >> 0x38);
  param_1[10] = (uVar13 & 0xffffffffffffff) + (uVar9 >> 0x38);
  lStack_a8 = (uVar11 & 0xffffffffffffff) + (uVar15 >> 0x38);
  local_b0 = uVar3 + (uVar15 & 0xffffffffffffff);
  local_90 = (uVar4 & 0xffffffffffffff) + (uVar10 >> 0x38);
  param_1[0xb] = (uVar6 & 0xffffffffffffff) + (uVar13 >> 0x38);
  param_1[0xc] = (uVar16 & 0xffffffffffffff) + (uVar6 >> 0x38);
  param_1[0xd] = (uVar17 & 0xffffffffffffff) + (uVar16 >> 0x38);
  *plVar18 = uVar19 + (uVar7 & 0xffffffffffffff);
  gf_mul(param_1 + 0x10,&local_b0,plVar18);
  gf_mul(param_1,plVar18,&local_f0);
  gf_mul(plVar18,&local_b0,&local_130);
  if (param_3 == 0) {
    gf_mul(param_1 + 0x18,&local_f0,&local_130);
  }
  return;
}


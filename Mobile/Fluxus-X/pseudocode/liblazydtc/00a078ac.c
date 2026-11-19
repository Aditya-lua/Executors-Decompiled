/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a078ac
 */

void bn_sqr_comba4(long *param_1,ulong *param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
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
  
  uVar3 = *param_2 & 0xffffffff;
  uVar2 = *param_2 >> 0x20;
  uVar9 = uVar3 * uVar2 << 0x21;
  *param_1 = uVar3 * uVar3 + uVar9;
  uVar2 = uVar2 * uVar2 + (uVar3 * uVar2 >> 0x1f);
  if (CARRY8(uVar3 * uVar3,uVar9)) {
    uVar2 = uVar2 + 1;
  }
  uVar5 = param_2[1] & 0xffffffff;
  uVar7 = param_2[1] >> 0x20;
  uVar8 = *param_2 & 0xffffffff;
  uVar4 = *param_2 >> 0x20;
  uVar10 = uVar4 * uVar5;
  uVar5 = uVar8 * uVar5;
  uVar8 = uVar8 * uVar7;
  uVar3 = uVar10 + uVar8;
  uVar9 = uVar3 << 0x20;
  uVar6 = uVar5 + uVar9;
  uVar3 = uVar4 * uVar7 + (uVar3 >> 0x20) + ((ulong)CARRY8(uVar10,uVar8) << 0x20);
  if (CARRY8(uVar5,uVar9)) {
    uVar3 = uVar3 + 1;
  }
  uVar9 = uVar3;
  if (CARRY8(uVar2,uVar6)) {
    uVar9 = uVar3 + 1;
  }
  param_1[1] = uVar2 + uVar6 + uVar6;
  if (CARRY8(uVar2 + uVar6,uVar6)) {
    uVar3 = uVar3 + 1;
  }
  uVar8 = (ulong)CARRY8(uVar9,uVar3);
  uVar10 = param_2[1] & 0xffffffff;
  uVar2 = param_2[1] >> 0x20;
  uVar11 = param_2[2] & 0xffffffff;
  uVar7 = param_2[2] >> 0x20;
  uVar12 = *param_2 & 0xffffffff;
  uVar5 = *param_2 >> 0x20;
  uVar15 = uVar5 * uVar11;
  uVar11 = uVar12 * uVar11;
  uVar12 = uVar12 * uVar7;
  uVar6 = uVar2 * uVar2 + (uVar10 * uVar2 >> 0x1f);
  uVar2 = uVar10 * uVar2 << 0x21;
  uVar4 = uVar10 * uVar10 + uVar2;
  if (CARRY8(uVar10 * uVar10,uVar2)) {
    uVar6 = uVar6 + 1;
  }
  uVar2 = uVar9 + uVar3 + uVar4;
  if (CARRY8(uVar9 + uVar3,uVar4)) {
    uVar6 = uVar6 + 1;
  }
  uVar3 = uVar15 + uVar12;
  uVar9 = uVar3 << 0x20;
  uVar4 = uVar11 + uVar9;
  uVar3 = uVar5 * uVar7 + (uVar3 >> 0x20) + ((ulong)CARRY8(uVar15,uVar12) << 0x20);
  if (CARRY8(uVar11,uVar9)) {
    uVar3 = uVar3 + 1;
  }
  uVar9 = uVar2 + uVar4;
  uVar5 = uVar3;
  if (CARRY8(uVar2,uVar4)) {
    uVar5 = uVar3 + 1;
  }
  uVar2 = 2;
  if (!CARRY8(uVar6,uVar8)) {
    uVar2 = 1;
  }
  uVar7 = uVar6 + uVar8 + uVar5;
  uVar10 = (ulong)CARRY8(uVar6,uVar8);
  if (CARRY8(uVar6 + uVar8,uVar5)) {
    uVar10 = uVar2;
  }
  if (CARRY8(uVar9,uVar4)) {
    uVar3 = uVar3 + 1;
  }
  param_1[2] = uVar9 + uVar4;
  uVar9 = uVar7 + uVar3;
  if (CARRY8(uVar7,uVar3)) {
    uVar10 = uVar10 + 1;
  }
  uVar15 = param_2[3] & 0xffffffff;
  uVar8 = param_2[3] >> 0x20;
  uVar13 = *param_2 & 0xffffffff;
  uVar7 = *param_2 >> 0x20;
  uVar14 = param_2[2] & 0xffffffff;
  uVar5 = param_2[2] >> 0x20;
  uVar16 = param_2[1] & 0xffffffff;
  uVar12 = param_2[1] >> 0x20;
  uVar4 = uVar7 * uVar15;
  uVar15 = uVar13 * uVar15;
  uVar13 = uVar13 * uVar8;
  uVar11 = uVar12 * uVar14;
  uVar14 = uVar16 * uVar14;
  uVar16 = uVar16 * uVar5;
  uVar3 = uVar4 + uVar13;
  uVar2 = uVar3 << 0x20;
  uVar6 = uVar15 + uVar2;
  uVar3 = uVar7 * uVar8 + (uVar3 >> 0x20) + ((ulong)CARRY8(uVar4,uVar13) << 0x20);
  if (CARRY8(uVar15,uVar2)) {
    uVar3 = uVar3 + 1;
  }
  uVar2 = uVar9 + uVar6;
  uVar4 = uVar3;
  if (CARRY8(uVar9,uVar6)) {
    uVar4 = uVar3 + 1;
  }
  uVar9 = uVar2 + uVar6;
  if (CARRY8(uVar2,uVar6)) {
    uVar3 = uVar3 + 1;
  }
  uVar2 = 2;
  if (!CARRY8(uVar10,uVar4)) {
    uVar2 = 1;
  }
  uVar6 = uVar10 + uVar4 + uVar3;
  uVar7 = (ulong)CARRY8(uVar10,uVar4);
  if (CARRY8(uVar10 + uVar4,uVar3)) {
    uVar7 = uVar2;
  }
  uVar3 = uVar11 + uVar16;
  uVar2 = uVar3 << 0x20;
  uVar4 = uVar14 + uVar2;
  uVar3 = uVar12 * uVar5 + (uVar3 >> 0x20) + ((ulong)CARRY8(uVar11,uVar16) << 0x20);
  if (CARRY8(uVar14,uVar2)) {
    uVar3 = uVar3 + 1;
  }
  uVar2 = uVar9 + uVar4;
  uVar5 = uVar3;
  if (CARRY8(uVar9,uVar4)) {
    uVar5 = uVar3 + 1;
  }
  uVar9 = uVar6 + uVar5;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  if (CARRY8(uVar2,uVar4)) {
    uVar3 = uVar3 + 1;
  }
  param_1[3] = uVar2 + uVar4;
  uVar2 = uVar9 + uVar3;
  if (CARRY8(uVar9,uVar3)) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = param_2[2] & 0xffffffff;
  uVar9 = param_2[2] >> 0x20;
  uVar10 = param_2[3] & 0xffffffff;
  uVar5 = param_2[3] >> 0x20;
  uVar11 = param_2[1] & 0xffffffff;
  uVar4 = param_2[1] >> 0x20;
  uVar12 = uVar4 * uVar10;
  uVar10 = uVar11 * uVar10;
  uVar11 = uVar11 * uVar5;
  uVar3 = uVar9 * uVar9 + (uVar8 * uVar9 >> 0x1f);
  uVar9 = uVar8 * uVar9 << 0x21;
  uVar6 = uVar8 * uVar8 + uVar9;
  if (CARRY8(uVar8 * uVar8,uVar9)) {
    uVar3 = uVar3 + 1;
  }
  uVar9 = uVar2 + uVar6;
  if (CARRY8(uVar2,uVar6)) {
    uVar3 = uVar3 + 1;
  }
  uVar6 = uVar12 + uVar11;
  uVar2 = uVar6 << 0x20;
  uVar8 = uVar10 + uVar2;
  uVar6 = uVar4 * uVar5 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar12,uVar11) << 0x20);
  if (CARRY8(uVar10,uVar2)) {
    uVar6 = uVar6 + 1;
  }
  uVar2 = uVar9 + uVar8;
  uVar4 = uVar6;
  if (CARRY8(uVar9,uVar8)) {
    uVar4 = uVar6 + 1;
  }
  uVar9 = 2;
  if (!CARRY8(uVar7,uVar3)) {
    uVar9 = 1;
  }
  uVar5 = uVar7 + uVar3 + uVar4;
  uVar10 = (ulong)CARRY8(uVar7,uVar3);
  if (CARRY8(uVar7 + uVar3,uVar4)) {
    uVar10 = uVar9;
  }
  param_1[4] = uVar2 + uVar8;
  if (CARRY8(uVar2,uVar8)) {
    uVar6 = uVar6 + 1;
  }
  uVar9 = uVar5 + uVar6;
  if (CARRY8(uVar5,uVar6)) {
    uVar10 = uVar10 + 1;
  }
  uVar5 = param_2[3] & 0xffffffff;
  uVar7 = param_2[3] >> 0x20;
  uVar8 = param_2[2] & 0xffffffff;
  uVar4 = param_2[2] >> 0x20;
  uVar11 = uVar4 * uVar5;
  uVar5 = uVar8 * uVar5;
  uVar8 = uVar8 * uVar7;
  uVar3 = uVar11 + uVar8;
  uVar2 = uVar3 << 0x20;
  uVar6 = uVar5 + uVar2;
  uVar3 = uVar4 * uVar7 + (uVar3 >> 0x20) + ((ulong)CARRY8(uVar11,uVar8) << 0x20);
  if (CARRY8(uVar5,uVar2)) {
    uVar3 = uVar3 + 1;
  }
  uVar2 = uVar9 + uVar6;
  uVar4 = uVar3;
  if (CARRY8(uVar9,uVar6)) {
    uVar4 = uVar3 + 1;
  }
  param_1[5] = uVar2 + uVar6;
  if (CARRY8(uVar2,uVar6)) {
    uVar3 = uVar3 + 1;
  }
  uVar6 = param_2[3] & 0xffffffff;
  uVar9 = param_2[3] >> 0x20;
  lVar1 = uVar9 * uVar9 + (uVar6 * uVar9 >> 0x1f);
  uVar9 = uVar6 * uVar9 << 0x21;
  uVar2 = uVar6 * uVar6 + uVar9;
  if (CARRY8(uVar6 * uVar6,uVar9)) {
    lVar1 = lVar1 + 1;
  }
  if (CARRY8(uVar10,uVar4)) {
    lVar1 = lVar1 + 1;
  }
  uVar9 = uVar10 + uVar4 + uVar3;
  if (CARRY8(uVar10 + uVar4,uVar3)) {
    lVar1 = lVar1 + 1;
  }
  if (CARRY8(uVar9,uVar2)) {
    lVar1 = lVar1 + 1;
  }
  param_1[6] = uVar9 + uVar2;
  param_1[7] = lVar1;
  return;
}


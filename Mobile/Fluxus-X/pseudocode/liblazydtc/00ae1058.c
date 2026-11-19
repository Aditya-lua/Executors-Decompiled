/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae1058
 */

void FUN_00ae1058(ulong *param_1,ulong *param_2,long param_3)

{
  ulong uVar1;
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
  
  uVar11 = *(ulong *)(&DAT_00775be8 + param_3 * 8);
  uVar8 = param_2[5] ^ *param_2 ^ param_2[10] ^ param_2[0xf] ^ param_2[0x14];
  uVar3 = param_2[6] ^ param_2[1] ^ param_2[0xb] ^ param_2[0x10] ^ param_2[0x15];
  uVar6 = param_2[7] ^ param_2[2] ^ param_2[0xc] ^ param_2[0x11] ^ param_2[0x16];
  uVar5 = param_2[8] ^ param_2[3] ^ param_2[0xd] ^ param_2[0x12] ^ param_2[0x17];
  uVar4 = param_2[9] ^ param_2[4] ^ param_2[0xe] ^ param_2[0x13] ^ param_2[0x18];
  uVar1 = uVar4 ^ (uVar3 >> 0x3f | uVar3 << 1);
  uVar2 = uVar8 ^ (uVar6 >> 0x3f | uVar6 << 1);
  uVar3 = uVar3 ^ (uVar5 >> 0x3f | uVar5 << 1);
  uVar6 = uVar6 ^ (uVar4 >> 0x3f | uVar4 << 1);
  uVar5 = uVar5 ^ (uVar8 >> 0x3f | uVar8 << 1);
  uVar4 = uVar2 ^ param_2[6];
  uVar7 = uVar3 ^ param_2[0xc];
  uVar9 = uVar6 ^ param_2[0x12];
  uVar10 = param_2[0x18] ^ uVar5;
  uVar8 = uVar4 >> 0x14 | uVar4 << 0x2c;
  uVar7 = uVar7 >> 0x15 | uVar7 << 0x2b;
  uVar9 = uVar9 >> 0x2b | uVar9 << 0x15;
  uVar10 = uVar10 >> 0x32 | uVar10 << 0xe;
  uVar4 = uVar1 ^ *param_2;
  param_1[2] = uVar10 & (uVar9 ^ 0xffffffffffffffff) ^ uVar7;
  param_1[3] = uVar9 ^ uVar4 & (uVar10 ^ 0xffffffffffffffff);
  param_1[4] = uVar8 & (uVar4 ^ 0xffffffffffffffff) ^ uVar10;
  *param_1 = uVar7 & (uVar8 ^ 0xffffffffffffffff) ^ uVar11 ^ uVar4;
  param_1[1] = uVar9 & (uVar7 ^ 0xffffffffffffffff) ^ uVar8;
  uVar8 = (param_2[9] ^ uVar5) >> 0x2c | (param_2[9] ^ uVar5) << 0x14;
  uVar7 = (param_2[10] ^ uVar1) >> 0x3d | (param_2[10] ^ uVar1) << 3;
  uVar9 = (param_2[0x10] ^ uVar2) >> 0x13 | (param_2[0x10] ^ uVar2) << 0x2d;
  uVar4 = (param_2[3] ^ uVar6) >> 0x24 | (param_2[3] ^ uVar6) << 0x1c;
  uVar10 = (param_2[0x16] ^ uVar3) >> 3 | (param_2[0x16] ^ uVar3) << 0x3d;
  param_1[5] = uVar7 & (uVar8 ^ 0xffffffffffffffff) ^ uVar4;
  param_1[6] = uVar9 & (uVar7 ^ 0xffffffffffffffff) ^ uVar8;
  param_1[7] = uVar10 & (uVar9 ^ 0xffffffffffffffff) ^ uVar7;
  param_1[8] = uVar4 & (uVar10 ^ 0xffffffffffffffff) ^ uVar9;
  param_1[9] = uVar10 ^ uVar8 & (uVar4 ^ 0xffffffffffffffff);
  uVar8 = (param_2[7] ^ uVar3) >> 0x3a | (param_2[7] ^ uVar3) << 6;
  uVar7 = (param_2[0xd] ^ uVar6) >> 0x27 | (param_2[0xd] ^ uVar6) << 0x19;
  uVar9 = (param_2[0x13] ^ uVar5) >> 0x38 | (param_2[0x13] ^ uVar5) << 8;
  uVar4 = (param_2[1] ^ uVar2) >> 0x3f | (param_2[1] ^ uVar2) << 1;
  uVar10 = (param_2[0x14] ^ uVar1) >> 0x2e | (param_2[0x14] ^ uVar1) << 0x12;
  param_1[10] = uVar7 & (uVar8 ^ 0xffffffffffffffff) ^ uVar4;
  param_1[0xb] = uVar9 & (uVar7 ^ 0xffffffffffffffff) ^ uVar8;
  param_1[0xc] = uVar10 & (uVar9 ^ 0xffffffffffffffff) ^ uVar7;
  param_1[0xd] = uVar4 & (uVar10 ^ 0xffffffffffffffff) ^ uVar9;
  param_1[0xe] = uVar10 ^ uVar8 & (uVar4 ^ 0xffffffffffffffff);
  uVar8 = (param_2[5] ^ uVar1) >> 0x1c | (param_2[5] ^ uVar1) << 0x24;
  uVar7 = (param_2[0xb] ^ uVar2) >> 0x36 | (param_2[0xb] ^ uVar2) << 10;
  uVar9 = (param_2[0x11] ^ uVar3) >> 0x31 | (param_2[0x11] ^ uVar3) << 0xf;
  uVar4 = (param_2[4] ^ uVar5) >> 0x25 | (param_2[4] ^ uVar5) << 0x1b;
  uVar10 = (param_2[0x17] ^ uVar6) >> 8 | (param_2[0x17] ^ uVar6) << 0x38;
  param_1[0xf] = uVar7 & (uVar8 ^ 0xffffffffffffffff) ^ uVar4;
  param_1[0x10] = uVar9 & (uVar7 ^ 0xffffffffffffffff) ^ uVar8;
  param_1[0x11] = uVar10 & (uVar9 ^ 0xffffffffffffffff) ^ uVar7;
  param_1[0x12] = uVar4 & (uVar10 ^ 0xffffffffffffffff) ^ uVar9;
  param_1[0x13] = uVar10 ^ uVar8 & (uVar4 ^ 0xffffffffffffffff);
  uVar3 = (param_2[2] ^ uVar3) >> 2 | (param_2[2] ^ uVar3) << 0x3e;
  uVar4 = (param_2[8] ^ uVar6) >> 9 | (param_2[8] ^ uVar6) << 0x37;
  uVar6 = (param_2[0xe] ^ uVar5) >> 0x19 | (param_2[0xe] ^ uVar5) << 0x27;
  uVar1 = (param_2[0xf] ^ uVar1) >> 0x17 | (param_2[0xf] ^ uVar1) << 0x29;
  uVar2 = (param_2[0x15] ^ uVar2) >> 0x3e | (param_2[0x15] ^ uVar2) << 2;
  param_1[0x14] = uVar6 & (uVar4 ^ 0xffffffffffffffff) ^ uVar3;
  param_1[0x15] = uVar1 & (uVar6 ^ 0xffffffffffffffff) ^ uVar4;
  param_1[0x16] = uVar2 & (uVar1 ^ 0xffffffffffffffff) ^ uVar6;
  param_1[0x17] = uVar3 & (uVar2 ^ 0xffffffffffffffff) ^ uVar1;
  param_1[0x18] = uVar2 ^ uVar4 & (uVar3 ^ 0xffffffffffffffff);
  return;
}


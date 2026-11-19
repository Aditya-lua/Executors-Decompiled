/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae5d9c
 */

void ossl_sm4_decrypt(uint *param_1,undefined1 *param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  byte bVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  
  uVar4 = param_1[2];
  uVar5 = param_1[3];
  uVar6 = param_1[1];
  uVar2 = uVar5 ^ uVar4;
  uVar10 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
  uVar2 = ((uVar2 ^ uVar6) & 0xff00ff00) >> 8 | ((uVar2 ^ uVar6) & 0xff00ff) << 8;
  uVar3 = (uVar2 >> 0x10 | uVar2 << 0x10) ^ param_3[0x1f];
  bVar7 = (&DAT_00775fd0)[uVar3 & 0xff];
  uVar8 = (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x18] << 0x18;
  uVar2 = uVar8 | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 8 & 0xff] << 8;
  uVar11 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
  uVar9 = uVar1 | bVar7;
  uVar12 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar3 = uVar9 ^ (uVar11 >> 0x10 | uVar11 << 0x10) ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar3 >> 0x18] >> 6) |
          (uVar8 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar3 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar9,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar9,uVar1) >> 0xe);
  uVar2 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  uVar11 = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar4 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ param_3[0x1e] ^ uVar3;
  bVar7 = (&DAT_00775fd0)[uVar4 & 0xff];
  uVar5 = (uint)(byte)(&DAT_00775fd0)[uVar4 >> 0x18] << 0x18;
  uVar2 = uVar5 | (uint)(byte)(&DAT_00775fd0)[uVar4 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar4 >> 8 & 0xff] << 8;
  uVar8 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
  uVar6 = uVar1 | bVar7;
  uVar4 = uVar6 ^ (uVar8 >> 0x10 | uVar8 << 0x10) ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar4 >> 0x18] >> 6) |
          (uVar5 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar4 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar4 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar6,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar6,uVar1) >> 0xe);
  uVar5 = param_3[0x1d] ^ uVar11 ^ uVar4 ^ uVar3;
  bVar7 = (&DAT_00775fd0)[uVar5 & 0xff];
  uVar6 = (uint)(byte)(&DAT_00775fd0)[uVar5 >> 0x18] << 0x18;
  uVar2 = uVar6 | (uint)(byte)(&DAT_00775fd0)[uVar5 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar5 >> 8 & 0xff] << 8;
  uVar8 = uVar1 | bVar7;
  uVar5 = uVar8 ^ (uVar12 >> 0x10 | uVar12 << 0x10) ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar5 >> 0x18] >> 6) |
          (uVar6 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar5 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar5 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar8,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar8,uVar1) >> 0xe);
  uVar6 = uVar4 ^ uVar3 ^ param_3[0x1c] ^ uVar5;
  bVar7 = (&DAT_00775fd0)[uVar6 & 0xff];
  uVar8 = (uint)(byte)(&DAT_00775fd0)[uVar6 >> 0x18] << 0x18;
  uVar2 = uVar8 | (uint)(byte)(&DAT_00775fd0)[uVar6 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar6 >> 8 & 0xff] << 8;
  uVar9 = uVar1 | bVar7;
  uVar2 = uVar9 ^ uVar11 ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar6 >> 0x18] >> 6) |
          (uVar8 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar6 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar6 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar9,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar9,uVar1) >> 0xe);
  uVar1 = uVar2 ^ uVar5 ^ uVar4 ^ param_3[0x1b];
  uVar1 = *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) << 8);
  uVar3 = uVar2 ^ uVar5 ^ param_3[0x1a] ^ uVar1;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar3 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar3 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar3 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar3 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar3 & 0xff) * 4) << 8);
  uVar4 = param_3[0x19] ^ uVar2 ^ uVar3 ^ uVar1;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar4 >> 0x18) * 4) ^ uVar5 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar4 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar4 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar4 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar4 & 0xff) * 4) << 8);
  uVar5 = param_3[0x18] ^ uVar3 ^ uVar1 ^ uVar4;
  uVar2 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ uVar3 ^ param_3[0x17];
  uVar1 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar1 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ param_3[0x16] ^ uVar1;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0x15] ^ uVar2 ^ uVar3 ^ uVar1;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0x14] ^ uVar3 ^ uVar1 ^ uVar4;
  uVar2 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ uVar3 ^ param_3[0x13];
  uVar1 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar1 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ param_3[0x12] ^ uVar1;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0x11] ^ uVar2 ^ uVar3 ^ uVar1;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0x10] ^ uVar3 ^ uVar1 ^ uVar4;
  uVar2 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ uVar3 ^ param_3[0xf];
  uVar1 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar1 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ param_3[0xe] ^ uVar1;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0xd] ^ uVar2 ^ uVar3 ^ uVar1;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[0xc] ^ uVar3 ^ uVar1 ^ uVar4;
  uVar2 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ uVar3 ^ param_3[0xb];
  uVar1 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar1 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ param_3[10] ^ uVar1;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[9] ^ uVar2 ^ uVar3 ^ uVar1;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = param_3[8] ^ uVar3 ^ uVar1 ^ uVar4;
  uVar2 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar5 = uVar2 ^ uVar4 ^ uVar3 ^ param_3[7];
  uVar5 = *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x18) * 4) ^ uVar1 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar5 & 0xff) * 4) << 8);
  uVar1 = uVar2 ^ uVar4 ^ param_3[6] ^ uVar5;
  uVar3 = *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x18) * 4) ^ uVar3 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) << 8);
  uVar1 = param_3[5] ^ uVar2 ^ uVar3 ^ uVar5;
  uVar4 = *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x18) * 4) ^ uVar4 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) << 8);
  uVar1 = param_3[4] ^ uVar3 ^ uVar5 ^ uVar4;
  uVar6 = *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x18) * 4) ^ uVar2 ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) >> 8 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) << 0x18) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) >> 0x10 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 >> 8 & 0xff) * 4) << 0x10) ^
          (*(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) >> 0x18 |
          *(uint *)(&DAT_007760d0 + (ulong)(uVar1 & 0xff) * 4) << 8);
  uVar9 = *param_3;
  uVar10 = param_3[1];
  uVar8 = uVar6 ^ uVar4 ^ uVar3 ^ param_3[3];
  bVar7 = (&DAT_00775fd0)[uVar8 & 0xff];
  uVar11 = (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x18] << 0x18;
  uVar2 = uVar11 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8;
  uVar12 = uVar1 | bVar7;
  uVar5 = uVar12 ^ uVar5 ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar8 >> 0x18] >> 6) |
          (uVar11 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar12,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar12,uVar1) >> 0xe);
  uVar8 = uVar6 ^ uVar4 ^ param_3[2] ^ uVar5;
  param_2[0xc] = (char)(uVar5 >> 0x18);
  param_2[0xd] = (char)(uVar5 >> 0x10);
  param_2[0xe] = (char)(uVar5 >> 8);
  bVar7 = (&DAT_00775fd0)[uVar8 & 0xff];
  uVar11 = (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x18] << 0x18;
  uVar2 = uVar11 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8;
  uVar12 = uVar1 | bVar7;
  uVar3 = uVar12 ^ uVar3 ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar8 >> 0x18] >> 6) |
          (uVar11 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar12,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar12,uVar1) >> 0xe);
  param_2[0xb] = (char)uVar3;
  uVar8 = uVar10 ^ uVar6 ^ uVar3 ^ uVar5;
  param_2[8] = (char)(uVar3 >> 0x18);
  param_2[9] = (char)(uVar3 >> 0x10);
  param_2[10] = (char)(uVar3 >> 8);
  bVar7 = (&DAT_00775fd0)[uVar8 & 0xff];
  uVar10 = (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x18] << 0x18;
  uVar2 = uVar10 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8;
  uVar11 = uVar1 | bVar7;
  uVar2 = uVar11 ^ uVar4 ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar8 >> 0x18] >> 6) |
          (uVar10 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar8 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar8 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar11,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar11,uVar1) >> 0xe);
  uVar3 = uVar3 ^ uVar5 ^ uVar9 ^ uVar2;
  param_2[7] = (char)uVar2;
  param_2[4] = (char)(uVar2 >> 0x18);
  param_2[5] = (char)(uVar2 >> 0x10);
  param_2[6] = (char)(uVar2 >> 8);
  bVar7 = (&DAT_00775fd0)[uVar3 & 0xff];
  uVar4 = (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x18] << 0x18;
  uVar2 = uVar4 | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x10 & 0xff] << 0x10;
  uVar1 = uVar2 | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 8 & 0xff] << 8;
  uVar8 = uVar1 | bVar7;
  uVar2 = uVar8 ^ uVar6 ^ (uint)(CONCAT14(bVar7,uVar1) >> 8) ^
          ((uint)((byte)(&DAT_00775fd0)[uVar3 >> 0x18] >> 6) |
          (uVar4 & 0x3fffffff | (uint)(byte)(&DAT_00775fd0)[uVar3 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_00775fd0)[uVar3 >> 8 & 0xff] << 8 | (uint)bVar7) << 2) ^
          (uint)(CONCAT44(uVar8,uVar2) >> 0x16) ^ (uint)(CONCAT44(uVar8,uVar1) >> 0xe);
  param_2[3] = (char)uVar2;
  *param_2 = (char)(uVar2 >> 0x18);
  param_2[1] = (char)(uVar2 >> 0x10);
  param_2[2] = (char)(uVar2 >> 8);
  param_2[0xf] = (char)uVar5;
  return;
}


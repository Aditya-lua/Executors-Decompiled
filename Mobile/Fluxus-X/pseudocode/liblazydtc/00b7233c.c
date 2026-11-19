/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7233c
 */

undefined8 mbedtls_camellia_crypt_ecb(int *param_1,uint param_2,uint *param_3,uint *param_4)

{
  uint *puVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint *puVar8;
  uint *puVar9;
  uint *puVar10;
  int iVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  
  if (1 < param_2) {
    return 0xffffffdc;
  }
  uVar14 = (*param_3 & 0xff00ff00) >> 8 | (*param_3 & 0xff00ff) << 8;
  uVar12 = param_1[1] ^ (uVar14 >> 0x10 | uVar14 << 0x10);
  uVar14 = (param_3[1] & 0xff00ff00) >> 8 | (param_3[1] & 0xff00ff) << 8;
  uVar15 = (param_3[2] & 0xff00ff00) >> 8 | (param_3[2] & 0xff00ff) << 8;
  uVar13 = param_1[2] ^ (uVar14 >> 0x10 | uVar14 << 0x10);
  uVar14 = param_1[3] ^ (uVar15 >> 0x10 | uVar15 << 0x10);
  uVar15 = (param_3[3] & 0xff00ff00) >> 8 | (param_3[3] & 0xff00ff) << 8;
  uVar15 = param_1[4] ^ (uVar15 >> 0x10 | uVar15 << 0x10);
  if (*param_1 == 0) {
    puVar10 = (uint *)(param_1 + 5);
  }
  else {
    iVar11 = -*param_1;
    puVar10 = (uint *)(param_1 + 10);
    while( true ) {
      iVar11 = iVar11 + 1;
      uVar3 = puVar10[-5] ^ uVar12;
      uVar4 = puVar10[-4] ^ uVar13;
      uVar5 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar3 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar3 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar3 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar3 & 0xff]);
      uVar3 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) ^ (uVar5 >> 0x10 | uVar5 << 0x10);
      uVar5 = uVar5 ^ (uVar3 >> 8 | uVar3 << 0x18);
      uVar14 = uVar3 ^ uVar14 ^ (uVar5 >> 8 | uVar5 << 0x18);
      uVar3 = uVar14 ^ puVar10[-3];
      uVar4 = uVar5 ^ uVar15 ^ puVar10[-2];
      uVar6 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar3 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar3 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar3 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar3 & 0xff]);
      uVar3 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) ^ (uVar6 >> 0x10 | uVar6 << 0x10);
      uVar6 = uVar6 ^ (uVar3 >> 8 | uVar3 << 0x18);
      uVar12 = uVar3 ^ uVar12 ^ (uVar6 >> 8 | uVar6 << 0x18);
      uVar3 = uVar12 ^ puVar10[-1];
      uVar4 = uVar6 ^ uVar13 ^ *puVar10;
      uVar7 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar3 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar3 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar3 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar3 & 0xff]);
      uVar3 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) ^ (uVar7 >> 0x10 | uVar7 << 0x10);
      uVar7 = uVar7 ^ (uVar3 >> 8 | uVar3 << 0x18);
      uVar14 = uVar3 ^ uVar14 ^ (uVar7 >> 8 | uVar7 << 0x18);
      uVar7 = uVar7 ^ uVar5 ^ uVar15;
      uVar15 = uVar14 ^ puVar10[1];
      uVar3 = uVar7 ^ puVar10[2];
      uVar4 = ((uint)(byte)(&DAT_0077e310)[uVar3 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar3 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar3 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar3 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar15 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar15 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar15 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar15 & 0xff]);
      uVar15 = ((uint)(byte)(&DAT_0077e310)[uVar3 >> 0x18] << 0x18 |
                (uint)(byte)(&DAT_0077e410)[uVar3 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e510)[uVar3 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e210)[uVar3 & 0xff]) ^ (uVar4 >> 0x10 | uVar4 << 0x10);
      uVar4 = uVar4 ^ (uVar15 >> 8 | uVar15 << 0x18);
      uVar12 = uVar15 ^ uVar12 ^ (uVar4 >> 8 | uVar4 << 0x18);
      uVar4 = uVar4 ^ uVar6 ^ uVar13;
      uVar15 = uVar12 ^ puVar10[3];
      uVar13 = uVar4 ^ puVar10[4];
      uVar15 = ((uint)(byte)(&DAT_0077e310)[uVar13 >> 0x18] |
               ((uint)(byte)(&DAT_0077e410)[uVar13 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e510)[uVar13 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e210)[uVar13 & 0xff]) << 8) ^
               ((uint)(byte)(&DAT_0077e210)[uVar15 >> 0x18] << 0x18 |
                (uint)(byte)(&DAT_0077e310)[uVar15 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e410)[uVar15 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e510)[uVar15 & 0xff]);
      uVar13 = ((uint)(byte)(&DAT_0077e310)[uVar13 >> 0x18] << 0x18 |
                (uint)(byte)(&DAT_0077e410)[uVar13 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e510)[uVar13 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e210)[uVar13 & 0xff]) ^ (uVar15 >> 0x10 | uVar15 << 0x10);
      uVar15 = uVar15 ^ (uVar13 >> 8 | uVar13 << 0x18);
      uVar14 = uVar13 ^ uVar14 ^ (uVar15 >> 8 | uVar15 << 0x18);
      uVar15 = uVar15 ^ uVar7;
      uVar13 = uVar14 ^ puVar10[5];
      uVar3 = uVar15 ^ puVar10[6];
      uVar13 = ((uint)(byte)(&DAT_0077e310)[uVar3 >> 0x18] |
               ((uint)(byte)(&DAT_0077e410)[uVar3 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e510)[uVar3 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e210)[uVar3 & 0xff]) << 8) ^
               ((uint)(byte)(&DAT_0077e210)[uVar13 >> 0x18] << 0x18 |
                (uint)(byte)(&DAT_0077e310)[uVar13 >> 0x10 & 0xff] << 0x10 |
                (uint)(byte)(&DAT_0077e410)[uVar13 >> 8 & 0xff] << 8 |
               (uint)(byte)(&DAT_0077e510)[uVar13 & 0xff]);
      uVar3 = ((uint)(byte)(&DAT_0077e310)[uVar3 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e410)[uVar3 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar3 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar3 & 0xff]) ^ (uVar13 >> 0x10 | uVar13 << 0x10);
      uVar13 = uVar13 ^ (uVar3 >> 8 | uVar3 << 0x18);
      uVar12 = uVar3 ^ uVar12 ^ (uVar13 >> 8 | uVar13 << 0x18);
      uVar13 = uVar13 ^ uVar4;
      if (iVar11 == 0) break;
      puVar1 = puVar10 + 7;
      puVar8 = puVar10 + 8;
      puVar2 = puVar10 + 9;
      puVar9 = puVar10 + 10;
      puVar10 = puVar10 + 0x10;
      uVar13 = uVar13 ^ ((*puVar1 & uVar12) >> 0x1f | (*puVar1 & uVar12) << 1);
      uVar14 = (*puVar9 | uVar15) ^ uVar14;
      uVar12 = (uVar13 | *puVar8) ^ uVar12;
      uVar15 = uVar15 ^ ((uVar14 & *puVar2) >> 0x1f | (uVar14 & *puVar2) << 1);
    }
    puVar10 = puVar10 + 7;
  }
  uVar14 = ((*puVar10 ^ uVar14) & 0xff00ff00) >> 8 | ((*puVar10 ^ uVar14) & 0xff00ff) << 8;
  uVar15 = ((puVar10[1] ^ uVar15) & 0xff00ff00) >> 8 | ((puVar10[1] ^ uVar15) & 0xff00ff) << 8;
  uVar12 = ((puVar10[2] ^ uVar12) & 0xff00ff00) >> 8 | ((puVar10[2] ^ uVar12) & 0xff00ff) << 8;
  uVar13 = ((puVar10[3] ^ uVar13) & 0xff00ff00) >> 8 | ((puVar10[3] ^ uVar13) & 0xff00ff) << 8;
  *param_4 = uVar14 >> 0x10 | uVar14 << 0x10;
  param_4[1] = uVar15 >> 0x10 | uVar15 << 0x10;
  param_4[2] = uVar12 >> 0x10 | uVar12 << 0x10;
  param_4[3] = uVar13 >> 0x10 | uVar13 << 0x10;
  return 0;
}


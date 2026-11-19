/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b749b8
 */

void mbedtls_des_setkey(uint *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  long lVar12;
  uint uVar13;
  
  uVar10 = (*param_2 & 0xff00ff00) >> 8 | (*param_2 & 0xff00ff) << 8;
  uVar13 = uVar10 >> 0x10 | uVar10 << 0x10;
  uVar9 = (param_2[1] & 0xff00ff00) >> 8 | (param_2[1] & 0xff00ff) << 8;
  uVar11 = uVar9 >> 0x10 | uVar9 << 0x10;
  uVar9 = (uVar13 ^ uVar11 >> 4) & 0xf0f0f0f;
  uVar11 = uVar11 ^ uVar9 << 4;
  uVar9 = uVar9 ^ uVar13;
  uVar11 = (uVar11 ^ uVar13) & 0x10101010 ^ uVar11;
  uVar13 = (*(int *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 8 & 0xf) * 4) << 2 |
            *(int *)(&DAT_0077e8c0 + (ulong)(uVar9 & 0xf) * 4) << 3 |
            *(int *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 0x10 & 0xf) * 4) << 1 |
            *(uint *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 0x18 & 0xf) * 4) |
            *(int *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 5 & 0xf) * 4) << 7 |
            *(int *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 0xd & 0xf) * 4) << 6 |
            *(int *)(&DAT_0077e8c0 + (ulong)(uVar9 >> 0x15 & 0xf) * 4) << 5 |
           *(int *)(&DAT_0077e8c0 + (ulong)((uVar10 & 0xffff) >> 0xd) * 4) << 4) & 0xfffffff;
  uVar9 = 0;
  uVar11 = (*(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 9 & 0xf) * 4) << 2 |
            *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 1 & 0xf) * 4) << 3 |
            *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 0x11 & 0xf) * 4) << 1 |
            *(uint *)(&DAT_0077e900 + (ulong)(uVar11 >> 0x19 & 0xf) * 4) |
            *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 4 & 0xf) * 4) << 7 |
            *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 0xc & 0xf) * 4) << 6 |
            *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 0x14 & 0xf) * 4) << 5 |
           *(int *)(&DAT_0077e900 + (ulong)(uVar11 >> 0x1c) * 4) << 4) & 0xfffffff;
  do {
    if (((uVar9 & 0x7fffffff) < 0x10) && ((1 << (ulong)(uVar9 & 0x1f) & 0x8103U) != 0)) {
      uVar10 = 0xffffffe;
      lVar8 = 0x1b;
      lVar12 = 1;
    }
    else {
      uVar10 = 0xffffffc;
      lVar8 = 0x1a;
      lVar12 = 2;
    }
    uVar4 = uVar13 << lVar12;
    uVar1 = uVar4 & uVar10;
    uVar6 = uVar13 >> lVar8;
    uVar2 = (uVar1 & 0x2400000) << 4;
    uVar13 = uVar1 | uVar6;
    uVar3 = (uVar13 & 0x82) << 0x12;
    uVar5 = uVar11 << lVar12;
    uVar7 = uVar11 >> lVar8;
    uVar11 = uVar5 & uVar10 | uVar7;
    uVar10 = (uVar5 & uVar10) >> 0xe;
    uVar9 = uVar9 + 1;
    *param_1 = uVar2 & 0xe0000000 | (uVar6 & 1) << 0x1c |
               uVar2 & 0x1fffffff | (uVar4 >> 0xd & 1) << 0x1b | uVar3 & 0xfe000000 |
               (uVar4 >> 0x12 & 1) << 0x18 | uVar3 & 0x1ffffff | (uVar4 >> 0xc & 1) << 0x15 |
               uVar4 >> 1 & 0x100000 | (uVar13 & 0x100) << 10 | (uVar1 & 0x8000) << 2 |
               uVar4 >> 10 & 0x10000 | uVar5 & 0x100 | uVar5 >> 0xd & 0x2000 | uVar5 >> 4 & 0x1000 |
               (uVar11 & 0x20) << 6 | uVar5 >> 1 & 0x400 | uVar10 & 0x200 | uVar5 >> 5 & 0x20 |
               uVar5 >> 10 & 0x10 | uVar11 >> 3 & 8 | uVar5 >> 0x12 & 4 | uVar5 >> 0x1a & 2 |
               uVar5 >> 0x18 & 1;
    param_1[1] = (uVar4 & 0x800) << 0x11 | (uVar13 >> 0xe & 1) << 0x1d |
                 (uVar13 >> 0x11 & 1) << 0x1b | (uVar13 >> 4 & 1) << 0x1a | uVar4 >> 2 & 0x2000000 |
                 (uVar1 >> 0x17 & 1) << 0x18 | (uVar13 >> 5 & 1) << 0x15 | (uVar4 & 0x200) << 0xb |
                 (uVar1 & 0x10000) << 3 | uVar4 >> 6 & 0x40000 | (uVar13 & 4) << 0xf |
                 uVar4 >> 4 & 0x10000 | uVar5 & 0x200 | uVar5 >> 2 & 0x2000 | (uVar11 & 0x10) << 8 |
                 uVar10 & 0x8080808 | uVar5 >> 9 & 0x400 | (uVar11 & 2) << 7 | uVar5 >> 7 & 0x20 |
                 uVar11 >> 3 & 0x11 | (uVar7 & 1) << 2 | uVar5 >> 0x15 & 2;
    param_1 = param_1 + 2;
  } while (uVar9 != 0x10);
  return;
}


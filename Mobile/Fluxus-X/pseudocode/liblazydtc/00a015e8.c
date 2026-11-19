/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a015e8
 */

int BN_num_bits(BIGNUM *a)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  uint uVar13;
  
  uVar2 = a->top;
  uVar3 = uVar2 - 1;
  if (((byte)a->flags >> 2 & 1) != 0) {
    if (a->dmax < 1) {
      uVar13 = 0;
    }
    else {
      lVar8 = 0;
      uVar7 = 0;
      uVar13 = 0;
      do {
        uVar5 = a->d[lVar8];
        uVar1 = (int)((uVar3 ^ (uint)lVar8) - 1 & uVar2 + 0x7fffffff) >> 0x1f;
        lVar4 = -(uVar5 >> 0x20);
        uVar7 = uVar1 | uVar7;
        uVar6 = (uVar5 >> 0x20 ^ uVar5) & lVar4 >> 0x3f ^ uVar5;
        lVar9 = -(uVar6 >> 0x10);
        uVar6 = (uVar6 >> 0x10 ^ uVar6) & lVar9 >> 0x3f ^ uVar6;
        lVar10 = -(uVar6 >> 8);
        uVar6 = (uVar6 >> 8 ^ uVar6) & lVar10 >> 0x3f ^ uVar6;
        lVar11 = -(uVar6 >> 4);
        uVar6 = (uVar6 >> 4 ^ uVar6) & lVar11 >> 0x3f ^ uVar6;
        lVar12 = -(uVar6 >> 2);
        lVar8 = lVar8 + 1;
        uVar13 = (~uVar7 & 0x40) + uVar13 +
                 (uVar1 & ((uint)(lVar4 >> 0x3f) & 0x20 | (uint)(uVar5 != 0) |
                           (uint)(lVar9 >> 0x3f) & 0x10 | (uint)(lVar10 >> 0x3f) & 8 |
                           (uint)(lVar11 >> 0x3f) & 4 | (uint)(lVar12 >> 0x3f) & 2) -
                          (int)((long)-(((uVar6 >> 2 ^ uVar6) & lVar12 >> 0x3f ^ uVar6) >> 1) >>
                               0x3f));
      } while (a->dmax != lVar8);
    }
    return uVar13 & ((int)(0x80000000 - uVar2 & (uVar2 ^ 0xffffffff)) >> 0x1f ^ 0xffffffffU);
  }
  if (uVar2 == 0) {
    return 0;
  }
  uVar5 = a->d[(int)uVar3];
  lVar8 = -(uVar5 >> 0x20);
  uVar6 = (uVar5 >> 0x20 ^ uVar5) & lVar8 >> 0x3f ^ uVar5;
  lVar9 = -(uVar6 >> 0x10);
  uVar6 = (uVar6 >> 0x10 ^ uVar6) & lVar9 >> 0x3f ^ uVar6;
  lVar10 = -(uVar6 >> 8);
  uVar6 = (uVar6 >> 8 ^ uVar6) & lVar10 >> 0x3f ^ uVar6;
  lVar11 = -(uVar6 >> 4);
  uVar6 = (uVar6 >> 4 ^ uVar6) & lVar11 >> 0x3f ^ uVar6;
  lVar12 = -(uVar6 >> 2);
  return (((uint)(lVar8 >> 0x3f) & 0x20 | (uint)(uVar5 != 0) | (uint)(lVar9 >> 0x3f) & 0x10 |
           (uint)(lVar10 >> 0x3f) & 8 | (uint)(lVar11 >> 0x3f) & 4 | (uint)(lVar12 >> 0x3f) & 2) -
         (int)((long)-(((uVar6 >> 2 ^ uVar6) & lVar12 >> 0x3f ^ uVar6) >> 1) >> 0x3f)) +
         uVar3 * 0x40;
}


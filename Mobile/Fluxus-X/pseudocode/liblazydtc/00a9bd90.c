/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bd90
 */

bool OPENSSL_gmtime_adj(int *param_1,int param_2,long param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  undefined1 auVar7 [16];
  int iVar8;
  uint uVar9;
  long lVar10;
  long lVar11;
  int iVar12;
  long lVar13;
  long lVar14;
  
  uVar9 = (uint)((ulong)param_3 >> 0x20);
  lVar10 = param_3 / 0x15180 + ((long)(int)uVar9 >> 0x1f) + (ulong)(uVar9 >> 0x1f);
  iVar12 = (int)param_3 + (int)lVar10 * -0x15180 + param_1[2] * 0xe10 + param_1[1] * 0x3c + *param_1
  ;
  lVar10 = lVar10 + param_2;
  if (iVar12 < 0x15180) {
    if (iVar12 < 0) {
      lVar10 = lVar10 + -1;
      iVar12 = iVar12 + 0x15180;
    }
  }
  else {
    lVar10 = lVar10 + 1;
    iVar12 = iVar12 + -0x15180;
  }
  iVar8 = (param_1[4] + -0xd) / 0xc;
  iVar2 = param_1[5] + iVar8;
  iVar6 = iVar2 * 0x5b5;
  iVar3 = iVar6 + 0x955d1c;
  iVar6 = iVar6 + 0x955d1f;
  if (-1 < iVar3) {
    iVar6 = iVar3;
  }
  iVar3 = ((iVar2 + 0x1a90) / 100) * 3;
  iVar2 = iVar3 + 3;
  if (-1 < iVar3) {
    iVar2 = iVar3;
  }
  lVar10 = lVar10 + (((param_1[3] + (iVar6 >> 2) +
                      ((param_1[4] + iVar8 * -0xc) * 0x16f + -0x16f) / 0xc) - (iVar2 >> 2)) +
                    -0x7d4b);
  if (lVar10 < 0) {
    return false;
  }
  uVar4 = lVar10 + 0x10bd9;
  lVar5 = (long)(uVar4 * 4) / 0x23ab1 + ((long)(uVar4 * 4) >> 0x3f) +
          ((uVar4 & 0x3fffffffffffffff) >> 0x3d);
  lVar13 = lVar5 * 0x23ab1;
  lVar10 = lVar13 + 3;
  lVar13 = lVar13 + 6;
  if (-1 < lVar10) {
    lVar13 = lVar10;
  }
  lVar11 = uVar4 - (lVar13 >> 2);
  lVar13 = (lVar11 * 4000 + 4000) / 0x164b09;
  lVar14 = lVar13 * 0x5b5;
  lVar10 = lVar14 + 3;
  if (-1 < lVar14) {
    lVar10 = lVar14;
  }
  lVar10 = (lVar11 - (lVar10 >> 2)) + 0x1f;
  lVar11 = lVar10 * 0x50;
  iVar2 = (int)(lVar11 / 0x6925);
  uVar9 = ((int)lVar13 + (int)lVar5 * 100 + iVar2) - 0x1a90;
  bVar1 = uVar9 >> 2 < 0x7e9;
  if (bVar1) {
    lVar11 = lVar11 / 0x98f;
    auVar7 = SEXT816(lVar11 * 0x98f) * SEXT816(0x6666666666666667);
    param_1[4] = (int)lVar11 + iVar2 * -0xc + 1;
    param_1[5] = uVar9;
    param_1[2] = iVar12 / 0xe10;
    param_1[3] = (int)lVar10 - ((int)(auVar7._8_8_ >> 5) - (auVar7._12_4_ >> 0x1f));
    *param_1 = iVar12 % 0x3c;
    param_1[1] = (iVar12 / 0x3c) % 0x3c;
  }
  return bVar1;
}


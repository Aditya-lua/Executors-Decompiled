/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a020d4
 */

int FUN_00a020d4(BIGNUM *param_1,byte *param_2,int param_3,int param_4)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  byte *pbVar4;
  int iVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  byte *pbVar9;
  ulong uVar10;
  byte *pbVar11;
  int iVar12;
  undefined8 uVar13;
  BIGNUM local_50;
  
  uVar13._0_4_ = BN_num_bits(param_1);
  iVar12 = (int)uVar13 + 0xe;
  if (-1 < (int)uVar13 + 7) {
    iVar12 = (int)uVar13 + 7;
  }
  iVar12 = iVar12 >> 3;
  if ((param_3 != -1) && (bVar1 = param_3 < iVar12, iVar12 = param_3, bVar1)) {
    uVar13._0_4_ = param_1->top;
    uVar13._4_4_ = param_1->dmax;
    local_50.d = param_1->d;
    local_50.neg = param_1->neg;
    local_50.flags = param_1->flags;
    local_50._8_8_ = uVar13;
    if (0 < (int)uVar13) {
      puVar7 = local_50.d + (int)uVar13;
      iVar5 = (int)uVar13;
      do {
        puVar7 = puVar7 + -1;
        uVar13._0_4_ = iVar5;
        if (*puVar7 != 0) break;
        uVar13._0_4_ = iVar5 + -1;
        bVar1 = 0 < iVar5;
        iVar5 = (int)uVar13;
      } while ((int)uVar13 != 0 && bVar1);
      local_50.dmax = uVar13._4_4_;
      local_50.top = (int)uVar13;
    }
    if ((int)uVar13 == 0) {
      local_50._16_8_ = local_50._16_8_ & 0xffffffff00000000;
    }
    iVar5 = BN_num_bits(&local_50);
    uVar13._0_4_ = iVar5 + 0xe;
    if (-1 < iVar5 + 7) {
      uVar13._0_4_ = iVar5 + 7;
    }
    if (param_3 < (int)uVar13 >> 3) {
      return -1;
    }
  }
  uVar13._0_4_ = param_1->dmax;
  if ((int)uVar13 == 0) {
    if (iVar12 != 0) {
      memset(param_2,0,(long)iVar12);
    }
  }
  else if (iVar12 != 0) {
    iVar5 = param_1->top;
    uVar6 = 0;
    uVar8 = 0;
    pbVar9 = param_2 + iVar12;
    if (param_4 != 0) {
      pbVar9 = param_2;
    }
    do {
      uVar10 = uVar8 & 0xfffffffffffffff8;
      pbVar11 = pbVar9 + -1;
      pbVar4 = pbVar11;
      if (param_4 != 0) {
        pbVar11 = pbVar9 + 1;
        pbVar4 = pbVar9;
      }
      uVar3 = uVar8 & 7;
      lVar2 = (long)iVar5 * -8 + uVar6;
      uVar6 = uVar6 + 1;
      uVar8 = uVar8 - ((long)((long)(int)uVar13 * -8 + 1 + uVar8) >> 0x3f);
      *pbVar4 = (byte)(*(ulong *)((long)param_1->d + uVar10) >> (uVar3 << 3)) &
                (byte)(lVar2 >> 0x3f);
      pbVar9 = pbVar11;
    } while (uVar6 < (ulong)(long)iVar12);
  }
  return iVar12;
}


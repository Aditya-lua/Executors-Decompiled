/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0224c
 */

int BN_bn2bin(BIGNUM *a,uchar *to)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  byte *pbVar9;
  
  iVar6 = BN_num_bits(a);
  iVar4 = a->dmax;
  uVar1 = iVar6 + 0xe;
  uVar3 = uVar1;
  if (-1 < (int)(iVar6 + 7U)) {
    uVar3 = iVar6 + 7U;
  }
  iVar6 = (int)uVar3 >> 3;
  if (iVar4 == 0) {
    if (uVar1 < 0xf) {
      return 0;
    }
    memset(to,0,(long)iVar6);
  }
  else {
    if (uVar1 < 0xf) {
      return 0;
    }
    iVar5 = a->top;
    pbVar9 = to + iVar6;
    uVar7 = 0;
    uVar8 = 0;
    do {
      pbVar9 = pbVar9 + -1;
      lVar2 = (long)iVar5 * -8 + uVar7;
      uVar7 = uVar7 + 1;
      *pbVar9 = (byte)(*(ulong *)((long)a->d + (uVar8 & 0xfffffffffffffff8)) >> ((uVar8 & 7) << 3))
                & (byte)(lVar2 >> 0x3f);
      uVar8 = uVar8 - ((long)((long)iVar4 * -8 + 1 + uVar8) >> 0x3f);
    } while (uVar7 < (ulong)(long)iVar6);
  }
  return iVar6;
}


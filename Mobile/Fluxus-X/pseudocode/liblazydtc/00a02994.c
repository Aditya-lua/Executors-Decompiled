/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02994
 */

undefined4 bn_cmp_words(long param_1,long param_2,int param_3)

{
  bool bVar1;
  bool bVar2;
  undefined4 uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  
  if (param_3 == 0) {
    return 0;
  }
  uVar4 = -(ulong)(param_3 - 1U >> 0x1f) & 0xfffffff800000000 | (ulong)(param_3 - 1U) << 3;
  uVar6 = *(ulong *)(param_1 + uVar4);
  uVar4 = *(ulong *)(param_2 + uVar4);
  bVar1 = uVar4 <= uVar6;
  bVar2 = false;
  if (uVar6 == uVar4) {
    if (param_3 < 2) {
      return 0;
    }
    lVar5 = (long)(param_3 + -2);
    while( true ) {
      uVar6 = *(ulong *)(param_1 + lVar5 * 8);
      uVar4 = *(ulong *)(param_2 + lVar5 * 8);
      bVar1 = uVar4 <= uVar6;
      bVar2 = uVar6 == uVar4;
      if (!bVar2) break;
      bVar2 = lVar5 < 1;
      lVar5 = lVar5 + -1;
      if (bVar2) {
        return 0;
      }
    }
  }
  uVar3 = 0xffffffff;
  if (bVar1 && !bVar2) {
    uVar3 = 1;
  }
  return uVar3;
}


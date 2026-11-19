/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02f70
 */

void bn_correct_top_consttime(long *param_1)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  
  if (*(int *)((long)param_1 + 0xc) < 1) {
    uVar2 = 0;
  }
  else {
    lVar3 = 0;
    uVar2 = 0;
    do {
      lVar4 = *(long *)(*param_1 + lVar3 * 8);
      uVar1 = (int)(((uint)((ulong)lVar4 >> 0x20) | (uint)((ulong)-lVar4 >> 0x20)) &
                   (int)lVar3 - (int)param_1[1]) >> 0x1f;
      lVar3 = lVar3 + 1;
      uVar2 = ~uVar1 & uVar2 | uVar1 & (uint)lVar3;
    } while (lVar3 < *(int *)((long)param_1 + 0xc));
  }
  *(uint *)(param_1 + 1) = uVar2;
  *(uint *)(param_1 + 2) =
       ~((int)(uVar2 - 1 & (uVar2 ^ 0xffffffff)) >> 0x1f) & *(uint *)(param_1 + 2);
  return;
}


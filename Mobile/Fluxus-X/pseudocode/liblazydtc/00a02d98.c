/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02d98
 */

uint ossl_bn_is_word_fixed_top(long *param_1,ulong param_2)

{
  uint uVar1;
  uint uVar2;
  ulong *puVar3;
  long lVar4;
  
  uVar2 = 0;
  if ((int)param_1[2] == 0) {
    uVar1 = *(uint *)(param_1 + 1);
    if (uVar1 == 0) {
      return 0;
    }
    puVar3 = (ulong *)*param_1;
    uVar2 = (int)((uint)((*puVar3 ^ param_2) - 1 >> 0x20) &
                 ((uint)((*puVar3 ^ param_2) >> 0x20) ^ 0xffffffff)) >> 0x1f & 1;
    if (1 < (int)uVar1) {
      lVar4 = (ulong)uVar1 - 1;
      do {
        puVar3 = puVar3 + 1;
        lVar4 = lVar4 + -1;
        uVar2 = (int)((uint)(*puVar3 - 1 >> 0x20) & ((uint)(*puVar3 >> 0x20) ^ 0xffffffff)) >> 0x1f
                & uVar2;
      } while (lVar4 != 0);
    }
  }
  return uVar2;
}


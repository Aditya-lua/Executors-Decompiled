/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0f3c
 */

undefined4 ZSTD_nextInputType(long param_1)

{
  uint uVar1;
  
  uVar1 = *(int *)(param_1 + 0x752c) - 2;
  if (uVar1 < 6) {
    return *(undefined4 *)(&DAT_00789194 + (ulong)uVar1 * 4);
  }
  return 0;
}


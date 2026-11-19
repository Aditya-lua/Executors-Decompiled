/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d6b80
 */

ulong LZ4_saveDict(long param_1,void *param_2,uint param_3)

{
  uint uVar1;
  uint uVar2;
  ulong __n;
  
  uVar1 = *(uint *)(param_1 + 0x4018);
  if (uVar1 <= param_3) {
    param_3 = uVar1;
  }
  uVar2 = param_3;
  if (0xffff < param_3) {
    uVar2 = 0x10000;
  }
  __n = (ulong)uVar2;
  if (param_3 != 0) {
    memmove(param_2,(void *)((*(long *)(param_1 + 0x4000) + (ulong)uVar1) - __n),__n);
  }
  *(void **)(param_1 + 0x4000) = param_2;
  *(uint *)(param_1 + 0x4018) = uVar2;
  return __n;
}


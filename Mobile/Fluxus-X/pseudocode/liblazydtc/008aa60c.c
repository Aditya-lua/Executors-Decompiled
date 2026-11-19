/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa60c
 */

void FUN_008aa60c(long param_1,int param_2)

{
  ulong uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x68);
  if (*(long *)(param_1 + 0x48) - lVar2 <= (long)(param_2 << 4)) {
    FUN_008b41e4(param_1,param_2);
    lVar2 = *(long *)(param_1 + 0x68);
  }
  uVar1 = lVar2 + (long)param_2 * 0x10;
  if (*(ulong *)(*(long *)(param_1 + 0x50) + 0x18) < uVar1) {
    *(ulong *)(*(long *)(param_1 + 0x50) + 0x18) = uVar1;
  }
  return;
}


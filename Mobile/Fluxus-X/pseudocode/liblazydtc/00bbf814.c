/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbf814
 */

void ZSTD_checkContinuity(long param_1,long param_2,long param_3)

{
  long lVar1;
  long lVar2;
  
  if ((param_3 != 0) && (lVar1 = *(long *)(param_1 + 0x74c0), param_2 != lVar1)) {
    lVar2 = *(long *)(param_1 + 0x74c8);
    *(long *)(param_1 + 0x74d8) = lVar1;
    *(long *)(param_1 + 0x74c8) = param_2;
    *(long *)(param_1 + 0x74c0) = param_2;
    *(long *)(param_1 + 0x74d0) = param_2 + (lVar2 - lVar1);
  }
  return;
}


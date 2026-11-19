/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbf844
 */

void ZSTD_decompressBlock_deprecated(long param_1,long param_2,long param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  
  *(undefined4 *)(param_1 + 0x75e0) = 0;
  if ((param_3 != 0) && (lVar2 = *(long *)(param_1 + 0x74c0), param_2 != lVar2)) {
    lVar3 = *(long *)(param_1 + 0x74c8);
    *(long *)(param_1 + 0x74d8) = lVar2;
    *(long *)(param_1 + 0x74c8) = param_2;
    *(long *)(param_1 + 0x74c0) = param_2;
    *(long *)(param_1 + 0x74d0) = param_2 + (lVar3 - lVar2);
  }
  uVar1 = ZSTD_decompressBlock_internal(param_1,param_2);
  if (uVar1 < 0xffffffffffffff89) {
    *(ulong *)(param_1 + 0x74c0) = param_2 + uVar1;
  }
  return;
}


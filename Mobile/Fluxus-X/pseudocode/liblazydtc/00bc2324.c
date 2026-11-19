/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2324
 */

int ZSTD_getErrorCode(ulong param_1)

{
  int iVar1;
  
  iVar1 = 0;
  if (0xffffffffffffff88 < param_1) {
    iVar1 = -(int)param_1;
  }
  return iVar1;
}


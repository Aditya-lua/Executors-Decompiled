/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3e08
 */

long ZSTD_estimateDDictSize(long param_1,int param_2)

{
  long lVar1;
  
  lVar1 = 0x6ad8;
  if (param_2 != 1) {
    lVar1 = param_1 + 0x6ad8;
  }
  return lVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb3e1c
 */

long ZSTD_sizeof_DDict(long *param_1)

{
  long lVar1;
  
  lVar1 = 0;
  if (param_1 != (long *)0x0) {
    if (*param_1 == 0) {
      return 0x6ad8;
    }
    lVar1 = param_1[2] + 0x6ad8;
  }
  return lVar1;
}


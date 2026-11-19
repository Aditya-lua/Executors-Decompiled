/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1e7f4
 */

void FUN_00c1e7f4(long *param_1)

{
  long lVar1;
  long *__ptr;
  
  lVar1 = *param_1;
  if ((ulong)(*(long *)(lVar1 + 0x2a0) - *(long *)(lVar1 + 0x298) >> 3) < (ulong)param_1[1]) {
                    /* try { // try from 00c1e84c to 00c1e86b has its CatchHandler @ 00c1e86c */
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0xac7,
                 &DAT_002ab32c);
  }
  __ptr = (long *)param_1[2];
  *(long *)(lVar1 + 0x2a0) = *(long *)(lVar1 + 0x298) + param_1[1] * 8;
  if (__ptr == param_1 + 5) {
    return;
  }
  free(__ptr);
  return;
}


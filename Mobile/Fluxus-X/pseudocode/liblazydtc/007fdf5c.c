/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fdf5c
 */

long * FUN_007fdf5c(long *param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  void *__dest;
  
  if (param_3 < 0x17) {
    __dest = (void *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)param_3 << 1);
    if (param_3 != 0) {
      memmove(__dest,param_2,param_3);
    }
  }
  else {
    if (param_3 + 9 < 0x1f) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    uVar1 = param_3;
    if (param_3 < 0x2d) {
      uVar1 = 0x2c;
    }
    __dest = operator_new((uVar1 | 7) + 1);
    memcpy(__dest,param_2,param_3);
    param_1[1] = param_3;
    param_1[2] = (long)__dest;
    *param_1 = (uVar1 | 7) + 2;
  }
  *(undefined1 *)((long)__dest + param_3) = 0;
  return param_1;
}


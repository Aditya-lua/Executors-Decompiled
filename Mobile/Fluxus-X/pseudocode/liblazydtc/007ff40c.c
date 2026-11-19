/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007ff40c
 */

void FUN_007ff40c(ulong *param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  undefined1 *__dest;
  
  if (param_3 < 0x17) {
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)param_3 << 1);
  }
  else {
    if (0xfffffffffffffff7 < param_3) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    uVar1 = 0x1a;
    if ((param_3 | 7) != 0x17) {
      uVar1 = (param_3 | 7) + 1;
    }
    __dest = operator_new(uVar1);
    param_1[1] = param_3;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar1 | 1;
  }
  memmove(__dest,param_2,param_3 + 1);
  return;
}


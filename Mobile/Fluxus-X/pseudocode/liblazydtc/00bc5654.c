/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5654
 */

void FUN_00bc5654(ulong *param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  undefined1 *__dest;
  
  if (param_3 < 5) {
    __dest = (undefined1 *)((long)param_1 + 4);
    *(char *)param_1 = (char)((int)param_3 << 1);
  }
  else {
    if (0x3ffffffffffffff7 < param_3) {
                    /* WARNING: Subroutine does not return */
      FUN_00bc5610();
    }
    uVar1 = 8;
    if ((param_3 | 1) != 5) {
      uVar1 = (param_3 | 1) + 1;
    }
    __dest = operator_new(uVar1 << 2);
    param_1[1] = param_3;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar1 | 1;
  }
  memmove(__dest,param_2,param_3 * 4 + 4);
  return;
}


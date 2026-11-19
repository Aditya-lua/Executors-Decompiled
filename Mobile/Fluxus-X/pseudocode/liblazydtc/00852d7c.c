/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00852d7c
 */

void FUN_00852d7c(ulong *param_1,char *param_2)

{
  ulong uVar1;
  size_t __n;
  undefined1 *__dest;
  
  __n = strlen(param_2);
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00852df8;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    param_1[1] = __n;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar1 | 1;
  }
  memmove(__dest,param_2,__n);
LAB_00852df8:
  __dest[__n] = 0;
  return;
}


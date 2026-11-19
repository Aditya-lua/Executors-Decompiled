/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082429c
 */

void FUN_0082429c(ulong *param_1,undefined8 param_2,undefined8 param_3,char *param_4)

{
  ulong uVar1;
  char *pcVar2;
  size_t __n;
  undefined1 *__dest;
  
  FUN_008acba4(param_2,1,param_3);
  pcVar2 = (char *)FUN_008ab8a4(param_2,0xffffffff,0);
  if (pcVar2 != (char *)0x0) {
    param_4 = pcVar2;
  }
  __n = strlen(param_4);
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00824348;
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
  memmove(__dest,param_4,__n);
LAB_00824348:
  __dest[__n] = 0;
                    /* try { // try from 0082434c to 00824357 has its CatchHandler @ 00824370 */
  FUN_008aa994(param_2,0xfffffffe);
  return;
}


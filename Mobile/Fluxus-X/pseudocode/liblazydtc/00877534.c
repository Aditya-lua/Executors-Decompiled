/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877534
 */

void FUN_00877534(ulong *param_1,undefined4 param_2)

{
  size_t __n;
  ulong uVar1;
  ulong uVar2;
  void *__dest;
  void *__src;
  ulong uVar3;
  ulong uVar4;
  
  uVar4 = *param_1;
  uVar3 = 0x16;
  if ((*param_1 & 1) != 0) {
    uVar3 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  __n = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    __n = param_1[1];
  }
  if (uVar3 - __n < 4) {
    if (-uVar3 - 10 < (__n - uVar3) + 4) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    __src = (void *)param_1[2];
    if ((uVar4 & 1) == 0) {
      __src = (void *)((long)param_1 + 1);
    }
    if (uVar3 < 0x7ffffffffffffff3) {
      uVar1 = __n + 4;
      if (__n + 4 <= uVar3 * 2) {
        uVar1 = uVar3 * 2;
      }
      uVar2 = 0x1a;
      if ((uVar1 | 7) != 0x17) {
        uVar2 = (uVar1 | 7) + 1;
      }
      uVar4 = 0x17;
      if (0x16 < uVar1) {
        uVar4 = uVar2;
      }
    }
    else {
      uVar4 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar4);
    if (__n != 0) {
      memmove(__dest,__src,__n);
    }
    *(undefined4 *)((long)__dest + __n) = param_2;
    if (uVar3 + 1 != 0x17) {
      operator_delete(__src,uVar3 + 1);
    }
    *param_1 = uVar4 | 1;
    param_1[1] = __n + 4;
    param_1[2] = (ulong)__dest;
    *(undefined1 *)((long)__dest + __n + 4) = 0;
  }
  else {
    uVar3 = param_1[2];
    if ((uVar4 & 1) == 0) {
      uVar3 = (long)param_1 + 1;
    }
    uVar4 = __n + 4;
    *(undefined4 *)(uVar3 + __n) = param_2;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)((int)uVar4 << 1);
      *(undefined1 *)(uVar3 + uVar4) = 0;
    }
    else {
      param_1[1] = uVar4;
      *(undefined1 *)(uVar3 + uVar4) = 0;
    }
  }
  return;
}


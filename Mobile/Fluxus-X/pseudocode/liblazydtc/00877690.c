/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877690
 */

void FUN_00877690(undefined8 param_1,ulong *param_2)

{
  size_t __n;
  ulong uVar1;
  ulong uVar2;
  void *__dest;
  void *__src;
  ulong uVar3;
  ulong uVar4;
  
  uVar4 = *param_2;
  uVar3 = 0x16;
  if ((*param_2 & 1) != 0) {
    uVar3 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  __n = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    __n = param_2[1];
  }
  if (uVar3 - __n < 8) {
    if (-uVar3 - 10 < (__n - uVar3) + 8) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    __src = (void *)param_2[2];
    if ((uVar4 & 1) == 0) {
      __src = (void *)((long)param_2 + 1);
    }
    if (uVar3 < 0x7ffffffffffffff3) {
      uVar1 = __n + 8;
      if (__n + 8 <= uVar3 * 2) {
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
    *(undefined8 *)((long)__dest + __n) = param_1;
    if (uVar3 + 1 != 0x17) {
      operator_delete(__src,uVar3 + 1);
    }
    *param_2 = uVar4 | 1;
    param_2[1] = __n + 8;
    param_2[2] = (ulong)__dest;
    *(undefined1 *)((long)__dest + __n + 8) = 0;
  }
  else {
    uVar3 = param_2[2];
    if ((uVar4 & 1) == 0) {
      uVar3 = (long)param_2 + 1;
    }
    uVar4 = __n + 8;
    *(undefined8 *)(uVar3 + __n) = param_1;
    if ((*param_2 & 1) == 0) {
      *(char *)param_2 = (char)((int)uVar4 << 1);
      *(undefined1 *)(uVar3 + uVar4) = 0;
    }
    else {
      param_2[1] = uVar4;
      *(undefined1 *)(uVar3 + uVar4) = 0;
    }
  }
  return;
}


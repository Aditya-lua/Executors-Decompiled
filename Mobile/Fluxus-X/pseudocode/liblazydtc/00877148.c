/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877148
 */

void FUN_00877148(ulong *param_1,undefined1 param_2)

{
  ulong uVar1;
  void *__dest;
  ulong uVar2;
  void *__src;
  ulong uVar3;
  
  uVar2 = *param_1;
  uVar3 = 0x16;
  if ((*param_1 & 1) != 0) {
    uVar3 = (uVar2 & 0xfffffffffffffffe) - 1;
  }
  uVar1 = uVar2 >> 1 & 0x7f;
  if ((uVar2 & 1) != 0) {
    uVar1 = param_1[1];
  }
  if (uVar3 == uVar1) {
    __src = (void *)param_1[2];
    if ((uVar2 & 1) == 0) {
      __src = (void *)((long)param_1 + 1);
    }
    if (uVar3 < 0x7ffffffffffffff3) {
      uVar2 = uVar3 << 1 | 7;
      uVar1 = 0x1a;
      if (uVar2 != 0x17) {
        uVar1 = uVar2 + 1;
      }
      uVar2 = 0x17;
      if (0xb < uVar3) {
        uVar2 = uVar1;
      }
    }
    else {
      uVar2 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar2);
    memmove(__dest,__src,uVar3);
    uVar1 = uVar3 + 1;
    *(undefined1 *)((long)__dest + uVar3) = param_2;
    if (uVar1 != 0x17) {
      operator_delete(__src,uVar1);
    }
    param_1[1] = uVar1;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar2 | 1;
    *(undefined1 *)((long)__dest + uVar1) = 0;
  }
  else {
    uVar3 = param_1[2];
    if ((uVar2 & 1) == 0) {
      uVar3 = (long)param_1 + 1;
    }
    *(undefined1 *)(uVar3 + uVar1) = param_2;
    uVar1 = uVar1 + 1;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)((int)uVar1 << 1);
    }
    else {
      param_1[1] = uVar1;
    }
    *(undefined1 *)(uVar3 + uVar1) = 0;
  }
  return;
}


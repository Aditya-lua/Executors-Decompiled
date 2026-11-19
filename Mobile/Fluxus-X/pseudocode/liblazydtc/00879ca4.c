/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00879ca4
 */

void FUN_00879ca4(ulong *param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  void *__dest;
  void *__src;
  uint uVar5;
  ulong uVar6;
  
  uVar4 = *param_1;
  uVar6 = (uVar4 & 0xfffffffffffffffe) - 1;
  uVar1 = 0x16;
  if ((*param_1 & 1) != 0) {
    uVar1 = uVar6;
  }
  uVar2 = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    uVar2 = param_1[1];
  }
  if (param_2 < 0x17) {
    __src = (void *)param_1[2];
    __dest = (void *)((long)param_1 + 1);
    uVar5 = 1;
  }
  else {
    if (uVar1 < param_2) {
      __dest = operator_new(param_2 + 1);
    }
    else {
                    /* try { // try from 00879d84 to 00879d8b has its CatchHandler @ 00879ddc */
      __dest = operator_new(param_2 + 1);
      uVar3 = 0x16;
      if ((uVar4 & 1) != 0) {
        uVar3 = uVar6;
      }
      if (uVar3 < param_2) {
        operator_delete(__dest,param_2 + 1);
        return;
      }
    }
    __src = (void *)param_1[2];
    uVar5 = (uint)uVar4 & 1;
    if ((uVar4 & 1) == 0) {
      __src = (void *)((long)param_1 + 1);
    }
  }
  if (uVar2 != 0xffffffffffffffff) {
    memmove(__dest,__src,uVar2 + 1);
  }
  if (uVar5 != 0) {
    operator_delete(__src,uVar1 + 1);
  }
  if (param_2 < 0x17) {
    *(char *)param_1 = (char)((int)uVar2 << 1);
  }
  else {
    param_1[2] = (ulong)__dest;
    *param_1 = param_2 + 1 | 1;
    param_1[1] = uVar2;
  }
  return;
}


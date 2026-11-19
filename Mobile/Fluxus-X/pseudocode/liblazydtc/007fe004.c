/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe004
 */

ulong * FUN_007fe004(ulong *param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  void *pvVar4;
  ulong uVar5;
  void *__dest;
  
  uVar5 = *param_1 & 0xfffffffffffffffe;
  if (param_3 < uVar5) {
    __dest = (void *)param_1[2];
    param_1[1] = param_3;
    if (param_3 != 0) {
      memmove(__dest,param_2,param_3);
    }
  }
  else {
    if (-uVar5 - 9 < (param_3 - uVar5) + 1) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    pvVar4 = (void *)param_1[2];
    if ((*param_1 & 1) == 0) {
      pvVar4 = (void *)((long)param_1 + 1);
    }
    if (uVar5 - 1 < 0x7ffffffffffffff3) {
      uVar3 = (uVar5 - 1) * 2;
      uVar1 = param_3;
      if (param_3 <= uVar3) {
        uVar1 = uVar3;
      }
      uVar2 = 0x1a;
      if ((uVar1 | 7) != 0x17) {
        uVar2 = (uVar1 | 7) + 1;
      }
      uVar3 = 0x17;
      if (0x16 < uVar1) {
        uVar3 = uVar2;
      }
    }
    else {
      uVar3 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar3);
    if (param_3 != 0) {
      memcpy(__dest,param_2,param_3);
    }
    operator_delete(pvVar4,uVar5);
    param_1[1] = param_3;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar3 | 1;
  }
  *(undefined1 *)((long)__dest + param_3) = 0;
  return param_1;
}


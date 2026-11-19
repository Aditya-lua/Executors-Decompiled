/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a674
 */

void FUN_0087a674(undefined8 *param_1,ulong param_2)

{
  ulong uVar1;
  void *__s;
  ulong uVar2;
  void *pvVar3;
  void *__src;
  ulong uVar4;
  size_t __n;
  void *__dest;
  
  pvVar3 = (void *)param_1[1];
  if ((ulong)(param_1[2] - (long)pvVar3 >> 2) < param_2) {
    __src = (void *)*param_1;
    __n = (long)pvVar3 - (long)__src;
    uVar1 = ((long)__n >> 2) + param_2;
    if (uVar1 >> 0x3e != 0) {
      FUN_00879790();
LAB_0087a79c:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar4 = param_1[2] - (long)__src;
    uVar2 = (long)uVar4 >> 1;
    if ((ulong)((long)uVar4 >> 1) <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x7ffffffffffffffb < uVar4) {
      uVar2 = 0x3fffffffffffffff;
    }
    if (uVar2 == 0) {
      pvVar3 = (void *)0x0;
    }
    else {
      if (uVar2 >> 0x3e != 0) goto LAB_0087a79c;
      pvVar3 = operator_new(uVar2 << 2);
    }
    __s = (void *)((long)pvVar3 + __n);
    memset(__s,0,param_2 * 4);
    __dest = (void *)((long)__s + ((long)__n >> 2) * -4);
    memcpy(__dest,__src,__n);
    *param_1 = __dest;
    param_1[1] = (void *)((long)__s + param_2 * 4);
    param_1[2] = (void *)((long)pvVar3 + uVar2 * 4);
    if (__src != (void *)0x0) {
      operator_delete(__src,uVar4);
      return;
    }
  }
  else {
    if (param_2 != 0) {
      memset(pvVar3,0,param_2 * 4);
      pvVar3 = (void *)((long)pvVar3 + param_2 * 4);
    }
    param_1[1] = pvVar3;
  }
  return;
}


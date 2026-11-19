/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875380
 */

void FUN_00875380(undefined8 *param_1,void *param_2)

{
  void *pvVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  void *__src;
  ulong uVar5;
  size_t __n;
  
  pvVar1 = (void *)param_1[1];
  if (pvVar1 < (void *)param_1[2]) {
    memcpy(pvVar1,param_2,0x108);
    lVar2 = (long)pvVar1 + 0x108;
LAB_0087548c:
    param_1[1] = lVar2;
    return;
  }
  __src = (void *)*param_1;
  __n = (long)pvVar1 - (long)__src;
  uVar3 = ((long)__n >> 3) * 0xf83e0f83e0f83e1 + 1;
  if (uVar3 < 0xf83e0f83e0f83f) {
    uVar5 = (long)param_1[2] - (long)__src;
    lVar2 = (long)uVar5 >> 3;
    uVar4 = lVar2 * 0x1f07c1f07c1f07c2;
    if (uVar4 <= uVar3) {
      uVar4 = uVar3;
    }
    if (0x7c1f07c1f07c1e < (ulong)(lVar2 * 0xf83e0f83e0f83e1)) {
      uVar4 = 0xf83e0f83e0f83e;
    }
    if (uVar4 < 0xf83e0f83e0f83f) {
      pvVar1 = operator_new(uVar4 * 0x108);
      memcpy((void *)((long)pvVar1 + __n),param_2,0x108);
      lVar2 = (long)((long)pvVar1 + __n) + 0x108;
      memcpy(pvVar1,__src,__n);
      *param_1 = pvVar1;
      param_1[1] = lVar2;
      param_1[2] = (void *)((long)pvVar1 + uVar4 * 0x108);
      if (__src != (void *)0x0) {
        operator_delete(__src,uVar5);
      }
      goto LAB_0087548c;
    }
  }
  else {
    FUN_00879e0c();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}


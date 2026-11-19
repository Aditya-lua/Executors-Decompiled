/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089f5cc
 */

void FUN_0089f5cc(undefined8 *param_1,ulong param_2)

{
  void *pvVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  void *__src;
  ulong uVar5;
  size_t sVar6;
  size_t __n;
  
  pvVar1 = (void *)param_1[1];
  if ((ulong)((param_1[2] - (long)pvVar1 >> 3) * -0x3333333333333333) < param_2) {
    __src = (void *)*param_1;
    sVar6 = (long)pvVar1 - (long)__src;
    uVar3 = param_2 + ((long)sVar6 >> 3) * -0x3333333333333333;
    if (0x666666666666666 < uVar3) {
      FUN_0089f5b8();
LAB_0089f758:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar5 = param_1[2] - (long)__src;
    lVar2 = (long)uVar5 >> 3;
    uVar4 = lVar2 * -0x6666666666666666;
    if (uVar4 <= uVar3) {
      uVar4 = uVar3;
    }
    if (0x333333333333332 < (ulong)(lVar2 * -0x3333333333333333)) {
      uVar4 = 0x666666666666666;
    }
    if (uVar4 == 0) {
      pvVar1 = (void *)0x0;
    }
    else {
      if (0x666666666666666 < uVar4) goto LAB_0089f758;
      pvVar1 = operator_new(uVar4 * 0x28);
    }
    __n = ((param_2 * 0x28 - 0x28) / 0x28) * 0x28 + 0x28;
    memset((void *)((long)pvVar1 + sVar6),0,__n);
    memcpy(pvVar1,__src,sVar6);
    *param_1 = pvVar1;
    param_1[1] = (long)((long)pvVar1 + sVar6) + __n;
    param_1[2] = (void *)((long)pvVar1 + uVar4 * 0x28);
    if (__src != (void *)0x0) {
      operator_delete(__src,uVar5);
      return;
    }
  }
  else {
    if (param_2 != 0) {
      sVar6 = ((param_2 * 0x28 - 0x28) / 0x28) * 0x28 + 0x28;
      memset(pvVar1,0,sVar6);
      pvVar1 = (void *)((long)pvVar1 + sVar6);
    }
    param_1[1] = pvVar1;
  }
  return;
}


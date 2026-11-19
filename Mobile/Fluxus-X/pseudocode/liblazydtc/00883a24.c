/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00883a24
 */

void FUN_00883a24(undefined8 *param_1,void *param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  void *__dest;
  void *__dest_00;
  size_t sVar2;
  long lVar3;
  ulong uVar4;
  size_t __n;
  
  uVar4 = param_1[2];
  __dest = (void *)*param_1;
  if ((ulong)((long)(uVar4 - (long)__dest) >> 3) < param_4) {
    if (__dest != (void *)0x0) {
      param_1[1] = __dest;
      operator_delete(__dest,uVar4 - (long)__dest);
      uVar4 = 0;
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
    }
    if (param_4 >> 0x3d != 0) {
LAB_00883b58:
      FUN_00883b5c();
                    /* WARNING: Subroutine does not return */
      FUN_007fe138("vector");
    }
    uVar1 = (long)uVar4 >> 2;
    if ((ulong)((long)uVar4 >> 2) <= param_4) {
      uVar1 = param_4;
    }
    if (0x7ffffffffffffff7 < uVar4) {
      uVar1 = 0x1fffffffffffffff;
    }
    if (uVar1 >> 0x3d != 0) goto LAB_00883b58;
    __dest_00 = operator_new(uVar1 * 8);
    __n = param_3 - (long)param_2;
    *param_1 = __dest_00;
    param_1[1] = __dest_00;
    param_1[2] = (void *)((long)__dest_00 + uVar1 * 8);
    if (__n != 0) {
      memcpy(__dest_00,param_2,__n);
    }
  }
  else {
    __dest_00 = (void *)param_1[1];
    sVar2 = (long)__dest_00 - (long)__dest;
    if (param_4 <= (ulong)((long)sVar2 >> 3)) {
      sVar2 = param_3 - (long)param_2;
      if (sVar2 != 0) {
        memmove(__dest,param_2,sVar2);
      }
      lVar3 = (long)__dest + sVar2;
      goto LAB_00883b40;
    }
    if (__dest_00 != __dest) {
      memmove(__dest,param_2,sVar2);
      __dest_00 = (void *)param_1[1];
    }
    __n = param_3 - (long)((long)param_2 + sVar2);
    if (__n != 0) {
      memmove(__dest_00,(void *)((long)param_2 + sVar2),__n);
    }
  }
  lVar3 = (long)__dest_00 + __n;
LAB_00883b40:
  param_1[1] = lVar3;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1a684
 */

void FUN_00c1a684(long param_1,undefined8 *param_2)

{
  void *pvVar1;
  size_t __size;
  long lVar2;
  long lVar3;
  ulong uVar4;
  size_t sVar5;
  long *plVar6;
  void *__src;
  
  sVar5 = *(size_t *)(param_1 + 0x18);
  if (sVar5 != 0) {
    lVar2 = param_2[1];
    pvVar1 = (void *)*param_2;
    __src = *(void **)(param_1 + 0x10);
    if ((ulong)param_2[2] < lVar2 + sVar5) {
      __size = param_2[2] * 2;
      uVar4 = lVar2 + sVar5 + 0x3e0;
      if (__size <= uVar4) {
        __size = uVar4;
      }
      param_2[2] = __size;
      pvVar1 = realloc(pvVar1,__size);
      *param_2 = pvVar1;
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar2 = param_2[1];
    }
    memcpy((void *)((long)pvVar1 + lVar2),__src,sVar5);
    param_2[1] = param_2[1] + sVar5;
  }
  plVar6 = *(long **)(param_1 + 0x20);
  if ((ushort)((*(ushort *)((long)plVar6 + 9) & 0x3f) * 4) <
      (ushort)((*(ushort *)(param_1 + 9) & 0x3f) * 4)) {
    (**(code **)(*plVar6 + 0x20))(plVar6,param_2);
    if ((*(ushort *)((long)plVar6 + 9) & 0xc0) != 0x40) {
                    /* WARNING: Could not recover jumptable at 0x00c1a760. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*plVar6 + 0x28))(plVar6,param_2);
      return;
    }
  }
  else {
    lVar2 = param_2[1];
    pvVar1 = (void *)*param_2;
    uVar4 = lVar2 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + 1;
    if ((ulong)param_2[2] < uVar4) {
      sVar5 = param_2[2] * 2;
      if (sVar5 <= lVar2 + 0x3e1U) {
        sVar5 = lVar2 + 0x3e1U;
      }
      param_2[2] = sVar5;
      pvVar1 = realloc(pvVar1,sVar5);
      *param_2 = pvVar1;
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar2 = param_2[1];
      uVar4 = lVar2 + 1;
    }
    param_2[1] = uVar4;
    lVar3 = *plVar6;
    *(undefined1 *)((long)pvVar1 + lVar2) = 0x28;
    (**(code **)(lVar3 + 0x20))(plVar6,param_2);
    if ((*(ushort *)((long)plVar6 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar6 + 0x28))(plVar6,param_2);
    }
    lVar2 = param_2[1];
    pvVar1 = (void *)*param_2;
    uVar4 = lVar2 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
    if ((ulong)param_2[2] < uVar4) {
      sVar5 = param_2[2] * 2;
      if (sVar5 <= lVar2 + 0x3e1U) {
        sVar5 = lVar2 + 0x3e1U;
      }
      param_2[2] = sVar5;
      pvVar1 = realloc(pvVar1,sVar5);
      *param_2 = pvVar1;
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar2 = param_2[1];
      uVar4 = lVar2 + 1;
    }
    param_2[1] = uVar4;
    *(undefined1 *)((long)pvVar1 + lVar2) = 0x29;
  }
  return;
}


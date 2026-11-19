/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1f4e4
 */

void FUN_00c1f4e4(long param_1,undefined8 *param_2)

{
  undefined4 uVar1;
  void *pvVar2;
  long lVar3;
  size_t sVar4;
  ulong uVar5;
  long *plVar6;
  
  if (*(long *)(param_1 + 0x18) != 0) {
    lVar3 = param_2[1];
    pvVar2 = (void *)*param_2;
    uVar1 = *(undefined4 *)(param_2 + 4);
    *(undefined4 *)(param_2 + 4) = 0;
    if ((ulong)param_2[2] < lVar3 + 1U) {
      sVar4 = param_2[2] * 2;
      if (sVar4 <= lVar3 + 0x3e1U) {
        sVar4 = lVar3 + 0x3e1U;
      }
      param_2[2] = sVar4;
      pvVar2 = realloc(pvVar2,sVar4);
      *param_2 = pvVar2;
      if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar3 = param_2[1];
    }
    *(undefined1 *)((long)pvVar2 + lVar3) = 0x3c;
    param_2[1] = param_2[1] + 1;
                    /* try { // try from 00c1f55c to 00c1f567 has its CatchHandler @ 00c1f83c */
    FUN_00c1b464(param_1 + 0x10,param_2);
    lVar3 = param_2[1];
    pvVar2 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar3 + 1U) {
      sVar4 = param_2[2] * 2;
      if (sVar4 <= lVar3 + 0x3e1U) {
        sVar4 = lVar3 + 0x3e1U;
      }
      param_2[2] = sVar4;
      pvVar2 = realloc(pvVar2,sVar4);
      *param_2 = pvVar2;
      if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar3 = param_2[1];
    }
    *(undefined1 *)((long)pvVar2 + lVar3) = 0x3e;
    *(undefined4 *)(param_2 + 4) = uVar1;
    param_2[1] = param_2[1] + 1;
  }
  lVar3 = param_2[1];
  if (*(long *)(param_1 + 0x20) != 0) {
    pvVar2 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar3 + 10U) {
      sVar4 = param_2[2] * 2;
      if (sVar4 <= lVar3 + 0x3eaU) {
        sVar4 = lVar3 + 0x3eaU;
      }
      param_2[2] = sVar4;
      pvVar2 = realloc(pvVar2,sVar4);
      *param_2 = pvVar2;
      if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar3 = param_2[1];
    }
    builtin_strncpy((char *)((long)pvVar2 + lVar3)," requires ",10);
    plVar6 = *(long **)(param_1 + 0x20);
    lVar3 = *plVar6;
    param_2[1] = param_2[1] + 10;
    (**(code **)(lVar3 + 0x20))(plVar6,param_2);
    if ((*(ushort *)((long)plVar6 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar6 + 0x28))(plVar6,param_2);
    }
    lVar3 = param_2[1];
    pvVar2 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar3 + 1U) {
      sVar4 = param_2[2] * 2;
      if (sVar4 <= lVar3 + 0x3e1U) {
        sVar4 = lVar3 + 0x3e1U;
      }
      param_2[2] = sVar4;
      pvVar2 = realloc(pvVar2,sVar4);
      *param_2 = pvVar2;
      if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar3 = param_2[1];
    }
    *(undefined1 *)((long)pvVar2 + lVar3) = 0x20;
    lVar3 = param_2[1] + 1;
    param_2[1] = lVar3;
  }
  uVar5 = lVar3 + 1;
  pvVar2 = (void *)*param_2;
  *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + 1;
  if ((ulong)param_2[2] < uVar5) {
    sVar4 = param_2[2] * 2;
    if (sVar4 <= lVar3 + 0x3e1U) {
      sVar4 = lVar3 + 0x3e1U;
    }
    param_2[2] = sVar4;
    pvVar2 = realloc(pvVar2,sVar4);
    *param_2 = pvVar2;
    if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar3 = param_2[1];
    uVar5 = lVar3 + 1;
  }
  param_2[1] = uVar5;
  *(undefined1 *)((long)pvVar2 + lVar3) = 0x28;
  FUN_00c1b464(param_1 + 0x28,param_2);
  lVar3 = param_2[1];
  pvVar2 = (void *)*param_2;
  uVar5 = lVar3 + 1;
  *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
  if ((ulong)param_2[2] < uVar5) {
    sVar4 = param_2[2] * 2;
    if (sVar4 <= lVar3 + 0x3e1U) {
      sVar4 = lVar3 + 0x3e1U;
    }
    param_2[2] = sVar4;
    pvVar2 = realloc(pvVar2,sVar4);
    *param_2 = pvVar2;
    if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar3 = param_2[1];
    uVar5 = lVar3 + 1;
  }
  param_2[1] = uVar5;
  *(undefined1 *)((long)pvVar2 + lVar3) = 0x29;
  if (*(long *)(param_1 + 0x38) != 0) {
    lVar3 = param_2[1];
    pvVar2 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar3 + 10U) {
      sVar4 = param_2[2] * 2;
      if (sVar4 <= lVar3 + 0x3eaU) {
        sVar4 = lVar3 + 0x3eaU;
      }
      param_2[2] = sVar4;
      pvVar2 = realloc(pvVar2,sVar4);
      *param_2 = pvVar2;
      if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar3 = param_2[1];
    }
    builtin_strncpy((char *)((long)pvVar2 + lVar3)," requires ",10);
    plVar6 = *(long **)(param_1 + 0x38);
    lVar3 = *plVar6;
    param_2[1] = param_2[1] + 10;
    (**(code **)(lVar3 + 0x20))(plVar6,param_2);
    if ((*(ushort *)((long)plVar6 + 9) & 0xc0) != 0x40) {
                    /* WARNING: Could not recover jumptable at 0x00c1f81c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*plVar6 + 0x28))(plVar6,param_2);
      return;
    }
  }
  return;
}


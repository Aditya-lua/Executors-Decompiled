/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c1a0ac
 */

void FUN_00c1a0ac(long param_1,undefined8 *param_2)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  void *pvVar5;
  size_t __size;
  long lVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  size_t sVar10;
  char *__src;
  
  if (*(int *)(param_2 + 4) == 0) {
    if (*(long *)(param_1 + 0x20) == 2) {
      if (**(short **)(param_1 + 0x18) == 0x3e3e) goto LAB_00c1a53c;
      goto LAB_00c1a0d4;
    }
    if ((*(long *)(param_1 + 0x20) != 1) || ((char)**(short **)(param_1 + 0x18) != '>'))
    goto LAB_00c1a0d4;
LAB_00c1a53c:
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    *(undefined4 *)(param_2 + 4) = 1;
    uVar8 = lVar6 + 1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    bVar3 = true;
    param_2[1] = uVar8;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x28;
  }
  else {
LAB_00c1a0d4:
    bVar3 = false;
  }
  plVar9 = *(long **)(param_1 + 0x10);
  uVar2 = (uint)*(ushort *)(param_1 + 9) << 10;
  bVar4 = (uVar2 & 0xfc00) != 0x4400;
  uVar1 = 0xf;
  if (bVar4) {
    uVar1 = (int)((uint)*(ushort *)(param_1 + 9) << 0x1a) >> 0x1a;
  }
  if (bVar4) {
    uVar1 = uVar1 + 1;
  }
  if ((uint)((int)((uint)*(ushort *)((long)plVar9 + 9) << 0x1a) >> 0x1a) < uVar1) {
    (**(code **)(*plVar9 + 0x20))(plVar9,param_2);
    if ((*(ushort *)((long)plVar9 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar9 + 0x28))(plVar9,param_2);
    }
  }
  else {
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    uVar8 = lVar6 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + 1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    param_2[1] = uVar8;
    lVar7 = *plVar9;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x28;
    (**(code **)(lVar7 + 0x20))(plVar9,param_2);
    if ((*(ushort *)((long)plVar9 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar9 + 0x28))(plVar9,param_2);
    }
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    uVar8 = lVar6 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    param_2[1] = uVar8;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x29;
  }
  if ((*(long *)(param_1 + 0x20) == 1) && (__src = *(char **)(param_1 + 0x18), *__src == ',')) {
    sVar10 = 1;
  }
  else {
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    if ((ulong)param_2[2] < lVar6 + 1U) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
    }
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x20;
    param_2[1] = param_2[1] + 1;
    sVar10 = *(size_t *)(param_1 + 0x20);
    if (sVar10 == 0) {
      lVar6 = param_2[1];
      goto LAB_00c1a328;
    }
    __src = *(char **)(param_1 + 0x18);
  }
  lVar6 = param_2[1];
  pvVar5 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar6 + sVar10) {
    __size = param_2[2] * 2;
    uVar8 = lVar6 + sVar10 + 0x3e0;
    if (__size <= uVar8) {
      __size = uVar8;
    }
    param_2[2] = __size;
    pvVar5 = realloc(pvVar5,__size);
    *param_2 = pvVar5;
    if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar6 = param_2[1];
  }
  memcpy((void *)((long)pvVar5 + lVar6),__src,sVar10);
  lVar6 = param_2[1] + sVar10;
  param_2[1] = lVar6;
LAB_00c1a328:
  pvVar5 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar6 + 1U) {
    sVar10 = param_2[2] * 2;
    if (sVar10 <= lVar6 + 0x3e1U) {
      sVar10 = lVar6 + 0x3e1U;
    }
    param_2[2] = sVar10;
    pvVar5 = realloc(pvVar5,sVar10);
    *param_2 = pvVar5;
    if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar6 = param_2[1];
  }
  *(undefined1 *)((long)pvVar5 + lVar6) = 0x20;
  lVar7 = param_2[1];
  plVar9 = *(long **)(param_1 + 0x28);
  lVar6 = lVar7 + 1;
  param_2[1] = lVar6;
  uVar1 = (int)((uint)*(ushort *)(param_1 + 9) << 0x1a) >> 0x1a;
  if ((uVar2 & 0xffff) == 0x4400) {
    uVar1 = uVar1 + 1;
  }
  if ((uint)((int)((uint)*(ushort *)((long)plVar9 + 9) << 0x1a) >> 0x1a) < uVar1) {
    (**(code **)(*plVar9 + 0x20))(plVar9,param_2);
    if ((*(ushort *)((long)plVar9 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar9 + 0x28))(plVar9,param_2);
    }
  }
  else {
    uVar8 = lVar7 + 2;
    pvVar5 = (void *)*param_2;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + 1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar7 + 0x3e2U) {
        sVar10 = lVar7 + 0x3e2U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    lVar7 = *plVar9;
    param_2[1] = uVar8;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x28;
    (**(code **)(lVar7 + 0x20))(plVar9,param_2);
    if ((*(ushort *)((long)plVar9 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar9 + 0x28))(plVar9,param_2);
    }
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    uVar8 = lVar6 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    param_2[1] = uVar8;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x29;
  }
  if (bVar3) {
    lVar6 = param_2[1];
    pvVar5 = (void *)*param_2;
    uVar8 = lVar6 + 1;
    *(int *)(param_2 + 4) = *(int *)(param_2 + 4) + -1;
    if ((ulong)param_2[2] < uVar8) {
      sVar10 = param_2[2] * 2;
      if (sVar10 <= lVar6 + 0x3e1U) {
        sVar10 = lVar6 + 0x3e1U;
      }
      param_2[2] = sVar10;
      pvVar5 = realloc(pvVar5,sVar10);
      *param_2 = pvVar5;
      if (pvVar5 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      lVar6 = param_2[1];
      uVar8 = lVar6 + 1;
    }
    param_2[1] = uVar8;
    *(undefined1 *)((long)pvVar5 + lVar6) = 0x29;
  }
  return;
}


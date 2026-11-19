/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c123b0
 */

void FUN_00c123b0(long *param_1,long param_2)

{
  size_t sVar1;
  void *__src;
  void *__src_00;
  long lVar2;
  void *pvVar3;
  long *plVar4;
  long *plVar5;
  long *__dest;
  long *plVar6;
  
  pvVar3 = (void *)(param_2 + 0x2b0);
  __dest = param_1 + 4;
  param_1[5] = 0;
  *__dest = 0;
  *param_1 = param_2;
  param_1[1] = (long)__dest;
  plVar4 = param_1 + 0xb;
  param_1[0xc] = 0;
  *plVar4 = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  param_1[0x12] = 0;
  param_1[0x11] = 0;
  __src = *(void **)(param_2 + 0x298);
  plVar6 = param_1 + 8;
  *plVar6 = (long)plVar4;
  param_1[2] = (long)__dest;
  param_1[3] = (long)plVar6;
  param_1[9] = (long)plVar4;
  param_1[10] = (long)(param_1 + 0x13);
  plVar5 = plVar4;
  if (__src == pvVar3) {
    sVar1 = *(long *)(param_2 + 0x2a0) - (long)__src;
    if (sVar1 == 0) {
      pvVar3 = __src;
    }
    else {
      memmove(__dest,__src,sVar1);
      __src = *(void **)(param_2 + 0x298);
      plVar5 = (long *)*plVar6;
      pvVar3 = *(void **)(param_2 + 0x2a0);
    }
    param_1[2] = (long)__dest + ((long)pvVar3 - (long)__src);
    *(void **)(param_2 + 0x2a0) = __src;
  }
  else {
    param_1[1] = (long)__src;
    lVar2 = *(long *)(param_2 + 0x2a0);
    param_1[3] = *(long *)(param_2 + 0x2a8);
    param_1[2] = lVar2;
    *(void **)(param_2 + 0x298) = pvVar3;
    *(void **)(param_2 + 0x2a0) = pvVar3;
    *(long *)(param_2 + 0x2a8) = param_2 + 0x2d0;
    __src = pvVar3;
  }
  __src_00 = *(void **)(param_2 + 0x240);
  pvVar3 = (void *)(param_2 + 600);
  if (__src_00 == pvVar3) {
    if (plVar5 != plVar4) {
      free(plVar5);
      param_1[8] = (long)plVar4;
      param_1[9] = (long)plVar4;
      __src_00 = *(void **)(param_2 + 0x240);
      param_1[10] = (long)(param_1 + 0x13);
      plVar5 = plVar4;
    }
    sVar1 = *(long *)(param_2 + 0x248) - (long)__src_00;
    if (sVar1 == 0) {
      pvVar3 = __src_00;
    }
    else {
      memmove(plVar5,__src_00,sVar1);
      plVar5 = (long *)*plVar6;
      __src_00 = *(void **)(param_2 + 0x240);
      pvVar3 = *(void **)(param_2 + 0x248);
    }
    param_1[9] = (long)plVar5 + ((long)pvVar3 - (long)__src_00);
    *(void **)(param_2 + 0x248) = __src_00;
    param_2 = *param_1;
    __src = *(void **)(param_2 + 0x298);
    pvVar3 = *(void **)(param_2 + 0x240);
  }
  else {
    *plVar6 = (long)__src_00;
    if (plVar5 == plVar4) {
      lVar2 = *(long *)(param_2 + 0x248);
      param_1[10] = *(long *)(param_2 + 0x250);
      param_1[9] = lVar2;
      *(void **)(param_2 + 0x240) = pvVar3;
      *(void **)(param_2 + 0x248) = pvVar3;
      *(long *)(param_2 + 0x250) = param_2 + 0x298;
    }
    else {
      *(long **)(param_2 + 0x240) = plVar5;
      lVar2 = param_1[9];
      param_1[9] = *(long *)(param_2 + 0x248);
      *(long *)(param_2 + 0x248) = lVar2;
      lVar2 = param_1[10];
      param_1[10] = *(long *)(param_2 + 0x250);
      pvVar3 = *(void **)(param_2 + 0x240);
      *(long *)(param_2 + 0x250) = lVar2;
      *(void **)(param_2 + 0x248) = pvVar3;
    }
  }
  *(void **)(param_2 + 0x2a0) = __src;
  *(void **)(param_2 + 0x248) = pvVar3;
  return;
}


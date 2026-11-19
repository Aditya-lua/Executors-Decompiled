/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875d78
 */

void FUN_00875d78(long param_1)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  ulong uVar5;
  ulong uVar6;
  
  pvVar3 = *(void **)(param_1 + 0x1a8);
  pvVar4 = *(void **)(param_1 + 0x1b0);
  if (pvVar4 != pvVar3) {
    uVar6 = 0;
    do {
      pvVar2 = (void *)((long)pvVar3 + uVar6 * 0x10);
      uVar5 = *(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30) >> 2;
      if (uVar5 == *(uint *)((long)pvVar2 + 8)) {
        pvVar1 = (void *)((long)pvVar2 + 0x10);
        if (pvVar4 != pvVar1) {
          memmove(pvVar2,pvVar1,(long)pvVar4 - (long)pvVar1);
          pvVar3 = *(void **)(param_1 + 0x1a8);
        }
        pvVar4 = (void *)((long)pvVar2 + ((long)pvVar4 - (long)pvVar1));
        *(void **)(param_1 + 0x1b0) = pvVar4;
      }
      else {
        if (uVar5 == *(uint *)((long)pvVar2 + 0xc)) {
          *(uint *)((long)pvVar2 + 0xc) = *(uint *)((long)pvVar2 + 0xc) - 1;
        }
        uVar6 = uVar6 + 1;
      }
    } while (uVar6 < (ulong)((long)pvVar4 - (long)pvVar3 >> 4));
  }
  pvVar3 = *(void **)(param_1 + 0x1d8);
  pvVar4 = *(void **)(param_1 + 0x1e0);
  if (pvVar4 != pvVar3) {
    uVar6 = 0;
    do {
      pvVar2 = (void *)((long)pvVar3 + uVar6 * 0x10);
      uVar5 = *(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30) >> 2;
      if (uVar5 == *(uint *)((long)pvVar2 + 8)) {
        pvVar1 = (void *)((long)pvVar2 + 0x10);
        if (pvVar4 != pvVar1) {
          memmove(pvVar2,pvVar1,(long)pvVar4 - (long)pvVar1);
          pvVar3 = *(void **)(param_1 + 0x1d8);
        }
        pvVar4 = (void *)((long)pvVar2 + ((long)pvVar4 - (long)pvVar1));
        *(void **)(param_1 + 0x1e0) = pvVar4;
      }
      else {
        if (uVar5 == *(uint *)((long)pvVar2 + 0xc)) {
          *(uint *)((long)pvVar2 + 0xc) = *(uint *)((long)pvVar2 + 0xc) - 1;
        }
        uVar6 = uVar6 + 1;
      }
    } while (uVar6 < (ulong)((long)pvVar4 - (long)pvVar3 >> 4));
  }
  *(long *)(param_1 + 0x38) = *(long *)(param_1 + 0x38) + -4;
  *(long *)(param_1 + 0x50) = *(long *)(param_1 + 0x50) + -4;
  return;
}


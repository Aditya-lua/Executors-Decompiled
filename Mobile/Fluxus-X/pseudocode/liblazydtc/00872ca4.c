/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00872ca4
 */

void FUN_00872ca4(long param_1)

{
  void *pvVar1;
  undefined8 *puVar2;
  void *pvVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  void *pvVar6;
  
  if (*(void **)(param_1 + 0x58) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x58));
    *(undefined8 *)(param_1 + 0x58) = 0;
    operator_delete(*(void **)(param_1 + 0x70));
    *(undefined8 *)(param_1 + 0x60) = 0;
    *(undefined8 *)(param_1 + 0x68) = 0;
    *(undefined8 *)(param_1 + 0x70) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x78) = 0;
    *(undefined1 *)(param_1 + 0x88) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x70));
  pvVar1 = *(void **)(param_1 + 0x40);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x48) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x50) - (long)pvVar1);
  }
  puVar5 = *(undefined8 **)(param_1 + 0x28);
  if (puVar5 != (undefined8 *)0x0) {
    puVar4 = *(undefined8 **)(param_1 + 0x30);
    puVar2 = puVar5;
    if (puVar5 != puVar4) {
      do {
        puVar4 = puVar4 + -6;
        (**(code **)*puVar4)(puVar4);
      } while (puVar4 != puVar5);
      puVar2 = *(undefined8 **)(param_1 + 0x28);
    }
    *(undefined8 **)(param_1 + 0x30) = puVar5;
    operator_delete(puVar2,*(long *)(param_1 + 0x38) - (long)puVar2);
  }
  pvVar1 = *(void **)(param_1 + 0x10);
  if (pvVar1 == (void *)0x0) {
    return;
  }
  pvVar6 = *(void **)(param_1 + 0x18);
  pvVar3 = pvVar1;
  if (pvVar1 != pvVar6) {
    do {
      if ((*(byte *)((long)pvVar6 + -0x18) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar6 + -8),
                        *(ulong *)((long)pvVar6 + -0x18) & 0xfffffffffffffffe);
      }
      pvVar6 = (void *)((long)pvVar6 + -0x30);
    } while (pvVar6 != pvVar1);
    pvVar3 = *(void **)(param_1 + 0x10);
  }
  *(void **)(param_1 + 0x18) = pvVar1;
  operator_delete(pvVar3,*(long *)(param_1 + 0x20) - (long)pvVar3);
  return;
}


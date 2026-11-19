/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008826c4
 */

void FUN_008826c4(long param_1)

{
  void *pvVar1;
  
  pvVar1 = *(void **)(param_1 + 0xb0);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0xb8) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0xc0) - (long)pvVar1);
  }
  if (*(void **)(param_1 + 0x78) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x78));
    *(undefined8 *)(param_1 + 0x78) = 0;
    operator_delete(*(void **)(param_1 + 0x90));
    *(undefined8 *)(param_1 + 0x80) = 0;
    *(undefined8 *)(param_1 + 0x88) = 0;
    *(undefined8 *)(param_1 + 0x90) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x98) = 0;
    *(undefined1 *)(param_1 + 0xa8) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x90));
  if (*(void **)(param_1 + 0x40) != (void *)0x0) {
    operator_delete(*(void **)(param_1 + 0x40));
    *(undefined8 *)(param_1 + 0x40) = 0;
    operator_delete(*(void **)(param_1 + 0x58));
    *(undefined8 *)(param_1 + 0x48) = 0;
    *(undefined8 *)(param_1 + 0x50) = 0;
    *(undefined8 *)(param_1 + 0x58) = 0;
    operator_delete((void *)0x0);
    *(undefined8 *)(param_1 + 0x60) = 0;
    *(undefined1 *)(param_1 + 0x70) = 0x40;
  }
  operator_delete(*(void **)(param_1 + 0x58));
  return;
}


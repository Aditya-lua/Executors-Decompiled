/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844494
 */

void FUN_00844494(long param_1)

{
  void *pvVar1;
  
  pvVar1 = *(void **)(param_1 + 0x38);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x40) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x48) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 0x20);
  if (pvVar1 == (void *)0x0) {
    return;
  }
  *(void **)(param_1 + 0x28) = pvVar1;
  operator_delete(pvVar1,*(long *)(param_1 + 0x30) - (long)pvVar1);
  return;
}


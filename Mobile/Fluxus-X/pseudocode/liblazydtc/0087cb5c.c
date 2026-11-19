/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087cb5c
 */

void FUN_0087cb5c(long param_1)

{
  void *pvVar1;
  
  pvVar1 = *(void **)(param_1 + 0x20);
  if (pvVar1 != (void *)0x0) {
    *(void **)(param_1 + 0x28) = pvVar1;
    operator_delete(pvVar1,*(long *)(param_1 + 0x30) - (long)pvVar1);
  }
  pvVar1 = *(void **)(param_1 + 8);
  if (pvVar1 == (void *)0x0) {
    return;
  }
  *(void **)(param_1 + 0x10) = pvVar1;
  operator_delete(pvVar1,*(long *)(param_1 + 0x18) - (long)pvVar1);
  return;
}


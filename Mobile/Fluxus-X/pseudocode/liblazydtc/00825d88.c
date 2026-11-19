/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00825d88
 */

void FUN_00825d88(undefined8 *param_1)

{
  void *pvVar1;
  
  pvVar1 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  if (*(char *)(param_1 + 2) == '\x01') {
    if ((*(byte *)((long)pvVar1 + 0x38) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar1 + 0x48),
                      *(ulong *)((long)pvVar1 + 0x38) & 0xfffffffffffffffe);
    }
    if ((*(byte *)((long)pvVar1 + 0x20) & 1) != 0) {
      operator_delete(*(void **)((long)pvVar1 + 0x30),
                      *(ulong *)((long)pvVar1 + 0x20) & 0xfffffffffffffffe);
    }
  }
  operator_delete(pvVar1,0x50);
  return;
}


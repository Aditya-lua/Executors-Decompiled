/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00871318
 */

void FUN_00871318(undefined8 *param_1)

{
  void *pvVar1;
  
  pvVar1 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  if ((*(char *)(param_1 + 2) == '\x01') && ((*(byte *)((long)pvVar1 + 0x10) & 1) != 0)) {
    operator_delete(*(void **)((long)pvVar1 + 0x20),
                    *(ulong *)((long)pvVar1 + 0x10) & 0xfffffffffffffffe);
  }
  operator_delete(pvVar1,0x28);
  return;
}


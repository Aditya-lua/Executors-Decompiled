/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828f2c
 */

void FUN_00828f2c(undefined8 *param_1)

{
  void *pvVar1;
  
  pvVar1 = (void *)*param_1;
  *param_1 = 0;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  if ((*(char *)(param_1 + 2) == '\x01') && ((*(byte *)((long)pvVar1 + 0x28) & 1) != 0)) {
    operator_delete(*(void **)((long)pvVar1 + 0x38),
                    *(ulong *)((long)pvVar1 + 0x28) & 0xfffffffffffffffe);
  }
  operator_delete(pvVar1,0x40);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083cf1c
 */

void FUN_0083cf1c(long param_1,void *param_2)

{
  undefined8 *puVar1;
  void *pvVar2;
  
  if (*(char *)(param_1 + 8) == '\x01') {
    puVar1 = *(void **)((long)param_2 + 0x28);
    while (puVar1 != (void *)0x0) {
      pvVar2 = (void *)*puVar1;
      if ((*(byte *)(puVar1 + 2) & 1) != 0) {
        operator_delete((void *)puVar1[4],puVar1[2] & 0xfffffffffffffffe);
      }
      operator_delete(puVar1,0x30);
      puVar1 = pvVar2;
    }
    pvVar2 = *(void **)((long)param_2 + 0x18);
    *(undefined8 *)((long)param_2 + 0x18) = 0;
    if (pvVar2 != (void *)0x0) {
      operator_delete(pvVar2,*(long *)((long)param_2 + 0x20) << 3);
    }
  }
  else if (param_2 == (void *)0x0) {
    return;
  }
  operator_delete(param_2,0x40);
  return;
}


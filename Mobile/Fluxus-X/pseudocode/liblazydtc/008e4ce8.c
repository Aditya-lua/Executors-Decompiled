/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4ce8
 */

void FUN_008e4ce8(void)

{
  void *pvVar1;
  
  if (DAT_00d1fed8 == (void *)0x0) {
    pvVar1 = operator_new(0x10);
    DAT_00d1fed8 = pvVar1;
    *(void **)pvVar1 = pvVar1;
    *(void **)((long)pvVar1 + 8) = pvVar1;
  }
  return;
}


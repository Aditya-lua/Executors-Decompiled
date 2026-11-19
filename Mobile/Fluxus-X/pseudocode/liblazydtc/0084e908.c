/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e908
 */

void FUN_0084e908(undefined8 *param_1)

{
  undefined8 *puVar1;
  void *pvVar2;
  
  puVar1 = (void *)*param_1;
  while (puVar1 != (void *)0x0) {
    pvVar2 = (void *)*puVar1;
    operator_delete(puVar1);
    puVar1 = pvVar2;
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0b544
 */

void FUN_00c0b544(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  param_1 = (undefined8 *)*param_1;
  puVar1 = (undefined8 *)*param_1;
  if (puVar1 != (void *)0x0) {
    param_1[1] = puVar1;
    if (puVar1 != param_1 + 3) {
      operator_delete(puVar1,param_1[2] - (long)puVar1);
      return;
    }
    *(undefined1 *)(param_1 + 0x21) = 0;
  }
  return;
}


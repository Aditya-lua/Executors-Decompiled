/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00849b8c
 */

void FUN_00849b8c(undefined8 *param_1)

{
  *param_1 = &PTR_LAB_00c48ff8;
  if ((long *)param_1[2] != (long *)0x0) {
    (**(code **)(*(long *)param_1[2] + 8))();
  }
  *param_1 = &PTR_LAB_00c48b78;
  if ((long *)param_1[1] != (long *)0x0) {
    (**(code **)(*(long *)param_1[1] + 8))();
  }
  operator_delete(param_1,0x38);
  return;
}


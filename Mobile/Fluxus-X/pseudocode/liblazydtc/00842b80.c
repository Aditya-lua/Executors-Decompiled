/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00842b80
 */

void FUN_00842b80(undefined8 *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)param_1[1];
  *param_1 = &PTR_LAB_00c48b78;
  if (plVar1 != (long *)0x0) {
    (**(code **)(*plVar1 + 8))(plVar1);
  }
  operator_delete(param_1,0x10);
  return;
}


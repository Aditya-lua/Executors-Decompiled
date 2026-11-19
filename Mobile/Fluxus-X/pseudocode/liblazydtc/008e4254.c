/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4254
 */

void FUN_008e4254(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)param_1[1];
  *param_1 = &PTR_LAB_00c4e2a8;
  if (puVar1 != (undefined8 *)0x0) {
    *puVar1 = &PTR_LAB_00c4e410;
    FUN_008e5164(puVar1);
    operator_delete(puVar1);
  }
  param_1[1] = 0;
  FUN_008e479c(param_1);
  return;
}


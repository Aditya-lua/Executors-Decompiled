/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3db0
 */

void FUN_008e3db0(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  FUN_008e4788();
  *param_1 = &PTR_LAB_00c4e2a8;
  puVar1 = operator_new(0x20);
  *puVar1 = &PTR_LAB_00c4e410;
  FUN_008e50a4(puVar1,0x20);
  *puVar1 = &PTR_LAB_00c4e2c8;
  param_1[1] = puVar1;
  return;
}


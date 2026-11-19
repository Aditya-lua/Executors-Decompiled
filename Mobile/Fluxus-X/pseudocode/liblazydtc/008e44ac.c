/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e44ac
 */

void FUN_008e44ac(undefined8 param_1,int param_2)

{
  undefined8 *puVar1;
  
  puVar1 = operator_new(0x10);
  *puVar1 = param_1;
  puVar1[1] = (long)param_2;
  return;
}


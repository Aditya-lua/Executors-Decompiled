/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e403c
 */

void FUN_008e403c(long param_1,undefined4 param_2,undefined4 param_3)

{
  undefined4 *puVar1;
  
  puVar1 = operator_new(8);
  *puVar1 = param_2;
  puVar1[1] = param_3;
  FUN_008e51e4(param_1 + 8);
  return;
}


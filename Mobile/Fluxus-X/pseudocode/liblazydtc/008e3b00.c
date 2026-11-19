/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3b00
 */

void FUN_008e3b00(undefined8 param_1,long param_2,undefined8 param_3)

{
  undefined **local_28;
  undefined4 local_20;
  undefined8 local_1c;
  
  local_20 = *(undefined4 *)(param_2 + 8);
  local_28 = &PTR_LAB_00c4e320;
  local_1c = *(undefined8 *)(param_2 + 0xc);
  FUN_008e3f08(param_1,0xc0400000,&local_28,param_3);
  return;
}


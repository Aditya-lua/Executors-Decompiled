/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3a8c
 */

void FUN_008e3a8c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  FUN_008e3e3c(param_1,param_2,param_3 & 0xffff,0);
  FUN_008e3e78(param_1,param_2,param_3 >> 0x10 & 0xffff,0x10);
  FUN_008e3e78(param_1,param_2,param_3 >> 0x20 & 0xffff,0x20);
  FUN_008e3e78(param_1,param_2,param_3 >> 0x30,0x30);
  return;
}


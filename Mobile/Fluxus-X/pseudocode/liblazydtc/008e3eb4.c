/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3eb4
 */

void FUN_008e3eb4(undefined8 param_1,long param_2,uint param_3,uint param_4,uint param_5)

{
  uint uVar1;
  
  uVar1 = (param_4 & 0x30) << 0x11;
  if ((int)param_4 < 1) {
    uVar1 = 0;
  }
  FUN_008e4874(param_1,(param_3 & 0xffff) << 5 | param_5 | uVar1 | *(uint *)(param_2 + 8) |
                       (uint)(*(int *)(param_2 + 0x10) == 0x40) << 0x1f | 0x12800000);
  return;
}


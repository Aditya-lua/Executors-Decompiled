/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935430
 */

void FUN_00935430(long param_1,uint param_2)

{
  uint uVar1;
  
  uVar1 = *(uint *)(param_1 + 0x1b1);
  *(uint *)(param_1 + 0x1b1) = uVar1 & 0xffffff80 | uVar1 & 0x3f | (param_2 & 1) << 6;
  return;
}


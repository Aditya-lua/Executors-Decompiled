/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932de0
 */

uint FUN_00932de0(long param_1)

{
  uint uVar1;
  
  uVar1 = 0;
  if ((*(byte *)(param_1 + 0x1b3) >> 1 & 1) != 0) {
    uVar1 = FUN_00924378(param_1 + 0x140);
    uVar1 = uVar1 ^ 1;
  }
  return uVar1 & 1;
}


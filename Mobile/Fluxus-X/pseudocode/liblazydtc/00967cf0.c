/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00967cf0
 */

undefined4 FUN_00967cf0(long param_1,long param_2)

{
  ulong uVar1;
  undefined4 uVar2;
  
  uVar1 = FUN_00967d44(param_1 + 0x530,param_2 + 0x2a0);
  uVar2 = 0x1b;
  if ((uVar1 & 1) != 0) {
    uVar1 = FUN_00967d44(param_1 + 0x5f8,param_2 + 800);
    uVar2 = 0;
    if ((uVar1 & 1) == 0) {
      uVar2 = 0x1b;
    }
  }
  return uVar2;
}


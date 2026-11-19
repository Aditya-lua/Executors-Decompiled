/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00874b84
 */

uint FUN_00874b84(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  uint uVar2;
  
  lVar1 = FUN_0087b8b8(param_1 + 0xf8);
  if (lVar1 == 0) {
    uVar2 = (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x60)) >> 3) * -0x33333333
    ;
    if (uVar2 >> 0x17 == 0) {
      if (((ulong)(*(long *)(param_1 + 0x118) * 3) >> 2 <= *(ulong *)(param_1 + 0x120)) &&
         (lVar1 = FUN_0087b8b8(param_1 + 0xf8,param_2), lVar1 == 0)) {
        FUN_0087bad0(param_1 + 0xf8);
      }
      lVar1 = FUN_0087b9ac(param_1 + 0xf8,param_2);
      *(uint *)(lVar1 + 0x28) = uVar2;
      FUN_00874c40((long *)(param_1 + 0x60),param_3);
    }
    else {
      uVar2 = 0xffffffff;
    }
  }
  else {
    uVar2 = *(uint *)(lVar1 + 0x28);
  }
  return uVar2;
}


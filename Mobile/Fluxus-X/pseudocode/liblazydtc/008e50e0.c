/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e50e0
 */

uint FUN_008e50e0(long param_1,uint param_2)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  
  uVar2 = *(uint *)(param_1 + 0x18);
  if (uVar2 < param_2) {
    uVar2 = param_2 + (param_2 >> 1);
    lVar1 = FUN_008e4ff0(uVar2);
    if (lVar1 == 0) {
      uVar2 = 0;
    }
    else {
      FUN_008e4fd4(lVar1,0x41,uVar2);
      uVar3 = *(long *)(param_1 + 0x10) - *(long *)(param_1 + 8);
      FUN_008e4fb8(lVar1,*(long *)(param_1 + 8),uVar3 & 0xffffffff);
      free(*(void **)(param_1 + 8));
      *(long *)(param_1 + 8) = lVar1;
      *(ulong *)(param_1 + 0x10) = lVar1 + (uVar3 & 0xffffffff);
      *(uint *)(param_1 + 0x18) = uVar2;
    }
  }
  return uVar2;
}


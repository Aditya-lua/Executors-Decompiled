/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910110
 */

bool FUN_00910110(long param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0xc0) + 0x22c);
  if (uVar1 == 0) {
    uVar1 = *(int *)(*(long *)(param_1 + 0xc0) + 0x18) << 2;
  }
  auVar4 = FUN_00941cb8();
  *(undefined1 (*) [16])(param_2 + 0x210) = auVar4;
  if (uVar1 == 0) {
    lVar2 = 0;
  }
  else {
    if (*(long *)(param_1 + 0xd0) == 0) {
      uVar3 = *(ulong *)(*(long *)(param_1 + 0xc38) + 0x30);
    }
    else {
      FUN_0093f628(param_1,5,2);
      uVar3 = *(ulong *)(*(long *)(param_1 + 0xc38) + 0x30);
      if (*(long *)(param_1 + 0xd0) != 0) {
        FUN_0093f680(param_1,5);
      }
    }
    lVar2 = 0;
    if (uVar1 < uVar3) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Connection cache is full, closing the oldest one");
      }
      lVar2 = FUN_00910208(param_1);
      if (lVar2 != 0) {
        FUN_009103b0(0,lVar2,*(undefined8 *)(param_1 + 0xc38),1);
      }
    }
  }
  return lVar2 != param_2;
}


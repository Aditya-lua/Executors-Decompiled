/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03290
 */

uint FUN_00b03290(undefined8 param_1,long param_2,int param_3)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = *(uint *)(param_2 + 0xe8);
  if (((uVar1 >> 2 & 1) != 0) && ((*(byte *)(param_2 + 0xf0) & 0x11) == 0)) {
    return 0;
  }
  if (param_3 == 0) {
    if (((uVar1 >> 3 & 1) != 0) && ((*(byte *)(param_2 + 0xf4) >> 6 & 1) == 0)) {
      return 0;
    }
    if (((uVar1 >> 1 & 1) != 0) && ((*(byte *)(param_2 + 0xec) & 0xa8) == 0)) {
      return 0;
    }
  }
  else {
    if (((uVar1 >> 1 & 1) != 0) && ((*(byte *)(param_2 + 0xec) >> 2 & 1) == 0)) {
      return 0;
    }
    if ((uVar1 & 1) == 0) {
      uVar2 = 3;
      if (((uVar1 & 0x2040) != 0x2040) && (uVar2 = 4, (uVar1 >> 1 & 1) == 0)) {
        if ((uVar1 >> 3 & 1) == 0) {
          return 0;
        }
        uVar1 = *(uint *)(param_2 + 0xf4);
        if ((uVar1 & 7) == 0) {
          return 0;
        }
        goto LAB_00b03338;
      }
    }
    else {
      uVar2 = uVar1 >> 4 & 1;
    }
    if (uVar2 == 0) {
      return 0;
    }
    if (uVar2 == 5) {
      uVar1 = *(uint *)(param_2 + 0xf4);
LAB_00b03338:
      return uVar1 >> 2 & 1;
    }
  }
  return 1;
}


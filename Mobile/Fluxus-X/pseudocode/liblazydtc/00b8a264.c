/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a264
 */

undefined8 FUN_00b8a264(int param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = param_2 & 0xffffff00;
  if (param_1 == 0) {
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 == 0x6000200) {
        return 0;
      }
      uVar2 = 0x300;
    }
    else {
      if (uVar1 == 0x6000900) {
        return 0;
      }
      uVar2 = 0x1300;
    }
    if (uVar1 == (uVar2 | 0x6000000)) {
      return 0;
    }
    if ((param_2 >> 9 | 1) == 0x30003) {
      return 0;
    }
    return 0xffffff79;
  }
  if (((uVar1 != 0x6000200) && (uVar1 != 0x6000300)) && (uVar1 != 0x6001300)) {
    uVar2 = param_2 & 0xfffffe00;
    if (((uVar2 != 0x6000600 && uVar1 != 0x6000900) && (param_2 != 0x6000800)) &&
       (uVar2 != 0x6000400)) {
      return 0xffffff79;
    }
    if (((uVar1 != 0x6000200) && (uVar1 != 0x6000300)) && (uVar1 != 0x6001300)) {
      if (uVar1 != 0x6000900) {
        if ((uVar2 | 0x200) != 0x6000600) {
          return 0;
        }
        if (((uVar1 == 0x6000200) || (uVar1 == 0x6000300)) || (uVar1 == 0x6001300))
        goto LAB_00b8a29c;
      }
      if ((param_2 & 0xff) == 0) {
        return 0xffffff79;
      }
      if (uVar2 != 0x6000400 && (uVar2 != 0x6000600 && uVar1 != 0x6000900)) {
        return 0xffffff79;
      }
      return 0;
    }
  }
LAB_00b8a29c:
  if ((param_2 & 0xff) == 0) {
    return 0xffffff79;
  }
  return 0;
}


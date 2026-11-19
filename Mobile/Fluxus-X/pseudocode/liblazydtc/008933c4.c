/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008933c4
 */

undefined4 FUN_008933c4(undefined8 param_1,int param_2,uint param_3)

{
  bool bVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  
  if (param_2 < 3) {
    if (param_2 == 0) {
      bVar1 = (param_3 & 1) == 0;
      uVar3 = 0x21;
      uVar2 = 0x27;
    }
    else if (param_2 == 1) {
      bVar1 = (param_3 & 1) == 0;
      uVar3 = 0x22;
      uVar2 = 0x28;
    }
    else {
      if (param_2 != 2) {
        return 0;
      }
      bVar1 = (param_3 & 1) == 0;
      uVar3 = 0x23;
      uVar2 = 0x29;
    }
  }
  else if (param_2 < 5) {
    if (param_2 != 3) {
      if (param_2 != 4) {
        return 0;
      }
      uVar2 = 0x51;
      if ((param_3 & 1) != 0) {
        uVar2 = 0x52;
      }
      return uVar2;
    }
    bVar1 = (param_3 & 1) == 0;
    uVar3 = 0x24;
    uVar2 = 0x2a;
  }
  else if (param_2 == 5) {
    bVar1 = (param_3 & 1) == 0;
    uVar3 = 0x25;
    uVar2 = 0x2b;
  }
  else {
    if (param_2 != 6) {
      return 0;
    }
    bVar1 = (param_3 & 1) == 0;
    uVar3 = 0x26;
    uVar2 = 0x2c;
  }
  if (bVar1) {
    uVar2 = uVar3;
  }
  return uVar2;
}


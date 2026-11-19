/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7bb68
 */

undefined4 mbedtls_ecc_group_from_psa(byte param_1,long param_2)

{
  undefined4 uVar1;
  undefined4 uVar2;
  
  if (param_1 < 0x30) {
    if (param_1 == 0x12) {
      if (param_2 < 0x100) {
        if (param_2 == 0xc0) {
          return 1;
        }
        if (param_2 == 0xe0) {
          return 2;
        }
      }
      else {
        if (param_2 == 0x100) {
          return 3;
        }
        if (param_2 == 0x180) {
          return 4;
        }
        if (param_2 == 0x209) {
          return 5;
        }
      }
    }
    else if (param_1 == 0x17) {
      uVar2 = 0xc;
      if (param_2 != 0x100) {
        uVar2 = 0;
      }
      uVar1 = 10;
      if (param_2 != 0xc0) {
        uVar1 = uVar2;
      }
      return uVar1;
    }
  }
  else if (param_1 == 0x30) {
    if (param_2 == 0x100) {
      return 6;
    }
    if (param_2 == 0x200) {
      return 8;
    }
    if (param_2 == 0x180) {
      return 7;
    }
  }
  else if (param_1 == 0x41) {
    uVar2 = 0xd;
    if (param_2 != 0x1c0) {
      uVar2 = 0;
    }
    uVar1 = 9;
    if (param_2 != 0xff) {
      uVar1 = uVar2;
    }
    return uVar1;
  }
  return 0;
}


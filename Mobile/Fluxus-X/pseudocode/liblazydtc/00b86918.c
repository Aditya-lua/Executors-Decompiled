/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86918
 */

undefined4 psa_validate_unstructured_key_bit_size(uint param_1,ulong param_2)

{
  undefined4 uVar1;
  
  param_1 = param_1 & 0xffff;
  if (param_1 < 0x2004) {
    if (((5 < param_1 - 0x1200) || ((1 << (ulong)(param_1 - 0x1200 & 0x1f) & 0x29U) == 0)) &&
       ((param_1 != 0x1001 && (param_1 != 0x1100)))) {
      return 0xffffff7a;
    }
  }
  else if (param_1 < 0x2400) {
    if (param_1 == 0x2004) {
      if (param_2 != 0x100) {
        return 0xffffff79;
      }
    }
    else {
      if (param_1 != 0x2301) {
        return 0xffffff7a;
      }
      if (((param_2 != 0x40) && (param_2 != 0x80)) && (param_2 != 0xc0)) {
        return 0xffffff79;
      }
    }
  }
  else if (param_1 == 0x2406) {
    if (((param_2 != 0x80) && (param_2 != 0xc0)) && (param_2 != 0x100)) {
      return 0xffffff79;
    }
  }
  else if (param_1 == 0x2403) {
    if (((param_2 != 0x80) && (param_2 != 0xc0)) && (param_2 != 0x100)) {
      return 0xffffff79;
    }
  }
  else {
    if (param_1 != 0x2400) {
      return 0xffffff7a;
    }
    if (((param_2 != 0x80) && (param_2 != 0xc0)) && (param_2 != 0x100)) {
      return 0xffffff79;
    }
  }
  uVar1 = 0;
  if ((param_2 & 7) != 0) {
    uVar1 = 0xffffff79;
  }
  return uVar1;
}


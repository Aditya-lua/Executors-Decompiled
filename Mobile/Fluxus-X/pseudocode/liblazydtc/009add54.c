/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009add54
 */

undefined8 ssl_cert_lookup_by_nid(int param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  
  if (param_1 < 0x390) {
    if (param_1 < 0x198) {
      uVar1 = 0;
      if (param_1 != 6) {
        if (param_1 != 0x74) {
          return 0;
        }
        uVar1 = 2;
      }
    }
    else if (param_1 == 0x198) {
      uVar1 = 3;
    }
    else {
      if (param_1 != 0x32b) {
        return 0;
      }
      uVar1 = 4;
    }
  }
  else if (param_1 < 0x3d4) {
    if (param_1 == 0x390) {
      uVar1 = 1;
    }
    else {
      if (param_1 != 0x3d3) {
        return 0;
      }
      uVar1 = 5;
    }
  }
  else if (param_1 == 0x3d4) {
    uVar1 = 6;
  }
  else if (param_1 == 0x43f) {
    uVar1 = 7;
  }
  else {
    if (param_1 != 0x440) {
      return 0;
    }
    uVar1 = 8;
  }
  *param_2 = uVar1;
  return 1;
}


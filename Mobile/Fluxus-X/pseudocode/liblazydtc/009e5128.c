/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5128
 */

undefined8 ssl_set_version_bound(int param_1,int param_2,int *param_3)

{
  if (param_2 == 0) {
    *param_3 = 0;
  }
  else {
    if (((4 < param_2 - 0x300U) && (3 < param_2 - 0xfefdU)) && (param_2 != 0x100)) {
      return 0;
    }
    if (param_1 == 0x1ffff) {
      if ((3 < param_2 - 0xfefdU) && (param_2 != 0x100)) {
        return 1;
      }
    }
    else {
      if (param_1 != 0x10000) {
        return 1;
      }
      if (4 < param_2 - 0x300U) {
        return 1;
      }
    }
    *param_3 = param_2;
  }
  return 1;
}


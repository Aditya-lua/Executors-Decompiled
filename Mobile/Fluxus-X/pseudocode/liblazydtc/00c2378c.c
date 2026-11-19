/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2378c
 */

byte * FUN_00c2378c(byte *param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  
  if (param_1 != param_2) {
    uVar1 = (uint)*param_1;
    pbVar2 = param_1;
    if (uVar1 == 0x5f) {
      if (param_1 + 1 != param_2) {
        uVar1 = (uint)param_1[1];
        if (0xfffffff5 < uVar1 - 0x3a) {
          return param_1 + 2;
        }
        if (uVar1 == 0x5f) {
          for (pbVar2 = param_1 + 2; pbVar2 != param_2; pbVar2 = pbVar2 + 1) {
            if (*pbVar2 - 0x3a < 0xfffffff6) {
              if (*pbVar2 == 0x5f) {
                param_1 = pbVar2 + 1;
              }
              return param_1;
            }
          }
        }
      }
    }
    else {
      while (0xfffffff5 < uVar1 - 0x3a) {
        pbVar2 = pbVar2 + 1;
        if (pbVar2 == param_2) {
          return param_2;
        }
        uVar1 = (uint)*pbVar2;
      }
    }
  }
  return param_1;
}


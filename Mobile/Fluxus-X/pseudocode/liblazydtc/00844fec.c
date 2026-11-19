/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00844fec
 */

byte * FUN_00844fec(undefined8 param_1,byte *param_2,byte *param_3)

{
  uint uVar1;
  
  if (param_2 != param_3) {
    uVar1 = *param_2 - 0x24;
    if (((0x3a < uVar1) || ((1L << ((ulong)uVar1 & 0x3f) & 0x7800000080004f1U) == 0)) &&
       (2 < *param_2 - 0x7b)) {
      FUN_00845824();
      param_2 = param_2 + 1;
    }
  }
  return param_2;
}


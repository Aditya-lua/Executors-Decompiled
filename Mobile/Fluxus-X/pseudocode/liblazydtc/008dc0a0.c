/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dc0a0
 */

void LZ4_decompress_safe_usingDict
               (undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,long param_5,
               int param_6)

{
  if (param_6 == 0) {
    LZ4_decompress_safe();
    return;
  }
  if (param_5 + param_6 != param_2) {
    LZ4_decompress_safe_forceExtDict();
    return;
  }
  if (param_6 < 0xffff) {
    FUN_008db0f8();
    return;
  }
  LZ4_decompress_safe_withPrefix64k();
  return;
}


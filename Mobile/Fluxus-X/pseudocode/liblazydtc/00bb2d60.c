/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2d60
 */

ulong ZSTD_decodingBufferSize_min(ulong param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = param_1;
  if (0x1ffff < param_1) {
    uVar1 = 0x20000;
  }
  uVar1 = param_1 + uVar1 * 2 + 0x40;
  if (uVar1 <= param_2) {
    param_2 = uVar1;
  }
  return param_2;
}


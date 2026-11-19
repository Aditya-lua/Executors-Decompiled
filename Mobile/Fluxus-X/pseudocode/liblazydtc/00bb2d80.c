/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2d80
 */

long ZSTD_estimateDStreamSize(ulong param_1)

{
  ulong uVar1;
  
  uVar1 = param_1;
  if (0x1ffff < param_1) {
    uVar1 = 0x20000;
  }
  return param_1 + uVar1 * 3 + 0x17728;
}


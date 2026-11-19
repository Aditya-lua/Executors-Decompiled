/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafdb0
 */

bool ZSTD_isSkippableFrame(uint *param_1,ulong param_2)

{
  if (param_2 < 4) {
    return false;
  }
  return *param_1 >> 4 == 0x184d2a5;
}


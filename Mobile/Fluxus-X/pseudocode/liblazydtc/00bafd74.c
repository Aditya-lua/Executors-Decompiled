/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafd74
 */

bool ZSTD_isFrame(uint *param_1,ulong param_2)

{
  if (param_2 < 4) {
    return false;
  }
  return *param_1 == 0xfd2fb528 || *param_1 >> 4 == 0x184d2a5;
}


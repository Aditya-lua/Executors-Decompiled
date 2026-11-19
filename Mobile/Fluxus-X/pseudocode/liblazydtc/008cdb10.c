/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cdb10
 */

int LZ4_compressBound(uint param_1)

{
  if (param_1 < 0x7e000001) {
    return (uint)((ulong)param_1 * 0x8080808081 >> 0x27) + 0x10;
  }
  return 0;
}


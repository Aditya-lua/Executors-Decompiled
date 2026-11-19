/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd640
 */

void LZ4_compress_withState(void)

{
  uint in_w3;
  
  if (in_w3 < 0x7e000001) {
    LZ4_compress_fast_extState();
    return;
  }
  LZ4_compress_fast_extState();
  return;
}


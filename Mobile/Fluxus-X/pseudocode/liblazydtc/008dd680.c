/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd680
 */

void LZ4_compress_continue(void)

{
  uint in_w3;
  
  if (in_w3 < 0x7e000001) {
    LZ4_compress_fast_continue();
    return;
  }
  LZ4_compress_fast_continue();
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd678
 */

void LZ4_compress_limitedOutput_continue(void)

{
  LZ4_compress_fast_continue();
  return;
}


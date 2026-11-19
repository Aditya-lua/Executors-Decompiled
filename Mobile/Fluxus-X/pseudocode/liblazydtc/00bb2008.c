/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2008
 */

void ZSTD_freeDStream(void)

{
  ZSTD_freeDCtx();
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f96c
 */

ulong ossl_param_bytes_to_blocks(long param_1)

{
  return param_1 + 7U >> 3;
}


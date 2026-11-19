/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30f8c
 */

uchar * EC_GROUP_get0_seed(EC_GROUP *x)

{
  return *(uchar **)(x + 0x30);
}


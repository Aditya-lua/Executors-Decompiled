/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fae04
 */

ushort BIO_ADDR_rawport(ushort *param_1)

{
  if ((*param_1 | 8) == 10) {
    return param_1[1];
  }
  return 0;
}


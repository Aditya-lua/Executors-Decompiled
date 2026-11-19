/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f140
 */

bool X509_trusted(long param_1)

{
  return *(long *)(param_1 + 0x150) != 0;
}


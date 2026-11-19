/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8339c
 */

bool ossl_ascii_isdigit(int param_1)

{
  return param_1 - 0x30U < 10;
}


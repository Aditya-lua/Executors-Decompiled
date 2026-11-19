/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0ad0
 */

char * SSL_CIPHER_standard_name(long param_1)

{
  if (param_1 == 0) {
    return "(NONE)";
  }
  return *(char **)(param_1 + 0x10);
}


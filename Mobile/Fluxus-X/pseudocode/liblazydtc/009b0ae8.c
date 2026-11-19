/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0ae8
 */

char * OPENSSL_cipher_name(long param_1)

{
  long lVar1;
  
  if (param_1 == 0) {
    return "(NONE)";
  }
  lVar1 = ssl3_get_cipher_by_std_name();
  if (lVar1 == 0) {
    return "(NONE)";
  }
  return *(char **)(lVar1 + 8);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b74788
 */

bool mbedtls_des_key_check_key_parity(byte *param_1)

{
  if ((((*param_1 == (&DAT_0077e7c0)[*param_1 >> 1]) &&
       (param_1[1] == (&DAT_0077e7c0)[param_1[1] >> 1])) &&
      (param_1[2] == (&DAT_0077e7c0)[param_1[2] >> 1])) &&
     (((param_1[3] == (&DAT_0077e7c0)[param_1[3] >> 1] &&
       (param_1[4] == (&DAT_0077e7c0)[param_1[4] >> 1])) &&
      ((param_1[5] == (&DAT_0077e7c0)[param_1[5] >> 1] &&
       (param_1[6] == (&DAT_0077e7c0)[param_1[6] >> 1])))))) {
    return param_1[7] != (&DAT_0077e7c0)[param_1[7] >> 1];
  }
  return true;
}


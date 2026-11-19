/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2cb0
 */

bool psa_is_valid_key_id(uint param_1,int param_2)

{
  if (param_1 - 1 < 0x3fffffff) {
    return true;
  }
  return -1 < (int)param_1 && (param_1 >> 0x1e != 0 && param_2 != 0);
}


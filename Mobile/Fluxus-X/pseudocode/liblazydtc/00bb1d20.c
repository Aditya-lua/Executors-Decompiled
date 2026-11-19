/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb1d20
 */

int ZSTD_getDictID_fromDict(int *param_1,ulong param_2)

{
  if ((param_2 < 8) || (*param_1 != -0x13cf5bc9)) {
    return 0;
  }
  return param_1[1];
}


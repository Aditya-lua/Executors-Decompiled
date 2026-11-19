/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d030
 */

bool WPACKET_is_null_buf(long *param_1)

{
  if (*param_1 == 0) {
    return param_1[1] == 0;
  }
  return false;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a014cc
 */

int BN_get_params(int which)

{
  switch(which) {
  case 0:
    return DAT_00d21900;
  case 1:
    return DAT_00d21904;
  case 2:
    return DAT_00d21908;
  case 3:
    return DAT_00d2190c;
  default:
    return 0;
  }
}


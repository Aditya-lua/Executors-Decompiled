/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9c5bc
 */

long WPACKET_get_curr(long *param_1)

{
  long lVar1;
  
  lVar1 = param_1[1];
  if (lVar1 == 0) {
    if (*param_1 == 0) {
      return 0;
    }
    lVar1 = *(long *)(*param_1 + 8);
    if (lVar1 == 0) {
      return 0;
    }
  }
  if ((*(byte *)(param_1 + 6) & 1) == 0) {
    return lVar1 + param_1[2];
  }
  return (lVar1 + param_1[4]) - param_1[2];
}


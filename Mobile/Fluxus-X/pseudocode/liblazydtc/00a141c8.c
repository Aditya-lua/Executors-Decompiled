/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a141c8
 */

bool SCT_is_complete(int *param_1)

{
  long lVar1;
  
  if (*param_1 == -1) {
    return false;
  }
  if (*param_1 == 0) {
    if (*(long *)(param_1 + 6) == 0) {
      return false;
    }
    if ((char)param_1[0x10] != '\x04') {
      return false;
    }
    if ((*(byte *)((long)param_1 + 0x41) | 2) != 3) {
      return false;
    }
    if (*(long *)(param_1 + 0x12) == 0) {
      return false;
    }
    lVar1 = *(long *)(param_1 + 0x14);
  }
  else {
    lVar1 = *(long *)(param_1 + 2);
  }
  return lVar1 != 0;
}


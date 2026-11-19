/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeef3c
 */

int UI_get_result_maxsize(UI_STRING *uis)

{
  if (*(int *)uis - 1U < 2) {
    return *(int *)(uis + 0x2c);
  }
  return -1;
}


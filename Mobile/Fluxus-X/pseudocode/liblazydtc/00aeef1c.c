/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeef1c
 */

int UI_get_result_minsize(UI_STRING *uis)

{
  if (*(int *)uis - 1U < 2) {
    return *(int *)(uis + 0x28);
  }
  return -1;
}


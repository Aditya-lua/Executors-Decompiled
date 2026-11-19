/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2fbb0
 */

char * FUN_00c2fbb0(int param_1)

{
  if (param_1 + 2U < 0x62) {
    return &DAT_0078d8e4 + *(int *)(&DAT_0078d8e4 + (ulong)(param_1 + 2U) * 4);
  }
  return "unknown register";
}


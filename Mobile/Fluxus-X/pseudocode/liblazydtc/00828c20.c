/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828c20
 */

void FUN_00828c20(ulong *param_1)

{
  if ((char)param_1[1] == '\x01') {
    *(undefined1 *)(param_1 + 1) = 0;
    *param_1 = *param_1 ^ 0x27cb57d1a3999715;
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd950
 */

void FUN_008dd950(ulong *param_1,ulong param_2,ulong param_3)

{
  *param_1 = *param_1 ^ param_2;
  param_1[1] = param_1[1] ^ param_3;
  return;
}


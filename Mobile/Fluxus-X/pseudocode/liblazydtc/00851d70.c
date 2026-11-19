/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851d70
 */

void FUN_00851d70(undefined4 *param_1,undefined1 param_2)

{
  *(undefined1 *)(param_1 + 1) = param_2;
  *param_1 = DAT_00d1e924;
  return;
}


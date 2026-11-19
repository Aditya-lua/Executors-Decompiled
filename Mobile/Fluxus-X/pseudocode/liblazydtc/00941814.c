/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941814
 */

void FUN_00941814(undefined1 *param_1,byte *param_2,long param_3)

{
  for (; (param_3 != 0 && (*param_1 = (&DAT_007483d4)[*param_2], *param_2 != 0));
      param_2 = param_2 + 1) {
    param_3 = param_3 + -1;
    param_1 = param_1 + 1;
  }
  return;
}


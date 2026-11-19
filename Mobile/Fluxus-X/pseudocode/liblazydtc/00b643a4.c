/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b643a4
 */

void FUN_00b643a4(undefined4 *param_1,undefined1 *param_2)

{
  *param_2 = (char)*param_1;
  param_2[1] = (char)((uint)*param_1 >> 8);
  param_2[2] = (char)*(undefined2 *)((long)param_1 + 2);
  param_2[3] = *(undefined1 *)((long)param_1 + 3);
  param_2[4] = (char)param_1[1];
  param_2[5] = (char)((uint)param_1[1] >> 8);
  param_2[6] = (char)*(undefined2 *)((long)param_1 + 6);
  param_2[7] = *(undefined1 *)((long)param_1 + 7);
  param_2[8] = (char)param_1[2];
  param_2[9] = (char)((uint)param_1[2] >> 8);
  param_2[10] = (char)*(undefined2 *)((long)param_1 + 10);
  param_2[0xb] = *(undefined1 *)((long)param_1 + 0xb);
  param_2[0xc] = (char)param_1[3];
  param_2[0xd] = (char)((uint)param_1[3] >> 8);
  param_2[0xe] = (char)*(undefined2 *)((long)param_1 + 0xe);
  param_2[0xf] = *(undefined1 *)((long)param_1 + 0xf);
  return;
}


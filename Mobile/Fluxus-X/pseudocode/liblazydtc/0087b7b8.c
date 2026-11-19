/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b7b8
 */

void FUN_0087b7b8(undefined8 *param_1,ulong param_2)

{
  if (param_1[5] != 0) {
    if (param_2 < (ulong)param_1[4]) {
      operator_delete((void *)*param_1);
      *param_1 = 0;
      operator_delete((void *)param_1[3]);
      param_1[1] = 0;
      param_1[2] = 0;
      param_1[3] = 0;
      operator_delete((void *)0x0);
      param_1[4] = 0;
      *(undefined1 *)(param_1 + 6) = 0x40;
    }
    else if (param_1[2] != 0) {
      memset((void *)param_1[3],0,param_1[2] << 3);
    }
    param_1[5] = 0;
  }
  return;
}


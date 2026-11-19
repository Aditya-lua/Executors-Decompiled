/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00894ed4
 */

void FUN_00894ed4(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00c4b0b0;
  if ((void *)param_1[3] != (void *)0x0) {
    operator_delete((void *)param_1[3]);
    param_1[3] = 0;
    operator_delete((void *)param_1[6]);
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[6] = 0;
    operator_delete((void *)0x0);
    param_1[7] = 0;
    *(undefined1 *)(param_1 + 9) = 0x40;
  }
  operator_delete((void *)param_1[6]);
  return;
}


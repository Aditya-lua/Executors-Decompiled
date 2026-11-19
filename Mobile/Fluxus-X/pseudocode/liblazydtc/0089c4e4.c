/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089c4e4
 */

void FUN_0089c4e4(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00c4bbd8;
  if ((void *)param_1[2] != (void *)0x0) {
    operator_delete((void *)param_1[2]);
    param_1[2] = 0;
    operator_delete((void *)param_1[5]);
    param_1[3] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    operator_delete((void *)0x0);
    param_1[6] = 0;
    *(undefined1 *)(param_1 + 8) = 0x40;
  }
  operator_delete((void *)param_1[5]);
  operator_delete(param_1,0x48);
  return;
}


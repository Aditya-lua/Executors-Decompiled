/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a2c38
 */

void FUN_008a2c38(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00c4c280;
  if ((void *)param_1[0x10] != (void *)0x0) {
    operator_delete((void *)param_1[0x10]);
    param_1[0x10] = 0;
    operator_delete((void *)param_1[0x13]);
    param_1[0x11] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    operator_delete((void *)0x0);
    param_1[0x14] = 0;
    *(undefined1 *)(param_1 + 0x16) = 0x40;
  }
  operator_delete((void *)param_1[0x13]);
  if ((void *)param_1[9] != (void *)0x0) {
    operator_delete((void *)param_1[9]);
    param_1[9] = 0;
    operator_delete((void *)param_1[0xc]);
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[0xc] = 0;
    operator_delete((void *)0x0);
    param_1[0xd] = 0;
    *(undefined1 *)(param_1 + 0xf) = 0x40;
  }
  operator_delete((void *)param_1[0xc]);
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
  return;
}


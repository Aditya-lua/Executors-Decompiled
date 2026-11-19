/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00859288
 */

void FUN_00859288(undefined8 *param_1)

{
  if ((void *)*param_1 != (void *)0x0) {
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
  operator_delete((void *)param_1[3]);
  return;
}



undefined8 * FUN_00651890(undefined8 *param_1)

{
  *param_1 = &UNK_00a09aa0;
  if ((long *)param_1[2] != (long *)0x0) {
    (**(code **)(*(long *)param_1[2] + 8))();
  }
  if ((long *)param_1[1] != (long *)0x0) {
    (**(code **)(*(long *)param_1[1] + 8))();
  }
  return param_1;
}


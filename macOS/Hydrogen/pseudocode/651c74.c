
void FUN_00651c74(long param_1,long param_2)

{
  if (param_1 != 0) {
    do {
      *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  return;
}


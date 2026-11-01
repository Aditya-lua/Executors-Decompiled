
void FUN_00041530(long param_1,long param_2)

{
  if (param_1 != 0) {
    do {
      *(undefined4 *)(param_2 + -4 + param_1 * 4) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  return;
}


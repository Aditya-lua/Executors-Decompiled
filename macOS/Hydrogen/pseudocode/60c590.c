
void FUN_0060c590(long param_1)

{
  long in_x9;
  long unaff_x20;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (*(int *)(unaff_x20 + 0xa0) == 1) {
    func_0x00603158();
    return;
  }
  return;
}


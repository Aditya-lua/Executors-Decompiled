
void FUN_0065849c(long param_1)

{
  long in_x9;
  long unaff_x19;
  long unaff_x26;
  undefined8 in_stack_00000018;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (unaff_x26 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x26 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return;
}


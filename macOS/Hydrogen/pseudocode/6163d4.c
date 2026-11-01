
void FUN_006163d4(long param_1,long param_2)

{
  bool in_CY;
  long in_x9;
  long *in_stack_00000088;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined1 *)(param_2 + -1 + param_1) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000088 != (long *)0x0) {
    (**(code **)(*in_stack_00000088 + 8))();
  }
  return;
}


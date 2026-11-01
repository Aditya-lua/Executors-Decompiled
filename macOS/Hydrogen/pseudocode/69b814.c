
void FUN_0069b814(ulong param_1,long param_2)

{
  ulong in_x9;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined1 *)(param_2 + -1 + param_1) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  return;
}


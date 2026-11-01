
void FUN_00042fa8(long param_1)

{
  undefined1 in_ZR;
  long in_x9;
  
  while (!(bool)in_ZR) {
    *(undefined4 *)(in_x9 + param_1 * 4) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  return;
}


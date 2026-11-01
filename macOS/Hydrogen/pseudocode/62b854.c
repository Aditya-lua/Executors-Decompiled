
void FUN_0062b854(long param_1,long param_2)

{
  long unaff_x29;
  undefined8 uStack0000000000000038;
  
  do {
    *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  uStack0000000000000038 = unaff_x29 + -0x70;
  func_0x0064f2d8(&uStack0000000000000038);
  return;
}



void FUN_00637140(long param_1)

{
  undefined1 in_ZR;
  long in_x9;
  undefined8 unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000108;
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  func_0x00653f88(&uStack0000000000000108);
  *(undefined8 *)(unaff_x29 + -0x50) = unaff_x21;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  return;
}


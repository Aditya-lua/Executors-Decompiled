
void FUN_0062b92c(void)

{
  undefined8 *puVar1;
  undefined8 unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000038;
  
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x20;
  func_0x00621064(&uStack0000000000000038);
  func_0x00621244(unaff_x29 + -0x88);
  uStack0000000000000038 = unaff_x29 + -0x70;
  func_0x0064f2d8(&uStack0000000000000038);
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_009fad80;
  puVar1[1] = &UNK_00a099a8;
  puVar1[2] = puVar1;
  return;
}


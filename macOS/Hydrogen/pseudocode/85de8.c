
undefined8 FUN_00085de8(undefined1 *param_1)

{
  undefined8 *unaff_x19;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  uStack0000000000000010 = *param_1;
  *param_1 = 0;
  uStack0000000000000018 = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)(param_1 + 8) = 0;
  func_0x00078220();
  return *unaff_x19;
}


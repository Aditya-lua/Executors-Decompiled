
undefined8 FUN_00085650(undefined8 *param_1)

{
  undefined1 *puVar1;
  long unaff_x19;
  undefined1 unaff_w21;
  undefined1 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  param_1[1] = 0;
  *param_1 = param_1 + 1;
  puVar1 = *(undefined1 **)(unaff_x19 + 0x20);
  uStack0000000000000000 = *puVar1;
  *puVar1 = unaff_w21;
  uStack0000000000000008 = *(undefined8 *)(puVar1 + 8);
  *(undefined8 **)(puVar1 + 8) = param_1;
  func_0x00078220();
  return *(undefined8 *)(unaff_x19 + 0x20);
}


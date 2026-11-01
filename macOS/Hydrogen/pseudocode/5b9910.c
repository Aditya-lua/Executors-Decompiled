
void FUN_005b9910(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long unaff_x19;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  
  uStack0000000000000028 = *(undefined8 *)(unaff_x19 + 0x48);
  uStack0000000000000020 = *(undefined8 *)(unaff_x19 + 0x40);
  uStack0000000000000038 = *(undefined8 *)(unaff_x19 + 0x58);
  uStack0000000000000030 = *(undefined8 *)(unaff_x19 + 0x50);
  param_1[1] = &UNK_008b3c78;
  param_1[2] = 0x2a;
  *param_1 = 0x8000000000000000;
  uStack0000000000000000 = param_2;
  uStack0000000000000010 = param_3;
  func_0x005aea88();
  return;
}


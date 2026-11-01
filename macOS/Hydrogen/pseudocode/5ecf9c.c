
void FUN_005ecf9c(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 *puVar1;
  undefined1 uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined *puStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  puVar1 = (undefined1 *)*param_1;
  _uStack0000000000000010 = &uStack0000000000000008;
  puStack0000000000000018 = &UNK_009f42a8;
  puVar3 = *(undefined8 **)param_1[1];
  *(undefined1 **)(unaff_x29 + -0x20) = &uStack0000000000000010;
  *(undefined **)(unaff_x29 + -0x18) = &DAT_005eca24;
  _uStack0000000000000020 = &UNK_007fc120;
  uStack0000000000000028 = 1;
  uStack0000000000000038 = 1;
  uStack0000000000000040 = 0;
  lStack0000000000000030 = unaff_x29 + -0x20;
  _uStack0000000000000008 = param_3;
  uVar2 = func_0x0046849c(*puVar3,puVar3[1],&uStack0000000000000020);
  *puVar1 = uVar2;
  return;
}


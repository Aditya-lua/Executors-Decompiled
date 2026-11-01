
undefined1  [16] FUN_0041b944(undefined8 param_1,undefined8 param_2)

{
  undefined *puVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined *unaff_x20;
  ulong unaff_x21;
  undefined1 auVar3 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  uVar2 = *(undefined8 *)(unaff_x19 + 0x10);
  uStack0000000000000000 = param_1;
  uStack0000000000000008 = param_2;
  func_0x0046b8d0(&uStack0000000000000018,*(undefined8 *)(unaff_x19 + 8),uVar2);
  puVar1 = unaff_x20;
  if ((unaff_x21 & 1) == 0) {
    puVar1 = &UNK_009da348;
  }
  if (uStack0000000000000018 != 0) {
    unaff_x21 = 1;
    uVar2 = 0;
    unaff_x20 = puVar1;
  }
  *(undefined8 *)(unaff_x19 + 0x10) = uVar2;
  auVar3._8_8_ = unaff_x20;
  auVar3._0_8_ = unaff_x21;
  return auVar3;
}


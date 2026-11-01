
void FUN_0042d904(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  ulong extraout_x8;
  undefined *in_x9;
  long unaff_x22;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined1 *in_stack_00000030;
  undefined *in_stack_00000038;
  undefined *puStack0000000000000048;
  
  auVar3._8_8_ = in_stack_00000020;
  auVar3._0_8_ = uStack0000000000000018;
  do {
    puStack0000000000000048 = in_x9 + 0xf4;
    _uStack0000000000000018 = auVar3;
    uStack0000000000000028 = func_0x0043e4f4(&UNK_009db358);
    puVar1 = &uStack0000000000000028;
    while( true ) {
      func_0x003f77f4(puVar1);
      func_0x007a144c();
      if ((extraout_x8 & 1) != 0) break;
      in_stack_00000030 = &uStack0000000000000010;
      in_stack_00000038 = &DAT_003f408c;
      puStack0000000000000048 = &DAT_003ffc80;
      uVar2 = func_0x0043e4f4(&UNK_009db328);
      uStack0000000000000018 = uVar2;
      puVar1 = &uStack0000000000000018;
    }
    auVar3 = func_0x0043e544(*(undefined8 *)(unaff_x22 + 0x30));
    if (auVar3._0_8_ == 0) {
      auVar3 = ZEXT816(1);
    }
    in_stack_00000030 = &uStack0000000000000010;
    in_stack_00000038 = &DAT_003f408c;
    in_x9 = &UNK_003f4000;
  } while( true );
}



void FUN_0042d8c8(undefined8 *param_1)

{
  undefined8 uVar1;
  ulong extraout_x8;
  long unaff_x22;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined1 *in_stack_00000030;
  undefined *in_stack_00000038;
  
  do {
    while( true ) {
      func_0x003f77f4(param_1);
      func_0x007a144c();
      if ((extraout_x8 & 1) != 0) break;
      in_stack_00000030 = &uStack0000000000000010;
      in_stack_00000038 = &DAT_003f408c;
      uVar1 = func_0x0043e4f4(&UNK_009db328);
      uStack0000000000000018 = uVar1;
      param_1 = &uStack0000000000000018;
    }
    auVar2 = func_0x0043e544(*(undefined8 *)(unaff_x22 + 0x30));
    if (auVar2._0_8_ == 0) {
      auVar2 = ZEXT816(1);
    }
    in_stack_00000030 = &uStack0000000000000010;
    in_stack_00000038 = &DAT_003f408c;
    _uStack0000000000000018 = auVar2;
    uStack0000000000000028 = func_0x0043e4f4(&UNK_009db358);
    param_1 = &uStack0000000000000028;
  } while( true );
}


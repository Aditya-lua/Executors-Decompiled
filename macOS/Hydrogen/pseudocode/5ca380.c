
undefined8 FUN_005ca380(void)

{
  undefined8 uVar1;
  char *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x29;
  char in_wzr;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 *puStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000038;
  undefined *puStack0000000000000040;
  
  if (*(long *)(unaff_x20 + 0x10) == -0x8000000000000000) {
    *(char **)(unaff_x29 + -0x28) = unaff_x19;
    _uStack0000000000000038 = unaff_x29 + -0x28;
    puStack0000000000000040 =
         &
         __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_usize_GT_3fmt17ha107b9c25e7f708eE
    ;
    _uStack0000000000000008 = &UNK_009f29f8;
    uStack0000000000000010 = 1;
    uStack0000000000000020 = 1;
    uStack0000000000000028 = 0;
    puStack0000000000000018 = &uStack0000000000000038;
    uVar1 = func_0x0046849c(*unaff_x21,unaff_x21[1],&uStack0000000000000008);
  }
  else {
    *(long **)(unaff_x29 + -0x28) = (long *)(unaff_x20 + 0x10);
    _uStack0000000000000038 = unaff_x29 + -0x28;
    puStack0000000000000040 = &DAT_005bc494;
    _uStack0000000000000008 = &UNK_008b5968;
    uStack0000000000000010 = 1;
    uStack0000000000000020 = 1;
    uStack0000000000000028 = 0;
    puStack0000000000000018 = &uStack0000000000000038;
    uVar1 = func_0x0046849c(*unaff_x21,unaff_x21[1],&uStack0000000000000008);
  }
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return uVar1;
}


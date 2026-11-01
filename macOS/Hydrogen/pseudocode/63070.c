
undefined8 FUN_00063070(void)

{
  char cVar1;
  undefined7 uVar2;
  int in_w8;
  ulong unaff_x20;
  undefined8 in_stack_00000000;
  undefined1 uStack000000000000000f;
  char cStack0000000000000017;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  
  cVar1 = s_Accept_Encoding_008d1b48[7];
  uVar2 = s_Accept_Encoding_008d1b48._0_7_;
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000000);
    cVar1 = s_Accept_Encoding_008d1b48[7];
    uVar2 = s_Accept_Encoding_008d1b48._0_7_;
  }
  s_Accept_Encoding_008d1b48._0_7_ = uVar2;
  s_Accept_Encoding_008d1b48[7] = cVar1;
  if ((unaff_x20 & 1) != 0) {
    cStack0000000000000017 = '\x0f';
    uStack000000000000000f = 0;
    func_0x0005cc80(&uStack0000000000000018);
    if (cStack0000000000000017 < '\0') {
      __ZdlPv(CONCAT17(cVar1,uVar2));
    }
    if (in_stack_00000028._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000018);
      return 0;
    }
  }
  return 0;
}


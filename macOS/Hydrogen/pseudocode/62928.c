
void FUN_00062928(void)

{
  ulong uVar1;
  undefined6 uVar2;
  long unaff_x19;
  char cStack0000000000000016;
  char cStack0000000000000017;
  undefined1 uStack000000000000001e;
  char cStack0000000000000027;
  undefined8 uStack0000000000000030;
  long in_stack_00000040;
  
  if (in_stack_00000040 < 0) {
    __ZdlPv(uStack0000000000000030);
  }
  uVar1 = *(ulong *)(unaff_x19 + 0x68);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x77)) {
    uVar1 = (ulong)*(byte *)(unaff_x19 + 0x77);
  }
  __ZNSt3__19to_stringEm(&uStack0000000000000030,uVar1);
  uVar2 = s_Content_Length_008d1a55._0_6_;
  cStack0000000000000027 = '\x0e';
  cStack0000000000000016 = s_Content_Length_008d1a55[6];
  cStack0000000000000017 = s_Content_Length_008d1a55[7];
  uStack000000000000001e = 0;
  func_0x0005dd28();
  if (cStack0000000000000027 < '\0') {
    __ZdlPv(CONCAT26(_cStack0000000000000016,uVar2));
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  return;
}


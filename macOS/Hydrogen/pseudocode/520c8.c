
undefined8 FUN_000520c8(void)

{
  long lVar1;
  code *pcVar2;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000088;
  long in_stack_000000b0;
  long in_stack_000000c0;
  char cStack00000000000001d8;
  char cStack00000000000001d9;
  long in_stack_000001e0;
  
  __ZNSt3__18ios_base5clearEj();
  func_0x00479c54();
  func_0x006e3964();
  lVar1 = in_stack_000000c0;
  uStack0000000000000040 = unaff_x25 + 0x18;
  in_stack_000001e0 = unaff_x25 + 0x40;
  in_stack_00000048 = unaff_x26 + 0x10;
  if (in_stack_000000c0 != 0) {
    func_0x0001af20();
    _fclose(lVar1);
    in_stack_000000c0 = 0;
    (**(code **)(in_stack_00000048 + 0x18))();
  }
  if ((cStack00000000000001d8 != '\0') && (in_stack_00000088 != 0)) {
    __ZdaPv();
  }
  if ((cStack00000000000001d9 != '\0') && (in_stack_000000b0 != 0)) {
    __ZdaPv();
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x521e4);
    (*pcVar2)();
  }
  return 1;
}


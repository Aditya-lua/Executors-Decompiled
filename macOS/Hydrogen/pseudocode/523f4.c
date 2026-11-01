
void FUN_000523f4(void)

{
  undefined8 uVar1;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined1 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000088;
  long in_stack_000000b0;
  undefined8 in_stack_000000c0;
  char cStack00000000000001d8;
  char cStack00000000000001d9;
  undefined1 uStack_11;
  
  ___cxa_begin_catch();
  ___cxa_end_catch();
  while( true ) {
    if ((cStack00000000000001d8 != '\0') && (in_stack_00000088 != 0)) {
      __ZdaPv();
    }
    if ((cStack00000000000001d9 != '\0') && (in_stack_000000b0 != 0)) {
      __ZdaPv();
    }
    __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
    __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
    __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
    if (-1 < in_stack_00000030) break;
    __ZdlPv(in_stack_00000020);
    __Unwind_Resume();
    func_0x0001af20();
    _fclose();
    in_stack_000000c0 = 0;
    (**(code **)(in_stack_00000048 + 0x18))();
  }
  uVar1 = __Unwind_Resume();
  func_0x0005249c(&uStack_11,uVar1);
  return;
}


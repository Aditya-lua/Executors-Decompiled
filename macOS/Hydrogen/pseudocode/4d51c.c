
undefined8 FUN_0004d51c(undefined8 param_1)

{
  code *pcVar1;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(param_1,0);
  if (((uStack0000000000000038 == '\0') || (uStack0000000000000038 == -1)) ||
     (__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                (&uStack0000000000000038,&uStack0000000000000008,0),
     uStack0000000000000038 != '\x01')) {
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4d5c8);
    (*pcVar1)();
  }
  __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000008,0);
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  return 0;
}


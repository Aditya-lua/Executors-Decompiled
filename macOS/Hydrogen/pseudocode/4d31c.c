
undefined8 FUN_0004d31c(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined1 uStack0000000000000038;
  
  iVar2 = _memcmp(param_1,"./");
  if (iVar2 == 0) {
    func_0x006e644c();
  }
  else {
    func_0x0004dd60();
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000038);
    if ((uStack0000000000000038 != -1) && (uStack0000000000000038 != '\0')) {
      __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE();
      if (in_stack_00000010 < 0) {
        __ZdlPv(in_stack_00000000);
      }
      if (in_stack_00000028 < 0) {
        __ZdlPv(in_stack_00000018);
      }
      return 0;
    }
    func_0x006e644c();
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4d354);
  (*pcVar1)();
}


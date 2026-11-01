
undefined8 FUN_0004d2a4(void)

{
  code *pcVar1;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  char in_stack_00000038;
  
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE();
  if ((in_stack_00000038 == -1) || (in_stack_00000038 == '\0')) {
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4d354);
    (*pcVar1)();
  }
  __ZNSt3__14__fs10filesystem12__remove_allERKNS1_4pathEPNS_10error_codeE();
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  return 0;
}


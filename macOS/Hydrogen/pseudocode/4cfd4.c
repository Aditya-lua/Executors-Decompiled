
undefined8 FUN_0004cfd4(long param_1)

{
  long lVar1;
  long in_x9;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000038;
  
  if (in_x9 != 0x17) {
    param_1 = in_x9;
  }
  lVar1 = __Znwm(param_1 + 1U);
  in_stack_00000020 = lVar1;
  _memmove(lVar1);
  *(undefined1 *)(lVar1 + unaff_x20) = 0;
  func_0x0004dd60(&uStack0000000000000008);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (&uStack0000000000000038,&uStack0000000000000008,0);
  if ((uStack0000000000000038 == '\0') || (uStack0000000000000038 == -1)) {
    __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE
              (&uStack0000000000000008,0);
  }
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  if ((long)(param_1 + 1U | 0x8000000000000000) < 0) {
    __ZdlPv(in_stack_00000020);
  }
  return 0;
}


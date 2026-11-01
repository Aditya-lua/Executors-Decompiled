
undefined8 FUN_0004cd74(void)

{
  long unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  
  if (unaff_x20 != 0) {
    _memmove();
  }
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  func_0x0004dd60(&uStack0000000000000008);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (&uStack0000000000000038,&uStack0000000000000008,0);
  if ((uStack0000000000000038 != '\0') && (uStack0000000000000038 != -1)) {
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
              (&uStack0000000000000038,&uStack0000000000000008,0);
  }
  func_0x006e3c24();
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  return 1;
}


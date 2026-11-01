
undefined8 FUN_0005077c(void)

{
  code *pcVar1;
  undefined8 uVar2;
  int *unaff_x20;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  if (*unaff_x20 != 0x736f6c43 || (char)unaff_x20[1] != 'e') {
    func_0x006e644c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x50834);
    (*pcVar1)();
  }
  uVar2 = func_0x00050f00();
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  return uVar2;
}


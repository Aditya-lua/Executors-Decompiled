
/* WARNING: Removing unreachable block (ram,0x006bd6a4) */

void FUN_006bd5b0(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *unaff_x21;
  long unaff_x29;
  long in_stack_00000020;
  long in_stack_00000048;
  char in_stack_00000068;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 *in_stack_000000a0;
  undefined8 *in_stack_000000a8;
  long in_stack_000000b8;
  long in_stack_000000d0;
  
  func_0x0070f698();
  if (in_stack_00000068 != '\0') {
    if (in_stack_00000048 != 0) {
      __ZdlPv();
    }
    if (in_stack_00000020 != 0) {
      __ZdlPv();
      *unaff_x21 = 0;
      unaff_x21[1] = 0;
    }
  }
  if (in_stack_000000a0 != in_stack_000000a8) {
    uVar2 = ___cxa_allocate_exception(0x38);
    func_0x006d073c();
    func_0x0070f678(uVar2);
    ___cxa_throw(uVar2,&UNK_00a1df80,&DAT_006bd7f4);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6bd748);
    (*pcVar1)();
  }
  func_0x006bc488();
  if (in_stack_000000d0 != 0) {
    __ZdlPv();
  }
  if (in_stack_000000b8 != 0) {
    __ZdlPv();
  }
  if (in_stack_000000a0 != (undefined8 *)0x0) {
    while (in_stack_000000a8 != in_stack_000000a0) {
      in_stack_000000a8 = in_stack_000000a8 + -6;
      (**(code **)*in_stack_000000a8)(in_stack_000000a8);
    }
    __ZdlPv(in_stack_000000a0);
  }
  if (in_stack_00000088 != 0) {
    for (; in_stack_00000090 != in_stack_00000088; in_stack_00000090 = in_stack_00000090 + -0x30) {
    }
    __ZdlPv(in_stack_00000088);
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    __ZdlPv();
  }
  func_0x00704bec(unaff_x29 + -0x50);
  return;
}


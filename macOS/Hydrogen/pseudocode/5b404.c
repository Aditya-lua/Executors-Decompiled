
uint FUN_0005b404(void)

{
  code *pcVar1;
  int in_w8;
  long *unaff_x19;
  long *unaff_x20;
  uint unaff_w24;
  long unaff_x29;
  undefined8 in_stack_000000b8;
  long in_stack_000000c8;
  long in_stack_00000110;
  undefined1 uStack0000000000000140;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x0005b404:
  if (-1 < in_w8) goto LAB_0005b3e4;
  do {
    __ZdlPv(*(undefined8 *)((long)unaff_x19 + 0x10));
    __ZdlPv(unaff_x19);
    unaff_x19 = unaff_x20;
    while( true ) {
      if (unaff_x19 == (long *)0x0) {
        if (in_stack_00000110 != 0) {
          __ZdlPv();
        }
        func_0x00070c58(&uStack0000000000000140);
        func_0x00070e14(auStack_7ffffffe + 0x8000024e);
        if (in_stack_000000c8 < 0) {
          __ZdlPv(in_stack_000000b8);
        }
        if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x68)) {
          ___stack_chk_fail();
          func_0x0001748c();
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x5c128);
          (*pcVar1)();
        }
        return unaff_w24 & 1;
      }
      unaff_x20 = (long *)*unaff_x19;
      if (-1 < *(char *)((long)unaff_x19 + 0x3f)) {
        in_w8 = (int)*(char *)((long)unaff_x19 + 0x27);
        goto code_r0x0005b404;
      }
      __ZdlPv(unaff_x19[5]);
      if (*(char *)((long)unaff_x19 + 0x27) < '\0') break;
LAB_0005b3e4:
      __ZdlPv(unaff_x19);
      unaff_x19 = unaff_x20;
    }
  } while( true );
}


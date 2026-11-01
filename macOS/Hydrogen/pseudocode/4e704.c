
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004e704(void)

{
  code *pcVar1;
  int extraout_w8;
  long extraout_x9;
  long extraout_x10;
  long extraout_x11;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  undefined8 in_stack_00000060;
  long in_stack_00000070;
  undefined8 in_stack_00000080;
  long in_stack_00000090;
  undefined8 in_stack_000000a0;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000c8;
  
code_r0x0004e704:
  __ZdlPv(in_stack_00000080);
  if (-1 < in_stack_000000b0) goto LAB_0004e684;
code_r0x0004e714:
  __ZdlPv(in_stack_000000a0);
  if (-1 < in_stack_000000c8) goto LAB_0004e68c;
  do {
    __ZdlPv(in_stack_000000b8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return;
    }
    while( true ) {
      ___stack_chk_fail();
      if (extraout_w8 < 0) {
        __ZdlPv();
      }
      if (extraout_x10 != 0 || extraout_x11 != extraout_x9) {
        func_0x006e644c(in_stack_00000000,"Access outside workspace is not allowed");
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x4e7c4);
        (*pcVar1)();
      }
      if (in_stack_00000040 < 0) {
        __ZdlPv(in_stack_00000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(in_stack_00000060);
      }
      if (in_stack_00000090 < 0) goto code_r0x0004e704;
      if (in_stack_000000b0 < 0) goto code_r0x0004e714;
LAB_0004e684:
      if (in_stack_000000c8 < 0) break;
LAB_0004e68c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
  } while( true );
}


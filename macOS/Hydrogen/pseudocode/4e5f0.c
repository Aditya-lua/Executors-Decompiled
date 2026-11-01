
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004e5f0(void)

{
  byte *pbVar1;
  byte *pbVar2;
  code *pcVar3;
  bool bVar4;
  int in_w8;
  int extraout_w8;
  byte *in_x9;
  long extraout_x9;
  long in_x10;
  long extraout_x10;
  byte *in_x11;
  long extraout_x11;
  long in_x12;
  byte *in_x13;
  uint in_w14;
  byte *in_x15;
  long lVar5;
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
  
  for (; in_x15 != in_x11; in_x15 = in_x15 + 1) {
    if (*in_x15 == in_w14) {
      lVar5 = 1;
      do {
        if (in_x10 == lVar5) {
          in_x13 = in_x15;
          break;
        }
        pbVar2 = in_x15 + lVar5;
        if (pbVar2 == in_x11) goto LAB_0004e638;
        pbVar1 = (byte *)(in_x12 + lVar5);
        lVar5 = lVar5 + 1;
      } while (*pbVar2 == *pbVar1);
    }
  }
LAB_0004e638:
  bVar4 = (in_x10 == 0 || in_x13 != in_x11) && in_x13 == in_x9;
  do {
    if (in_w8 < 0) {
      __ZdlPv();
    }
    if (!bVar4) {
      func_0x006e644c(in_stack_00000000,"Access outside workspace is not allowed");
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x4e7c4);
      (*pcVar3)();
    }
    if (in_stack_00000040 < 0) {
      __ZdlPv(in_stack_00000030);
    }
    if (in_stack_00000070 < 0) {
      __ZdlPv(in_stack_00000060);
      if (-1 < in_stack_00000090) goto LAB_0004e67c;
LAB_0004e704:
      __ZdlPv(in_stack_00000080);
      if (-1 < in_stack_000000b0) goto code_r0x0004e684;
LAB_0004e714:
      __ZdlPv(in_stack_000000a0);
      if (-1 < in_stack_000000c8) goto code_r0x0004e68c;
LAB_0004e724:
      __ZdlPv(in_stack_000000b8);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    else {
      if (in_stack_00000090 < 0) goto LAB_0004e704;
LAB_0004e67c:
      if (in_stack_000000b0 < 0) goto LAB_0004e714;
code_r0x0004e684:
      if (in_stack_000000c8 < 0) goto LAB_0004e724;
code_r0x0004e68c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    ___stack_chk_fail();
    bVar4 = extraout_x10 == 0 && extraout_x11 == extraout_x9;
    in_w8 = extraout_w8;
  } while( true );
}


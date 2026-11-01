
void FUN_004ad654(long *param_1)

{
  code *pcVar1;
  long lVar2;
  char *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  char cVar3;
  long in_xzr;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  
  while( true ) {
    if (param_1 != (long *)0x0) {
      lVar2 = *param_1;
      *param_1 = lVar2 + unaff_x27;
      LORelease();
      if (lVar2 == 1) {
        in_xzr = *uStack0000000000000028;
        func_0x005d2ac4(&uStack0000000000000028);
      }
    }
    cVar3 = (char)in_xzr;
    unaff_x25 = unaff_x25 + 2;
    unaff_x24 = unaff_x24 + 1;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) {
      func_0x00499fc8(unaff_x22 + 0x28);
      func_0x004b023c(unaff_x22 + 0x28);
      func_0x00491304();
      if (*unaff_x19 == '\x01') {
        *unaff_x19 = cVar3;
      }
      else {
        func_0x007b05dc();
      }
      return;
    }
    lVar2 = *(long *)*unaff_x24;
    *(long *)*unaff_x24 = lVar2 + unaff_x26;
    if (lVar2 < 0) break;
    in_stack_00000030 = *unaff_x24;
    lVar2 = *(long *)*unaff_x25;
    *(long *)*unaff_x25 = lVar2 + unaff_x26;
    if (lVar2 < 0) {
      func_0x007a05dc();
code_r0x004ad6ec:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x4ad6f0);
      (*pcVar1)();
    }
    param_1 = (long *)func_0x0049e294();
    uStack0000000000000028 = param_1;
  }
  func_0x007a05dc();
  goto code_r0x004ad6ec;
}


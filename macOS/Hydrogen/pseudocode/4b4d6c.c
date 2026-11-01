
void FUN_004b4d6c(long param_1)

{
  code *pcVar1;
  long lVar2;
  char *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 *puVar3;
  undefined8 *puVar4;
  char cVar5;
  long in_xzr;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  
  puVar3 = *(undefined8 **)(unaff_x21 + -0x10);
  puVar4 = (undefined8 *)(*(long *)(param_1 + 0x10) + 8);
  do {
    lVar2 = *(long *)*puVar3;
    *(long *)*puVar3 = lVar2 + 1;
    if (lVar2 < 0) {
      func_0x007a05dc();
code_r0x004b4e60:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x4b4e64);
      (*pcVar1)();
    }
    in_stack_00000030 = *puVar3;
    lVar2 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar2 + 1;
    if (lVar2 < 0) {
      func_0x007a05dc();
      goto code_r0x004b4e60;
    }
    uStack0000000000000028 = (long *)func_0x0049e294();
    if (uStack0000000000000028 != (long *)0x0) {
      lVar2 = *uStack0000000000000028;
      *uStack0000000000000028 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        in_xzr = *uStack0000000000000028;
        func_0x005d2ac4(&uStack0000000000000028);
      }
    }
    cVar5 = (char)in_xzr;
    puVar4 = puVar4 + 2;
    puVar3 = puVar3 + 1;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) {
      func_0x00499fc8(unaff_x22 + 0x28);
      func_0x004b023c(unaff_x22 + 0x28);
      func_0x00491304();
      if (*unaff_x19 == '\x01') {
        *unaff_x19 = cVar5;
      }
      else {
        func_0x007b05dc();
      }
      return;
    }
  } while( true );
}


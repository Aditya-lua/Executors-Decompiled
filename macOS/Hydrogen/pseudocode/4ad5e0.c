
void FUN_004ad5e0(void)

{
  code *pcVar1;
  long lVar2;
  char *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  char cVar6;
  long in_xzr;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  
  cVar6 = (char)in_xzr;
  uVar3 = *(ulong *)(unaff_x23 + 0x18);
  if (*(ulong *)(unaff_x21 + -8) <= *(ulong *)(unaff_x23 + 0x18)) {
    uVar3 = *(ulong *)(unaff_x21 + -8);
  }
  if (uVar3 != 0) {
    puVar4 = *(undefined8 **)(unaff_x21 + -0x10);
    puVar5 = (undefined8 *)(*(long *)(unaff_x23 + 0x10) + 8);
    do {
      lVar2 = *(long *)*puVar4;
      *(long *)*puVar4 = lVar2 + 1;
      if (lVar2 < 0) {
        func_0x007a05dc();
code_r0x004ad6ec:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x4ad6f0);
        (*pcVar1)();
      }
      in_stack_00000030 = *puVar4;
      lVar2 = *(long *)*puVar5;
      *(long *)*puVar5 = lVar2 + 1;
      if (lVar2 < 0) {
        func_0x007a05dc();
        goto code_r0x004ad6ec;
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
      cVar6 = (char)in_xzr;
      puVar5 = puVar5 + 2;
      puVar4 = puVar4 + 1;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  func_0x00499fc8(unaff_x22 + 0x28);
  func_0x004b023c(unaff_x22 + 0x28);
  func_0x00491304();
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = cVar6;
  }
  else {
    func_0x007b05dc();
  }
  return;
}


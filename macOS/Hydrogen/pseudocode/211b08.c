
/* WARNING: Possible PIC construction at 0x00211d1c: Changing call to branch */

void FUN_00211b08(void)

{
  code *pcVar1;
  long lVar2;
  undefined *puVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x25;
  undefined8 unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000002c0;
  undefined8 in_stack_000002c8;
  undefined1 auStack_7ffffffe [2147483646];
  
  _memcpy();
  in_stack_00000000 = in_stack_00000018;
  func_0x0020d67c(&uStack0000000000000070,unaff_x22 + (unaff_x25 - 1U & 0xfffffffffffffff0) + 0x10);
  if ((*(byte *)(unaff_x19 + 0x2d) & 1) == 0) {
    in_stack_000000c0 = unaff_x19[2];
    in_stack_000000b8 = unaff_x19[1];
    uStack00000000000000b0 = *unaff_x19;
    lVar2 = func_0x00187bd0(0x1b0,8);
    if (lVar2 == 0) {
      func_0x007a1f18(8,0x1b0);
      goto LAB_00211d88;
    }
    _memcpy(lVar2,&uStack00000000000000b0,0x1b0);
    puVar3 = &UNK_009c6808;
  }
  else {
    in_stack_000000c0 = unaff_x19[2];
    in_stack_000000b8 = unaff_x19[1];
    uStack00000000000000b0 = *unaff_x19;
    lVar2 = func_0x00187bd0(0x1a8,8);
    if (lVar2 == 0) {
      func_0x007a1f18(8,0x1a8);
LAB_00211d88:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x211d8c);
      (*pcVar1)();
    }
    _memcpy(lVar2,&uStack00000000000000b0,0x1a8);
    puVar3 = &UNK_009c67c0;
  }
  unaff_x21[1] = lVar2;
  unaff_x21[2] = puVar3;
  *unaff_x21 = 0x8000000000000027;
  if (in_stack_00000040 == 0) {
    func_0x002087e4();
    register0x00000008 = (BADSPACEBASE *)(auStack_7ffffffe + 0x800002ce);
  }
  else {
    in_stack_000002c8 = 0x211d20;
    in_stack_000002c0 = unaff_x29;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = in_stack_000002c0;
  *(undefined8 *)((long)register0x00000008 + -8) = in_stack_000002c8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}



/* WARNING: Possible PIC construction at 0x00211d1c: Changing call to branch */

void FUN_00211c98(long param_1)

{
  code *pcVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x23;
  undefined8 unaff_x29;
  undefined8 uVar3;
  long in_stack_00000040;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined1 uStack00000000000000b0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000130;
  undefined8 uStack0000000000000138;
  undefined8 uStack0000000000000160;
  undefined8 uStack0000000000000168;
  undefined8 uStack0000000000000170;
  undefined8 uStack0000000000000178;
  undefined8 in_stack_000002c0;
  undefined8 in_stack_000002c8;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack0000000000000108 = in_stack_00000078;
  uStack0000000000000100 = in_stack_00000070;
  uStack0000000000000118 = in_stack_00000088;
  uStack0000000000000110 = in_stack_00000080;
  uStack0000000000000128 = in_stack_00000098;
  uStack0000000000000120 = in_stack_00000090;
  uStack0000000000000138 = in_stack_000000a8;
  uStack0000000000000130 = in_stack_000000a0;
  uVar3 = *(undefined8 *)(unaff_x19 + 0x38);
  *(undefined8 *)(param_1 + 0x40) = *(undefined8 *)(unaff_x19 + 0x40);
  *(undefined8 *)(param_1 + 0x38) = uVar3;
  uStack00000000000000f8 = *(undefined8 *)(unaff_x19 + 0x48);
  uStack0000000000000168 = *(undefined8 *)(unaff_x19 + 0x78);
  uStack0000000000000160 = *(undefined8 *)(unaff_x19 + 0x70);
  uStack0000000000000178 = *(undefined8 *)(unaff_x19 + 0x88);
  uStack0000000000000170 = *(undefined8 *)(unaff_x19 + 0x80);
  lVar2 = func_0x00187bd0(0x1b0,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1b0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x211d8c);
    (*pcVar1)();
  }
  _memcpy(lVar2,&uStack00000000000000b0,0x1b0);
  unaff_x21[1] = lVar2;
  unaff_x21[2] = (long)&UNK_009c6808;
  *unaff_x21 = unaff_x23 + 0x16;
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


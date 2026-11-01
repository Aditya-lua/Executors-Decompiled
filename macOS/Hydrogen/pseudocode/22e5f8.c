
/* WARNING: Possible PIC construction at 0x0022e6ac: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0022e6b0) */

void FUN_0022e5f8(void)

{
  code *pcVar1;
  long lVar2;
  long in_x12;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x24;
  undefined8 unaff_x29;
  undefined8 uVar3;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  undefined1 uStack00000000000001a0;
  undefined1 uStack00000000000001a1;
  undefined8 in_stack_000001f0;
  undefined8 in_stack_000001f8;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar3 = *(undefined8 *)(unaff_x19 + 0xd8);
  *(undefined8 *)(in_x12 + 0xe0) = *(undefined8 *)(unaff_x19 + 0xe0);
  *(undefined8 *)(in_x12 + 0xd8) = uVar3;
  uStack00000000000001a0 = *(undefined1 *)(unaff_x19 + 400);
  uStack0000000000000088 = *(undefined8 *)(unaff_x19 + 0x88);
  uStack0000000000000080 = *(undefined8 *)(unaff_x19 + 0x80);
  uStack0000000000000098 = *(undefined8 *)(unaff_x19 + 0x98);
  uStack0000000000000090 = *(undefined8 *)(unaff_x19 + 0x90);
  uStack00000000000000a8 = *(undefined8 *)(unaff_x19 + 0xa8);
  uStack00000000000000a0 = *(undefined8 *)(unaff_x19 + 0xa0);
  uStack00000000000000b8 = *(undefined8 *)(unaff_x19 + 0xb8);
  uStack00000000000000b0 = *(undefined8 *)(unaff_x19 + 0xb0);
  uStack00000000000000c0 = *(undefined8 *)(unaff_x19 + 0xc0);
  uStack00000000000001a1 = *(undefined1 *)(unaff_x19 + 0x191);
  lVar2 = func_0x00187bd0(0x1a8,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22e808);
    (*pcVar1)();
  }
  _memcpy();
  unaff_x21[1] = lVar2;
  unaff_x21[2] = (long)&UNK_009c8478;
  *unaff_x21 = unaff_x24 + 0x19;
  lVar2 = *unaff_x20;
  if (lVar2 + 0x7fffffffffffffffU < 5) {
    func_0x0022200c();
  }
  else {
    if (*unaff_x22 != unaff_x24) {
      func_0x002223f4();
      lVar2 = *unaff_x20;
    }
    if ((lVar2 != -0x8000000000000000) && (lVar2 != 0)) {
      in_stack_000001f8 = 0x22e6b0;
      in_stack_000001f0 = unaff_x29;
      goto code_r0x00187bd4;
    }
  }
  register0x00000008 = (BADSPACEBASE *)(auStack_7ffffffe + 0x800001fe);
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = in_stack_000001f0;
  *(undefined8 *)((long)register0x00000008 + -8) = in_stack_000001f8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


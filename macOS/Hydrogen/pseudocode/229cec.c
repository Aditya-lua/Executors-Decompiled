
/* WARNING: Possible PIC construction at 0x00229f90: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00229f94) */

void FUN_00229cec(long param_1,undefined8 param_2,undefined1 param_3 [16])

{
  code *pcVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x24;
  undefined8 unaff_x29;
  undefined8 uVar3;
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack00000000000000d8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000130;
  undefined1 uStack0000000000000178;
  undefined1 uStack0000000000000179;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined1 uStack00000000000001f0;
  
  uStack0000000000000130 = *(undefined8 *)(unaff_x19 + 0x118);
  uStack0000000000000178 = *(undefined1 *)(unaff_x19 + 0x160);
  *(long *)(param_1 + 0xd0) = param_3._8_8_;
  *(long *)(param_1 + 200) = param_3._0_8_;
  uStack00000000000000d8 = *(undefined8 *)(unaff_x19 + 0xc0);
  lStack0000000000000008 = unaff_x20[5];
  lStack0000000000000000 = unaff_x20[4];
  lStack0000000000000010 = unaff_x20[6];
  uStack0000000000000179 = *(undefined1 *)(unaff_x19 + 0x162);
  uStack0000000000000108 = *(undefined8 *)(unaff_x19 + 0xf0);
  uStack0000000000000100 = *(undefined8 *)(unaff_x19 + 0xe8);
  uStack0000000000000110 = param_2;
  lVar2 = func_0x00187bd0(0x180,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x180);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22a000);
    (*pcVar1)();
  }
  _memcpy();
  unaff_x21[1] = lVar2;
  unaff_x21[2] = (long)&UNK_009c8598;
  *unaff_x21 = unaff_x24 + 0x23;
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
      uVar3 = 0x229f94;
      goto code_r0x00187bd4;
    }
  }
  register0x00000008 = (BADSPACEBASE *)&uStack00000000000001f0;
  unaff_x29 = in_stack_000001e0;
  uVar3 = in_stack_000001e8;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


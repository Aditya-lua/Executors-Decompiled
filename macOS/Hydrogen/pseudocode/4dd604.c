
/* WARNING: Possible PIC construction at 0x004dd634: Changing call to branch */

void FUN_004dd604(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long lVar3;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  lVar1 = *(long *)(unaff_x19 + 0x10);
  lVar3 = *(long *)(unaff_x19 + 0x18);
  for (lVar2 = *(long *)(unaff_x19 + 8); lVar2 != lVar3; lVar2 = lVar2 + 4) {
    func_0x004d1c68();
  }
  if (lVar1 != 0) {
    uVar4 = 0x4dd638;
code_r0x00187bd4:
    *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)();
    return;
  }
  if (*(long *)(unaff_x19 + 0x20) != 0) {
    lVar1 = *(long *)(unaff_x19 + 0x30);
    lVar3 = *(long *)(unaff_x19 + 0x38);
    for (lVar2 = *(long *)(unaff_x19 + 0x28); lVar2 != lVar3; lVar2 = lVar2 + 4) {
      func_0x004d1c68();
    }
    if (lVar1 != 0) {
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
      unaff_x29 = in_stack_00000030;
      uVar4 = in_stack_00000038;
      goto code_r0x00187bd4;
    }
  }
  return;
}


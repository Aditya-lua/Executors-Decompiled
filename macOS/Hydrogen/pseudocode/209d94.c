
/* WARNING: Possible PIC construction at 0x00209da0: Changing call to branch */

void FUN_00209d94(undefined8 param_1,long param_2)

{
  bool in_ZR;
  undefined8 uVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long lVar4;
  undefined8 unaff_x29;
  undefined8 uVar5;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (!in_ZR) {
    uVar1 = *(undefined8 *)(unaff_x19 + 0x60);
    uVar3 = 1;
    uVar5 = 0x209da4;
code_r0x00187bd4:
    *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(uVar1,param_2,uVar3);
    return;
  }
  func_0x0020848c();
  func_0x00209ea8(unaff_x19 + 0x80);
  if (*(long *)(unaff_x19 + 0x38) != -0x8000000000000000) {
    lVar4 = *(long *)(unaff_x19 + 0x48) + 1;
    lVar2 = *(long *)(unaff_x19 + 0x40);
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0016af10(lVar2);
      lVar2 = lVar2 + 0x70;
    }
    if (*(long *)(unaff_x19 + 0x38) != 0) {
      uVar1 = *(undefined8 *)(unaff_x19 + 0x40);
      param_2 = *(long *)(unaff_x19 + 0x38) * 0x70;
      uVar3 = 8;
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
      unaff_x29 = in_stack_00000030;
      uVar5 = in_stack_00000038;
      goto code_r0x00187bd4;
    }
  }
  return;
}


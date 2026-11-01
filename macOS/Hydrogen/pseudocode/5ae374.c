
/* WARNING: Possible PIC construction at 0x005ae3b0: Changing call to branch */

void FUN_005ae374(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  lVar1 = *(long *)(param_1 + 8);
  lVar3 = *(long *)(param_1 + 0x10) + 1;
  lVar2 = lVar1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0059cd8c(lVar2);
    lVar2 = lVar2 + 0x18;
  }
  if (*unaff_x19 == 0) {
    lVar1 = unaff_x19[4];
    lVar3 = unaff_x19[5] + 1;
    lVar2 = lVar1;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059ce88(lVar2);
      lVar2 = lVar2 + 0x40;
    }
    if (unaff_x19[3] == 0) {
      return;
    }
    lVar3 = unaff_x19[3] << 6;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar4 = in_stack_00000038;
  }
  else {
    lVar3 = *unaff_x19 * 0x18;
    uVar4 = 0x5ae3b4;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3,8);
  return;
}


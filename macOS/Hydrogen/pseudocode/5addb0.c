
/* WARNING: Possible PIC construction at 0x005addbc: Changing call to branch */

void FUN_005addb0(undefined8 param_1,long param_2)

{
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
  
  if (param_2 == 0) {
    lVar4 = *(long *)(unaff_x19 + 0x30) + 1;
    lVar2 = *(long *)(unaff_x19 + 0x28);
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0059ce88(lVar2);
      lVar2 = lVar2 + 0x40;
    }
    if (*(long *)(unaff_x19 + 0x20) == 0) {
      return;
    }
    uVar1 = *(undefined8 *)(unaff_x19 + 0x28);
    param_2 = *(long *)(unaff_x19 + 0x20) << 6;
    uVar3 = 8;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar5 = in_stack_00000038;
  }
  else {
    uVar1 = *(undefined8 *)(unaff_x19 + 0x10);
    uVar3 = 1;
    uVar5 = 0x5addc0;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,param_2,uVar3);
  return;
}


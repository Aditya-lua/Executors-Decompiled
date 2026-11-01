
/* WARNING: Possible PIC construction at 0x0047b0c4: Changing call to branch */

void FUN_0047b08c(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long lVar2;
  undefined8 unaff_x29;
  undefined8 uVar3;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  param_1 = param_1 + 1;
  while (param_1 = param_1 + -1, param_1 != 0) {
    func_0x00487f7c();
  }
  if (*unaff_x19 == 0) {
    lVar2 = unaff_x19[5] + 1;
    lVar1 = unaff_x19[4];
    while (lVar2 = lVar2 + -1, lVar2 != 0) {
      func_0x00488078(lVar1);
      lVar1 = lVar1 + 0x40;
    }
    if (unaff_x19[3] == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar3 = in_stack_00000038;
  }
  else {
    uVar3 = 0x47b0c8;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


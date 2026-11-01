
/* WARNING: Possible PIC construction at 0x0059db1c: Changing call to branch */

void FUN_0059d2f4(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long unaff_x29;
  undefined *unaff_x30;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000040;
  
  lVar1 = param_1[1];
  lVar3 = param_1[2] + 1;
  lVar2 = lVar1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0059cd8c(lVar2);
    lVar2 = lVar2 + 0x18;
  }
  if (*param_1 == 0) {
    lVar1 = param_1[4];
    lVar3 = param_1[5] + 1;
    lVar2 = lVar1;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      func_0x0059ce88(lVar2);
      lVar2 = lVar2 + 0x40;
    }
    if (param_1[3] == 0) {
      return;
    }
    lVar3 = param_1[3] << 6;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  }
  else {
    lVar3 = *param_1 * 0x18;
    unaff_x30 = &UNK_0059db20;
    unaff_x29 = (long)register0x00000008 + 0x30;
  }
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar3,8);
  return;
}


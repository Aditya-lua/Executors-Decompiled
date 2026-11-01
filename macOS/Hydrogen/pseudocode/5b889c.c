
/* WARNING: Possible PIC construction at 0x005ae3b0: Changing call to branch */

void FUN_005b889c(undefined8 *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long in_x9;
  long unaff_x19;
  undefined8 *puVar5;
  undefined *puVar6;
  undefined8 uStack0000000000000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 uStack0000000000000150;
  undefined *in_stack_00000158;
  undefined1 uStack0000000000000160;
  
  param_1[1] = in_x9 + 0x28f;
  param_1[2] = 0x31;
  *param_1 = 0xc;
  puVar1 = (undefined8 *)&uStack0000000000000160;
  lVar2 = *(long *)(unaff_x19 + 0x28);
  lVar4 = *(long *)(unaff_x19 + 0x30) + 1;
  lVar3 = lVar2;
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x0059cd8c(lVar3);
    lVar3 = lVar3 + 0x18;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    lVar2 = *(long *)(unaff_x19 + 0x40);
    lVar4 = *(long *)(unaff_x19 + 0x48) + 1;
    lVar3 = lVar2;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0059ce88(lVar3);
      lVar3 = lVar3 + 0x40;
    }
    if (*(long *)(unaff_x19 + 0x38) == 0) {
      return;
    }
    lVar4 = *(long *)(unaff_x19 + 0x38) << 6;
    puVar5 = uStack0000000000000150;
    puVar6 = in_stack_00000158;
  }
  else {
    lVar4 = *(long *)(unaff_x19 + 0x20) * 0x18;
    puVar1 = &uStack0000000000000120;
    puVar5 = &uStack0000000000000150;
    puVar6 = &UNK_005ae3b4;
  }
  *(undefined8 **)((long)puVar1 + -0x10) = puVar5;
  *(undefined **)((long)puVar1 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,8);
  return;
}


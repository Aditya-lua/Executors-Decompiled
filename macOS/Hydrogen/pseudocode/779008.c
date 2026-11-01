
undefined8 FUN_00779008(void)

{
  long *plVar1;
  int iVar2;
  undefined *puVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000000;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  
  iVar2 = func_0x00795250();
  if (iVar2 == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return unaff_x22;
    }
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    plVar1 = (long *)(unaff_x19 + 0x780);
    (*pcRam0000000000a2b5f0)(*plVar1);
    *plVar1 = 0;
    if (unaff_x20 != 0) {
      puVar3 = (undefined *)_strlen();
      if (&UNK_007a1200 < puVar3) {
        return 0x2b;
      }
      lVar4 = (*pcRam0000000000a2b600)();
      *plVar1 = lVar4;
      if (lVar4 == 0) {
        return 0x1b;
      }
    }
    return 0;
  }
  auVar6 = ___stack_chk_fail();
  if (auVar6._0_8_ == 0) {
    return 0x2b;
  }
  uVar5 = func_0x00776054(auVar6._0_8_,auVar6._8_8_,&uStack0000000000000000);
  return uVar5;
}


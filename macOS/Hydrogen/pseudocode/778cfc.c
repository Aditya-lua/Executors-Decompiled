
undefined8 FUN_00778cfc(void)

{
  long *plVar1;
  bool in_ZR;
  undefined *puVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  long unaff_x20;
  undefined1 auVar5 [16];
  undefined1 uStack0000000000000000;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  
  if (!in_ZR) {
    auVar5 = ___stack_chk_fail();
    if (auVar5._0_8_ == 0) {
      return 0x2b;
    }
    uVar4 = func_0x00776054(auVar5._0_8_,auVar5._8_8_,&uStack0000000000000000);
    return uVar4;
  }
  plVar1 = (long *)(unaff_x19 + 0x870);
  (*pcRam0000000000a2b5f0)(*plVar1);
  *plVar1 = 0;
  if (unaff_x20 != 0) {
    puVar2 = (undefined *)_strlen();
    if (&UNK_007a1200 < puVar2) {
      return 0x2b;
    }
    lVar3 = (*pcRam0000000000a2b600)();
    *plVar1 = lVar3;
    if (lVar3 == 0) {
      return 0x1b;
    }
  }
  return 0;
}


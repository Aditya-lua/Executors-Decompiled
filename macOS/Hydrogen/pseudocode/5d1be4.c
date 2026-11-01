
/* WARNING: Possible PIC construction at 0x005d1e1c: Changing call to branch */

void FUN_005d1be4(void)

{
  bool in_ZR;
  long lVar1;
  long unaff_x19;
  undefined8 *puVar2;
  long lVar3;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (in_ZR) {
    func_0x005d2b20();
  }
  lVar3 = *(long *)(unaff_x19 + 0x18);
  if (lVar3 != 0) {
    puVar2 = (undefined8 *)(*(long *)(unaff_x19 + 0x10) + 8);
    do {
      lVar1 = *(long *)*puVar2;
      *(long *)*puVar2 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(puVar2);
      }
      puVar2 = puVar2 + 2;
      lVar3 = lVar3 + -1;
    } while (lVar3 != 0);
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar4 = in_stack_00000038;
  }
  else {
    uVar4 = 0x5d1e20;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}



/* WARNING: Possible PIC construction at 0x005a67f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a6840: Changing call to branch */

void FUN_005a67cc(long param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  long *unaff_x20;
  long lVar5;
  long lVar6;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  long lStack_40;
  undefined8 uStack_38;
  long lStack_30;
  undefined8 uStack_8;
  
  while( true ) {
    func_0x0059dd3c(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x24;
    unaff_x24 = unaff_x24 + 0x30;
  }
  if (*unaff_x20 == 0) {
    __Unwind_Resume();
    plVar3 = (long *)func_0x007a2668();
    uStack_8 = (code *)&SUB_005a6800;
    lVar1 = (long)register0x00000008 + -0x10;
    uStack_38 = 0;
    lStack_40 = unaff_x24;
    lStack_30 = unaff_x24;
    if (plVar3[4] == 0) {
      lVar1 = plVar3[1];
      if (plVar3[2] != 0) {
        lVar6 = 0;
        lVar5 = 1 - plVar3[2];
        do {
          plVar4 = *(long **)(lVar1 + lVar6);
          lVar2 = *plVar4;
          *plVar4 = lVar2 + -1;
          LORelease();
          if (lVar2 == 1) {
            func_0x005d2ac4(lVar1 + lVar6);
          }
          lVar6 = lVar6 + 0x10;
          lVar5 = lVar5 + 1;
        } while (lVar5 != 1);
      }
      if (*plVar3 == 0) {
        return;
      }
    }
    else {
      uStack_8 = FUN_005a6844;
      register0x00000008 = (BADSPACEBASE *)&lStack_40;
      unaff_x29 = lVar1;
    }
  }
  else {
    uStack_8 = (code *)&UNK_005a67f4;
  }
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


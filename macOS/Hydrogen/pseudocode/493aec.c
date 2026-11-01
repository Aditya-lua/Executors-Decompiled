
/* WARNING: Possible PIC construction at 0x00493698: Changing call to branch */

void FUN_00493aec(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long unaff_x29;
  undefined *unaff_x30;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000040;
  
  if (*param_1 == 0) {
    lVar2 = param_1[4];
    if (param_1[5] != 0) {
      lVar3 = 0;
      lVar4 = 1 - param_1[5];
      do {
        lVar1 = **(long **)(lVar2 + lVar3);
        **(long **)(lVar2 + lVar3) = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          DataMemoryBarrier(2,1);
          func_0x00525414(lVar2 + lVar3);
        }
        lVar3 = lVar3 + 0x20;
        lVar4 = lVar4 + 1;
      } while (lVar4 != 1);
    }
    if (param_1[3] == 0) {
      return;
    }
    lVar3 = param_1[3] << 5;
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  }
  else {
    lVar2 = param_1[1];
    lVar3 = *param_1 << 4;
    unaff_x30 = &UNK_0049369c;
    unaff_x29 = (long)register0x00000008 + 0x30;
  }
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar3,8);
  return;
}



/* WARNING: Possible PIC construction at 0x005d2bbc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2bf8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b60: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d2b64) */

void FUN_005d2b40(long param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long unaff_x19;
  undefined8 *puVar2;
  long lVar3;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (param_3 == param_1 || param_3 == 0) {
    lVar3 = *(long *)(unaff_x19 + 0x20);
    if (lVar3 != 0) {
      puVar2 = *(undefined8 **)(unaff_x19 + 0x18);
      do {
        lVar1 = *(long *)*puVar2;
        *(long *)*puVar2 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4(puVar2);
        }
        puVar2 = puVar2 + 1;
        lVar3 = lVar3 + -1;
      } while (lVar3 != 0);
    }
    if (*(long *)(unaff_x19 + 0x10) == 0) {
      lVar3 = *(long *)(unaff_x19 + 0x38) + 1;
      lVar1 = *(long *)(unaff_x19 + 0x30);
      while (lVar3 = lVar3 + -1, lVar3 != 0) {
        func_0x0059d298(lVar1);
        lVar1 = lVar1 + 0x108;
      }
      if (*(long *)(unaff_x19 + 0x28) == 0) {
        register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
        unaff_x29 = in_stack_00000030;
        uVar4 = in_stack_00000038;
      }
      else {
        uVar4 = 0x5d2bfc;
      }
    }
    else {
      uVar4 = 0x5d2bc0;
    }
  }
  else {
    uVar4 = 0x5d2b64;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


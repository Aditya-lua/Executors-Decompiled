
/* WARNING: Possible PIC construction at 0x00515da0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00515d14: Changing call to branch */

void FUN_00515d78(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 *unaff_x29;
  undefined *puVar5;
  undefined1 auStack_a0 [128];
  undefined1 auStack_6 [6];
  
  __Unwind_Resume();
  plVar2 = (long *)func_0x007a2668();
  puVar1 = auStack_6;
  lVar3 = *plVar2;
  if (lVar3 == 0) {
    puVar5 = (undefined *)0x515d80;
    puVar1 = auStack_6;
    func_0x00515b4c();
    plVar2 = (long *)plVar2[9];
    if (plVar2 == (long *)0x0) {
      return;
    }
    lVar3 = *plVar2;
    if (lVar3 == 0) {
      func_0x00515ce8(plVar2 + 3);
      lVar3 = 0x50;
      uVar4 = 8;
    }
    else {
      plVar2 = (long *)plVar2[1];
      uVar4 = 1;
      puVar5 = &UNK_00515d18;
      register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
      unaff_x29 = puVar1 + -10;
    }
  }
  else {
    plVar2 = (long *)plVar2[1];
    uVar4 = 1;
    puVar5 = (undefined *)0x515da4;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + -10;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar2,lVar3,uVar4);
  return;
}


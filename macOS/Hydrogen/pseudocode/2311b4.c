
/* WARNING: Possible PIC construction at 0x002311f8: Changing call to branch */

void thunk_FUN_002311c4(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  func_0x00252db4(unaff_x19 + 0xa8);
  __Unwind_Resume();
  plVar2 = (long *)func_0x007a2668();
  uStack_8 = 0x2311d8;
  puVar1 = auStack_a0;
  lVar4 = *plVar2;
  if (lVar4 == 0) {
    func_0x0016c428(plVar2 + 3);
    if (plVar2[3] == 0) {
      return;
    }
    lVar3 = plVar2[4];
    lVar4 = plVar2[3] * 0x30;
    uVar5 = 8;
  }
  else {
    lVar3 = plVar2[1];
    uVar5 = 1;
    uStack_8 = 0x2311fc;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + 0x90;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar4,uVar5);
  return;
}


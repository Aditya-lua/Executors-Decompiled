
/* WARNING: Possible PIC construction at 0x002223a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00221aa8: Changing call to branch */

void thunk_FUN_00222314(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  long unaff_x19;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  func_0x00208f48();
  func_0x0018d654(unaff_x19 + 0x30);
  func_0x00223280(unaff_x19 + 0x130);
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  uStack_8 = (undefined *)0x222338;
  puVar2 = auStack_b0;
  lVar3 = *(long *)plVar4[0x1d];
  *(long *)plVar4[0x1d] = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44();
  }
  if (*plVar4 != -0x8000000000000000) {
    func_0x00222b5c(plVar4);
  }
  if (((*(byte *)(plVar4 + 0x19) & 1) == 0) &&
     (lVar3 = plVar4[0x1a], lVar3 != -0x8000000000000000 && lVar3 != 0)) {
    lVar5 = plVar4[0x1b];
    uVar6 = 1;
    uStack_8 = (undefined *)0x2223a4;
    register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x90);
    unaff_x29 = puVar2 + 0xa0;
  }
  else {
    puVar2 = auStack_b0;
    lVar5 = plVar4[0x17];
    puVar1 = (undefined8 *)plVar4[0x18];
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)(lVar5);
    }
    lVar3 = puVar1[1];
    if (lVar3 == 0) {
      lVar3 = plVar4[0x12];
      if (lVar3 == -0x8000000000000000 || lVar3 == 0) {
        return;
      }
      lVar5 = plVar4[0x13];
      uVar6 = 1;
    }
    else {
      uVar6 = puVar1[2];
      uStack_8 = &UNK_00221aac;
      register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
      unaff_x29 = puVar2 + 0xa0;
    }
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lVar3,uVar6);
  return;
}


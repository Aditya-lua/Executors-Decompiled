
/* WARNING: Possible PIC construction at 0x001f8420: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001f8468: Changing call to branch */

void FUN_001f8408(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long *plVar3;
  code *pcVar4;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 *unaff_x29;
  undefined1 auStack_b0 [128];
  undefined8 uStack_8;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x0016af10(unaff_x21);
    unaff_x21 = unaff_x21 + 0x70;
  }
  if (unaff_x22 == 0) {
    __Unwind_Resume();
    plVar3 = (long *)func_0x007a2668();
    uStack_8 = &SUB_001f8430;
    puVar2 = auStack_b0;
    puVar1 = (undefined8 *)plVar3[6];
    pcVar4 = (code *)*puVar1;
    if (pcVar4 != (code *)0x0) {
      (*pcVar4)(plVar3[5]);
    }
    if (puVar1[1] == 0) {
      if (*plVar3 == -0x8000000000000000 || *plVar3 == 0) {
        return;
      }
    }
    else {
      uStack_8 = &UNK_001f846c;
      register0x00000008 = (BADSPACEBASE *)(auStack_b0 + 0x80);
      unaff_x29 = puVar2 + 0xa0;
    }
  }
  else {
    uStack_8 = &UNK_001f8424;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


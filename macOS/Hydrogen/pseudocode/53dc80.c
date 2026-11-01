
/* WARNING: Possible PIC construction at 0x0053dcdc: Changing call to branch */

void FUN_0053dc80(void)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  __Unwind_Resume();
  plVar3 = (long *)func_0x007a2668();
  uStack_8 = 0x53dc88;
  puVar1 = auStack_c0;
  lVar2 = plVar3[1];
  lVar5 = plVar3[2] + 1;
  lVar4 = lVar2;
  while (lVar5 = lVar5 + -1, lVar5 != 0) {
    func_0x00553bbc(lVar4);
    lVar4 = lVar4 + 0x18;
  }
  if (*plVar3 == 0) {
    lVar2 = plVar3[4];
    lVar5 = plVar3[5] + 1;
    lVar4 = lVar2;
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x00553cb8(lVar4);
      lVar4 = lVar4 + 0x40;
    }
    if (plVar3[3] == 0) {
      return;
    }
    lVar5 = plVar3[3] << 6;
  }
  else {
    lVar5 = *plVar3 * 0x18;
    uStack_8 = 0x53dce0;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar1 + 0xb0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar5,8);
  return;
}


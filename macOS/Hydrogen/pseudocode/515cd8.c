
/* WARNING: Possible PIC construction at 0x00515d14: Changing call to branch */

void FUN_00515cd8(void)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  func_0x004eabac();
  lVar2 = __Unwind_Resume();
  uStack_8 = 0x515ce8;
  puVar1 = auStack_a0;
  func_0x00515b4c();
  plVar4 = *(long **)(lVar2 + 0x30);
  if (plVar4 == (long *)0x0) {
    return;
  }
  lVar2 = *plVar4;
  if (lVar2 == 0) {
    func_0x00515ce8(plVar4 + 3);
    lVar2 = 0x50;
    uVar3 = 8;
  }
  else {
    plVar4 = (long *)plVar4[1];
    uVar3 = 1;
    uStack_8 = 0x515d18;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + 0x90;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar4,lVar2,uVar3);
  return;
}


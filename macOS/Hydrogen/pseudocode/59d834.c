
/* WARNING: Possible PIC construction at 0x0059d974: Changing call to branch */

void FUN_0059d834(void)

{
  undefined1 *puVar1;
  bool in_ZR;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  if (in_ZR) {
    func_0x005d2c74();
  }
  __Unwind_Resume();
  func_0x007a2668();
  plVar2 = (long *)func_0x007a2668();
  uStack_8 = &DAT_0059d94c;
  puVar1 = auStack_a0;
  lVar3 = plVar2[0xb];
  if ((lVar3 != 0) && (lVar4 = plVar2[0xd], lVar4 != 0)) {
    uStack_8 = &UNK_0059d978;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + 0x90;
code_r0x00187bd4:
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(lVar3,lVar4 << 3,8);
    return;
  }
  if (*plVar2 != 0) {
    if ((plVar2[1] != 0) && (plVar2[3] != 0)) {
      func_0x00187bd4(plVar2[1],plVar2[3] << 3,8);
    }
    lVar3 = plVar2[5];
    if ((lVar3 != 0) && (lVar4 = plVar2[7], lVar4 != 0)) goto code_r0x00187bd4;
  }
  return;
}



/* WARNING: Possible PIC construction at 0x0059d928: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059d974: Changing call to branch */

void FUN_0059d908(void)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x22;
  long unaff_x23;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0059cd8c(unaff_x23);
    unaff_x23 = unaff_x23 + 0x18;
  }
  if (*(long *)(unaff_x19 + 0xa0) == 0) {
    func_0x0059ce88(unaff_x19 + 0x20);
    func_0x0059ce88(unaff_x19 + 0x60);
    __Unwind_Resume();
    func_0x007a2668();
    plVar3 = (long *)func_0x007a2668();
    uStack_8 = &DAT_0059d94c;
    puVar1 = auStack_a0;
    lVar2 = plVar3[0xb];
    if ((lVar2 == 0) || (plVar3[0xd] == 0)) {
      if (*plVar3 != 0) {
        if ((plVar3[1] != 0) && (plVar3[3] != 0)) {
          func_0x00187bd4(plVar3[1],plVar3[3] << 3,8);
        }
        lVar2 = plVar3[5];
        if ((lVar2 != 0) && (plVar3[7] != 0)) {
          lVar4 = plVar3[7] << 3;
          goto code_r0x00187bd4;
        }
      }
      return;
    }
    lVar4 = plVar3[0xd] << 3;
    uStack_8 = &UNK_0059d978;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + 0x90;
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0xa8);
    lVar4 = *(long *)(unaff_x19 + 0xa0) * 0x18;
    uStack_8 = &UNK_0059d92c;
  }
code_r0x00187bd4:
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,8);
  return;
}


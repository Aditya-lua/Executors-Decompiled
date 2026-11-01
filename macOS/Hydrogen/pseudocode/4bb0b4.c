
/* WARNING: Possible PIC construction at 0x004bb0c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb124: Changing call to branch */

void FUN_004bb0b4(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long lVar5;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  if (param_1 == 0) {
    plVar3 = (long *)__Unwind_Resume();
    uStack_8 = (code *)0x4bb0d4;
    puVar1 = auStack_c0;
    lVar2 = plVar3[1];
    lVar5 = plVar3[2] + 1;
    lVar4 = lVar2;
    while (lVar5 = lVar5 + -1, lVar5 != 0) {
      func_0x004cbb24(lVar4);
      lVar4 = lVar4 + 0x20;
    }
    if (*plVar3 == 0) {
      func_0x004ce14c(plVar3 + 3);
      if (plVar3[3] == 0) {
        return;
      }
      lVar2 = plVar3[4];
      param_1 = plVar3[3] * 0x30;
    }
    else {
      param_1 = *plVar3 << 5;
      uStack_8 = FUN_004bb128;
      register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
      unaff_x29 = puVar1 + 0xb0;
    }
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 8);
    param_1 = param_1 * 0x28;
    uStack_8 = (code *)0x4bb0cc;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(code **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,param_1,8);
  return;
}


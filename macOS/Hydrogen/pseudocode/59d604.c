
/* WARNING: Possible PIC construction at 0x0059d974: Changing call to branch */

void FUN_0059d604(undefined8 param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x29;
  undefined8 uStack_20;
  undefined8 uStack_8;
  
  func_0x0059e200(unaff_x19 + 0x60);
  if (*unaff_x21 != 0xc) {
    func_0x0059ce88();
  }
  __Unwind_Resume(param_1);
  func_0x007a2668();
  plVar2 = (long *)func_0x007a2668();
  uStack_8 = &DAT_0059d94c;
  lVar1 = (long)register0x00000008 + -0x10;
  lVar3 = plVar2[0xb];
  uStack_20 = param_1;
  if ((lVar3 != 0) && (lVar4 = plVar2[0xd], lVar4 != 0)) {
    uStack_8 = &UNK_0059d978;
    register0x00000008 = (BADSPACEBASE *)&uStack_20;
    unaff_x29 = lVar1;
code_r0x00187bd4:
    *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
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


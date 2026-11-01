
/* WARNING: Possible PIC construction at 0x004acb04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_004aca80(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined *puVar6;
  undefined1 auStack_a0 [128];
  undefined1 auStack_6 [6];
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0048a358(param_1);
    param_1 = param_1 + 0x80;
  }
  puVar1 = (undefined1 *)register0x00000008;
  if (*(long *)(unaff_x19 + 8) == 0) {
    __Unwind_Resume();
    puVar6 = &DAT_004acb14;
    plVar3 = (long *)func_0x007a2668();
    lVar2 = *(long *)*plVar3;
    *(long *)*plVar3 = lVar2 + -1;
    LORelease();
    if (lVar2 != 1) {
      return;
    }
    lVar2 = *plVar3;
    lVar4 = *(long *)(lVar2 + 0x10);
    if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
      lVar4 = 0x28;
      uVar5 = 8;
    }
    else {
      puVar1 = auStack_a0 + 0x80;
      unaff_x29 = auStack_6 + -10;
      lVar2 = *(long *)(lVar2 + 0x18);
      uVar5 = 1;
      puVar6 = &UNK_005d2b08;
    }
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0x10);
    lVar4 = *(long *)(unaff_x19 + 8) << 7;
    uVar5 = 8;
    puVar6 = &UNK_004acb08;
  }
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar4,uVar5);
  return;
}


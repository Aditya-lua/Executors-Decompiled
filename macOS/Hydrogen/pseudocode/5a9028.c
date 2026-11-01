
/* WARNING: Possible PIC construction at 0x005a90d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a9114: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a9118) */

void FUN_005a9028(void)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined *puVar5;
  long lStack_30;
  long lStack_28;
  undefined1 auStack_6 [6];
  
  func_0x0059ce88(unaff_x21 + 0x40);
  lVar4 = unaff_x21 + 0x80;
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    lVar4 = lVar4 + 0x80;
    func_0x0059e65c();
    unaff_x21 = lVar4;
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    __Unwind_Resume();
    puVar3 = (undefined8 *)func_0x007a2668();
    plVar1 = &lStack_30;
    unaff_x29 = auStack_6 + -10;
    uVar2 = *puVar3;
    lStack_30 = unaff_x22;
    lStack_28 = unaff_x21;
    func_0x005a8ab4(uVar2);
    lVar4 = 0x40;
    puVar5 = &UNK_005a9118;
  }
  else {
    uVar2 = *(undefined8 *)(unaff_x19 + 0x10);
    lVar4 = *(long *)(unaff_x19 + 8) << 7;
    puVar5 = &LAB_005a90dc;
    plVar1 = (long *)register0x00000008;
  }
  *(undefined1 **)((long)plVar1 + -0x10) = unaff_x29;
  *(undefined **)((long)plVar1 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar4,8);
  return;
}


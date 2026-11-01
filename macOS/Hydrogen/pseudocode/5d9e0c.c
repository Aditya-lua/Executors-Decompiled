
/* WARNING: Possible PIC construction at 0x005d9e44: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d9e80: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d9e84) */

void FUN_005d9e0c(void)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  long lStack_30;
  long lStack_28;
  undefined8 uStack_20;
  undefined1 auStack_6 [6];
  
  uVar2 = func_0x007a2668();
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0059ce88(unaff_x21);
    unaff_x21 = unaff_x21 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    __Unwind_Resume(uVar2);
    puVar4 = (undefined8 *)func_0x007a2668();
    plVar1 = &lStack_30;
    unaff_x29 = auStack_6 + -10;
    uVar3 = *puVar4;
    lStack_30 = unaff_x22;
    lStack_28 = unaff_x21;
    uStack_20 = uVar2;
    func_0x005d9820(uVar3);
    lVar5 = 0x40;
    uVar2 = 0x5d9e84;
  }
  else {
    uVar3 = *(undefined8 *)(unaff_x19 + 0x28);
    lVar5 = *(long *)(unaff_x19 + 0x20) << 6;
    uVar2 = 0x5d9e48;
    plVar1 = (long *)register0x00000008;
  }
  *(undefined1 **)((long)plVar1 + -0x10) = unaff_x29;
  *(undefined8 *)((long)plVar1 + -8) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,lVar5,8);
  return;
}


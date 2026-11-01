
/* WARNING: Possible PIC construction at 0x0056e708: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e754: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0056e758) */
/* WARNING: Removing unreachable block (ram,0x0056e760) */
/* WARNING: Removing unreachable block (ram,0x0056e76c) */
/* WARNING: Removing unreachable block (ram,0x0056e778) */
/* WARNING: Removing unreachable block (ram,0x0056e790) */
/* WARNING: Removing unreachable block (ram,0x0056e7b8) */
/* WARNING: Removing unreachable block (ram,0x0056e798) */
/* WARNING: Removing unreachable block (ram,0x0056e780) */

void FUN_0056e6d4(void)

{
  long *plVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined1 *unaff_x29;
  undefined8 uVar3;
  long lStack_40;
  long lStack_38;
  long lStack_30;
  undefined1 auStack_6 [6];
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    unaff_x24 = unaff_x22 + 0x18;
    func_0x00553bbc(unaff_x22);
    unaff_x22 = unaff_x24;
  }
  if (*unaff_x19 == 0) {
    func_0x0056e930(unaff_x19 + 3);
    __Unwind_Resume();
    func_0x007a2668();
    lVar2 = func_0x007a2668();
    plVar1 = &lStack_40;
    unaff_x29 = auStack_6 + -10;
    lStack_40 = unaff_x24;
    lStack_38 = unaff_x23;
    lStack_30 = unaff_x22;
    func_0x0056d75c(*(undefined8 *)(lVar2 + 0x30));
    uVar3 = 0x56e758;
  }
  else {
    uVar3 = 0x56e70c;
    plVar1 = (long *)register0x00000008;
  }
  *(undefined1 **)((long)plVar1 + -0x10) = unaff_x29;
  *(undefined8 *)((long)plVar1 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}



/* WARNING: Possible PIC construction at 0x004bbf84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc140: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc180: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc144) */
/* WARNING: Removing unreachable block (ram,0x004bc184) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */

void FUN_004bbfa8(void)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  long extraout_x8;
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    lVar1 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = lVar1 + unaff_x23;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    unaff_x21 = unaff_x21 + 1;
  }
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    func_0x004bcaa0(unaff_x19 + 0x38);
    plVar3 = *(long **)(unaff_x19 + 0x50);
    lVar1 = *plVar3;
    *plVar3 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2c74((undefined8 *)(unaff_x19 + 0x50));
    }
    __Unwind_Resume();
    uVar2 = *(undefined8 *)(unaff_x19 + 0x58);
    lVar1 = extraout_x8 << 6;
  }
  else {
    uVar2 = *(undefined8 *)(unaff_x19 + 0x28);
    lVar1 = *(long *)(unaff_x19 + 0x20) << 3;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar1,8);
  return;
}


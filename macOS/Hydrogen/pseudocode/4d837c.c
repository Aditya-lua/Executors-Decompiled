
/* WARNING: Possible PIC construction at 0x004d866c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004d8670) */
/* WARNING: Removing unreachable block (ram,0x004d867c) */
/* WARNING: Removing unreachable block (ram,0x004d8694) */
/* WARNING: Removing unreachable block (ram,0x004d86bc) */
/* WARNING: Removing unreachable block (ram,0x004d869c) */
/* WARNING: Removing unreachable block (ram,0x004d8684) */

void FUN_004d837c(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  undefined8 uVar3;
  
  func_0x005d2c74();
  plVar2 = *(long **)(unaff_x19 + 0x68);
  lVar1 = *plVar2;
  *plVar2 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74((undefined8 *)(unaff_x19 + 0x68));
  }
  __Unwind_Resume();
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar3 = *(undefined8 *)(lVar1 + 0x18);
  func_0x004d7924(uVar3);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,0x40,8);
  return;
}



/* WARNING: Possible PIC construction at 0x004bc140: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc180: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bc144) */
/* WARNING: Removing unreachable block (ram,0x004bc184) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */

void FUN_004bbe8c(void)

{
  long lVar1;
  long *plVar2;
  long extraout_x8;
  long unaff_x19;
  
  func_0x004bb4f4();
  lVar1 = **(long **)(unaff_x19 + 0xe0);
  **(long **)(unaff_x19 + 0xe0) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2ac4();
  }
  plVar2 = *(long **)(unaff_x19 + 0xe8);
  lVar1 = *plVar2;
  *plVar2 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74((undefined8 *)(unaff_x19 + 0xe8));
  }
  __Unwind_Resume();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0xf0),extraout_x8 << 6,8);
  return;
}


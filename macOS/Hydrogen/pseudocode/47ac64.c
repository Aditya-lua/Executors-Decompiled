
/* WARNING: Possible PIC construction at 0x0047afa4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0047afa8) */
/* WARNING: Removing unreachable block (ram,0x0047afb4) */
/* WARNING: Removing unreachable block (ram,0x0047afcc) */
/* WARNING: Removing unreachable block (ram,0x0047aff4) */
/* WARNING: Removing unreachable block (ram,0x0047afd4) */
/* WARNING: Removing unreachable block (ram,0x0047afbc) */

void FUN_0047ac64(void)

{
  bool in_ZR;
  long lVar1;
  long *plVar2;
  long unaff_x19;
  undefined8 uVar3;
  
  if (in_ZR) {
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
  func_0x007a2668();
  lVar1 = func_0x007a2668();
  uVar3 = *(undefined8 *)(lVar1 + 0x18);
  func_0x0047a214(uVar3);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,0x40,8);
  return;
}


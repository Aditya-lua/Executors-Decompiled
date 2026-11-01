
/* WARNING: Possible PIC construction at 0x0056e508: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0056e50c) */
/* WARNING: Removing unreachable block (ram,0x0056e518) */
/* WARNING: Removing unreachable block (ram,0x0056e530) */
/* WARNING: Removing unreachable block (ram,0x0056e558) */
/* WARNING: Removing unreachable block (ram,0x0056e538) */
/* WARNING: Removing unreachable block (ram,0x0056e520) */

void FUN_0056e1f8(long *param_1)

{
  long lVar1;
  long *plVar2;
  long in_x9;
  long unaff_x19;
  undefined8 uVar3;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + in_x9;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74();
  }
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
  func_0x0056d75c(uVar3);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,0x40,8);
  return;
}


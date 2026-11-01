
void FUN_005c9d10(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
  uVar2 = *puVar1;
  func_0x005c926c(uVar2);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,0x40,8);
  return;
}


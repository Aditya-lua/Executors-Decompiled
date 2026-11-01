
void FUN_005a8298(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0x328;
  if (param_1 != 0) {
    uVar1 = 0x388;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,uVar1,8);
  return;
}


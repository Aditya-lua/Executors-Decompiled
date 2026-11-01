
/* WARNING: Possible PIC construction at 0x005c9d08: Changing call to branch */

void FUN_005c9cf8(long param_1)

{
  undefined8 *puVar1;
  
  if (param_1 == 0) {
    __Unwind_Resume();
    puVar1 = (undefined8 *)func_0x007a2668();
    func_0x005c926c(*puVar1);
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


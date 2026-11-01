
void FUN_007a0c54(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  undefined1 auVar2 [16];
  long lStack_50;
  undefined1 *puStack_48;
  long lStack_40;
  
  auVar2 = __Unwind_Resume();
  puVar1 = auVar2._0_8_;
  func_0x00459450(&lStack_50,auVar2._8_8_,param_3);
  if (lStack_50 == -0x8000000000000000) {
    func_0x00433174(puVar1,param_4,puStack_48);
    *puStack_48 = 0;
    if (lStack_40 == 0) {
      return;
    }
  }
  else {
    *puVar1 = 1;
    puVar1[1] = &UNK_009dae48;
    if (lStack_50 == 0) {
      return;
    }
    lStack_40 = lStack_50;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puStack_48,lStack_40,1);
  return;
}


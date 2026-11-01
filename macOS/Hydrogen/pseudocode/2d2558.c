
void FUN_002d2558(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5
                 )

{
  long lVar1;
  undefined1 auVar2 [16];
  
  func_0x0079e928();
  func_0x0079e950();
  func_0x0079e9ec();
  func_0x0079e974();
  func_0x0079e99c();
  func_0x0079e9c4();
  func_0x0079e8b0();
  func_0x0079e8d8();
  auVar2 = func_0x0079e900();
  lVar1 = param_5 << 3;
  if (lVar1 == 0) {
    return;
  }
  _memcpy(auVar2._0_8_,param_4,lVar1);
  _memcpy(auVar2._8_8_,param_4 + param_5 * 8,lVar1);
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)(param_3,param_4 + param_5 * 0x10,lVar1);
  return;
}


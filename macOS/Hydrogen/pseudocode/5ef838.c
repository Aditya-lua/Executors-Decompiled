
void FUN_005ef838(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9,undefined8 param_10)

{
  long *plVar1;
  ulong unaff_x19;
  long *plVar2;
  undefined1 auVar3 [16];
  
  __ZdlPv();
  if ((unaff_x19 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar3 = __Unwind_Resume();
  plVar1 = auVar3._0_8_;
  (**(code **)(*plVar1 + 0x60))(plVar1,param_5,param_6);
  func_0x005ef36c(plVar1,param_8,param_10,0);
  plVar2 = plVar1 + 1;
  (**(code **)(*plVar2 + 0x28))(plVar2,param_7,param_8);
  (**(code **)(plVar1[2] + 0x48))(plVar1 + 2,auVar3._8_8_,param_9,param_10);
                    /* WARNING: Could not recover jumptable at 0x005efa7c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x80))(plVar2,param_3,param_4);
  return;
}


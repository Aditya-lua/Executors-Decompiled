
void FUN_00669264(code *param_1)

{
  undefined8 *unaff_x20;
  long *plVar1;
  
  (*param_1)();
  func_0x005ffccc();
  (**(code **)(*(long *)*unaff_x20 + 0x90))();
  func_0x005ffccc();
  plVar1 = (long *)*unaff_x20;
  func_0x0060bf70(plVar1);
                    /* WARNING: Could not recover jumptable at 0x006692d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x50))(plVar1);
  return;
}


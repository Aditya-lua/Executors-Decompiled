
void FUN_006427bc(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined8 uVar1;
  
  uVar1 = func_0x00604c44();
  func_0x00635108(param_1 + 0xe,param_2);
  (**(code **)(param_1[0xc] + 0x70))(param_1 + 0xc,param_3);
  func_0x005ffccc(param_1 + 0x2e,param_4);
  func_0x005ffccc(param_1 + 0x34,uVar1);
                    /* WARNING: Could not recover jumptable at 0x00642830. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x28))(param_1,param_5);
  return;
}



void FUN_007085d4(long param_1,long *param_2)

{
  int iVar1;
  
  iVar1 = (**(code **)(*param_2 + 0x1f0))(param_2,param_1);
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0070860c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
  return;
}


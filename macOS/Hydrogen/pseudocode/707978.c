
void FUN_00707978(long param_1,long *param_2)

{
  int iVar1;
  
  iVar1 = (**(code **)(*param_2 + 0x168))(param_2,param_1);
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007079ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x38))();
  return;
}


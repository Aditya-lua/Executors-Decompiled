
void FUN_0070629c(undefined8 param_1,long *param_2)

{
  int iVar1;
  long unaff_x20;
  
  iVar1 = (**(code **)(*param_2 + 0x80))(param_2);
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007062cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(unaff_x20 + 0x20))();
  return;
}



void FUN_007085ec(code *param_1)

{
  int iVar1;
  long unaff_x20;
  
  iVar1 = (*param_1)();
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0070860c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(unaff_x20 + 0x20))();
  return;
}


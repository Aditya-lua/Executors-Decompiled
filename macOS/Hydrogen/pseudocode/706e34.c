
void FUN_00706e34(undefined8 *param_1)

{
  long unaff_x20;
  
  (**(code **)*param_1)();
  if (*(undefined8 **)(unaff_x20 + 0x30) == (undefined8 *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00706e60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(unaff_x20 + 0x30))();
  return;
}


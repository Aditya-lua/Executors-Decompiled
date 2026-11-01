
void FUN_006518f0(undefined8 param_1,undefined8 *param_2)

{
  long unaff_x19;
  
  *param_2 = param_1;
  if ((long *)param_2[2] != (long *)0x0) {
    (**(code **)(*(long *)param_2[2] + 8))();
  }
  if (*(long **)(unaff_x19 + 8) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 8) + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


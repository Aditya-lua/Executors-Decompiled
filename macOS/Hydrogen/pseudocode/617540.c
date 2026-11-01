
void FUN_00617540(undefined8 param_1)

{
  undefined8 in_x9;
  undefined8 *unaff_x20;
  
  unaff_x20[-1] = in_x9;
  *unaff_x20 = param_1;
  if ((long *)unaff_x20[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x20[2] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


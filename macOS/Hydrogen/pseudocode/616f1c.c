
void FUN_00616f1c(undefined8 param_1)

{
  undefined8 in_x9;
  undefined8 *unaff_x19;
  
  *unaff_x19 = in_x9;
  unaff_x19[1] = param_1;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


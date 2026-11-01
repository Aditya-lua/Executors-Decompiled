
void FUN_00618ed4(long param_1)

{
  long *unaff_x19;
  
  *unaff_x19 = param_1 + 0x10;
  unaff_x19[1] = param_1 + 0x1b8;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


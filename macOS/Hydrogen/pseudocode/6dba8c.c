
void FUN_006dba8c(long param_1,undefined8 param_2)

{
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  
  *unaff_x19 = param_2;
  unaff_x19[1] = unaff_x20;
  if (param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(param_1);
  return;
}


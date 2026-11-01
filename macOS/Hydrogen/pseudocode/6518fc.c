
void FUN_006518fc(long *param_1)

{
  long unaff_x19;
  
  (**(code **)(*param_1 + 8))();
  if (*(long **)(unaff_x19 + 8) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 8) + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


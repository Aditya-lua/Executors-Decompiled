
void FUN_005f3288(void)

{
  long unaff_x19;
  
  if (*(long **)(unaff_x19 + 0x18) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x18) + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


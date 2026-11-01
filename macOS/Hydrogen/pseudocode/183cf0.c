
void FUN_00183cf0(void)

{
  long unaff_x19;
  
  func_0x00182c7c();
  func_0x00183528(unaff_x19 + 0x498);
  if (*(long *)(unaff_x19 + 0x480) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x488),*(long *)(unaff_x19 + 0x480) << 2,2);
  return;
}


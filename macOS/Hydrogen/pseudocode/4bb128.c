
void FUN_004bb128(void)

{
  long unaff_x19;
  
  func_0x004ce14c(unaff_x19 + 0x18);
  if (*(long *)(unaff_x19 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x20),*(long *)(unaff_x19 + 0x18) * 0x30,8);
  return;
}


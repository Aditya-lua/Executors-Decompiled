
void FUN_00492a88(void)

{
  long unaff_x19;
  
  if (*(long *)(unaff_x19 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x20),*(long *)(unaff_x19 + 0x18) << 4,4);
  return;
}


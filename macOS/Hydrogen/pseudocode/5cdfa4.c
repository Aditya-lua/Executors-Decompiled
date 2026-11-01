
void FUN_005cdfa4(void)

{
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0059ce88(unaff_x21);
    unaff_x21 = unaff_x21 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x10) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x18),*(long *)(unaff_x19 + 0x10) << 6,8);
  return;
}


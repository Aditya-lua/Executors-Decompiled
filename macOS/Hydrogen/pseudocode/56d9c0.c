
void FUN_0056d9c0(void)

{
  long unaff_x19;
  long *unaff_x20;
  long unaff_x23;
  
  for (; unaff_x23 != 0; unaff_x23 = unaff_x23 + -1) {
    if (*unaff_x20 != 0xc) {
      func_0x00553cb8(unaff_x20);
    }
    func_0x00553cb8(unaff_x20 + 8);
    unaff_x20 = unaff_x20 + 0x10;
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 7,8);
  return;
}



void FUN_005974e0(long param_1)

{
  long unaff_x19;
  long unaff_x22;
  
  do {
    func_0x00553cb8(param_1);
    unaff_x22 = unaff_x22 + -1;
    param_1 = param_1 + 0x40;
  } while (unaff_x22 != 0);
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 6,8);
  return;
}


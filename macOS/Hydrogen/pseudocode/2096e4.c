
void FUN_002096e4(long param_1)

{
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  while( true ) {
    func_0x0016af10(param_1);
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    param_1 = unaff_x21;
    unaff_x21 = unaff_x21 + 0x70;
  }
  if (*(long *)(unaff_x19 + 0x68) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)
            (*(undefined8 *)(unaff_x19 + 0x70),*(long *)(unaff_x19 + 0x68) * 0x70,8);
  return;
}


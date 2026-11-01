
void FUN_0016a2b4(long param_1)

{
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x23;
  long unaff_x24;
  
  _memcpy(param_1 + unaff_x24 * in_x9);
  *(long *)(unaff_x20 + 0x10) = unaff_x24 + unaff_x23;
  unaff_x19[3] = unaff_x21;
  if (unaff_x19[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] * 0x18,8);
  return;
}


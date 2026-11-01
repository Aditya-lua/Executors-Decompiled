
void FUN_00519f3c(undefined8 param_1,long param_2)

{
  char in_NG;
  char in_OV;
  long unaff_x19;
  
  if ((in_NG == in_OV) && (param_2 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x58),param_2,1);
    return;
  }
  return;
}


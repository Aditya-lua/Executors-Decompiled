
void FUN_001be624(undefined8 param_1,long param_2)

{
  long unaff_x19;
  
  if (param_2 == -0x8000000000000000 || param_2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 8),param_2,1);
  return;
}


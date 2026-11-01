
void FUN_004e9e68(long param_1,long param_2)

{
  bool in_ZR;
  
  if (in_ZR || param_2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(param_1 + 0x20),param_2,1);
  return;
}



void FUN_005b27b4(undefined8 *param_1,long param_2)

{
  long *unaff_x19;
  long lVar1;
  long unaff_x22;
  
  lVar1 = *(long *)(param_2 + 0x18);
  param_1[1] = &UNK_008b0562;
  param_1[2] = 0x28;
  *param_1 = 0x8000000000000002;
  for (; lVar1 != 0; lVar1 = lVar1 + -1) {
    if (*unaff_x19 != 0xc) {
      func_0x0059ce88(unaff_x19);
    }
    func_0x0059ce88(unaff_x19 + 8);
    unaff_x19 = unaff_x19 + 0x10;
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


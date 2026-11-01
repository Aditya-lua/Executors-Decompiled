
void FUN_00592e70(ulong param_1,long param_2)

{
  undefined8 *unaff_x19;
  long lVar1;
  
  lVar1 = (param_1 >> 3) * 0xf83e0f83e0f83e1 + 1;
  while (lVar1 = lVar1 + -1, lVar1 != 0) {
    func_0x005913d0(param_2);
    param_2 = param_2 + 0x108;
  }
  if (unaff_x19[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19,unaff_x19[2] * 0x108,8);
  return;
}


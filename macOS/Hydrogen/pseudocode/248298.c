
void FUN_00248298(long param_1)

{
  long lVar1;
  ulong in_x9;
  ulong *unaff_x20;
  ulong unaff_x26;
  ulong unaff_x27;
  undefined8 uStack0000000000000008;
  long lStack0000000000000010;
  ulong uStack0000000000000018;
  
  while( true ) {
    uStack0000000000000008 = 0;
    lVar1 = param_1 + in_x9;
    lStack0000000000000010 = param_1;
    uStack0000000000000018 = in_x9;
    func_0x00248644();
    if (unaff_x26 == 0) break;
    in_x9 = unaff_x26;
    if (unaff_x27 <= unaff_x26) {
      in_x9 = unaff_x27;
    }
    unaff_x26 = unaff_x26 - in_x9;
    param_1 = lVar1;
  }
  if ((*unaff_x20 | 0x8000000000000000) == 0x8000000000000000) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}


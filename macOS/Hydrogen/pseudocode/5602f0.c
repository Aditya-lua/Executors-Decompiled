
void FUN_005602f0(ulong param_1)

{
  ulong in_x9;
  long in_x10;
  ulong in_x11;
  undefined8 uVar1;
  undefined8 *unaff_x21;
  long lVar2;
  long unaff_x22;
  long unaff_x23;
  
  if (in_x10 != 0) {
    param_1 = in_x9;
  }
  if (in_x11 < param_1) {
    func_0x007a7510();
  }
  uVar1 = *unaff_x21;
  lVar2 = unaff_x21[2];
  for (; unaff_x22 != unaff_x23; unaff_x22 = unaff_x22 + 8) {
    func_0x00563b2c();
  }
  if (lVar2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,lVar2 << 3,8);
  return;
}



void FUN_00647838(undefined8 param_1,long param_2)

{
  ulong uVar1;
  long unaff_x19;
  
  *(undefined8 *)(unaff_x19 + -0x38) = param_1;
  uVar1 = *(ulong *)(unaff_x19 + 0x38);
  if (*(ulong *)(unaff_x19 + 0x40) <= *(ulong *)(unaff_x19 + 0x38)) {
    uVar1 = *(ulong *)(unaff_x19 + 0x40);
  }
  if (param_2 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(param_2 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  func_0x00043948((undefined8 *)(unaff_x19 + -0x38));
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}



void FUN_0064fe60(long param_1)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  long unaff_x19;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  }
  func_0x00611644();
  lVar1 = *(long *)(unaff_x19 + 0x20);
  uVar2 = *(ulong *)(unaff_x19 + 0x10);
  if (*(ulong *)(unaff_x19 + 0x18) <= *(ulong *)(unaff_x19 + 0x10)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x18);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


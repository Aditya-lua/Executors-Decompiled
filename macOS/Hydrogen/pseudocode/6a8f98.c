
void FUN_006a8f98(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x20;
  undefined8 unaff_x21;
  
  *(undefined8 *)(unaff_x20 + 8) = unaff_x21;
  lVar1 = *(long *)(unaff_x20 + 0x28);
  uVar2 = *(ulong *)(unaff_x20 + 0x18);
  if (*(ulong *)(unaff_x20 + 0x20) <= *(ulong *)(unaff_x20 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x20 + 0x20);
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


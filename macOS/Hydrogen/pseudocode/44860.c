
void FUN_00044860(long param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x20;
  
  *(long *)(unaff_x20 + 0x38) = param_1 + 0x670;
  *(long *)(unaff_x20 + 0x40) = param_1 + 0x720;
  lVar1 = *(long *)(unaff_x20 + 0x88);
  uVar2 = *(ulong *)(unaff_x20 + 0x78);
  if (*(ulong *)(unaff_x20 + 0x80) <= *(ulong *)(unaff_x20 + 0x78)) {
    uVar2 = *(ulong *)(unaff_x20 + 0x80);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  lVar1 = *(long *)(unaff_x20 + 0x68);
  uVar2 = *(ulong *)(unaff_x20 + 0x58);
  if (*(ulong *)(unaff_x20 + 0x60) <= *(ulong *)(unaff_x20 + 0x58)) {
    uVar2 = *(ulong *)(unaff_x20 + 0x60);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined4 *)(lVar1 + -4 + uVar2 * 4) = 0;
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


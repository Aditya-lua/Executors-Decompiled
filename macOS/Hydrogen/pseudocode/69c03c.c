
void FUN_0069c03c(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  *param_2 = param_1;
  param_2[1] = param_1 + 0xb8;
  lVar1 = param_2[9];
  uVar2 = *(ulong *)(unaff_x19 + 0x38);
  if (*(ulong *)(unaff_x19 + 0x40) <= *(ulong *)(unaff_x19 + 0x38)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x40);
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
  lVar1 = *(long *)(unaff_x19 + 0x28);
  uVar2 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x20);
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
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


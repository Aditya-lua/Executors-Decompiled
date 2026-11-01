
void FUN_00638a78(long param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  *(long *)(unaff_x19 + 8) = param_1 + 0xd60;
  lVar1 = *(long *)(unaff_x19 + 0x28);
  uVar2 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x20);
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
  __Unwind_Resume();
  lVar1 = func_0x0001753c();
                    /* WARNING: Could not recover jumptable at 0x00638ac8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar1 + 0x20) + 0x60))();
  return;
}


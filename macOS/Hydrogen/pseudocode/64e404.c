
void FUN_0064e404(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x20;
  
  unaff_x20[8] = &UNK_00a098c0;
  if ((long *)unaff_x20[9] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x20[9] + 8))();
  }
  unaff_x20[-1] = &UNK_00a09150;
  *unaff_x20 = &UNK_00a09280;
  unaff_x20[2] = &UNK_009f5d60;
  lVar1 = unaff_x20[6];
  uVar2 = unaff_x20[4];
  if ((ulong)unaff_x20[5] <= (ulong)unaff_x20[4]) {
    uVar2 = unaff_x20[5];
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


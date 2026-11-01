
void FUN_0065b1b4(long param_1)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_1 + 0x1a8);
  if (*(ulong *)(param_1 + 0x1b0) <= *(ulong *)(param_1 + 0x1a8)) {
    uVar1 = *(ulong *)(param_1 + 0x1b0);
  }
  *(undefined1 *)(param_1 + 0x1a1) = 0;
  if (*(long *)(param_1 + 0x1b8) == param_1 + 0x160 && uVar1 != 0) {
    do {
      *(undefined4 *)(param_1 + 0x15c + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  *(undefined **)(param_1 + 0xf0) = &UNK_009b66c8;
  uVar1 = *(ulong *)(param_1 + 0x148);
  if (*(ulong *)(param_1 + 0x150) <= *(ulong *)(param_1 + 0x148)) {
    uVar1 = *(ulong *)(param_1 + 0x150);
  }
  *(undefined1 *)(param_1 + 0x141) = 0;
  if (*(long *)(param_1 + 0x158) == param_1 + 0x100 && uVar1 != 0) {
    do {
      *(undefined4 *)(param_1 + 0xfc + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  func_0x00088168();
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


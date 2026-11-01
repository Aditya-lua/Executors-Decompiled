
void FUN_00049310(long param_1,long param_2)

{
  bool in_ZR;
  ulong uVar1;
  
  if (!in_ZR) {
    do {
      *(undefined4 *)(param_2 + 0x6c + param_1 * 4) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  uVar1 = *(ulong *)(param_2 + 0x58);
  if (*(ulong *)(param_2 + 0x60) <= *(ulong *)(param_2 + 0x58)) {
    uVar1 = *(ulong *)(param_2 + 0x60);
  }
  if (*(long *)(param_2 + 0x68) == param_2 + 0x10 && uVar1 != 0) {
    do {
      *(undefined4 *)(param_2 + 0xc + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


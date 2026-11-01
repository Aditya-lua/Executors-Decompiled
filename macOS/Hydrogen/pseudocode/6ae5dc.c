
void FUN_006ae5dc(long param_1,long param_2)

{
  bool in_ZR;
  ulong uVar1;
  
  if (!in_ZR) {
    do {
      *(undefined8 *)(param_2 + 0xb0 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  uVar1 = *(ulong *)(param_2 + 0xa0);
  if (*(ulong *)(param_2 + 0xa8) <= *(ulong *)(param_2 + 0xa0)) {
    uVar1 = *(ulong *)(param_2 + 0xa8);
  }
  if (*(long *)(param_2 + 0xb0) == param_2 + 0x18 && uVar1 != 0) {
    do {
      *(undefined8 *)(param_2 + 0x10 + uVar1 * 8) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


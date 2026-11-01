
void FUN_006ae5cc(ulong param_1,long param_2)

{
  ulong uVar1;
  long in_x9;
  long in_x10;
  ulong in_x11;
  
  if (in_x11 <= param_1) {
    param_1 = in_x11;
  }
  if (in_x10 == in_x9 && param_1 != 0) {
    do {
      *(undefined8 *)(param_2 + 0xb0 + param_1 * 8) = 0;
      param_1 = param_1 - 1;
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


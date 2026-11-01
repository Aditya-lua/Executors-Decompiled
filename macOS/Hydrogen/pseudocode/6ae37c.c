
void FUN_006ae37c(ulong param_1,long param_2)

{
  long in_x9;
  long in_x10;
  ulong in_x11;
  
  if (in_x11 <= param_1) {
    param_1 = in_x11;
  }
  if (in_x10 == in_x9 && param_1 != 0) {
    do {
      *(undefined4 *)(param_2 + 0xc + param_1 * 4) = 0;
      param_1 = param_1 - 1;
    } while (param_1 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


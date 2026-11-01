
void FUN_00647cc4(long param_1,long param_2)

{
  if (param_1 != 0) {
    do {
      *(undefined1 *)(param_2 + -1 + param_1) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  func_0x00041f4c();
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


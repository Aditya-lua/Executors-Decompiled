
void FUN_0004968c(long param_1)

{
  undefined1 in_ZR;
  long in_x9;
  
  while (!(bool)in_ZR) {
    *(undefined4 *)(in_x9 + param_1 * 4) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


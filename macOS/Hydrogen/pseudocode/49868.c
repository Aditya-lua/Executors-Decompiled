
void FUN_00049868(long param_1,long param_2)

{
  bool in_ZR;
  
  if (in_ZR && param_1 != 0) {
    do {
      *(undefined8 *)(param_2 + 0x10 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


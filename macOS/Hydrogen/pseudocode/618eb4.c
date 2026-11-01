
void FUN_00618eb4(long param_1,long param_2)

{
  undefined8 *unaff_x19;
  
  if (param_1 != 0) {
    do {
      *(undefined1 *)(param_2 + -1 + param_1) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


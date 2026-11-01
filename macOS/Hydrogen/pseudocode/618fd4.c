
void FUN_00618fd4(long param_1)

{
  long in_x9;
  undefined8 *unaff_x20;
  
  do {
    *(undefined1 *)(in_x9 + param_1) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  unaff_x20[-1] = &UNK_00a0c238;
  *unaff_x20 = &UNK_00a0c3e0;
  if ((long *)unaff_x20[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x20[2] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


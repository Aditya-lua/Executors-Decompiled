
void FUN_00618d8c(undefined8 param_1,undefined8 *param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x20;
  
  *param_2 = param_1;
  lVar1 = param_2[0xc];
  uVar2 = unaff_x20[10];
  if ((ulong)unaff_x20[0xb] <= (ulong)unaff_x20[10]) {
    uVar2 = unaff_x20[0xb];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
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



void FUN_00618e94(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  *param_2 = param_1 + 0x128;
  param_2[1] = param_1 + 0x2d8;
  lVar1 = param_2[0xc];
  uVar2 = unaff_x19[10];
  if ((ulong)unaff_x19[0xb] <= (ulong)unaff_x19[10]) {
    uVar2 = unaff_x19[0xb];
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


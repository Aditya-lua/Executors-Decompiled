
void FUN_006809b8(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_009f8128;
  param_1[1] = &UNK_009f82d8;
  lVar1 = param_1[0xc];
  uVar2 = param_1[10];
  if ((ulong)param_1[0xb] <= (ulong)param_1[10]) {
    uVar2 = param_1[0xb];
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
  *param_1 = &UNK_00a0c238;
  param_1[1] = &UNK_00a0c3e0;
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(param_1);
  return;
}


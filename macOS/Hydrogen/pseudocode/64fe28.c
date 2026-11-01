
void FUN_0064fe28(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  *param_1 = &UNK_00a09a70;
  lVar1 = param_1[8];
  uVar2 = param_1[6];
  if ((ulong)param_1[7] <= (ulong)param_1[6]) {
    uVar2 = param_1[7];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  lVar1 = param_1[4];
  uVar2 = param_1[2];
  if ((ulong)param_1[3] <= (ulong)param_1[2]) {
    uVar2 = param_1[3];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(param_1);
  return;
}


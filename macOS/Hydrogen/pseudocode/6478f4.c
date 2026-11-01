
void FUN_006478f4(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  
  param_1[-0xb] = &UNK_009f91b8;
  param_1[-5] = &UNK_009f9250;
  *param_1 = &UNK_009f92d0;
  lVar1 = param_1[4];
  param_1[-0xc] = &UNK_009f9068;
  uVar2 = param_1[2];
  if ((ulong)param_1[3] <= (ulong)param_1[2]) {
    uVar2 = param_1[3];
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
  func_0x00043948(param_1 + -0xc);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


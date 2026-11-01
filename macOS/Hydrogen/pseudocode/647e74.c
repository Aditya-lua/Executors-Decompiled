
bool FUN_00647e74(long param_1)

{
  int iVar1;
  undefined *apuStack_80 [2];
  ulong uStack_70;
  ulong uStack_68;
  long lStack_60;
  undefined *apuStack_50 [2];
  ulong uStack_40;
  ulong uStack_38;
  long lStack_30;
  
  (**(code **)(*(long *)(param_1 + 8) + 0xb8))(apuStack_50);
  func_0x005fe1e8(apuStack_80,2);
  iVar1 = func_0x00609ec8(apuStack_50,apuStack_80);
  apuStack_80[0] = &UNK_009f5d60;
  if (uStack_68 <= uStack_70) {
    uStack_70 = uStack_68;
  }
  if (lStack_60 != 0) {
    if (uStack_70 != 0) {
      do {
        *(undefined8 *)(lStack_60 + -8 + uStack_70 * 8) = 0;
        uStack_70 = uStack_70 - 1;
      } while (uStack_70 != 0);
    }
    func_0x00611644();
  }
  apuStack_50[0] = &UNK_009f5d60;
  if (uStack_38 <= uStack_40) {
    uStack_40 = uStack_38;
  }
  if (lStack_30 != 0) {
    if (uStack_40 != 0) {
      do {
        *(undefined8 *)(lStack_30 + -8 + uStack_40 * 8) = 0;
        uStack_40 = uStack_40 - 1;
      } while (uStack_40 != 0);
    }
    func_0x00611644();
  }
  return iVar1 == 0;
}


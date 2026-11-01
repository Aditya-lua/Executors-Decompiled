
void FUN_00621e70(long param_1)

{
  long lVar1;
  undefined1 in_ZR;
  ulong uVar2;
  long in_x9;
  long unaff_x19;
  undefined8 unaff_x20;
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  *(undefined8 *)(unaff_x19 + 8) = unaff_x20;
  lVar1 = *(long *)(unaff_x19 + 0x28);
  uVar2 = *(ulong *)(unaff_x19 + 0x18);
  if (*(ulong *)(unaff_x19 + 0x20) <= *(ulong *)(unaff_x19 + 0x18)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x20);
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
  return;
}


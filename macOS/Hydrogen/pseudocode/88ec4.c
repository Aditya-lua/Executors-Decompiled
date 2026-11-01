
void FUN_00088ec4(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  
  *(long *)(param_2 + 0x48) = param_1 + 0xd60;
  lVar1 = *(long *)(param_2 + 0x68);
  uVar2 = *(ulong *)(unaff_x19 + 0x58);
  if (*(ulong *)(unaff_x19 + 0x60) <= *(ulong *)(unaff_x19 + 0x58)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x60);
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
  *(long *)(unaff_x19 + 0x18) = param_1 + 0xd60;
  lVar1 = *(long *)(unaff_x19 + 0x38);
  uVar2 = *(ulong *)(unaff_x19 + 0x28);
  if (*(ulong *)(unaff_x19 + 0x30) <= *(ulong *)(unaff_x19 + 0x28)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x30);
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


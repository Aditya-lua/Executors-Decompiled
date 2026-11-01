
void FUN_00655110(ulong param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  undefined8 *unaff_x19;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  *unaff_x19 = &UNK_009faf38;
  lVar1 = unaff_x19[0x11];
  uVar2 = unaff_x19[0xf];
  if ((ulong)unaff_x19[0x10] <= (ulong)unaff_x19[0xf]) {
    uVar2 = unaff_x19[0x10];
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
  unaff_x19[3] = &UNK_009fae50;
  lVar1 = unaff_x19[0xd];
  uVar2 = unaff_x19[0xb];
  if ((ulong)unaff_x19[0xc] <= (ulong)unaff_x19[0xb]) {
    uVar2 = unaff_x19[0xc];
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
  unaff_x19[3] = &UNK_00a00d18;
  lVar1 = unaff_x19[9];
  uVar2 = unaff_x19[7];
  if ((ulong)unaff_x19[8] <= (ulong)unaff_x19[7]) {
    uVar2 = unaff_x19[8];
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


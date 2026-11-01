
void FUN_00647c3c(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  *param_2 = param_1 + 0x298;
  param_2[1] = param_1 + 0x378;
  lVar1 = param_2[0xe];
  uVar2 = unaff_x19[0xc];
  if ((ulong)unaff_x19[0xd] <= (ulong)unaff_x19[0xc]) {
    uVar2 = unaff_x19[0xd];
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
  *unaff_x19 = &UNK_00a13118;
  unaff_x19[1] = &UNK_00a131e8;
  lVar1 = unaff_x19[10];
  uVar2 = unaff_x19[8];
  if ((ulong)unaff_x19[9] <= (ulong)unaff_x19[8]) {
    uVar2 = unaff_x19[9];
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
  *unaff_x19 = &UNK_00a12ae8;
  unaff_x19[1] = &UNK_00a12b98;
  lVar1 = unaff_x19[6];
  uVar2 = unaff_x19[4];
  if ((ulong)unaff_x19[5] <= (ulong)unaff_x19[4]) {
    uVar2 = unaff_x19[5];
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
  return;
}


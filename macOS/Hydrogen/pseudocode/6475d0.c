
void FUN_006475d0(undefined8 *param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  *param_1 = &UNK_009f9068;
  param_1[1] = &UNK_009f91b8;
  param_1[7] = &UNK_009f9250;
  param_1[0xc] = &UNK_009f92d0;
  lVar1 = param_1[0x10];
  uVar2 = unaff_x19[0xe];
  if ((ulong)unaff_x19[0xf] <= (ulong)unaff_x19[0xe]) {
    uVar2 = unaff_x19[0xf];
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
  *unaff_x19 = &UNK_00a12e98;
  unaff_x19[1] = &UNK_00a12fa0;
  unaff_x19[7] = &UNK_00a13038;
  lVar1 = unaff_x19[0xb];
  uVar2 = unaff_x19[9];
  if ((ulong)unaff_x19[10] <= (ulong)unaff_x19[9]) {
    uVar2 = unaff_x19[10];
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


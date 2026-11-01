
undefined8 * FUN_00647ac8(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 in_x9;
  undefined8 *unaff_x19;
  undefined8 *puVar3;
  
  lVar1 = *(long *)(param_1 + 0x68);
  puVar3 = unaff_x19 + -1;
  *puVar3 = in_x9;
  uVar2 = unaff_x19[0xb];
  if ((ulong)unaff_x19[0xc] <= (ulong)unaff_x19[0xb]) {
    uVar2 = unaff_x19[0xc];
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
  *puVar3 = &UNK_00a13118;
  *unaff_x19 = &UNK_00a131e8;
  lVar1 = unaff_x19[9];
  uVar2 = unaff_x19[7];
  if ((ulong)unaff_x19[8] <= (ulong)unaff_x19[7]) {
    uVar2 = unaff_x19[8];
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
  *puVar3 = &UNK_00a12ae8;
  *unaff_x19 = &UNK_00a12b98;
  lVar1 = unaff_x19[5];
  uVar2 = unaff_x19[3];
  if ((ulong)unaff_x19[4] <= (ulong)unaff_x19[3]) {
    uVar2 = unaff_x19[4];
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
  return puVar3;
}



/* WARNING: Possible PIC construction at 0x00669d70: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00669d74) */

void FUN_00669ca0(void)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  
  uVar1 = __Unwind_Resume();
  *(undefined **)(unaff_x20 + 0x38) = &UNK_009f5d60;
  lVar2 = *(long *)(unaff_x20 + 0x58);
  uVar3 = *(ulong *)(unaff_x20 + 0x48);
  if (*(ulong *)(unaff_x20 + 0x50) <= *(ulong *)(unaff_x20 + 0x48)) {
    uVar3 = *(ulong *)(unaff_x20 + 0x50);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x20 + 8) = &UNK_009f5d60;
  lVar2 = *(long *)(unaff_x20 + 0x28);
  uVar3 = *(ulong *)(unaff_x20 + 0x18);
  if (*(ulong *)(unaff_x20 + 0x20) <= *(ulong *)(unaff_x20 + 0x18)) {
    uVar3 = *(ulong *)(unaff_x20 + 0x20);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  func_0x0001753c();
  func_0x00087574();
  func_0x00087574();
  func_0x00087574(in_stack_00000000);
  func_0x00087574(in_stack_00000008);
  func_0x00087574();
  func_0x00087574();
  unaff_x19[0xc] = &UNK_009f5d60;
  lVar2 = unaff_x19[0x10];
  uVar3 = unaff_x19[0xe];
  if ((ulong)unaff_x19[0xf] <= (ulong)unaff_x19[0xe]) {
    uVar3 = unaff_x19[0xf];
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  unaff_x19[6] = &UNK_009f5d60;
  lVar2 = unaff_x19[10];
  uVar3 = unaff_x19[8];
  if ((ulong)unaff_x19[9] <= (ulong)unaff_x19[8]) {
    uVar3 = unaff_x19[9];
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *unaff_x19 = &UNK_009f5d60;
  lVar2 = unaff_x19[4];
  uVar3 = unaff_x19[2];
  if ((ulong)unaff_x19[3] <= (ulong)unaff_x19[2]) {
    uVar3 = unaff_x19[3];
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return;
}


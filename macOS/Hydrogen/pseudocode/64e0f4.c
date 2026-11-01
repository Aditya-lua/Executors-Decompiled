
void FUN_0064e0f4(long param_1)

{
  long lVar1;
  ulong uVar2;
  long *unaff_x19;
  
  unaff_x19[-1] = param_1 + 0x150;
  *unaff_x19 = param_1 + 0x280;
  unaff_x19[2] = (long)&UNK_009f5d60;
  lVar1 = unaff_x19[6];
  uVar2 = unaff_x19[4];
  if ((ulong)unaff_x19[5] <= (ulong)unaff_x19[4]) {
    uVar2 = unaff_x19[5];
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



void FUN_004b87d0(long param_1)

{
  undefined1 uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  lStack0000000000000018 = 0;
  lStack0000000000000010 = param_1;
  do {
    lVar2 = lStack0000000000000018;
    if (unaff_x21 == lStack0000000000000018) {
      unaff_x19[2] = unaff_x20 + lStack0000000000000018;
      unaff_x19[3] = 0;
      *(undefined1 *)(unaff_x19 + 4) = 0x17;
      unaff_x19[1] = 1;
      *unaff_x19 = 1;
      if (unaff_x22 == 0) {
        return;
      }
      func_0x00187bd4(lStack0000000000000010,unaff_x22,1);
      return;
    }
    uVar1 = *(undefined1 *)(unaff_x20 + lStack0000000000000018);
    if (lStack0000000000000018 == unaff_x22) {
      func_0x00458a18((long)register0x00000008 + 8,&UNK_009e5610);
    }
    *(undefined1 *)(lStack0000000000000010 + lVar2) = uVar1;
    lStack0000000000000018 = lVar2 + 1;
  } while (unaff_x23 != lStack0000000000000018);
  unaff_x19[4] = lStack0000000000000010;
  unaff_x19[3] = unaff_x22;
  unaff_x19[5] = lStack0000000000000018;
  unaff_x19[1] = unaff_x20 + lStack0000000000000018;
  unaff_x19[2] = unaff_x21 - unaff_x23;
  *unaff_x19 = 0;
  return;
}


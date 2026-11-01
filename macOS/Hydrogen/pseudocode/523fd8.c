
void FUN_00523fd8(void)

{
  long lVar1;
  undefined *puVar2;
  long *unaff_x19;
  long unaff_x20;
  long lVar3;
  undefined1 auVar4 [16];
  
  if (unaff_x20 == 0) {
    lVar3 = 1;
    _memcpy(1);
    lVar1 = *unaff_x19;
  }
  else {
    lVar3 = func_0x00187bd0();
    if (lVar3 == 0) {
      puVar2 = &UNK_009e95a8;
      auVar4 = func_0x007a1f00(1);
      lVar3 = (long)puVar2 - auVar4._8_8_;
      if (lVar3 != 0) {
        lVar1 = auVar4._0_8_ + auVar4._8_8_ * 0x28;
        do {
          func_0x00519b74(lVar1);
          lVar1 = lVar1 + 0x28;
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
      }
      return;
    }
    _memcpy();
    lVar1 = *unaff_x19;
  }
  if (lVar1 != 0) {
    func_0x00187bd4();
  }
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = lVar3;
  unaff_x19[2] = unaff_x20;
  func_0x007a5594();
  lVar3 = unaff_x19[2];
  *(undefined1 *)(unaff_x19[1] + lVar3) = 10;
  unaff_x19[2] = lVar3 + 1;
  return;
}


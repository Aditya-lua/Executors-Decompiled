
void FUN_00401b90(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lVar3;
  
  lVar3 = 0;
  if (*(long *)(unaff_x20 + 0xb0) != 0) {
    lVar3 = 0;
    lVar2 = *(long *)(unaff_x20 + 0xb0);
    do {
      unaff_x20 = lVar2;
      lVar3 = lVar3 + 1;
      func_0x00187bd4();
      lVar2 = *(long *)(unaff_x20 + 0xb0);
    } while (*(long *)(unaff_x20 + 0xb0) != 0);
  }
  uVar1 = 0x118;
  if (lVar3 != 0) {
    uVar1 = 0x178;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}


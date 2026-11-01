
void FUN_0022a584(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  undefined8 *puVar3;
  
  if ((((*(byte *)(unaff_x19 + 0x1c) & 1) == 0) &&
      (lVar1 = unaff_x19[0x1d], lVar1 != -0x8000000000000000)) && (lVar1 != 0)) {
    func_0x00187bd4(unaff_x19[0x1e],lVar1,1);
  }
  func_0x00221a70(unaff_x19 + 0x15);
  lVar1 = unaff_x19[2];
  if (lVar1 != 0) {
    puVar3 = (undefined8 *)(unaff_x19[1] + 8);
    do {
      lVar2 = puVar3[-1];
      if (lVar2 != -0x8000000000000000 && lVar2 != 0) {
        func_0x00187bd4(*puVar3,lVar2,1);
      }
      puVar3 = puVar3 + 3;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(unaff_x19[1],*unaff_x19 * 0x18,8);
  }
  func_0x00187bd4();
  return;
}


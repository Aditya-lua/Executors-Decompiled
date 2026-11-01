
void FUN_0051b374(undefined8 param_1)

{
  long *unaff_x19;
  long lVar1;
  long unaff_x21;
  undefined8 *puVar2;
  ulong unaff_x23;
  long unaff_x24;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000058;
  
  uStack0000000000000058 = *(undefined8 *)(unaff_x21 + 0x10);
  uStack0000000000000040 = 4;
  uStack0000000000000048 = param_1;
  func_0x0051b078();
  if ((unaff_x23 & 1) != 0) {
    lVar1 = unaff_x19[1];
    if (unaff_x24 != 0) {
      puVar2 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar2[-1] != 0) {
          func_0x00187bd4(*puVar2,puVar2[-1],1);
        }
        puVar2 = puVar2 + 3;
        unaff_x24 = unaff_x24 + -1;
      } while (unaff_x24 != 0);
    }
    if (*unaff_x19 != 0) {
      func_0x00187bd4(lVar1,*unaff_x19 * 0x18,8);
    }
  }
  return;
}


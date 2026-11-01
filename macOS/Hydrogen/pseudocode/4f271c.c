
void FUN_004f271c(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  undefined1 uStack0000000000000090;
  
  uVar1 = func_0x0051b178();
  *unaff_x23 = 0x8000000000000009;
  unaff_x23[1] = uVar1;
  func_0x0016b01c(&uStack0000000000000090);
  if (unaff_x24 == 0) {
    lVar2 = unaff_x25[2];
    if (lVar2 != 0) {
      puVar3 = (undefined8 *)(unaff_x25[1] + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (*unaff_x25 != 0) {
      func_0x00187bd4(unaff_x25[1],*unaff_x25 * 0x18,8);
    }
  }
  return;
}


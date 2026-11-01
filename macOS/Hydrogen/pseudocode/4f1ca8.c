
void FUN_004f1ca8(void)

{
  long lVar1;
  undefined8 *unaff_x19;
  undefined8 *puVar2;
  long unaff_x21;
  undefined8 *unaff_x23;
  long *unaff_x25;
  long unaff_x29;
  undefined8 uVar3;
  
  func_0x004eacb4(unaff_x29 + -0xb0);
  uVar3 = *(undefined8 *)(unaff_x29 + -0xb0);
  unaff_x19[1] = *(undefined8 *)(unaff_x29 + -0xa8);
  *unaff_x19 = uVar3;
  unaff_x19[2] = *(undefined8 *)(unaff_x29 + -0xa0);
  *(undefined8 *)(unaff_x29 + -0x80) = 1;
  *(undefined8 **)(unaff_x29 + -0x78) = unaff_x19;
  *(undefined8 *)(unaff_x29 + -0x70) = 1;
  func_0x005172cc();
  func_0x004f2f88();
  lVar1 = func_0x004f1368();
  if (lVar1 == 0) {
    *unaff_x23 = 0x8000000000000002;
    if (unaff_x21 != 0) {
      return;
    }
    lVar1 = unaff_x25[2];
    if (lVar1 != 0) {
      puVar2 = (undefined8 *)(unaff_x25[1] + 8);
      do {
        if (puVar2[-1] != 0) {
          func_0x00187bd4(*puVar2,puVar2[-1],1);
        }
        puVar2 = puVar2 + 3;
        lVar1 = lVar1 + -1;
      } while (lVar1 != 0);
    }
  }
  else {
    *unaff_x23 = 0x8000000000000009;
    unaff_x23[1] = lVar1;
    if (unaff_x21 != 0) {
      return;
    }
    lVar1 = unaff_x25[2];
    if (lVar1 != 0) {
      puVar2 = (undefined8 *)(unaff_x25[1] + 8);
      do {
        if (puVar2[-1] != 0) {
          func_0x00187bd4(*puVar2,puVar2[-1],1);
        }
        puVar2 = puVar2 + 3;
        lVar1 = lVar1 + -1;
      } while (lVar1 != 0);
    }
  }
  if (*unaff_x25 != 0) {
    func_0x00187bd4(unaff_x25[1],*unaff_x25 * 0x18,8);
  }
  return;
}


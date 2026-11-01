
undefined8 FUN_00783534(void)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar2;
  uint *unaff_x27;
  
  lVar1 = func_0x00734ac8();
  if (lVar1 < 0) {
    func_0x00782dc4(*unaff_x20,unaff_x20[1],*(undefined8 *)(unaff_x19 + 0xb18),
                    *(undefined8 *)(unaff_x19 + 0xb20));
    func_0x0073c9e4();
    uVar2 = 0x1c;
  }
  else if ((*(byte *)(unaff_x19 + 0x134) & 0x3f) == 0) {
    uVar2 = 0;
    *unaff_x27 = *unaff_x27 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}


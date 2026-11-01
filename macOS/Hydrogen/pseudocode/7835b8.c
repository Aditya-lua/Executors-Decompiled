
/* WARNING: Removing unreachable block (ram,0x007830f0) */
/* WARNING: Removing unreachable block (ram,0x00783100) */

undefined8 FUN_007835b8(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint *unaff_x27;
  
  func_0x0076bd1c();
  if (((byte)*unaff_x27 >> 1 & 1) == 0) {
    uVar2 = func_0x007718c0();
    if (((((uVar2 & 1) != 0) || ((*(byte *)(unaff_x19 + 0x134) >> 6 & 1) != 0)) &&
        (uVar2 = func_0x00771930(), (uVar2 & 1) == 0)) &&
       (uVar3 = func_0x00771818(), (int)uVar3 != 0)) {
      return uVar3;
    }
    iVar1 = func_0x0077011c();
    if (iVar1 != 0) {
      return 0x2a;
    }
    uVar3 = func_0x0077e1cc();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    if (*(int *)(unaff_x19 + 0x134) == 0) {
      if ((((*(byte *)((long)unaff_x27 + 2) >> 1 & 1) == 0) && (*(long *)(unaff_x19 + 0xe8) != -1))
         && ((*(long *)(unaff_x19 + 0xe8) != *(long *)(unaff_x19 + 0xf8) &&
             (*(long *)(unaff_x19 + 0x1a8) == 0)))) {
        func_0x0073c9e4();
        return 0x12;
      }
      iVar1 = func_0x0077011c();
      if (iVar1 != 0) {
        return 0x2a;
      }
    }
    else {
      lVar4 = func_0x00734ac8();
      if (lVar4 < 0) {
        func_0x00782dc4(*unaff_x20,unaff_x20[1],*(undefined8 *)(unaff_x19 + 0xb18),
                        *(undefined8 *)(unaff_x19 + 0xb20));
        func_0x0073c9e4();
        return 0x1c;
      }
    }
    if ((*(byte *)(unaff_x19 + 0x134) & 0x3f) == 0) {
      *unaff_x27 = *unaff_x27 | 2;
      return 0;
    }
  }
  return 0;
}


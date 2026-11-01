
undefined8 thunk_FUN_002820cc(void)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined1 unaff_w26;
  int unaff_w27;
  
  iVar2 = func_0x002821cc();
  if (iVar2 != 0) {
    _memmove(*unaff_x20 + unaff_x25 + (ulong)(unaff_w27 - 1));
    lVar4 = *(long *)(unaff_x21 + 0x18);
    lVar6 = *unaff_x20;
    *(long *)(unaff_x21 + 0x18) = lVar4 + 1;
    *(undefined1 *)(lVar6 + lVar4) = unaff_w26;
    uVar1 = unaff_w27 - 1;
    *(char *)(unaff_x21 + 0x20) = (char)uVar1;
    if ((uVar1 & 0xff) != 0) {
      uVar5 = ((ulong)uVar1 & 0xff) - 1;
      do {
        *(char *)(*unaff_x20 + *(long *)(unaff_x21 + 0x18) + uVar5) = (char)unaff_x22;
        unaff_x22 = unaff_x22 >> 8;
        uVar5 = uVar5 - 1;
      } while (uVar5 < *(byte *)(unaff_x21 + 0x20));
    }
    if (unaff_x22 == 0) {
      *(undefined8 *)(unaff_x21 + 0x10) = 0;
      uVar3 = 1;
      goto LAB_00282184;
    }
    func_0x0028f83c(0xe,0,0x45,"/aws-lc/crypto/bytestring/cbb.c",0x104);
  }
  if (*(char *)(unaff_x19 + 1) != '\0') {
    unaff_x24 = (undefined8 *)*unaff_x24;
  }
  uVar3 = 0;
  *(byte *)(unaff_x24 + 3) = *(byte *)(unaff_x24 + 3) | 2;
LAB_00282184:
  *unaff_x19 = 0;
  return uVar3;
}


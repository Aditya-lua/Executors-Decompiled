
uint FUN_006eb58c(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long unaff_x19;
  uint uVar5;
  int iVar6;
  
  lVar2 = func_0x006e3658();
  if (lVar2 == 0) {
    func_0x006e6498();
LAB_006eb680:
    uVar3 = func_0x006e644c();
    func_0x006e69bc(uVar3,1,7);
    uVar4 = func_0x006e1a48(uVar3);
    func_0x006e1998(uVar3,uVar4,1);
    return 1;
  }
  if (*(byte *)(lVar2 + 3) == 6) {
    if (*(long *)(*(long *)(unaff_x19 + 0x18) + 0x510) != 0) {
      func_0x007005c4();
    }
    if (*(ushort *)(unaff_x19 + 0x50) < *(ushort *)(unaff_x19 + 0x52)) {
      lVar2 = func_0x006eceb0();
      return (uint)(*(ushort *)(lVar2 + 0x52) <= *(ushort *)(lVar2 + 0x50));
    }
    *(undefined1 *)(unaff_x19 + 3) = 6;
    return 0xffffffff;
  }
  if (*(byte *)(lVar2 + 3) < 2) {
    iVar6 = (int)((ulong)(*(long *)(lVar2 + 8) - *(long *)(lVar2 + 0x10)) >> 4);
    uVar5 = iVar6 + 1;
    iVar1 = func_0x006e17a8();
    if (iVar1 == 0) goto LAB_006eb680;
    func_0x006e190c(lVar2);
    if (-1 < iVar6) {
      func_0x006e3c24();
      goto code_r0x006eb650;
    }
  }
  else {
    func_0x006e188c();
    func_0x006e190c(lVar2);
  }
  func_0x006e3c24();
  uVar5 = 2;
code_r0x006eb650:
  func_0x006e1ee0();
  return uVar5;
}


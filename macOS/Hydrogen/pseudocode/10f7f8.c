
bool FUN_0010f7f8(void)

{
  bool bVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  long unaff_x19;
  uint *unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  undefined4 *unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined8 uStack0000000000000008;
  
  for (; unaff_x25 != unaff_x22; unaff_x22 = unaff_x22 + 1) {
    lVar5 = *(long *)(unaff_x19 + unaff_x22 * 8);
    lVar2 = unaff_x26;
    if (lVar5 != 0) {
      lVar2 = lVar5;
    }
    func_0x000d505c(unaff_x22);
    uVar3 = *unaff_x20;
    uStack0000000000000008 = 0;
    iVar4 = func_0x0010f27c(lVar2,unaff_x22 == uVar3,0,&uStack0000000000000008);
    if ((iVar4 != 0) && (unaff_x22 != *unaff_x20)) {
      *unaff_x20 = (uint)unaff_x22;
      unaff_x23 = 1;
    }
    if (unaff_x22 == uVar3) {
      func_0x000d4958();
    }
    func_0x000d53d0();
  }
  func_0x000d9c4c();
  bVar1 = (unaff_x23 & 1) != 0;
  if (bVar1) {
    func_0x000c255c(*unaff_x24);
  }
  return bVar1;
}


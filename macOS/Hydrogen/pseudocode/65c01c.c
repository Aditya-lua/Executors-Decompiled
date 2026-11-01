
void FUN_0065c01c(void)

{
  long lVar1;
  int iVar2;
  undefined1 in_w8;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000028;
  undefined1 in_stack_00000048;
  
  while( true ) {
    *(undefined1 *)(unaff_x24 + 0x48) = in_w8;
    lVar1 = unaff_x20 + unaff_x25 * 0x80 + 0x50;
    func_0x005ffccc(unaff_x24 + 0x50,lVar1);
    if (unaff_x25 == 0) break;
    unaff_x25 = unaff_x25 - 1 >> 1;
    iVar2 = func_0x00609ec8(unaff_x20 + unaff_x25 * 0x80 + 0x50);
    if (-1 < iVar2) break;
    lVar1 = unaff_x20 + unaff_x25 * 0x80;
    unaff_x21 = lVar1 + 8;
    func_0x00677180(unaff_x26 + 8,unaff_x21);
    unaff_x22 = lVar1 + 0x28;
    func_0x00677180(unaff_x26 + 0x28,unaff_x22);
    in_w8 = *(undefined1 *)(lVar1 + 0x48);
    unaff_x24 = unaff_x26;
    unaff_x26 = lVar1;
  }
  func_0x00677180(unaff_x21,&uStack0000000000000008);
  func_0x00677180(unaff_x22,&uStack0000000000000028);
  *(undefined1 *)(unaff_x26 + 0x48) = in_stack_00000048;
  func_0x005ffccc(lVar1);
  func_0x00650db0();
  return;
}


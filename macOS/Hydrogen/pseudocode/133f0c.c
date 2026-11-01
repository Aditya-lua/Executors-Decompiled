
void FUN_00133f0c(void)

{
  long lVar1;
  int iVar2;
  byte bVar3;
  undefined4 in_w8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined4 *unaff_x23;
  undefined8 *puStack0000000000000000;
  long lStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  *(undefined4 *)(unaff_x19 + 4) = in_w8;
  puStack0000000000000000 = (undefined8 *)((long)&uStack0000000000000028 + 4);
  lStack0000000000000008 = (long)&uStack0000000000000020 + 4;
  iVar2 = _sscanf();
  if (iVar2 == 1) {
    unaff_x20 = func_0x000b8738(unaff_x20 + uStack0000000000000020._4_4_);
    *unaff_x23 = uStack0000000000000028._4_4_;
    lVar1 = unaff_x21 + unaff_x22 * 0x10;
    *(byte *)(lVar1 + 0xe) = *(byte *)(lVar1 + 0xe) | 8;
    *(uint *)(unaff_x19 + 4) = *(uint *)(unaff_x19 + 4) | 1;
  }
  puStack0000000000000000 = &uStack0000000000000020;
  lStack0000000000000008 = (long)&uStack0000000000000020 + 4;
  iVar2 = _sscanf(unaff_x20,"Visible=%d%n");
  if (iVar2 == 1) {
    unaff_x20 = func_0x000b8738(unaff_x20 + uStack0000000000000020._4_4_);
    lVar1 = unaff_x21 + unaff_x22 * 0x10;
    *(byte *)(lVar1 + 0xe) =
         (byte)(((uint)uStack0000000000000020 & 1) << 2) | *(byte *)(lVar1 + 0xe) & 0xfb;
    *(uint *)(unaff_x19 + 4) = *(uint *)(unaff_x19 + 4) | 4;
  }
  lStack0000000000000008 = (long)&uStack0000000000000020 + 4;
  puStack0000000000000000 = &uStack0000000000000020;
  iVar2 = _sscanf(unaff_x20,"Order=%d%n");
  if (iVar2 == 1) {
    unaff_x20 = func_0x000b8738(unaff_x20 + uStack0000000000000020._4_4_);
    *(short *)(unaff_x21 + unaff_x22 * 0x10 + 10) = (short)(uint)uStack0000000000000020;
    *(uint *)(unaff_x19 + 4) = *(uint *)(unaff_x19 + 4) | 2;
  }
  lStack0000000000000008 = (long)&uStack0000000000000018 + 7;
  puStack0000000000000000 = &uStack0000000000000020;
  iVar2 = _sscanf(unaff_x20,"Sort=%d%c%n");
  if (iVar2 == 2) {
    func_0x000b8738(unaff_x20 + uStack0000000000000020._4_4_);
    lVar1 = unaff_x21 + unaff_x22 * 0x10;
    *(short *)(lVar1 + 0xc) = (short)(uint)uStack0000000000000020;
    bVar3 = 1;
    if (uStack0000000000000018._7_1_ == '^') {
      bVar3 = 2;
    }
    *(byte *)(lVar1 + 0xe) = *(byte *)(lVar1 + 0xe) & 0xfc | bVar3;
    *(uint *)(unaff_x19 + 4) = *(uint *)(unaff_x19 + 4) | 8;
  }
  return;
}


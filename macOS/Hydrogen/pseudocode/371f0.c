
void FUN_000371f0(void)

{
  ulong uVar1;
  long unaff_x19;
  long *unaff_x20;
  uint unaff_w24;
  long lStack0000000000000000;
  long lStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined7 uStack0000000000000019;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000021;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  
  *(uint *)(unaff_x19 + 0x18) = unaff_w24 | 0x80;
  uStack0000000000000030 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000048 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000058 = 0;
  uStack0000000000000060 = 0;
  uStack0000000000000068 = 0;
  lStack0000000000000008 = 0;
  lStack0000000000000000 = 0;
  uStack0000000000000018 = 0;
  uStack0000000000000010 = 0;
  uStack0000000000000021 = 0;
  uStack0000000000000019 = 0;
  uStack0000000000000020 = 0;
  uVar1 = func_0x00034500(*(undefined8 *)(unaff_x19 + 0x10));
  func_0x0003732c();
  if (lStack0000000000000000 != 0) {
    lStack0000000000000008 = lStack0000000000000000;
    __ZdlPv();
  }
  if ((uVar1 & 1) == 0) {
    if (*unaff_x20 != 0) {
      *(long *)(unaff_x19 + 0x28) = *unaff_x20;
      __ZdlPv();
      *unaff_x20 = 0;
      unaff_x20[1] = 0;
      unaff_x20[2] = 0;
    }
    *(undefined1 *)(unaff_x19 + 0x80) = 0;
    unaff_x20[1] = 0;
    *unaff_x20 = 0;
    unaff_x20[3] = 0;
    unaff_x20[2] = 0;
    *(undefined8 *)((long)unaff_x20 + 0x21) = 0;
    *(undefined8 *)((long)unaff_x20 + 0x19) = 0;
    *(undefined8 *)(unaff_x19 + 0x50) = 0;
    *(undefined8 *)(unaff_x19 + 0x58) = 0;
    *(undefined1 *)(unaff_x19 + 0x60) = 0;
    *(undefined8 *)(unaff_x19 + 0x68) = 0;
    *(undefined8 *)(unaff_x19 + 0x70) = 0;
    *(undefined1 *)(unaff_x19 + 0x78) = 0;
    *(undefined8 *)(unaff_x19 + 0x88) = 0;
  }
  return;
}


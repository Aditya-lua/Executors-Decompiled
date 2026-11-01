
void FUN_006f0588(long param_1)

{
  uint uVar1;
  byte in_w9;
  byte in_w10;
  long unaff_x19;
  long unaff_x20;
  uint uStack0000000000000000;
  
  *(byte *)(param_1 + 1) = in_w9 & 0xfc | in_w10 & 3;
  uStack0000000000000000 = *(uint *)(*(long *)(unaff_x19 + 0x18) + 0xc);
  uVar1 = uStack0000000000000000 + 3;
  if (-1 < (int)uStack0000000000000000) {
    uVar1 = uStack0000000000000000;
  }
  if (0x40 < (int)uStack0000000000000000 &&
      *(uint *)(*(long *)(unaff_x19 + 0x18) + 8) < (uint)((int)uVar1 >> 2)) {
    uStack0000000000000000 = uStack0000000000000000 >> 1;
    (*pcRam0000000000a40208)();
  }
  *(undefined1 *)(unaff_x20 + 0x21) = 0;
  return;
}


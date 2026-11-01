
bool FUN_0044c1dc(void)

{
  uint uVar1;
  uint in_w8;
  uint uVar2;
  uint in_w9;
  
  uVar1 = in_w9 & 0xffff | 0x66740000;
  uVar2 = (uint)(uVar1 < in_w8);
  if (in_w8 < uVar1) {
    uVar2 = 0xffffffff;
  }
  return uVar2 == 0;
}


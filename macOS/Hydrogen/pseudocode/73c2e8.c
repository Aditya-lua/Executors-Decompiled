
void FUN_0073c2e8(void)

{
  uint uVar1;
  ulong uVar2;
  undefined8 uVar3;
  uint in_w9;
  undefined8 *unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  
  uVar2 = (ulong)(in_w9 + 1);
  *(undefined1 *)(unaff_x21 + (unaff_x22 & 0x7f)) = 0x80;
  if ((in_w9 ^ 0x7f) < 0x10) {
    if (in_w9 != 0x7f) {
      _bzero(unaff_x21 + uVar2);
    }
    func_0x0073c52c();
    uVar2 = 0;
  }
  _bzero(unaff_x21 + uVar2,0x70 - (int)uVar2);
  uVar3 = unaff_x19[0x19];
  uVar1 = ((uint)uVar3 & 0xff00ff00) >> 8 | ((uint)uVar3 & 0xff00ff) << 8;
  *(uint *)((long)unaff_x19 + 0xb4) = uVar1 >> 0x10 | uVar1 << 0x10;
  *(char *)((long)unaff_x19 + 0xb3) = (char)((ulong)uVar3 >> 0x20);
  *(char *)((long)unaff_x19 + 0xb2) = (char)((ulong)uVar3 >> 0x28);
  *(char *)((long)unaff_x19 + 0xb1) = (char)((ulong)uVar3 >> 0x30);
  *(char *)(unaff_x19 + 0x16) = (char)((ulong)uVar3 >> 0x38);
  *(char *)((long)unaff_x19 + 0xbf) = (char)((int)unaff_x22 << 3);
  *(char *)((long)unaff_x19 + 0xbe) = (char)(unaff_x22 >> 5);
  *(char *)((long)unaff_x19 + 0xbd) = (char)(unaff_x22 >> 0xd);
  *(char *)((long)unaff_x19 + 0xbc) = (char)(unaff_x22 >> 0x15);
  *(char *)((long)unaff_x19 + 0xbb) = (char)(unaff_x22 >> 0x1d);
  *(char *)((long)unaff_x19 + 0xba) = (char)(unaff_x22 >> 0x25);
  *(char *)((long)unaff_x19 + 0xb9) = (char)(unaff_x22 >> 0x2d);
  *(char *)(unaff_x19 + 0x17) = (char)(unaff_x22 >> 0x35);
  func_0x0073c52c();
  unaff_x20[7] = (char)*unaff_x19;
  unaff_x20[6] = (char)((ulong)*unaff_x19 >> 8);
  unaff_x20[5] = (char)((ulong)*unaff_x19 >> 0x10);
  unaff_x20[4] = (char)((ulong)*unaff_x19 >> 0x18);
  unaff_x20[3] = (char)*(undefined4 *)((long)unaff_x19 + 4);
  unaff_x20[2] = (char)((ulong)*unaff_x19 >> 0x28);
  unaff_x20[1] = (char)*(undefined2 *)((long)unaff_x19 + 6);
  *unaff_x20 = *(undefined1 *)((long)unaff_x19 + 7);
  unaff_x20[0xf] = (char)unaff_x19[1];
  unaff_x20[0xe] = (char)((ulong)unaff_x19[1] >> 8);
  unaff_x20[0xd] = (char)((ulong)unaff_x19[1] >> 0x10);
  unaff_x20[0xc] = (char)((ulong)unaff_x19[1] >> 0x18);
  unaff_x20[0xb] = (char)*(undefined4 *)((long)unaff_x19 + 0xc);
  unaff_x20[10] = (char)((ulong)unaff_x19[1] >> 0x28);
  unaff_x20[9] = (char)*(undefined2 *)((long)unaff_x19 + 0xe);
  unaff_x20[8] = *(undefined1 *)((long)unaff_x19 + 0xf);
  unaff_x20[0x17] = (char)unaff_x19[2];
  unaff_x20[0x16] = (char)((ulong)unaff_x19[2] >> 8);
  unaff_x20[0x15] = (char)((ulong)unaff_x19[2] >> 0x10);
  unaff_x20[0x14] = (char)((ulong)unaff_x19[2] >> 0x18);
  unaff_x20[0x13] = (char)*(undefined4 *)((long)unaff_x19 + 0x14);
  unaff_x20[0x12] = (char)((ulong)unaff_x19[2] >> 0x28);
  unaff_x20[0x11] = (char)*(undefined2 *)((long)unaff_x19 + 0x16);
  unaff_x20[0x10] = *(undefined1 *)((long)unaff_x19 + 0x17);
  unaff_x20[0x1f] = (char)unaff_x19[3];
  unaff_x20[0x1e] = (char)((ulong)unaff_x19[3] >> 8);
  unaff_x20[0x1d] = (char)((ulong)unaff_x19[3] >> 0x10);
  unaff_x20[0x1c] = (char)((ulong)unaff_x19[3] >> 0x18);
  unaff_x20[0x1b] = (char)*(undefined4 *)((long)unaff_x19 + 0x1c);
  unaff_x20[0x1a] = (char)((ulong)unaff_x19[3] >> 0x28);
  unaff_x20[0x19] = (char)*(undefined2 *)((long)unaff_x19 + 0x1e);
  unaff_x20[0x18] = *(undefined1 *)((long)unaff_x19 + 0x1f);
  unaff_x19[0x17] = 0;
  unaff_x19[0x16] = 0;
  unaff_x19[0x19] = 0;
  unaff_x19[0x18] = 0;
  unaff_x19[0x13] = 0;
  unaff_x19[0x12] = 0;
  unaff_x19[0x15] = 0;
  unaff_x19[0x14] = 0;
  unaff_x19[0xf] = 0;
  unaff_x19[0xe] = 0;
  unaff_x19[0x11] = 0;
  unaff_x19[0x10] = 0;
  unaff_x19[0xb] = 0;
  unaff_x19[10] = 0;
  unaff_x19[0xd] = 0;
  unaff_x19[0xc] = 0;
  unaff_x19[7] = 0;
  unaff_x19[6] = 0;
  unaff_x19[9] = 0;
  unaff_x19[8] = 0;
  unaff_x19[3] = 0;
  unaff_x19[2] = 0;
  unaff_x19[5] = 0;
  unaff_x19[4] = 0;
  unaff_x19[1] = 0;
  *unaff_x19 = 0;
  return;
}


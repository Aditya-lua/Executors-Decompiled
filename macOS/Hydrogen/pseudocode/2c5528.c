
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002c5528(uint *param_1)

{
  uint uVar1;
  undefined8 in_x9;
  
  *(undefined8 *)(param_1 + 0x2c) = in_x9;
  *(undefined1 *)((long)param_1 + 0xb9) = 8;
  uVar1 = *param_1;
  if ((*param_1 >> 1 & 1) == 0) {
    func_0x0036e3d8(puRam0000000000a3b780);
    uVar1 = uRam0000000000a3b794;
  }
  puRam0000000000a3b780 = &UNK_0083a318;
  uRam0000000000a3b788 = 0x400000004;
  uRam0000000000a3b794 = uVar1 | 2;
  uRam0000000000a3b790 = 0;
  if ((uRam0000000000a3b77c >> 1 & 1) == 0) {
    func_0x0036e3d8(puRam0000000000a3b768);
  }
  puRam0000000000a3b768 = &UNK_0083a338;
  uRam0000000000a3b770 = 0x400000004;
  uRam0000000000a3b77c = uRam0000000000a3b77c | 2;
  uRam0000000000a3b778 = 0;
  uRam0000000000a3b798 = 1;
  if ((uRam0000000000a3b754 >> 1 & 1) == 0) {
    func_0x0036e3d8(puRam0000000000a3b740);
  }
  puRam0000000000a3b740 = &UNK_0083a358;
  uRam0000000000a3b748 = 0x400000004;
  uRam0000000000a3b754 = uRam0000000000a3b754 | 2;
  uRam0000000000a3b750 = 0;
  if ((uRam0000000000a3b73c >> 1 & 1) == 0) {
    func_0x0036e3d8(puRam0000000000a3b728);
  }
  puRam0000000000a3b728 = &UNK_0083a378;
  uRam0000000000a3b730 = 0x400000004;
  uRam0000000000a3b73c = uRam0000000000a3b73c | 2;
  uRam0000000000a3b738 = 0;
  uRam0000000000a3b758 = 0xccd1c8aaee00bc4f;
  func_0x00373e9c(0xa29578,&DAT_002d3bcc);
  uRam0000000000a3b640 = 0xa3aba8;
  uRam0000000000a3b648 = 0xa3b640;
  uRam0000000000a3b658 = _UNK_0083a3a0;
  uRam0000000000a3b650 = _UNK_0083a398;
  uRam0000000000a3b668 = _UNK_0083a3b0;
  uRam0000000000a3b660 = _UNK_0083a3a8;
  uRam0000000000a3b6a0 = _UNK_0083a3c0;
  uRam0000000000a3b698 = _UNK_0083a3b8;
  uRam0000000000a3b6b0 = _UNK_0083a3d0;
  uRam0000000000a3b6a8 = _UNK_0083a3c8;
  uRam0000000000a3b6e8 = _UNK_0083a3e0;
  uRam0000000000a3b6e0 = _UNK_0083a3d8;
  uRam0000000000a3b6f8 = _UNK_0083a3f0;
  uRam0000000000a3b6f0 = _UNK_0083a3e8;
  uRam0000000000a3b7f8 = _UNK_0083a400;
  uRam0000000000a3b7f0 = _UNK_0083a3f8;
  uRam0000000000a3b808 = _UNK_0083a410;
  uRam0000000000a3b800 = _UNK_0083a408;
  func_0x00308268(0xa3b640);
  uRam0000000000a3b85c = _UNK_0082fb98;
  uRam0000000000a3b854 = _UNK_0082fb90;
  return;
}


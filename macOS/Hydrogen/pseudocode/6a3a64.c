
void FUN_006a3a64(int *param_1)

{
  uint uVar1;
  uint uVar2;
  int in_w4;
  uint in_w8;
  int in_w9;
  uint in_w10;
  int in_w11;
  uint in_w12;
  uint in_w13;
  int unaff_w20;
  int unaff_w27;
  int unaff_w28;
  int iStack0000000000000000;
  int iStack0000000000000004;
  int iStack0000000000000008;
  int iStack000000000000000c;
  int iStack0000000000000010;
  int iStack0000000000000014;
  int iStack0000000000000018;
  int iStack000000000000001c;
  
  uVar1 = in_w11 + in_w4 + (in_w13 ^ in_w12 ^ in_w8);
  uVar2 = uVar1 >> 0x11 | uVar1 * 0x8000;
  uVar1 = in_w12 + unaff_w20 + (in_w8 ^ in_w13 ^ uVar2);
  *param_1 = unaff_w27 + iStack0000000000000018;
  param_1[1] = (in_w10 >> 0x14 | in_w10 << 0xc) + iStack0000000000000010;
  param_1[2] = unaff_w28 + iStack0000000000000014;
  param_1[3] = in_w8 + iStack000000000000001c;
  param_1[4] = in_w13 + iStack000000000000000c;
  param_1[5] = (uVar1 >> 0x18 | uVar1 * 0x100) + iStack0000000000000000;
  param_1[6] = uVar2 + iStack0000000000000004;
  param_1[7] = in_w9 + iStack0000000000000008;
  return;
}


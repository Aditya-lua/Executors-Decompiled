
undefined1  [16] FUN_00491848(long param_1,long param_2)

{
  ulong uVar1;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  
  uVar1 = (in_x10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x10 & 0x5555555555555555) << 1;
  uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
  uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  *(ulong *)(param_2 + 0x20) = in_x11 & in_x10;
  *(long *)(param_2 + 0x38) = param_1 + -1;
  return *(undefined1 (*) [16])
          (in_x9 + (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2 + -0x10);
}


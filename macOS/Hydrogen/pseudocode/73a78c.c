
void FUN_0073a78c(long param_1,undefined1 param_2 [16])

{
  uint unaff_w19;
  
  *(long *)(param_1 + 0x10) = param_2._8_8_;
  *(long *)(param_1 + 8) = param_2._0_8_;
  *(undefined1 *)(param_1 + 1) = 0x1e;
  *(ushort *)(param_1 + 2) = (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8)
  ;
  return;
}


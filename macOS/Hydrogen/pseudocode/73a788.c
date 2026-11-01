
void FUN_0073a788(long param_1)

{
  uint unaff_w19;
  undefined8 *unaff_x20;
  undefined8 uVar1;
  
  uVar1 = *unaff_x20;
  *(undefined8 *)(param_1 + 0x10) = unaff_x20[1];
  *(undefined8 *)(param_1 + 8) = uVar1;
  *(undefined1 *)(param_1 + 1) = 0x1e;
  *(ushort *)(param_1 + 2) = (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8)
  ;
  return;
}


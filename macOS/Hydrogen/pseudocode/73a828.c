
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0073a828(undefined8 param_1)

{
  uint unaff_w19;
  long unaff_x21;
  undefined8 in_stack_00000018;
  
  *(long *)(unaff_x21 + 0x18) = unaff_x21 + 0x40;
  *(undefined8 *)(unaff_x21 + 0x20) = param_1;
  _memcpy();
  *(undefined8 *)(unaff_x21 + 4) = _UNK_0080c170;
  *(undefined4 *)(unaff_x21 + 0x10) = 0x10;
  *(undefined4 *)(unaff_x21 + 0x34) = in_stack_00000018._4_4_;
  *(undefined1 *)(unaff_x21 + 0x31) = 2;
  *(ushort *)(unaff_x21 + 0x32) =
       (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8);
  return;
}


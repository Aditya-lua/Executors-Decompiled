
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_0073a7f4(void)

{
  long lVar1;
  uint unaff_w19;
  undefined8 in_stack_00000018;
  
  lVar1 = _strlen();
  lVar1 = (*pcRam0000000000a2b608)(1,lVar1 + 0x41);
  if (lVar1 != 0) {
    *(long *)(lVar1 + 0x18) = lVar1 + 0x40;
    *(long *)(lVar1 + 0x20) = lVar1 + 0x30;
    _memcpy();
    *(undefined8 *)(lVar1 + 4) = _UNK_0080c170;
    *(undefined4 *)(lVar1 + 0x10) = 0x10;
    *(undefined4 *)(lVar1 + 0x34) = in_stack_00000018._4_4_;
    *(undefined1 *)(lVar1 + 0x31) = 2;
    *(ushort *)(lVar1 + 0x32) =
         (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8);
  }
  return lVar1;
}


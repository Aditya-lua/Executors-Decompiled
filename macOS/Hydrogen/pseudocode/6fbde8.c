
void FUN_006fbde8(void)

{
  long unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  uint *unaff_x25;
  int unaff_w26;
  
  *unaff_x25 = (uint)((unaff_x22 + (ulong)(uint)(unaff_w26 >> 4) * 0x20) - unaff_x24 >> 1) &
               0xfffffff0;
  *(uint *)(unaff_x22 + 0x1c) =
       *(uint *)(unaff_x22 + 0x1c) & 0xf | (uint)((ulong)(unaff_x24 - unaff_x22) >> 1) & 0xfffffff0;
  *(long *)(unaff_x24 + 0x10) = *unaff_x21;
  *(int *)(unaff_x24 + 0x18) = (int)unaff_x21[1];
  *(uint *)(unaff_x24 + 0x1c) =
       *(uint *)(unaff_x24 + 0x1c) & 0xfffffff0 | *(uint *)((long)unaff_x21 + 0xc) & 0xf;
  if ((4 < *(int *)((long)unaff_x21 + 0xc)) && ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0)) {
    if ((*(byte *)(*unaff_x21 + 1) & 3) != 0) {
      func_0x006f0ea0();
    }
  }
  return;
}


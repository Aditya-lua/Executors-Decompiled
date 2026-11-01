
void FUN_00625a14(void)

{
  ulong uVar1;
  long in_x9;
  long unaff_x19;
  undefined8 unaff_x20;
  
  uVar1 = *(ulong *)(unaff_x19 + 200);
  if (*(ulong *)(unaff_x19 + 0xd0) <= *(ulong *)(unaff_x19 + 200)) {
    uVar1 = *(ulong *)(unaff_x19 + 0xd0);
  }
  if ((*(long *)(unaff_x19 + 0xd8) == in_x9) && (*(undefined1 *)(unaff_x19 + 0xc1) = 0, uVar1 != 0))
  {
    do {
      *(undefined4 *)(unaff_x19 + 0x7c + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x20;
  uVar1 = *(ulong *)(unaff_x19 + 0x68);
  if (*(ulong *)(unaff_x19 + 0x70) <= *(ulong *)(unaff_x19 + 0x68)) {
    uVar1 = *(ulong *)(unaff_x19 + 0x70);
  }
  *(undefined1 *)(unaff_x19 + 0x61) = 0;
  if (*(long *)(unaff_x19 + 0x78) == unaff_x19 + 0x20 && uVar1 != 0) {
    do {
      *(undefined4 *)(unaff_x19 + 0x1c + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return;
}



/* WARNING: Removing unreachable block (ram,0x00054174) */

undefined8 FUN_00054118(long param_1)

{
  bool in_CY;
  ulong uVar1;
  long in_x9;
  long in_x10;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  undefined1 uStack0000000000000040;
  undefined1 uStack00000000000000e0;
  
  if (in_CY) {
    param_1 = in_x10;
  }
  if (in_x9 == unaff_x20) {
    for (; param_1 != 0; param_1 = param_1 + -1) {
      *(undefined8 *)(&uStack00000000000000e0 + param_1 * 8) = 0;
    }
  }
  uVar1 = *(ulong *)(unaff_x24 + 0xa0);
  if (*(ulong *)(unaff_x24 + 0xa8) <= *(ulong *)(unaff_x24 + 0xa0)) {
    uVar1 = *(ulong *)(unaff_x24 + 0xa8);
  }
  if (*(long *)(unaff_x24 + 0xb0) == unaff_x23 && uVar1 != 0) {
    do {
      *(undefined8 *)(&uStack0000000000000040 + uVar1 * 8) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return 1;
}


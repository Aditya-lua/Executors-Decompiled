
void FUN_00676074(void)

{
  long lVar1;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  
  *(undefined8 *)(unaff_x21 + 0x10) = unaff_x22;
  *(undefined8 *)(unaff_x21 + 8) = 0x1fffffffffffffff;
  lVar1 = (unaff_x20 & 7) << 3;
  *(ulong *)(*(long *)(unaff_x21 + 0x18) + (unaff_x20 & 0xfffffffffffffff8)) =
       *(ulong *)(*(long *)(unaff_x21 + 0x18) + (unaff_x20 & 0xfffffffffffffff8)) &
       (0xffL << lVar1 ^ 0xffffffffffffffffU) | (unaff_x19 & 0xffffffff) << lVar1;
  return;
}


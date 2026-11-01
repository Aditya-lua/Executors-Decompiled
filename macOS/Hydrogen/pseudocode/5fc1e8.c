
void FUN_005fc1e8(void)

{
  undefined1 in_CY;
  uint in_w8;
  long lVar1;
  ulong uVar2;
  ulong unaff_x19;
  long unaff_x23;
  
  while( true ) {
    uVar2 = (ulong)in_w8;
    in_w8 = in_w8 + 1;
    if (!(bool)in_CY || unaff_x19 <= uVar2) break;
    lVar1 = uVar2 * 8;
    uVar2 = *(ulong *)(unaff_x23 + lVar1);
    in_CY = 0xfffffffffffffffe < uVar2;
    *(ulong *)(unaff_x23 + lVar1) = uVar2 + 1;
  }
  return;
}


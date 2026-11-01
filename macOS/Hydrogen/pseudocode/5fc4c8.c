
void FUN_005fc4c8(long param_1)

{
  undefined1 in_ZR;
  undefined1 in_CY;
  uint in_w9;
  ulong in_x10;
  long lVar1;
  ulong unaff_x20;
  
  while ((bool)in_CY && !(bool)in_ZR) {
    lVar1 = *(long *)(param_1 + in_x10 * 8);
    *(long *)(param_1 + in_x10 * 8) = lVar1 + 1;
    in_x10 = (ulong)in_w9;
    in_w9 = in_w9 + 1;
    in_ZR = false;
    in_CY = false;
    if (lVar1 == -1) {
      in_CY = in_x10 <= unaff_x20;
      in_ZR = unaff_x20 == in_x10;
    }
  }
  return;
}


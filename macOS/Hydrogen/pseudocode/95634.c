
undefined8 FUN_00095634(void)

{
  bool in_ZR;
  bool in_CY;
  long lVar1;
  uint in_w8;
  uint in_w9;
  long *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  
  if (!in_CY || in_ZR) {
    lVar1 = *unaff_x19;
  }
  else {
    do {
      unaff_w20 = unaff_w20 << 1;
    } while (unaff_w20 < in_w8);
    lVar1 = _realloc(*unaff_x19,unaff_w20);
    *unaff_x19 = lVar1;
    if (lVar1 == 0) {
      *(undefined4 *)(unaff_x19 + 1) = 0;
      return 0x100;
    }
    *(uint *)((long)unaff_x19 + 0xc) = unaff_w20;
    in_w9 = *(uint *)(unaff_x19 + 1);
  }
  *(uint *)(lVar1 + (ulong)in_w9) = unaff_w22 | unaff_w21;
  *(int *)(unaff_x19 + 1) = (int)unaff_x19[1] + 4;
  return 0;
}


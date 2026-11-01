
undefined8 FUN_00095224(void)

{
  long lVar1;
  undefined8 uVar2;
  uint in_w8;
  int iVar3;
  long *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  uint unaff_w23;
  
  do {
    unaff_w22 = unaff_w22 << 1;
  } while (unaff_w22 < in_w8);
  lVar1 = _realloc(*unaff_x19,unaff_w22);
  *unaff_x19 = lVar1;
  if (lVar1 == 0) {
    uVar2 = 0x100;
    iVar3 = 0;
  }
  else {
    *(uint *)((long)unaff_x19 + 0xc) = unaff_w22;
    uVar2 = 0;
    *(uint *)(lVar1 + (ulong)*(uint *)(unaff_x19 + 1)) =
         unaff_w23 & 0xffc00000 | unaff_w23 & 0x3ff | (unaff_w20 & 0xfff) << 10 | unaff_w21 << 5 |
         unaff_w21;
    iVar3 = (int)unaff_x19[1] + 4;
  }
  *(int *)(unaff_x19 + 1) = iVar3;
  return uVar2;
}



undefined8 FUN_000954c8(void)

{
  long lVar1;
  undefined8 uVar2;
  uint in_w8;
  int iVar3;
  long *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  uint uVar4;
  ulong unaff_x23;
  int unaff_w24;
  uint unaff_w25;
  
  while (uVar4 = (uint)unaff_x23, uVar4 < in_w8) {
    unaff_x23 = (ulong)(uVar4 << 1);
  }
  lVar1 = _realloc(*unaff_x19,unaff_x23);
  *unaff_x19 = lVar1;
  if (lVar1 == 0) {
    uVar2 = 0x100;
    iVar3 = 0;
  }
  else {
    *(uint *)((long)unaff_x19 + 0xc) = uVar4;
    uVar2 = 0;
    *(uint *)(lVar1 + (ulong)*(uint *)(unaff_x19 + 1)) =
         unaff_w22 | unaff_w24 << 0x1f | unaff_w20 | (unaff_w21 & 0xffff) << 5 | unaff_w25 |
         0x12800000;
    iVar3 = (int)unaff_x19[1] + 4;
  }
  *(int *)(unaff_x19 + 1) = iVar3;
  return uVar2;
}


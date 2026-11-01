
undefined4 FUN_007797a8(void)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  uint *unaff_x19;
  long unaff_x21;
  
code_r0x007797a8:
  do {
    lVar1 = unaff_x21 + 1;
    if (unaff_x21 == 0) {
      uVar3 = 0x2b;
      if (*unaff_x19 != 0) {
        uVar3 = 0;
      }
      return uVar3;
    }
    unaff_x21 = _strchr(lVar1,0x2c);
    if (unaff_x21 == 0) goto LAB_007797d0;
    lVar2 = unaff_x21 - lVar1;
  } while (lVar2 == 0);
  goto LAB_007797e0;
LAB_007797d0:
  lVar2 = _strlen(lVar1);
  if (lVar2 != 0) {
LAB_007797e0:
    lVar1 = func_0x007851f8(lVar1,lVar2);
    if (lVar1 == 0) {
      return 1;
    }
    *unaff_x19 = *unaff_x19 | *(uint *)(lVar1 + 0x94);
  }
  goto code_r0x007797a8;
}


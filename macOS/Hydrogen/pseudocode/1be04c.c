
undefined1  [16] FUN_001be04c(void)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x25;
  long lVar5;
  long unaff_x26;
  long lVar6;
  undefined1 auVar7 [16];
  
  uVar4 = *unaff_x22;
  lVar1 = unaff_x22[1];
  do {
    lVar6 = unaff_x26;
    if ((*(long *)(lVar6 + -8) == lVar1) &&
       (iVar3 = _memcmp(*(undefined8 *)(lVar6 + -0x10),uVar4,lVar1), iVar3 == 0)) {
      *unaff_x20 = lVar6;
      goto LAB_001be0f4;
    }
    unaff_x19 = unaff_x19 + 1;
    *unaff_x21 = unaff_x19;
    unaff_x26 = lVar6 + 0x18;
  } while (lVar6 != unaff_x25);
  *unaff_x20 = lVar6;
  lVar1 = unaff_x20[3];
  if (unaff_x20[2] == lVar1) {
    uVar4 = 0;
  }
  else {
    unaff_x19 = *unaff_x21;
    uVar4 = *unaff_x22;
    lVar6 = unaff_x22[1];
    lVar2 = unaff_x20[2];
    do {
      lVar5 = lVar2 + 0x18;
      if ((*(long *)(lVar2 + 0x10) == lVar6) &&
         (iVar3 = _memcmp(*(undefined8 *)(lVar2 + 8),uVar4,lVar6), iVar3 == 0)) {
        unaff_x20[2] = lVar5;
LAB_001be0f4:
        uVar4 = 1;
        goto LAB_001be110;
      }
      unaff_x19 = unaff_x19 + 1;
      *unaff_x21 = unaff_x19;
      lVar2 = lVar5;
    } while (lVar5 != lVar1);
    uVar4 = 0;
    unaff_x20[2] = lVar5;
  }
LAB_001be110:
  auVar7._8_8_ = unaff_x19;
  auVar7._0_8_ = uVar4;
  return auVar7;
}


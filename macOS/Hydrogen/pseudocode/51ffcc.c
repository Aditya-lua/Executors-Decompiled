
long FUN_0051ffcc(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar4;
  long *plVar5;
  
  do {
    if (unaff_x24 == unaff_x23) {
LAB_0051fff4:
      *unaff_x19 = unaff_x24;
      return param_1;
    }
    unaff_x24 = unaff_x22 + 0x20;
    uVar1 = *(undefined8 *)(unaff_x22 + 0x10);
    lVar2 = *(long *)(unaff_x22 + 0x18);
    lVar4 = unaff_x26;
    plVar5 = unaff_x25;
    while ((*plVar5 != lVar2 || (iVar3 = _memcmp(plVar5[-1],uVar1,lVar2), iVar3 != 0))) {
      plVar5 = plVar5 + 2;
      lVar4 = lVar4 + -0x10;
      if (lVar4 == 0) {
        param_1 = unaff_x22 + 0x10;
        goto LAB_0051fff4;
      }
    }
    param_1 = 0;
    unaff_x22 = unaff_x24;
  } while( true );
}


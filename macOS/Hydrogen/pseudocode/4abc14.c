
undefined8 FUN_004abc14(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 extraout_x1;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar3;
  long *plVar4;
  char *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  char unaff_w25;
  long lVar5;
  char in_wzr;
  
  do {
    if (*unaff_x21 == '\x01') {
      *unaff_x21 = in_wzr;
    }
    else {
      func_0x007b05dc(unaff_x21,0);
    }
    do {
      unaff_x23 = unaff_x23 + 8;
      if (unaff_x24 == unaff_x23) {
        uVar3 = 0;
        uVar2 = 0;
joined_r0x004abc50:
        if (unaff_x22 != 0) {
          func_0x00187bd4();
          uVar2 = uVar3;
        }
        return uVar2;
      }
      plVar4 = *(long **)(unaff_x19 + unaff_x23);
      iVar1 = func_0x004a2ad0(plVar4);
      if (iVar1 != 0) {
        uVar3 = 1;
        uVar2 = 1;
        goto joined_r0x004abc50;
      }
    } while (*plVar4 != 10);
    lVar5 = plVar4[4];
    unaff_x21 = (char *)(lVar5 + 8);
    if (*unaff_x21 == '\0') {
      *unaff_x21 = unaff_w25;
    }
    else {
      func_0x007aff64(unaff_x21,extraout_x1,1000000000);
    }
    func_0x004b023c(lVar5 + 0x28,*unaff_x20);
  } while( true );
}


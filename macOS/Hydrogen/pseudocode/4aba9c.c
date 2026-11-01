
undefined8 FUN_004aba9c(undefined8 param_1,undefined8 param_2)

{
  char *pcVar1;
  char cVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 extraout_x1;
  char in_w8;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar5;
  long *plVar6;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  char unaff_w25;
  long unaff_x26;
  char in_wzr;
  
  do {
    pcVar1 = (char *)(unaff_x26 + 8);
    cVar2 = *pcVar1;
    if (cVar2 == in_w8) {
      *pcVar1 = unaff_w25;
    }
    if (cVar2 != '\0') {
      func_0x007aff64(pcVar1,param_2,1000000000);
    }
    func_0x004b023c(unaff_x26 + 0x28,*unaff_x20);
    if (*pcVar1 == '\x01') {
      *pcVar1 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar1,0);
    }
    do {
      unaff_x23 = unaff_x23 + 8;
      if (unaff_x24 == unaff_x23) {
        uVar5 = 0;
        uVar4 = 0;
joined_r0x004abaf4:
        if (unaff_x22 != 0) {
          func_0x00187bd4();
          uVar4 = uVar5;
        }
        return uVar4;
      }
      plVar6 = *(long **)(unaff_x19 + unaff_x23);
      iVar3 = func_0x004a2ad0(plVar6);
      if (iVar3 != 0) {
        uVar5 = 1;
        uVar4 = 1;
        goto joined_r0x004abaf4;
      }
    } while (*plVar6 != 10);
    in_w8 = '\0';
    unaff_x26 = plVar6[4];
    param_2 = extraout_x1;
  } while( true );
}


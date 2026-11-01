
undefined8 FUN_004b0e94(void)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 extraout_x1;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar4;
  long *plVar5;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  char unaff_w25;
  long lVar6;
  char in_wzr;
  
  do {
    unaff_x23 = unaff_x23 + 8;
    if (unaff_x24 == unaff_x23) {
      uVar4 = 0;
      uVar3 = 0;
joined_r0x004b0eb4:
      if (unaff_x22 != 0) {
        func_0x00187bd4();
        uVar3 = uVar4;
      }
      return uVar3;
    }
    plVar5 = *(long **)(unaff_x19 + unaff_x23);
    iVar2 = func_0x004a2ad0(plVar5);
    if (iVar2 != 0) {
      uVar4 = 1;
      uVar3 = 1;
      goto joined_r0x004b0eb4;
    }
    if (*plVar5 == 10) {
      lVar6 = plVar5[4];
      pcVar1 = (char *)(lVar6 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = unaff_w25;
      }
      else {
        func_0x007aff64(pcVar1,extraout_x1,1000000000);
      }
      func_0x004b023c(lVar6 + 0x28,*unaff_x20);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
  } while( true );
}


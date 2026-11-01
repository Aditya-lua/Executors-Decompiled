
undefined8 FUN_004a7d48(void)

{
  char *pcVar1;
  undefined8 uVar2;
  undefined1 in_ZR;
  int iVar3;
  undefined8 uVar4;
  undefined8 extraout_x1;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *plVar5;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  char unaff_w25;
  long lVar6;
  char in_wzr;
  
  do {
    if ((bool)in_ZR) {
      uVar4 = 0;
      uVar2 = 0;
      if (unaff_x22 != 0) {
code_r0x004a7dd0:
        uVar4 = uVar2;
        func_0x00187bd4();
      }
      return uVar4;
    }
    plVar5 = *(long **)(unaff_x19 + unaff_x23);
    iVar3 = func_0x004a2ad0(plVar5);
    if (iVar3 != 0) {
      uVar2 = 1;
      if (unaff_x22 == 0) {
        return 1;
      }
      goto code_r0x004a7dd0;
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
    unaff_x23 = unaff_x23 + 8;
    in_ZR = unaff_x24 == unaff_x23;
  } while( true );
}


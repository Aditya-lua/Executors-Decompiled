
void FUN_004c8724(undefined8 param_1,undefined8 param_2)

{
  undefined1 in_ZR;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 uVar1;
  long lVar2;
  long unaff_x20;
  char *pcVar3;
  long unaff_x22;
  char unaff_w23;
  char in_wzr;
  undefined1 uStack0000000000000008;
  
  do {
    if ((bool)in_ZR) {
      return;
    }
    lVar2 = *(long *)(unaff_x20 + 0x18);
    if (lVar2 < 0x14) {
      if (lVar2 == 0x10) {
        lVar2 = *(long *)(unaff_x20 + 0x60);
        pcVar3 = (char *)(lVar2 + 8);
        if (*pcVar3 == '\0') {
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007aff64(pcVar3,param_2,1000000000);
        }
        func_0x004c86b0(lVar2 + 0x10);
        if (*pcVar3 == '\x01') {
          *pcVar3 = in_wzr;
          lVar2 = *(long *)(unaff_x20 + 0x68);
          pcVar3 = (char *)(lVar2 + 8);
          uVar1 = extraout_x1_02;
          if (*pcVar3 != '\0') goto LAB_004c88ec;
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007b05dc(pcVar3,0);
          lVar2 = *(long *)(unaff_x20 + 0x68);
          pcVar3 = (char *)(lVar2 + 8);
          uVar1 = extraout_x1_07;
          if (*pcVar3 == '\0') {
            *pcVar3 = unaff_w23;
          }
          else {
LAB_004c88ec:
            func_0x007aff64(pcVar3,uVar1,1000000000);
          }
        }
        func_0x004c86b0(lVar2 + 0x10);
        param_2 = extraout_x1_03;
        goto LAB_004c870c;
      }
      if (lVar2 == 0x11) {
        func_0x0045cd08(&uStack0000000000000008,unaff_x20);
        func_0x004d19a0();
        param_2 = extraout_x1_04;
      }
      else if (lVar2 == 0x13) {
        lVar2 = *(long *)(unaff_x20 + 0x60);
        pcVar3 = (char *)(lVar2 + 8);
        if (*pcVar3 == '\0') {
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007aff64(pcVar3,param_2,1000000000);
        }
        func_0x004c86b0(lVar2 + 0x10);
        param_2 = extraout_x1_00;
        goto LAB_004c870c;
      }
    }
    else {
      if (lVar2 == 0x14) {
        lVar2 = *(long *)(unaff_x20 + 0x60);
        pcVar3 = (char *)(lVar2 + 8);
        if (*pcVar3 == '\0') {
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007aff64(pcVar3,param_2,1000000000);
        }
        func_0x004c86b0(lVar2 + 0x10);
        param_2 = extraout_x1;
      }
      else if (lVar2 == 0x17) {
        lVar2 = *(long *)(unaff_x20 + 0xe8);
        pcVar3 = (char *)(lVar2 + 8);
        if (*pcVar3 == '\0') {
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007aff64(pcVar3,param_2,1000000000);
        }
        func_0x004c86b0(lVar2 + 0x10);
        param_2 = extraout_x1_05;
      }
      else {
        if (lVar2 != 0x1a) goto LAB_004c871c;
        lVar2 = *(long *)(unaff_x20 + 0x50);
        pcVar3 = (char *)(lVar2 + 8);
        if (*pcVar3 == '\0') {
          *pcVar3 = unaff_w23;
        }
        else {
          func_0x007aff64(pcVar3,param_2,1000000000);
        }
        func_0x004c86b0(lVar2 + 0x10);
        param_2 = extraout_x1_01;
      }
LAB_004c870c:
      if (*pcVar3 == '\x01') {
        *pcVar3 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar3,0);
        param_2 = extraout_x1_06;
      }
    }
LAB_004c871c:
    unaff_x20 = unaff_x20 + 0x108;
    unaff_x22 = unaff_x22 + -0x108;
    in_ZR = unaff_x22 == 0;
  } while( true );
}



undefined1  [16] FUN_0044bfec(short *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w9;
  int in_w10;
  undefined1 auVar3 [16];
  
  if (in_w9 == 0x6166 && in_w10 == 0x32) {
    uVar1 = 1;
    uVar2 = 0x2c;
  }
  else if (*param_1 == 0x6166 && (char)param_1[1] == '3') {
    uVar1 = 1;
    uVar2 = 0x2d;
  }
  else if (*param_1 == 0x6166 && (char)param_1[1] == '4') {
    uVar1 = 1;
    uVar2 = 0x2e;
  }
  else if (*param_1 == 0x6166 && (char)param_1[1] == '5') {
    uVar1 = 1;
    uVar2 = 0x2f;
  }
  else if (*param_1 == 0x6166 && (char)param_1[1] == '6') {
    uVar1 = 1;
    uVar2 = 0x30;
  }
  else if (*param_1 == 0x6166 && (char)param_1[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x31;
  }
  else {
    uVar2 = 0x32;
    if (((((*param_1 == 0x7366 && (char)param_1[1] == '2') ||
          (uVar2 = 0x33, *param_1 == 0x7366 && (char)param_1[1] == '3')) ||
         (uVar2 = 0x34, *param_1 == 0x7366 && (char)param_1[1] == '4')) ||
        ((uVar2 = 0x35, *param_1 == 0x7366 && (char)param_1[1] == '5' ||
         (uVar2 = 0x36, *param_1 == 0x7366 && (char)param_1[1] == '6')))) ||
       ((uVar2 = 0x37, *param_1 == 0x7366 && (char)param_1[1] == '7' ||
        ((uVar2 = 0x38, *param_1 == 0x7366 && (char)param_1[1] == '8' ||
         (uVar2 = 0x39, *param_1 == 0x7366 && (char)param_1[1] == '9')))))) {
      uVar1 = 1;
    }
    else if (*param_1 == 0x7466 && (char)param_1[1] == '8') {
      uVar1 = 1;
      uVar2 = 0x3c;
    }
    else if (*param_1 == 0x7466 && (char)param_1[1] == '9') {
      uVar1 = 1;
      uVar2 = 0x3d;
    }
    else {
      uVar1 = 0;
      uVar2 = 0x3f;
    }
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


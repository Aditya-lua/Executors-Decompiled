
undefined1  [16] FUN_0044c13c(short *param_1,undefined8 param_2)

{
  bool in_ZR;
  undefined8 uVar1;
  int in_w10;
  undefined1 auVar2 [16];
  
  if (in_ZR && in_w10 == (int)param_2) {
    uVar1 = 1;
  }
  else if (*param_1 == 0x7466 && (char)param_1[1] == '8') {
    uVar1 = 1;
    param_2 = 0x3c;
  }
  else if (*param_1 == 0x7466 && (char)param_1[1] == '9') {
    uVar1 = 1;
    param_2 = 0x3d;
  }
  else {
    uVar1 = 0;
    param_2 = 0x3f;
  }
  auVar2._8_8_ = param_2;
  auVar2._0_8_ = uVar1;
  return auVar2;
}


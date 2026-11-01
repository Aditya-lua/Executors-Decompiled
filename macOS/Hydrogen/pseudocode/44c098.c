
undefined1  [16] FUN_0044c098(ushort *param_1,undefined8 param_2)

{
  bool in_ZR;
  undefined8 uVar1;
  uint in_w8;
  undefined1 auVar2 [16];
  
  if (((((in_ZR) || (param_2 = 0x33, *param_1 == in_w8 && (char)param_1[1] == '3')) ||
       (param_2 = 0x34, *param_1 == in_w8 && (char)param_1[1] == '4')) ||
      ((param_2 = 0x35, *param_1 == in_w8 && (char)param_1[1] == '5' ||
       (param_2 = 0x36, *param_1 == in_w8 && (char)param_1[1] == '6')))) ||
     ((param_2 = 0x37, *param_1 == in_w8 && (char)param_1[1] == '7' ||
      ((param_2 = 0x38, *param_1 == in_w8 && (char)param_1[1] == '8' ||
       (param_2 = 0x39, *param_1 == in_w8 && (char)param_1[1] == '9')))))) {
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


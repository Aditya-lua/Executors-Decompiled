
undefined1  [16] FUN_0044d288(ushort *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  uint in_w8;
  undefined1 auVar3 [16];
  
  if (*param_1 == in_w8 && (char)param_1[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x28;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '0') {
    uVar1 = 1;
    uVar2 = 0x29;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '1') {
    uVar1 = 1;
    uVar2 = 0x2a;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '2') {
    uVar1 = 1;
    uVar2 = 0x2b;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '3') {
    uVar1 = 1;
    uVar2 = 0x2c;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '4') {
    uVar1 = 1;
    uVar2 = 0x2d;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '5') {
    uVar1 = 1;
    uVar2 = 0x2e;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '6') {
    uVar1 = 1;
    uVar2 = 0x2f;
  }
  else if (*param_1 == 0x6d6d && (char)param_1[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x30;
  }
  else if (*param_1 == 0x6366 && (char)param_1[1] == 'w') {
    uVar1 = 1;
    uVar2 = 0x41;
  }
  else if (*param_1 == 0x7366 && (char)param_1[1] == 'w') {
    uVar1 = 1;
    uVar2 = 0x42;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x7d;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


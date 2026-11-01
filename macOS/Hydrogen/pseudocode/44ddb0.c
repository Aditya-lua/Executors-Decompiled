
undefined1  [16] FUN_0044ddb0(ushort *param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  uint in_w9;
  int in_w11;
  undefined1 auVar3 [16];
  
  if (in_ZR && in_w11 == 0x36) {
    uVar1 = 1;
    uVar2 = 0x4a;
  }
  else if (*param_1 == in_w9 && (char)param_1[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x4b;
  }
  else if (*param_1 == 0x6578 && (char)param_1[1] == 'r') {
    uVar1 = 1;
    uVar2 = 0x4c;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '0') {
    uVar1 = 1;
    uVar2 = 0x4d;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '1') {
    uVar1 = 1;
    uVar2 = 0x4e;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '2') {
    uVar1 = 1;
    uVar2 = 0x4f;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '3') {
    uVar1 = 1;
    uVar2 = 0x50;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '4') {
    uVar1 = 1;
    uVar2 = 0x51;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '5') {
    uVar1 = 1;
    uVar2 = 0x52;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '6') {
    uVar1 = 1;
    uVar2 = 0x53;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '7') {
    uVar1 = 1;
    uVar2 = 0x54;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '8') {
    uVar1 = 1;
    uVar2 = 0x55;
  }
  else if (*param_1 == 0x7276 && (char)param_1[1] == '9') {
    uVar1 = 1;
    uVar2 = 0x56;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x74;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


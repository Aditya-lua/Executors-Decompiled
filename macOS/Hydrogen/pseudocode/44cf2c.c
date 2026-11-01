
undefined1  [16] FUN_0044cf2c(uint *param_1)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  uint in_w8;
  undefined1 auVar4 [16];
  
  uVar1 = in_w8 & 0xffff | 0x326d0000;
  if (*param_1 == uVar1 && (char)param_1[1] == '0') {
    uVar2 = 1;
    uVar3 = 0x47;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '1') {
    uVar2 = 1;
    uVar3 = 0x48;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '2') {
    uVar2 = 1;
    uVar3 = 0x49;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '3') {
    uVar2 = 1;
    uVar3 = 0x4a;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '4') {
    uVar2 = 1;
    uVar3 = 0x4b;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '5') {
    uVar2 = 1;
    uVar3 = 0x4c;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '6') {
    uVar2 = 1;
    uVar3 = 0x4d;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '7') {
    uVar2 = 1;
    uVar3 = 0x4e;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '8') {
    uVar2 = 1;
    uVar3 = 0x4f;
  }
  else if (*param_1 == uVar1 && (char)param_1[1] == '9') {
    uVar2 = 1;
    uVar3 = 0x50;
  }
  else if (*param_1 == 0x336d6d78 && (char)param_1[1] == '0') {
    uVar2 = 1;
    uVar3 = 0x51;
  }
  else if (*param_1 == 0x336d6d78 && (char)param_1[1] == '1') {
    uVar2 = 1;
    uVar3 = 0x52;
  }
  else {
    uVar2 = 0;
    uVar3 = 0x7d;
  }
  auVar4._8_8_ = uVar3;
  auVar4._0_8_ = uVar2;
  return auVar4;
}


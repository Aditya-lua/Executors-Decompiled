
undefined1  [16] FUN_00448c68(short *param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    uVar1 = 1;
    uVar2 = 0x61;
  }
  else if (*param_1 == 0x325a) {
    uVar1 = 1;
    uVar2 = 0x62;
  }
  else if (*param_1 == 0x335a) {
    uVar1 = 1;
    uVar2 = 99;
  }
  else if (*param_1 == 0x345a) {
    uVar1 = 1;
    uVar2 = 100;
  }
  else if (*param_1 == 0x355a) {
    uVar1 = 1;
    uVar2 = 0x65;
  }
  else if (*param_1 == 0x365a) {
    uVar1 = 1;
    uVar2 = 0x66;
  }
  else if (*param_1 == 0x375a) {
    uVar1 = 1;
    uVar2 = 0x67;
  }
  else if (*param_1 == 0x385a) {
    uVar1 = 1;
    uVar2 = 0x68;
  }
  else if (*param_1 == 0x395a) {
    uVar1 = 1;
    uVar2 = 0x69;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x7f;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


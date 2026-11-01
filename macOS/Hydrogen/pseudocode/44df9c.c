
undefined1  [16] FUN_0044df9c(int *param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w9;
  int in_w10;
  int in_w11;
  int in_w12;
  int in_w13;
  int in_w14;
  int in_w15;
  int in_w16;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    uVar1 = 1;
    uVar2 = 0x5e;
  }
  else if (*param_1 == 0x38317276) {
    uVar1 = 1;
    uVar2 = 0x5f;
  }
  else if (*param_1 == 0x39317276) {
    uVar1 = 1;
    uVar2 = 0x60;
  }
  else if (*param_1 == in_w9 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x61;
  }
  else if (*param_1 == in_w10 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x62;
  }
  else if (*param_1 == in_w11 + 0x10000) {
    uVar1 = 1;
    uVar2 = 99;
  }
  else if (*param_1 == in_w12 + 0x10000) {
    uVar1 = 1;
    uVar2 = 100;
  }
  else if (*param_1 == in_w13 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x65;
  }
  else if (*param_1 == in_w14 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x66;
  }
  else if (*param_1 == in_w15 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x67;
  }
  else if (*param_1 == in_w16 + 0x10000) {
    uVar1 = 1;
    uVar2 = 0x68;
  }
  else if (*param_1 == 0x38327276) {
    uVar1 = 1;
    uVar2 = 0x69;
  }
  else if (*param_1 == 0x39327276) {
    uVar1 = 1;
    uVar2 = 0x6a;
  }
  else if (*param_1 == in_w9 + 0x20000) {
    uVar1 = 1;
    uVar2 = 0x6b;
  }
  else if (*param_1 == in_w10 + 0x20000) {
    uVar1 = 1;
    uVar2 = 0x6c;
  }
  else if (*param_1 == 0x72637376) {
    uVar1 = 1;
    uVar2 = 0x6e;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x74;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


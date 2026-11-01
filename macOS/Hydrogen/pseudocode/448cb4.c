
undefined1  [16] FUN_00448cb4(short *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w8;
  int in_w9;
  undefined1 auVar3 [16];
  
  if (in_w8 == in_w9) {
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


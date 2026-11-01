
undefined1  [16] FUN_0044cc0c(int *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  uint in_w8;
  uint in_w9;
  undefined1 auVar3 [16];
  
  if (in_w8 == (in_w9 & 0xffff | 0x356d0000)) {
    uVar1 = 1;
    uVar2 = 0x16;
  }
  else if (*param_1 == 0x366d6d78) {
    uVar1 = 1;
    uVar2 = 0x17;
  }
  else if (*param_1 == 0x376d6d78) {
    uVar1 = 1;
    uVar2 = 0x18;
  }
  else if (*param_1 == 0x386d6d78) {
    uVar1 = 1;
    uVar2 = 0x19;
  }
  else if (*param_1 == 0x396d6d78) {
    uVar1 = 1;
    uVar2 = 0x1a;
  }
  else if (*param_1 == 0x7274646c) {
    uVar1 = 1;
    uVar2 = 0x3f;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x7d;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


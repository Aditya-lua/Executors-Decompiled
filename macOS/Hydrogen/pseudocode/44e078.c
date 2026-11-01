
undefined1  [16] FUN_0044e078(int *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w10;
  undefined1 auVar3 [16];
  
  if (*param_1 == in_w10 + 0x20000) {
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


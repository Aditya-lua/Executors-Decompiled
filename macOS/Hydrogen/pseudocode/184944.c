
undefined1  [16] FUN_00184944(long param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    uVar2 = 0;
    uVar1 = 1;
  }
  else {
    uVar1 = *(undefined8 *)(param_1 + 8);
    uVar2 = *(undefined8 *)(param_1 + 0x10);
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}


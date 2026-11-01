
void FUN_00707a04(undefined8 param_1,undefined1 param_2 [16],long param_3)

{
  undefined8 *in_x4;
  undefined8 *in_x5;
  undefined8 *in_x6;
  undefined8 *in_x7;
  undefined8 *in_x9;
  undefined1 in_w10;
  undefined8 uVar1;
  undefined8 uVar2;
  
  *(long *)(param_3 + 0x40) = param_2._8_8_;
  *(long *)(param_3 + 0x38) = param_2._0_8_;
  uVar1 = *in_x4;
  *(undefined8 *)(param_3 + 0x50) = in_x4[1];
  *(undefined8 *)(param_3 + 0x48) = uVar1;
  uVar1 = *in_x5;
  *(undefined8 *)(param_3 + 0x60) = in_x5[1];
  *(undefined8 *)(param_3 + 0x58) = uVar1;
  uVar1 = in_x6[2];
  uVar2 = *in_x6;
  *(undefined8 *)(param_3 + 0x70) = in_x6[1];
  *(undefined8 *)(param_3 + 0x68) = uVar2;
  *(undefined8 *)(param_3 + 0x78) = uVar1;
  uVar1 = *in_x7;
  *(undefined8 *)(param_3 + 0x88) = in_x7[1];
  *(undefined8 *)(param_3 + 0x80) = uVar1;
  *(undefined1 *)(param_3 + 0x90) = in_w10;
  uVar1 = *in_x9;
  *(undefined8 *)(param_3 + 0x9c) = in_x9[1];
  *(undefined8 *)(param_3 + 0x94) = uVar1;
  *(undefined8 *)(param_3 + 0xa8) = param_1;
  return;
}


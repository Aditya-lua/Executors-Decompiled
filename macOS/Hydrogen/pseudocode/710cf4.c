
void FUN_00710cf4(undefined8 *param_1,undefined1 param_2 [16])

{
  undefined1 in_ZR;
  undefined4 *puVar1;
  undefined4 *in_x9;
  long in_x10;
  long in_x11;
  undefined4 *in_x12;
  long in_x13;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar3 = param_2._8_8_;
  uVar2 = param_2._0_8_;
  while (!(bool)in_ZR) {
    param_1[-3] = uVar3;
    param_1[-4] = uVar2;
    param_1[-1] = uVar3;
    param_1[-2] = uVar2;
    param_1[1] = uVar3;
    *param_1 = uVar2;
    param_1[3] = uVar3;
    param_1[2] = uVar2;
    in_x13 = in_x13 + -0x10;
    param_1 = param_1 + 8;
    in_ZR = in_x13 == 0;
  }
  if (in_x10 != in_x11) {
    do {
      puVar1 = in_x12 + 1;
      *in_x12 = *unaff_x20;
      in_x12 = puVar1;
    } while (puVar1 != in_x9);
  }
  *(undefined4 **)(unaff_x19 + 8) = in_x9;
  return;
}



undefined8
FUN_00382540(undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4,
            undefined8 *param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
            undefined8 param_9)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  bool in_CY;
  undefined8 in_x9;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x27;
  
  while( true ) {
    *param_3 = 0;
    param_3[1] = 0;
    param_3[2] = 0;
    param_3[3] = 0;
    if (unaff_x27 == 0) break;
    unaff_x27 = unaff_x27 + -0x20;
    uVar1 = unaff_x19;
    if (in_CY) {
      uVar1 = param_8;
    }
    *param_4 = 0;
    param_4[1] = 0;
    uVar2 = unaff_x20;
    if (in_CY) {
      uVar2 = param_9;
    }
    param_8 = param_5[4];
    param_9 = param_5[5];
    unaff_x19 = param_3[4];
    unaff_x20 = param_3[5];
    uVar3 = unaff_x21;
    if (in_CY) {
      uVar3 = param_1;
    }
    param_4[2] = 0;
    param_4[3] = 0;
    param_4 = param_4 + 4;
    uVar4 = unaff_x22;
    if (in_CY) {
      uVar4 = in_x9;
    }
    param_1 = param_5[6];
    in_x9 = param_5[7];
    unaff_x21 = param_3[6];
    unaff_x22 = param_3[7];
    param_3 = param_3 + 4;
    *param_5 = uVar1;
    param_5[1] = uVar2;
    param_5[2] = uVar3;
    param_5[3] = uVar4;
    param_5 = param_5 + 4;
  }
  if (in_CY) {
    unaff_x19 = param_8;
  }
  *param_4 = 0;
  param_4[1] = 0;
  if (in_CY) {
    unaff_x20 = param_9;
  }
  param_4[2] = 0;
  param_4[3] = 0;
  if (in_CY) {
    unaff_x22 = in_x9;
    unaff_x21 = param_1;
  }
  *param_5 = unaff_x19;
  param_5[1] = unaff_x20;
  param_5[2] = unaff_x21;
  param_5[3] = unaff_x22;
  return 1;
}


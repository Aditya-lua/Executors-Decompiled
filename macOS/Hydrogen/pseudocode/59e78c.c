
void FUN_0059e78c(undefined8 *param_1,undefined1 param_2 [16],long param_3,long param_4,
                 undefined8 param_5)

{
  undefined8 *puVar1;
  long in_x9;
  long lVar2;
  long in_x10;
  long in_x11;
  long in_x12;
  long unaff_x19;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar4 = param_2._8_8_;
  uVar3 = param_2._0_8_;
  puVar1 = (undefined8 *)(in_x10 + 0x20);
  lVar2 = in_x12;
  do {
    puVar1[-3] = uVar4;
    puVar1[-4] = uVar3;
    puVar1[-1] = uVar4;
    puVar1[-2] = uVar3;
    puVar1[1] = uVar4;
    *puVar1 = uVar3;
    puVar1[3] = uVar4;
    puVar1[2] = uVar3;
    lVar2 = lVar2 + -8;
    puVar1 = puVar1 + 8;
  } while (lVar2 != 0);
  if (in_x11 != in_x12) {
    lVar2 = unaff_x19 - in_x9;
    puVar1 = param_1;
    do {
      param_1 = puVar1 + 1;
      *puVar1 = param_5;
      lVar2 = lVar2 + -1;
      puVar1 = param_1;
    } while (lVar2 != 0);
  }
  *param_1 = param_5;
  *(long *)(param_3 + 0x10) = unaff_x19 + param_4;
  return;
}


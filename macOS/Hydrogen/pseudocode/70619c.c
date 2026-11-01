
void FUN_0070619c(undefined1 param_1 [16],long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 *param_5,undefined1 param_6,undefined8 param_7,undefined8 *param_8)

{
  undefined8 uVar1;
  
  *(long *)(param_2 + 0x30) = param_1._8_8_;
  *(long *)(param_2 + 0x28) = param_1._0_8_;
  uVar1 = *param_5;
  *(undefined8 *)(param_2 + 0x40) = param_5[1];
  *(undefined8 *)(param_2 + 0x38) = uVar1;
  *(undefined1 *)(param_2 + 0x48) = param_6;
  uVar1 = *param_8;
  *(undefined8 *)(param_2 + 0x54) = param_8[1];
  *(undefined8 *)(param_2 + 0x4c) = uVar1;
  return;
}


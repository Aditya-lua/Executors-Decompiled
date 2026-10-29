/* 7ff70c91a380 FUN_7ff70c91a380 */

void FUN_7ff70c91a380(longlong param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                     undefined8 *param_5,undefined1 param_6)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 uStack_2a;
  undefined1 uStack_29;
  undefined8 uStack_28;
  
  uStack_28 = 0xfffffffffffffffe;
  FUN_7ff70ca9ff90(param_1,param_2,&uStack_2a);
  FUN_7ff70ca9ff90(param_1 + 0x20,param_3,&uStack_29);
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x58) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  uVar1 = *param_4;
  uVar2 = param_4[1];
  uVar3 = param_4[3];
  *(undefined8 *)(param_1 + 0x50) = param_4[2];
  *(undefined8 *)(param_1 + 0x58) = uVar3;
  *(undefined8 *)(param_1 + 0x40) = uVar1;
  *(undefined8 *)(param_1 + 0x48) = uVar2;
  param_4[2] = 0;
  param_4[3] = 0xf;
  *(undefined1 *)param_4 = 0;
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined8 *)(param_1 + 0x78) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  uVar1 = *param_5;
  uVar2 = param_5[1];
  uVar3 = param_5[3];
  *(undefined8 *)(param_1 + 0x70) = param_5[2];
  *(undefined8 *)(param_1 + 0x78) = uVar3;
  *(undefined8 *)(param_1 + 0x60) = uVar1;
  *(undefined8 *)(param_1 + 0x68) = uVar2;
  param_5[2] = 0;
  param_5[3] = 0xf;
  *(undefined1 *)param_5 = 0;
  *(undefined1 *)(param_1 + 0x80) = param_6;
  return;
}



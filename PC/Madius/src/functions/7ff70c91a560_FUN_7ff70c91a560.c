/* 7ff70c91a560 FUN_7ff70c91a560 */

void FUN_7ff70c91a560(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  uVar1 = *param_2;
  uVar2 = param_2[1];
  uVar3 = param_2[3];
  param_1[2] = param_2[2];
  param_1[3] = uVar3;
  *param_1 = uVar1;
  param_1[1] = uVar2;
  param_2[2] = 0;
  param_2[3] = 0xf;
  *(undefined1 *)param_2 = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  uVar1 = param_2[4];
  uVar2 = param_2[5];
  uVar3 = param_2[7];
  param_1[6] = param_2[6];
  param_1[7] = uVar3;
  param_1[4] = uVar1;
  param_1[5] = uVar2;
  param_2[6] = 0;
  param_2[7] = 0xf;
  *(undefined1 *)(param_2 + 4) = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  uVar1 = param_2[8];
  uVar2 = param_2[9];
  uVar3 = param_2[0xb];
  param_1[10] = param_2[10];
  param_1[0xb] = uVar3;
  param_1[8] = uVar1;
  param_1[9] = uVar2;
  param_2[10] = 0;
  param_2[0xb] = 0xf;
  *(undefined1 *)(param_2 + 8) = 0;
  param_1[0xe] = 0;
  param_1[0xf] = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  uVar1 = param_2[0xc];
  uVar2 = param_2[0xd];
  uVar3 = param_2[0xf];
  param_1[0xe] = param_2[0xe];
  param_1[0xf] = uVar3;
  param_1[0xc] = uVar1;
  param_1[0xd] = uVar2;
  param_2[0xe] = 0;
  param_2[0xf] = 0xf;
  *(undefined1 *)(param_2 + 0xc) = 0;
  *(undefined1 *)(param_1 + 0x10) = *(undefined1 *)(param_2 + 0x10);
  return;
}



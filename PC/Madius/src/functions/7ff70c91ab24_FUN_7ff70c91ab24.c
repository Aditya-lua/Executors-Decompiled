/* 7ff70c91ab24 FUN_7ff70c91ab24 */

undefined8 *
FUN_7ff70c91ab24(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  
  uVar4 = param_2[1];
  *param_1 = *param_2;
  param_1[1] = uVar4;
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_2 + 2);
  uVar1 = *(undefined4 *)((longlong)param_2 + 0x1c);
  uVar2 = *(undefined4 *)(param_2 + 4);
  uVar3 = *(undefined4 *)((longlong)param_2 + 0x24);
  *(undefined4 *)(param_1 + 3) = *(undefined4 *)(param_2 + 3);
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar1;
  *(undefined4 *)(param_1 + 4) = uVar2;
  *(undefined4 *)((longlong)param_1 + 0x24) = uVar3;
  param_1[5] = param_2[5];
  uVar4 = FUN_7ff70cb12e80();
  param_1[6] = uVar4;
  *(undefined4 *)(param_1 + 7) = *(undefined4 *)(param_2 + 6);
  param_1[8] = &UNK_7ff70cb8add6;
  param_1[9] = 7;
  *(undefined1 *)(param_1 + 0xe) = 0;
  *(undefined1 *)(param_1 + 0x20) = 0;
  param_1[0x23] = 0;
  param_1[0x21] = 0;
  param_1[0x22] = 0;
  param_1[0x24] = param_4;
  uVar4 = *param_3;
  *param_3 = 0;
  param_1[0x25] = uVar4;
  param_1[0x26] = 0;
  FUN_7ff70c91db10(param_3);
  return param_1;
}



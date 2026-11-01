
void FUN_002496d4(undefined8 *param_1,long param_2,uint param_3,int param_4,undefined8 *param_5)

{
  undefined8 uVar1;
  undefined8 uStack0000000000000000;
  uint uStack0000000000000008;
  undefined2 uStack00000000000000b8;
  
  uStack0000000000000008 = (param_3 & 0xff) << 0x10 | param_4 << 0x18 | 1;
  uStack00000000000000b8 = 4;
  uStack0000000000000000 = 0x8000000000000001;
  func_0x00248ae4();
  *(undefined1 *)(param_2 + 0x335) = 1;
  uVar1 = *param_5;
  param_1[2] = param_5[1];
  param_1[1] = uVar1;
  param_1[3] = param_5[2];
  *param_1 = 0x8000000000000019;
  return;
}


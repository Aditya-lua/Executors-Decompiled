
void FUN_00721134(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000000;
  undefined8 uStack_38;
  undefined8 uStack_30;
  
  func_0x00724748(param_1,param_2,param_4,&uStack0000000000000000);
  uStack_38 = 0;
  uStack_30 = 0;
  lVar1 = *(long *)(param_1 + 0x1a8);
  lVar2 = *(long *)(param_1 + 0x1b0);
  uVar3 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x38);
  func_0x00708418(uVar3,param_3,&uStack_38,1,(int)((ulong)(lVar2 - lVar1) >> 4) * -0x55555555 + -1);
  return;
}


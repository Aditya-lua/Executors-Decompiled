
void FUN_0061b8b8(long param_1,undefined8 param_2,long param_3,long param_4,long param_5,
                 long param_6)

{
  byte bVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  
  if (param_1 != param_6) {
    param_6 = param_6 - param_1;
    pbVar2 = (byte *)(param_5 + param_1);
    pbVar3 = (byte *)(param_3 + param_1);
    pbVar4 = (byte *)(param_4 + param_1);
    do {
      bVar1 = *pbVar2;
      *pbVar3 = *pbVar4 ^ bVar1;
      *pbVar4 = bVar1;
      param_6 = param_6 + -1;
      pbVar2 = pbVar2 + 1;
      pbVar3 = pbVar3 + 1;
      pbVar4 = pbVar4 + 1;
    } while (param_6 != 0);
  }
  return;
}


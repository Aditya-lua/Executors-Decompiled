
undefined1  [16] FUN_00429088(long param_1,long *param_2,ulong param_3,int param_4)

{
  ulong uVar1;
  uint uVar2;
  bool bVar3;
  ulong uVar4;
  uint uVar5;
  long in_x9;
  undefined1 auVar6 [16];
  
  uVar4 = *param_2 + in_x9;
  if (in_x9 < 0 == SCARRY8(*param_2,in_x9)) {
    uVar5 = (uint)param_3;
    uVar2 = *(int *)(param_1 + 8) + param_4;
    param_3 = (ulong)uVar2;
    if (uVar5 - 1 < uVar2) {
      bVar3 = SCARRY8(uVar4,1);
      uVar1 = uVar4 + 1;
      if (!bVar3) {
        uVar5 = uVar2 + 0xc4653600;
      }
      param_3 = (ulong)uVar5;
      uVar4 = (ulong)(uVar2 + 0xc4653600);
      if (!bVar3) {
        uVar4 = uVar1;
      }
    }
  }
  auVar6._8_8_ = param_3;
  auVar6._0_8_ = uVar4;
  return auVar6;
}


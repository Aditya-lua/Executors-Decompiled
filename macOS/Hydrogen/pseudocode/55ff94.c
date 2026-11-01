
void FUN_0055ff94(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long lStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  uVar1 = (ulong)(param_2[3] - param_2[1]) >> 3;
  if (*(long *)(param_1 + 0x18) != 0) {
    uVar1 = uVar1 + 1 >> 1;
  }
  if (*(ulong *)(param_1 + 0x10) < uVar1) {
    func_0x007af088(param_1,uVar1,param_1 + 0x20,1);
  }
  uStack_28 = param_2[4];
  uStack_30 = param_2[5];
  uStack_58 = param_2[1];
  uStack_60 = *param_2;
  uStack_48 = param_2[3];
  uStack_50 = param_2[2];
  lStack_38 = param_1;
  func_0x0058fc58(&uStack_60,&lStack_38);
  return;
}



void FUN_00628824(undefined8 param_1,undefined8 param_2,long param_3,ulong param_4)

{
  long lVar1;
  ulong uVar2;
  
  func_0x005fef78(param_1,*(undefined8 *)(param_3 + 0x18),*(undefined8 *)(param_3 + 0x10),0,1);
  uVar2 = *(long *)(param_3 + 0x10) * 8;
  lVar1 = uVar2 - param_4;
  if (param_4 <= uVar2 && lVar1 != 0) {
    func_0x006078e0(param_1,lVar1);
  }
  return;
}


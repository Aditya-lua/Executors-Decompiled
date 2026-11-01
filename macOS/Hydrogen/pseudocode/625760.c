
void FUN_00625760(undefined8 param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  ulong uVar2;
  ulong unaff_x20;
  
  func_0x005fef78(param_1,*(undefined8 *)(param_3 + 0x18),*(undefined8 *)(param_3 + 0x10),0,1);
  uVar2 = *(long *)(param_3 + 0x10) * 8;
  lVar1 = uVar2 - unaff_x20;
  if (unaff_x20 <= uVar2 && lVar1 != 0) {
    func_0x006078e0(param_1,lVar1);
  }
  return;
}


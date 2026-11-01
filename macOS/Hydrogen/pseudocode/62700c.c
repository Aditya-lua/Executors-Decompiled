
void FUN_0062700c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  long extraout_x1;
  undefined8 extraout_x8;
  ulong uVar2;
  
  func_0x00087574();
  __Unwind_Resume();
  func_0x005fef78(extraout_x8,*(undefined8 *)(extraout_x1 + 0x18),
                  *(undefined8 *)(extraout_x1 + 0x10),0,1);
  uVar2 = *(long *)(extraout_x1 + 0x10) * 8;
  lVar1 = uVar2 - param_3;
  if (param_3 <= uVar2 && lVar1 != 0) {
    func_0x006078e0(extraout_x8,lVar1);
  }
  return;
}


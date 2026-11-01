
void FUN_0061b700(long param_1)

{
  int iVar1;
  ulong uVar2;
  long unaff_x19;
  long *unaff_x20;
  
  iVar1 = (**(code **)(param_1 + 0x40))();
  if (iVar1 < 4) {
    func_0x005eede0();
    (**(code **)(*unaff_x20 + 0x48))();
  }
  uVar2 = (**(code **)(*unaff_x20 + 0x18))();
  *(ulong *)(unaff_x19 + 0x10) = uVar2 & 0xffffffff;
  return;
}


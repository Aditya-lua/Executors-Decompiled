
undefined8 FUN_007468dc(long param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  
  if (param_1 != 0) {
    return 8;
  }
  if ((param_4 == 0x14e) || (param_4 == 0xea)) {
    uVar2 = func_0x007315f4();
    if (((uVar2 & 1) == 0) && (iVar1 = func_0x00794ee8(), iVar1 != 0)) {
      return 0x40;
    }
    uVar3 = func_0x007311c4();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    *(ulong *)(unaff_x20 + 0x398) = *(ulong *)(unaff_x20 + 0x398) & 0xfffffffffff9ffff | 0x40000;
  }
  else {
    if (*(int *)(unaff_x20 + 0x4f0) < 1) {
      *(int *)(unaff_x20 + 0x4f0) = *(int *)(unaff_x20 + 0x4f0) + 1;
      *(int *)(unaff_x20 + 0x4e8) = *(int *)(unaff_x20 + 0x4e8) + *(int *)(unaff_x20 + 0x4ec);
      uVar3 = func_0x0076e34c();
      return uVar3;
    }
    if (1 < *(byte *)(unaff_x19 + 0xa14)) {
      return 0x40;
    }
  }
  uVar3 = func_0x007474fc();
  return uVar3;
}



void FUN_0059c4a0(ulong param_1,long *param_2,long param_3)

{
  bool bVar1;
  long in_x9;
  ulong uVar2;
  ulong in_stack_00000000;
  uint uStack0000000000000008;
  
  bVar1 = *(long *)(param_3 + 0x60) == in_x9;
  if (bVar1) {
    in_stack_00000000 = param_1;
  }
  uStack0000000000000008 = (uint)bVar1;
  uVar2 = (ulong)(*(long *)(param_3 + 0x80) - *(long *)(param_3 + 0x70)) >> 3;
  *param_2 = uVar2 + param_1;
  param_2[1] = (ulong)(uStack0000000000000008 & (CARRY8(in_stack_00000000,uVar2) ^ 1));
  param_2[2] = uVar2 + in_stack_00000000;
  return;
}


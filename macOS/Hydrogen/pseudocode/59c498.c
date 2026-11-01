
void FUN_0059c498(ulong param_1,long *param_2,long param_3)

{
  uint uVar1;
  ulong uVar2;
  ulong in_stack_00000000;
  
  if ((*(long *)(param_3 + 0x58) == 0) || (*(long *)(param_3 + 0x60) == *(long *)(param_3 + 0x58)))
  {
    uVar1 = 1;
    in_stack_00000000 = param_1;
  }
  else {
    uVar1 = 0;
  }
  uVar2 = (ulong)(*(long *)(param_3 + 0x80) - *(long *)(param_3 + 0x70)) >> 3;
  *param_2 = uVar2 + param_1;
  param_2[1] = (ulong)(uVar1 & (CARRY8(in_stack_00000000,uVar2) ^ 1));
  param_2[2] = uVar2 + in_stack_00000000;
  return;
}


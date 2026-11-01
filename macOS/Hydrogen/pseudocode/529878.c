
void FUN_00529878(ulong *param_1,long param_2)

{
  ulong in_x9;
  ulong uVar1;
  long in_x10;
  
  uVar1 = in_x9 >> 4;
  if (in_x10 != 0) {
    uVar1 = uVar1 + ((ulong)(*(long *)(param_2 + 0x18) - in_x10) >> 4);
  }
  *param_1 = uVar1;
  param_1[1] = 1;
  param_1[2] = uVar1;
  return;
}


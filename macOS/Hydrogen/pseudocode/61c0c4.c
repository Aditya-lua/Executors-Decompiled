
void FUN_0061c0c4(code *param_1)

{
  ulong uVar1;
  long unaff_x21;
  long *unaff_x22;
  
  (*param_1)();
  uVar1 = (**(code **)(*unaff_x22 + 0x18))();
  *(ulong *)(unaff_x21 + 0x68) = uVar1 & 0xffffffff;
  return;
}


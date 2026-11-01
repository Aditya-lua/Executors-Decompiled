
ulong FUN_005d3ee0(undefined8 *param_1,long param_2)

{
  int iVar1;
  ulong uVar2;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  
  while( true ) {
    iVar1 = func_0x005ab01c(param_1,param_2);
    param_2 = unaff_x20 + 0x40;
    unaff_x22 = unaff_x22 + -0x40;
    if (((iVar1 != 0) || (unaff_x19 = (ulong)(unaff_x22 != 0), unaff_x22 == 0)) ||
       (uVar2 = (**(code **)(uStack0000000000000008[1] + 0x18))(*uStack0000000000000008),
       (uVar2 & 1) != 0)) break;
    param_1 = &uStack0000000000000008;
    unaff_x20 = param_2;
  }
  return unaff_x19;
}


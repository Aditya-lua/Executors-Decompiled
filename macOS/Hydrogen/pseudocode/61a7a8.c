
void FUN_0061a7a8(ulong param_1,undefined1 param_2 [16])

{
  ulong uVar1;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x22;
  ulong unaff_x24;
  undefined2 uVar2;
  
  uVar2 = NEON_uaddlv(param_2._0_8_,1);
  uVar1 = 0;
  if (unaff_x24 != 0) {
    uVar1 = in_x9 / unaff_x24;
  }
  uVar1 = uVar1 * unaff_x24;
  if (CONCAT22(param_2._2_2_,uVar2) == 1) {
    uVar1 = in_x9 & param_1;
  }
  (**(code **)(*unaff_x22 + 0x30))();
  _memcpy();
  *(ulong *)(unaff_x20 + 0x38) = uVar1 - unaff_x19;
  return;
}



undefined8 FUN_00261b9c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  long unaff_x23;
  long unaff_x24;
  long lVar3;
  undefined8 uStack0000000000000018;
  undefined8 *puStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  puStack0000000000000020 = &uStack0000000000000040;
  uStack0000000000000018 = param_1;
  uStack0000000000000028 = param_1;
  lStack0000000000000030 = unaff_x23 + 0x1d0;
  uStack0000000000000038 = param_1;
  uVar1 = func_0x0046849c(param_2,param_3,(long)register0x00000008 + 0x10);
  if ((uVar1 & 1) == 0) {
    lVar3 = unaff_x24 + -1;
    if (lVar3 != 0) {
      do {
        uVar1 = func_0x0046920c();
        if ((uVar1 & 1) != 0) goto LAB_00261c70;
        uStack0000000000000018 = 1;
        uStack0000000000000038 = 1;
        uStack0000000000000028 = 1;
        puStack0000000000000020 = &uStack0000000000000040;
        lStack0000000000000030 = unaff_x23 + 0x1d0;
        uStack0000000000000040 = (long)register0x00000008 + 8;
        uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],(long)register0x00000008 + 0x10);
        if ((uVar1 & 1) != 0) goto LAB_00261c70;
        lVar3 = lVar3 + -1;
      } while (lVar3 != 0);
    }
    uVar2 = func_0x0046920c();
  }
  else {
LAB_00261c70:
    uVar2 = 1;
  }
  return uVar2;
}


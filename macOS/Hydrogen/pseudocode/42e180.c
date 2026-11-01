
undefined8 FUN_0042e180(undefined8 *param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long *unaff_x26;
  long unaff_x29;
  undefined1 uStack0000000000000060;
  long lStack0000000000000070;
  
  lStack0000000000000070 = unaff_x29 + -0x60;
  uVar1 = func_0x0046849c(*param_1,param_1[1],&uStack0000000000000060);
  if ((((uVar1 & 1) == 0) && (uVar1 = func_0x0046920c(*unaff_x19,&UNK_00886c1e,1), (uVar1 & 1) == 0)
      ) && ((*unaff_x26 == 2 ||
            (((unaff_x22 & 1) == 0 || (uVar1 = func_0x0042e214(), (uVar1 & 1) == 0)))))) {
    uVar2 = 0;
    *(long *)(unaff_x21 + 8) = unaff_x20 + 1;
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}


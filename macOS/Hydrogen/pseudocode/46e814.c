
undefined1 FUN_0046e814(void)

{
  int iVar1;
  ulong uVar2;
  ushort unaff_w22;
  short unaff_w23;
  long unaff_x24;
  ushort unaff_w25;
  ushort uVar3;
  undefined1 uStack0000000000000050;
  
  do {
    unaff_w25 = unaff_w25 + 1;
    uVar2 = (**(code **)(unaff_x24 + 0x20))();
    if ((uVar2 & 1) != 0) {
      return 1;
    }
  } while (unaff_w25 < unaff_w22);
  uVar2 = func_0x0046e888(&uStack0000000000000050);
  if ((uVar2 & 1) == 0) {
    uVar3 = 0;
    do {
      if ((ushort)(unaff_w23 - unaff_w22) <= uVar3) {
        return 0;
      }
      uVar3 = uVar3 + 1;
      iVar1 = (**(code **)(unaff_x24 + 0x20))();
    } while (iVar1 == 0);
  }
  return 1;
}


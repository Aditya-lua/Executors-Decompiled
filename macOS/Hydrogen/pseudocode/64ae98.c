
long FUN_0064ae98(long param_1)

{
  long extraout_x1;
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  
  lStack0000000000000020 = unaff_x23 + unaff_x24 * param_1;
  lStack0000000000000030 = unaff_x23 + unaff_x25 * param_1;
  lStack0000000000000028 = lStack0000000000000020;
  func_0x005fe0b4(lStack0000000000000020);
  func_0x005fe0b4(unaff_x23 + unaff_x24 * 0x70 + 0x30,unaff_x20 + 0x30);
  lVar1 = unaff_x23 + unaff_x24 * 0x70;
  uVar3 = *(undefined8 *)(unaff_x20 + 0x60);
  *(undefined8 *)(lVar1 + 0x68) = *(undefined8 *)(unaff_x20 + 0x68);
  *(undefined8 *)(lVar1 + 0x60) = uVar3;
  lStack0000000000000028 = lStack0000000000000028 + 0x70;
  func_0x0064aa98();
  lVar1 = lStack0000000000000028;
  lVar2 = unaff_x19[2];
  lVar5 = unaff_x19[1];
  lVar4 = *unaff_x19;
  *unaff_x19 = extraout_x1;
  unaff_x19[2] = lStack0000000000000030;
  unaff_x19[1] = lStack0000000000000028;
  lStack0000000000000020 = lVar4;
  lStack0000000000000028 = lVar5;
  lStack0000000000000030 = lVar2;
  func_0x0064ad04((long)register0x00000008 + 0x18,lVar4);
  if (lVar4 != 0) {
    __ZdlPv();
  }
  return lVar1;
}



undefined8 FUN_007616d4(void)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  long unaff_x20;
  long lVar4;
  long in_stack_00000008;
  
  uVar3 = func_0x00774234();
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  lVar4 = *(long *)(in_stack_00000008 + 0x10);
  *(long *)(lVar4 + 0x20) = unaff_x20;
  uVar1 = (*(uint *)(unaff_x20 + 0x14) & 2) << 1;
  *(undefined8 *)(unaff_x20 + 0xa0) = 0;
  *(undefined8 *)(unaff_x20 + 0xa8) = 0;
  *(undefined8 *)(unaff_x20 + 0x98) = 0;
  if ((uVar1 < *(uint *)(unaff_x20 + 0x78)) &&
     ((*(code **)(unaff_x20 + 0x28) == (code *)0x0 ||
      (iVar2 = (**(code **)(unaff_x20 + 0x28))(*(undefined8 *)(unaff_x20 + 0x38),0,0), iVar2 != 0)))
     ) {
    *(undefined8 *)(unaff_x20 + 0x1b0) = 1;
    func_0x007742f4();
    return 0x41;
  }
  *(uint *)(unaff_x20 + 0x78) = uVar1;
  *(undefined8 *)(unaff_x20 + 0x80) = 0;
  *(undefined8 *)(unaff_x20 + 0x88) = 0;
  *(undefined8 *)(unaff_x20 + 0x1b0) = 1;
  uVar3 = func_0x007617a8(*(undefined8 *)(lVar4 + 0x20));
  *(undefined8 *)(lVar4 + 0x28) = uVar3;
  uVar3 = func_0x007747bc();
  return uVar3;
}


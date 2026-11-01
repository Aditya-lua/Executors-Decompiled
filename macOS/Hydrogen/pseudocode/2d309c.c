
undefined8 FUN_002d309c(ulong param_1)

{
  int iVar1;
  long unaff_x19;
  long *unaff_x20;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  if ((param_1 & 1) == 0) {
    iVar1 = (**(code **)(*unaff_x20 + 0x70))();
    if (((iVar1 != 0) && (iVar1 = (**(code **)(*unaff_x20 + 0x70))(), iVar1 != 0)) &&
       (iVar1 = func_0x002c8858(), iVar1 != 0)) {
      *(undefined8 *)(unaff_x19 + 0x20) = in_stack_00000018;
      *(undefined8 *)(unaff_x19 + 0x18) = in_stack_00000010;
      *(undefined8 *)(unaff_x19 + 0x30) = in_stack_00000028;
      *(undefined8 *)(unaff_x19 + 0x28) = in_stack_00000020;
      *(undefined8 *)(unaff_x19 + 0x40) = in_stack_00000038;
      *(undefined8 *)(unaff_x19 + 0x38) = in_stack_00000030;
      *(undefined8 *)(unaff_x19 + 0x48) = in_stack_00000040;
      *(undefined8 *)(unaff_x19 + 0x10) = in_stack_00000008;
      *(undefined8 *)(unaff_x19 + 8) = in_stack_00000000;
      *(undefined8 *)(unaff_x19 + 0x90) = in_stack_00000088;
      *(undefined8 *)(unaff_x19 + 0x78) = in_stack_00000070;
      *(undefined8 *)(unaff_x19 + 0x70) = in_stack_00000068;
      *(undefined8 *)(unaff_x19 + 0x88) = in_stack_00000080;
      *(undefined8 *)(unaff_x19 + 0x80) = in_stack_00000078;
      *(undefined8 *)(unaff_x19 + 0x58) = in_stack_00000050;
      *(undefined8 *)(unaff_x19 + 0x50) = in_stack_00000048;
      *(undefined8 *)(unaff_x19 + 0x68) = in_stack_00000060;
      *(undefined8 *)(unaff_x19 + 0x60) = in_stack_00000058;
      lVar2 = unaff_x20[0x14];
      *(long *)(unaff_x19 + 0xa0) = unaff_x20[0x15];
      *(long *)(unaff_x19 + 0x98) = lVar2;
      lVar3 = unaff_x20[0x17];
      lVar2 = unaff_x20[0x16];
      lVar5 = unaff_x20[0x19];
      lVar4 = unaff_x20[0x18];
      lVar7 = unaff_x20[0x1b];
      lVar6 = unaff_x20[0x1a];
      *(long *)(unaff_x19 + 0xd8) = unaff_x20[0x1c];
      *(long *)(unaff_x19 + 0xd0) = lVar7;
      *(long *)(unaff_x19 + 200) = lVar6;
      *(long *)(unaff_x19 + 0xc0) = lVar5;
      *(long *)(unaff_x19 + 0xb8) = lVar4;
      *(long *)(unaff_x19 + 0xb0) = lVar3;
      *(long *)(unaff_x19 + 0xa8) = lVar2;
      return 1;
    }
  }
  else {
    func_0x0028f83c(0xf,0,0x6d,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x9f);
  }
  func_0x002c939c();
  return 0;
}


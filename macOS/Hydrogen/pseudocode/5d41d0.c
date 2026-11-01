
undefined8 FUN_005d41d0(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  
  lVar1 = *(long *)(param_1 + 8);
  lVar2 = *(long *)(param_1 + 0x10);
  *(long *)(unaff_x29 + -0x30) = lVar1;
  *(long *)(unaff_x29 + -0x28) = lVar1 + lVar2 * 8;
  func_0x005bd894(&uStack0000000000000048,unaff_x29 + -0x30,&UNK_008b608c,2);
  in_stack_00000040 = &DAT_005d41a8;
  uStack0000000000000008 = &UNK_009f2ed0;
  in_stack_00000010 = 2;
  in_stack_00000018 = &uStack0000000000000038;
  in_stack_00000020 = 1;
  in_stack_00000028 = 0;
  uStack0000000000000038 = &uStack0000000000000048;
  uVar3 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000008);
  if (uStack0000000000000048 != 0) {
    func_0x00187bd4(in_stack_00000050,uStack0000000000000048,1);
  }
  return uVar3;
}


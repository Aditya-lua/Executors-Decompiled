
undefined8 FUN_005c87ac(undefined8 param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  uint in_w9;
  ulong uVar5;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  long in_stack_00000070;
  undefined *in_stack_00000078;
  long in_stack_00000080;
  undefined *in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
  *(ulong *)(unaff_x29 + -0x68) = (ulong)(in_w9 & 0xffff | 0xe0000000);
  *(undefined8 **)(unaff_x29 + -0x78) = &uStack0000000000000060;
  *(undefined **)(unaff_x29 + -0x70) = &UNK_009f2700;
  iVar3 = func_0x005c8344(param_1,unaff_x29 + -0x78);
  if (iVar3 != 0) {
    func_0x007a2810(&UNK_008b56a9,0x37,&uStack0000000000000030,&UNK_009f2748,&UNK_009f2730);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5c88e4);
    (*pcVar2)();
  }
  unaff_x20[1] = in_stack_00000068;
  *unaff_x20 = uStack0000000000000060;
  in_stack_000000a0 = in_stack_00000070;
  *(undefined8 *)(unaff_x29 + -0xa0) = 1;
  *(undefined8 *)(unaff_x29 + -0x98) = 0;
  lVar1 = *(long *)(unaff_x22 + 0x10);
  uVar4 = *(undefined8 *)(unaff_x22 + 0x18);
  if (lVar1 == 0) {
    unaff_x21 = 0;
  }
  uVar5 = (ulong)(lVar1 != 0);
  *(ulong *)(unaff_x29 + -0x78) = uVar5;
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  *(long *)(unaff_x29 + -0x68) = lVar1;
  *(undefined8 *)(unaff_x29 + -0x60) = uVar4;
  *(ulong *)(unaff_x29 + -0x58) = uVar5;
  *(undefined8 *)(unaff_x29 + -0x50) = 0;
  *(long *)(unaff_x29 + -0x48) = lVar1;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar4;
  *(undefined8 *)(unaff_x29 + -0x38) = unaff_x21;
  func_0x005d3050(unaff_x29 + -0x90,unaff_x29 + -0x78,&UNK_008b5821,2);
  uStack0000000000000060 = &uStack0000000000000090;
  in_stack_00000068 = &DAT_005c73c0;
  in_stack_00000070 = unaff_x29 + -0xa0;
  in_stack_00000078 = &DAT_005d1a0c;
  in_stack_00000088 = &DAT_005c73c0;
  uStack0000000000000030 = (undefined8 *)&UNK_009f2860;
  in_stack_00000038 = (undefined *)0x4;
  in_stack_00000040 = &uStack0000000000000060;
  in_stack_00000048 = 3;
  in_stack_00000050 = 0;
  in_stack_00000080 = unaff_x29 + -0x90;
  func_0x00459f08(&uStack0000000000000018,&uStack0000000000000030);
  if (*(long *)(unaff_x29 + -0x90) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),*(long *)(unaff_x29 + -0x90),1);
  }
  if (uStack0000000000000090 != 0) {
    func_0x00187bd4(in_stack_00000098,uStack0000000000000090,1);
  }
  in_stack_00000068 = (undefined *)in_stack_00000020;
  uStack0000000000000060 = (undefined8 *)uStack0000000000000018;
  in_stack_00000070 = in_stack_00000028;
  uStack0000000000000030 = &uStack0000000000000060;
  in_stack_00000038 = &DAT_005d2920;
  *(undefined **)(unaff_x29 + -0x78) = &UNK_007fc120;
  *(undefined8 *)(unaff_x29 + -0x70) = 1;
  *(undefined8 *)(unaff_x29 + -0x60) = 1;
  *(undefined8 *)(unaff_x29 + -0x58) = 0;
  *(undefined8 **)(unaff_x29 + -0x68) = &uStack0000000000000030;
  uVar4 = func_0x0046849c(*unaff_x19,unaff_x19[1],unaff_x29 + -0x78);
  if ((uStack0000000000000060 != (undefined8 *)0x8000000000000000) &&
     (uStack0000000000000060 != (undefined8 *)0x0)) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060,1);
  }
  return uVar4;
}


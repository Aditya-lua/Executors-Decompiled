
void FUN_0022b444(undefined1 param_1 [16],undefined1 param_2 [16])

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined1 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000130;
  undefined8 uStack0000000000000138;
  undefined8 uStack0000000000000140;
  undefined8 uStack0000000000000148;
  undefined8 uStack0000000000000150;
  undefined8 uStack0000000000000158;
  undefined8 uStack0000000000000160;
  undefined8 uStack0000000000000168;
  undefined8 uStack0000000000000170;
  
  *(long *)(unaff_x23 + 0x90) = param_2._8_8_;
  *(long *)(unaff_x23 + 0x88) = param_2._0_8_;
  uVar4 = unaff_x19[0xc];
  uVar6 = unaff_x19[0xf];
  uVar5 = unaff_x19[0xe];
  *(undefined8 *)(unaff_x23 + 0xa0) = unaff_x19[0xd];
  *(undefined8 *)(unaff_x23 + 0x98) = uVar4;
  *(undefined8 *)(unaff_x23 + 0xb0) = uVar6;
  *(undefined8 *)(unaff_x23 + 0xa8) = uVar5;
  uStack0000000000000138 = unaff_x19[5];
  uStack0000000000000130 = unaff_x19[4];
  uVar4 = unaff_x19[6];
  *(undefined8 *)(unaff_x23 + 0x70) = unaff_x19[7];
  *(undefined8 *)(unaff_x23 + 0x68) = uVar4;
  uVar4 = unaff_x19[0x18];
  *(undefined8 *)(unaff_x23 + 0x100) = unaff_x19[0x19];
  *(undefined8 *)(unaff_x23 + 0xf8) = uVar4;
  uStack0000000000000118 = unaff_x19[1];
  _uStack0000000000000110 = *unaff_x19;
  uStack0000000000000128 = unaff_x19[3];
  uStack0000000000000120 = unaff_x19[2];
  uStack0000000000000158 = in_stack_000000e8;
  uStack0000000000000150 = in_stack_000000e0;
  uStack0000000000000168 = in_stack_000000f8;
  uStack0000000000000160 = in_stack_000000f0;
  uStack0000000000000170 = in_stack_00000100;
  uStack0000000000000148 = in_stack_000000d8;
  uStack0000000000000140 = in_stack_000000d0;
  lVar3 = func_0x00187bd0(0x1d0,8);
  if (lVar3 == 0) {
    func_0x007a1f18(8,0x1d0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x22b5f4);
    (*pcVar2)();
  }
  _memcpy(lVar3,&uStack0000000000000110,0x1d0);
  unaff_x21[1] = lVar3;
  unaff_x21[2] = &UNK_009c8628;
  *unaff_x21 = 0x8000000000000027;
  if (in_stack_00000020 == -0x8000000000000000) {
    plVar1 = (long *)(unaff_x22 + 8);
    lVar3 = *plVar1;
  }
  else {
    if (in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020,1);
    }
    if (in_stack_00000038 != 0) {
      func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
    }
    plVar1 = (long *)(unaff_x22 + 0x30);
    lVar3 = *plVar1;
  }
  if (lVar3 != 0) {
    func_0x00187bd4(plVar1[1],lVar3,1);
  }
  func_0x0022200c();
  func_0x00187bd4();
  return;
}


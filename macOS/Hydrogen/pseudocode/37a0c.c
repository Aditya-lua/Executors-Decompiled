
undefined8 FUN_00037a0c(long *param_1)

{
  int iVar1;
  long *plVar2;
  undefined8 uVar3;
  long unaff_x29;
  undefined8 uStack0000000000000060;
  undefined7 in_stack_00000068;
  undefined4 uStack000000000000006f;
  undefined1 uStack0000000000000073;
  char cStack0000000000000077;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x80,(long)param_1 + *(long *)(*param_1 + -0x18));
  plVar2 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (unaff_x29 + -0x80,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar2 + 0x38))(plVar2,10);
  __ZNSt3__16localeD1Ev(unaff_x29 + -0x80);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(param_1,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(param_1);
  func_0x006e69bc();
  iVar1 = func_0x006e22d0();
  if (iVar1 == 0) {
    func_0x006e1c18();
  }
  func_0x006e4118();
  func_0x006e4118();
  func_0x006e2154();
  func_0x006e45a4();
  func_0x006e41a4();
  func_0x006e4a40();
  func_0x006e2154();
  func_0x006e45a4();
  cStack0000000000000077 = '\x13';
  in_stack_00000068 = s_return_do_wrap______008cfa99._8_7_;
  uStack000000000000006f = CONCAT31(0x292e2e,s_return_do_wrap______008cfa99[0xf]);
  uStack0000000000000060._0_1_ = s_return_do_wrap______008cfa99[0];
  uStack0000000000000060._1_1_ = s_return_do_wrap______008cfa99[1];
  uStack0000000000000060._2_1_ = s_return_do_wrap______008cfa99[2];
  uStack0000000000000060._3_1_ = s_return_do_wrap______008cfa99[3];
  uStack0000000000000060._4_1_ = s_return_do_wrap______008cfa99[4];
  uStack0000000000000060._5_1_ = s_return_do_wrap______008cfa99[5];
  uStack0000000000000060._6_1_ = s_return_do_wrap______008cfa99[6];
  uStack0000000000000060._7_1_ = s_return_do_wrap______008cfa99[7];
  uStack0000000000000073 = 0;
  *(undefined2 *)(unaff_x29 + -0x80) = 0;
  *(undefined1 *)(unaff_x29 + -0x78) = 0;
  *(undefined1 *)(unaff_x29 + -0x30) = 0;
  *(undefined2 *)(unaff_x29 + -0x28) = 0;
  func_0x006bd97c(&uStack0000000000000078,&uStack0000000000000060);
  if (*(char *)(unaff_x29 + -0x30) != '\0') {
    if (*(long *)(unaff_x29 + -0x50) != 0) {
      *(long *)(unaff_x29 + -0x48) = *(long *)(unaff_x29 + -0x50);
      __ZdlPv();
    }
    if (*(long *)(unaff_x29 + -0x78) != 0) {
      __ZdlPv();
    }
  }
  if (cStack0000000000000077 < '\0') {
    __ZdlPv(uStack0000000000000060);
  }
  func_0x00700e1c();
  func_0x006e1e34();
  func_0x006e1e44();
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
    return 1;
  }
  return 1;
}


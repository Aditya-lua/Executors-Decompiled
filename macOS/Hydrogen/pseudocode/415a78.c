
void FUN_00415a78(void)

{
  undefined4 uVar1;
  long lVar2;
  bool in_ZR;
  int iVar3;
  undefined8 uVar4;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  long lStack0000000000000080;
  undefined8 uStack0000000000000088;
  
  if (in_ZR) {
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = in_stack_00000028;
    return;
  }
  uVar1 = uStack0000000000000020._4_4_;
  *(undefined8 *)(unaff_x21 + 0x78) = 0;
  *(undefined8 *)(unaff_x21 + 0x70) = 0;
  *(undefined8 *)(unaff_x21 + 0x88) = 0;
  *(undefined8 *)(unaff_x21 + 0x80) = 0;
  uStack0000000000000078 = 0;
  uStack0000000000000070 = 0;
  uStack0000000000000088 = 0;
  lStack0000000000000080 = 0;
  uStack0000000000000058 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000068 = 0;
  uStack0000000000000060 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000048 = 0;
  uStack0000000000000040 = 0;
  in_stack_00000028 = 0;
  uStack0000000000000020 = 0;
  iVar3 = _fstat(uVar1,&uStack0000000000000020);
  lVar2 = lStack0000000000000080;
  if (iVar3 == -1) {
    ___error();
    uVar4 = 0;
    uStack0000000000000008 = 0;
    in_stack_00000010 = 1;
    in_stack_00000018 = 0;
  }
  else {
    uVar4 = 1;
    uStack0000000000000008 = 0;
    in_stack_00000010 = 1;
    in_stack_00000018 = 0;
    unaff_x21 = lVar2;
    if (lStack0000000000000080 != 0) {
      if (-1 < lStack0000000000000080) {
        in_stack_00000028 = 0;
        func_0x0079a108(unaff_x29 + -0x38,1,lStack0000000000000080,&uStack0000000000000020);
        if (*(int *)(unaff_x29 + -0x38) != 1) {
          in_stack_00000010 = *(long *)(unaff_x29 + -0x30);
          uStack0000000000000008 = lVar2;
          uVar4 = 1;
          goto LAB_00415b30;
        }
      }
      *unaff_x20 = -0x8000000000000000;
      unaff_x20[1] = 0x2600000003;
      goto LAB_00415b78;
    }
  }
LAB_00415b30:
  auVar5 = func_0x0041e6c8(uVar1,&uStack0000000000000008,uVar4,unaff_x21);
  if ((auVar5._0_8_ & 1) == 0) {
    unaff_x20[1] = in_stack_00000010;
    *unaff_x20 = uStack0000000000000008;
    unaff_x20[2] = in_stack_00000018;
  }
  else {
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = auVar5._8_8_;
    if (uStack0000000000000008 != 0) {
      func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
    }
  }
LAB_00415b78:
  _close(uVar1);
  return;
}



void FUN_007182b8(void)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long unaff_x20;
  undefined8 unaff_x22;
  long lVar7;
  undefined4 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  
  uVar3 = uStack0000000000000030._4_4_;
  uVar8 = (undefined4)uStack0000000000000030;
  uStack0000000000000030._0_4_ = (undefined4)unaff_x22;
  uVar2 = (undefined4)uStack0000000000000030;
  uStack0000000000000030._4_4_ = (undefined4)((ulong)unaff_x22 >> 0x20);
  uVar4 = uStack0000000000000030._4_4_;
  if (*(int *)(unaff_x20 + 0x80) == 0x5d) {
    uStack0000000000000038 = (undefined4)*(undefined8 *)(unaff_x20 + 0x8c);
    uStack000000000000003c = (undefined4)((ulong)*(undefined8 *)(unaff_x20 + 0x8c) >> 0x20);
    func_0x007181dc();
    if (cRam0000000000a337d0 != '\0') {
      uStack0000000000000038 = (undefined4)*(undefined8 *)(unaff_x20 + 0x8c);
      uStack000000000000003c = (undefined4)((ulong)*(undefined8 *)(unaff_x20 + 0x8c) >> 0x20);
      uStack0000000000000030._0_4_ = uVar2;
      uStack0000000000000030._4_4_ = uVar4;
      uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
      uStack0000000000000060 =
           func_0x007058b4(uVar5,&uStack0000000000000030,3,*(undefined8 *)(unaff_x29 + -0x60),
                           *(undefined8 *)(unaff_x29 + -0x58),*(undefined8 *)(unaff_x20 + 0x128));
      func_0x00711dac();
    }
    iVar1 = *(int *)(unaff_x20 + 0x80);
joined_r0x007185ac:
    uStack0000000000000030._4_4_ = uVar2;
    uStack0000000000000038 = uVar4;
    if (iVar1 == 0x5d) {
      func_0x00710d48();
    }
    else {
      func_0x00721808();
      func_0x007244d4();
    }
    return;
  }
  uStack0000000000000030._0_4_ = uVar8;
  uStack0000000000000030._4_4_ = uVar3;
  if (*(int *)(unaff_x20 + 0x80) != 0x119) goto code_r0x007183b4;
code_r0x00718388:
  uVar5 = *(undefined8 *)(unaff_x20 + 0x98);
  uVar9 = *(undefined8 *)(unaff_x20 + 0x84);
  uVar10 = *(undefined8 *)(unaff_x20 + 0x8c);
  func_0x00710d48();
  iVar1 = *(int *)(unaff_x20 + 0x80);
  uStack0000000000000060 = uVar9;
  in_stack_00000068 = uVar10;
  if (1 < iVar1 - 0x116U) goto code_r0x007183e4;
LAB_007183f4:
  func_0x0071860c(&uStack0000000000000030);
  if (CONCAT44(uStack000000000000003c,uStack0000000000000038) != 0) {
    puVar11 = (undefined8 *)
              CONCAT44(uStack0000000000000030._4_4_,(undefined4)uStack0000000000000030);
    lVar7 = CONCAT44(uStack000000000000003c,uStack0000000000000038) << 3;
    do {
      uVar9 = *puVar11;
      uVar6 = func_0x007086b0(uVar9);
      if (((uVar6 & 1) == 0) && (uVar6 = func_0x007086f8(uVar9), (uVar6 & 1) == 0)) {
        func_0x007181dc();
      }
      puVar11 = puVar11 + 1;
      lVar7 = lVar7 + -8;
    } while (lVar7 != 0);
  }
  uVar6 = func_0x00717f28();
  if (cRam0000000000a337d0 == '\0') {
    if ((uVar6 & 0xff00000000) == 0) goto code_r0x007184f0;
    uStack0000000000000018 = uStack0000000000000060;
    in_stack_00000020 = in_stack_00000048;
    uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
    in_stack_00000028 =
         func_0x00705878(uVar5,&uStack0000000000000018,uVar6,
                         CONCAT44(uStack0000000000000030._4_4_,(undefined4)uStack0000000000000030),
                         CONCAT44(uStack000000000000003c,uStack0000000000000038));
  }
  else {
    uStack0000000000000018 = uStack0000000000000060;
    in_stack_00000020 = in_stack_00000048;
    uVar8 = 3;
    if ((uVar6 & 0xff00000000) != 0) {
      uVar8 = (undefined4)uVar6;
    }
    uVar9 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
    in_stack_00000028 =
         func_0x007058b4(uVar9,&uStack0000000000000018,uVar8,
                         CONCAT44(uStack0000000000000030._4_4_,(undefined4)uStack0000000000000030),
                         CONCAT44(uStack000000000000003c,uStack0000000000000038),uVar5);
  }
  do {
    func_0x00711dac();
code_r0x007184f0:
    do {
      iVar1 = *(int *)(unaff_x20 + 0x80);
      if (iVar1 != 0x2c) goto joined_r0x007185ac;
      func_0x00710d48();
      if (*(int *)(unaff_x20 + 0x80) == 0x119) goto code_r0x00718388;
code_r0x007183b4:
      func_0x0072415c();
      uStack0000000000000060 = *(undefined8 *)(unaff_x20 + 0x84);
      uVar5 = *(undefined8 *)(unaff_x20 + 0x128);
      iVar1 = *(int *)(unaff_x20 + 0x80);
      in_stack_00000068 = uStack0000000000000060;
      if (iVar1 - 0x116U < 2) goto LAB_007183f4;
code_r0x007183e4:
      if (iVar1 == 0x7b) goto LAB_007183f4;
      if (iVar1 == 0x28) goto LAB_007183f4;
      uVar6 = func_0x00717f28();
      if (cRam0000000000a337d0 != '\0') {
        uVar8 = 3;
        if ((uVar6 & 0xff00000000) != 0) {
          uVar8 = (undefined4)uVar6;
        }
        uVar9 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
        uVar5 = func_0x007058b4(uVar9,&uStack0000000000000060,uVar8,
                                *(undefined8 *)(unaff_x29 + -0x60),
                                *(undefined8 *)(unaff_x29 + -0x58),uVar5);
        goto code_r0x0071858c;
      }
    } while ((uVar6 & 0xff00000000) == 0);
    uVar5 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
    uVar5 = func_0x00705878(uVar5,&uStack0000000000000060,uVar6,*(undefined8 *)(unaff_x29 + -0x60),
                            *(undefined8 *)(unaff_x29 + -0x58));
code_r0x0071858c:
    uStack0000000000000030._0_4_ = (undefined4)uVar5;
    uStack0000000000000030._4_4_ = (undefined4)((ulong)uVar5 >> 0x20);
  } while( true );
}


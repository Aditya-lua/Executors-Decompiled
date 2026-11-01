
void FUN_007183bc(void)

{
  int iVar1;
  ulong uVar2;
  long unaff_x20;
  long lVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined4 unaff_w27;
  long unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  
code_r0x007183bc:
  func_0x0072415c();
  uVar4 = *(undefined8 *)(unaff_x20 + 0x128);
  iVar1 = *(int *)(unaff_x20 + 0x80);
  uStack0000000000000060 = *(undefined8 *)(unaff_x20 + 0x84);
  in_stack_00000068 = *(undefined8 *)(unaff_x20 + 0x84);
  do {
    if (((iVar1 - 0x116U < 2) || (iVar1 == 0x7b)) || (iVar1 == 0x28)) {
      func_0x0071860c(&uStack0000000000000030);
      if (CONCAT44(uStack000000000000003c,uStack0000000000000038) != 0) {
        puVar8 = (undefined8 *)
                 CONCAT44(uStack0000000000000030._4_4_,(undefined4)uStack0000000000000030);
        lVar3 = CONCAT44(uStack000000000000003c,uStack0000000000000038) << 3;
        do {
          uVar6 = *puVar8;
          uVar2 = func_0x007086b0(uVar6);
          if (((uVar2 & 1) == 0) && (uVar2 = func_0x007086f8(uVar6), (uVar2 & 1) == 0)) {
            func_0x007181dc();
          }
          puVar8 = puVar8 + 1;
          lVar3 = lVar3 + -8;
        } while (lVar3 != 0);
      }
      uVar2 = func_0x00717f28();
      if (*(char *)(unaff_x28 + 2000) == '\0') {
        if ((uVar2 & 0xff00000000) == 0) goto code_r0x007184f0;
        uStack0000000000000018 = uStack0000000000000060;
        in_stack_00000020 = in_stack_00000048;
        uVar4 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
        in_stack_00000028 =
             func_0x00705878(uVar4,&uStack0000000000000018,uVar2,
                             CONCAT44(uStack0000000000000030._4_4_,
                                      (undefined4)uStack0000000000000030),
                             CONCAT44(uStack000000000000003c,uStack0000000000000038));
      }
      else {
        uStack0000000000000018 = uStack0000000000000060;
        in_stack_00000020 = in_stack_00000048;
        uVar5 = unaff_w27;
        if ((uVar2 & 0xff00000000) != 0) {
          uVar5 = (undefined4)uVar2;
        }
        uVar6 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
        in_stack_00000028 =
             func_0x007058b4(uVar6,&uStack0000000000000018,uVar5,
                             CONCAT44(uStack0000000000000030._4_4_,
                                      (undefined4)uStack0000000000000030),
                             CONCAT44(uStack000000000000003c,uStack0000000000000038),uVar4);
      }
code_r0x007184e8:
      func_0x00711dac();
    }
    else {
      uVar2 = func_0x00717f28();
      if (*(char *)(unaff_x28 + 2000) != '\0') {
        uVar5 = unaff_w27;
        if ((uVar2 & 0xff00000000) != 0) {
          uVar5 = (undefined4)uVar2;
        }
        uVar6 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
        uVar4 = func_0x007058b4(uVar6,&uStack0000000000000060,uVar5,
                                *(undefined8 *)(unaff_x29 + -0x60),
                                *(undefined8 *)(unaff_x29 + -0x58),uVar4);
code_r0x0071858c:
        uStack0000000000000030._0_4_ = (undefined4)uVar4;
        uStack0000000000000030._4_4_ = (undefined4)((ulong)uVar4 >> 0x20);
        goto code_r0x007184e8;
      }
      if ((uVar2 & 0xff00000000) != 0) {
        uVar4 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
        uVar4 = func_0x00705878(uVar4,&uStack0000000000000060,uVar2,
                                *(undefined8 *)(unaff_x29 + -0x60),
                                *(undefined8 *)(unaff_x29 + -0x58));
        goto code_r0x0071858c;
      }
    }
code_r0x007184f0:
    if (*(int *)(unaff_x20 + 0x80) != 0x2c) {
      uStack0000000000000030._4_4_ = (undefined4)in_stack_00000008;
      uStack0000000000000038 = (undefined4)((ulong)in_stack_00000008 >> 0x20);
      if (*(int *)(unaff_x20 + 0x80) == 0x5d) {
        func_0x00710d48();
      }
      else {
        func_0x00721808();
        func_0x007244d4();
      }
      return;
    }
    func_0x00710d48();
    if (*(int *)(unaff_x20 + 0x80) != 0x119) goto code_r0x007183bc;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x98);
    uVar6 = *(undefined8 *)(unaff_x20 + 0x84);
    uVar7 = *(undefined8 *)(unaff_x20 + 0x8c);
    func_0x00710d48();
    iVar1 = *(int *)(unaff_x20 + 0x80);
    uStack0000000000000060 = uVar6;
    in_stack_00000068 = uVar7;
  } while( true );
}



void FUN_00415be0(undefined8 *param_1)

{
  undefined8 uVar1;
  bool bVar2;
  long lVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  undefined8 unaff_x21;
  undefined *puVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined1 uStack0000000000000008;
  undefined2 uStack000000000000000c;
  undefined1 uStack000000000000000e;
  undefined1 uStack000000000000000f;
  undefined2 uStack0000000000000010;
  undefined2 uStack0000000000000012;
  undefined4 uStack0000000000000014;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
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
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  _uStack0000000000000008 = 0;
  uStack000000000000000c = 0x1b6;
  uStack000000000000000f = 0;
  uStack0000000000000010 = 0;
  uStack0000000000000012 = 0;
  uStack000000000000000e = 1;
  func_0x00416de4(&uStack0000000000000020,&uStack0000000000000008);
  if ((int)uStack0000000000000020 == 1) {
    *param_1 = 0x8000000000000000;
    param_1[1] = in_stack_00000028;
    return;
  }
  uVar4 = uStack0000000000000020._4_4_;
  in_stack_00000098 = 0;
  in_stack_00000090 = 0;
  in_stack_000000a8 = 0;
  in_stack_000000a0 = 0;
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  in_stack_00000088 = 0;
  in_stack_00000080 = 0;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  in_stack_00000068 = 0;
  in_stack_00000060 = 0;
  in_stack_00000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000028 = 0;
  uStack0000000000000020 = 0;
  iVar5 = _fstat(uVar4,&uStack0000000000000020);
  if (iVar5 == -1) {
    ___error();
  }
  else {
    unaff_x21 = in_stack_00000080;
  }
  bVar2 = iVar5 != -1;
  _uStack0000000000000008 = 0;
  uStack000000000000000c = 0;
  uStack000000000000000e = 0;
  uStack000000000000000f = 0;
  uStack0000000000000010 = 1;
  uStack0000000000000012 = 0;
  uStack0000000000000014 = 0;
  in_stack_00000018 = 0;
  uVar1 = unaff_x21;
  if (!bVar2) {
    uVar1 = 0;
  }
  lVar6 = func_0x0045ca10(&uStack0000000000000008,uVar1);
  lVar3 = in_stack_00000018;
  if (lVar6 == -0x7fffffffffffffff) {
    auVar8 = func_0x0041e6c8(uVar4,&uStack0000000000000008,bVar2,unaff_x21);
    lVar6 = in_stack_00000018;
    puVar7 = auVar8._8_8_;
    *(undefined1 (*) [16])(unaff_x29 + -0x50) = auVar8;
    func_0x0046b8d0(&uStack0000000000000020,
                    CONCAT44(uStack0000000000000014,
                             CONCAT22(uStack0000000000000012,uStack0000000000000010)) + lVar3,
                    in_stack_00000018 - lVar3);
    if (uStack0000000000000020 == 0) {
      in_stack_00000018 = lVar6;
      if ((auVar8._0_8_ & 1) == 0) {
        param_1[1] = CONCAT44(uStack0000000000000014,
                              CONCAT22(uStack0000000000000012,uStack0000000000000010));
        *param_1 = CONCAT17(uStack000000000000000f,
                            CONCAT16(uStack000000000000000e,
                                     CONCAT24(uStack000000000000000c,_uStack0000000000000008)));
        param_1[2] = lVar6;
        goto LAB_00415d18;
      }
    }
    else {
      if ((auVar8._0_8_ & 1) == 0) {
        puVar7 = &UNK_009da348;
      }
      in_stack_00000018 = lVar3;
    }
  }
  else {
    puVar7 = (undefined *)0x2600000003;
    in_stack_00000018 = lVar3;
  }
  *param_1 = 0x8000000000000000;
  param_1[1] = puVar7;
  lVar3 = CONCAT17(uStack000000000000000f,
                   CONCAT16(uStack000000000000000e,
                            CONCAT24(uStack000000000000000c,_uStack0000000000000008)));
  if (lVar3 != 0) {
    func_0x00187bd4(CONCAT44(uStack0000000000000014,
                             CONCAT22(uStack0000000000000012,uStack0000000000000010)),lVar3,1);
  }
LAB_00415d18:
  _close(uVar4);
  return;
}


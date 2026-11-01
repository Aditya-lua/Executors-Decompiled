
void FUN_0027bfc8(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *unaff_x20;
  undefined8 unaff_x23;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  lVar2 = func_0x0029c764(param_1,param_2,0);
  if (lVar2 == 0) {
    unaff_x20[2] = 0xf;
    *unaff_x20 = 0;
    unaff_x20[1] = &UNK_0082e4ad;
    goto LAB_0027c0f0;
  }
  lVar3 = func_0x002c2a30();
  if (lVar3 == 0) {
LAB_0027c0d4:
    auVar6._8_8_ = 0xf;
    auVar6._0_8_ = &UNK_0082e4ad;
code_r0x0027c0e0:
    *(undefined1 (*) [16])(unaff_x20 + 1) = auVar6;
    *unaff_x20 = 0;
  }
  else {
    iVar1 = func_0x002c2ae8();
    if ((((iVar1 != 1) || (iVar1 = func_0x002c2b7c(lVar3), iVar1 != 1)) ||
        (iVar1 = func_0x002cad18(lVar3,lVar2), iVar1 != 1)) ||
       (lVar4 = func_0x002d8dc0(), lVar4 == 0)) {
LAB_0027c0cc:
      func_0x002c3420(lVar3);
      goto LAB_0027c0d4;
    }
    iVar1 = func_0x002d98c8(lVar4,lVar3);
    if (iVar1 != 1) {
      func_0x002d8de8(lVar4);
      goto LAB_0027c0cc;
    }
    uVar5 = func_0x002c7494();
    lVar3 = func_0x002d99c0(lVar4);
    if (lVar3 == 0) {
      auVar6._8_8_ = 0xf;
      auVar6._0_8_ = &UNK_0082e4ad;
LAB_0027c180:
      func_0x002d8de8(lVar4);
      goto code_r0x0027c0e0;
    }
    uStack0000000000000010 = lVar3;
    auVar6 = func_0x0026fb20(&uStack0000000000000010,uVar5);
    if (auVar6._0_8_ != 0) goto LAB_0027c180;
    iVar1 = func_0x002cb024(lVar3);
    if (iVar1 != 1) {
      auVar6._8_8_ = 0x16;
      auVar6._0_8_ = &UNK_0082e4cc;
      goto LAB_0027c180;
    }
    uStack0000000000000008 = lVar4;
    func_0x0026fec8(&uStack0000000000000010,&uStack0000000000000008);
    if (uStack0000000000000010 == 0) {
      func_0x002d8de8(lVar4);
      goto LAB_0027c0d4;
    }
    unaff_x20[2] = in_stack_00000018;
    unaff_x20[1] = uStack0000000000000010;
    unaff_x20[4] = in_stack_00000028;
    unaff_x20[3] = in_stack_00000020;
    *unaff_x20 = unaff_x23;
    unaff_x20[5] = lVar4;
  }
  func_0x0029bc0c(lVar2);
LAB_0027c0f0:
  func_0x002c7740();
  func_0x002c6434();
  return;
}


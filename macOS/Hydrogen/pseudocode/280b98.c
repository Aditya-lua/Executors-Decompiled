
ulong FUN_00280b98(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined1 auVar6 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_000000d0;
  int iStack_34;
  undefined1 auStack_30 [16];
  
  if (in_stack_000000d0 != 0x80) {
    _bzero(unaff_x20 + in_stack_000000d0 + 0x50,0x80 - in_stack_000000d0);
  }
  uVar2 = func_0x002806fc();
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar2;
  }
  auVar6 = ___stack_chk_fail();
  iVar1 = func_0x002843d4(auVar6._0_8_,auStack_30,2);
  if ((iVar1 == 0) || (iVar1 = func_0x0028489c(auStack_30,&iStack_34), iVar1 == 0)) {
    func_0x0028f83c(3,0,0x75,"/aws-lc/crypto/bn_extra/bn_asn1.c",0x1a);
    return 0;
  }
  if (iStack_34 == 0) {
    uVar3 = func_0x00283abc(auStack_30);
    uVar4 = func_0x00283ac4(auStack_30);
    lVar5 = func_0x0029c764(uVar3,uVar4,auVar6._8_8_);
    return (ulong)(lVar5 != 0);
  }
  func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/bn_extra/bn_asn1.c",0x1f);
  return 0;
}



undefined8 FUN_002d384c(ulong *param_1)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  long lVar5;
  long in_x9;
  ulong in_x11;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  
  while (in_x9 = in_x9 + -1, in_x9 != 0) {
    in_x11 = *param_1 | in_x11;
    param_1 = param_1 + 1;
  }
  if (in_x11 == 0) {
    func_0x0028f83c(0xf,0,0x6c,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x180);
    cVar1 = *(char *)(unaff_x19 + 0x28);
joined_r0x002d3964:
    uVar3 = 0;
joined_r0x002d3964:
    if (cVar1 != '\0') goto LAB_002d38d4;
LAB_002d38b8:
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar5 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar5;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar5 * 8);
      goto LAB_002d38d4;
    }
LAB_002d3970:
    func_0x0079db4c();
  }
  else {
    iVar2 = func_0x0029ad98(in_stack_00000008,in_stack_00000000,in_stack_00000008);
    if (iVar2 == 0) {
      cVar1 = *(char *)(unaff_x19 + 0x28);
      goto joined_r0x002d3964;
    }
    if (*(int *)(in_stack_00000008 + 1) < 1) {
      uVar4 = 0;
    }
    else {
      uVar4 = *(uint *)*in_stack_00000008 & 1;
    }
    if (uVar4 == in_stack_00000010._4_4_) {
      uVar3 = func_0x002c8d10();
      cVar1 = *(char *)(unaff_x19 + 0x28);
      goto joined_r0x002d3964;
    }
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/oct.c",0x188);
    uVar3 = 0;
    if (*(char *)(unaff_x19 + 0x28) == '\0') goto LAB_002d38b8;
LAB_002d38d4:
    if (unaff_x20 != (undefined8 *)0x0) {
      if ((unaff_x20[4] != 0) && (*(char *)(unaff_x20 + 5) == '\0')) {
        func_0x0079db28();
        goto LAB_002d3970;
      }
      func_0x00373520(*unaff_x20,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(unaff_x20[1]);
      func_0x0036e3d8();
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return uVar3;
    }
  }
  ___stack_chk_fail();
  func_0x00373e9c(0xa29548,&DAT_002d39a4);
  return 0xa3ab08;
}


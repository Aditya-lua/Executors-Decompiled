
/* WARNING: Possible PIC construction at 0x002fa4ac: Changing call to branch */

undefined8
FUN_002fa390(undefined8 param_1,undefined8 param_2,qword *param_3,char *param_4,qword *param_5,
            long param_6)

{
  bool in_ZR;
  undefined4 uVar1;
  long lVar3;
  int iVar2;
  undefined1 *puVar4;
  uint *puVar5;
  undefined8 uVar6;
  qword *pqVar7;
  long lVar8;
  uint *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x22;
  qword *unaff_x23;
  int unaff_w24;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  uint *in_stack_00000008;
  int iStack_ec;
  long lStack_e8;
  long lStack_e0;
  undefined8 uStack_d8;
  uint uStack_7c;
  undefined1 auStack_78 [64];
  long lStack_38;
  
  if (in_ZR) {
    *unaff_x22 = unaff_x23;
    uVar9 = 1;
  }
  else {
    if (unaff_w24 == 1) {
      param_4 = (char *)in_stack_00000008;
      param_5 = unaff_x23;
      iVar2 = func_0x002f66b8();
      if (iVar2 != 0) {
        uVar9 = 1;
        param_3 = unaff_x23;
        goto LAB_002fa2dc;
      }
      param_3 = &section_00000068.addr;
      param_5 = (qword *)(section_000001f8.sectname + 9);
    }
    else {
      param_3 = (qword *)((long)&section_00000068.addr + 7);
      param_5 = (qword *)(section_000001f8.sectname + 4);
    }
    param_4 = "/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c";
    func_0x0028f83c(4,0,param_3);
    uVar9 = 0;
  }
LAB_002fa2dc:
  if (*(char *)(unaff_x20 + 5) != '\0') {
code_r0x002fa304:
    func_0x00373520(*unaff_x20,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
    func_0x0036e3d8(unaff_x20[1]);
    func_0x0036e3d8();
    if (in_stack_00000008 != unaff_x19) {
      func_0x0036e3d8();
    }
    return uVar9;
  }
  if (unaff_x20[2] == 0) {
    func_0x0079db4c();
  }
  else {
    lVar8 = unaff_x20[2] + -1;
    unaff_x20[2] = lVar8;
    lVar8 = *(long *)(unaff_x20[1] + lVar8 * 8);
    unaff_x20[4] = lVar8;
    if (lVar8 == 0) goto code_r0x002fa304;
  }
  auVar10 = func_0x0079db28();
  auVar10._0_8_ = auVar10._0_8_;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_7c = 0x40;
  puVar4 = auStack_78;
  puVar5 = &uStack_7c;
  lVar8 = 0;
  pqVar7 = auVar10._0_8_;
  uVar9 = func_0x002c0d58(auVar10._8_8_,param_3,puVar4,puVar5,auVar10._0_8_);
  if ((int)uVar9 == 0) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
      return uVar9;
    }
    auVar10 = ___stack_chk_fail();
  }
  else {
    auVar10._4_4_ = 0;
    auVar10._0_4_ = (uint)*auVar10._0_8_;
    puVar4 = (undefined1 *)(ulong)uStack_7c;
    auVar10._8_8_ = auStack_78;
    puVar5 = (uint *)param_4;
    pqVar7 = param_5;
    lVar8 = param_6;
  }
  if ((*(long *)(lVar8 + 8) == 0) || (*(long *)(lVar8 + 0x10) == 0)) {
    uVar9 = 0x90;
    uVar6 = 0x3a7;
code_r0x002f9fb0:
    func_0x0028f83c(4,0,uVar9,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",uVar6);
    return 0;
  }
  uVar1 = func_0x002f7028(lVar8);
  lStack_e0 = 0;
  uStack_d8 = 0;
  iStack_ec = 0;
  if ((auVar10._0_4_ == 0x72) && ((dword *)puVar4 != &segment_command_00000020.cmdsize)) {
    uVar9 = 0x7d;
    uVar6 = 0x3b3;
    goto code_r0x002f9fb0;
  }
  lVar3 = func_0x0036e274(uVar1);
  if (lVar3 == 0) {
    return 0;
  }
  iVar2 = func_0x002fa0c0(lVar8,&lStack_e8,lVar3,uVar1,puVar5,pqVar7,1);
  if ((iVar2 != 0) &&
     (iVar2 = func_0x002f9804(&uStack_d8,&lStack_e0,&iStack_ec,auVar10._0_8_,auVar10._8_8_,puVar4),
     iVar2 != 0)) {
    if (lStack_e8 == lStack_e0) {
      if ((lStack_e8 == 0) || (iVar2 = _memcmp(lVar3,uStack_d8), iVar2 == 0)) {
        uVar9 = 1;
        func_0x0036e3d8(lVar3);
        goto joined_r0x002fa098;
      }
      uVar9 = 0xf8;
      uVar6 = 0x3cc;
    }
    else {
      uVar9 = 0x69;
      uVar6 = 0x3c6;
    }
    func_0x0028f83c(4,0,uVar9,"/aws-lc/crypto/fipsmodule/rsa/rsa.c",uVar6);
  }
  uVar9 = 0;
  func_0x0036e3d8(lVar3);
joined_r0x002fa098:
  if (iStack_ec == 0) {
    return uVar9;
  }
  func_0x0036e3d8(uStack_d8);
  return uVar9;
}


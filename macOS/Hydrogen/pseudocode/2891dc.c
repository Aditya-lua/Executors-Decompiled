
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_002891dc(undefined4 *param_1,undefined4 *param_2,long *param_3)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined1 auStack_120 [48];
  undefined8 uStack_f0;
  long *plStack_e8;
  undefined1 **ppuStack_e0;
  undefined *puStack_d8;
  ulong uStack_c8;
  undefined1 auStack_c0 [16];
  undefined1 *puStack_a0;
  undefined8 uStack_98;
  long lStack_90;
  undefined8 uStack_88;
  undefined4 uStack_80;
  undefined8 uStack_7c;
  undefined8 uStack_74;
  undefined8 uStack_6c;
  undefined8 uStack_64;
  undefined8 uStack_5c;
  undefined8 uStack_54;
  undefined8 uStack_4c;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  undefined8 uStack_38;
  long lStack_28;
  undefined1 auStack_6 [6];
  
  uVar2 = param_2[0x17];
  uVar7 = (ulong)uVar2;
  if (0x3f < uVar2) {
    auVar9 = func_0x0079d4c0();
    lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
    uStack_38 = 0;
    uStack_3c = 0;
    uStack_44 = 0;
    uStack_40 = 0;
    uStack_4c = 0;
    uStack_54 = 0;
    uStack_5c = 0;
    uStack_64 = 0;
    uStack_6c = 0;
    uStack_74 = 0;
    uStack_7c = 0;
    uStack_88 = _UNK_0082e9f8;
    lStack_90 = _UNK_0082e9f0;
    uStack_80 = 0xc3d2e1f0;
    func_0x002879e0(&lStack_90,auVar9._0_8_,auVar9._8_8_);
    func_0x002891c8(param_3,&lStack_90);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
      return param_3;
    }
    uVar8 = ___stack_chk_fail();
    uStack_98 = 0x28935c;
    puStack_a0 = auStack_6 + -10;
    plVar4 = (long *)func_0x002bf86c();
    if (plVar4 == (long *)0x0) {
      return (long *)0x0;
    }
    iVar3 = func_0x002843d4(uVar8,auStack_c0,0x20000010);
    if (iVar3 == 0) goto LAB_00289414;
    if (*plVar4 == 0) {
      lVar6 = func_0x0029bbb8();
      *plVar4 = lVar6;
      if ((lVar6 == 0) || (iVar3 = func_0x00280c0c(auStack_c0,lVar6), iVar3 == 0)) {
LAB_00289414:
        func_0x0028f83c(5,0,0x68,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x78);
        func_0x002bf97c(plVar4);
        return (long *)0x0;
      }
      if (plVar4[1] == 0) {
        lVar6 = func_0x0029bbb8();
        plVar4[1] = lVar6;
        if ((lVar6 != 0) && (iVar3 = func_0x00280c0c(auStack_c0,lVar6), iVar3 != 0)) {
          lVar6 = func_0x00283ac4(auStack_c0);
          if (lVar6 != 0) {
            iVar3 = func_0x0028457c(auStack_c0,&uStack_c8);
            if ((iVar3 == 0) || (uStack_c8 >> 0x20 != 0)) goto LAB_00289414;
            *(int *)(plVar4 + 5) = (int)uStack_c8;
          }
          lVar6 = func_0x00283ac4(auStack_c0);
          if ((lVar6 == 0) && (iVar3 = func_0x002beed4(plVar4), iVar3 != 0)) {
            return plVar4;
          }
        }
        goto LAB_00289414;
      }
    }
    else {
      func_0x0079d4e8();
    }
    auVar9 = func_0x0079d4e8();
    plVar5 = auVar9._8_8_;
    puStack_d8 = &_aws_lc_0_24_0_DH_marshal_parameters;
    uStack_f0 = uVar8;
    plStack_e8 = plVar4;
    ppuStack_e0 = &puStack_a0;
    iVar3 = func_0x002823f4(auVar9._0_8_,auStack_120,0x20000010);
    if (iVar3 == 0) goto LAB_0028950c;
    if (*plVar5 != 0) {
      iVar3 = func_0x00280ce4(auStack_120);
      if (iVar3 == 0) goto LAB_0028950c;
      if (plVar5[1] != 0) {
        iVar3 = func_0x00280ce4(auStack_120);
        if ((iVar3 != 0) &&
           ((((int)plVar5[5] == 0 || (iVar3 = func_0x00282cf4(auStack_120), iVar3 != 0)) &&
            (iVar3 = func_0x00281fbc(auVar9._0_8_), iVar3 != 0)))) {
          return (long *)((long)&MACH_HEADER.magic + 1);
        }
        goto LAB_0028950c;
      }
    }
    func_0x0028f83c(5,0,0x43,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x51);
LAB_0028950c:
    func_0x0028f83c(5,0,0x69,"/aws-lc/crypto/dh_extra/dh_asn1.c",0x85);
    return (long *)0x0;
  }
  puVar1 = (undefined8 *)(param_2 + 7);
  uVar8 = *(undefined8 *)(param_2 + 5);
  *(undefined1 *)((long)puVar1 + uVar7) = 0x80;
  lVar6 = uVar7 + 1;
  if (uVar2 < 0x38) {
    if (lVar6 == 0x38) goto LAB_00289254;
  }
  else {
    if (uVar2 != 0x3f) {
      _bzero((long)puVar1 + lVar6,0x3f - uVar7);
    }
    func_0x00287af4(param_2,puVar1,1);
    lVar6 = 0;
  }
  _bzero((long)puVar1 + lVar6,0x38 - lVar6);
LAB_00289254:
  *(undefined8 *)(param_2 + 0x15) = uVar8;
  func_0x00287af4(param_2,puVar1,1);
  param_2[0x17] = 0;
  *(undefined8 *)(param_2 + 9) = 0;
  *puVar1 = 0;
  *(undefined8 *)(param_2 + 0xd) = 0;
  *(undefined8 *)(param_2 + 0xb) = 0;
  *(undefined8 *)(param_2 + 0x11) = 0;
  *(undefined8 *)(param_2 + 0xf) = 0;
  *(undefined8 *)(param_2 + 0x15) = 0;
  *(undefined8 *)(param_2 + 0x13) = 0;
  *param_1 = *param_2;
  param_1[1] = param_2[1];
  param_1[2] = param_2[2];
  param_1[3] = param_2[3];
  param_1[4] = param_2[4];
  return (long *)((long)&MACH_HEADER.magic + 1);
}


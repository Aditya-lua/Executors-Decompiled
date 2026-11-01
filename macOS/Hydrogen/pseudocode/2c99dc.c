
/* WARNING: Possible PIC construction at 0x002c9a10: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002c9a14) */
/* WARNING: Removing unreachable block (ram,0x002c9a18) */
/* WARNING: Removing unreachable block (ram,0x002c9a84) */
/* WARNING: Removing unreachable block (ram,0x002c9a44) */
/* WARNING: Removing unreachable block (ram,0x002c9aac) */
/* WARNING: Removing unreachable block (ram,0x002c9a48) */

undefined8 FUN_002c99dc(code *param_1)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  char *pcVar6;
  char *pcVar7;
  char *in_x3;
  ulong uVar8;
  undefined8 *unaff_x19;
  undefined8 uVar9;
  long unaff_x21;
  char *unaff_x24;
  char *unaff_x25;
  long unaff_x29;
  undefined1 auVar10 [16];
  
  (*param_1)();
  iVar3 = func_0x002c7cd4();
  if (iVar3 == 0) {
    unaff_x25 = "/aws-lc/crypto/fipsmodule/ec/ec.c";
    unaff_x24 = (char *)((long)&segment_command_00000020.vmsize + 4);
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
    uVar9 = 0;
joined_r0x002c9aa4:
    if (unaff_x19 == (undefined8 *)0x0) {
      return uVar9;
    }
    if ((unaff_x19[4] == 0) || (*(char *)(unaff_x19 + 5) != '\0')) {
      func_0x00373520(*unaff_x19,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(unaff_x19[1]);
      func_0x0036e3d8();
      return uVar9;
    }
    auVar10 = func_0x0079db28();
    lVar5 = auVar10._8_8_;
    unaff_x21 = auVar10._0_8_;
  }
  else {
    if (unaff_x24 == (char *)0x0) {
      uVar9 = 1;
      unaff_x24 = (char *)register0x00000008;
      unaff_x25 = in_x3;
      goto joined_r0x002c9aa4;
    }
    lVar5 = unaff_x29 + -0x98;
  }
  iVar3 = func_0x0029c218(lVar5,(long)*(int *)(unaff_x21 + 0x108));
  if ((iVar3 != 0) &&
     (iVar3 = func_0x0029d99c(lVar5,(long)*(int *)(unaff_x21 + 0x108),
                              *(undefined8 *)(unaff_x21 + 0x100),(long)*(int *)(unaff_x21 + 0x108)),
     iVar3 < 0)) {
    return 1;
  }
  pcVar7 = section_00000068.segname + 0xd;
  func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
  func_0x0028f0e4();
  if (unaff_x25[0x28] == '\0') {
    uVar9 = *(undefined8 *)(unaff_x25 + 0x20);
    uVar8 = *(ulong *)(unaff_x25 + 0x10);
    if (uVar8 != *(ulong *)(unaff_x25 + 0x18)) {
      lVar4 = *(long *)(unaff_x25 + 8);
code_r0x002c9c30:
      *(undefined8 *)(lVar4 + uVar8 * 8) = uVar9;
      *(long *)(unaff_x25 + 0x10) = *(long *)(unaff_x25 + 0x10) + 1;
      goto code_r0x002c9c40;
    }
    uVar1 = 0x20;
    if (uVar8 != 0) {
      uVar1 = uVar8 * 3 >> 1;
    }
    if ((uVar8 < uVar1 && uVar1 >> 0x3d == 0) &&
       (lVar4 = func_0x0036e48c(*(undefined8 *)(unaff_x25 + 8),uVar1 << 3), lVar4 != 0)) {
      *(long *)(unaff_x25 + 8) = lVar4;
      *(ulong *)(unaff_x25 + 0x18) = uVar1;
      uVar8 = *(ulong *)(unaff_x25 + 0x10);
      goto code_r0x002c9c30;
    }
    unaff_x25[0x28] = '\x01';
    unaff_x25[0x29] = '\x01';
    lVar4 = func_0x0029e340(unaff_x25);
    if (lVar4 != 0) goto code_r0x002c9c4c;
    uVar9 = 0;
  }
  else {
code_r0x002c9c40:
    lVar4 = func_0x0029e340(unaff_x25);
    uVar9 = 0;
    if (lVar4 != 0) {
code_r0x002c9c4c:
      if (*(int *)(unaff_x21 + 0x214) == 0) {
        uVar9 = func_0x0079e818();
        goto code_r0x002c9d58;
      }
      pcVar6 = (char *)(unaff_x21 + 0x100);
      uVar9 = func_0x0029e4fc(0,lVar4,unaff_x24,pcVar6,unaff_x25);
      pcVar7 = unaff_x24;
      if ((int)uVar9 != 0) {
        if (*(int *)(lVar4 + 0x10) != 0) {
          pcVar2 = (code *)&_aws_lc_0_24_0_BN_add;
          if (*(int *)(unaff_x21 + 0x110) != 0) {
            pcVar2 = (code *)&_aws_lc_0_24_0_BN_sub;
          }
          uVar9 = (*pcVar2)(lVar4,lVar4);
          pcVar7 = pcVar6;
          if ((int)uVar9 == 0) goto code_r0x002c9d1c;
        }
        iVar3 = func_0x0029c218(lVar5,(long)*(int *)(unaff_x21 + 0x108),lVar4);
        if (iVar3 != 0) {
          pcVar7 = *(char **)(unaff_x21 + 0x100);
          iVar3 = func_0x0029d99c(lVar5,(long)*(int *)(unaff_x21 + 0x108),pcVar7,
                                  (long)*(int *)(unaff_x21 + 0x108));
          if (iVar3 < 0) {
            uVar9 = 1;
            goto code_r0x002c9d1c;
          }
        }
        pcVar7 = section_00000068.segname + 0xd;
        func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
        uVar9 = 0;
      }
    }
  }
code_r0x002c9d1c:
  if (unaff_x25[0x28] != '\0') {
    return uVar9;
  }
  if (*(long *)(unaff_x25 + 0x10) != 0) {
    lVar5 = *(long *)(unaff_x25 + 0x10) + -1;
    *(long *)(unaff_x25 + 0x10) = lVar5;
    *(undefined8 *)(unaff_x25 + 0x20) = *(undefined8 *)(*(long *)(unaff_x25 + 8) + lVar5 * 8);
    return uVar9;
  }
code_r0x002c9d58:
  auVar10 = func_0x0079db4c(uVar9);
  if (pcVar7 == (char *)0x0) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3ca);
    return 0;
  }
  (**(code **)(*auVar10._0_8_ + 0x28))();
  iVar3 = func_0x002c7cd4(auVar10._0_8_,auVar10._8_8_);
  if (iVar3 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
    return 0;
  }
  return 1;
}


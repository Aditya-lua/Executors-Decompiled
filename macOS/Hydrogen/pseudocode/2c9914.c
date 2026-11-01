
/* WARNING: Possible PIC construction at 0x002c9a10: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c99c8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002c9a14) */
/* WARNING: Removing unreachable block (ram,0x002c9a18) */
/* WARNING: Removing unreachable block (ram,0x002c9a84) */
/* WARNING: Removing unreachable block (ram,0x002c9a44) */
/* WARNING: Removing unreachable block (ram,0x002c9aac) */
/* WARNING: Removing unreachable block (ram,0x002c9a48) */
/* WARNING: Removing unreachable block (ram,0x002c99cc) */
/* WARNING: Removing unreachable block (ram,0x002c99d0) */
/* WARNING: Removing unreachable block (ram,0x002c9a68) */
/* WARNING: Removing unreachable block (ram,0x002c9a9c) */
/* WARNING: Removing unreachable block (ram,0x002c9aa0) */
/* WARNING: Removing unreachable block (ram,0x002c9aa8) */

undefined8 FUN_002c9914(long param_1,undefined8 *param_2,long param_3,undefined8 *param_4)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x29;
  undefined1 auVar11 [16];
  
  lVar6 = param_3;
  puVar8 = param_4;
  iVar3 = func_0x002c2908(param_1,*param_2);
  if ((iVar3 != 0) ||
     ((param_4 != (undefined8 *)0x0 && (iVar3 = func_0x002c2908(param_1,*param_4), iVar3 != 0)))) {
    func_0x0028f83c(0xf,0,0x6a,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x357);
    return 0;
  }
  if (unaff_x25 == (undefined8 *)0x0) {
    puVar10 = (undefined8 *)func_0x0036e31c(0x30);
    if (puVar10 == (undefined8 *)0x0) {
      return 0;
    }
    puVar10[1] = 0;
    puVar10[2] = 0;
    puVar10[3] = 0;
    unaff_x25 = puVar10;
    if (param_3 == 0) goto LAB_002c99fc;
LAB_002c99b8:
    puVar8 = unaff_x25;
  }
  else {
    puVar10 = (undefined8 *)0x0;
    if (param_3 != 0) goto LAB_002c99b8;
LAB_002c99fc:
    param_3 = lVar6;
    if (unaff_x24 == 0) {
      if (puVar10 == (undefined8 *)0x0) {
        return 1;
      }
      if ((puVar10[4] == 0) || (*(char *)(puVar10 + 5) != '\0')) {
        func_0x00373520(*puVar10,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
        func_0x0036e3d8(puVar10[1]);
        func_0x0036e3d8(puVar10);
        return 1;
      }
      auVar11 = func_0x0079db28();
      register0x00000008 = auVar11._8_8_;
      param_1 = auVar11._0_8_;
    }
    else {
      register0x00000008 = (BADSPACEBASE *)(unaff_x29 + -0x98);
      param_3 = unaff_x24;
      puVar8 = unaff_x25;
    }
  }
  iVar3 = func_0x0029c218(register0x00000008,(long)*(int *)(param_1 + 0x108));
  if ((iVar3 != 0) &&
     (iVar3 = func_0x0029d99c(register0x00000008,(long)*(int *)(param_1 + 0x108),
                              *(undefined8 *)(param_1 + 0x100),(long)*(int *)(param_1 + 0x108)),
     iVar3 < 0)) {
    return 1;
  }
  lVar6 = 0x85;
  func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
  func_0x0028f0e4();
  if (*(char *)(puVar8 + 5) == '\0') {
    uVar5 = puVar8[4];
    uVar9 = puVar8[2];
    if (uVar9 != puVar8[3]) {
      lVar4 = puVar8[1];
code_r0x002c9c30:
      *(undefined8 *)(lVar4 + uVar9 * 8) = uVar5;
      puVar8[2] = puVar8[2] + 1;
      goto code_r0x002c9c40;
    }
    uVar1 = 0x20;
    if (uVar9 != 0) {
      uVar1 = uVar9 * 3 >> 1;
    }
    if ((uVar9 < uVar1 && uVar1 >> 0x3d == 0) &&
       (lVar4 = func_0x0036e48c(puVar8[1],uVar1 << 3), lVar4 != 0)) {
      puVar8[1] = lVar4;
      puVar8[3] = uVar1;
      uVar9 = puVar8[2];
      goto code_r0x002c9c30;
    }
    *(undefined2 *)(puVar8 + 5) = 0x101;
    lVar4 = func_0x0029e340(puVar8);
    if (lVar4 != 0) goto code_r0x002c9c4c;
    uVar5 = 0;
  }
  else {
code_r0x002c9c40:
    lVar4 = func_0x0029e340(puVar8);
    uVar5 = 0;
    if (lVar4 != 0) {
code_r0x002c9c4c:
      if (*(int *)(param_1 + 0x214) == 0) {
        uVar5 = func_0x0079e818();
        goto code_r0x002c9d58;
      }
      lVar7 = param_1 + 0x100;
      uVar5 = func_0x0029e4fc(0,lVar4,param_3,lVar7,puVar8);
      lVar6 = param_3;
      if ((int)uVar5 != 0) {
        if (*(int *)(lVar4 + 0x10) != 0) {
          pcVar2 = (code *)&_aws_lc_0_24_0_BN_add;
          if (*(int *)(param_1 + 0x110) != 0) {
            pcVar2 = (code *)&_aws_lc_0_24_0_BN_sub;
          }
          uVar5 = (*pcVar2)(lVar4,lVar4);
          lVar6 = lVar7;
          if ((int)uVar5 == 0) goto code_r0x002c9d1c;
        }
        iVar3 = func_0x0029c218(register0x00000008,(long)*(int *)(param_1 + 0x108),lVar4);
        if (iVar3 != 0) {
          lVar6 = *(long *)(param_1 + 0x100);
          iVar3 = func_0x0029d99c(register0x00000008,(long)*(int *)(param_1 + 0x108),lVar6,
                                  (long)*(int *)(param_1 + 0x108));
          if (iVar3 < 0) {
            uVar5 = 1;
            goto code_r0x002c9d1c;
          }
        }
        lVar6 = 0x85;
        func_0x0028f83c(0xf,0,0x85,"/aws-lc/crypto/fipsmodule/ec/scalar.c",0x1c);
        uVar5 = 0;
      }
    }
  }
code_r0x002c9d1c:
  if (*(char *)(puVar8 + 5) != '\0') {
    return uVar5;
  }
  if (puVar8[2] != 0) {
    lVar6 = puVar8[2] + -1;
    puVar8[2] = lVar6;
    puVar8[4] = *(undefined8 *)(puVar8[1] + lVar6 * 8);
    return uVar5;
  }
code_r0x002c9d58:
  auVar11 = func_0x0079db4c(uVar5);
  if (lVar6 == 0) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3ca);
    return 0;
  }
  (**(code **)(*auVar11._0_8_ + 0x28))();
  iVar3 = func_0x002c7cd4(auVar11._0_8_,auVar11._8_8_);
  if (iVar3 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
    return 0;
  }
  return 1;
}


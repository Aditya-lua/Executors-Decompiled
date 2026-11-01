
/* WARNING: Possible PIC construction at 0x0031b340: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0031b344) */

ulong FUN_0031b204(long param_1)

{
  long *plVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  code *pcVar12;
  ulong *unaff_x19;
  ulong *puVar13;
  long unaff_x20;
  long lVar14;
  long *plVar15;
  ulong unaff_x22;
  undefined8 unaff_x23;
  ulong uVar16;
  long unaff_x25;
  long lVar17;
  ulong uVar18;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 unaff_x29;
  undefined *puVar19;
  long in_stack_00000000;
  long in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000020;
  long *in_stack_00000028;
  long in_stack_00000030;
  ulong *in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined *in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar17 = *(long *)(param_1 + 0x28);
  plVar1 = *(long **)(*(long *)(param_1 + 0x10) + 8);
  lVar5 = *(long *)(*(long *)(param_1 + 0x10) + 0x10);
  if ((lVar5 == 0) || (pcVar12 = *(code **)(lVar5 + 0x78), pcVar12 == (code *)0x0)) {
    uVar16 = 0;
    lVar5 = in_stack_00000000;
    lVar7 = in_stack_00000008;
    uVar6 = in_stack_00000010;
    uVar8 = in_stack_00000018;
    uVar18 = in_stack_00000020;
    plVar15 = in_stack_00000028;
    lVar14 = in_stack_00000030;
    puVar13 = in_stack_00000038;
    uVar11 = in_stack_00000040;
    puVar19 = in_stack_00000048;
  }
  else {
    iVar2 = (*pcVar12)();
    uVar16 = (ulong)iVar2;
    lVar5 = in_stack_00000000;
    lVar7 = in_stack_00000008;
    uVar6 = in_stack_00000010;
    uVar8 = in_stack_00000018;
    uVar18 = in_stack_00000020;
    plVar15 = in_stack_00000028;
    lVar14 = in_stack_00000030;
    puVar13 = in_stack_00000038;
    uVar11 = in_stack_00000040;
    puVar19 = in_stack_00000048;
  }
  if (unaff_x20 == 0) {
    *unaff_x19 = uVar16;
    return 1;
  }
  uVar9 = *unaff_x19;
  in_stack_00000000 = lVar5;
  in_stack_00000008 = lVar7;
  in_stack_00000010 = uVar6;
  in_stack_00000018 = uVar8;
  in_stack_00000020 = uVar18;
  in_stack_00000028 = plVar15;
  in_stack_00000030 = lVar14;
  in_stack_00000038 = puVar13;
  in_stack_00000040 = uVar11;
  in_stack_00000048 = puVar19;
  if (uVar9 < uVar16) {
    func_0x0028f83c(6,0,100,"/aws-lc/crypto/fipsmodule/evp/p_rsa.c",0x1a0);
    return 0;
  }
  iVar2 = *(int *)(lVar17 + 0x10);
  if (iVar2 == 4) {
    lVar5 = *(long *)(lVar17 + 0x30);
    if (lVar5 == 0) {
      lVar5 = 0;
      if (*(long *)(unaff_x25 + 0x10) != 0) {
        lVar5 = *(long *)(*(long *)(unaff_x25 + 0x10) + 0x10);
        if ((lVar5 == 0) || (pcVar12 = *(code **)(lVar5 + 0x78), pcVar12 == (code *)0x0)) {
          lVar5 = 0;
        }
        else {
          iVar2 = (*pcVar12)();
          lVar5 = (long)iVar2;
        }
      }
      lVar5 = func_0x0036e274(lVar5);
      *(long *)(lVar17 + 0x30) = lVar5;
      if (lVar5 == 0) {
        return 0;
      }
    }
    uVar6 = func_0x003714d4(lVar5,uVar16);
    if ((int)uVar6 == 0) {
      return uVar6;
    }
    uVar9 = *unaff_x19;
    iVar2 = 3;
    puVar19 = &UNK_0031b344;
    uVar10 = *(undefined8 *)(lVar17 + 0x30);
    puVar13 = unaff_x19;
    lVar14 = unaff_x20;
    plVar15 = plVar1;
    uVar18 = unaff_x22;
    uVar8 = unaff_x23;
    uVar6 = uVar16;
    lVar7 = unaff_x25;
    lVar5 = lVar17;
    uVar11 = unaff_x29;
  }
  else {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
    uVar10 = unaff_x23;
    uVar16 = unaff_x22;
  }
  *(undefined8 *)((long)register0x00000008 + -0x60) = unaff_x28;
  *(undefined8 *)((long)register0x00000008 + -0x58) = unaff_x27;
  *(long *)((long)register0x00000008 + -0x50) = lVar5;
  *(long *)((long)register0x00000008 + -0x48) = lVar7;
  *(ulong *)((long)register0x00000008 + -0x40) = uVar6;
  *(undefined8 *)((long)register0x00000008 + -0x38) = uVar8;
  *(ulong *)((long)register0x00000008 + -0x30) = uVar18;
  *(long **)((long)register0x00000008 + -0x28) = plVar15;
  *(long *)((long)register0x00000008 + -0x20) = lVar14;
  *(ulong **)((long)register0x00000008 + -0x18) = puVar13;
  *(undefined8 *)((long)register0x00000008 + -0x10) = uVar11;
  *(undefined **)((long)register0x00000008 + -8) = puVar19;
  if ((*plVar1 != 0) && (pcVar12 = *(code **)(*plVar1 + 0x40), pcVar12 != (code *)0x0)) {
    uVar3 = (*pcVar12)(uVar9,uVar10,unaff_x20,plVar1,iVar2);
    *unaff_x19 = (ulong)(uVar3 & ((int)uVar3 >> 0x1f ^ 0xffffffffU));
    return (ulong)(~uVar3 >> 0x1f);
  }
  if ((plVar1[1] == 0) || (plVar1[2] == 0)) {
    uVar8 = 0x90;
    uVar11 = 0x196;
code_r0x00371ef0:
    func_0x0028f83c(4,0,uVar8,"/aws-lc/crypto/rsa_extra/rsa_crypt.c",uVar11);
    return 0;
  }
  iVar4 = func_0x002fae3c(plVar1);
  if (iVar4 == 0) {
    return 0;
  }
  uVar6 = func_0x002f7028(plVar1);
  uVar6 = uVar6 & 0xffffffff;
  if (uVar9 < uVar6) {
    uVar8 = 0x87;
    uVar11 = 0x1a5;
    goto code_r0x00371ef0;
  }
  lVar5 = func_0x0029e1d8();
  if (lVar5 == 0) {
    uVar18 = 0;
    uVar8 = 0;
    goto code_r0x00372054;
  }
  func_0x0029e284();
  lVar17 = func_0x0029e340(lVar5);
  *(long *)((long)register0x00000008 + -0x70) = lVar5;
  lVar5 = func_0x0029e340(lVar5);
  lVar7 = func_0x0036e274(uVar6);
  uVar18 = 0;
  *(long *)((long)register0x00000008 + -0x68) = lVar7;
  *(long *)((long)register0x00000008 + -0x78) = lVar17;
  if (((lVar17 != 0) && (lVar5 != 0)) && (lVar7 != 0)) {
    if (iVar2 == 4) {
      iVar2 = func_0x003714d4(lVar7,uVar6,uVar10,uVar16,0,0,0,0);
code_r0x00371fd0:
      uVar8 = *(undefined8 *)((long)register0x00000008 + -0x78);
      if ((0 < iVar2) &&
         (lVar17 = func_0x0029c764(*(undefined8 *)((long)register0x00000008 + -0x68),uVar6,uVar8),
         lVar17 != 0)) {
        iVar2 = func_0x0029ad7c(uVar8,plVar1[1]);
        if (iVar2 < 0) {
          uVar11 = *(undefined8 *)((long)register0x00000008 + -0x70);
          iVar2 = func_0x002aad18(plVar1 + 0x25,plVar1 + 0xc,plVar1[1],uVar11);
          if ((iVar2 == 0) ||
             (iVar2 = func_0x002a27b4(lVar5,uVar8,plVar1[2],plVar1[0x25] + 0x18,uVar11), iVar2 == 0)
             ) goto code_r0x00372038;
          iVar2 = func_0x0029d578(unaff_x20,uVar6,lVar5);
          if (iVar2 != 0) {
            *unaff_x19 = uVar6;
            uVar18 = 1;
            goto code_r0x0037203c;
          }
          uVar8 = 0x44;
          uVar11 = 0x1dd;
        }
        else {
          uVar8 = 0x73;
          uVar11 = 0x1d1;
        }
        goto code_r0x00372034;
      }
    }
    else {
      if (iVar2 == 3) {
        iVar2 = func_0x002f6870(lVar7,uVar6,uVar10,uVar16);
        goto code_r0x00371fd0;
      }
      if (iVar2 == 1) {
        iVar2 = func_0x00372170(lVar7,uVar6,uVar10,uVar16);
        goto code_r0x00371fd0;
      }
      uVar8 = 0x8f;
      uVar11 = 0x1c3;
code_r0x00372034:
      func_0x0028f83c(4,0,uVar8,"/aws-lc/crypto/rsa_extra/rsa_crypt.c",uVar11);
    }
code_r0x00372038:
    uVar18 = 0;
  }
code_r0x0037203c:
  uVar8 = *(undefined8 *)((long)register0x00000008 + -0x70);
  func_0x0029e4bc(uVar8);
  func_0x0029e220(uVar8);
  uVar8 = *(undefined8 *)((long)register0x00000008 + -0x68);
code_r0x00372054:
  func_0x0036e3d8(uVar8);
  return uVar18;
}


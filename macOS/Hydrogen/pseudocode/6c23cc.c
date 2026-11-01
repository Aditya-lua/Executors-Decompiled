
void FUN_006c23cc(long param_1,ulong param_2,long param_3)

{
  uint uVar1;
  code *pcVar2;
  undefined1 uVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong extraout_x1;
  char cVar7;
  long lVar8;
  int in_w9;
  int in_w10;
  int in_w11;
  ulong uVar9;
  long in_x12;
  long in_x13;
  ulong uVar10;
  ulong in_x14;
  ulong uVar11;
  long in_x15;
  ulong in_x16;
  long in_x17;
  undefined8 *unaff_x19;
  uint unaff_w20;
  undefined4 uVar12;
  int unaff_w21;
  bool bVar13;
  uint unaff_w22;
  long unaff_x24;
  undefined4 unaff_w25;
  undefined8 uVar14;
  undefined8 uVar15;
  uint unaff_w28;
  undefined8 uVar16;
  int iStack000000000000002c;
  uint uStack0000000000000030;
  uint uStack0000000000000034;
  undefined8 in_stack_00000038;
  undefined4 uStack0000000000000040;
  uint uStack0000000000000044;
  uint in_stack_00000048;
  
  while (param_3 != in_x12) {
    in_x14 = in_x14 + 1;
    if (param_3 == in_x13 || in_x16 < in_x14) goto LAB_006c23e8;
    param_2 = in_x14 + param_2 & in_x16;
    param_3 = *(long *)(in_x15 + param_2 * in_x17);
  }
  if (*(char *)(in_x15 + param_2 * 0x18 + 9) == '\0') {
LAB_006c23e8:
    for (lVar8 = *(long *)(param_1 + 0x10); iVar4 = *(int *)(lVar8 + 8),
        lVar8 == 0 || iVar4 != in_w9; lVar8 = *(long *)(lVar8 + 0x20)) {
      if ((iVar4 != in_w10) && (iVar4 != in_w11)) goto LAB_006c1a60;
    }
    if (unaff_x19[0x13] != 0) {
      uVar6 = *(ulong *)(lVar8 + 0x20);
      if (uVar6 != unaff_x19[0x14]) {
        uVar9 = 0;
        uVar10 = uVar6 >> 4 ^ uVar6 >> 9;
        do {
          uVar10 = uVar10 & unaff_x19[0x12] - 1;
          uVar11 = *(ulong *)(unaff_x19[0x11] + uVar10 * 0x18);
          if (uVar11 == uVar6) {
            if (*(char *)(unaff_x19[0x11] + uVar10 * 0x18 + 9) != '\0') goto LAB_006c2484;
            break;
          }
          uVar9 = uVar9 + 1;
          uVar10 = uVar9 + uVar10;
        } while (uVar11 != unaff_x19[0x14] && uVar9 <= unaff_x19[0x12] - 1);
      }
    }
  }
  else {
LAB_006c2484:
    uVar6 = func_0x006ca314();
    if ((uVar6 & 1) == 0) {
      func_0x006cc320();
      goto LAB_006c1f04;
    }
    if (((1 < *(int *)(unaff_x19 + 1)) &&
        (iVar4 = func_0x006d22a0(), *(int *)(unaff_x24 + 0x40) == iVar4)) &&
       ((extraout_x1 & 1) != 0)) {
      func_0x006cc320();
      goto LAB_006c1f04;
    }
  }
LAB_006c1a60:
  iStack000000000000002c = 1;
  uStack0000000000000034 = unaff_w22;
  if (*(char *)(unaff_x24 + 0x48) == '\0') {
    if ((int)unaff_w20 < 0) {
      uVar12 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = (unaff_w28 & 0xff) + 1;
      func_0x006c6028();
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar12;
      uStack0000000000000030 = 0;
      uVar6 = *(ulong *)(unaff_x24 + 0x40);
      goto joined_r0x006c1f8c;
    }
    uStack0000000000000030 = 0;
    uVar6 = *(ulong *)(unaff_x24 + 0x40);
    if (uVar6 != 0) goto code_r0x006c1b70;
code_r0x006c1d14:
    bVar13 = false;
    iVar4 = *(int *)((long)unaff_x19 + 0xc);
  }
  else {
    lVar8 = *(long *)(unaff_x24 + 0x20);
    if (*(int *)(lVar8 + 8) != iRam0000000000a27ad8) {
      lVar8 = 0;
    }
    lVar8 = *(long *)(lVar8 + 0x20);
    iVar4 = *(int *)(lVar8 + 8);
    if (lVar8 == 0 || iVar4 != iRam0000000000a27a98) {
      do {
        if ((iVar4 != iRam0000000000a27a48) && (iVar4 != iRam0000000000a27b38))
        goto code_r0x006c1b3c;
        lVar8 = *(long *)(lVar8 + 0x20);
        iVar4 = *(int *)(lVar8 + 8);
      } while (lVar8 == 0 || iVar4 != iRam0000000000a27a98);
    }
    if (unaff_x19[0x13] != 0) {
      uVar6 = *(ulong *)(lVar8 + 0x20);
      if (uVar6 != unaff_x19[0x14]) {
        uVar9 = 0;
        lVar8 = unaff_x19[0x11];
        uVar10 = uVar6 >> 4 ^ uVar6 >> 9;
        do {
          uVar10 = uVar10 & unaff_x19[0x12] - 1;
          uVar11 = *(ulong *)(lVar8 + uVar10 * 0x18);
          if (uVar11 == uVar6) {
            if (*(char *)(lVar8 + uVar10 * 0x18 + 9) != '\0') {
              uStack0000000000000030 = (uint)*(byte *)(lVar8 + uVar10 * 0x18 + 8);
              uVar6 = *(ulong *)(unaff_x24 + 0x40);
              goto joined_r0x006c1f8c;
            }
            break;
          }
          uVar9 = uVar9 + 1;
          uVar10 = uVar9 + uVar10;
        } while (uVar11 != unaff_x19[0x14] && uVar9 <= unaff_x19[0x12] - 1);
      }
    }
code_r0x006c1b3c:
    uVar12 = *(undefined4 *)((long)unaff_x19 + 0x484);
    *(uint *)((long)unaff_x19 + 0x484) = (unaff_w28 & 0xff) + 1;
    func_0x006c6028();
    *(undefined4 *)((long)unaff_x19 + 0x484) = uVar12;
    uVar6 = *(ulong *)(unaff_x24 + 0x40);
    uStack0000000000000030 = unaff_w28;
joined_r0x006c1f8c:
    if (uVar6 == 0) goto code_r0x006c1d14;
code_r0x006c1b70:
    bVar13 = false;
    uVar9 = 0;
    do {
      while( true ) {
        uVar10 = uVar9 + 1;
        lVar8 = *(long *)(*(long *)(unaff_x24 + 0x38) + uVar9 * 8);
        iVar4 = (unaff_w28 & 0xff) + 1 + (int)uVar9;
        uVar9 = uVar10;
        if (uVar10 == uVar6) break;
        uVar12 = *(undefined4 *)((long)unaff_x19 + 0x484);
        *(uint *)((long)unaff_x19 + 0x484) = (iVar4 + (uint)*(byte *)(unaff_x24 + 0x48) & 0xff) + 1;
        func_0x006c6028();
code_r0x006c1bb0:
        *(undefined4 *)((long)unaff_x19 + 0x484) = uVar12;
        uVar6 = *(ulong *)(unaff_x24 + 0x40);
joined_r0x006c1ce8:
        if (uVar6 <= uVar10) goto code_r0x006c1cec;
      }
      uVar1 = (uint)*(byte *)(unaff_x24 + 0x48) + iVar4;
      if (lVar8 != 0 && *(int *)(lVar8 + 8) == iRam0000000000a27ac8) {
        if ((1 < *(int *)(unaff_x19 + 1)) && (uVar6 = func_0x006ca314(), (uVar6 & 1) == 0)) {
          func_0x006c6028();
          goto code_r0x006c1cd8;
        }
        uVar12 = *(undefined4 *)((long)unaff_x19 + 0x484);
        *(uint *)((long)unaff_x19 + 0x484) = uVar1 & 0xff;
        bVar13 = true;
        func_0x006c17d8();
        goto code_r0x006c1bb0;
      }
      if (lVar8 == 0 || *(int *)(lVar8 + 8) != iRam0000000000a27ab8) {
        func_0x006c6028();
code_r0x006c1cd8:
        bVar13 = false;
        uVar6 = *(ulong *)(unaff_x24 + 0x40);
        goto joined_r0x006c1ce8;
      }
      uVar1 = uVar1 & 0xff;
      uVar12 = *(undefined4 *)((long)unaff_x19 + 0x484);
      *(uint *)((long)unaff_x19 + 0x484) = uVar1;
      uVar14 = *unaff_x19;
      if (0 < *(int *)((long)unaff_x19 + 0xc)) {
        func_0x006b2e98(uVar14,*(int *)(lVar8 + 0xc) + 1);
        uVar14 = *unaff_x19;
      }
      func_0x006b1ccc(uVar14,0x3f,uVar1,0,0);
      bVar13 = true;
      *(undefined4 *)((long)unaff_x19 + 0x484) = uVar12;
      uVar6 = *(ulong *)(unaff_x24 + 0x40);
    } while (uVar10 < uVar6);
code_r0x006c1cec:
    iVar4 = *(int *)((long)unaff_x19 + 0xc);
  }
  if (0 < iVar4) {
    func_0x006b2e98(*unaff_x19,*(int *)(*(long *)(unaff_x24 + 0x20) + 0x14) + 1);
  }
  if (*(char *)(unaff_x24 + 0x48) == '\0') {
    if (iStack000000000000002c != 0) {
      uVar14 = func_0x006b2784(*unaff_x19);
      func_0x006b1ccc(*unaff_x19,0x44,unaff_w20 & 0xff,0,0);
      func_0x006c6028();
      uVar5 = func_0x006b2784(*unaff_x19);
      uVar6 = func_0x006b2964(*unaff_x19,uVar14,uVar5);
      if ((uVar6 & 1) == 0) {
        func_0x006bc388(*(long *)(unaff_x24 + 0x20) + 0xc,
                        "Exceeded jump distance limit; simplify the code to compile");
        goto code_r0x006c26d8;
      }
    }
  }
  else {
    lVar8 = *(long *)(unaff_x24 + 0x20);
    if (*(int *)(lVar8 + 8) != iRam0000000000a27ad8) {
      lVar8 = 0;
    }
    uVar14 = *unaff_x19;
    if (0 < *(int *)((long)unaff_x19 + 0xc)) {
      func_0x006b2e98(uVar14,*(int *)(lVar8 + 0x30) + 1);
      uVar14 = *unaff_x19;
    }
    uVar15 = *(undefined8 *)(lVar8 + 0x28);
    uVar5 = _strlen(uVar15);
    uVar14 = func_0x006b1354(uVar14,uVar15,uVar5);
    if ((int)uVar14 < 0) {
      func_0x006bc388(lVar8 + 0xc,"Exceeded constant limit; simplify the code to compile");
code_r0x006c26d8:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6c26dc);
      (*pcVar2)();
    }
    uVar16 = *unaff_x19;
    uVar3 = func_0x006b401c(uVar15,uVar5);
    func_0x006b1ccc(uVar16,0x14,in_stack_00000048 & 0xff,uStack0000000000000030 & 0xff,uVar3);
    func_0x006b24c4(*unaff_x19,uVar14);
    func_0x006c9bf0();
  }
  if (bVar13) {
    cVar7 = '\0';
  }
  else {
    cVar7 = *(char *)(unaff_x24 + 0x48) + *(char *)(unaff_x24 + 0x40) + '\x01';
  }
  uVar1 = 0;
  if (in_stack_00000038._4_4_ == 0) {
    uVar1 = uStack0000000000000044 + 1;
  }
  func_0x006b1ccc(*unaff_x19,0x15,in_stack_00000048 & 0xff,cVar7,uVar1 & 0xff);
  unaff_w25 = uStack0000000000000040;
  if (((uStack0000000000000034 & 1) == 0) && (uStack0000000000000044 != 0)) {
    uVar6 = 0;
    do {
      func_0x006b1ccc(*unaff_x19,6,(int)uVar6 + unaff_w21 & 0xff,
                      in_stack_00000048 + (int)uVar6 & 0xff,0);
      uVar6 = uVar6 + 1;
    } while (uStack0000000000000044 != uVar6);
  }
LAB_006c1f04:
  *(undefined4 *)((long)unaff_x19 + 0x484) = unaff_w25;
  return;
}


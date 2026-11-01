
void FUN_000e5574(void)

{
  float *pfVar1;
  long lVar2;
  uint *puVar3;
  int iVar4;
  char *pcVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  undefined4 uVar9;
  undefined8 uVar10;
  long lVar11;
  int iVar12;
  undefined4 *puVar13;
  int *piVar14;
  int *unaff_x19;
  long unaff_x21;
  int *piVar15;
  long lVar16;
  int unaff_w23;
  int unaff_w24;
  long lVar17;
  long unaff_x25;
  long unaff_x27;
  long unaff_x29;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  
  iVar7 = func_0x000b875c();
  lVar16 = unaff_x21 + iVar7;
  iVar12 = *unaff_x19;
  iVar7 = iVar12;
  if (2 < iVar12) {
    iVar7 = 3;
  }
  if (1 < iVar7) {
    func_0x00127ea0();
    iVar7 = func_0x000b875c(lVar16,unaff_x25 - lVar16,"%s\'%s\'");
    lVar16 = lVar16 + iVar7;
    iVar12 = *unaff_x19;
    iVar7 = iVar12;
    if (2 < iVar12) {
      iVar7 = 3;
    }
    if (2 < iVar7) {
      func_0x00127ea0();
      iVar7 = func_0x000b875c(lVar16,unaff_x25 - lVar16,"%s\'%s\'");
      lVar16 = lVar16 + iVar7;
      iVar12 = *unaff_x19;
    }
  }
  pcVar5 = " ... }";
  if (iVar12 < 4) {
    pcVar5 = " } ";
  }
  func_0x000b875c(lVar16,unaff_x25 - lVar16,pcVar5);
  if (unaff_w23 < unaff_w24) {
    lVar16 = *(long *)(unaff_x27 + 0x4c0);
    in_stack_00000058 = *(undefined8 *)(&UNK_000039d4 + lVar16);
    uStack0000000000000050 = *(undefined8 *)(&UNK_000039cc + lVar16);
    piVar15 = (int *)(&UNK_00004a70 + lVar16);
    iVar7 = *piVar15;
    if (iVar7 == *(int *)(&UNK_00004a74 + lVar16)) {
      iVar12 = iVar7;
      if (iVar7 < 0) {
        iVar12 = iVar7 + 1;
      }
      iVar4 = 8;
      if (iVar7 != 0) {
        iVar4 = iVar7 + (iVar12 >> 1);
      }
      if (iVar4 <= iVar7 + 1) {
        iVar4 = iVar7 + 1;
      }
      func_0x000c21e8(piVar15,iVar4);
      iVar7 = *piVar15;
    }
    puVar13 = (undefined4 *)(*(long *)(&UNK_00004a78 + lVar16) + (long)iVar7 * 0x14);
    *puVar13 = 0;
    *(undefined8 *)(puVar13 + 3) = in_stack_00000058;
    *(undefined8 *)(puVar13 + 1) = uStack0000000000000050;
    *(int *)(&UNK_00004a70 + lVar16) = *(int *)(&UNK_00004a70 + lVar16) + 1;
    if (*(int *)(&UNK_00004a6c + lVar16) != 0) {
      *(undefined8 *)(&UNK_000039d4 + lVar16) = *(undefined8 *)(&UNK_000039e4 + lVar16);
      *(undefined8 *)(&UNK_000039cc + lVar16) = *(undefined8 *)(&UNK_000039dc + lVar16);
    }
    uVar8 = func_0x001226d4();
    lVar16 = *(long *)(unaff_x27 + 0x4c0);
    piVar15 = (int *)(&UNK_00004a70 + lVar16);
    if (*piVar15 < 1) goto joined_r0x000e5804;
    piVar14 = (int *)(*(long *)(&UNK_00004a78 + lVar16) + (ulong)(*piVar15 - 1) * 0x14);
    lVar16 = lVar16 + (long)*piVar14 * 0x10;
    uVar10 = *(undefined8 *)(piVar14 + 1);
    *(undefined8 *)(&UNK_000039d4 + lVar16) = *(undefined8 *)(piVar14 + 3);
    *(undefined8 *)(&UNK_000039cc + lVar16) = uVar10;
    *piVar15 = *piVar15 + -1;
  }
  else {
    uVar8 = func_0x001226d4();
    iVar7 = func_0x000c2648(0);
    if (iVar7 == 0) goto joined_r0x000e5804;
    uVar10 = func_0x000c2e18(**(undefined8 **)(&UNK_00004b10 + *(long *)(unaff_x27 + 0x4c0)),1,
                             "##Foreground");
    func_0x000f3af4(0,0x3f800000,uVar10,unaff_x19 + 0xb,unaff_x19 + 0xd,0xff00ffff,0);
    uStack0000000000000048._0_4_ = unaff_x19[0x17];
    uStack0000000000000050 = CONCAT44(unaff_x19[0xc],(int)uStack0000000000000048);
    uStack0000000000000048._4_4_ = unaff_x19[0xe];
    func_0x000f397c(0x3f800000,uVar10,&uStack0000000000000050,&uStack0000000000000048,0xff00ff00);
    uStack0000000000000048._0_4_ = unaff_x19[0x18];
    uStack0000000000000050 = CONCAT44(unaff_x19[0xc],(int)uStack0000000000000048);
    uStack0000000000000048._4_4_ = unaff_x19[0xe];
    func_0x000f397c(0x3f800000,uVar10,&uStack0000000000000050,&uStack0000000000000048,0xff00ff00);
  }
  uVar8 = uVar8 & 1;
joined_r0x000e5804:
  if (uVar8 != 0) {
    if (0 < *unaff_x19) {
      lVar11 = 0;
      lVar16 = 0;
      lVar17 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
      do {
        lVar2 = *(long *)(unaff_x19 + 2) + lVar11;
        uVar9 = func_0x000c1858(lVar17,lVar2);
        iVar7 = *(int *)(lVar17 + 0x100);
        if (iVar7 == *(int *)(lVar17 + 0x104)) {
          iVar12 = iVar7;
          if (iVar7 < 0) {
            iVar12 = iVar7 + 1;
          }
          iVar4 = 8;
          if (iVar7 != 0) {
            iVar4 = iVar7 + (iVar12 >> 1);
          }
          if (iVar4 <= iVar7 + 1) {
            iVar4 = iVar7 + 1;
          }
          func_0x000eb9f0((int *)(lVar17 + 0x100),iVar4);
          iVar7 = *(int *)(lVar17 + 0x100);
        }
        *(undefined4 *)(*(long *)(lVar17 + 0x108) + (long)iVar7 * 4) = uVar9;
        *(int *)(lVar17 + 0x100) = *(int *)(lVar17 + 0x100) + 1;
        iVar7 = func_0x0010beb8("<");
        if (iVar7 == 0) {
          lVar17 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
          if (*(char *)(lVar17 + 0xc3) != '\0') goto code_r0x000e5980;
code_r0x000e59b0:
          *(float *)(lVar17 + 0x110) = *(float *)(lVar17 + 0x118) + 2.0;
          *(undefined4 *)(lVar17 + 0x114) = *(undefined4 *)(lVar17 + 0x11c);
          *(undefined8 *)(lVar17 + 0x138) = *(undefined8 *)(lVar17 + 0x140);
          *(undefined4 *)(lVar17 + 0x148) = *(undefined4 *)(lVar17 + 0x14c);
          *(undefined1 *)(lVar17 + 0x150) = 1;
          iVar7 = func_0x0010beb8(">");
        }
        else {
          func_0x00127ff4(unaff_x19,lVar2,0xffffffff);
          lVar17 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
          if (*(char *)(lVar17 + 0xc3) == '\0') goto code_r0x000e59b0;
code_r0x000e5980:
          iVar7 = func_0x0010beb8(">");
        }
        if (iVar7 != 0) {
          func_0x00127ff4(unaff_x19,lVar2,1);
        }
        lVar17 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
        if (*(char *)(lVar17 + 0xc3) == '\0') {
          *(float *)(lVar17 + 0x110) =
               *(float *)(&UNK_00003934 + *(long *)(unaff_x27 + 0x4c0)) + *(float *)(lVar17 + 0x118)
          ;
          *(undefined4 *)(lVar17 + 0x114) = *(undefined4 *)(lVar17 + 0x11c);
          *(undefined8 *)(lVar17 + 0x138) = *(undefined8 *)(lVar17 + 0x140);
          *(undefined4 *)(lVar17 + 0x148) = *(undefined4 *)(lVar17 + 0x14c);
          *(undefined1 *)(lVar17 + 0x150) = 1;
        }
        func_0x00127ea0(unaff_x19,lVar2);
        func_0x0010adc0("%02d%c Tab 0x%08X \'%s\' Offset: %.2f, Width: %.2f/%.2f");
        lVar17 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
        *(int *)(lVar17 + 0x100) = *(int *)(lVar17 + 0x100) + -1;
        lVar16 = lVar16 + 1;
        lVar11 = lVar11 + 0x2c;
      } while (lVar16 < *unaff_x19);
    }
    func_0x00123710();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  lVar11 = ___stack_chk_fail();
  lVar16 = lRam0000000000a334c0;
  if (*(char *)(lVar11 + 0xf) != '\0') {
    piVar15 = (int *)(&UNK_00004ab0 + lRam0000000000a334c0);
    puVar3 = (uint *)(&UNK_0000497c + lRam0000000000a334c0);
    uVar8 = *puVar3;
    if ((uVar8 >> 2 & 1) == 0) {
      pfVar1 = (float *)(&UNK_000038e8 + lRam0000000000a334c0);
      *(float *)(&UNK_00005ea0 + lRam0000000000a334c0) = *pfVar1;
      *(float *)(&UNK_000038e8 + lVar16) = *pfVar1 * *(float *)(&UNK_000038ec + lVar16);
    }
    uVar8 = uVar8 | 4;
    *puVar3 = uVar8;
    iVar7 = *piVar15;
    if (iVar7 == *(int *)(&UNK_00004ab4 + lVar16)) {
      iVar12 = iVar7;
      if (iVar7 < 0) {
        iVar12 = iVar7 + 1;
      }
      iVar4 = 8;
      if (iVar7 != 0) {
        iVar4 = iVar7 + (iVar12 >> 1);
      }
      if (iVar4 <= iVar7 + 1) {
        iVar4 = iVar7 + 1;
      }
      func_0x000eb9f0(piVar15,iVar4);
      iVar7 = *piVar15;
      uVar8 = *puVar3;
    }
    *(uint *)(*(long *)(&UNK_00004ab8 + lVar16) + (long)iVar7 * 4) = uVar8;
    *piVar15 = *piVar15 + 1;
    *(short *)(&UNK_00005ea4 + lVar16) = *(short *)(&UNK_00005ea4 + lVar16) + 1;
  }
  func_0x0010adc0("0x%08X \"%s\" Pos (%d,%d) Size (%d,%d) Collapsed=%d");
  lVar16 = lRam0000000000a334c0;
  if (*(char *)(lVar11 + 0xf) != '\0') {
    piVar15 = (int *)(&UNK_00004ab0 + lRam0000000000a334c0);
    *(short *)(&UNK_00005ea4 + lRam0000000000a334c0) =
         *(short *)(&UNK_00005ea4 + lRam0000000000a334c0) + -1;
    uVar8 = *(uint *)(&UNK_0000497c + lVar16);
    iVar7 = *piVar15;
    *piVar15 = iVar7 + -1;
    uVar6 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar16) + (long)(iVar7 + -2) * 4);
    *(uint *)(&UNK_0000497c + lVar16) = uVar6;
    if (((uVar8 >> 2 & 1) != 0) && ((uVar6 >> 2 & 1) == 0)) {
      *(undefined4 *)(&UNK_000038e8 + lVar16) = *(undefined4 *)(&UNK_00005ea0 + lVar16);
    }
  }
  return;
}


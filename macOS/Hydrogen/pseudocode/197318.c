
void FUN_00197318(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  int iVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  undefined *puVar15;
  long *plVar16;
  long unaff_x19;
  long unaff_x20;
  long *plVar17;
  long *unaff_x23;
  long unaff_x24;
  long unaff_x26;
  long lVar18;
  long *plVar19;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  
  if (*(long *)(unaff_x19 + 0x28) == 0) {
    puVar15 = &UNK_009c1710;
  }
  else {
    lVar7 = _CFRetain();
    plVar17 = in_stack_00000048;
    if (lVar7 != 0) {
      uStack0000000000000088 = (undefined8 *)unaff_x20;
      if (in_stack_00000048 == uStack0000000000000038) {
        func_0x0019275c(&uStack0000000000000038,&UNK_009c18b8);
      }
      plVar14 = (long *)(in_stack_00000040 + (long)plVar17 * 0x10);
      *plVar14 = unaff_x20;
      plVar14[1] = lVar7;
      in_stack_00000048 = (long *)((long)plVar17 + 1);
      uVar8 = func_0x0018e2ec(in_stack_00000040,in_stack_00000048);
      uStack0000000000000050 = 0;
      iVar6 = _SecPKCS12Import(uStack0000000000000030,uVar8,&uStack0000000000000050);
      lVar7 = uStack0000000000000050;
      if (iVar6 != 0) {
        *(int *)(unaff_x23 + 1) = iVar6;
        *unaff_x23 = -0x8000000000000000;
        _CFRelease(uVar8);
        lVar7 = in_stack_00000040;
        for (plVar17 = in_stack_00000048; plVar17 != (long *)0x0;
            plVar17 = (long *)((long)plVar17 + -1)) {
          func_0x0019fb28(lVar7);
          func_0x0019e6a4(lVar7 + 8);
          lVar7 = lVar7 + 0x10;
        }
code_r0x00197750:
        if (uStack0000000000000038 != (long *)0x0) {
          func_0x00187bd4(in_stack_00000040,(long)uStack0000000000000038 << 4,8);
        }
        func_0x0019fb28(&uStack0000000000000030);
        return;
      }
      if (uStack0000000000000050 != 0) {
        uStack0000000000000058 = 0;
        in_stack_00000060 = 8;
        in_stack_00000068 = 0;
        lVar9 = _CFArrayGetCount(uStack0000000000000050);
        if (0 < lVar9) {
          lVar18 = 0;
          uStack0000000000000000 = 1;
          plVar14 = unaff_x23;
          do {
            lVar10 = _CFArrayGetValueAtIndex(lVar7,lVar18);
            if (lVar10 == 0) {
              func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
              goto LAB_00197930;
            }
            uStack0000000000000088 = (undefined8 *)0x0;
            iVar6 = _CFDictionaryGetValueIfPresent
                              (lVar10,*(undefined8 *)PTR__kSecImportItemLabel_009b03b8,
                               &uStack0000000000000088);
            if (iVar6 == 0) {
              lVar11 = -0x8000000000000000;
            }
            else {
              if ((uStack0000000000000088 == (undefined8 *)0x0) ||
                 (lVar11 = _CFRetain(), lVar11 == 0)) {
                func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
                goto LAB_00197930;
              }
              *(undefined8 *)(unaff_x29 + -0x80) = 0;
              *(undefined8 *)(unaff_x29 + -0x78) = 1;
              *(undefined8 *)(unaff_x29 + -0x70) = 0;
              uStack0000000000000088 = (undefined8 *)(unaff_x29 + -0x80);
              uStack0000000000000070 = lVar11;
              iVar6 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
              if (iVar6 != 0) {
                func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x61,&UNK_009c17a0,&UNK_009c1770);
                goto LAB_00197930;
              }
              lVar11 = *(long *)(unaff_x29 + -0x80);
              in_stack_00000028 = *(long *)(unaff_x29 + -0x78);
              unaff_x26 = *(long *)(unaff_x29 + -0x70);
              func_0x0019fb28(&uStack0000000000000070);
            }
            uStack0000000000000088 = (undefined8 *)0x0;
            iVar6 = _CFDictionaryGetValueIfPresent
                              (lVar10,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                               &uStack0000000000000088);
            if (iVar6 == 0) {
              plVar19 = (long *)0x8000000000000000;
            }
            else {
              if ((uStack0000000000000088 == (undefined8 *)0x0) ||
                 (lVar12 = _CFRetain(), lVar12 == 0)) {
                func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
                goto LAB_00197930;
              }
              uStack0000000000000088 = (undefined8 *)lVar12;
              lVar13 = _CFDataGetBytePtr();
              if (lVar13 == 0) {
                plVar14 = (long *)0x0;
                lVar13 = 1;
code_r0x00197594:
                plVar17 = (long *)((long)&MACH_HEADER.magic + 1);
              }
              else {
                plVar14 = (long *)_CFDataGetLength(lVar12);
                if ((long)plVar14 < 0) {
                  uStack0000000000000000 = 0;
code_r0x0019791c:
                  func_0x007a1f00(uStack0000000000000000,plVar17,&UNK_009c17f0);
                  goto LAB_00197930;
                }
                if (plVar14 == (long *)0x0) goto code_r0x00197594;
                plVar17 = (long *)func_0x00187bd0(plVar14,1);
                if (plVar17 == (long *)0x0) {
                  plVar17 = plVar14;
                  goto code_r0x0019791c;
                }
              }
              _memcpy(plVar17,lVar13,plVar14);
              func_0x0019fb28(&uStack0000000000000088);
              plVar19 = plVar14;
            }
            uStack0000000000000088 = (undefined8 *)0x0;
            iVar6 = _CFDictionaryGetValueIfPresent
                              (lVar10,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
                               &uStack0000000000000088);
            if (iVar6 == 0) {
              lVar12 = 0;
            }
            else {
              if ((uStack0000000000000088 == (undefined8 *)0x0) ||
                 (unaff_x24 = _CFRetain(), unaff_x24 == 0)) {
                func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18e8);
                goto LAB_00197930;
              }
              lVar12 = 1;
            }
            uStack0000000000000088 = (undefined8 *)0x0;
            iVar6 = _CFDictionaryGetValueIfPresent
                              (lVar10,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                               &uStack0000000000000088);
            if (iVar6 == 0) {
              uStack0000000000000070 = -0x8000000000000000;
            }
            else {
              if ((uStack0000000000000088 == (undefined8 *)0x0) ||
                 (lVar13 = _CFRetain(), lVar13 == 0)) {
                func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
                goto LAB_00197930;
              }
              uStack0000000000000070 = lVar13;
              _CFArrayGetCount();
              uStack0000000000000088 = &uStack0000000000000070;
              func_0x0018bd2c(unaff_x29 + -0x80,&uStack0000000000000088,&UNK_009c1788);
              _CFRelease(uStack0000000000000070);
              in_stack_00000078 = *(long *)(unaff_x29 + -0x78);
              uStack0000000000000070 = *(long *)(unaff_x29 + -0x80);
              in_stack_00000080 = *(long *)(unaff_x29 + -0x70);
            }
            uStack0000000000000088 = (undefined8 *)0x0;
            lVar10 = _CFDictionaryGetValueIfPresent
                               (lVar10,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
                                &uStack0000000000000088);
            if ((int)lVar10 == 0) {
              lVar13 = 0;
            }
            else {
              if ((uStack0000000000000088 == (undefined8 *)0x0) ||
                 (lVar10 = _CFRetain(), lVar10 == 0)) {
                func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18d0);
                goto LAB_00197930;
              }
              lVar13 = 1;
            }
            lVar4 = in_stack_00000080;
            lVar3 = in_stack_00000078;
            lVar2 = uStack0000000000000070;
            lVar1 = in_stack_00000068;
            uStack0000000000000088 = (undefined8 *)lVar12;
            if (in_stack_00000068 == uStack0000000000000058) {
              func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
            }
            lVar18 = lVar18 + 1;
            plVar16 = (long *)(in_stack_00000060 + lVar1 * 0x68);
            plVar16[1] = unaff_x24;
            *plVar16 = (long)uStack0000000000000088;
            plVar16[7] = (long)plVar19;
            plVar16[6] = unaff_x26;
            plVar16[9] = (long)plVar14;
            plVar16[8] = (long)plVar17;
            plVar16[0xb] = lVar3;
            plVar16[10] = lVar2;
            plVar16[0xc] = lVar4;
            plVar16[3] = lVar10;
            plVar16[2] = lVar13;
            plVar16[5] = in_stack_00000028;
            plVar16[4] = lVar11;
            in_stack_00000068 = lVar1 + 1;
          } while (lVar9 != lVar18);
        }
        unaff_x23[1] = in_stack_00000060;
        *unaff_x23 = uStack0000000000000058;
        unaff_x23[2] = in_stack_00000068;
        _CFRelease(lVar7);
        _CFRelease(uVar8);
        lVar7 = in_stack_00000040;
        for (plVar17 = in_stack_00000048; plVar17 != (long *)0x0;
            plVar17 = (long *)((long)plVar17 + -1)) {
          func_0x0019fb28(lVar7);
          func_0x0019e6a4(lVar7 + 8);
          lVar7 = lVar7 + 0x10;
        }
        goto code_r0x00197750;
      }
      func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
      goto LAB_00197930;
    }
    puVar15 = &UNK_009c1728;
  }
  func_0x007a11c0(&UNK_0081bbc0,0x22,puVar15);
LAB_00197930:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x197934);
  (*pcVar5)();
}


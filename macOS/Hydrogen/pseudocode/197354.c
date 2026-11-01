
void FUN_00197354(long param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long *plVar10;
  undefined8 unaff_x19;
  long lVar11;
  undefined8 unaff_x20;
  long *unaff_x21;
  long lVar12;
  long *unaff_x23;
  undefined *unaff_x24;
  long unaff_x26;
  long lVar13;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long lStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined *in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long *in_stack_000000c0;
  long *in_stack_000000c8;
  long *in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  
  puVar1 = (undefined8 *)(param_1 + (long)unaff_x21 * 0x10);
  *puVar1 = unaff_x20;
  puVar1[1] = unaff_x19;
  lStack0000000000000048 = (long)unaff_x21 + 1;
  uVar4 = func_0x0018e2ec(in_stack_00000040,lStack0000000000000048);
  uStack0000000000000050 = 0;
  iVar3 = _SecPKCS12Import(uStack0000000000000030,uVar4,&uStack0000000000000050);
  lVar11 = uStack0000000000000050;
  if (iVar3 == 0) {
    if (uStack0000000000000050 == 0) {
      func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
code_r0x00197930:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x197934);
      (*pcVar2)();
    }
    uStack0000000000000058 = 0;
    in_stack_00000060 = 8;
    in_stack_00000068 = 0;
    lVar12 = _CFArrayGetCount(uStack0000000000000050);
    if (0 < lVar12) {
      lVar13 = 0;
      uStack0000000000000000 = 1;
      plVar9 = unaff_x23;
      do {
        lVar5 = _CFArrayGetValueAtIndex(lVar11,lVar13);
        if (lVar5 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
          goto code_r0x00197930;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (lVar5,*(undefined8 *)PTR__kSecImportItemLabel_009b03b8,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          lVar6 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar6 = _CFRetain(), lVar6 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
            goto code_r0x00197930;
          }
          *(undefined8 *)(unaff_x29 + -0x80) = 0;
          *(undefined8 *)(unaff_x29 + -0x78) = 1;
          *(undefined8 *)(unaff_x29 + -0x70) = 0;
          in_stack_00000098 = 0xe0000020;
          uStack0000000000000088 = (undefined8 *)(unaff_x29 + -0x80);
          in_stack_00000090 = &UNK_009c1740;
          uStack0000000000000070 = lVar6;
          iVar3 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
          if (iVar3 != 0) {
            func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x61,&UNK_009c17a0,&UNK_009c1770);
            goto code_r0x00197930;
          }
          lVar6 = *(long *)(unaff_x29 + -0x80);
          in_stack_00000028 = *(long *)(unaff_x29 + -0x78);
          unaff_x26 = *(long *)(unaff_x29 + -0x70);
          func_0x0019fb28(&uStack0000000000000070);
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (lVar5,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          plVar10 = (long *)0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar7 = _CFRetain(), lVar7 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
            goto code_r0x00197930;
          }
          uStack0000000000000088 = (undefined8 *)lVar7;
          lVar8 = _CFDataGetBytePtr();
          if (lVar8 == 0) {
            plVar9 = (long *)0x0;
            lVar8 = 1;
code_r0x00197594:
            unaff_x21 = (long *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            plVar9 = (long *)_CFDataGetLength(lVar7);
            if ((long)plVar9 < 0) {
              uStack0000000000000000 = 0;
code_r0x0019791c:
              func_0x007a1f00(uStack0000000000000000,unaff_x21,&UNK_009c17f0);
              goto code_r0x00197930;
            }
            if (plVar9 == (long *)0x0) goto code_r0x00197594;
            unaff_x21 = (long *)func_0x00187bd0(plVar9,1);
            if (unaff_x21 == (long *)0x0) {
              unaff_x21 = plVar9;
              goto code_r0x0019791c;
            }
          }
          _memcpy(unaff_x21,lVar8,plVar9);
          func_0x0019fb28(&uStack0000000000000088);
          plVar10 = plVar9;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (lVar5,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          lVar7 = 0;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) ||
             (unaff_x24 = (undefined *)_CFRetain(), unaff_x24 == (undefined *)0x0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18e8);
            goto code_r0x00197930;
          }
          lVar7 = 1;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (lVar5,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          uStack0000000000000070 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar8 = _CFRetain(), lVar8 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
            goto code_r0x00197930;
          }
          uStack0000000000000070 = lVar8;
          in_stack_00000098 = _CFArrayGetCount();
          uStack0000000000000088 = &uStack0000000000000070;
          in_stack_00000090 = (undefined *)0x0;
          func_0x0018bd2c(unaff_x29 + -0x80,&uStack0000000000000088,&UNK_009c1788);
          _CFRelease(uStack0000000000000070);
          in_stack_00000078 = *(long *)(unaff_x29 + -0x78);
          uStack0000000000000070 = *(long *)(unaff_x29 + -0x80);
          in_stack_00000080 = *(long *)(unaff_x29 + -0x70);
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        lVar5 = _CFDictionaryGetValueIfPresent
                          (lVar5,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
                           &uStack0000000000000088);
        if ((int)lVar5 == 0) {
          in_stack_00000098 = 0;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar5 = _CFRetain(), lVar5 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18d0);
            goto code_r0x00197930;
          }
          in_stack_00000098 = 1;
        }
        lVar8 = in_stack_00000068;
        in_stack_000000b0 = in_stack_00000028;
        in_stack_000000e0 = in_stack_00000078;
        in_stack_000000d8 = uStack0000000000000070;
        in_stack_000000e8 = in_stack_00000080;
        uStack0000000000000088 = (undefined8 *)lVar7;
        in_stack_00000090 = unaff_x24;
        in_stack_000000a0 = lVar5;
        in_stack_000000a8 = lVar6;
        in_stack_000000b8 = unaff_x26;
        in_stack_000000c0 = plVar10;
        in_stack_000000c8 = unaff_x21;
        in_stack_000000d0 = plVar9;
        if (in_stack_00000068 == uStack0000000000000058) {
          func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
        }
        lVar13 = lVar13 + 1;
        plVar10 = (long *)(in_stack_00000060 + lVar8 * 0x68);
        plVar10[1] = (long)in_stack_00000090;
        *plVar10 = (long)uStack0000000000000088;
        plVar10[7] = (long)in_stack_000000c0;
        plVar10[6] = in_stack_000000b8;
        plVar10[9] = (long)in_stack_000000d0;
        plVar10[8] = (long)in_stack_000000c8;
        plVar10[0xb] = in_stack_000000e0;
        plVar10[10] = in_stack_000000d8;
        plVar10[0xc] = in_stack_000000e8;
        plVar10[3] = in_stack_000000a0;
        plVar10[2] = in_stack_00000098;
        plVar10[5] = in_stack_000000b0;
        plVar10[4] = in_stack_000000a8;
        in_stack_00000068 = lVar8 + 1;
      } while (lVar12 != lVar13);
    }
    unaff_x23[1] = in_stack_00000060;
    *unaff_x23 = uStack0000000000000058;
    unaff_x23[2] = in_stack_00000068;
    _CFRelease(lVar11);
    _CFRelease(uVar4);
    lVar11 = in_stack_00000040;
    for (lVar12 = lStack0000000000000048; lVar12 != 0; lVar12 = lVar12 + -1) {
      func_0x0019fb28(lVar11);
      func_0x0019e6a4(lVar11 + 8);
      lVar11 = lVar11 + 0x10;
    }
  }
  else {
    *(int *)(unaff_x23 + 1) = iVar3;
    *unaff_x23 = -0x8000000000000000;
    _CFRelease(uVar4);
    lVar11 = in_stack_00000040;
    for (lVar12 = lStack0000000000000048; lVar12 != 0; lVar12 = lVar12 + -1) {
      func_0x0019fb28(lVar11);
      func_0x0019e6a4(lVar11 + 8);
      lVar11 = lVar11 + 0x10;
    }
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038 << 4,8);
  }
  func_0x0019fb28(&uStack0000000000000030);
  return;
}


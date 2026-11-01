
void FUN_001974a8(long param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long unaff_x19;
  long unaff_x21;
  long lVar8;
  long unaff_x23;
  undefined *unaff_x24;
  long lVar9;
  long lVar10;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
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
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  
code_r0x001974a8:
  if (param_1 != 0) {
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    *(undefined8 *)(unaff_x29 + -0x78) = 1;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
    in_stack_00000098 = 0xe0000020;
    uStack0000000000000088 = (undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000090 = &UNK_009c1740;
    uStack0000000000000070 = param_1;
    iVar3 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
    if (iVar3 == 0) {
      lVar9 = *(long *)(unaff_x29 + -0x80);
      lVar8 = *(long *)(unaff_x29 + -0x78);
      lVar10 = *(long *)(unaff_x29 + -0x70);
      func_0x0019fb28(&uStack0000000000000070);
      do {
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          lVar4 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
            goto code_r0x00197930;
          }
          uStack0000000000000088 = (undefined8 *)lVar4;
          lVar5 = _CFDataGetBytePtr();
          if (lVar5 == 0) {
            unaff_x23 = 0;
            lVar5 = 1;
LAB_00197594:
            unaff_x21 = 1;
          }
          else {
            unaff_x23 = _CFDataGetLength(lVar4);
            if (unaff_x23 < 0) {
              in_stack_00000000 = 0;
code_r0x0019791c:
              func_0x007a1f00(in_stack_00000000,unaff_x21,&UNK_009c17f0);
              goto code_r0x00197930;
            }
            if (unaff_x23 == 0) goto LAB_00197594;
            unaff_x21 = func_0x00187bd0(unaff_x23,1);
            if (unaff_x21 == 0) {
              unaff_x21 = unaff_x23;
              goto code_r0x0019791c;
            }
          }
          _memcpy(unaff_x21,lVar5,unaff_x23);
          func_0x0019fb28(&uStack0000000000000088);
          lVar4 = unaff_x23;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          lVar5 = 0;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) ||
             (unaff_x24 = (undefined *)_CFRetain(), unaff_x24 == (undefined *)0x0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18e8);
            goto code_r0x00197930;
          }
          lVar5 = 1;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          uStack0000000000000070 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar6 = _CFRetain(), lVar6 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
            goto code_r0x00197930;
          }
          uStack0000000000000070 = lVar6;
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
        lVar6 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
                           &uStack0000000000000088);
        if ((int)lVar6 == 0) {
          in_stack_00000098 = 0;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar6 = _CFRetain(), lVar6 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18d0);
            goto code_r0x00197930;
          }
          in_stack_00000098 = 1;
        }
        lVar1 = in_stack_00000068;
        in_stack_000000e0 = in_stack_00000078;
        in_stack_000000d8 = uStack0000000000000070;
        in_stack_000000e8 = in_stack_00000080;
        uStack0000000000000088 = (undefined8 *)lVar5;
        in_stack_00000090 = unaff_x24;
        in_stack_000000a0 = lVar6;
        in_stack_000000a8 = lVar9;
        in_stack_000000b0 = lVar8;
        in_stack_000000b8 = lVar10;
        in_stack_000000c0 = lVar4;
        in_stack_000000c8 = unaff_x21;
        in_stack_000000d0 = unaff_x23;
        if (in_stack_00000068 == uStack0000000000000058) {
          func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
        }
        unaff_x27 = unaff_x27 + 1;
        plVar7 = (long *)(in_stack_00000060 + lVar1 * 0x68);
        plVar7[1] = (long)in_stack_00000090;
        *plVar7 = (long)uStack0000000000000088;
        plVar7[7] = in_stack_000000c0;
        plVar7[6] = in_stack_000000b8;
        plVar7[9] = in_stack_000000d0;
        plVar7[8] = in_stack_000000c8;
        plVar7[0xb] = in_stack_000000e0;
        plVar7[10] = in_stack_000000d8;
        plVar7[0xc] = in_stack_000000e8;
        plVar7[3] = in_stack_000000a0;
        plVar7[2] = in_stack_00000098;
        plVar7[5] = in_stack_000000b0;
        plVar7[4] = in_stack_000000a8;
        in_stack_00000068 = lVar1 + 1;
        if (in_stack_00000020 == unaff_x27) {
          in_stack_00000008[1] = in_stack_00000060;
          *in_stack_00000008 = uStack0000000000000058;
          in_stack_00000008[2] = in_stack_00000068;
          _CFRelease(in_stack_00000018);
          _CFRelease(in_stack_00000010);
          lVar9 = in_stack_00000040;
          for (lVar8 = in_stack_00000048; lVar8 != 0; lVar8 = lVar8 + -1) {
            func_0x0019fb28(lVar9);
            func_0x0019e6a4(lVar9 + 8);
            lVar9 = lVar9 + 0x10;
          }
          if (in_stack_00000038 != 0) {
            func_0x00187bd4(in_stack_00000040,in_stack_00000038 << 4,8);
          }
          func_0x0019fb28(&uStack0000000000000030);
          return;
        }
        unaff_x19 = _CFArrayGetValueAtIndex(in_stack_00000018,unaff_x27);
        if (unaff_x19 == 0) {
          func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
          goto code_r0x00197930;
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemLabel_009b03b8,
                           &uStack0000000000000088);
        if (iVar3 != 0) goto code_r0x0019749c;
        lVar9 = -0x8000000000000000;
      } while( true );
    }
    func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x61,&UNK_009c17a0,&UNK_009c1770);
    goto code_r0x00197930;
  }
  goto LAB_00197790;
code_r0x0019749c:
  if (uStack0000000000000088 == (undefined8 *)0x0) {
LAB_00197790:
    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
code_r0x00197930:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x197934);
    (*pcVar2)();
  }
  param_1 = _CFRetain();
  goto code_r0x001974a8;
}


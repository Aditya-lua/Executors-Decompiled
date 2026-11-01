
void FUN_00197598(void)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar7;
  long unaff_x23;
  undefined *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
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
  
  do {
    while( true ) {
      _memcpy(unaff_x21,unaff_x20,unaff_x23);
      func_0x0019fb28(&uStack0000000000000088);
      lVar4 = unaff_x23;
      while( true ) {
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
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
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                           &uStack0000000000000088);
        if (iVar3 == 0) {
          uStack0000000000000070 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar5 = _CFRetain(), lVar5 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
            goto code_r0x00197930;
          }
          uStack0000000000000070 = lVar5;
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
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
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
        lVar1 = in_stack_00000068;
        in_stack_000000b0 = in_stack_00000028;
        in_stack_000000e0 = in_stack_00000078;
        in_stack_000000d8 = uStack0000000000000070;
        in_stack_000000e8 = in_stack_00000080;
        uStack0000000000000088 = (undefined8 *)lVar7;
        in_stack_00000090 = unaff_x24;
        in_stack_000000a0 = lVar5;
        in_stack_000000a8 = unaff_x25;
        in_stack_000000b8 = unaff_x26;
        in_stack_000000c0 = lVar4;
        in_stack_000000c8 = unaff_x21;
        in_stack_000000d0 = unaff_x23;
        if (in_stack_00000068 == uStack0000000000000058) {
          func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
        }
        unaff_x27 = unaff_x27 + 1;
        plVar6 = (long *)(in_stack_00000060 + lVar1 * 0x68);
        plVar6[1] = (long)in_stack_00000090;
        *plVar6 = (long)uStack0000000000000088;
        plVar6[7] = in_stack_000000c0;
        plVar6[6] = in_stack_000000b8;
        plVar6[9] = in_stack_000000d0;
        plVar6[8] = in_stack_000000c8;
        plVar6[0xb] = in_stack_000000e0;
        plVar6[10] = in_stack_000000d8;
        plVar6[0xc] = in_stack_000000e8;
        plVar6[3] = in_stack_000000a0;
        plVar6[2] = in_stack_00000098;
        plVar6[5] = in_stack_000000b0;
        plVar6[4] = in_stack_000000a8;
        in_stack_00000068 = lVar1 + 1;
        if (in_stack_00000020 == unaff_x27) {
          in_stack_00000008[1] = in_stack_00000060;
          *in_stack_00000008 = uStack0000000000000058;
          in_stack_00000008[2] = in_stack_00000068;
          _CFRelease(in_stack_00000018);
          _CFRelease(in_stack_00000010);
          lVar4 = in_stack_00000040;
          for (lVar7 = in_stack_00000048; lVar7 != 0; lVar7 = lVar7 + -1) {
            func_0x0019fb28(lVar4);
            func_0x0019e6a4(lVar4 + 8);
            lVar4 = lVar4 + 0x10;
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
        if (iVar3 == 0) {
          unaff_x25 = -0x8000000000000000;
        }
        else {
          if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
            goto code_r0x00197930;
          }
          *(undefined8 *)(unaff_x29 + -0x80) = 0;
          *(undefined8 *)(unaff_x29 + -0x78) = 1;
          *(undefined8 *)(unaff_x29 + -0x70) = 0;
          in_stack_00000098 = 0xe0000020;
          uStack0000000000000088 = (undefined8 *)(unaff_x29 + -0x80);
          in_stack_00000090 = &UNK_009c1740;
          uStack0000000000000070 = lVar4;
          iVar3 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
          if (iVar3 != 0) {
            func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x61,&UNK_009c17a0,&UNK_009c1770);
            goto code_r0x00197930;
          }
          unaff_x25 = *(long *)(unaff_x29 + -0x80);
          in_stack_00000028 = *(long *)(unaff_x29 + -0x78);
          unaff_x26 = *(long *)(unaff_x29 + -0x70);
          func_0x0019fb28(&uStack0000000000000070);
        }
        uStack0000000000000088 = (undefined8 *)0x0;
        iVar3 = _CFDictionaryGetValueIfPresent
                          (unaff_x19,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                           &uStack0000000000000088);
        if (iVar3 != 0) break;
        lVar4 = -0x8000000000000000;
      }
      if ((uStack0000000000000088 == (undefined8 *)0x0) || (lVar4 = _CFRetain(), lVar4 == 0)) {
        func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
        goto code_r0x00197930;
      }
      uStack0000000000000088 = (undefined8 *)lVar4;
      unaff_x20 = _CFDataGetBytePtr();
      if (unaff_x20 != 0) break;
      unaff_x23 = 0;
      unaff_x20 = 1;
code_r0x00197594:
      unaff_x21 = 1;
    }
    unaff_x23 = _CFDataGetLength(lVar4);
    if (unaff_x23 < 0) {
      in_stack_00000000 = 0;
      goto code_r0x0019791c;
    }
    if (unaff_x23 == 0) goto code_r0x00197594;
    unaff_x21 = func_0x00187bd0(unaff_x23,1);
  } while (unaff_x21 != 0);
  unaff_x21 = unaff_x23;
code_r0x0019791c:
  func_0x007a1f00(in_stack_00000000,unaff_x21,&UNK_009c17f0);
code_r0x00197930:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x197934);
  (*pcVar2)();
}


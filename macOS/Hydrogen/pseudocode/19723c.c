
void FUN_0019723c(long *param_1)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined *puVar11;
  undefined8 *puVar12;
  long unaff_x19;
  long *plVar13;
  long *unaff_x23;
  long *unaff_x24;
  undefined8 uVar14;
  undefined8 unaff_x26;
  long lVar15;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined1 uStack0000000000000088;
  long *in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long *in_stack_000000c0;
  long *in_stack_000000c8;
  long *in_stack_000000d0;
  long in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  
  _uStack0000000000000088 = param_1;
  if (*(long *)(unaff_x19 + 8) == 0) {
    puVar11 = &UNK_009c1710;
  }
  else {
    plVar4 = (long *)_CFRetain();
    if (plVar4 != (long *)0x0) {
      _uStack0000000000000088 = param_1;
      in_stack_00000090 = plVar4;
      func_0x0019275c(&uStack0000000000000038,&UNK_009c1870);
      *in_stack_00000040 = param_1;
      in_stack_00000040[1] = plVar4;
      plVar5 = (long *)((long)&MACH_HEADER.magic + 1);
      in_stack_00000048 = (long *)((long)&MACH_HEADER.magic + 1);
      if (*(int *)(unaff_x19 + 0x10) == 1) {
        if ((*(long *)PTR__kSecImportExportKeychain_009b0390 != 0) &&
           (plVar4 = (long *)_CFRetain(), plVar4 != (long *)0x0)) {
          _uStack0000000000000088 = plVar4;
          if (*(long *)(unaff_x19 + 0x18) == 0) {
            puVar11 = &UNK_009c1710;
          }
          else {
            plVar5 = (long *)_CFRetain();
            if (plVar5 != (long *)0x0) {
              _uStack0000000000000088 = plVar4;
              in_stack_00000090 = plVar5;
              if (uStack0000000000000038 == (long *)((long)&MACH_HEADER.magic + 1)) {
                func_0x0019275c(&uStack0000000000000038,&UNK_009c18a0);
              }
              in_stack_00000040[2] = plVar4;
              in_stack_00000040[3] = plVar5;
              plVar5 = (long *)((long)&MACH_HEADER.magic + 2);
              in_stack_00000048 = (long *)((long)&MACH_HEADER.magic + 2);
              goto LAB_001972f0;
            }
            puVar11 = &UNK_009c1728;
          }
          func_0x007a11c0(&UNK_0081bbc0,0x22,puVar11);
          goto LAB_00197930;
        }
      }
      else {
LAB_001972f0:
        if ((*(uint *)(unaff_x19 + 0x20) & 1) == 0) {
LAB_00197364:
          uVar7 = func_0x0018e2ec(in_stack_00000040,plVar5);
          uStack0000000000000050 = 0;
          iVar3 = _SecPKCS12Import(uStack0000000000000030,uVar7,&uStack0000000000000050);
          lVar1 = uStack0000000000000050;
          if (iVar3 == 0) {
            if (uStack0000000000000050 == 0) {
              func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
              goto LAB_00197930;
            }
            uStack0000000000000058 = 0;
            in_stack_00000060 = 8;
            in_stack_00000068 = 0;
            lVar8 = _CFArrayGetCount(uStack0000000000000050);
            if (0 < lVar8) {
              lVar15 = 0;
              uStack0000000000000000 = 1;
              plVar5 = unaff_x23;
              do {
                lVar9 = _CFArrayGetValueAtIndex(lVar1,lVar15);
                if (lVar9 == 0) {
                  func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
                  goto LAB_00197930;
                }
                _uStack0000000000000088 = (long *)0x0;
                iVar3 = _CFDictionaryGetValueIfPresent
                                  (lVar9,*(undefined8 *)PTR__kSecImportItemLabel_009b03b8,
                                   &uStack0000000000000088);
                if (iVar3 == 0) {
                  uVar14 = 0x8000000000000000;
                }
                else {
                  if ((_uStack0000000000000088 == (long *)0x0) ||
                     (lVar10 = _CFRetain(), lVar10 == 0)) {
                    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
                    goto LAB_00197930;
                  }
                  *(undefined8 *)(unaff_x29 + -0x80) = 0;
                  *(undefined8 *)(unaff_x29 + -0x78) = 1;
                  *(undefined8 *)(unaff_x29 + -0x70) = 0;
                  in_stack_00000098 = 0xe0000020;
                  _uStack0000000000000088 = (long *)(unaff_x29 + -0x80);
                  in_stack_00000090 = (long *)&UNK_009c1740;
                  uStack0000000000000070 = lVar10;
                  iVar3 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
                  if (iVar3 != 0) {
                    func_0x007a2810(&UNK_0081bc48,0x37,unaff_x29 + -0x61,&UNK_009c17a0,&UNK_009c1770
                                   );
                    goto LAB_00197930;
                  }
                  uVar14 = *(undefined8 *)(unaff_x29 + -0x80);
                  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x78);
                  unaff_x26 = *(undefined8 *)(unaff_x29 + -0x70);
                  func_0x0019fb28(&uStack0000000000000070);
                }
                _uStack0000000000000088 = (long *)0x0;
                iVar3 = _CFDictionaryGetValueIfPresent
                                  (lVar9,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                                   &uStack0000000000000088);
                if (iVar3 == 0) {
                  plVar6 = (long *)0x8000000000000000;
                }
                else {
                  if ((_uStack0000000000000088 == (long *)0x0) ||
                     (plVar5 = (long *)_CFRetain(), plVar5 == (long *)0x0)) {
                    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
                    goto LAB_00197930;
                  }
                  _uStack0000000000000088 = plVar5;
                  lVar10 = _CFDataGetBytePtr();
                  if (lVar10 == 0) {
                    plVar5 = (long *)0x0;
                    lVar10 = 1;
code_r0x00197594:
                    plVar4 = (long *)((long)&MACH_HEADER.magic + 1);
                  }
                  else {
                    plVar5 = (long *)_CFDataGetLength(plVar5);
                    if ((long)plVar5 < 0) {
                      uStack0000000000000000 = 0;
code_r0x0019791c:
                      func_0x007a1f00(uStack0000000000000000,plVar4,&UNK_009c17f0);
                      goto LAB_00197930;
                    }
                    if (plVar5 == (long *)0x0) goto code_r0x00197594;
                    plVar4 = (long *)func_0x00187bd0(plVar5,1);
                    if (plVar4 == (long *)0x0) {
                      plVar4 = plVar5;
                      goto code_r0x0019791c;
                    }
                  }
                  _memcpy(plVar4,lVar10,plVar5);
                  func_0x0019fb28(&uStack0000000000000088);
                  plVar6 = plVar5;
                }
                _uStack0000000000000088 = (long *)0x0;
                iVar3 = _CFDictionaryGetValueIfPresent
                                  (lVar9,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
                                   &uStack0000000000000088);
                if (iVar3 == 0) {
                  plVar13 = (long *)0x0;
                }
                else {
                  if ((_uStack0000000000000088 == (long *)0x0) ||
                     (unaff_x24 = (long *)_CFRetain(), unaff_x24 == (long *)0x0)) {
                    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18e8);
                    goto LAB_00197930;
                  }
                  plVar13 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                _uStack0000000000000088 = (long *)0x0;
                iVar3 = _CFDictionaryGetValueIfPresent
                                  (lVar9,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                                   &uStack0000000000000088);
                if (iVar3 == 0) {
                  uStack0000000000000070 = -0x8000000000000000;
                }
                else {
                  if ((_uStack0000000000000088 == (long *)0x0) ||
                     (lVar10 = _CFRetain(), lVar10 == 0)) {
                    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
                    goto LAB_00197930;
                  }
                  uStack0000000000000070 = lVar10;
                  in_stack_00000098 = _CFArrayGetCount();
                  _uStack0000000000000088 = &uStack0000000000000070;
                  in_stack_00000090 = (long *)0x0;
                  func_0x0018bd2c(unaff_x29 + -0x80,&uStack0000000000000088,&UNK_009c1788);
                  _CFRelease(uStack0000000000000070);
                  in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x78);
                  uStack0000000000000070 = *(long *)(unaff_x29 + -0x80);
                  in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0x70);
                }
                _uStack0000000000000088 = (long *)0x0;
                lVar9 = _CFDictionaryGetValueIfPresent
                                  (lVar9,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
                                   &uStack0000000000000088);
                if ((int)lVar9 == 0) {
                  in_stack_00000098 = 0;
                }
                else {
                  if ((_uStack0000000000000088 == (long *)0x0) || (lVar9 = _CFRetain(), lVar9 == 0))
                  {
                    func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18d0);
                    goto LAB_00197930;
                  }
                  in_stack_00000098 = 1;
                }
                lVar10 = in_stack_00000068;
                in_stack_000000b0 = in_stack_00000028;
                in_stack_000000e0 = in_stack_00000078;
                in_stack_000000d8 = uStack0000000000000070;
                in_stack_000000e8 = in_stack_00000080;
                _uStack0000000000000088 = plVar13;
                in_stack_00000090 = unaff_x24;
                in_stack_000000a0 = lVar9;
                in_stack_000000a8 = uVar14;
                in_stack_000000b8 = unaff_x26;
                in_stack_000000c0 = plVar6;
                in_stack_000000c8 = plVar4;
                in_stack_000000d0 = plVar5;
                if (in_stack_00000068 == uStack0000000000000058) {
                  func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
                }
                lVar15 = lVar15 + 1;
                puVar12 = (undefined8 *)(in_stack_00000060 + lVar10 * 0x68);
                puVar12[1] = in_stack_00000090;
                *puVar12 = _uStack0000000000000088;
                puVar12[7] = in_stack_000000c0;
                puVar12[6] = in_stack_000000b8;
                puVar12[9] = in_stack_000000d0;
                puVar12[8] = in_stack_000000c8;
                puVar12[0xb] = in_stack_000000e0;
                puVar12[10] = in_stack_000000d8;
                puVar12[0xc] = in_stack_000000e8;
                puVar12[3] = in_stack_000000a0;
                puVar12[2] = in_stack_00000098;
                puVar12[5] = in_stack_000000b0;
                puVar12[4] = in_stack_000000a8;
                in_stack_00000068 = lVar10 + 1;
              } while (lVar8 != lVar15);
            }
            unaff_x23[1] = in_stack_00000060;
            *unaff_x23 = uStack0000000000000058;
            unaff_x23[2] = in_stack_00000068;
            _CFRelease(lVar1);
            _CFRelease(uVar7);
            puVar12 = in_stack_00000040;
            for (plVar4 = in_stack_00000048; plVar4 != (long *)0x0;
                plVar4 = (long *)((long)plVar4 + -1)) {
              func_0x0019fb28(puVar12);
              func_0x0019e6a4(puVar12 + 1);
              puVar12 = puVar12 + 2;
            }
          }
          else {
            *(int *)(unaff_x23 + 1) = iVar3;
            *unaff_x23 = -0x8000000000000000;
            _CFRelease(uVar7);
            puVar12 = in_stack_00000040;
            for (plVar4 = in_stack_00000048; plVar4 != (long *)0x0;
                plVar4 = (long *)((long)plVar4 + -1)) {
              func_0x0019fb28(puVar12);
              func_0x0019e6a4(puVar12 + 1);
              puVar12 = puVar12 + 2;
            }
          }
          if (uStack0000000000000038 != (long *)0x0) {
            func_0x00187bd4(in_stack_00000040,(long)uStack0000000000000038 << 4,8);
          }
          func_0x0019fb28(&uStack0000000000000030);
          return;
        }
        if ((*(long *)PTR__kSecImportExportAccess_009b0388 != 0) &&
           (plVar5 = (long *)_CFRetain(), plVar5 != (long *)0x0)) {
          _uStack0000000000000088 = plVar5;
          if (*(long *)(unaff_x19 + 0x28) == 0) {
            puVar11 = &UNK_009c1710;
          }
          else {
            plVar6 = (long *)_CFRetain();
            plVar4 = in_stack_00000048;
            if (plVar6 != (long *)0x0) {
              _uStack0000000000000088 = plVar5;
              in_stack_00000090 = plVar6;
              if (in_stack_00000048 == uStack0000000000000038) {
                func_0x0019275c(&uStack0000000000000038,&UNK_009c18b8);
              }
              in_stack_00000040[(long)plVar4 * 2] = plVar5;
              (in_stack_00000040 + (long)plVar4 * 2)[1] = plVar6;
              plVar5 = (long *)((long)plVar4 + 1);
              in_stack_00000048 = plVar5;
              goto LAB_00197364;
            }
            puVar11 = &UNK_009c1728;
          }
          func_0x007a11c0(&UNK_0081bbc0,0x22,puVar11);
          goto LAB_00197930;
        }
      }
      func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
      goto LAB_00197930;
    }
    puVar11 = &UNK_009c1728;
  }
  func_0x007a11c0(&UNK_0081bbc0,0x22,puVar11);
LAB_00197930:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x197934);
  (*pcVar2)();
}


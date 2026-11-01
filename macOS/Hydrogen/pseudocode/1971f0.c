
void FUN_001971f0(long *param_1,int *param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined *puVar10;
  undefined8 *puVar11;
  dword *pdVar12;
  long *plVar13;
  long *unaff_x21;
  long *plVar14;
  long *unaff_x24;
  undefined8 unaff_x26;
  long lVar15;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  dword *in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  long *in_stack_00000090;
  undefined8 in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long *in_stack_000000c0;
  long *in_stack_000000c8;
  long *in_stack_000000d0;
  long in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  long lStack00000000000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined1 uStack000000000000010f;
  
  uStack0000000000000030 = func_0x0019f0a4(param_3,param_4);
  plVar13 = (long *)0x0;
  uStack0000000000000038 = (long *)0x0;
  in_stack_00000040 = &MACH_HEADER.cpusubtype;
  in_stack_00000048 = (long *)0x0;
  if (*param_2 == 1) {
    if ((*(long *)PTR__kSecImportExportPassphrase_009b0398 != 0) &&
       (plVar13 = (long *)_CFRetain(), plVar13 != (long *)0x0)) {
      uStack0000000000000088 = plVar13;
      if (*(long *)(param_2 + 2) == 0) {
        puVar10 = &UNK_009c1710;
      }
      else {
        unaff_x21 = (long *)_CFRetain();
        if (unaff_x21 != (long *)0x0) {
          uStack0000000000000088 = plVar13;
          in_stack_00000090 = unaff_x21;
          func_0x0019275c(&uStack0000000000000038,&UNK_009c1870);
          *(long **)in_stack_00000040 = plVar13;
          *(long **)(in_stack_00000040 + 2) = unaff_x21;
          plVar13 = (long *)((long)&MACH_HEADER.magic + 1);
          in_stack_00000048 = (long *)((long)&MACH_HEADER.magic + 1);
          goto LAB_0019727c;
        }
        puVar10 = &UNK_009c1728;
      }
      func_0x007a11c0(&UNK_0081bbc0,0x22,puVar10);
      goto LAB_00197930;
    }
  }
  else {
LAB_0019727c:
    if (param_2[4] == 1) {
      if ((*(long *)PTR__kSecImportExportKeychain_009b0390 != 0) &&
         (unaff_x21 = (long *)_CFRetain(), unaff_x21 != (long *)0x0)) {
        uStack0000000000000088 = unaff_x21;
        if (*(long *)(param_2 + 6) == 0) {
          puVar10 = &UNK_009c1710;
        }
        else {
          plVar4 = (long *)_CFRetain();
          if (plVar4 != (long *)0x0) {
            uStack0000000000000088 = unaff_x21;
            in_stack_00000090 = plVar4;
            if (plVar13 == uStack0000000000000038) {
              func_0x0019275c(&uStack0000000000000038,&UNK_009c18a0);
            }
            *(long **)(in_stack_00000040 + (long)plVar13 * 4) = unaff_x21;
            *(long **)(in_stack_00000040 + (long)plVar13 * 4 + 2) = plVar4;
            plVar13 = (long *)((long)plVar13 + 1);
            in_stack_00000048 = plVar13;
            goto LAB_001972f0;
          }
          puVar10 = &UNK_009c1728;
        }
        func_0x007a11c0(&UNK_0081bbc0,0x22,puVar10);
        goto LAB_00197930;
      }
    }
    else {
LAB_001972f0:
      if ((param_2[8] & 1U) == 0) {
LAB_00197364:
        uVar5 = func_0x0018e2ec(in_stack_00000040,plVar13);
        uStack0000000000000050 = 0;
        iVar3 = _SecPKCS12Import(uStack0000000000000030,uVar5,&uStack0000000000000050);
        lVar1 = uStack0000000000000050;
        if (iVar3 == 0) {
          if (uStack0000000000000050 == 0) {
            func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
            goto LAB_00197930;
          }
          uStack0000000000000058 = 0;
          in_stack_00000060 = 8;
          in_stack_00000068 = 0;
          lVar6 = _CFArrayGetCount(uStack0000000000000050);
          if (0 < lVar6) {
            lVar15 = 0;
            uStack0000000000000000 = 1;
            plVar13 = param_1;
            do {
              lVar7 = _CFArrayGetValueAtIndex(lVar1,lVar15);
              if (lVar7 == 0) {
                func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
                goto LAB_00197930;
              }
              uStack0000000000000088 = (long *)0x0;
              iVar3 = _CFDictionaryGetValueIfPresent
                                (lVar7,*(undefined8 *)PTR__kSecImportItemLabel_009b03b8,
                                 &uStack0000000000000088);
              if (iVar3 == 0) {
                lVar8 = -0x8000000000000000;
              }
              else {
                if ((uStack0000000000000088 == (long *)0x0) || (lVar8 = _CFRetain(), lVar8 == 0)) {
                  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
                  goto LAB_00197930;
                }
                lStack00000000000000f0 = 0;
                in_stack_000000f8 = 1;
                in_stack_00000100 = 0;
                in_stack_00000098 = 0xe0000020;
                uStack0000000000000088 = &lStack00000000000000f0;
                in_stack_00000090 = (long *)&UNK_009c1740;
                uStack0000000000000070 = lVar8;
                iVar3 = func_0x0019f594(&uStack0000000000000070,&uStack0000000000000088);
                unaff_x26 = in_stack_00000100;
                lVar8 = lStack00000000000000f0;
                if (iVar3 != 0) {
                  func_0x007a2810(&UNK_0081bc48,0x37,&uStack000000000000010f,&UNK_009c17a0,
                                  &UNK_009c1770);
                  goto LAB_00197930;
                }
                in_stack_00000028 = in_stack_000000f8;
                func_0x0019fb28(&uStack0000000000000070);
              }
              uStack0000000000000088 = (long *)0x0;
              iVar3 = _CFDictionaryGetValueIfPresent
                                (lVar7,*(undefined8 *)PTR__kSecImportItemKeyID_009b03b0,
                                 &uStack0000000000000088);
              if (iVar3 == 0) {
                plVar4 = (long *)0x8000000000000000;
              }
              else {
                if ((uStack0000000000000088 == (long *)0x0) ||
                   (plVar13 = (long *)_CFRetain(), plVar13 == (long *)0x0)) {
                  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17c0);
                  goto LAB_00197930;
                }
                uStack0000000000000088 = plVar13;
                lVar9 = _CFDataGetBytePtr();
                if (lVar9 == 0) {
                  plVar13 = (long *)0x0;
                  lVar9 = 1;
code_r0x00197594:
                  unaff_x21 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                else {
                  plVar13 = (long *)_CFDataGetLength(plVar13);
                  if ((long)plVar13 < 0) {
                    uStack0000000000000000 = 0;
code_r0x0019791c:
                    func_0x007a1f00(uStack0000000000000000,unaff_x21,&UNK_009c17f0);
                    goto LAB_00197930;
                  }
                  if (plVar13 == (long *)0x0) goto code_r0x00197594;
                  unaff_x21 = (long *)func_0x00187bd0(plVar13,1);
                  if (unaff_x21 == (long *)0x0) {
                    unaff_x21 = plVar13;
                    goto code_r0x0019791c;
                  }
                }
                _memcpy(unaff_x21,lVar9,plVar13);
                func_0x0019fb28(&uStack0000000000000088);
                plVar4 = plVar13;
              }
              uStack0000000000000088 = (long *)0x0;
              iVar3 = _CFDictionaryGetValueIfPresent
                                (lVar7,*(undefined8 *)PTR__kSecImportItemTrust_009b03c0,
                                 &uStack0000000000000088);
              if (iVar3 == 0) {
                plVar14 = (long *)0x0;
              }
              else {
                if ((uStack0000000000000088 == (long *)0x0) ||
                   (unaff_x24 = (long *)_CFRetain(), unaff_x24 == (long *)0x0)) {
                  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18e8);
                  goto LAB_00197930;
                }
                plVar14 = (long *)((long)&MACH_HEADER.magic + 1);
              }
              uStack0000000000000088 = (long *)0x0;
              iVar3 = _CFDictionaryGetValueIfPresent
                                (lVar7,*(undefined8 *)PTR__kSecImportItemCertChain_009b03a0,
                                 &uStack0000000000000088);
              if (iVar3 == 0) {
                uStack0000000000000070 = -0x8000000000000000;
              }
              else {
                if ((uStack0000000000000088 == (long *)0x0) || (lVar9 = _CFRetain(), lVar9 == 0)) {
                  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c1808);
                  goto LAB_00197930;
                }
                uStack0000000000000070 = lVar9;
                in_stack_00000098 = _CFArrayGetCount();
                uStack0000000000000088 = &uStack0000000000000070;
                in_stack_00000090 = (long *)0x0;
                func_0x0018bd2c(&lStack00000000000000f0,&uStack0000000000000088,&UNK_009c1788);
                _CFRelease(uStack0000000000000070);
                in_stack_00000078 = in_stack_000000f8;
                uStack0000000000000070 = lStack00000000000000f0;
                in_stack_00000080 = in_stack_00000100;
              }
              uStack0000000000000088 = (long *)0x0;
              lVar7 = _CFDictionaryGetValueIfPresent
                                (lVar7,*(undefined8 *)PTR__kSecImportItemIdentity_009b03a8,
                                 &uStack0000000000000088);
              if ((int)lVar7 == 0) {
                in_stack_00000098 = 0;
              }
              else {
                if ((uStack0000000000000088 == (long *)0x0) || (lVar7 = _CFRetain(), lVar7 == 0)) {
                  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c18d0);
                  goto LAB_00197930;
                }
                in_stack_00000098 = 1;
              }
              lVar9 = in_stack_00000068;
              in_stack_000000b0 = in_stack_00000028;
              in_stack_000000e0 = in_stack_00000078;
              in_stack_000000d8 = uStack0000000000000070;
              in_stack_000000e8 = in_stack_00000080;
              uStack0000000000000088 = plVar14;
              in_stack_00000090 = unaff_x24;
              in_stack_000000a0 = lVar7;
              in_stack_000000a8 = lVar8;
              in_stack_000000b8 = unaff_x26;
              in_stack_000000c0 = plVar4;
              in_stack_000000c8 = unaff_x21;
              in_stack_000000d0 = plVar13;
              if (in_stack_00000068 == uStack0000000000000058) {
                func_0x0019269c(&uStack0000000000000058,&UNK_009c1888);
              }
              lVar15 = lVar15 + 1;
              puVar11 = (undefined8 *)(in_stack_00000060 + lVar9 * 0x68);
              puVar11[1] = in_stack_00000090;
              *puVar11 = uStack0000000000000088;
              puVar11[7] = in_stack_000000c0;
              puVar11[6] = in_stack_000000b8;
              puVar11[9] = in_stack_000000d0;
              puVar11[8] = in_stack_000000c8;
              puVar11[0xb] = in_stack_000000e0;
              puVar11[10] = in_stack_000000d8;
              puVar11[0xc] = in_stack_000000e8;
              puVar11[3] = in_stack_000000a0;
              puVar11[2] = in_stack_00000098;
              puVar11[5] = in_stack_000000b0;
              puVar11[4] = in_stack_000000a8;
              in_stack_00000068 = lVar9 + 1;
            } while (lVar6 != lVar15);
          }
          param_1[1] = in_stack_00000060;
          *param_1 = uStack0000000000000058;
          param_1[2] = in_stack_00000068;
          _CFRelease(lVar1);
          _CFRelease(uVar5);
          pdVar12 = in_stack_00000040;
          for (plVar13 = in_stack_00000048; plVar13 != (long *)0x0;
              plVar13 = (long *)((long)plVar13 + -1)) {
            func_0x0019fb28(pdVar12);
            func_0x0019e6a4(pdVar12 + 2);
            pdVar12 = pdVar12 + 4;
          }
        }
        else {
          *(int *)(param_1 + 1) = iVar3;
          *param_1 = -0x8000000000000000;
          _CFRelease(uVar5);
          pdVar12 = in_stack_00000040;
          for (plVar13 = in_stack_00000048; plVar13 != (long *)0x0;
              plVar13 = (long *)((long)plVar13 + -1)) {
            func_0x0019fb28(pdVar12);
            func_0x0019e6a4(pdVar12 + 2);
            pdVar12 = pdVar12 + 4;
          }
        }
        if (uStack0000000000000038 != (long *)0x0) {
          func_0x00187bd4(in_stack_00000040,(long)uStack0000000000000038 << 4,8);
        }
        func_0x0019fb28(&uStack0000000000000030);
        return;
      }
      if ((*(long *)PTR__kSecImportExportAccess_009b0388 != 0) &&
         (plVar13 = (long *)_CFRetain(), plVar13 != (long *)0x0)) {
        uStack0000000000000088 = plVar13;
        if (*(long *)(param_2 + 10) == 0) {
          puVar10 = &UNK_009c1710;
        }
        else {
          plVar4 = (long *)_CFRetain();
          unaff_x21 = in_stack_00000048;
          if (plVar4 != (long *)0x0) {
            uStack0000000000000088 = plVar13;
            in_stack_00000090 = plVar4;
            if (in_stack_00000048 == uStack0000000000000038) {
              func_0x0019275c(&uStack0000000000000038,&UNK_009c18b8);
            }
            *(long **)(in_stack_00000040 + (long)unaff_x21 * 4) = plVar13;
            *(long **)(in_stack_00000040 + (long)unaff_x21 * 4 + 2) = plVar4;
            plVar13 = (long *)((long)unaff_x21 + 1);
            in_stack_00000048 = plVar13;
            goto LAB_00197364;
          }
          puVar10 = &UNK_009c1728;
        }
        func_0x007a11c0(&UNK_0081bbc0,0x22,puVar10);
        goto LAB_00197930;
      }
    }
  }
  func_0x007a11c0(&UNK_0081bbc0,0x22,&UNK_009c17d8);
LAB_00197930:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x197934);
  (*pcVar2)();
}


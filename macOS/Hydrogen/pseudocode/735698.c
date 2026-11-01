
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735d84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735db0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735ddc: Changing call to branch */

void FUN_00735698(undefined8 param_1,long param_2)

{
  long lVar1;
  byte bVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  int iVar10;
  dword *pdVar11;
  int *piVar12;
  long lVar13;
  long lVar14;
  byte *pbVar15;
  long *plVar16;
  uint uVar17;
  undefined4 uVar18;
  long unaff_x19;
  ulong uVar19;
  dword *unaff_x20;
  long *plVar20;
  byte *unaff_x21;
  long *unaff_x22;
  long *plVar21;
  undefined8 uVar22;
  undefined8 unaff_x23;
  undefined8 uVar23;
  long *plVar24;
  dword *unaff_x24;
  int unaff_w25;
  undefined8 *unaff_x26;
  undefined8 *puVar25;
  ulong unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined8 unaff_d8;
  undefined1 auVar26 [16];
  long *in_stack_00000000;
  dword *in_stack_00000008;
  long *in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  long in_stack_00000030;
  byte *in_stack_00000038;
  undefined8 in_stack_00000040;
  long *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 *in_stack_00000058;
  undefined1 uStack0000000000000064;
  undefined8 uStack0000000000000068;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000078;
  dword dStack000000000000007c;
  uint in_stack_000000d8;
  dword *pdStack_40;
  undefined8 uStack_38;
  long *plStack_30;
  byte *pbStack_28;
  long *plStack_20;
  undefined8 uStack_8;
  
  auVar26._8_8_ = in_stack_00000050;
  auVar26._0_8_ = unaff_x23;
  do {
    in_stack_00000050 = auVar26._8_8_;
    uVar23 = auVar26._0_8_;
    pdVar11 = (dword *)func_0x00731158(param_1,param_2,0,unaff_x21);
    auVar26._8_8_ = in_stack_00000050;
    auVar26._0_8_ = uVar23;
    auVar9._8_8_ = in_stack_00000050;
    auVar9._0_8_ = uVar23;
    auVar8._8_8_ = in_stack_00000050;
    auVar8._0_8_ = uVar23;
    iVar10 = (int)pdVar11;
    *(int *)((long)unaff_x26 + 0x5c) = iVar10;
    if (iVar10 == 8) {
      *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) | 0x20;
      pdVar11 = &MACH_HEADER.cpusubtype;
    }
    else {
      auVar26 = auVar8;
      if (iVar10 == 0) {
        if (*unaff_x21 == 0) {
          lVar13 = func_0x00782dc4(uVar23,in_stack_00000050,unaff_x26[8],unaff_x26[9]);
          auVar26._8_8_ = in_stack_00000050;
          if (lVar13 < (long)unaff_x26[10]) {
            pdVar11 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
          }
          else {
            if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) {
              in_stack_00000000 = (long *)*unaff_x26;
              in_stack_00000008 = (dword *)unaff_x26[10];
              func_0x0073cab8(unaff_x19,"%s connect timeout after %ldms, move on!");
            }
            auVar26._8_8_ = in_stack_00000050;
            *(undefined4 *)(unaff_x26 + 0xc) = 0x3c;
            pdVar11 = &MACH_HEADER.reserved;
          }
        }
        else {
          pdVar11 = (dword *)0x0;
          *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) | 0xc;
          auVar26 = auVar9;
        }
      }
    }
    do {
      in_stack_00000050 = auVar26._8_8_;
      uVar23 = auVar26._0_8_;
      *(int *)((long)unaff_x26 + 0x5c) = (int)pdVar11;
      if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
         (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x22 + 0xc)))))
      {
        in_stack_00000000 = (long *)*unaff_x26;
        in_stack_00000010 = (long *)(ulong)*unaff_x21;
        in_stack_00000008 = pdVar11;
        func_0x0073cbdc(unaff_x19,unaff_x22,"%s connect -> %d, connected=%d");
        pdVar11 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
      }
      auVar7._8_8_ = in_stack_00000050;
      auVar7._0_8_ = uVar23;
      auVar26._8_8_ = in_stack_00000050;
      auVar26._0_8_ = uVar23;
      auVar3._8_8_ = in_stack_00000050;
      auVar3._0_8_ = uVar23;
      if ((int)pdVar11 == 0) {
        if (*unaff_x21 != 0) {
          *(undefined8 **)(unaff_x24 + 0xc) = unaff_x26;
          *(undefined8 *)unaff_x20 = 0;
code_r0x00735d30:
          in_stack_00000050 = auVar7._8_8_;
          uVar22 = auVar7._0_8_;
          *unaff_x21 = 1;
          *(undefined4 *)(in_stack_00000030 + 0x18) = 2;
          *(byte *)((long)unaff_x22 + 0x24) = *(byte *)((long)unaff_x22 + 0x24) | 1;
          lVar13 = *(long *)(in_stack_00000030 + 0x30);
          unaff_x22[1] = *(long *)(lVar13 + 0x28);
          *(undefined8 *)(lVar13 + 0x28) = 0;
          plVar20 = (long *)unaff_x22[2];
          unaff_x21 = (byte *)plVar20[4];
          unaff_x22 = (long *)0xa2b5f0;
          lVar13 = unaff_x19;
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = (undefined *)0x735d88;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar20[4] = 0;
          unaff_x21 = (byte *)plVar20[5];
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = (undefined *)0x735db4;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar20[5] = 0;
          unaff_x21 = (byte *)plVar20[6];
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = (undefined *)0x735de0;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar16 = in_stack_00000048;
          plVar20[6] = 0;
          if ((*(byte *)(*(long *)(in_stack_00000048[3] + 0x3a0) + 0x94) & 0x30) != 0) {
            func_0x007706e4(unaff_x19,6);
          }
          if ((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))))) &&
             (((((0 < *(int *)(*plVar16 + 0xc) &&
                 (iVar10 = func_0x00731b68(plVar16[1],unaff_x19,&uStack0000000000000078,
                                           &dStack000000000000007c), iVar10 == 0)) &&
                ((**(code **)(*(long *)plVar16[1] + 0x30))
                           ((long *)plVar16[1],unaff_x19,&uStack0000000000000070,
                            &uStack0000000000000068,&uStack0000000000000064),
                *(char *)((long)in_stack_00000058 + 3) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) &&
              (0 < *(int *)(*plVar16 + 0xc))))) {
            in_stack_00000010 = (long *)(ulong)in_stack_000000d8;
            in_stack_00000008 = &dStack000000000000007c;
            in_stack_00000000 = uStack0000000000000068;
            func_0x0073cbdc(unaff_x19,plVar16,"Connected to %s (%s) port %u");
          }
          uVar18 = 0;
          *(long *)(&UNK_00001390 + unaff_x19) = *(long *)(&UNK_00001390 + unaff_x19) + 1;
LAB_007351c4:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
            return;
          }
          auVar26 = ___stack_chk_fail(uVar18);
          lVar13 = auVar26._8_8_;
          plVar20 = auVar26._0_8_;
          uStack_8 = &DAT_0073612c;
          lVar14 = (long)register0x00000008 + -0x10;
          plVar21 = (long *)plVar20[2];
          plVar24 = plVar21;
          pdStack_40 = unaff_x24;
          uStack_38 = uVar22;
          plStack_30 = unaff_x22;
          pbStack_28 = unaff_x21;
          plStack_20 = plVar16;
          if ((((lVar13 != 0) && (*(char *)(lVar13 + 0xa1d) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar13 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar13 + 0x18) + 8))))) && (0 < *(int *)(*plVar20 + 0xc))) {
            func_0x0073cbdc(lVar13,plVar20,"close");
            plVar24 = (long *)plVar20[2];
          }
          unaff_x21 = (byte *)plVar24[4];
          unaff_x22 = plVar21;
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = &UNK_007361c8;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar13;
              unaff_x29 = lVar14;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar24[4] = 0;
          unaff_x21 = (byte *)plVar24[5];
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = &UNK_007361f4;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar13;
              unaff_x29 = lVar14;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar24[5] = 0;
          unaff_x21 = (byte *)plVar24[6];
          if (unaff_x21 != (byte *)0x0) {
            pbVar15 = unaff_x21 + 0x28;
            if (*(long *)pbVar15 != 0) {
              uStack_8 = &UNK_00736220;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar13;
              unaff_x29 = lVar14;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar24[6] = 0;
          pbVar15 = (byte *)(plVar20 + 1);
          plVar16 = *(long **)pbVar15;
          *(byte *)((long)plVar20 + 0x24) = *(byte *)((long)plVar20 + 0x24) & 0xfe;
          *(undefined4 *)(plVar21 + 3) = 0;
          if (plVar16 == (long *)0x0) {
            return;
          }
          (**(code **)(*plVar16 + 0x20))(plVar16,lVar13);
          plVar20 = plStack_20;
          unaff_x21 = pbStack_28;
          unaff_x22 = plStack_30;
code_r0x00730b28:
          *(long **)((long)register0x00000008 + -0x30) = unaff_x22;
          *(byte **)((long)register0x00000008 + -0x28) = unaff_x21;
          *(long **)((long)register0x00000008 + -0x20) = plVar20;
          *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
          *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
          *(undefined **)((long)register0x00000008 + -8) = uStack_8;
          if (*(long **)pbVar15 != (long *)0x0) {
            pbVar15[0] = 0;
            pbVar15[1] = 0;
            pbVar15[2] = 0;
            pbVar15[3] = 0;
            pbVar15[4] = 0;
            pbVar15[5] = 0;
            pbVar15[6] = 0;
            pbVar15[7] = 0;
            plVar20 = *(long **)pbVar15;
            do {
              plVar16 = (long *)plVar20[1];
              plVar20[1] = 0;
              (**(code **)(*plVar20 + 0x10))(plVar20,lVar13);
              (*pcRam0000000000a2b5f0)(plVar20);
              plVar20 = plVar16;
            } while (plVar16 != (long *)0x0);
          }
          return;
        }
        unaff_w28 = unaff_w28 + 1;
      }
      else {
        auVar26 = auVar3;
        if ((*(byte *)((long)unaff_x26 + 100) >> 2 & 1) == 0) {
          iVar10 = *(int *)(unaff_x26 + 0xc);
          in_stack_00000040._4_4_ = unaff_w25;
          if (iVar10 != 0) {
            *(int *)(unaff_x19 + 0xc54) = iVar10;
            piVar12 = (int *)___error();
            *piVar12 = iVar10;
          }
          uVar22 = in_stack_00000050;
          uVar17 = *(uint *)(unaff_x19 + 0x998);
          if (uVar17 == 0) {
            lVar13 = 0;
          }
          else {
            lVar13 = func_0x00782dc4(uVar23,in_stack_00000050,*(undefined8 *)(unaff_x19 + 0xb28),
                                     *(undefined8 *)(unaff_x19 + 0xb30));
            lVar13 = (ulong)uVar17 - lVar13;
            if (lVar13 == 0) {
              lVar13 = -1;
            }
          }
          uVar17 = 300000;
          if (*(uint *)(unaff_x19 + 0x99c) != 0) {
            uVar17 = *(uint *)(unaff_x19 + 0x99c);
          }
          lVar14 = func_0x00782dc4(uVar23,uVar22,*(undefined8 *)(unaff_x19 + 0xb18),
                                   *(undefined8 *)(unaff_x19 + 0xb20));
          unaff_x22 = in_stack_00000048;
          unaff_w25 = in_stack_00000040._4_4_;
          unaff_x21 = in_stack_00000038;
          lVar14 = (ulong)uVar17 - lVar14;
          if (lVar14 == 0) {
            lVar14 = -1;
          }
          lVar1 = lVar14;
          if (lVar13 <= lVar14) {
            lVar1 = lVar13;
          }
          if (lVar13 != 0) {
            lVar14 = lVar1;
          }
          if ((int)in_stack_00000048[4] == 0) {
            lVar13 = unaff_x26[2];
            do {
              if ((lVar13 == 0) || (lVar13 = *(long *)(lVar13 + 0x28), lVar13 == 0)) {
                unaff_x26[2] = 0;
                if ((*(byte *)((long)unaff_x26 + 100) >> 5 & 1) != 0) {
                  unaff_x26[2] = unaff_x26[1];
                  *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) & 0xdf | 1;
                }
                goto code_r0x007358ec;
              }
            } while (*(int *)(lVar13 + 4) != *(int *)(unaff_x26 + 3));
            unaff_x26[2] = lVar13;
code_r0x007358ec:
            func_0x00736e5c(in_stack_00000048,unaff_x19,unaff_x26,lVar14);
            if ((*(byte *)((long)unaff_x26 + 100) >> 2 & 1) != 0) goto code_r0x00735904;
          }
          else {
            uVar17 = *(byte *)((long)unaff_x26 + 100) & 0xfffffff7 | 6;
            *(char *)((long)unaff_x26 + 100) = (char)uVar17;
            *(undefined8 *)((long)unaff_x26 + 0x5c) = unaff_d8;
            if ((uVar17 >> 2 & 1) != 0) {
code_r0x00735904:
              auVar6._8_8_ = in_stack_00000050;
              auVar6._0_8_ = uVar23;
              auVar5._8_8_ = in_stack_00000050;
              auVar5._0_8_ = uVar23;
              auVar4._8_8_ = in_stack_00000050;
              auVar4._0_8_ = uVar23;
              auVar26._8_8_ = in_stack_00000050;
              if ((((unaff_x19 != 0) &&
                   (auVar26 = auVar4, *(char *)((long)in_stack_00000058 + 3) < '\0')) &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0 ||
                   (auVar26 = auVar5,
                   0 < *(int *)(*(long *)(
                                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                         + unaff_x19 + 0x18) + 8))))) &&
                 (auVar26 = auVar6, 0 < *(int *)(*unaff_x22 + 0xc))) {
                in_stack_00000000 = (long *)*unaff_x26;
                func_0x0073cbdc(unaff_x19,unaff_x22,"%s done");
                auVar26._8_8_ = in_stack_00000050;
              }
              goto LAB_00735650;
            }
          }
          if ((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))))) &&
             (0 < *(int *)(*unaff_x22 + 0xc))) {
            in_stack_00000000 = (long *)*unaff_x26;
            func_0x0073cbdc(unaff_x19,unaff_x22,"%s trying next");
          }
          unaff_w28 = unaff_w28 + 1;
          func_0x00768170(unaff_x19,0,8);
          auVar26._8_8_ = in_stack_00000050;
        }
      }
LAB_00735650:
      do {
        do {
          in_stack_00000050 = auVar26._8_8_;
          uVar23 = in_stack_00000050;
          uVar22 = auVar26._0_8_;
          uVar19 = 0;
          lVar13 = 1;
          if ((unaff_x27 & 1) == 0) {
            auVar7 = auVar26;
            if (*(long *)(unaff_x24 + 0xc) != 0) goto code_r0x00735d30;
            if (unaff_w28 == 0 && unaff_w25 == 0) {
              if (unaff_x19 != 0) goto code_r0x00735f74;
              lVar14 = *(long *)(unaff_x24 + 8);
              lVar13 = in_stack_00000028;
              if (((lVar14 == 0) || ((*(byte *)(lVar14 + 100) >> 1 & 1) == 0)) ||
                 (unaff_x21 = (byte *)(ulong)*(uint *)(lVar14 + 0x5c), *(uint *)(lVar14 + 0x5c) == 0
                 )) {
                lVar14 = *(long *)(unaff_x24 + 10);
                if ((lVar14 != 0) && ((*(byte *)(lVar14 + 100) >> 1 & 1) != 0)) {
                  uVar17 = *(uint *)(lVar14 + 0x5c);
                  goto joined_r0x00735f24;
                }
                goto code_r0x007360a4;
              }
            }
            else {
              uVar17 = *(uint *)(unaff_x19 + 0x998);
              if (uVar17 == 0) {
                plVar16 = (long *)0x0;
              }
              else {
                lVar13 = func_0x00782dc4(uVar22,in_stack_00000050,*(undefined8 *)(unaff_x19 + 0xb28)
                                         ,*(undefined8 *)(unaff_x19 + 0xb30));
                plVar16 = (long *)((ulong)uVar17 - lVar13);
                if (plVar16 == (long *)0x0) {
                  plVar16 = (long *)0xffffffffffffffff;
                }
              }
              uVar17 = 300000;
              if (*(uint *)(unaff_x19 + 0x99c) != 0) {
                uVar17 = *(uint *)(unaff_x19 + 0x99c);
              }
              unaff_x22 = (long *)(ulong)uVar17;
              lVar13 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb18),
                                       *(undefined8 *)(unaff_x19 + 0xb20));
              plVar24 = in_stack_00000048;
              plVar20 = (long *)((long)unaff_x22 - lVar13);
              if (plVar20 == (long *)0x0) {
                plVar20 = (long *)0xffffffffffffffff;
              }
              plVar21 = plVar20;
              if ((long)plVar16 <= (long)plVar20) {
                plVar21 = plVar16;
              }
              if (plVar16 != (long *)0x0) {
                plVar20 = plVar21;
              }
              if ((long)plVar20 < 0) {
                in_stack_00000000 =
                     (long *)func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb18),
                                             *(undefined8 *)(unaff_x19 + 0xb20));
                func_0x0073c9e4(unaff_x19,"Connection timeout after %ld ms");
                uVar18 = 0x1c;
                goto LAB_007351c4;
              }
              if (unaff_w25 < 1) {
                unaff_x22 = in_stack_00000048;
              }
              else {
                puVar25 = *(undefined8 **)(unaff_x24 + 8);
                if (((puVar25 == (undefined8 *)0x0) ||
                    ((*(byte *)((long)puVar25 + 100) >> 1 & 1) != 0)) ||
                   (((puVar25[6] == 0 || ((*(byte *)(puVar25[6] + 100) >> 2 & 1) == 0)) &&
                    (lVar13 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x24 + 0xe),
                                              *(undefined8 *)(unaff_x24 + 0x10)),
                    lVar13 < (long)puVar25[7])))) {
code_r0x00735bc4:
                  plVar16 = (long *)0x0;
                  puVar25 = *(undefined8 **)(unaff_x24 + 10);
                  unaff_x22 = plVar24;
                }
                else {
                  uVar17 = *(uint *)(unaff_x19 + 0x998);
                  if (uVar17 == 0) {
                    lVar13 = 0;
                  }
                  else {
                    lVar13 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb28),
                                             *(undefined8 *)(unaff_x19 + 0xb30));
                    lVar13 = (ulong)uVar17 - lVar13;
                    if (lVar13 == 0) {
                      lVar13 = -1;
                    }
                  }
                  uVar17 = 300000;
                  if (*(uint *)(unaff_x19 + 0x99c) != 0) {
                    uVar17 = *(uint *)(unaff_x19 + 0x99c);
                  }
                  lVar14 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb18),
                                           *(undefined8 *)(unaff_x19 + 0xb20));
                  plVar24 = in_stack_00000048;
                  lVar14 = (ulong)uVar17 - lVar14;
                  if (lVar14 == 0) {
                    lVar14 = -1;
                  }
                  lVar1 = lVar14;
                  if (lVar13 <= lVar14) {
                    lVar1 = lVar13;
                  }
                  if (lVar13 != 0) {
                    lVar14 = lVar1;
                  }
                  func_0x00736e5c(in_stack_00000048,unaff_x19,puVar25,lVar14);
                  if ((*(byte *)((long)puVar25 + 100) >> 2 & 1) != 0) {
                    if (((int)*in_stack_00000058 < 0) &&
                       (((*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) == 0 ||
                         (0 < *(int *)(*(long *)(
                                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                + unaff_x19 + 0x18) + 8))) &&
                        (0 < *(int *)(*plVar24 + 0xc))))) {
                      in_stack_00000000 = (long *)*puVar25;
                      func_0x0073cbdc(unaff_x19,plVar24,"%s done");
                    }
                    goto code_r0x00735bc4;
                  }
                  if ((((int)*in_stack_00000058 < 0) &&
                      ((*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) == 0 ||
                       (0 < *(int *)(*(long *)(
                                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                              + unaff_x19 + 0x18) + 8))))) &&
                     (0 < *(int *)(*plVar24 + 0xc))) {
                    in_stack_00000000 = (long *)*puVar25;
                    in_stack_00000008 = (dword *)puVar25[10];
                    func_0x0073cbdc(unaff_x19,plVar24,"%s starting (timeout=%ldms)");
                  }
                  unaff_w28 = unaff_w28 + 1;
                  plVar16 = (long *)((long)&MACH_HEADER.magic + 1);
                  puVar25 = *(undefined8 **)(unaff_x24 + 10);
                  unaff_x22 = plVar24;
                }
                if (((puVar25 != (undefined8 *)0x0) &&
                    ((*(byte *)((long)puVar25 + 100) >> 1 & 1) == 0)) &&
                   (((puVar25[6] != 0 && ((*(byte *)(puVar25[6] + 100) >> 2 & 1) != 0)) ||
                    (lVar13 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x24 + 0xe),
                                              *(undefined8 *)(unaff_x24 + 0x10)),
                    (long)puVar25[7] <= lVar13)))) {
                  uVar17 = *(uint *)(unaff_x19 + 0x998);
                  if (uVar17 == 0) {
                    lVar13 = 0;
                  }
                  else {
                    lVar13 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb28),
                                             *(undefined8 *)(unaff_x19 + 0xb30));
                    lVar13 = (ulong)uVar17 - lVar13;
                    if (lVar13 == 0) {
                      lVar13 = -1;
                    }
                  }
                  uVar17 = 300000;
                  if (*(uint *)(unaff_x19 + 0x99c) != 0) {
                    uVar17 = *(uint *)(unaff_x19 + 0x99c);
                  }
                  lVar14 = func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb18),
                                           *(undefined8 *)(unaff_x19 + 0xb20));
                  unaff_x22 = in_stack_00000048;
                  lVar14 = (ulong)uVar17 - lVar14;
                  if (lVar14 == 0) {
                    lVar14 = -1;
                  }
                  lVar1 = lVar14;
                  if (lVar13 <= lVar14) {
                    lVar1 = lVar13;
                  }
                  if (lVar13 != 0) {
                    lVar14 = lVar1;
                  }
                  func_0x00736e5c(in_stack_00000048,unaff_x19,puVar25,lVar14);
                  if ((*(byte *)((long)puVar25 + 100) >> 2 & 1) == 0) {
                    if (((int)*in_stack_00000058 < 0) &&
                       (((*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) == 0 ||
                         (0 < *(int *)(*(long *)(
                                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                + unaff_x19 + 0x18) + 8))) &&
                        (0 < *(int *)(*unaff_x22 + 0xc))))) {
                      in_stack_00000000 = (long *)*puVar25;
                      in_stack_00000008 = (dword *)puVar25[10];
                      func_0x0073cbdc(unaff_x19,unaff_x22,"%s starting (timeout=%ldms)");
                    }
                    unaff_w28 = unaff_w28 + 1;
                    plVar16 = (long *)((long)&MACH_HEADER.magic + 1);
                  }
                  else if ((((int)*in_stack_00000058 < 0) &&
                           ((*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) == 0 ||
                            (0 < *(int *)(*(long *)(
                                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                  + unaff_x19 + 0x18) + 8))))) &&
                          (0 < *(int *)(*unaff_x22 + 0xc))) {
                    in_stack_00000000 = (long *)*puVar25;
                    func_0x0073cbdc(unaff_x19,unaff_x22,"%s done");
                  }
                }
                if ((int)plVar16 != 0) {
                  *unaff_x21 = 0;
                  uVar19 = 1;
                  auVar26 = func_0x00782d28();
                  lVar13 = 0;
                  unaff_w28 = 0;
                  unaff_w25 = 0;
                  goto code_r0x0073565c;
                }
              }
              if (0 < unaff_w28) {
                uVar18 = 0;
                *unaff_x21 = 0;
                goto LAB_007351c4;
              }
code_r0x00735f74:
              if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8))))) &&
                 (0 < *(int *)(*unaff_x22 + 0xc))) {
                func_0x0073cbdc(unaff_x19,unaff_x22,"all eyeballers failed");
              }
              lVar13 = in_stack_00000028;
              puVar25 = *(undefined8 **)(unaff_x24 + 8);
              if (puVar25 != (undefined8 *)0x0) {
                if ((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
                   (((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))) &&
                    (0 < *(int *)(*unaff_x22 + 0xc))))) {
                  in_stack_00000000 = (long *)*puVar25;
                  in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar25 + 100) >> 1 & 1);
                  in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar25 + 0x5c);
                  func_0x0073cbdc(unaff_x19,unaff_x22,"%s assess started=%d, result=%d");
                }
                if ((*(byte *)((long)puVar25 + 100) >> 1 & 1) != 0) {
                  unaff_x21 = (byte *)(ulong)*(uint *)((long)puVar25 + 0x5c);
                  if (*(uint *)((long)puVar25 + 0x5c) != 0) goto code_r0x007360a8;
                }
              }
              puVar25 = *(undefined8 **)(unaff_x24 + 10);
              if (puVar25 != (undefined8 *)0x0) {
                if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
                    ((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))))) &&
                   (0 < *(int *)(*unaff_x22 + 0xc))) {
                  in_stack_00000000 = (long *)*puVar25;
                  in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar25 + 100) >> 1 & 1);
                  in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar25 + 0x5c);
                  func_0x0073cbdc(unaff_x19,unaff_x22,"%s assess started=%d, result=%d");
                }
                if ((*(byte *)((long)puVar25 + 100) >> 1 & 1) != 0) {
                  uVar17 = *(uint *)((long)puVar25 + 0x5c);
joined_r0x00735f24:
                  unaff_x21 = (byte *)(ulong)uVar17;
                  if (uVar17 != 0) goto code_r0x007360a8;
                }
              }
code_r0x007360a4:
              unaff_x21 = (byte *)((long)&MACH_HEADER.cputype + 3);
            }
code_r0x007360a8:
            uVar17 = (uint)*(ulong *)(lVar13 + 0x398);
            if ((uVar17 >> 1 & 1) == 0) {
              if ((*(ulong *)(lVar13 + 0x398) & 1) == 0) {
                if ((uVar17 >> 8 & 1) == 0) {
                  puVar25 = (undefined8 *)(lVar13 + 0x68);
                }
                else {
                  puVar25 = (undefined8 *)(lVar13 + 0x98);
                }
              }
              else {
                puVar25 = (undefined8 *)(lVar13 + 0xf0);
              }
            }
            else {
              puVar25 = (undefined8 *)(lVar13 + 0xb8);
            }
            unaff_x22 = (long *)*puVar25;
            unaff_x24 = (dword *)(ulong)*(uint *)(lVar13 + 0x174);
            plVar16 = (long *)func_0x00782dc4(uVar22,uVar23,*(undefined8 *)(unaff_x19 + 0xb18),
                                              *(undefined8 *)(unaff_x19 + 0xb20));
            in_stack_00000018 = func_0x0077e9f4(unaff_x21);
            in_stack_00000000 = unaff_x22;
            in_stack_00000008 = unaff_x24;
            in_stack_00000010 = plVar16;
            func_0x0073c9e4(unaff_x19,"Failed to connect to %s port %u after %ld ms: %s");
            uVar18 = 0x1c;
            if (*(int *)(unaff_x19 + 0xc54) != 0x3c) {
              uVar18 = SUB84(unaff_x21,0);
            }
            goto LAB_007351c4;
          }
code_r0x0073565c:
          unaff_x20 = unaff_x24 + lVar13 * 2 + 8;
          unaff_x26 = *(undefined8 **)unaff_x20;
          unaff_x27 = uVar19;
        } while (unaff_x26 == (undefined8 *)0x0);
        bVar2 = *(byte *)((long)unaff_x26 + 100);
      } while ((bVar2 >> 2 & 1) != 0);
      if ((bVar2 >> 1 & 1) == 0) {
        unaff_w25 = unaff_w25 + 1;
        goto LAB_00735650;
      }
      *unaff_x21 = bVar2 >> 3 & 1;
      pdVar11 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
    } while ((bVar2 & 8) != 0 || *(uint *)((long)unaff_x26 + 0x5c) != 0);
    param_1 = unaff_x26[5];
    param_2 = unaff_x19;
  } while( true );
}


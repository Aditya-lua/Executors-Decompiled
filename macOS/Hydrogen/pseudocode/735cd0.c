
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735d84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735db0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735ddc: Changing call to branch */

void FUN_00735cd0(long param_1,long *param_2)

{
  long lVar1;
  byte bVar2;
  undefined8 uVar3;
  bool bVar4;
  int iVar5;
  int iVar6;
  dword *pdVar7;
  int *piVar8;
  long lVar9;
  byte *pbVar10;
  uint uVar11;
  long lVar12;
  undefined4 uVar13;
  long unaff_x19;
  bool bVar14;
  long *plVar15;
  long *plVar16;
  byte *unaff_x21;
  long *unaff_x22;
  long *plVar17;
  undefined8 unaff_x23;
  long *plVar18;
  dword *unaff_x24;
  undefined8 *puVar19;
  undefined8 unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined8 unaff_d8;
  undefined1 auVar20 [16];
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
  
  do {
    func_0x0073cbdc(param_1,param_2,"%s starting (timeout=%ldms)");
    param_2 = unaff_x22;
    do {
      unaff_w28 = unaff_w28 + 1;
      plVar15 = (long *)((long)&MACH_HEADER.magic + 1);
code_r0x00735624:
      do {
        if ((int)plVar15 == 0) {
code_r0x00735f60:
          if (unaff_w28 < 1) {
code_r0x00735f74:
            if ((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*param_2 + 0xc))
                ))) {
              func_0x0073cbdc(unaff_x19,param_2,"all eyeballers failed");
            }
            lVar12 = in_stack_00000028;
            puVar19 = *(undefined8 **)(unaff_x24 + 8);
            if (puVar19 == (undefined8 *)0x0) {
LAB_00736030:
              puVar19 = *(undefined8 **)(unaff_x24 + 10);
              if (puVar19 != (undefined8 *)0x0) {
                if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
                    ((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))))) &&
                   (0 < *(int *)(*param_2 + 0xc))) {
                  in_stack_00000000 = (long *)*puVar19;
                  in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar19 + 100) >> 1 & 1);
                  in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar19 + 0x5c);
                  func_0x0073cbdc(unaff_x19,param_2,"%s assess started=%d, result=%d");
                }
                if ((*(byte *)((long)puVar19 + 100) >> 1 & 1) != 0) {
                  uVar11 = *(uint *)((long)puVar19 + 0x5c);
joined_r0x00735f24:
                  unaff_x21 = (byte *)(ulong)uVar11;
                  if (uVar11 != 0) goto code_r0x007360a8;
                }
              }
code_r0x007360a4:
              unaff_x21 = (byte *)((long)&MACH_HEADER.cputype + 3);
            }
            else {
              if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8))))) &&
                 (0 < *(int *)(*param_2 + 0xc))) {
                in_stack_00000000 = (long *)*puVar19;
                in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar19 + 100) >> 1 & 1);
                in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar19 + 0x5c);
                func_0x0073cbdc(unaff_x19,param_2,"%s assess started=%d, result=%d");
              }
              if ((*(byte *)((long)puVar19 + 100) >> 1 & 1) == 0) goto LAB_00736030;
              unaff_x21 = (byte *)(ulong)*(uint *)((long)puVar19 + 0x5c);
              if (*(uint *)((long)puVar19 + 0x5c) == 0) goto LAB_00736030;
            }
code_r0x007360a8:
            uVar11 = (uint)*(ulong *)(lVar12 + 0x398);
            if ((uVar11 >> 1 & 1) == 0) {
              if ((*(ulong *)(lVar12 + 0x398) & 1) == 0) {
                if ((uVar11 >> 8 & 1) == 0) {
                  puVar19 = (undefined8 *)(lVar12 + 0x68);
                }
                else {
                  puVar19 = (undefined8 *)(lVar12 + 0x98);
                }
              }
              else {
                puVar19 = (undefined8 *)(lVar12 + 0xf0);
              }
            }
            else {
              puVar19 = (undefined8 *)(lVar12 + 0xb8);
            }
            param_2 = (long *)*puVar19;
            unaff_x24 = (dword *)(ulong)*(uint *)(lVar12 + 0x174);
            plVar15 = (long *)func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb18)
                                              ,*(undefined8 *)(unaff_x19 + 0xb20));
            in_stack_00000018 = func_0x0077e9f4(unaff_x21);
            in_stack_00000000 = param_2;
            in_stack_00000008 = unaff_x24;
            in_stack_00000010 = plVar15;
            func_0x0073c9e4(unaff_x19,"Failed to connect to %s port %u after %ld ms: %s");
            uVar13 = 0x1c;
            if (*(int *)(unaff_x19 + 0xc54) != 0x3c) {
              uVar13 = SUB84(unaff_x21,0);
            }
          }
          else {
            uVar13 = 0;
            *unaff_x21 = 0;
          }
LAB_007351c4:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
            return;
          }
          auVar20 = ___stack_chk_fail(uVar13);
          lVar12 = auVar20._8_8_;
          plVar16 = auVar20._0_8_;
          uStack_8 = &DAT_0073612c;
          lVar9 = (long)register0x00000008 + -0x10;
          plVar17 = (long *)plVar16[2];
          plVar18 = plVar17;
          pdStack_40 = unaff_x24;
          uStack_38 = unaff_x23;
          plStack_30 = param_2;
          pbStack_28 = unaff_x21;
          plStack_20 = plVar15;
          if ((((lVar12 != 0) && (*(char *)(lVar12 + 0xa1d) < '\0')) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar12 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar12 + 0x18) + 8))))) && (0 < *(int *)(*plVar16 + 0xc))) {
            func_0x0073cbdc(lVar12,plVar16,"close");
            plVar18 = (long *)plVar16[2];
          }
          unaff_x21 = (byte *)plVar18[4];
          param_2 = plVar17;
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = &UNK_007361c8;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar12;
              unaff_x29 = lVar9;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar18[4] = 0;
          unaff_x21 = (byte *)plVar18[5];
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = &UNK_007361f4;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar12;
              unaff_x29 = lVar9;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar18[5] = 0;
          unaff_x21 = (byte *)plVar18[6];
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = &UNK_00736220;
              register0x00000008 = (BADSPACEBASE *)&pdStack_40;
              unaff_x19 = lVar12;
              unaff_x29 = lVar9;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar18[6] = 0;
          pbVar10 = (byte *)(plVar16 + 1);
          plVar15 = *(long **)pbVar10;
          *(byte *)((long)plVar16 + 0x24) = *(byte *)((long)plVar16 + 0x24) & 0xfe;
          *(undefined4 *)(plVar17 + 3) = 0;
          if (plVar15 == (long *)0x0) {
            return;
          }
          (**(code **)(*plVar15 + 0x20))(plVar15,lVar12);
          plVar16 = plStack_20;
          unaff_x21 = pbStack_28;
          param_2 = plStack_30;
code_r0x00730b28:
          *(long **)((long)register0x00000008 + -0x30) = param_2;
          *(byte **)((long)register0x00000008 + -0x28) = unaff_x21;
          *(long **)((long)register0x00000008 + -0x20) = plVar16;
          *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
          *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
          *(undefined **)((long)register0x00000008 + -8) = uStack_8;
          if (*(long **)pbVar10 != (long *)0x0) {
            pbVar10[0] = 0;
            pbVar10[1] = 0;
            pbVar10[2] = 0;
            pbVar10[3] = 0;
            pbVar10[4] = 0;
            pbVar10[5] = 0;
            pbVar10[6] = 0;
            pbVar10[7] = 0;
            plVar15 = *(long **)pbVar10;
            do {
              plVar16 = (long *)plVar15[1];
              plVar15[1] = 0;
              (**(code **)(*plVar15 + 0x10))(plVar15,lVar12);
              (*pcRam0000000000a2b5f0)(plVar15);
              plVar15 = plVar16;
            } while (plVar16 != (long *)0x0);
          }
          return;
        }
        *unaff_x21 = 0;
        auVar20 = func_0x00782d28();
        in_stack_00000050 = auVar20._8_8_;
        unaff_x23 = auVar20._0_8_;
        lVar12 = 0;
        unaff_w28 = 0;
        iVar6 = 0;
        bVar4 = true;
        do {
          bVar14 = bVar4;
          puVar19 = *(undefined8 **)(unaff_x24 + lVar12 * 2 + 8);
          if ((puVar19 != (undefined8 *)0x0) &&
             (bVar2 = *(byte *)((long)puVar19 + 100), (bVar2 >> 2 & 1) == 0)) {
            if ((bVar2 >> 1 & 1) == 0) {
              iVar6 = iVar6 + 1;
            }
            else {
              *unaff_x21 = bVar2 >> 3 & 1;
              pdVar7 = (dword *)(ulong)*(uint *)((long)puVar19 + 0x5c);
              if ((bVar2 & 8) == 0 && *(uint *)((long)puVar19 + 0x5c) == 0) {
                pdVar7 = (dword *)func_0x00731158(puVar19[5],unaff_x19,0,unaff_x21);
                iVar5 = (int)pdVar7;
                *(int *)((long)puVar19 + 0x5c) = iVar5;
                if (iVar5 == 8) {
                  *(byte *)((long)puVar19 + 100) = *(byte *)((long)puVar19 + 100) | 0x20;
                  pdVar7 = &MACH_HEADER.cpusubtype;
                }
                else if (iVar5 == 0) {
                  if (*unaff_x21 == 0) {
                    lVar9 = func_0x00782dc4(unaff_x23,in_stack_00000050,puVar19[8],puVar19[9]);
                    if (lVar9 < (long)puVar19[10]) {
                      pdVar7 = (dword *)(ulong)*(uint *)((long)puVar19 + 0x5c);
                    }
                    else {
                      if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
                         ((*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) == 0 ||
                          (0 < *(int *)(*(long *)(
                                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                 + unaff_x19 + 0x18) + 8))))) {
                        in_stack_00000000 = (long *)*puVar19;
                        in_stack_00000008 = (dword *)puVar19[10];
                        func_0x0073cab8(unaff_x19,"%s connect timeout after %ldms, move on!");
                      }
                      *(undefined4 *)(puVar19 + 0xc) = 0x3c;
                      pdVar7 = &MACH_HEADER.reserved;
                    }
                  }
                  else {
                    pdVar7 = (dword *)0x0;
                    *(byte *)((long)puVar19 + 100) = *(byte *)((long)puVar19 + 100) | 0xc;
                  }
                }
              }
              *(int *)((long)puVar19 + 0x5c) = (int)pdVar7;
              if ((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
                  ((*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) == 0 ||
                   (0 < *(int *)(*(long *)(
                                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                          + unaff_x19 + 0x18) + 8))))) &&
                 (0 < *(int *)(*param_2 + 0xc))) {
                in_stack_00000000 = (long *)*puVar19;
                in_stack_00000010 = (long *)(ulong)*unaff_x21;
                in_stack_00000008 = pdVar7;
                func_0x0073cbdc(unaff_x19,param_2,"%s connect -> %d, connected=%d");
                pdVar7 = (dword *)(ulong)*(uint *)((long)puVar19 + 0x5c);
              }
              if ((int)pdVar7 == 0) {
                if (*unaff_x21 != 0) {
                  *(undefined8 **)(unaff_x24 + 0xc) = puVar19;
                  *(undefined8 *)(unaff_x24 + lVar12 * 2 + 8) = 0;
                  goto code_r0x00735d30;
                }
                unaff_w28 = unaff_w28 + 1;
              }
              else if ((*(byte *)((long)puVar19 + 100) >> 2 & 1) == 0) {
                iVar5 = *(int *)(puVar19 + 0xc);
                in_stack_00000040._4_4_ = iVar6;
                if (iVar5 != 0) {
                  *(int *)(unaff_x19 + 0xc54) = iVar5;
                  piVar8 = (int *)___error();
                  *piVar8 = iVar5;
                }
                uVar3 = in_stack_00000050;
                uVar11 = *(uint *)(unaff_x19 + 0x998);
                if (uVar11 == 0) {
                  lVar12 = 0;
                }
                else {
                  lVar12 = func_0x00782dc4(unaff_x23,in_stack_00000050,
                                           *(undefined8 *)(unaff_x19 + 0xb28),
                                           *(undefined8 *)(unaff_x19 + 0xb30));
                  lVar12 = (ulong)uVar11 - lVar12;
                  if (lVar12 == 0) {
                    lVar12 = -1;
                  }
                }
                uVar11 = 300000;
                if (*(uint *)(unaff_x19 + 0x99c) != 0) {
                  uVar11 = *(uint *)(unaff_x19 + 0x99c);
                }
                lVar9 = func_0x00782dc4(unaff_x23,uVar3,*(undefined8 *)(unaff_x19 + 0xb18),
                                        *(undefined8 *)(unaff_x19 + 0xb20));
                param_2 = in_stack_00000048;
                iVar6 = in_stack_00000040._4_4_;
                unaff_x21 = in_stack_00000038;
                lVar9 = (ulong)uVar11 - lVar9;
                if (lVar9 == 0) {
                  lVar9 = -1;
                }
                lVar1 = lVar9;
                if (lVar12 <= lVar9) {
                  lVar1 = lVar12;
                }
                if (lVar12 != 0) {
                  lVar9 = lVar1;
                }
                if ((int)in_stack_00000048[4] == 0) {
                  lVar12 = puVar19[2];
                  do {
                    if ((lVar12 == 0) || (lVar12 = *(long *)(lVar12 + 0x28), lVar12 == 0)) {
                      puVar19[2] = 0;
                      if ((*(byte *)((long)puVar19 + 100) >> 5 & 1) != 0) {
                        puVar19[2] = puVar19[1];
                        *(byte *)((long)puVar19 + 100) = *(byte *)((long)puVar19 + 100) & 0xdf | 1;
                      }
                      goto code_r0x007358ec;
                    }
                  } while (*(int *)(lVar12 + 4) != *(int *)(puVar19 + 3));
                  puVar19[2] = lVar12;
code_r0x007358ec:
                  func_0x00736e5c(in_stack_00000048,unaff_x19,puVar19,lVar9);
                  if ((*(byte *)((long)puVar19 + 100) >> 2 & 1) != 0) goto code_r0x00735904;
                }
                else {
                  uVar11 = *(byte *)((long)puVar19 + 100) & 0xfffffff7 | 6;
                  *(char *)((long)puVar19 + 100) = (char)uVar11;
                  *(undefined8 *)((long)puVar19 + 0x5c) = unaff_d8;
                  if ((uVar11 >> 2 & 1) != 0) {
code_r0x00735904:
                    if ((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
                        ((*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) == 0 ||
                         (0 < *(int *)(*(long *)(
                                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                                + unaff_x19 + 0x18) + 8))))) &&
                       (0 < *(int *)(*param_2 + 0xc))) {
                      in_stack_00000000 = (long *)*puVar19;
                      func_0x0073cbdc(unaff_x19,param_2,"%s done");
                    }
                    goto code_r0x00735650;
                  }
                }
                if ((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
                    ((*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) == 0 ||
                     (0 < *(int *)(*(long *)(
                                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                            + unaff_x19 + 0x18) + 8))))) &&
                   (0 < *(int *)(*param_2 + 0xc))) {
                  in_stack_00000000 = (long *)*puVar19;
                  func_0x0073cbdc(unaff_x19,param_2,"%s trying next");
                }
                unaff_w28 = unaff_w28 + 1;
                func_0x00768170(unaff_x19,0,8);
              }
            }
          }
code_r0x00735650:
          unaff_x27 = in_stack_00000050;
          lVar12 = 1;
          bVar4 = false;
        } while (bVar14);
        if (*(long *)(unaff_x24 + 0xc) != 0) {
code_r0x00735d30:
          *unaff_x21 = 1;
          *(undefined4 *)(in_stack_00000030 + 0x18) = 2;
          *(byte *)((long)param_2 + 0x24) = *(byte *)((long)param_2 + 0x24) | 1;
          lVar12 = *(long *)(in_stack_00000030 + 0x30);
          param_2[1] = *(long *)(lVar12 + 0x28);
          *(undefined8 *)(lVar12 + 0x28) = 0;
          plVar16 = (long *)param_2[2];
          unaff_x21 = (byte *)plVar16[4];
          param_2 = (long *)0xa2b5f0;
          lVar12 = unaff_x19;
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = (undefined *)0x735d88;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar16[4] = 0;
          unaff_x21 = (byte *)plVar16[5];
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = (undefined *)0x735db4;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar16[5] = 0;
          unaff_x21 = (byte *)plVar16[6];
          if (unaff_x21 != (byte *)0x0) {
            pbVar10 = unaff_x21 + 0x28;
            if (*(long *)pbVar10 != 0) {
              uStack_8 = (undefined *)0x735de0;
              goto code_r0x00730b28;
            }
            (*pcRam0000000000a2b5f0)(unaff_x21);
          }
          plVar15 = in_stack_00000048;
          plVar16[6] = 0;
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
             (((((0 < *(int *)(*plVar15 + 0xc) &&
                 (iVar6 = func_0x00731b68(plVar15[1],unaff_x19,&uStack0000000000000078,
                                          &dStack000000000000007c), iVar6 == 0)) &&
                ((**(code **)(*(long *)plVar15[1] + 0x30))
                           ((long *)plVar15[1],unaff_x19,&uStack0000000000000070,
                            &uStack0000000000000068,&uStack0000000000000064),
                *(char *)((long)in_stack_00000058 + 3) < '\0')) &&
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + unaff_x19 + 0x18) == 0 ||
                (0 < *(int *)(*(long *)(
                                       "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                       + unaff_x19 + 0x18) + 8))))) &&
              (0 < *(int *)(*plVar15 + 0xc))))) {
            in_stack_00000010 = (long *)(ulong)in_stack_000000d8;
            in_stack_00000008 = &dStack000000000000007c;
            in_stack_00000000 = uStack0000000000000068;
            func_0x0073cbdc(unaff_x19,plVar15,"Connected to %s (%s) port %u");
          }
          uVar13 = 0;
          *(long *)(&UNK_00001390 + unaff_x19) = *(long *)(&UNK_00001390 + unaff_x19) + 1;
          goto LAB_007351c4;
        }
        if (unaff_w28 == 0 && iVar6 == 0) {
          if (unaff_x19 != 0) goto code_r0x00735f74;
          lVar9 = *(long *)(unaff_x24 + 8);
          lVar12 = in_stack_00000028;
          if (((lVar9 != 0) && ((*(byte *)(lVar9 + 100) >> 1 & 1) != 0)) &&
             (unaff_x21 = (byte *)(ulong)*(uint *)(lVar9 + 0x5c), *(uint *)(lVar9 + 0x5c) != 0))
          goto code_r0x007360a8;
          lVar9 = *(long *)(unaff_x24 + 10);
          if ((lVar9 != 0) && ((*(byte *)(lVar9 + 100) >> 1 & 1) != 0)) {
            uVar11 = *(uint *)(lVar9 + 0x5c);
            goto joined_r0x00735f24;
          }
          goto code_r0x007360a4;
        }
        uVar11 = *(uint *)(unaff_x19 + 0x998);
        if (uVar11 == 0) {
          plVar15 = (long *)0x0;
        }
        else {
          lVar12 = func_0x00782dc4(unaff_x23,in_stack_00000050,*(undefined8 *)(unaff_x19 + 0xb28),
                                   *(undefined8 *)(unaff_x19 + 0xb30));
          plVar15 = (long *)((ulong)uVar11 - lVar12);
          if (plVar15 == (long *)0x0) {
            plVar15 = (long *)0xffffffffffffffff;
          }
        }
        uVar11 = 300000;
        if (*(uint *)(unaff_x19 + 0x99c) != 0) {
          uVar11 = *(uint *)(unaff_x19 + 0x99c);
        }
        param_2 = (long *)(ulong)uVar11;
        lVar12 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb18),
                                 *(undefined8 *)(unaff_x19 + 0xb20));
        plVar18 = in_stack_00000048;
        plVar16 = (long *)((long)param_2 - lVar12);
        if (plVar16 == (long *)0x0) {
          plVar16 = (long *)0xffffffffffffffff;
        }
        plVar17 = plVar16;
        if ((long)plVar15 <= (long)plVar16) {
          plVar17 = plVar15;
        }
        if (plVar15 != (long *)0x0) {
          plVar16 = plVar17;
        }
        if ((long)plVar16 < 0) {
          in_stack_00000000 =
               (long *)func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb18),
                                       *(undefined8 *)(unaff_x19 + 0xb20));
          func_0x0073c9e4(unaff_x19,"Connection timeout after %ld ms");
          uVar13 = 0x1c;
          goto LAB_007351c4;
        }
        if (iVar6 < 1) {
          param_2 = in_stack_00000048;
          goto code_r0x00735f60;
        }
        puVar19 = *(undefined8 **)(unaff_x24 + 8);
        if (((puVar19 == (undefined8 *)0x0) || ((*(byte *)((long)puVar19 + 100) >> 1 & 1) != 0)) ||
           (((puVar19[6] == 0 || ((*(byte *)(puVar19[6] + 100) >> 2 & 1) == 0)) &&
            (lVar12 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x24 + 0xe),
                                      *(undefined8 *)(unaff_x24 + 0x10)), lVar12 < (long)puVar19[7])
            ))) {
code_r0x00735bc4:
          plVar15 = (long *)0x0;
          puVar19 = *(undefined8 **)(unaff_x24 + 10);
          param_2 = plVar18;
        }
        else {
          uVar11 = *(uint *)(unaff_x19 + 0x998);
          if (uVar11 == 0) {
            lVar12 = 0;
          }
          else {
            lVar12 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb28),
                                     *(undefined8 *)(unaff_x19 + 0xb30));
            lVar12 = (ulong)uVar11 - lVar12;
            if (lVar12 == 0) {
              lVar12 = -1;
            }
          }
          uVar11 = 300000;
          if (*(uint *)(unaff_x19 + 0x99c) != 0) {
            uVar11 = *(uint *)(unaff_x19 + 0x99c);
          }
          lVar9 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb18),
                                  *(undefined8 *)(unaff_x19 + 0xb20));
          plVar18 = in_stack_00000048;
          lVar9 = (ulong)uVar11 - lVar9;
          if (lVar9 == 0) {
            lVar9 = -1;
          }
          lVar1 = lVar9;
          if (lVar12 <= lVar9) {
            lVar1 = lVar12;
          }
          if (lVar12 != 0) {
            lVar9 = lVar1;
          }
          func_0x00736e5c(in_stack_00000048,unaff_x19,puVar19,lVar9);
          if ((*(byte *)((long)puVar19 + 100) >> 2 & 1) != 0) {
            if (((int)*in_stack_00000058 < 0) &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*plVar18 + 0xc))
                ))) {
              in_stack_00000000 = (long *)*puVar19;
              func_0x0073cbdc(unaff_x19,plVar18,"%s done");
            }
            goto code_r0x00735bc4;
          }
          if ((((int)*in_stack_00000058 < 0) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*plVar18 + 0xc))
             ) {
            in_stack_00000000 = (long *)*puVar19;
            in_stack_00000008 = (dword *)puVar19[10];
            func_0x0073cbdc(unaff_x19,plVar18,"%s starting (timeout=%ldms)");
          }
          unaff_w28 = unaff_w28 + 1;
          plVar15 = (long *)((long)&MACH_HEADER.magic + 1);
          puVar19 = *(undefined8 **)(unaff_x24 + 10);
          param_2 = plVar18;
        }
      } while (((puVar19 == (undefined8 *)0x0) || ((*(byte *)((long)puVar19 + 100) >> 1 & 1) != 0))
              || (((puVar19[6] == 0 || ((*(byte *)(puVar19[6] + 100) >> 2 & 1) == 0)) &&
                  (lVar12 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x24 + 0xe),
                                            *(undefined8 *)(unaff_x24 + 0x10)),
                  lVar12 < (long)puVar19[7]))));
      uVar11 = *(uint *)(unaff_x19 + 0x998);
      if (uVar11 == 0) {
        lVar12 = 0;
      }
      else {
        lVar12 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb28),
                                 *(undefined8 *)(unaff_x19 + 0xb30));
        lVar12 = (ulong)uVar11 - lVar12;
        if (lVar12 == 0) {
          lVar12 = -1;
        }
      }
      uVar11 = 300000;
      if (*(uint *)(unaff_x19 + 0x99c) != 0) {
        uVar11 = *(uint *)(unaff_x19 + 0x99c);
      }
      lVar9 = func_0x00782dc4(unaff_x23,unaff_x27,*(undefined8 *)(unaff_x19 + 0xb18),
                              *(undefined8 *)(unaff_x19 + 0xb20));
      param_2 = in_stack_00000048;
      lVar9 = (ulong)uVar11 - lVar9;
      if (lVar9 == 0) {
        lVar9 = -1;
      }
      lVar1 = lVar9;
      if (lVar12 <= lVar9) {
        lVar1 = lVar12;
      }
      if (lVar12 != 0) {
        lVar9 = lVar1;
      }
      func_0x00736e5c(in_stack_00000048,unaff_x19,puVar19,lVar9);
      if ((*(byte *)((long)puVar19 + 100) >> 2 & 1) != 0) {
        if (((int)*in_stack_00000058 < 0) &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*param_2 + 0xc)))))
        {
          in_stack_00000000 = (long *)*puVar19;
          func_0x0073cbdc(unaff_x19,param_2,"%s done");
        }
        goto code_r0x00735624;
      }
    } while (((-1 < (int)*in_stack_00000058) ||
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) != 0 &&
              (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8) < 1)))) || (*(int *)(*param_2 + 0xc) < 1))
    ;
    in_stack_00000000 = (long *)*puVar19;
    in_stack_00000008 = (dword *)puVar19[10];
    param_1 = unaff_x19;
    unaff_x22 = param_2;
  } while( true );
}


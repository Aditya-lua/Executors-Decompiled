
/* WARNING: Possible PIC construction at 0x00735d84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735db0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00735ddc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x007361f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0073621c: Changing call to branch */

void FUN_00735854(long param_1)

{
  long lVar1;
  byte bVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined8 uVar8;
  int iVar9;
  dword *pdVar10;
  int *piVar11;
  long lVar12;
  byte *pbVar13;
  long *plVar14;
  uint uVar15;
  long lVar16;
  undefined4 uVar17;
  long unaff_x19;
  long *plVar18;
  byte *unaff_x21;
  long *unaff_x22;
  long *plVar19;
  undefined8 uVar20;
  undefined8 unaff_x23;
  long *plVar21;
  dword *unaff_x24;
  int unaff_w25;
  undefined8 *unaff_x26;
  undefined8 *puVar22;
  ulong uVar23;
  ulong unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined8 unaff_d8;
  undefined1 auVar24 [16];
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
  
code_r0x00735854:
  if (0 < *(int *)(param_1 + 0xc)) {
    in_stack_00000000 = (long *)*unaff_x26;
    func_0x0073cbdc(unaff_x19,unaff_x22,"%s trying next");
  }
LAB_0073587c:
  unaff_w28 = unaff_w28 + 1;
  func_0x00768170(unaff_x19,0,8);
  auVar24._8_8_ = in_stack_00000050;
  auVar24._0_8_ = unaff_x23;
  uVar23 = unaff_x27;
LAB_00735650:
  in_stack_00000050 = auVar24._8_8_;
  uVar8 = in_stack_00000050;
  uVar20 = auVar24._0_8_;
  unaff_x27 = 0;
  lVar16 = 1;
  if ((uVar23 & 1) != 0) goto code_r0x0073565c;
  if (*(long *)(unaff_x24 + 0xc) != 0) goto code_r0x00735d30;
  if (unaff_w28 == 0 && unaff_w25 == 0) {
    if (unaff_x19 == 0) {
      lVar12 = *(long *)(unaff_x24 + 8);
      lVar16 = in_stack_00000028;
      if ((((lVar12 == 0) || ((*(byte *)(lVar12 + 100) >> 1 & 1) == 0)) ||
          (unaff_x21 = (byte *)(ulong)*(uint *)(lVar12 + 0x5c), *(uint *)(lVar12 + 0x5c) == 0)) &&
         (((lVar12 = *(long *)(unaff_x24 + 10), lVar12 == 0 ||
           ((*(byte *)(lVar12 + 100) >> 1 & 1) == 0)) ||
          (unaff_x21 = (byte *)(ulong)*(uint *)(lVar12 + 0x5c), *(uint *)(lVar12 + 0x5c) == 0))))
      goto code_r0x007360a4;
    }
    else {
code_r0x00735f74:
      if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x22 + 0xc)))
      {
        func_0x0073cbdc(unaff_x19,unaff_x22,"all eyeballers failed");
      }
      lVar16 = in_stack_00000028;
      puVar22 = *(undefined8 **)(unaff_x24 + 8);
      if (puVar22 != (undefined8 *)0x0) {
        if ((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
           (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x22 + 0xc))))
           ) {
          in_stack_00000000 = (long *)*puVar22;
          in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar22 + 100) >> 1 & 1);
          in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar22 + 0x5c);
          func_0x0073cbdc(unaff_x19,unaff_x22,"%s assess started=%d, result=%d");
        }
        if ((*(byte *)((long)puVar22 + 100) >> 1 & 1) != 0) {
          unaff_x21 = (byte *)(ulong)*(uint *)((long)puVar22 + 0x5c);
          if (*(uint *)((long)puVar22 + 0x5c) != 0) goto code_r0x007360a8;
        }
      }
      puVar22 = *(undefined8 **)(unaff_x24 + 10);
      if (puVar22 != (undefined8 *)0x0) {
        if (((*(char *)((long)in_stack_00000058 + 3) < '\0') &&
            ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0 ||
             (0 < *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*unaff_x22 + 0xc))
           ) {
          in_stack_00000000 = (long *)*puVar22;
          in_stack_00000008 = (dword *)(ulong)(*(byte *)((long)puVar22 + 100) >> 1 & 1);
          in_stack_00000010 = (long *)(ulong)*(uint *)((long)puVar22 + 0x5c);
          func_0x0073cbdc(unaff_x19,unaff_x22,"%s assess started=%d, result=%d");
        }
        if ((*(byte *)((long)puVar22 + 100) >> 1 & 1) != 0) {
          unaff_x21 = (byte *)(ulong)*(uint *)((long)puVar22 + 0x5c);
          if (*(uint *)((long)puVar22 + 0x5c) != 0) goto code_r0x007360a8;
        }
      }
code_r0x007360a4:
      unaff_x21 = (byte *)((long)&MACH_HEADER.cputype + 3);
    }
code_r0x007360a8:
    uVar15 = (uint)*(ulong *)(lVar16 + 0x398);
    if ((uVar15 >> 1 & 1) == 0) {
      if ((*(ulong *)(lVar16 + 0x398) & 1) == 0) {
        if ((uVar15 >> 8 & 1) == 0) {
          puVar22 = (undefined8 *)(lVar16 + 0x68);
        }
        else {
          puVar22 = (undefined8 *)(lVar16 + 0x98);
        }
      }
      else {
        puVar22 = (undefined8 *)(lVar16 + 0xf0);
      }
    }
    else {
      puVar22 = (undefined8 *)(lVar16 + 0xb8);
    }
    unaff_x22 = (long *)*puVar22;
    unaff_x24 = (dword *)(ulong)*(uint *)(lVar16 + 0x174);
    plVar14 = (long *)func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                                      *(undefined8 *)(unaff_x19 + 0xb20));
    in_stack_00000018 = func_0x0077e9f4(unaff_x21);
    in_stack_00000000 = unaff_x22;
    in_stack_00000008 = unaff_x24;
    in_stack_00000010 = plVar14;
    func_0x0073c9e4(unaff_x19,"Failed to connect to %s port %u after %ld ms: %s");
    uVar17 = 0x1c;
    if (*(int *)(unaff_x19 + 0xc54) != 0x3c) {
      uVar17 = SUB84(unaff_x21,0);
    }
  }
  else {
    uVar15 = *(uint *)(unaff_x19 + 0x998);
    if (uVar15 == 0) {
      plVar14 = (long *)0x0;
    }
    else {
      lVar16 = func_0x00782dc4(uVar20,in_stack_00000050,*(undefined8 *)(unaff_x19 + 0xb28),
                               *(undefined8 *)(unaff_x19 + 0xb30));
      plVar14 = (long *)((ulong)uVar15 - lVar16);
      if (plVar14 == (long *)0x0) {
        plVar14 = (long *)0xffffffffffffffff;
      }
    }
    uVar15 = 300000;
    if (*(uint *)(unaff_x19 + 0x99c) != 0) {
      uVar15 = *(uint *)(unaff_x19 + 0x99c);
    }
    unaff_x22 = (long *)(ulong)uVar15;
    lVar16 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                             *(undefined8 *)(unaff_x19 + 0xb20));
    plVar19 = in_stack_00000048;
    plVar18 = (long *)((long)unaff_x22 - lVar16);
    if (plVar18 == (long *)0x0) {
      plVar18 = (long *)0xffffffffffffffff;
    }
    plVar21 = plVar18;
    if ((long)plVar14 <= (long)plVar18) {
      plVar21 = plVar14;
    }
    if (plVar14 != (long *)0x0) {
      plVar18 = plVar21;
    }
    if ((long)plVar18 < 0) {
      in_stack_00000000 =
           (long *)func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                                   *(undefined8 *)(unaff_x19 + 0xb20));
      func_0x0073c9e4(unaff_x19,"Connection timeout after %ld ms");
      uVar17 = 0x1c;
    }
    else {
      if (unaff_w25 < 1) {
        unaff_x22 = in_stack_00000048;
      }
      else {
        puVar22 = *(undefined8 **)(unaff_x24 + 8);
        if (((puVar22 == (undefined8 *)0x0) || ((*(byte *)((long)puVar22 + 100) >> 1 & 1) != 0)) ||
           (((puVar22[6] == 0 || ((*(byte *)(puVar22[6] + 100) >> 2 & 1) == 0)) &&
            (lVar16 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x24 + 0xe),
                                      *(undefined8 *)(unaff_x24 + 0x10)), lVar16 < (long)puVar22[7])
            ))) {
code_r0x00735bc4:
          plVar14 = (long *)0x0;
          puVar22 = *(undefined8 **)(unaff_x24 + 10);
          unaff_x22 = plVar19;
        }
        else {
          uVar15 = *(uint *)(unaff_x19 + 0x998);
          if (uVar15 == 0) {
            lVar16 = 0;
          }
          else {
            lVar16 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb28),
                                     *(undefined8 *)(unaff_x19 + 0xb30));
            lVar16 = (ulong)uVar15 - lVar16;
            if (lVar16 == 0) {
              lVar16 = -1;
            }
          }
          uVar15 = 300000;
          if (*(uint *)(unaff_x19 + 0x99c) != 0) {
            uVar15 = *(uint *)(unaff_x19 + 0x99c);
          }
          lVar12 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                                   *(undefined8 *)(unaff_x19 + 0xb20));
          plVar19 = in_stack_00000048;
          lVar12 = (ulong)uVar15 - lVar12;
          if (lVar12 == 0) {
            lVar12 = -1;
          }
          lVar1 = lVar12;
          if (lVar16 <= lVar12) {
            lVar1 = lVar16;
          }
          if (lVar16 != 0) {
            lVar12 = lVar1;
          }
          func_0x00736e5c(in_stack_00000048,unaff_x19,puVar22,lVar12);
          if ((*(byte *)((long)puVar22 + 100) >> 2 & 1) != 0) {
            if (((int)*in_stack_00000058 < 0) &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*plVar19 + 0xc))
                ))) {
              in_stack_00000000 = (long *)*puVar22;
              func_0x0073cbdc(unaff_x19,plVar19,"%s done");
            }
            goto code_r0x00735bc4;
          }
          if ((((int)*in_stack_00000058 < 0) &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8))))) && (0 < *(int *)(*plVar19 + 0xc))
             ) {
            in_stack_00000000 = (long *)*puVar22;
            in_stack_00000008 = (dword *)puVar22[10];
            func_0x0073cbdc(unaff_x19,plVar19,"%s starting (timeout=%ldms)");
          }
          unaff_w28 = unaff_w28 + 1;
          plVar14 = (long *)((long)&MACH_HEADER.magic + 1);
          puVar22 = *(undefined8 **)(unaff_x24 + 10);
          unaff_x22 = plVar19;
        }
        if (((puVar22 != (undefined8 *)0x0) && ((*(byte *)((long)puVar22 + 100) >> 1 & 1) == 0)) &&
           (((puVar22[6] != 0 && ((*(byte *)(puVar22[6] + 100) >> 2 & 1) != 0)) ||
            (lVar16 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x24 + 0xe),
                                      *(undefined8 *)(unaff_x24 + 0x10)), (long)puVar22[7] <= lVar16
            )))) {
          uVar15 = *(uint *)(unaff_x19 + 0x998);
          if (uVar15 == 0) {
            lVar16 = 0;
          }
          else {
            lVar16 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb28),
                                     *(undefined8 *)(unaff_x19 + 0xb30));
            lVar16 = (ulong)uVar15 - lVar16;
            if (lVar16 == 0) {
              lVar16 = -1;
            }
          }
          uVar15 = 300000;
          if (*(uint *)(unaff_x19 + 0x99c) != 0) {
            uVar15 = *(uint *)(unaff_x19 + 0x99c);
          }
          lVar12 = func_0x00782dc4(uVar20,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                                   *(undefined8 *)(unaff_x19 + 0xb20));
          unaff_x22 = in_stack_00000048;
          lVar12 = (ulong)uVar15 - lVar12;
          if (lVar12 == 0) {
            lVar12 = -1;
          }
          lVar1 = lVar12;
          if (lVar16 <= lVar12) {
            lVar1 = lVar16;
          }
          if (lVar16 != 0) {
            lVar12 = lVar1;
          }
          func_0x00736e5c(in_stack_00000048,unaff_x19,puVar22,lVar12);
          if ((*(byte *)((long)puVar22 + 100) >> 2 & 1) == 0) {
            if (((int)*in_stack_00000058 < 0) &&
               (((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x19 + 0x18) == 0 ||
                 (0 < *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8))) &&
                (0 < *(int *)(*unaff_x22 + 0xc))))) {
              in_stack_00000000 = (long *)*puVar22;
              in_stack_00000008 = (dword *)puVar22[10];
              func_0x0073cbdc(unaff_x19,unaff_x22,"%s starting (timeout=%ldms)");
            }
            unaff_w28 = unaff_w28 + 1;
            plVar14 = (long *)((long)&MACH_HEADER.magic + 1);
          }
          else if ((((int)*in_stack_00000058 < 0) &&
                   ((*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) == 0 ||
                    (0 < *(int *)(*(long *)(
                                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                           + unaff_x19 + 0x18) + 8))))) &&
                  (0 < *(int *)(*unaff_x22 + 0xc))) {
            in_stack_00000000 = (long *)*puVar22;
            func_0x0073cbdc(unaff_x19,unaff_x22,"%s done");
          }
        }
        if ((int)plVar14 != 0) {
          *unaff_x21 = 0;
          unaff_x27 = 1;
          auVar24 = func_0x00782d28();
          lVar16 = 0;
          unaff_w28 = 0;
          unaff_w25 = 0;
          goto code_r0x0073565c;
        }
      }
      if (unaff_w28 < 1) goto code_r0x00735f74;
      uVar17 = 0;
      *unaff_x21 = 0;
    }
  }
  goto code_r0x007351c4;
LAB_0073582c:
  if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) goto code_r0x00735850;
  goto LAB_0073587c;
code_r0x00735850:
  param_1 = *unaff_x22;
  goto code_r0x00735854;
code_r0x0073565c:
  in_stack_00000050 = auVar24._8_8_;
  unaff_x23 = auVar24._0_8_;
  unaff_x26 = *(undefined8 **)(unaff_x24 + lVar16 * 2 + 8);
  uVar23 = unaff_x27;
  if (unaff_x26 == (undefined8 *)0x0) goto LAB_00735650;
  bVar2 = *(byte *)((long)unaff_x26 + 100);
  if ((bVar2 >> 2 & 1) != 0) goto LAB_00735650;
  if ((bVar2 >> 1 & 1) == 0) {
    unaff_w25 = unaff_w25 + 1;
    goto LAB_00735650;
  }
  *unaff_x21 = bVar2 >> 3 & 1;
  pdVar10 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
  if ((bVar2 & 8) == 0 && *(uint *)((long)unaff_x26 + 0x5c) == 0) {
    pdVar10 = (dword *)func_0x00731158(unaff_x26[5],unaff_x19,0,unaff_x21);
    iVar9 = (int)pdVar10;
    *(int *)((long)unaff_x26 + 0x5c) = iVar9;
    if (iVar9 == 8) {
      *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) | 0x20;
      pdVar10 = &MACH_HEADER.cpusubtype;
    }
    else if (iVar9 == 0) {
      if (*unaff_x21 == 0) {
        lVar12 = func_0x00782dc4(unaff_x23,in_stack_00000050,unaff_x26[8],unaff_x26[9]);
        if (lVar12 < (long)unaff_x26[10]) {
          pdVar10 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
        }
        else {
          if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            in_stack_00000000 = (long *)*unaff_x26;
            in_stack_00000008 = (dword *)unaff_x26[10];
            func_0x0073cab8(unaff_x19,"%s connect timeout after %ldms, move on!");
          }
          *(undefined4 *)(unaff_x26 + 0xc) = 0x3c;
          pdVar10 = &MACH_HEADER.reserved;
        }
      }
      else {
        pdVar10 = (dword *)0x0;
        *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) | 0xc;
      }
    }
  }
  *(int *)((long)unaff_x26 + 0x5c) = (int)pdVar10;
  if (((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < *(int *)(*unaff_x22 + 0xc))))) {
    in_stack_00000000 = (long *)*unaff_x26;
    in_stack_00000010 = (long *)(ulong)*unaff_x21;
    in_stack_00000008 = pdVar10;
    func_0x0073cbdc(unaff_x19,unaff_x22,"%s connect -> %d, connected=%d");
    pdVar10 = (dword *)(ulong)*(uint *)((long)unaff_x26 + 0x5c);
  }
  auVar7._8_8_ = in_stack_00000050;
  auVar7._0_8_ = unaff_x23;
  auVar24._8_8_ = in_stack_00000050;
  auVar24._0_8_ = unaff_x23;
  auVar3._8_8_ = in_stack_00000050;
  auVar3._0_8_ = unaff_x23;
  if ((int)pdVar10 != 0) {
    auVar24 = auVar3;
    if ((*(byte *)((long)unaff_x26 + 100) >> 2 & 1) != 0) goto LAB_00735650;
    iVar9 = *(int *)(unaff_x26 + 0xc);
    in_stack_00000040._4_4_ = unaff_w25;
    if (iVar9 != 0) {
      *(int *)(unaff_x19 + 0xc54) = iVar9;
      piVar11 = (int *)___error();
      *piVar11 = iVar9;
    }
    uVar8 = in_stack_00000050;
    uVar15 = *(uint *)(unaff_x19 + 0x998);
    if (uVar15 == 0) {
      lVar16 = 0;
    }
    else {
      lVar16 = func_0x00782dc4(unaff_x23,in_stack_00000050,*(undefined8 *)(unaff_x19 + 0xb28),
                               *(undefined8 *)(unaff_x19 + 0xb30));
      lVar16 = (ulong)uVar15 - lVar16;
      if (lVar16 == 0) {
        lVar16 = -1;
      }
    }
    uVar15 = 300000;
    if (*(uint *)(unaff_x19 + 0x99c) != 0) {
      uVar15 = *(uint *)(unaff_x19 + 0x99c);
    }
    lVar12 = func_0x00782dc4(unaff_x23,uVar8,*(undefined8 *)(unaff_x19 + 0xb18),
                             *(undefined8 *)(unaff_x19 + 0xb20));
    unaff_x22 = in_stack_00000048;
    unaff_w25 = in_stack_00000040._4_4_;
    unaff_x21 = in_stack_00000038;
    lVar12 = (ulong)uVar15 - lVar12;
    if (lVar12 == 0) {
      lVar12 = -1;
    }
    lVar1 = lVar12;
    if (lVar16 <= lVar12) {
      lVar1 = lVar16;
    }
    if (lVar16 != 0) {
      lVar12 = lVar1;
    }
    if ((int)in_stack_00000048[4] == 0) {
      lVar16 = unaff_x26[2];
      do {
        if ((lVar16 == 0) || (lVar16 = *(long *)(lVar16 + 0x28), lVar16 == 0)) {
          unaff_x26[2] = 0;
          if ((*(byte *)((long)unaff_x26 + 100) >> 5 & 1) != 0) {
            unaff_x26[2] = unaff_x26[1];
            *(byte *)((long)unaff_x26 + 100) = *(byte *)((long)unaff_x26 + 100) & 0xdf | 1;
          }
          goto LAB_007358ec;
        }
      } while (*(int *)(lVar16 + 4) != *(int *)(unaff_x26 + 3));
      unaff_x26[2] = lVar16;
LAB_007358ec:
      func_0x00736e5c(in_stack_00000048,unaff_x19,unaff_x26,lVar12);
      if ((*(byte *)((long)unaff_x26 + 100) >> 2 & 1) == 0) goto LAB_0073582c;
    }
    else {
      uVar15 = *(byte *)((long)unaff_x26 + 100) & 0xfffffff7 | 6;
      *(char *)((long)unaff_x26 + 100) = (char)uVar15;
      *(undefined8 *)((long)unaff_x26 + 0x5c) = unaff_d8;
      if ((uVar15 >> 2 & 1) == 0) goto LAB_0073582c;
    }
    auVar6._8_8_ = in_stack_00000050;
    auVar6._0_8_ = unaff_x23;
    auVar5._8_8_ = in_stack_00000050;
    auVar5._0_8_ = unaff_x23;
    auVar4._8_8_ = in_stack_00000050;
    auVar4._0_8_ = unaff_x23;
    auVar24._8_8_ = in_stack_00000050;
    if ((((unaff_x19 != 0) && (auVar24 = auVar4, *(char *)((long)in_stack_00000058 + 3) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (auVar24 = auVar5,
         0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) &&
       (auVar24 = auVar6, 0 < *(int *)(*unaff_x22 + 0xc))) {
      in_stack_00000000 = (long *)*unaff_x26;
      func_0x0073cbdc(unaff_x19,unaff_x22,"%s done");
      auVar24._8_8_ = in_stack_00000050;
    }
    goto LAB_00735650;
  }
  if (*unaff_x21 == 0) {
    unaff_w28 = unaff_w28 + 1;
    goto LAB_00735650;
  }
  *(undefined8 **)(unaff_x24 + 0xc) = unaff_x26;
  *(undefined8 *)(unaff_x24 + lVar16 * 2 + 8) = 0;
  auVar24 = auVar7;
code_r0x00735d30:
  in_stack_00000050 = auVar24._8_8_;
  uVar20 = auVar24._0_8_;
  *unaff_x21 = 1;
  *(undefined4 *)(in_stack_00000030 + 0x18) = 2;
  *(byte *)((long)unaff_x22 + 0x24) = *(byte *)((long)unaff_x22 + 0x24) | 1;
  lVar16 = *(long *)(in_stack_00000030 + 0x30);
  unaff_x22[1] = *(long *)(lVar16 + 0x28);
  *(undefined8 *)(lVar16 + 0x28) = 0;
  plVar18 = (long *)unaff_x22[2];
  unaff_x21 = (byte *)plVar18[4];
  unaff_x22 = (long *)0xa2b5f0;
  lVar16 = unaff_x19;
  plVar19 = unaff_x22;
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = &UNK_00735d88;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar18[4] = 0;
  unaff_x21 = (byte *)plVar18[5];
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = &UNK_00735db4;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar18[5] = 0;
  unaff_x21 = (byte *)plVar18[6];
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = &UNK_00735de0;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar14 = in_stack_00000048;
  plVar18[6] = 0;
  if ((*(byte *)(*(long *)(in_stack_00000048[3] + 0x3a0) + 0x94) & 0x30) != 0) {
    func_0x007706e4(unaff_x19,6);
  }
  if (((((unaff_x19 != 0) && (*(char *)((long)in_stack_00000058 + 3) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) &&
      ((((0 < *(int *)(*plVar14 + 0xc) &&
         (iVar9 = func_0x00731b68(plVar14[1],unaff_x19,&uStack0000000000000078,
                                  &dStack000000000000007c), iVar9 == 0)) &&
        ((**(code **)(*(long *)plVar14[1] + 0x30))
                   ((long *)plVar14[1],unaff_x19,&uStack0000000000000070,&uStack0000000000000068,
                    &uStack0000000000000064), *(char *)((long)in_stack_00000058 + 3) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))))) && (0 < *(int *)(*plVar14 + 0xc))) {
    in_stack_00000010 = (long *)(ulong)in_stack_000000d8;
    in_stack_00000008 = &dStack000000000000007c;
    in_stack_00000000 = uStack0000000000000068;
    func_0x0073cbdc(unaff_x19,plVar14,"Connected to %s (%s) port %u");
  }
  uVar17 = 0;
  *(long *)(&UNK_00001390 + unaff_x19) = *(long *)(&UNK_00001390 + unaff_x19) + 1;
code_r0x007351c4:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return;
  }
  auVar24 = ___stack_chk_fail(uVar17);
  lVar16 = auVar24._8_8_;
  plVar18 = auVar24._0_8_;
  uStack_8 = &DAT_0073612c;
  lVar12 = (long)register0x00000008 + -0x10;
  plVar19 = (long *)plVar18[2];
  plVar21 = plVar19;
  pdStack_40 = unaff_x24;
  uStack_38 = uVar20;
  plStack_30 = unaff_x22;
  pbStack_28 = unaff_x21;
  plStack_20 = plVar14;
  if ((((lVar16 != 0) && (*(char *)(lVar16 + 0xa1d) < '\0')) &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 lVar16 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + lVar16 + 0x18) + 8))))) && (0 < *(int *)(*plVar18 + 0xc))) {
    func_0x0073cbdc(lVar16,plVar18,"close");
    plVar21 = (long *)plVar18[2];
  }
  unaff_x21 = (byte *)plVar21[4];
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = (undefined *)0x7361c8;
      register0x00000008 = (BADSPACEBASE *)&pdStack_40;
      unaff_x19 = lVar16;
      unaff_x29 = lVar12;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar21[4] = 0;
  unaff_x21 = (byte *)plVar21[5];
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = (undefined *)0x7361f4;
      register0x00000008 = (BADSPACEBASE *)&pdStack_40;
      unaff_x19 = lVar16;
      unaff_x29 = lVar12;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar21[5] = 0;
  unaff_x21 = (byte *)plVar21[6];
  if (unaff_x21 != (byte *)0x0) {
    pbVar13 = unaff_x21 + 0x28;
    if (*(long *)pbVar13 != 0) {
      uStack_8 = (undefined *)0x736220;
      register0x00000008 = (BADSPACEBASE *)&pdStack_40;
      unaff_x19 = lVar16;
      unaff_x29 = lVar12;
      goto code_r0x00730b28;
    }
    (*pcRam0000000000a2b5f0)(unaff_x21);
  }
  plVar21[6] = 0;
  pbVar13 = (byte *)(plVar18 + 1);
  plVar14 = *(long **)pbVar13;
  *(byte *)((long)plVar18 + 0x24) = *(byte *)((long)plVar18 + 0x24) & 0xfe;
  *(undefined4 *)(plVar19 + 3) = 0;
  if (plVar14 == (long *)0x0) {
    return;
  }
  (**(code **)(*plVar14 + 0x20))(plVar14,lVar16);
  plVar18 = plStack_20;
  unaff_x21 = pbStack_28;
  plVar19 = plStack_30;
code_r0x00730b28:
  *(long **)((long)register0x00000008 + -0x30) = plVar19;
  *(byte **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(long **)((long)register0x00000008 + -0x20) = plVar18;
  *(long *)((long)register0x00000008 + -0x18) = unaff_x19;
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
  if (*(long **)pbVar13 != (long *)0x0) {
    pbVar13[0] = 0;
    pbVar13[1] = 0;
    pbVar13[2] = 0;
    pbVar13[3] = 0;
    pbVar13[4] = 0;
    pbVar13[5] = 0;
    pbVar13[6] = 0;
    pbVar13[7] = 0;
    plVar14 = *(long **)pbVar13;
    do {
      plVar18 = (long *)plVar14[1];
      plVar14[1] = 0;
      (**(code **)(*plVar14 + 0x10))(plVar14,lVar16);
      (*pcRam0000000000a2b5f0)(plVar14);
      plVar14 = plVar18;
    } while (plVar18 != (long *)0x0);
  }
  return;
}


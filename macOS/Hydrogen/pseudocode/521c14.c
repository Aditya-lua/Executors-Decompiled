
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521c14(void)

{
  long lVar1;
  undefined8 *puVar2;
  undefined *puVar3;
  long *plVar4;
  uint uVar5;
  code *pcVar6;
  int iVar7;
  uint uVar8;
  ulong uVar9;
  uint in_w8;
  undefined8 *puVar10;
  undefined8 *puVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  long *plVar15;
  long *unaff_x19;
  undefined8 *puVar16;
  long unaff_x21;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  undefined8 uVar22;
  undefined8 *unaff_x23;
  undefined8 *puVar23;
  undefined8 *puVar24;
  undefined *puVar25;
  long lVar26;
  long lVar27;
  undefined8 *unaff_x27;
  long lVar28;
  long lVar29;
  uint uVar30;
  long unaff_x28;
  long lVar31;
  long unaff_x29;
  undefined1 auVar32 [16];
  long in_stack_00000018;
  ulong uStack0000000000000028;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000048;
  undefined8 *in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 *in_stack_000000e8;
  undefined8 *in_stack_000000f0;
  undefined8 *in_stack_000000f8;
  undefined8 *in_stack_00000100;
  undefined8 *in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  undefined8 *in_stack_00000128;
  long in_stack_00000130;
  long in_stack_00000138;
  undefined8 *in_stack_00000140;
  
  do {
    if ((in_w8 != 0) && (*(long *)(unaff_x21 + 0x90) != 0)) {
      uVar14 = *unaff_x23;
      lVar13 = unaff_x23[1];
      plVar15 = (long *)(*(long *)(unaff_x21 + 0x88) + 0x220);
      lVar26 = *(long *)(unaff_x21 + 0x90) * 600;
      do {
        if ((*plVar15 == lVar13) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar13), iVar7 == 0)) {
          func_0x00523334(&uStack00000000000000b0,&uStack0000000000000060,unaff_x19[3],unaff_x23);
          lVar26 = in_stack_000000c0;
          lVar13 = in_stack_000000b8;
          if (in_stack_000000c0 != 0) {
            uStack00000000000000c8 = 0;
            in_stack_000000d0 = 8;
            in_stack_00000138 = in_stack_000000b8 + in_stack_000000c0 * 0x10;
            puVar16 = (undefined8 *)unaff_x19[3];
            uStack00000000000000e0 = &uStack00000000000000c8;
            in_stack_000000d8 = 0;
            in_stack_000000f0 = (undefined8 *)0x0;
            in_stack_00000110 = 0;
            in_stack_00000130 = in_stack_000000b8;
            in_stack_000000e8 = puVar16;
            in_stack_00000140 = puVar16;
            func_0x004e8330(unaff_x29 + -0xe0,&uStack00000000000000e0,&UNK_009ea460);
            lVar12 = func_0x0050526c(puVar16,unaff_x23);
            if (lVar12 == 0) {
              func_0x007a23d8(&UNK_008a791f,99,&UNK_009ea4b0);
              goto LAB_00523024;
            }
            uStack00000000000000e0 = in_stack_00000030;
            in_stack_000000e8 = in_stack_00000050;
            in_stack_000000f0 = (undefined8 *)in_stack_00000038;
            in_stack_000000f8 = (undefined8 *)in_stack_00000058;
            in_stack_00000108 = (undefined8 *)lVar13;
            in_stack_00000110 = lVar26;
            in_stack_00000100 = puVar16;
            func_0x004e8dd8(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009ea460);
            in_stack_00000118 = *(long *)(unaff_x29 + -0xa8);
            in_stack_00000120 = in_stack_00000118 + *(long *)(unaff_x29 + -0xa0) * 0x10;
            in_stack_000000e8 = (undefined8 *)lVar13;
            in_stack_000000f0 = (undefined8 *)lVar26;
            in_stack_000000f8 = (undefined8 *)0x0;
            in_stack_00000108 = (undefined8 *)0x0;
            uStack00000000000000e0 = (undefined8 *)(unaff_x29 + -0xb0);
            in_stack_00000128 = puVar16;
            in_stack_00000130 = in_stack_00000118;
            in_stack_00000138 = in_stack_00000120;
            func_0x004e6148(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
            func_0x00525e7c(&uStack00000000000000e0,puVar16);
            *(undefined8 **)(unaff_x29 + -0x68) = in_stack_000000e8;
            *(undefined8 **)(unaff_x29 + -0x70) = uStack00000000000000e0;
            *(long **)(unaff_x29 + -0x60) = unaff_x19;
            uVar14 = *(undefined8 *)(unaff_x29 + -0x88);
            func_0x00525f7c(unaff_x29 + -200,unaff_x29 + -0x70,uVar14,
                            *(undefined8 *)(unaff_x29 + -0x80));
            if (*(long *)(unaff_x29 + -0x90) != 0) {
              func_0x00187bd4(uVar14,*(long *)(unaff_x29 + -0x90) << 4,8);
            }
            if (*(long *)(unaff_x29 + -0xb0) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xa8),*(long *)(unaff_x29 + -0xb0) << 4,8
                             );
            }
            *(undefined8 *)(unaff_x29 + -0x70) = 0;
            *(undefined8 *)(unaff_x29 + -0x68) = 1;
            *(undefined8 *)(unaff_x29 + -0x60) = 0;
            in_stack_000000f0 = (undefined8 *)0xe0000020;
            uStack00000000000000e0 = (undefined8 *)(unaff_x29 + -0x70);
            in_stack_000000e8 = (undefined8 *)&UNK_009ea418;
            iVar7 = func_0x0050f9f0(lVar12,&uStack00000000000000e0);
            if (iVar7 != 0) {
              func_0x007a2810(&UNK_008a7790,0x37,unaff_x29 + -0x90,&UNK_009ea478,&UNK_009ea448);
              goto LAB_00523024;
            }
            *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0x68);
            *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0x70);
            *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x60);
            *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xd8);
            *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
            *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xd0);
            in_stack_000000e8 = *(undefined8 **)(unaff_x29 + -0xc0);
            uStack00000000000000e0 = *(undefined8 **)(unaff_x29 + -200);
            in_stack_000000f0 = *(undefined8 **)(unaff_x29 + -0xb8);
            uVar14 = func_0x0051b178(puVar16,unaff_x29 + -0x90,unaff_x29 + -0x70,
                                     &uStack00000000000000e0);
            if (uStack00000000000000c8 != 0) {
              func_0x00187bd4(in_stack_000000d0,uStack00000000000000c8 << 4,8);
            }
            if (uStack00000000000000b0 == 0) goto joined_r0x00522908;
            lVar26 = uStack00000000000000b0;
            goto LAB_00522e30;
          }
          if (uStack00000000000000b0 != 0) {
            func_0x00187bd4(in_stack_000000b8,uStack00000000000000b0 << 4,8);
          }
          break;
        }
        plVar15 = plVar15 + 0x4b;
        lVar26 = lVar26 + -600;
      } while (lVar26 != 0);
    }
    if (unaff_x27 == in_stack_00000050) {
      if ((*(byte *)(unaff_x19[3] + 0x2bd) >> 4 & 1) == 0) {
        if ((in_stack_00000048 != 0) && ((*(uint *)(unaff_x19[3] + 0x2c0) >> 0xc & 1) != 0))
        goto code_r0x00522900;
      }
      else if (in_stack_00000048 != 0) goto code_r0x00522900;
      in_stack_00000048 = in_stack_00000038;
      puVar16 = in_stack_00000030;
      lVar13 = in_stack_00000048;
      goto LAB_00521d24;
    }
    if (unaff_x28 == in_stack_00000058) goto code_r0x00522f20;
    in_w8 = (uint)*(byte *)(unaff_x28 + 0x61);
    unaff_x23 = unaff_x27;
    unaff_x27 = unaff_x27 + 2;
    unaff_x28 = unaff_x28 + 0x68;
  } while( true );
  while( true ) {
    uVar9 = func_0x005175a8();
    lVar17 = lVar17 + -0x10;
    if ((uVar9 & 1) != 0) break;
code_r0x005221a4:
    if (lVar17 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(puVar16,(long)uStack00000000000000e0 << 4,8);
      }
      uVar14 = *puVar24;
      uVar22 = puVar24[1];
      lVar17 = *(long *)(unaff_x29 + -0xd0);
      if (lVar17 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar16 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar17 * 0x10);
      *puVar16 = uVar14;
      puVar16[1] = uVar22;
      *(long *)(unaff_x29 + -0xd0) = lVar17 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
FUN_005221d4:
  func_0x00187bd4(puVar16,(long)uStack00000000000000e0 << 4,8);
  goto LAB_00522068;
code_r0x0052211c:
  puVar16 = in_stack_000000e8;
  goto FUN_005221d4;
code_r0x00522f20:
  func_0x007a23bc(&UNK_009e9bf8);
  goto LAB_00523024;
LAB_00521d24:
  in_stack_00000048 = lVar13;
  puVar24 = puVar16;
  if (puVar24 != in_stack_00000050) {
    if (in_stack_00000048 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    puVar16 = puVar24 + 2;
    lVar13 = in_stack_00000048 + 0x68;
    if (*(char *)(in_stack_00000048 + 0x61) != '\0') {
      lVar26 = unaff_x19[3];
      if (*(long *)(lVar26 + 0x90) == 0) {
code_r0x00521e78:
        if (*(long *)(lVar26 + 0xd8) != 0) {
          uVar14 = *puVar24;
          lVar12 = puVar24[1];
          plVar15 = (long *)(*(long *)(lVar26 + 0xd0) + 0x50);
          lVar26 = *(long *)(lVar26 + 0xd8) * 0x60;
          do {
            if ((*plVar15 == lVar12) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar12), iVar7 == 0)) {
              if (plVar15[-5] != 0) {
                puVar24 = (undefined8 *)plVar15[-6];
                puVar23 = puVar24 + plVar15[-5] * 2;
                lVar26 = unaff_x19[2];
                do {
                  uVar14 = *puVar24;
                  lVar12 = puVar24[1];
                  lVar17 = unaff_x19[1];
                  if (lVar26 != 0) {
                    plVar15 = (long *)(lVar17 + 0x20);
                    lVar28 = lVar26 * 0x28;
                    do {
                      if ((*plVar15 == lVar12) &&
                         (iVar7 = _memcmp(plVar15[-1],uVar14,lVar12), iVar7 == 0))
                      goto LAB_00521f04;
                      plVar15 = plVar15 + 5;
                      lVar28 = lVar28 + -0x28;
                    } while (lVar28 != 0);
                  }
                  if (lVar26 == *unaff_x19) {
                    func_0x0050c744();
                    lVar17 = unaff_x19[1];
                  }
                  puVar11 = (undefined8 *)(lVar17 + lVar26 * 0x28);
                  *puVar11 = 0;
                  puVar11[1] = 8;
                  puVar11[2] = 0;
                  puVar11[3] = uVar14;
                  puVar11[4] = lVar12;
                  lVar26 = lVar26 + 1;
                  unaff_x19[2] = lVar26;
LAB_00521f04:
                  puVar24 = puVar24 + 2;
                } while (puVar24 != puVar23);
              }
              break;
            }
            plVar15 = plVar15 + 0xc;
            lVar26 = lVar26 + -0x60;
          } while (lVar26 != 0);
        }
      }
      else {
        uVar14 = *puVar24;
        lVar12 = puVar24[1];
        puVar23 = (undefined8 *)(*(long *)(lVar26 + 0x88) + 0x218);
        lVar17 = *(long *)(lVar26 + 0x90) * 600;
        while ((puVar23[1] != lVar12 || (iVar7 = _memcmp(*puVar23,uVar14,lVar12), iVar7 != 0))) {
          puVar23 = puVar23 + 0x4b;
          lVar17 = lVar17 + -600;
          if (lVar17 == 0) goto code_r0x00521e78;
        }
        func_0x00505d80(&uStack00000000000000e0,lVar26,in_stack_00000048,puVar23);
        puVar23 = in_stack_000000e8;
        puVar24 = uStack00000000000000e0;
        if (in_stack_000000f0 != (undefined8 *)0x0) {
          puVar2 = in_stack_000000e8 + (long)in_stack_000000f0 * 2;
          lVar26 = unaff_x19[2];
          puVar11 = in_stack_000000e8;
          do {
            uVar14 = *puVar11;
            lVar12 = puVar11[1];
            lVar17 = unaff_x19[1];
            if (lVar26 != 0) {
              plVar15 = (long *)(lVar17 + 0x20);
              lVar28 = lVar26 * 0x28;
              do {
                if ((*plVar15 == lVar12) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar12), iVar7 == 0)
                   ) goto LAB_00521dfc;
                plVar15 = plVar15 + 5;
                lVar28 = lVar28 + -0x28;
              } while (lVar28 != 0);
            }
            if (lVar26 == *unaff_x19) {
              func_0x0050c744();
              lVar17 = unaff_x19[1];
            }
            puVar10 = (undefined8 *)(lVar17 + lVar26 * 0x28);
            *puVar10 = 0;
            puVar10[1] = 8;
            puVar10[2] = 0;
            puVar10[3] = uVar14;
            puVar10[4] = lVar12;
            lVar26 = lVar26 + 1;
            unaff_x19[2] = lVar26;
LAB_00521dfc:
            puVar11 = puVar11 + 2;
          } while (puVar11 != puVar2);
        }
        if (puVar24 != (undefined8 *)0x0) {
          func_0x00187bd4(puVar23,(long)puVar24 << 4,8);
        }
      }
    }
    goto LAB_00521d24;
  }
  *(undefined8 *)(unaff_x29 + -0xe0) = 0;
  *(undefined8 *)(unaff_x29 + -0xd8) = 8;
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  if (in_stack_00000018 != 0) {
    lVar26 = unaff_x19[3];
    lVar13 = in_stack_00000038;
    puVar16 = in_stack_00000030;
    do {
      if (lVar13 == in_stack_00000058) {
        func_0x007a23bc(&UNK_009e9bf8);
        goto LAB_00523024;
      }
      if ((*(char *)(lVar13 + 0x61) != '\0') && (lVar12 = *(long *)(lVar26 + 0x90), lVar12 != 0)) {
        uVar14 = *puVar16;
        lVar17 = puVar16[1];
        puVar24 = (undefined8 *)(*(long *)(lVar26 + 0x88) + 0x218);
        lVar12 = lVar12 * 600;
        do {
          if ((puVar24[1] == lVar17) && (iVar7 = _memcmp(*puVar24,uVar14,lVar17), iVar7 == 0)) {
            if ((*(byte *)((long)puVar24 + 0x39) >> 6 & 1) != 0) {
              uVar5 = 0;
              goto code_r0x00522050;
            }
            break;
          }
          puVar24 = puVar24 + 0x4b;
          lVar12 = lVar12 + -600;
        } while (lVar12 != 0);
      }
      puVar16 = puVar16 + 2;
      lVar13 = lVar13 + 0x68;
    } while (puVar16 != in_stack_00000050);
  }
  uVar5 = 1;
code_r0x00522050:
  uStack0000000000000028 = 0;
  lVar26 = unaff_x19[1];
  lVar12 = unaff_x19[2];
  lVar13 = lVar26;
LAB_00522068:
  lVar17 = lVar13;
  if (lVar17 != lVar26 + lVar12 * 0x28) {
    uVar9 = func_0x005175a8();
    lVar13 = lVar17 + 0x28;
    if ((uVar9 & 1) == 0) {
      lVar18 = unaff_x19[3];
      lVar28 = *(long *)(lVar18 + 0x90);
      if (lVar28 != 0) {
        lVar29 = 0;
        lVar31 = *(long *)(lVar18 + 0x88);
        uVar14 = *(undefined8 *)(lVar17 + 0x18);
        lVar21 = *(long *)(lVar17 + 0x20);
        do {
          if ((*(long *)(lVar31 + lVar29 + 0x220) == lVar21) &&
             (iVar7 = _memcmp(*(undefined8 *)(lVar31 + lVar29 + 0x218),uVar14,lVar21), iVar7 == 0))
          {
            if (uVar5 == 0) goto LAB_00522068;
            lVar17 = lVar31 + lVar29;
            func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar18,lVar17 + 0x218);
            if (in_stack_000000f0 == (undefined8 *)0x0) {
              if (uStack00000000000000e0 != (undefined8 *)0x0) {
                func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
              }
              lVar28 = *(long *)(lVar18 + 0xd8);
              if (lVar28 != 0) {
                uVar14 = *(undefined8 *)(lVar17 + 0x218);
                lVar27 = *(long *)(lVar17 + 0x220);
                lVar20 = *(long *)(lVar18 + 0xd0);
                lVar21 = lVar20;
                do {
                  lVar1 = lVar21 + 0x60;
                  if (*(long *)(lVar21 + 0x10) != 0) {
                    plVar15 = (long *)(*(long *)(lVar21 + 8) + 8);
                    lVar19 = *(long *)(lVar21 + 0x10) << 4;
                    do {
                      if ((*plVar15 == lVar27) &&
                         (iVar7 = _memcmp(plVar15[-1],uVar14,lVar27), iVar7 == 0)) {
                        uVar22 = *(undefined8 *)(lVar21 + 0x50);
                        *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar21 + 0x48);
                        *(undefined8 *)(unaff_x29 + -0x68) = uVar22;
                        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar18,
                                        unaff_x29 + -0x70);
                        if (in_stack_000000f0 != (undefined8 *)0x0) {
                          if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
                          goto code_r0x0052211c;
                        }
                        if (uStack00000000000000e0 != (undefined8 *)0x0) {
                          func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                        }
                        break;
                      }
                      plVar15 = plVar15 + 2;
                      lVar19 = lVar19 + -0x10;
                    } while (lVar19 != 0);
                  }
                  lVar21 = lVar1;
                } while (lVar1 != lVar20 + lVar28 * 0x60);
              }
              uVar14 = *(undefined8 *)(lVar17 + 0x218);
              uVar22 = *(undefined8 *)(lVar17 + 0x220);
              lVar17 = *(long *)(unaff_x29 + -0xd0);
              if (lVar17 == *(long *)(unaff_x29 + -0xe0)) {
                func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
              }
              puVar16 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar17 * 0x10);
              *puVar16 = uVar14;
              puVar16[1] = uVar22;
              *(long *)(unaff_x29 + -0xd0) = lVar17 + 1;
              if ((*(byte *)(lVar31 + lVar29 + 0x251) & 1) == 0) {
                if (*(int *)(lVar31 + lVar29 + 0x28) == 1) {
                  uVar9 = *(ulong *)(lVar31 + lVar29 + 0x30);
                }
                else {
                  uVar9 = 0;
                }
                if (uVar9 <= uStack0000000000000028) {
                  uVar9 = uStack0000000000000028;
                }
                uStack0000000000000028 = uVar9;
              }
            }
            else if (uStack00000000000000e0 != (undefined8 *)0x0) goto code_r0x0052211c;
            goto LAB_00522068;
          }
          lVar29 = lVar29 + 600;
        } while (lVar28 * 600 != lVar29);
      }
      if (*(long *)(lVar18 + 0xd8) != 0) {
        uVar14 = *(undefined8 *)(lVar17 + 0x18);
        lVar17 = *(long *)(lVar17 + 0x20);
        puVar24 = (undefined8 *)(*(long *)(lVar18 + 0xd0) + 0x48);
        lVar28 = *(long *)(lVar18 + 0xd8) * 0x60;
        do {
          if ((puVar24[1] == lVar17) && (iVar7 = _memcmp(*puVar24,uVar14,lVar17), iVar7 == 0)) {
            func_0x00505704(&uStack00000000000000e0,lVar18,puVar24);
            puVar16 = in_stack_000000e8;
            lVar17 = (long)in_stack_000000f0 << 4;
            goto code_r0x005221a4;
          }
          puVar24 = puVar24 + 0xc;
          lVar28 = lVar28 + -0x60;
        } while (lVar28 != 0);
      }
    }
    goto LAB_00522068;
  }
  lVar26 = *(long *)(unaff_x19[3] + 0x88);
  lVar12 = *(long *)(unaff_x19[3] + 0x90);
  lVar13 = lVar26;
  while (lVar17 = lVar13, lVar17 != lVar26 + lVar12 * 600) {
    uVar9 = func_0x005175a8();
    lVar13 = lVar17 + 600;
    if ((uVar9 & 1) == 0) {
      if (*(long *)(lVar17 + 0xd8) == 0) {
        uVar30 = 0;
      }
      else {
        uVar30 = 0;
        lVar28 = *(long *)(lVar17 + 0xd0);
        lVar18 = *(long *)(lVar17 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(undefined8 **)(lVar28 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar28 + 0x18);
          uVar8 = func_0x005175a8();
          uVar30 = uVar8 | uVar30;
          lVar28 = lVar28 + 0x20;
          lVar18 = lVar18 + -0x20;
        } while (lVar18 != 0);
      }
      lVar28 = *(long *)(lVar17 + 0xe8);
      lVar18 = *(long *)(lVar17 + 0xf0) << 5;
      do {
        uVar8 = uVar5;
        if (lVar18 == 0) {
          if (*(long *)(lVar17 + 0xf0) != 0) {
            lVar28 = *(long *)(lVar17 + 0x108);
            if (lVar28 != 0) {
              uVar30 = 1;
              lVar18 = *(long *)(lVar17 + 0x120);
              goto joined_r0x00522584;
            }
            if (*(long *)(lVar17 + 0x120) == 0) goto joined_r0x00522590;
            lVar28 = 0;
            uVar30 = 1;
            lVar18 = *(long *)(lVar17 + 0x120);
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(undefined8 **)(lVar28 + 0x10);
        in_stack_000000e8 = *(undefined8 **)(lVar28 + 0x18);
        uVar9 = func_0x005175a8();
        lVar28 = lVar28 + 0x20;
        lVar18 = lVar18 + -0x20;
      } while ((uVar9 & 1) != 0);
      lVar28 = *(long *)(lVar17 + 0x108);
      if (lVar28 == 0) {
        if (*(long *)(lVar17 + 0x120) != 0) {
          lVar28 = 0;
          lVar18 = *(long *)(lVar17 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar18 = *(long *)(lVar17 + 0x120);
joined_r0x00522584:
        if (lVar18 != 0) {
          lVar18 = lVar18 << 4;
          do {
            if (lVar18 == 0) goto code_r0x0052253c;
            uVar9 = func_0x005175a8();
            lVar18 = lVar18 + -0x10;
          } while ((uVar9 & 1) != 0);
          lVar28 = *(long *)(lVar17 + 0x108);
        }
        lVar28 = lVar28 << 4;
        do {
          if (lVar28 == 0) goto joined_r0x00522590;
          uVar9 = func_0x005175a8();
          lVar28 = lVar28 + -0x10;
        } while ((uVar9 & 1) == 0);
      }
code_r0x0052253c:
      uVar8 = uVar5 & uVar30;
joined_r0x00522590:
      if (uVar8 != 0) {
        uVar14 = *(undefined8 *)(lVar17 + 0x218);
        uVar22 = *(undefined8 *)(lVar17 + 0x220);
        lVar28 = *(long *)(unaff_x29 + -0xd0);
        if (lVar28 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar16 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar28 * 0x10);
        *puVar16 = uVar14;
        puVar16[1] = uVar22;
        *(long *)(unaff_x29 + -0xd0) = lVar28 + 1;
        if ((*(byte *)(lVar17 + 0x251) & 1) == 0) {
          if (*(int *)(lVar17 + 0x28) == 1) {
            uVar9 = *(ulong *)(lVar17 + 0x30);
          }
          else {
            uVar9 = 0;
          }
          if (uVar9 <= uStack0000000000000028) {
            uVar9 = uStack0000000000000028;
          }
          uStack0000000000000028 = uVar9;
        }
      }
    }
  }
  lVar13 = unaff_x19[3];
  if ((((*(byte *)(lVar13 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar13 + 0x2c0) >> 4 & 1) == 0)) &&
     (lVar26 = *(long *)(lVar13 + 0x90), lVar26 != 0)) {
    lVar12 = 0;
    lVar28 = *(long *)(lVar13 + 0x88);
    lVar17 = *(long *)(lVar28 + 0x228);
    lVar13 = lVar28;
    while( true ) {
      if ((lVar17 == 0) && (*(int *)(lVar13 + 0x248) == 0x110000)) {
        iVar7 = func_0x005175a8();
        if ((iVar7 == 0) &&
           ((lVar13 = lVar28 + lVar12, *(int *)(lVar13 + 0x28) != 1 ||
            (*(ulong *)(lVar13 + 0x30) < uStack0000000000000028)))) {
          uVar14 = *(undefined8 *)(lVar28 + lVar12 + 0x218);
          uVar22 = *(undefined8 *)(lVar13 + 0x220);
          lVar13 = *(long *)(unaff_x29 + -0xd0);
          if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar16 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
          *puVar16 = uVar14;
          puVar16[1] = uVar22;
          *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
        }
      }
      if (lVar26 * 600 + -600 == lVar12) break;
      lVar12 = lVar12 + 600;
      lVar13 = lVar28 + lVar12;
      lVar17 = *(long *)(lVar13 + 0x228);
    }
  }
  lVar13 = *(long *)(unaff_x29 + -0xd0);
  if (lVar13 == 0) {
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
    }
code_r0x00522900:
    uVar14 = 0;
joined_r0x00522908:
    if (uStack0000000000000060 != 0) {
      func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
    }
    lVar13 = in_stack_00000080;
    if (in_stack_00000088 != 0) {
      puVar16 = (undefined8 *)(in_stack_00000080 + 8);
      lVar26 = in_stack_00000088;
      do {
        if (puVar16[-1] != 0) {
          func_0x00187bd4(*puVar16,puVar16[-1] << 4,8);
        }
        puVar16 = puVar16 + 3;
        lVar26 = lVar26 + -1;
      } while (lVar26 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(lVar13,in_stack_00000078 * 0x18,8);
    }
    return uVar14;
  }
  lVar26 = 0;
  lVar12 = *(long *)(unaff_x29 + -0xe0);
  puVar16 = *(undefined8 **)(unaff_x29 + -0xd8);
  lVar28 = unaff_x19[3];
  lVar17 = *(long *)(lVar28 + 0xf0) << 4;
  uVar9 = 0xffffffffffffffff;
  plVar15 = *(long **)(lVar28 + 0xe8);
  do {
    if (lVar17 == 0) {
      puVar25 = (undefined *)0x0;
      goto LAB_00522a40;
    }
    lVar18 = *plVar15;
    plVar4 = plVar15 + 1;
    uVar9 = uVar9 + 1;
    lVar26 = lVar26 + 0x20;
    lVar17 = lVar17 + -0x10;
    plVar15 = plVar15 + 2;
  } while (lVar18 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
  if (uVar9 < *(ulong *)(lVar28 + 0x108)) {
    lVar26 = *(long *)(lVar28 + 0x100) + lVar26;
    lVar17 = *(long *)(lVar26 + -0x18);
    puVar25 = (undefined *)
              (*(long *)(lVar26 + -0x20) + (*(long *)(lVar17 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar32 = (**(code **)(lVar17 + 0x18))(puVar25);
    if (auVar32._0_8_ == 0x1414db8803bc16e0 && auVar32._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
      puVar3 = &UNK_008a7b62;
      if (puVar25 != (undefined *)0x0) {
        puVar3 = puVar25;
      }
      *(long *)(unaff_x29 + -200) = lVar28;
      *(undefined **)(unaff_x29 + -0xc0) = puVar3;
      *(long **)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar16,lVar13);
      puVar24 = uStack00000000000000e0;
      in_stack_000000f8 = in_stack_000000e8 + (long)in_stack_000000f0 * 3;
      uStack00000000000000e0 = in_stack_000000e8;
      in_stack_000000f0 = puVar24;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      in_stack_000000f8 = puVar16 + lVar13 * 2;
      in_stack_00000100 = in_stack_00000030;
      in_stack_00000108 = in_stack_00000050;
      in_stack_00000110 = in_stack_00000038;
      in_stack_00000118 = in_stack_00000058;
      uStack00000000000000e0 = puVar16;
      in_stack_000000e8 = puVar16;
      in_stack_000000f0 = (undefined8 *)lVar12;
      in_stack_00000120 = lVar28;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      lVar13 = *(long *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,lVar13,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar14 = func_0x0051c5b4(lVar28,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        lVar26 = *(long *)(unaff_x29 + -0x90);
LAB_00522e30:
        func_0x00187bd4(lVar13,lVar26 << 4,8);
      }
      goto joined_r0x00522908;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar9,*(ulong *)(lVar28 + 0x108),&UNK_009e9b68);
  }
LAB_00523024:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x523028);
  (*pcVar6)();
}


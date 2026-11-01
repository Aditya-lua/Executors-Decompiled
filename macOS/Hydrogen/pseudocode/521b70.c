
/* WARNING: Removing unreachable block (ram,0x00522354) */
/* WARNING: Removing unreachable block (ram,0x0052235c) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521b70(void)

{
  long lVar1;
  undefined *puVar2;
  long *plVar3;
  uint uVar4;
  code *pcVar5;
  int iVar6;
  uint uVar7;
  ulong uVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  long *plVar12;
  long *unaff_x19;
  undefined8 *unaff_x21;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 *puVar16;
  long lVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 *puVar20;
  ulong unaff_x24;
  undefined8 *puVar21;
  undefined *puVar22;
  undefined8 *unaff_x25;
  long lVar23;
  long lVar24;
  long lVar25;
  undefined8 *unaff_x27;
  long lVar26;
  long lVar27;
  uint uVar28;
  long unaff_x28;
  long lVar29;
  long unaff_x29;
  undefined1 auVar30 [16];
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
  undefined8 in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 *in_stack_000000e8;
  long in_stack_000000f0;
  
  do {
    if (*(char *)(unaff_x28 + 0x61) == '\0') {
      lVar9 = 0;
    }
    else {
      lVar9 = 0;
      if (unaff_x21[0x12] != 0) {
        uVar11 = *unaff_x27;
        lVar9 = unaff_x27[1];
        plVar12 = (long *)(unaff_x21[0x11] + 0x220);
        lVar23 = unaff_x21[0x12] * 600;
        do {
          if ((*plVar12 == lVar9) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar9), iVar6 == 0)) {
            lVar9 = 1;
            goto LAB_00521bd0;
          }
          plVar12 = plVar12 + 0x4b;
          lVar23 = lVar23 + -600;
        } while (lVar23 != 0);
        lVar9 = 0;
LAB_00521bd0:
        unaff_x25 = in_stack_00000050;
      }
    }
    unaff_x27 = unaff_x27 + 2;
    unaff_x28 = unaff_x28 + 0x68;
    unaff_x24 = lVar9 + unaff_x24;
    if (unaff_x27 == unaff_x25) {
      if (unaff_x24 < 2) goto code_r0x00521be0;
      puVar20 = in_stack_00000030;
      lVar9 = in_stack_00000038;
      goto code_r0x00522788;
    }
  } while (unaff_x28 != in_stack_00000058);
  func_0x007a23bc(&UNK_009e9bf8);
  goto LAB_00523024;
  while( true ) {
    lVar24 = *plVar12;
    plVar3 = plVar12 + 1;
    uVar8 = uVar8 + 1;
    lVar9 = lVar9 + 0x20;
    lVar23 = lVar23 + -0x10;
    plVar12 = plVar12 + 2;
    if (lVar24 == 0x1414db8803bc16e0 && *plVar3 == 0x4f7557bbe08e4383) break;
code_r0x0052286c:
    if (lVar23 == 0) goto code_r0x00522ecc;
  }
  if ((ulong)unaff_x21[0x21] <= uVar8) {
    func_0x007a2570(uVar8,unaff_x21[0x21],&UNK_009e9b68);
    goto LAB_00523024;
  }
  lVar23 = *(long *)(unaff_x21[0x20] + lVar9 + -0x18);
  auVar30 = (**(code **)(lVar23 + 0x18))
                      (*(long *)(unaff_x21[0x20] + lVar9 + -0x20) +
                       (*(long *)(lVar23 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  if (auVar30._0_8_ != 0x1414db8803bc16e0 || auVar30._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto LAB_00523024;
  }
code_r0x00522ecc:
  uStack00000000000000e0 = unaff_x21;
  func_0x00525f7c(unaff_x29 + -0x70,&uStack00000000000000e0,8,0);
  uVar11 = func_0x0051b178();
  goto joined_r0x00522c70;
  while( true ) {
    uVar8 = func_0x005175a8();
    lVar13 = lVar13 + -0x10;
    if ((uVar8 & 1) != 0) break;
code_r0x005221a4:
    if (lVar13 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
      }
      uVar11 = *puVar20;
      uVar19 = puVar20[1];
      lVar13 = *(long *)(unaff_x29 + -0xd0);
      if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
      *puVar20 = uVar11;
      puVar20[1] = uVar19;
      *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 != (undefined8 *)0x0) {
FUN_005221d4:
    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
  }
  goto LAB_00522068;
code_r0x00522788:
  do {
    if (lVar9 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    if ((*(char *)(lVar9 + 0x61) != '\0') && (unaff_x21[0x12] != 0)) {
      lVar23 = unaff_x21[0x11];
      lVar13 = unaff_x21[0x12] * 600;
      uVar11 = *puVar20;
      lVar24 = puVar20[1];
      do {
        if ((*(long *)(lVar23 + 0x220) == lVar24) &&
           (iVar6 = _memcmp(*(undefined8 *)(lVar23 + 0x218),uVar11,lVar24), iVar6 == 0)) {
          if ((*(byte *)(lVar23 + 0x251) >> 6 & 1) != 0) {
            *(undefined8 *)(unaff_x29 + -0x70) = 0;
            *(undefined8 *)(unaff_x29 + -0x68) = 1;
            *(undefined8 *)(unaff_x29 + -0x60) = 0;
            uStack00000000000000e0 = (undefined8 *)(unaff_x29 + -0x70);
            iVar6 = func_0x0050f9f0(lVar23,&uStack00000000000000e0);
            if (iVar6 == 0) {
              lVar9 = 0;
              *(undefined8 *)(unaff_x29 + -0xa8) = *(undefined8 *)(unaff_x29 + -0x68);
              *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(unaff_x29 + -0x70);
              *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x60);
              *(undefined8 *)(unaff_x29 + -0x90) = 0;
              *(undefined8 *)(unaff_x29 + -0x88) = 8;
              *(undefined8 *)(unaff_x29 + -0x80) = 0;
              lVar23 = unaff_x21[0x1e] << 4;
              uVar8 = 0xffffffffffffffff;
              plVar12 = (long *)unaff_x21[0x1d];
              goto code_r0x0052286c;
            }
            func_0x007a2810(&UNK_008a7790,0x37,unaff_x29 + -0x90,&UNK_009ea478,&UNK_009ea448);
            goto LAB_00523024;
          }
          break;
        }
        lVar23 = lVar23 + 600;
        lVar13 = lVar13 + -600;
      } while (lVar13 != 0);
    }
    puVar20 = puVar20 + 2;
    lVar9 = lVar9 + 0x68;
  } while (puVar20 != in_stack_00000050);
code_r0x00521be0:
  lVar9 = in_stack_00000038;
  puVar20 = in_stack_00000030;
  do {
    if (lVar9 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    puVar21 = puVar20 + 2;
    if ((*(char *)(lVar9 + 0x61) != '\0') && (unaff_x21[0x12] != 0)) {
      uVar11 = *puVar20;
      lVar23 = puVar20[1];
      plVar12 = (long *)(unaff_x21[0x11] + 0x220);
      lVar24 = unaff_x21[0x12] * 600;
      do {
        if ((*plVar12 == lVar23) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar23), iVar6 == 0)) {
          func_0x00523334(&uStack00000000000000b0,&uStack0000000000000060,unaff_x19[3],puVar20);
          uVar19 = in_stack_000000b8;
          if (in_stack_000000c0 != 0) {
            uStack00000000000000c8 = 0;
            in_stack_000000d0 = 8;
            lVar23 = unaff_x19[3];
            uStack00000000000000e0 = &uStack00000000000000c8;
            in_stack_000000d8 = 0;
            func_0x004e8330(unaff_x29 + -0xe0,&uStack00000000000000e0,&UNK_009ea460);
            lVar9 = func_0x0050526c(lVar23,puVar20);
            if (lVar9 == 0) {
              func_0x007a23d8(&UNK_008a791f,99,&UNK_009ea4b0);
              goto LAB_00523024;
            }
            uStack00000000000000e0 = in_stack_00000030;
            func_0x004e8dd8(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009ea460);
            uStack00000000000000e0 = (undefined8 *)(unaff_x29 + -0xb0);
            func_0x004e6148(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
            func_0x00525e7c(&uStack00000000000000e0,lVar23);
            *(undefined8 *)(unaff_x29 + -0x68) = uVar19;
            *(undefined8 **)(unaff_x29 + -0x70) = uStack00000000000000e0;
            *(long **)(unaff_x29 + -0x60) = unaff_x19;
            uVar11 = *(undefined8 *)(unaff_x29 + -0x88);
            func_0x00525f7c(unaff_x29 + -200,unaff_x29 + -0x70,uVar11,
                            *(undefined8 *)(unaff_x29 + -0x80));
            if (*(long *)(unaff_x29 + -0x90) != 0) {
              func_0x00187bd4(uVar11,*(long *)(unaff_x29 + -0x90) << 4,8);
            }
            if (*(long *)(unaff_x29 + -0xb0) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xa8),*(long *)(unaff_x29 + -0xb0) << 4,8
                             );
            }
            *(undefined8 *)(unaff_x29 + -0x70) = 0;
            *(undefined8 *)(unaff_x29 + -0x68) = 1;
            *(undefined8 *)(unaff_x29 + -0x60) = 0;
            uStack00000000000000e0 = (undefined8 *)(unaff_x29 + -0x70);
            iVar6 = func_0x0050f9f0(lVar9,&uStack00000000000000e0);
            if (iVar6 != 0) {
              func_0x007a2810(&UNK_008a7790,0x37,unaff_x29 + -0x90,&UNK_009ea478,&UNK_009ea448);
              goto LAB_00523024;
            }
            *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0x68);
            *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0x70);
            *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x60);
            *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xd8);
            *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
            *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xd0);
            uStack00000000000000e0 = *(undefined8 **)(unaff_x29 + -200);
            uVar11 = func_0x0051b178(lVar23,unaff_x29 + -0x90,unaff_x29 + -0x70,
                                     &uStack00000000000000e0);
            if (uStack00000000000000c8 != 0) {
              func_0x00187bd4(in_stack_000000d0,uStack00000000000000c8 << 4,8);
            }
            if (uStack00000000000000b0 == 0) goto joined_r0x00522c70;
            lVar9 = uStack00000000000000b0;
            goto LAB_00522e30;
          }
          if (uStack00000000000000b0 != 0) {
            func_0x00187bd4(in_stack_000000b8,uStack00000000000000b0 << 4,8);
          }
          break;
        }
        plVar12 = plVar12 + 0x4b;
        lVar24 = lVar24 + -600;
      } while (lVar24 != 0);
    }
    lVar9 = lVar9 + 0x68;
    puVar20 = puVar21;
  } while (puVar21 != in_stack_00000050);
  if ((*(byte *)(unaff_x19[3] + 0x2bd) >> 4 & 1) == 0) {
    if ((in_stack_00000048 == 0) || ((*(uint *)(unaff_x19[3] + 0x2c0) >> 0xc & 1) == 0))
    goto code_r0x00521d10;
  }
  else if (in_stack_00000048 == 0) {
code_r0x00521d10:
    in_stack_00000048 = in_stack_00000038;
    puVar20 = in_stack_00000030;
    lVar9 = in_stack_00000048;
LAB_00521d24:
    in_stack_00000048 = lVar9;
    puVar21 = puVar20;
    if (puVar21 != in_stack_00000050) {
      if (in_stack_00000048 == in_stack_00000058) {
        func_0x007a23bc(&UNK_009e9bf8);
        goto LAB_00523024;
      }
      puVar20 = puVar21 + 2;
      lVar9 = in_stack_00000048 + 0x68;
      if (*(char *)(in_stack_00000048 + 0x61) != '\0') {
        lVar23 = unaff_x19[3];
        if (*(long *)(lVar23 + 0x90) == 0) {
code_r0x00521e78:
          if (*(long *)(lVar23 + 0xd8) != 0) {
            uVar11 = *puVar21;
            lVar24 = puVar21[1];
            plVar12 = (long *)(*(long *)(lVar23 + 0xd0) + 0x50);
            lVar23 = *(long *)(lVar23 + 0xd8) * 0x60;
            do {
              if ((*plVar12 == lVar24) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar24), iVar6 == 0))
              {
                if (plVar12[-5] != 0) {
                  puVar21 = (undefined8 *)plVar12[-6];
                  puVar16 = puVar21 + plVar12[-5] * 2;
                  lVar23 = unaff_x19[2];
                  do {
                    uVar11 = *puVar21;
                    lVar24 = puVar21[1];
                    lVar13 = unaff_x19[1];
                    if (lVar23 != 0) {
                      plVar12 = (long *)(lVar13 + 0x20);
                      lVar26 = lVar23 * 0x28;
                      do {
                        if ((*plVar12 == lVar24) &&
                           (iVar6 = _memcmp(plVar12[-1],uVar11,lVar24), iVar6 == 0))
                        goto LAB_00521f04;
                        plVar12 = plVar12 + 5;
                        lVar26 = lVar26 + -0x28;
                      } while (lVar26 != 0);
                    }
                    if (lVar23 == *unaff_x19) {
                      func_0x0050c744();
                      lVar13 = unaff_x19[1];
                    }
                    puVar10 = (undefined8 *)(lVar13 + lVar23 * 0x28);
                    *puVar10 = 0;
                    puVar10[1] = 8;
                    puVar10[2] = 0;
                    puVar10[3] = uVar11;
                    puVar10[4] = lVar24;
                    lVar23 = lVar23 + 1;
                    unaff_x19[2] = lVar23;
LAB_00521f04:
                    puVar21 = puVar21 + 2;
                  } while (puVar21 != puVar16);
                }
                break;
              }
              plVar12 = plVar12 + 0xc;
              lVar23 = lVar23 + -0x60;
            } while (lVar23 != 0);
          }
        }
        else {
          uVar11 = *puVar21;
          lVar24 = puVar21[1];
          puVar16 = (undefined8 *)(*(long *)(lVar23 + 0x88) + 0x218);
          lVar13 = *(long *)(lVar23 + 0x90) * 600;
          while ((puVar16[1] != lVar24 || (iVar6 = _memcmp(*puVar16,uVar11,lVar24), iVar6 != 0))) {
            puVar16 = puVar16 + 0x4b;
            lVar13 = lVar13 + -600;
            if (lVar13 == 0) goto code_r0x00521e78;
          }
          func_0x00505d80(&uStack00000000000000e0,lVar23,in_stack_00000048,puVar16);
          puVar21 = uStack00000000000000e0;
          if (in_stack_000000f0 != 0) {
            lVar23 = unaff_x19[2];
            puVar16 = in_stack_000000e8;
            do {
              uVar11 = *puVar16;
              lVar24 = puVar16[1];
              lVar13 = unaff_x19[1];
              if (lVar23 != 0) {
                plVar12 = (long *)(lVar13 + 0x20);
                lVar26 = lVar23 * 0x28;
                do {
                  if ((*plVar12 == lVar24) &&
                     (iVar6 = _memcmp(plVar12[-1],uVar11,lVar24), iVar6 == 0)) goto LAB_00521dfc;
                  plVar12 = plVar12 + 5;
                  lVar26 = lVar26 + -0x28;
                } while (lVar26 != 0);
              }
              if (lVar23 == *unaff_x19) {
                func_0x0050c744();
                lVar13 = unaff_x19[1];
              }
              puVar10 = (undefined8 *)(lVar13 + lVar23 * 0x28);
              *puVar10 = 0;
              puVar10[1] = 8;
              puVar10[2] = 0;
              puVar10[3] = uVar11;
              puVar10[4] = lVar24;
              lVar23 = lVar23 + 1;
              unaff_x19[2] = lVar23;
LAB_00521dfc:
              puVar16 = puVar16 + 2;
            } while (puVar16 != in_stack_000000e8 + in_stack_000000f0 * 2);
          }
          if (puVar21 != (undefined8 *)0x0) {
            func_0x00187bd4(in_stack_000000e8,(long)puVar21 << 4,8);
          }
        }
      }
      goto LAB_00521d24;
    }
    *(undefined8 *)(unaff_x29 + -0xe0) = 0;
    *(undefined8 *)(unaff_x29 + -0xd8) = 8;
    *(undefined8 *)(unaff_x29 + -0xd0) = 0;
    if (in_stack_00000018 != 0) {
      lVar9 = unaff_x19[3];
      do {
        if (in_stack_00000038 == in_stack_00000058) {
          func_0x007a23bc(&UNK_009e9bf8);
          goto LAB_00523024;
        }
        if ((*(char *)(in_stack_00000038 + 0x61) != '\0') &&
           (lVar23 = *(long *)(lVar9 + 0x90), lVar23 != 0)) {
          uVar11 = *in_stack_00000030;
          lVar24 = in_stack_00000030[1];
          puVar20 = (undefined8 *)(*(long *)(lVar9 + 0x88) + 0x218);
          lVar23 = lVar23 * 600;
          do {
            if ((puVar20[1] == lVar24) && (iVar6 = _memcmp(*puVar20,uVar11,lVar24), iVar6 == 0)) {
              if ((*(byte *)((long)puVar20 + 0x39) >> 6 & 1) != 0) {
                uVar4 = 0;
                goto code_r0x00522050;
              }
              break;
            }
            puVar20 = puVar20 + 0x4b;
            lVar23 = lVar23 + -600;
          } while (lVar23 != 0);
        }
        in_stack_00000030 = in_stack_00000030 + 2;
        in_stack_00000038 = in_stack_00000038 + 0x68;
      } while (in_stack_00000030 != in_stack_00000050);
    }
    uVar4 = 1;
code_r0x00522050:
    uStack0000000000000028 = 0;
    lVar23 = unaff_x19[1];
    lVar24 = unaff_x19[2];
    lVar9 = lVar23;
LAB_00522068:
    lVar13 = lVar9;
    if (lVar13 != lVar23 + lVar24 * 0x28) {
      uVar8 = func_0x005175a8();
      lVar9 = lVar13 + 0x28;
      if ((uVar8 & 1) == 0) {
        lVar14 = unaff_x19[3];
        lVar26 = *(long *)(lVar14 + 0x90);
        if (lVar26 != 0) {
          lVar27 = 0;
          lVar29 = *(long *)(lVar14 + 0x88);
          uVar11 = *(undefined8 *)(lVar13 + 0x18);
          lVar18 = *(long *)(lVar13 + 0x20);
          do {
            if ((*(long *)(lVar29 + lVar27 + 0x220) == lVar18) &&
               (iVar6 = _memcmp(*(undefined8 *)(lVar29 + lVar27 + 0x218),uVar11,lVar18), iVar6 == 0)
               ) {
              if (uVar4 == 0) goto LAB_00522068;
              lVar13 = lVar29 + lVar27;
              func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,lVar13 + 0x218)
              ;
              if (in_stack_000000f0 == 0) {
                if (uStack00000000000000e0 != (undefined8 *)0x0) {
                  func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                }
                lVar26 = *(long *)(lVar14 + 0xd8);
                if (lVar26 != 0) {
                  uVar11 = *(undefined8 *)(lVar13 + 0x218);
                  lVar25 = *(long *)(lVar13 + 0x220);
                  lVar17 = *(long *)(lVar14 + 0xd0);
                  lVar18 = lVar17;
                  do {
                    lVar1 = lVar18 + 0x60;
                    if (*(long *)(lVar18 + 0x10) != 0) {
                      plVar12 = (long *)(*(long *)(lVar18 + 8) + 8);
                      lVar15 = *(long *)(lVar18 + 0x10) << 4;
                      do {
                        if ((*plVar12 == lVar25) &&
                           (iVar6 = _memcmp(plVar12[-1],uVar11,lVar25), iVar6 == 0)) {
                          uVar19 = *(undefined8 *)(lVar18 + 0x50);
                          *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar18 + 0x48);
                          *(undefined8 *)(unaff_x29 + -0x68) = uVar19;
                          func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,
                                          unaff_x29 + -0x70);
                          if (uStack00000000000000e0 != (undefined8 *)0x0) {
                            func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                          }
                          break;
                        }
                        plVar12 = plVar12 + 2;
                        lVar15 = lVar15 + -0x10;
                      } while (lVar15 != 0);
                    }
                    lVar18 = lVar1;
                  } while (lVar1 != lVar17 + lVar26 * 0x60);
                }
                uVar11 = *(undefined8 *)(lVar13 + 0x218);
                uVar19 = *(undefined8 *)(lVar13 + 0x220);
                lVar13 = *(long *)(unaff_x29 + -0xd0);
                if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
                  func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
                }
                puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
                *puVar20 = uVar11;
                puVar20[1] = uVar19;
                *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
                if ((*(byte *)(lVar29 + lVar27 + 0x251) & 1) == 0) {
                  if (*(int *)(lVar29 + lVar27 + 0x28) == 1) {
                    uVar8 = *(ulong *)(lVar29 + lVar27 + 0x30);
                  }
                  else {
                    uVar8 = 0;
                  }
                  if (uVar8 <= uStack0000000000000028) {
                    uVar8 = uStack0000000000000028;
                  }
                  uStack0000000000000028 = uVar8;
                }
              }
              else if (uStack00000000000000e0 != (undefined8 *)0x0) goto FUN_005221d4;
              goto LAB_00522068;
            }
            lVar27 = lVar27 + 600;
          } while (lVar26 * 600 != lVar27);
        }
        if (*(long *)(lVar14 + 0xd8) != 0) {
          uVar11 = *(undefined8 *)(lVar13 + 0x18);
          lVar13 = *(long *)(lVar13 + 0x20);
          puVar20 = (undefined8 *)(*(long *)(lVar14 + 0xd0) + 0x48);
          lVar26 = *(long *)(lVar14 + 0xd8) * 0x60;
          do {
            if ((puVar20[1] == lVar13) && (iVar6 = _memcmp(*puVar20,uVar11,lVar13), iVar6 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar14,puVar20);
              lVar13 = in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar20 = puVar20 + 0xc;
            lVar26 = lVar26 + -0x60;
          } while (lVar26 != 0);
        }
      }
      goto LAB_00522068;
    }
    lVar23 = *(long *)(unaff_x19[3] + 0x88);
    lVar24 = *(long *)(unaff_x19[3] + 0x90);
    lVar9 = lVar23;
    while (lVar13 = lVar9, lVar13 != lVar23 + lVar24 * 600) {
      uVar8 = func_0x005175a8();
      lVar9 = lVar13 + 600;
      if ((uVar8 & 1) == 0) {
        if (*(long *)(lVar13 + 0xd8) == 0) {
          uVar28 = 0;
        }
        else {
          uVar28 = 0;
          lVar26 = *(long *)(lVar13 + 0xd0);
          lVar14 = *(long *)(lVar13 + 0xd8) << 5;
          do {
            uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
            in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
            uVar7 = func_0x005175a8();
            uVar28 = uVar7 | uVar28;
            lVar26 = lVar26 + 0x20;
            lVar14 = lVar14 + -0x20;
          } while (lVar14 != 0);
        }
        lVar26 = *(long *)(lVar13 + 0xe8);
        lVar14 = *(long *)(lVar13 + 0xf0) << 5;
        do {
          uVar7 = uVar4;
          if (lVar14 == 0) {
            if (*(long *)(lVar13 + 0xf0) != 0) {
              lVar26 = *(long *)(lVar13 + 0x108);
              if (lVar26 == 0) {
                if (*(long *)(lVar13 + 0x120) == 0) goto joined_r0x0052251c;
                lVar26 = 0;
                lVar14 = *(long *)(lVar13 + 0x120);
              }
              else {
                lVar14 = *(long *)(lVar13 + 0x120);
              }
              uVar28 = 1;
              goto joined_r0x005224a8;
            }
            break;
          }
          uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
          uVar8 = func_0x005175a8();
          lVar26 = lVar26 + 0x20;
          lVar14 = lVar14 + -0x20;
        } while ((uVar8 & 1) != 0);
        lVar26 = *(long *)(lVar13 + 0x108);
        if (lVar26 == 0) {
          if (*(long *)(lVar13 + 0x120) != 0) {
            lVar26 = 0;
            lVar14 = *(long *)(lVar13 + 0x120);
            goto joined_r0x005224a8;
          }
        }
        else {
          lVar14 = *(long *)(lVar13 + 0x120);
joined_r0x005224a8:
          if (lVar14 != 0) {
            lVar14 = lVar14 << 4;
            do {
              if (lVar14 == 0) goto code_r0x0052253c;
              uVar8 = func_0x005175a8();
              lVar14 = lVar14 + -0x10;
            } while ((uVar8 & 1) != 0);
            lVar26 = *(long *)(lVar13 + 0x108);
          }
          lVar26 = lVar26 << 4;
          do {
            if (lVar26 == 0) goto joined_r0x0052251c;
            uVar8 = func_0x005175a8();
            lVar26 = lVar26 + -0x10;
          } while ((uVar8 & 1) == 0);
        }
code_r0x0052253c:
        uVar7 = uVar4 & uVar28;
joined_r0x0052251c:
        if (uVar7 != 0) {
          uVar11 = *(undefined8 *)(lVar13 + 0x218);
          uVar19 = *(undefined8 *)(lVar13 + 0x220);
          lVar26 = *(long *)(unaff_x29 + -0xd0);
          if (lVar26 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
          }
          puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar26 * 0x10);
          *puVar20 = uVar11;
          puVar20[1] = uVar19;
          *(long *)(unaff_x29 + -0xd0) = lVar26 + 1;
          if ((*(byte *)(lVar13 + 0x251) & 1) == 0) {
            if (*(int *)(lVar13 + 0x28) == 1) {
              uVar8 = *(ulong *)(lVar13 + 0x30);
            }
            else {
              uVar8 = 0;
            }
            if (uVar8 <= uStack0000000000000028) {
              uVar8 = uStack0000000000000028;
            }
            uStack0000000000000028 = uVar8;
          }
        }
      }
    }
    lVar9 = unaff_x19[3];
    if ((((*(byte *)(lVar9 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar9 + 0x2c0) >> 4 & 1) == 0)) &&
       (lVar23 = *(long *)(lVar9 + 0x90), lVar23 != 0)) {
      lVar24 = 0;
      lVar26 = *(long *)(lVar9 + 0x88);
      lVar13 = *(long *)(lVar26 + 0x228);
      lVar9 = lVar26;
      while( true ) {
        if ((lVar13 == 0) && (*(int *)(lVar9 + 0x248) == 0x110000)) {
          iVar6 = func_0x005175a8();
          if ((iVar6 == 0) &&
             ((lVar9 = lVar26 + lVar24, *(int *)(lVar9 + 0x28) != 1 ||
              (*(ulong *)(lVar9 + 0x30) < uStack0000000000000028)))) {
            uVar11 = *(undefined8 *)(lVar26 + lVar24 + 0x218);
            uVar19 = *(undefined8 *)(lVar9 + 0x220);
            lVar9 = *(long *)(unaff_x29 + -0xd0);
            if (lVar9 == *(long *)(unaff_x29 + -0xe0)) {
              func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
            }
            puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar9 * 0x10);
            *puVar20 = uVar11;
            puVar20[1] = uVar19;
            *(long *)(unaff_x29 + -0xd0) = lVar9 + 1;
          }
        }
        if (lVar23 * 600 + -600 == lVar24) break;
        lVar24 = lVar24 + 600;
        lVar9 = lVar26 + lVar24;
        lVar13 = *(long *)(lVar9 + 0x228);
      }
    }
    lVar9 = *(long *)(unaff_x29 + -0xd0);
    if (lVar9 != 0) {
      lVar23 = 0;
      puVar20 = *(undefined8 **)(unaff_x29 + -0xd8);
      lVar13 = unaff_x19[3];
      lVar24 = *(long *)(lVar13 + 0xf0) << 4;
      uVar8 = 0xffffffffffffffff;
      plVar12 = *(long **)(lVar13 + 0xe8);
      do {
        if (lVar24 == 0) {
          puVar22 = (undefined *)0x0;
          goto LAB_00522a40;
        }
        lVar26 = *plVar12;
        plVar3 = plVar12 + 1;
        uVar8 = uVar8 + 1;
        lVar23 = lVar23 + 0x20;
        lVar24 = lVar24 + -0x10;
        plVar12 = plVar12 + 2;
      } while (lVar26 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
      if (*(ulong *)(lVar13 + 0x108) <= uVar8) {
        func_0x007a2570(uVar8,*(ulong *)(lVar13 + 0x108),&UNK_009e9b68);
LAB_00523024:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x523028);
        (*pcVar5)();
      }
      lVar23 = *(long *)(lVar13 + 0x100) + lVar23;
      lVar24 = *(long *)(lVar23 + -0x18);
      puVar22 = (undefined *)
                (*(long *)(lVar23 + -0x20) + (*(long *)(lVar24 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar30 = (**(code **)(lVar24 + 0x18))(puVar22);
      if (auVar30._0_8_ != 0x1414db8803bc16e0 || auVar30._8_8_ != 0x4f7557bbe08e4383) {
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
        goto LAB_00523024;
      }
LAB_00522a40:
      puVar2 = &UNK_008a7b62;
      if (puVar22 != (undefined *)0x0) {
        puVar2 = puVar22;
      }
      *(long *)(unaff_x29 + -200) = lVar13;
      *(undefined **)(unaff_x29 + -0xc0) = puVar2;
      *(long **)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar20,lVar9);
      uStack00000000000000e0 = in_stack_000000e8;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      uStack00000000000000e0 = puVar20;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar19 = *(undefined8 *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar19,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar11 = func_0x0051c5b4(lVar13,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        lVar9 = *(long *)(unaff_x29 + -0x90);
LAB_00522e30:
        func_0x00187bd4(uVar19,lVar9 << 4,8);
      }
      goto joined_r0x00522c70;
    }
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
    }
  }
  uVar11 = 0;
joined_r0x00522c70:
  if (uStack0000000000000060 != 0) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
  }
  lVar9 = in_stack_00000080;
  if (in_stack_00000088 != 0) {
    puVar20 = (undefined8 *)(in_stack_00000080 + 8);
    lVar23 = in_stack_00000088;
    do {
      if (puVar20[-1] != 0) {
        func_0x00187bd4(*puVar20,puVar20[-1] << 4,8);
      }
      puVar20 = puVar20 + 3;
      lVar23 = lVar23 + -1;
    } while (lVar23 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(lVar9,in_stack_00000078 * 0x18,8);
  }
  return uVar11;
}


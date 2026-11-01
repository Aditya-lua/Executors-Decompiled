
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521e08(void)

{
  long lVar1;
  undefined *puVar2;
  long *plVar3;
  uint uVar4;
  code *pcVar5;
  int iVar6;
  uint uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 uVar11;
  long *plVar12;
  long *unaff_x19;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 *unaff_x22;
  long lVar16;
  long lVar17;
  undefined8 uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined *puVar21;
  long unaff_x25;
  undefined8 *unaff_x26;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  uint uVar26;
  long lVar27;
  long lVar28;
  long unaff_x29;
  undefined1 auVar29 [16];
  long in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  undefined8 *in_stack_00000040;
  long in_stack_00000048;
  undefined8 *in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000e0;
  undefined8 *in_stack_000000e8;
  undefined8 *in_stack_000000f0;
  undefined8 *in_stack_000000f8;
  undefined8 *in_stack_00000100;
  undefined8 *in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  long in_stack_00000120;
  
code_r0x00521e08:
  do {
    uVar11 = *unaff_x22;
    lVar10 = unaff_x22[1];
    lVar27 = unaff_x19[1];
    if (unaff_x25 != 0) {
      plVar12 = (long *)(lVar27 + 0x20);
      lVar23 = unaff_x25 * 0x28;
      do {
        if ((*plVar12 == lVar10) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar10), iVar6 == 0))
        goto LAB_00521dfc;
        plVar12 = plVar12 + 5;
        lVar23 = lVar23 + -0x28;
      } while (lVar23 != 0);
    }
    if (unaff_x25 == *unaff_x19) {
      func_0x0050c744();
      lVar27 = unaff_x19[1];
    }
    puVar20 = (undefined8 *)(lVar27 + unaff_x25 * 0x28);
    *puVar20 = 0;
    puVar20[1] = 8;
    puVar20[2] = 0;
    puVar20[3] = uVar11;
    puVar20[4] = lVar10;
    unaff_x25 = unaff_x25 + 1;
    unaff_x19[2] = unaff_x25;
LAB_00521dfc:
    unaff_x22 = unaff_x22 + 2;
    if (unaff_x22 == unaff_x26) {
code_r0x00521f80:
      lVar10 = in_stack_00000048;
      if (in_stack_00000020 != (undefined8 *)0x0) {
        func_0x00187bd4(in_stack_00000028,(long)in_stack_00000020 << 4,8);
      }
      do {
        in_stack_00000048 = lVar10;
        puVar20 = in_stack_00000040;
        if (puVar20 == in_stack_00000050) {
          *(undefined8 *)(unaff_x29 + -0xe0) = 0;
          *(undefined8 *)(unaff_x29 + -0xd8) = 8;
          *(undefined8 *)(unaff_x29 + -0xd0) = 0;
          if (in_stack_00000018 == 0) goto code_r0x00522048;
          lVar27 = unaff_x19[3];
          lVar10 = in_stack_00000038;
          puVar20 = in_stack_00000030;
          goto code_r0x00521fdc;
        }
        if (in_stack_00000048 == in_stack_00000058) {
          func_0x007a23bc(&UNK_009e9bf8);
          goto LAB_00523024;
        }
        in_stack_00000040 = puVar20 + 2;
        lVar10 = in_stack_00000048 + 0x68;
        if (*(char *)(in_stack_00000048 + 0x61) != '\0') {
          lVar27 = unaff_x19[3];
          if (*(long *)(lVar27 + 0x90) != 0) {
            uVar11 = *puVar20;
            lVar23 = puVar20[1];
            puVar19 = (undefined8 *)(*(long *)(lVar27 + 0x88) + 0x218);
            lVar13 = *(long *)(lVar27 + 0x90) * 600;
            do {
              if ((puVar19[1] == lVar23) && (iVar6 = _memcmp(*puVar19,uVar11,lVar23), iVar6 == 0)) {
                func_0x00505d80(&uStack00000000000000e0,lVar27,in_stack_00000048,puVar19);
                in_stack_00000020 = uStack00000000000000e0;
                in_stack_00000028 = in_stack_000000e8;
                in_stack_00000048 = lVar10;
                if (in_stack_000000f0 == (undefined8 *)0x0) goto code_r0x00521f80;
                unaff_x26 = in_stack_000000e8 + (long)in_stack_000000f0 * 2;
                unaff_x25 = unaff_x19[2];
                unaff_x22 = in_stack_000000e8;
                goto code_r0x00521e08;
              }
              puVar19 = puVar19 + 0x4b;
              lVar13 = lVar13 + -600;
            } while (lVar13 != 0);
          }
          if (*(long *)(lVar27 + 0xd8) != 0) {
            uVar11 = *puVar20;
            lVar23 = puVar20[1];
            plVar12 = (long *)(*(long *)(lVar27 + 0xd0) + 0x50);
            lVar27 = *(long *)(lVar27 + 0xd8) * 0x60;
            do {
              if ((*plVar12 == lVar23) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar23), iVar6 == 0))
              {
                if (plVar12[-5] != 0) {
                  puVar20 = (undefined8 *)plVar12[-6];
                  puVar19 = puVar20 + plVar12[-5] * 2;
                  lVar27 = unaff_x19[2];
                  do {
                    uVar11 = *puVar20;
                    lVar23 = puVar20[1];
                    lVar13 = unaff_x19[1];
                    if (lVar27 != 0) {
                      plVar12 = (long *)(lVar13 + 0x20);
                      lVar24 = lVar27 * 0x28;
                      do {
                        if ((*plVar12 == lVar23) &&
                           (iVar6 = _memcmp(plVar12[-1],uVar11,lVar23), iVar6 == 0))
                        goto LAB_00521f04;
                        plVar12 = plVar12 + 5;
                        lVar24 = lVar24 + -0x28;
                      } while (lVar24 != 0);
                    }
                    if (lVar27 == *unaff_x19) {
                      func_0x0050c744();
                      lVar13 = unaff_x19[1];
                    }
                    puVar9 = (undefined8 *)(lVar13 + lVar27 * 0x28);
                    *puVar9 = 0;
                    puVar9[1] = 8;
                    puVar9[2] = 0;
                    puVar9[3] = uVar11;
                    puVar9[4] = lVar23;
                    lVar27 = lVar27 + 1;
                    unaff_x19[2] = lVar27;
LAB_00521f04:
                    puVar20 = puVar20 + 2;
                  } while (puVar20 != puVar19);
                }
                break;
              }
              plVar12 = plVar12 + 0xc;
              lVar27 = lVar27 + -0x60;
            } while (lVar27 != 0);
          }
        }
      } while( true );
    }
  } while( true );
  while( true ) {
    uVar8 = func_0x005175a8();
    lVar13 = lVar13 + -0x10;
    if ((uVar8 & 1) != 0) break;
code_r0x005221a4:
    if (lVar13 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(puVar20,(long)uStack00000000000000e0 << 4,8);
      }
      uVar11 = *puVar19;
      uVar18 = puVar19[1];
      lVar13 = *(long *)(unaff_x29 + -0xd0);
      if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
      *puVar20 = uVar11;
      puVar20[1] = uVar18;
      *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
FUN_005221d4:
  func_0x00187bd4(puVar20,(long)uStack00000000000000e0 << 4,8);
  goto LAB_00522068;
joined_r0x00522118:
  in_stack_000000e8 = puVar20;
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
  goto FUN_005221d4;
code_r0x00521fdc:
  do {
    if (lVar10 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    if ((*(char *)(lVar10 + 0x61) != '\0') && (lVar23 = *(long *)(lVar27 + 0x90), lVar23 != 0)) {
      uVar11 = *puVar20;
      lVar13 = puVar20[1];
      puVar19 = (undefined8 *)(*(long *)(lVar27 + 0x88) + 0x218);
      lVar23 = lVar23 * 600;
      do {
        if ((puVar19[1] == lVar13) && (iVar6 = _memcmp(*puVar19,uVar11,lVar13), iVar6 == 0)) {
          if ((*(byte *)((long)puVar19 + 0x39) >> 6 & 1) != 0) {
            uVar4 = 0;
            goto code_r0x00522050;
          }
          break;
        }
        puVar19 = puVar19 + 0x4b;
        lVar23 = lVar23 + -600;
      } while (lVar23 != 0);
    }
    puVar20 = puVar20 + 2;
    lVar10 = lVar10 + 0x68;
  } while (puVar20 != in_stack_00000050);
code_r0x00522048:
  uVar4 = 1;
code_r0x00522050:
  in_stack_00000028 = (undefined8 *)0x0;
  lVar27 = unaff_x19[1];
  lVar23 = unaff_x19[2];
  lVar10 = lVar27;
LAB_00522068:
  lVar13 = lVar10;
  if (lVar13 != lVar27 + lVar23 * 0x28) {
    uVar8 = func_0x005175a8();
    lVar10 = lVar13 + 0x28;
    if ((uVar8 & 1) == 0) {
      lVar14 = unaff_x19[3];
      lVar24 = *(long *)(lVar14 + 0x90);
      if (lVar24 == 0) {
code_r0x00522128:
        if (*(long *)(lVar14 + 0xd8) != 0) {
          uVar11 = *(undefined8 *)(lVar13 + 0x18);
          lVar13 = *(long *)(lVar13 + 0x20);
          puVar19 = (undefined8 *)(*(long *)(lVar14 + 0xd0) + 0x48);
          lVar24 = *(long *)(lVar14 + 0xd8) * 0x60;
          do {
            if ((puVar19[1] == lVar13) && (iVar6 = _memcmp(*puVar19,uVar11,lVar13), iVar6 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar14,puVar19);
              puVar20 = in_stack_000000e8;
              lVar13 = (long)in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar19 = puVar19 + 0xc;
            lVar24 = lVar24 + -0x60;
          } while (lVar24 != 0);
        }
      }
      else {
        lVar25 = 0;
        lVar28 = *(long *)(lVar14 + 0x88);
        uVar11 = *(undefined8 *)(lVar13 + 0x18);
        lVar17 = *(long *)(lVar13 + 0x20);
        while ((*(long *)(lVar28 + lVar25 + 0x220) != lVar17 ||
               (iVar6 = _memcmp(*(undefined8 *)(lVar28 + lVar25 + 0x218),uVar11,lVar17), iVar6 != 0)
               )) {
          lVar25 = lVar25 + 600;
          if (lVar24 * 600 == lVar25) goto code_r0x00522128;
        }
        if (uVar4 == 0) goto LAB_00522068;
        lVar13 = lVar28 + lVar25;
        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,lVar13 + 0x218);
        puVar20 = in_stack_000000e8;
        if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
        if (uStack00000000000000e0 != (undefined8 *)0x0) {
          func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
        }
        lVar24 = *(long *)(lVar14 + 0xd8);
        if (lVar24 != 0) {
          uVar11 = *(undefined8 *)(lVar13 + 0x218);
          lVar22 = *(long *)(lVar13 + 0x220);
          lVar16 = *(long *)(lVar14 + 0xd0);
          lVar17 = lVar16;
          do {
            lVar1 = lVar17 + 0x60;
            if (*(long *)(lVar17 + 0x10) != 0) {
              plVar12 = (long *)(*(long *)(lVar17 + 8) + 8);
              lVar15 = *(long *)(lVar17 + 0x10) << 4;
              do {
                if ((*plVar12 == lVar22) && (iVar6 = _memcmp(plVar12[-1],uVar11,lVar22), iVar6 == 0)
                   ) {
                  uVar18 = *(undefined8 *)(lVar17 + 0x50);
                  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar17 + 0x48);
                  *(undefined8 *)(unaff_x29 + -0x68) = uVar18;
                  func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,
                                  unaff_x29 + -0x70);
                  puVar20 = in_stack_000000e8;
                  if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
                  if (uStack00000000000000e0 != (undefined8 *)0x0) {
                    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                  }
                  break;
                }
                plVar12 = plVar12 + 2;
                lVar15 = lVar15 + -0x10;
              } while (lVar15 != 0);
            }
            lVar17 = lVar1;
          } while (lVar1 != lVar16 + lVar24 * 0x60);
        }
        uVar11 = *(undefined8 *)(lVar13 + 0x218);
        uVar18 = *(undefined8 *)(lVar13 + 0x220);
        lVar13 = *(long *)(unaff_x29 + -0xd0);
        if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
        }
        puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
        *puVar20 = uVar11;
        puVar20[1] = uVar18;
        *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
        if ((*(byte *)(lVar28 + lVar25 + 0x251) & 1) == 0) {
          if (*(int *)(lVar28 + lVar25 + 0x28) == 1) {
            uVar8 = *(ulong *)(lVar28 + lVar25 + 0x30);
          }
          else {
            uVar8 = 0;
          }
          if (uVar8 <= in_stack_00000028) {
            uVar8 = (ulong)in_stack_00000028;
          }
          in_stack_00000028 = (undefined8 *)uVar8;
        }
      }
    }
    goto LAB_00522068;
  }
  lVar27 = *(long *)(unaff_x19[3] + 0x88);
  lVar23 = *(long *)(unaff_x19[3] + 0x90);
  lVar10 = lVar27;
  while (lVar13 = lVar10, lVar13 != lVar27 + lVar23 * 600) {
    uVar8 = func_0x005175a8();
    lVar10 = lVar13 + 600;
    if ((uVar8 & 1) == 0) {
      if (*(long *)(lVar13 + 0xd8) == 0) {
        uVar26 = 0;
      }
      else {
        uVar26 = 0;
        lVar24 = *(long *)(lVar13 + 0xd0);
        lVar14 = *(long *)(lVar13 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(undefined8 **)(lVar24 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar24 + 0x18);
          uVar7 = func_0x005175a8();
          uVar26 = uVar7 | uVar26;
          lVar24 = lVar24 + 0x20;
          lVar14 = lVar14 + -0x20;
        } while (lVar14 != 0);
      }
      lVar24 = *(long *)(lVar13 + 0xe8);
      lVar14 = *(long *)(lVar13 + 0xf0) << 5;
      do {
        uVar7 = uVar4;
        if (lVar14 == 0) {
          if (*(long *)(lVar13 + 0xf0) != 0) {
            lVar24 = *(long *)(lVar13 + 0x108);
            if (lVar24 != 0) {
              uVar26 = 1;
              lVar14 = *(long *)(lVar13 + 0x120);
              goto joined_r0x00522584;
            }
            if (*(long *)(lVar13 + 0x120) == 0) goto joined_r0x00522590;
            lVar24 = 0;
            uVar26 = 1;
            lVar14 = *(long *)(lVar13 + 0x120);
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(undefined8 **)(lVar24 + 0x10);
        in_stack_000000e8 = *(undefined8 **)(lVar24 + 0x18);
        uVar8 = func_0x005175a8();
        lVar24 = lVar24 + 0x20;
        lVar14 = lVar14 + -0x20;
      } while ((uVar8 & 1) != 0);
      lVar24 = *(long *)(lVar13 + 0x108);
      if (lVar24 == 0) {
        if (*(long *)(lVar13 + 0x120) != 0) {
          lVar24 = 0;
          lVar14 = *(long *)(lVar13 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar14 = *(long *)(lVar13 + 0x120);
joined_r0x00522584:
        if (lVar14 != 0) {
          lVar14 = lVar14 << 4;
          do {
            if (lVar14 == 0) goto code_r0x0052253c;
            uVar8 = func_0x005175a8();
            lVar14 = lVar14 + -0x10;
          } while ((uVar8 & 1) != 0);
          lVar24 = *(long *)(lVar13 + 0x108);
        }
        lVar24 = lVar24 << 4;
        do {
          if (lVar24 == 0) goto joined_r0x00522590;
          uVar8 = func_0x005175a8();
          lVar24 = lVar24 + -0x10;
        } while ((uVar8 & 1) == 0);
      }
code_r0x0052253c:
      uVar7 = uVar4 & uVar26;
joined_r0x00522590:
      if (uVar7 != 0) {
        uVar11 = *(undefined8 *)(lVar13 + 0x218);
        uVar18 = *(undefined8 *)(lVar13 + 0x220);
        lVar24 = *(long *)(unaff_x29 + -0xd0);
        if (lVar24 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar24 * 0x10);
        *puVar20 = uVar11;
        puVar20[1] = uVar18;
        *(long *)(unaff_x29 + -0xd0) = lVar24 + 1;
        if ((*(byte *)(lVar13 + 0x251) & 1) == 0) {
          if (*(int *)(lVar13 + 0x28) == 1) {
            uVar8 = *(ulong *)(lVar13 + 0x30);
          }
          else {
            uVar8 = 0;
          }
          if (uVar8 <= in_stack_00000028) {
            uVar8 = (ulong)in_stack_00000028;
          }
          in_stack_00000028 = (undefined8 *)uVar8;
        }
      }
    }
  }
  lVar10 = unaff_x19[3];
  if ((((*(byte *)(lVar10 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar10 + 0x2c0) >> 4 & 1) == 0)) &&
     (lVar27 = *(long *)(lVar10 + 0x90), lVar27 != 0)) {
    lVar23 = 0;
    lVar24 = *(long *)(lVar10 + 0x88);
    lVar13 = *(long *)(lVar24 + 0x228);
    lVar10 = lVar24;
    while( true ) {
      if ((lVar13 == 0) && (*(int *)(lVar10 + 0x248) == 0x110000)) {
        iVar6 = func_0x005175a8();
        if ((iVar6 == 0) &&
           ((lVar10 = lVar24 + lVar23, *(int *)(lVar10 + 0x28) != 1 ||
            (*(ulong *)(lVar10 + 0x30) < in_stack_00000028)))) {
          uVar11 = *(undefined8 *)(lVar24 + lVar23 + 0x218);
          uVar18 = *(undefined8 *)(lVar10 + 0x220);
          lVar10 = *(long *)(unaff_x29 + -0xd0);
          if (lVar10 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar20 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar10 * 0x10);
          *puVar20 = uVar11;
          puVar20[1] = uVar18;
          *(long *)(unaff_x29 + -0xd0) = lVar10 + 1;
        }
      }
      if (lVar27 * 600 + -600 == lVar23) break;
      lVar23 = lVar23 + 600;
      lVar10 = lVar24 + lVar23;
      lVar13 = *(long *)(lVar10 + 0x228);
    }
  }
  lVar10 = *(long *)(unaff_x29 + -0xd0);
  if (lVar10 != 0) {
    lVar27 = 0;
    lVar23 = *(long *)(unaff_x29 + -0xe0);
    puVar20 = *(undefined8 **)(unaff_x29 + -0xd8);
    lVar24 = unaff_x19[3];
    lVar13 = *(long *)(lVar24 + 0xf0) << 4;
    uVar8 = 0xffffffffffffffff;
    plVar12 = *(long **)(lVar24 + 0xe8);
    do {
      if (lVar13 == 0) {
        puVar21 = (undefined *)0x0;
        goto LAB_00522a40;
      }
      lVar14 = *plVar12;
      plVar3 = plVar12 + 1;
      uVar8 = uVar8 + 1;
      lVar27 = lVar27 + 0x20;
      lVar13 = lVar13 + -0x10;
      plVar12 = plVar12 + 2;
    } while (lVar14 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
    if (uVar8 < *(ulong *)(lVar24 + 0x108)) {
      lVar27 = *(long *)(lVar24 + 0x100) + lVar27;
      lVar13 = *(long *)(lVar27 + -0x18);
      puVar21 = (undefined *)
                (*(long *)(lVar27 + -0x20) + (*(long *)(lVar13 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar29 = (**(code **)(lVar13 + 0x18))(puVar21);
      if (auVar29._0_8_ == 0x1414db8803bc16e0 && auVar29._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
        puVar2 = &UNK_008a7b62;
        if (puVar21 != (undefined *)0x0) {
          puVar2 = puVar21;
        }
        *(long *)(unaff_x29 + -200) = lVar24;
        *(undefined **)(unaff_x29 + -0xc0) = puVar2;
        *(long **)(unaff_x29 + -0xb8) = unaff_x19;
        func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar20,lVar10);
        puVar19 = uStack00000000000000e0;
        in_stack_000000f8 = in_stack_000000e8 + (long)in_stack_000000f0 * 3;
        uStack00000000000000e0 = in_stack_000000e8;
        in_stack_000000f0 = puVar19;
        func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
        in_stack_000000f8 = puVar20 + lVar10 * 2;
        in_stack_00000100 = in_stack_00000030;
        in_stack_00000108 = in_stack_00000050;
        in_stack_00000110 = in_stack_00000038;
        in_stack_00000118 = in_stack_00000058;
        uStack00000000000000e0 = puVar20;
        in_stack_000000e8 = puVar20;
        in_stack_000000f0 = (undefined8 *)lVar23;
        in_stack_00000120 = lVar24;
        func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
        *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
        *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
        *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
        uVar18 = *(undefined8 *)(unaff_x29 + -0x88);
        func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar18,
                        *(undefined8 *)(unaff_x29 + -0x80));
        uVar11 = func_0x0051c5b4(lVar24,unaff_x29 + -0x70,&uStack00000000000000e0);
        if (*(long *)(unaff_x29 + -0x90) != 0) {
          func_0x00187bd4(uVar18,*(long *)(unaff_x29 + -0x90) << 4,8);
        }
        goto joined_r0x00522908;
      }
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
    else {
      func_0x007a2570(uVar8,*(ulong *)(lVar24 + 0x108),&UNK_009e9b68);
    }
LAB_00523024:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x523028);
    (*pcVar5)();
  }
  if (*(long *)(unaff_x29 + -0xe0) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
  }
  uVar11 = 0;
joined_r0x00522908:
  if (uStack0000000000000060 != 0) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
  }
  lVar10 = in_stack_00000080;
  if (in_stack_00000088 != 0) {
    puVar20 = (undefined8 *)(in_stack_00000080 + 8);
    lVar27 = in_stack_00000088;
    do {
      if (puVar20[-1] != 0) {
        func_0x00187bd4(*puVar20,puVar20[-1] << 4,8);
      }
      puVar20 = puVar20 + 3;
      lVar27 = lVar27 + -1;
    } while (lVar27 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(lVar10,in_stack_00000078 * 0x18,8);
  }
  return uVar11;
}


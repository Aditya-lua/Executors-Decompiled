
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521d98(undefined8 param_1)

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
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long *plVar13;
  long *unaff_x19;
  long unaff_x21;
  long lVar14;
  long lVar15;
  long unaff_x22;
  long lVar16;
  long lVar17;
  undefined8 uVar18;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *puVar19;
  undefined *puVar20;
  long unaff_x25;
  long lVar21;
  undefined8 *puVar22;
  undefined8 unaff_x26;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  uint uVar28;
  undefined8 *unaff_x28;
  long lVar29;
  long lVar30;
  long unaff_x29;
  undefined1 auVar31 [16];
  long in_stack_00000018;
  ulong uStack0000000000000028;
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
  
code_r0x00521d98:
  iVar7 = _memcmp(param_1,unaff_x26,unaff_x25);
  if (iVar7 != 0) goto LAB_00521d7c;
  func_0x00505d80(&uStack00000000000000e0,unaff_x23,unaff_x22,unaff_x24);
  puVar22 = in_stack_000000e8;
  puVar19 = uStack00000000000000e0;
  if (in_stack_000000f0 != (undefined8 *)0x0) {
    puVar2 = in_stack_000000e8 + (long)in_stack_000000f0 * 2;
    lVar21 = unaff_x19[2];
    puVar11 = in_stack_000000e8;
    do {
      uVar12 = *puVar11;
      lVar23 = puVar11[1];
      lVar29 = unaff_x19[1];
      if (lVar21 != 0) {
        plVar13 = (long *)(lVar29 + 0x20);
        lVar25 = lVar21 * 0x28;
        do {
          if ((*plVar13 == lVar23) && (iVar7 = _memcmp(plVar13[-1],uVar12,lVar23), iVar7 == 0))
          goto LAB_00521dfc;
          plVar13 = plVar13 + 5;
          lVar25 = lVar25 + -0x28;
        } while (lVar25 != 0);
      }
      if (lVar21 == *unaff_x19) {
        func_0x0050c744();
        lVar29 = unaff_x19[1];
      }
      puVar10 = (undefined8 *)(lVar29 + lVar21 * 0x28);
      *puVar10 = 0;
      puVar10[1] = 8;
      puVar10[2] = 0;
      puVar10[3] = uVar12;
      puVar10[4] = lVar23;
      lVar21 = lVar21 + 1;
      unaff_x19[2] = lVar21;
LAB_00521dfc:
      puVar11 = puVar11 + 2;
    } while (puVar11 != puVar2);
  }
  lVar21 = in_stack_00000048;
  if (puVar19 != (undefined8 *)0x0) {
    func_0x00187bd4(puVar22,(long)puVar19 << 4,8);
  }
  do {
    in_stack_00000048 = lVar21;
    unaff_x28 = in_stack_00000040;
    if (unaff_x28 == in_stack_00000050) {
      *(undefined8 *)(unaff_x29 + -0xe0) = 0;
      *(undefined8 *)(unaff_x29 + -0xd8) = 8;
      *(undefined8 *)(unaff_x29 + -0xd0) = 0;
      if (in_stack_00000018 == 0) goto code_r0x00522048;
      lVar23 = unaff_x19[3];
      lVar21 = in_stack_00000038;
      puVar19 = in_stack_00000030;
      goto code_r0x00521fdc;
    }
    if (in_stack_00000048 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    in_stack_00000040 = unaff_x28 + 2;
    lVar21 = in_stack_00000048 + 0x68;
    if (*(char *)(in_stack_00000048 + 0x61) != '\0') {
      unaff_x23 = unaff_x19[3];
      if (*(long *)(unaff_x23 + 0x90) != 0) {
        unaff_x26 = *unaff_x28;
        unaff_x25 = unaff_x28[1];
        unaff_x24 = (undefined8 *)(*(long *)(unaff_x23 + 0x88) + 0x218);
        unaff_x21 = *(long *)(unaff_x23 + 0x90) * 600;
        unaff_x22 = in_stack_00000048;
        in_stack_00000048 = lVar21;
        do {
          if (unaff_x24[1] == unaff_x25) {
            param_1 = *unaff_x24;
            goto code_r0x00521d98;
          }
LAB_00521d7c:
          unaff_x24 = unaff_x24 + 0x4b;
          unaff_x21 = unaff_x21 + -600;
          lVar21 = in_stack_00000048;
        } while (unaff_x21 != 0);
      }
      in_stack_00000048 = lVar21;
      lVar21 = in_stack_00000048;
      if (*(long *)(unaff_x23 + 0xd8) != 0) {
        uVar12 = *unaff_x28;
        lVar23 = unaff_x28[1];
        plVar13 = (long *)(*(long *)(unaff_x23 + 0xd0) + 0x50);
        lVar29 = *(long *)(unaff_x23 + 0xd8) * 0x60;
        do {
          if ((*plVar13 == lVar23) && (iVar7 = _memcmp(plVar13[-1],uVar12,lVar23), iVar7 == 0)) {
            if (plVar13[-5] != 0) {
              puVar19 = (undefined8 *)plVar13[-6];
              puVar22 = puVar19 + plVar13[-5] * 2;
              lVar23 = unaff_x19[2];
              do {
                uVar12 = *puVar19;
                lVar29 = puVar19[1];
                lVar25 = unaff_x19[1];
                if (lVar23 != 0) {
                  plVar13 = (long *)(lVar25 + 0x20);
                  lVar26 = lVar23 * 0x28;
                  do {
                    if ((*plVar13 == lVar29) &&
                       (iVar7 = _memcmp(plVar13[-1],uVar12,lVar29), iVar7 == 0)) goto LAB_00521f04;
                    plVar13 = plVar13 + 5;
                    lVar26 = lVar26 + -0x28;
                  } while (lVar26 != 0);
                }
                if (lVar23 == *unaff_x19) {
                  func_0x0050c744();
                  lVar25 = unaff_x19[1];
                }
                puVar11 = (undefined8 *)(lVar25 + lVar23 * 0x28);
                *puVar11 = 0;
                puVar11[1] = 8;
                puVar11[2] = 0;
                puVar11[3] = uVar12;
                puVar11[4] = lVar29;
                lVar23 = lVar23 + 1;
                unaff_x19[2] = lVar23;
LAB_00521f04:
                puVar19 = puVar19 + 2;
              } while (puVar19 != puVar22);
            }
            break;
          }
          plVar13 = plVar13 + 0xc;
          lVar29 = lVar29 + -0x60;
        } while (lVar29 != 0);
      }
    }
  } while( true );
  while( true ) {
    uVar9 = func_0x005175a8();
    lVar25 = lVar25 + -0x10;
    if ((uVar9 & 1) != 0) break;
code_r0x005221a4:
    if (lVar25 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(puVar19,(long)uStack00000000000000e0 << 4,8);
      }
      uVar12 = *puVar22;
      uVar18 = puVar22[1];
      lVar25 = *(long *)(unaff_x29 + -0xd0);
      if (lVar25 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar19 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar25 * 0x10);
      *puVar19 = uVar12;
      puVar19[1] = uVar18;
      *(long *)(unaff_x29 + -0xd0) = lVar25 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
FUN_005221d4:
  func_0x00187bd4(puVar19,(long)uStack00000000000000e0 << 4,8);
  goto LAB_00522068;
joined_r0x00522118:
  in_stack_000000e8 = puVar19;
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
  goto FUN_005221d4;
code_r0x00521fdc:
  do {
    if (lVar21 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    if ((*(char *)(lVar21 + 0x61) != '\0') && (lVar29 = *(long *)(lVar23 + 0x90), lVar29 != 0)) {
      uVar12 = *puVar19;
      lVar25 = puVar19[1];
      puVar22 = (undefined8 *)(*(long *)(lVar23 + 0x88) + 0x218);
      lVar29 = lVar29 * 600;
      do {
        if ((puVar22[1] == lVar25) && (iVar7 = _memcmp(*puVar22,uVar12,lVar25), iVar7 == 0)) {
          if ((*(byte *)((long)puVar22 + 0x39) >> 6 & 1) != 0) {
            uVar5 = 0;
            goto code_r0x00522050;
          }
          break;
        }
        puVar22 = puVar22 + 0x4b;
        lVar29 = lVar29 + -600;
      } while (lVar29 != 0);
    }
    puVar19 = puVar19 + 2;
    lVar21 = lVar21 + 0x68;
  } while (puVar19 != in_stack_00000050);
code_r0x00522048:
  uVar5 = 1;
code_r0x00522050:
  uStack0000000000000028 = 0;
  lVar23 = unaff_x19[1];
  lVar29 = unaff_x19[2];
  lVar21 = lVar23;
LAB_00522068:
  lVar25 = lVar21;
  if (lVar25 != lVar23 + lVar29 * 0x28) {
    uVar9 = func_0x005175a8();
    lVar21 = lVar25 + 0x28;
    if ((uVar9 & 1) == 0) {
      lVar14 = unaff_x19[3];
      lVar26 = *(long *)(lVar14 + 0x90);
      if (lVar26 == 0) {
code_r0x00522128:
        if (*(long *)(lVar14 + 0xd8) != 0) {
          uVar12 = *(undefined8 *)(lVar25 + 0x18);
          lVar25 = *(long *)(lVar25 + 0x20);
          puVar22 = (undefined8 *)(*(long *)(lVar14 + 0xd0) + 0x48);
          lVar26 = *(long *)(lVar14 + 0xd8) * 0x60;
          do {
            if ((puVar22[1] == lVar25) && (iVar7 = _memcmp(*puVar22,uVar12,lVar25), iVar7 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar14,puVar22);
              puVar19 = in_stack_000000e8;
              lVar25 = (long)in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar22 = puVar22 + 0xc;
            lVar26 = lVar26 + -0x60;
          } while (lVar26 != 0);
        }
      }
      else {
        lVar27 = 0;
        lVar30 = *(long *)(lVar14 + 0x88);
        uVar12 = *(undefined8 *)(lVar25 + 0x18);
        lVar17 = *(long *)(lVar25 + 0x20);
        while ((*(long *)(lVar30 + lVar27 + 0x220) != lVar17 ||
               (iVar7 = _memcmp(*(undefined8 *)(lVar30 + lVar27 + 0x218),uVar12,lVar17), iVar7 != 0)
               )) {
          lVar27 = lVar27 + 600;
          if (lVar26 * 600 == lVar27) goto code_r0x00522128;
        }
        if (uVar5 == 0) goto LAB_00522068;
        lVar25 = lVar30 + lVar27;
        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,lVar25 + 0x218);
        puVar19 = in_stack_000000e8;
        if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
        if (uStack00000000000000e0 != (undefined8 *)0x0) {
          func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
        }
        lVar26 = *(long *)(lVar14 + 0xd8);
        if (lVar26 != 0) {
          uVar12 = *(undefined8 *)(lVar25 + 0x218);
          lVar24 = *(long *)(lVar25 + 0x220);
          lVar16 = *(long *)(lVar14 + 0xd0);
          lVar17 = lVar16;
          do {
            lVar1 = lVar17 + 0x60;
            if (*(long *)(lVar17 + 0x10) != 0) {
              plVar13 = (long *)(*(long *)(lVar17 + 8) + 8);
              lVar15 = *(long *)(lVar17 + 0x10) << 4;
              do {
                if ((*plVar13 == lVar24) && (iVar7 = _memcmp(plVar13[-1],uVar12,lVar24), iVar7 == 0)
                   ) {
                  uVar18 = *(undefined8 *)(lVar17 + 0x50);
                  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar17 + 0x48);
                  *(undefined8 *)(unaff_x29 + -0x68) = uVar18;
                  func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar14,
                                  unaff_x29 + -0x70);
                  puVar19 = in_stack_000000e8;
                  if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
                  if (uStack00000000000000e0 != (undefined8 *)0x0) {
                    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                  }
                  break;
                }
                plVar13 = plVar13 + 2;
                lVar15 = lVar15 + -0x10;
              } while (lVar15 != 0);
            }
            lVar17 = lVar1;
          } while (lVar1 != lVar16 + lVar26 * 0x60);
        }
        uVar12 = *(undefined8 *)(lVar25 + 0x218);
        uVar18 = *(undefined8 *)(lVar25 + 0x220);
        lVar25 = *(long *)(unaff_x29 + -0xd0);
        if (lVar25 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
        }
        puVar19 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar25 * 0x10);
        *puVar19 = uVar12;
        puVar19[1] = uVar18;
        *(long *)(unaff_x29 + -0xd0) = lVar25 + 1;
        if ((*(byte *)(lVar30 + lVar27 + 0x251) & 1) == 0) {
          if (*(int *)(lVar30 + lVar27 + 0x28) == 1) {
            uVar9 = *(ulong *)(lVar30 + lVar27 + 0x30);
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
    goto LAB_00522068;
  }
  lVar23 = *(long *)(unaff_x19[3] + 0x88);
  lVar29 = *(long *)(unaff_x19[3] + 0x90);
  lVar21 = lVar23;
  while (lVar25 = lVar21, lVar25 != lVar23 + lVar29 * 600) {
    uVar9 = func_0x005175a8();
    lVar21 = lVar25 + 600;
    if ((uVar9 & 1) == 0) {
      if (*(long *)(lVar25 + 0xd8) == 0) {
        uVar28 = 0;
      }
      else {
        uVar28 = 0;
        lVar26 = *(long *)(lVar25 + 0xd0);
        lVar14 = *(long *)(lVar25 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
          uVar8 = func_0x005175a8();
          uVar28 = uVar8 | uVar28;
          lVar26 = lVar26 + 0x20;
          lVar14 = lVar14 + -0x20;
        } while (lVar14 != 0);
      }
      lVar26 = *(long *)(lVar25 + 0xe8);
      lVar14 = *(long *)(lVar25 + 0xf0) << 5;
      do {
        uVar8 = uVar5;
        if (lVar14 == 0) {
          if (*(long *)(lVar25 + 0xf0) != 0) {
            lVar26 = *(long *)(lVar25 + 0x108);
            if (lVar26 != 0) {
              uVar28 = 1;
              lVar14 = *(long *)(lVar25 + 0x120);
              goto joined_r0x00522584;
            }
            if (*(long *)(lVar25 + 0x120) == 0) goto joined_r0x00522590;
            lVar26 = 0;
            uVar28 = 1;
            lVar14 = *(long *)(lVar25 + 0x120);
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
        in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
        uVar9 = func_0x005175a8();
        lVar26 = lVar26 + 0x20;
        lVar14 = lVar14 + -0x20;
      } while ((uVar9 & 1) != 0);
      lVar26 = *(long *)(lVar25 + 0x108);
      if (lVar26 == 0) {
        if (*(long *)(lVar25 + 0x120) != 0) {
          lVar26 = 0;
          lVar14 = *(long *)(lVar25 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar14 = *(long *)(lVar25 + 0x120);
joined_r0x00522584:
        if (lVar14 != 0) {
          lVar14 = lVar14 << 4;
          do {
            if (lVar14 == 0) goto code_r0x0052253c;
            uVar9 = func_0x005175a8();
            lVar14 = lVar14 + -0x10;
          } while ((uVar9 & 1) != 0);
          lVar26 = *(long *)(lVar25 + 0x108);
        }
        lVar26 = lVar26 << 4;
        do {
          if (lVar26 == 0) goto joined_r0x00522590;
          uVar9 = func_0x005175a8();
          lVar26 = lVar26 + -0x10;
        } while ((uVar9 & 1) == 0);
      }
code_r0x0052253c:
      uVar8 = uVar5 & uVar28;
joined_r0x00522590:
      if (uVar8 != 0) {
        uVar12 = *(undefined8 *)(lVar25 + 0x218);
        uVar18 = *(undefined8 *)(lVar25 + 0x220);
        lVar26 = *(long *)(unaff_x29 + -0xd0);
        if (lVar26 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar19 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar26 * 0x10);
        *puVar19 = uVar12;
        puVar19[1] = uVar18;
        *(long *)(unaff_x29 + -0xd0) = lVar26 + 1;
        if ((*(byte *)(lVar25 + 0x251) & 1) == 0) {
          if (*(int *)(lVar25 + 0x28) == 1) {
            uVar9 = *(ulong *)(lVar25 + 0x30);
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
  lVar21 = unaff_x19[3];
  if ((((*(byte *)(lVar21 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar21 + 0x2c0) >> 4 & 1) == 0)) &&
     (lVar23 = *(long *)(lVar21 + 0x90), lVar23 != 0)) {
    lVar29 = 0;
    lVar26 = *(long *)(lVar21 + 0x88);
    lVar25 = *(long *)(lVar26 + 0x228);
    lVar21 = lVar26;
    while( true ) {
      if ((lVar25 == 0) && (*(int *)(lVar21 + 0x248) == 0x110000)) {
        iVar7 = func_0x005175a8();
        if ((iVar7 == 0) &&
           ((lVar21 = lVar26 + lVar29, *(int *)(lVar21 + 0x28) != 1 ||
            (*(ulong *)(lVar21 + 0x30) < uStack0000000000000028)))) {
          uVar12 = *(undefined8 *)(lVar26 + lVar29 + 0x218);
          uVar18 = *(undefined8 *)(lVar21 + 0x220);
          lVar21 = *(long *)(unaff_x29 + -0xd0);
          if (lVar21 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar19 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar21 * 0x10);
          *puVar19 = uVar12;
          puVar19[1] = uVar18;
          *(long *)(unaff_x29 + -0xd0) = lVar21 + 1;
        }
      }
      if (lVar23 * 600 + -600 == lVar29) break;
      lVar29 = lVar29 + 600;
      lVar21 = lVar26 + lVar29;
      lVar25 = *(long *)(lVar21 + 0x228);
    }
  }
  lVar21 = *(long *)(unaff_x29 + -0xd0);
  if (lVar21 == 0) {
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
    }
    uVar12 = 0;
joined_r0x00522908:
    if (uStack0000000000000060 != 0) {
      func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
    }
    lVar21 = in_stack_00000080;
    if (in_stack_00000088 != 0) {
      puVar19 = (undefined8 *)(in_stack_00000080 + 8);
      lVar23 = in_stack_00000088;
      do {
        if (puVar19[-1] != 0) {
          func_0x00187bd4(*puVar19,puVar19[-1] << 4,8);
        }
        puVar19 = puVar19 + 3;
        lVar23 = lVar23 + -1;
      } while (lVar23 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(lVar21,in_stack_00000078 * 0x18,8);
    }
    return uVar12;
  }
  lVar23 = 0;
  lVar29 = *(long *)(unaff_x29 + -0xe0);
  puVar19 = *(undefined8 **)(unaff_x29 + -0xd8);
  lVar26 = unaff_x19[3];
  lVar25 = *(long *)(lVar26 + 0xf0) << 4;
  uVar9 = 0xffffffffffffffff;
  plVar13 = *(long **)(lVar26 + 0xe8);
  do {
    if (lVar25 == 0) {
      puVar20 = (undefined *)0x0;
      goto LAB_00522a40;
    }
    lVar14 = *plVar13;
    plVar4 = plVar13 + 1;
    uVar9 = uVar9 + 1;
    lVar23 = lVar23 + 0x20;
    lVar25 = lVar25 + -0x10;
    plVar13 = plVar13 + 2;
  } while (lVar14 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
  if (uVar9 < *(ulong *)(lVar26 + 0x108)) {
    lVar23 = *(long *)(lVar26 + 0x100) + lVar23;
    lVar25 = *(long *)(lVar23 + -0x18);
    puVar20 = (undefined *)
              (*(long *)(lVar23 + -0x20) + (*(long *)(lVar25 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar31 = (**(code **)(lVar25 + 0x18))(puVar20);
    if (auVar31._0_8_ == 0x1414db8803bc16e0 && auVar31._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
      puVar3 = &UNK_008a7b62;
      if (puVar20 != (undefined *)0x0) {
        puVar3 = puVar20;
      }
      *(long *)(unaff_x29 + -200) = lVar26;
      *(undefined **)(unaff_x29 + -0xc0) = puVar3;
      *(long **)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar19,lVar21);
      puVar22 = uStack00000000000000e0;
      in_stack_000000f8 = in_stack_000000e8 + (long)in_stack_000000f0 * 3;
      uStack00000000000000e0 = in_stack_000000e8;
      in_stack_000000f0 = puVar22;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      in_stack_000000f8 = puVar19 + lVar21 * 2;
      in_stack_00000100 = in_stack_00000030;
      in_stack_00000108 = in_stack_00000050;
      in_stack_00000110 = in_stack_00000038;
      in_stack_00000118 = in_stack_00000058;
      uStack00000000000000e0 = puVar19;
      in_stack_000000e8 = puVar19;
      in_stack_000000f0 = (undefined8 *)lVar29;
      in_stack_00000120 = lVar26;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar18 = *(undefined8 *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar18,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar12 = func_0x0051c5b4(lVar26,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        func_0x00187bd4(uVar18,*(long *)(unaff_x29 + -0x90) << 4,8);
      }
      goto joined_r0x00522908;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar9,*(ulong *)(lVar26 + 0x108),&UNK_009e9b68);
  }
LAB_00523024:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x523028);
  (*pcVar6)();
}


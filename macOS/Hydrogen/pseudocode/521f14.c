
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521f14(void)

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
  long lVar12;
  undefined8 uVar13;
  long *plVar14;
  long *unaff_x19;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined8 *puVar18;
  long unaff_x22;
  long lVar19;
  long lVar20;
  undefined8 uVar21;
  undefined8 unaff_x23;
  undefined8 *puVar22;
  undefined8 *unaff_x24;
  undefined *puVar23;
  undefined8 *unaff_x25;
  long unaff_x26;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  uint uVar28;
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
  
  do {
    lVar29 = unaff_x19[1];
    if (unaff_x26 != 0) {
      plVar14 = (long *)(lVar29 + 0x20);
      lVar26 = unaff_x26 * 0x28;
      do {
        if ((*plVar14 == unaff_x22) &&
           (iVar7 = _memcmp(plVar14[-1],unaff_x23,unaff_x22), iVar7 == 0)) goto LAB_00521f04;
        plVar14 = plVar14 + 5;
        lVar26 = lVar26 + -0x28;
      } while (lVar26 != 0);
    }
    if (unaff_x26 == *unaff_x19) {
      func_0x0050c744();
      lVar29 = unaff_x19[1];
    }
    puVar11 = (undefined8 *)(lVar29 + unaff_x26 * 0x28);
    *puVar11 = 0;
    puVar11[1] = 8;
    puVar11[2] = 0;
    puVar11[3] = unaff_x23;
    puVar11[4] = unaff_x22;
    unaff_x26 = unaff_x26 + 1;
    unaff_x19[2] = unaff_x26;
LAB_00521f04:
    unaff_x24 = unaff_x24 + 2;
    if (unaff_x24 == unaff_x25) {
      lVar29 = in_stack_00000048;
      do {
        in_stack_00000048 = lVar29;
        puVar11 = in_stack_00000040;
        if (puVar11 == in_stack_00000050) {
          *(undefined8 *)(unaff_x29 + -0xe0) = 0;
          *(undefined8 *)(unaff_x29 + -0xd8) = 8;
          *(undefined8 *)(unaff_x29 + -0xd0) = 0;
          if (in_stack_00000018 == 0) goto code_r0x00522048;
          lVar26 = unaff_x19[3];
          lVar29 = in_stack_00000038;
          puVar11 = in_stack_00000030;
          goto code_r0x00521fdc;
        }
        if (in_stack_00000048 == in_stack_00000058) {
          func_0x007a23bc(&UNK_009e9bf8);
          goto LAB_00523024;
        }
        in_stack_00000040 = puVar11 + 2;
        lVar29 = in_stack_00000048 + 0x68;
        if (*(char *)(in_stack_00000048 + 0x61) != '\0') {
          lVar26 = unaff_x19[3];
          if (*(long *)(lVar26 + 0x90) == 0) {
code_r0x00521e78:
            if (*(long *)(lVar26 + 0xd8) != 0) {
              uVar13 = *puVar11;
              lVar12 = puVar11[1];
              plVar14 = (long *)(*(long *)(lVar26 + 0xd0) + 0x50);
              lVar26 = *(long *)(lVar26 + 0xd8) * 0x60;
              do {
                if ((*plVar14 == lVar12) && (iVar7 = _memcmp(plVar14[-1],uVar13,lVar12), iVar7 == 0)
                   ) {
                  if (plVar14[-5] != 0) {
                    unaff_x24 = (undefined8 *)plVar14[-6];
                    unaff_x25 = unaff_x24 + plVar14[-5] * 2;
                    unaff_x26 = unaff_x19[2];
                    in_stack_00000048 = lVar29;
                    goto code_r0x00521f10;
                  }
                  break;
                }
                plVar14 = plVar14 + 0xc;
                lVar26 = lVar26 + -0x60;
              } while (lVar26 != 0);
            }
          }
          else {
            uVar13 = *puVar11;
            lVar12 = puVar11[1];
            puVar22 = (undefined8 *)(*(long *)(lVar26 + 0x88) + 0x218);
            lVar15 = *(long *)(lVar26 + 0x90) * 600;
            while ((puVar22[1] != lVar12 || (iVar7 = _memcmp(*puVar22,uVar13,lVar12), iVar7 != 0)))
            {
              puVar22 = puVar22 + 0x4b;
              lVar15 = lVar15 + -600;
              if (lVar15 == 0) goto code_r0x00521e78;
            }
            func_0x00505d80(&uStack00000000000000e0,lVar26,in_stack_00000048,puVar22);
            puVar22 = in_stack_000000e8;
            puVar11 = uStack00000000000000e0;
            if (in_stack_000000f0 != (undefined8 *)0x0) {
              puVar2 = in_stack_000000e8 + (long)in_stack_000000f0 * 2;
              lVar26 = unaff_x19[2];
              puVar18 = in_stack_000000e8;
              do {
                uVar13 = *puVar18;
                lVar12 = puVar18[1];
                lVar15 = unaff_x19[1];
                if (lVar26 != 0) {
                  plVar14 = (long *)(lVar15 + 0x20);
                  lVar25 = lVar26 * 0x28;
                  do {
                    if ((*plVar14 == lVar12) &&
                       (iVar7 = _memcmp(plVar14[-1],uVar13,lVar12), iVar7 == 0))
                    goto code_r0x00521dfc;
                    plVar14 = plVar14 + 5;
                    lVar25 = lVar25 + -0x28;
                  } while (lVar25 != 0);
                }
                if (lVar26 == *unaff_x19) {
                  func_0x0050c744();
                  lVar15 = unaff_x19[1];
                }
                puVar10 = (undefined8 *)(lVar15 + lVar26 * 0x28);
                *puVar10 = 0;
                puVar10[1] = 8;
                puVar10[2] = 0;
                puVar10[3] = uVar13;
                puVar10[4] = lVar12;
                lVar26 = lVar26 + 1;
                unaff_x19[2] = lVar26;
code_r0x00521dfc:
                puVar18 = puVar18 + 2;
              } while (puVar18 != puVar2);
            }
            if (puVar11 != (undefined8 *)0x0) {
              func_0x00187bd4(puVar22,(long)puVar11 << 4,8);
            }
          }
        }
      } while( true );
    }
code_r0x00521f10:
    unaff_x23 = *unaff_x24;
    unaff_x22 = unaff_x24[1];
  } while( true );
  while( true ) {
    uVar9 = func_0x005175a8();
    lVar15 = lVar15 + -0x10;
    if ((uVar9 & 1) != 0) break;
code_r0x005221a4:
    if (lVar15 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(puVar11,(long)uStack00000000000000e0 << 4,8);
      }
      uVar13 = *puVar22;
      uVar21 = puVar22[1];
      lVar15 = *(long *)(unaff_x29 + -0xd0);
      if (lVar15 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar11 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar15 * 0x10);
      *puVar11 = uVar13;
      puVar11[1] = uVar21;
      *(long *)(unaff_x29 + -0xd0) = lVar15 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
FUN_005221d4:
  func_0x00187bd4(puVar11,(long)uStack00000000000000e0 << 4,8);
  goto LAB_00522068;
joined_r0x00522118:
  in_stack_000000e8 = puVar11;
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
  goto FUN_005221d4;
code_r0x00521fdc:
  do {
    if (lVar29 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    if ((*(char *)(lVar29 + 0x61) != '\0') && (lVar12 = *(long *)(lVar26 + 0x90), lVar12 != 0)) {
      uVar13 = *puVar11;
      lVar15 = puVar11[1];
      puVar22 = (undefined8 *)(*(long *)(lVar26 + 0x88) + 0x218);
      lVar12 = lVar12 * 600;
      do {
        if ((puVar22[1] == lVar15) && (iVar7 = _memcmp(*puVar22,uVar13,lVar15), iVar7 == 0)) {
          if ((*(byte *)((long)puVar22 + 0x39) >> 6 & 1) != 0) {
            uVar5 = 0;
            goto code_r0x00522050;
          }
          break;
        }
        puVar22 = puVar22 + 0x4b;
        lVar12 = lVar12 + -600;
      } while (lVar12 != 0);
    }
    puVar11 = puVar11 + 2;
    lVar29 = lVar29 + 0x68;
  } while (puVar11 != in_stack_00000050);
code_r0x00522048:
  uVar5 = 1;
code_r0x00522050:
  uStack0000000000000028 = 0;
  lVar26 = unaff_x19[1];
  lVar12 = unaff_x19[2];
  lVar29 = lVar26;
LAB_00522068:
  lVar15 = lVar29;
  if (lVar15 != lVar26 + lVar12 * 0x28) {
    uVar9 = func_0x005175a8();
    lVar29 = lVar15 + 0x28;
    if ((uVar9 & 1) == 0) {
      lVar16 = unaff_x19[3];
      lVar25 = *(long *)(lVar16 + 0x90);
      if (lVar25 == 0) {
code_r0x00522128:
        if (*(long *)(lVar16 + 0xd8) != 0) {
          uVar13 = *(undefined8 *)(lVar15 + 0x18);
          lVar15 = *(long *)(lVar15 + 0x20);
          puVar22 = (undefined8 *)(*(long *)(lVar16 + 0xd0) + 0x48);
          lVar25 = *(long *)(lVar16 + 0xd8) * 0x60;
          do {
            if ((puVar22[1] == lVar15) && (iVar7 = _memcmp(*puVar22,uVar13,lVar15), iVar7 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar16,puVar22);
              puVar11 = in_stack_000000e8;
              lVar15 = (long)in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar22 = puVar22 + 0xc;
            lVar25 = lVar25 + -0x60;
          } while (lVar25 != 0);
        }
      }
      else {
        lVar27 = 0;
        lVar30 = *(long *)(lVar16 + 0x88);
        uVar13 = *(undefined8 *)(lVar15 + 0x18);
        lVar20 = *(long *)(lVar15 + 0x20);
        while ((*(long *)(lVar30 + lVar27 + 0x220) != lVar20 ||
               (iVar7 = _memcmp(*(undefined8 *)(lVar30 + lVar27 + 0x218),uVar13,lVar20), iVar7 != 0)
               )) {
          lVar27 = lVar27 + 600;
          if (lVar25 * 600 == lVar27) goto code_r0x00522128;
        }
        if (uVar5 == 0) goto LAB_00522068;
        lVar15 = lVar30 + lVar27;
        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar16,lVar15 + 0x218);
        puVar11 = in_stack_000000e8;
        if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
        if (uStack00000000000000e0 != (undefined8 *)0x0) {
          func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
        }
        lVar25 = *(long *)(lVar16 + 0xd8);
        if (lVar25 != 0) {
          uVar13 = *(undefined8 *)(lVar15 + 0x218);
          lVar24 = *(long *)(lVar15 + 0x220);
          lVar19 = *(long *)(lVar16 + 0xd0);
          lVar20 = lVar19;
          do {
            lVar1 = lVar20 + 0x60;
            if (*(long *)(lVar20 + 0x10) != 0) {
              plVar14 = (long *)(*(long *)(lVar20 + 8) + 8);
              lVar17 = *(long *)(lVar20 + 0x10) << 4;
              do {
                if ((*plVar14 == lVar24) && (iVar7 = _memcmp(plVar14[-1],uVar13,lVar24), iVar7 == 0)
                   ) {
                  uVar21 = *(undefined8 *)(lVar20 + 0x50);
                  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar20 + 0x48);
                  *(undefined8 *)(unaff_x29 + -0x68) = uVar21;
                  func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar16,
                                  unaff_x29 + -0x70);
                  puVar11 = in_stack_000000e8;
                  if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
                  if (uStack00000000000000e0 != (undefined8 *)0x0) {
                    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                  }
                  break;
                }
                plVar14 = plVar14 + 2;
                lVar17 = lVar17 + -0x10;
              } while (lVar17 != 0);
            }
            lVar20 = lVar1;
          } while (lVar1 != lVar19 + lVar25 * 0x60);
        }
        uVar13 = *(undefined8 *)(lVar15 + 0x218);
        uVar21 = *(undefined8 *)(lVar15 + 0x220);
        lVar15 = *(long *)(unaff_x29 + -0xd0);
        if (lVar15 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
        }
        puVar11 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar15 * 0x10);
        *puVar11 = uVar13;
        puVar11[1] = uVar21;
        *(long *)(unaff_x29 + -0xd0) = lVar15 + 1;
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
  lVar26 = *(long *)(unaff_x19[3] + 0x88);
  lVar12 = *(long *)(unaff_x19[3] + 0x90);
  lVar29 = lVar26;
  while (lVar15 = lVar29, lVar15 != lVar26 + lVar12 * 600) {
    uVar9 = func_0x005175a8();
    lVar29 = lVar15 + 600;
    if ((uVar9 & 1) == 0) {
      if (*(long *)(lVar15 + 0xd8) == 0) {
        uVar28 = 0;
      }
      else {
        uVar28 = 0;
        lVar25 = *(long *)(lVar15 + 0xd0);
        lVar16 = *(long *)(lVar15 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(undefined8 **)(lVar25 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar25 + 0x18);
          uVar8 = func_0x005175a8();
          uVar28 = uVar8 | uVar28;
          lVar25 = lVar25 + 0x20;
          lVar16 = lVar16 + -0x20;
        } while (lVar16 != 0);
      }
      lVar25 = *(long *)(lVar15 + 0xe8);
      lVar16 = *(long *)(lVar15 + 0xf0) << 5;
      do {
        uVar8 = uVar5;
        if (lVar16 == 0) {
          if (*(long *)(lVar15 + 0xf0) != 0) {
            lVar25 = *(long *)(lVar15 + 0x108);
            if (lVar25 != 0) {
              uVar28 = 1;
              lVar16 = *(long *)(lVar15 + 0x120);
              goto joined_r0x00522584;
            }
            if (*(long *)(lVar15 + 0x120) == 0) goto joined_r0x00522590;
            lVar25 = 0;
            uVar28 = 1;
            lVar16 = *(long *)(lVar15 + 0x120);
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(undefined8 **)(lVar25 + 0x10);
        in_stack_000000e8 = *(undefined8 **)(lVar25 + 0x18);
        uVar9 = func_0x005175a8();
        lVar25 = lVar25 + 0x20;
        lVar16 = lVar16 + -0x20;
      } while ((uVar9 & 1) != 0);
      lVar25 = *(long *)(lVar15 + 0x108);
      if (lVar25 == 0) {
        if (*(long *)(lVar15 + 0x120) != 0) {
          lVar25 = 0;
          lVar16 = *(long *)(lVar15 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar16 = *(long *)(lVar15 + 0x120);
joined_r0x00522584:
        if (lVar16 != 0) {
          lVar16 = lVar16 << 4;
          do {
            if (lVar16 == 0) goto code_r0x0052253c;
            uVar9 = func_0x005175a8();
            lVar16 = lVar16 + -0x10;
          } while ((uVar9 & 1) != 0);
          lVar25 = *(long *)(lVar15 + 0x108);
        }
        lVar25 = lVar25 << 4;
        do {
          if (lVar25 == 0) goto joined_r0x00522590;
          uVar9 = func_0x005175a8();
          lVar25 = lVar25 + -0x10;
        } while ((uVar9 & 1) == 0);
      }
code_r0x0052253c:
      uVar8 = uVar5 & uVar28;
joined_r0x00522590:
      if (uVar8 != 0) {
        uVar13 = *(undefined8 *)(lVar15 + 0x218);
        uVar21 = *(undefined8 *)(lVar15 + 0x220);
        lVar25 = *(long *)(unaff_x29 + -0xd0);
        if (lVar25 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar11 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar25 * 0x10);
        *puVar11 = uVar13;
        puVar11[1] = uVar21;
        *(long *)(unaff_x29 + -0xd0) = lVar25 + 1;
        if ((*(byte *)(lVar15 + 0x251) & 1) == 0) {
          if (*(int *)(lVar15 + 0x28) == 1) {
            uVar9 = *(ulong *)(lVar15 + 0x30);
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
  lVar29 = unaff_x19[3];
  if ((((*(byte *)(lVar29 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar29 + 0x2c0) >> 4 & 1) == 0)) &&
     (lVar26 = *(long *)(lVar29 + 0x90), lVar26 != 0)) {
    lVar12 = 0;
    lVar25 = *(long *)(lVar29 + 0x88);
    lVar15 = *(long *)(lVar25 + 0x228);
    lVar29 = lVar25;
    while( true ) {
      if ((lVar15 == 0) && (*(int *)(lVar29 + 0x248) == 0x110000)) {
        iVar7 = func_0x005175a8();
        if ((iVar7 == 0) &&
           ((lVar29 = lVar25 + lVar12, *(int *)(lVar29 + 0x28) != 1 ||
            (*(ulong *)(lVar29 + 0x30) < uStack0000000000000028)))) {
          uVar13 = *(undefined8 *)(lVar25 + lVar12 + 0x218);
          uVar21 = *(undefined8 *)(lVar29 + 0x220);
          lVar29 = *(long *)(unaff_x29 + -0xd0);
          if (lVar29 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar11 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar29 * 0x10);
          *puVar11 = uVar13;
          puVar11[1] = uVar21;
          *(long *)(unaff_x29 + -0xd0) = lVar29 + 1;
        }
      }
      if (lVar26 * 600 + -600 == lVar12) break;
      lVar12 = lVar12 + 600;
      lVar29 = lVar25 + lVar12;
      lVar15 = *(long *)(lVar29 + 0x228);
    }
  }
  lVar29 = *(long *)(unaff_x29 + -0xd0);
  if (lVar29 == 0) {
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
    }
    uVar13 = 0;
joined_r0x00522908:
    if (uStack0000000000000060 != 0) {
      func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
    }
    lVar29 = in_stack_00000080;
    if (in_stack_00000088 != 0) {
      puVar11 = (undefined8 *)(in_stack_00000080 + 8);
      lVar26 = in_stack_00000088;
      do {
        if (puVar11[-1] != 0) {
          func_0x00187bd4(*puVar11,puVar11[-1] << 4,8);
        }
        puVar11 = puVar11 + 3;
        lVar26 = lVar26 + -1;
      } while (lVar26 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(lVar29,in_stack_00000078 * 0x18,8);
    }
    return uVar13;
  }
  lVar26 = 0;
  lVar12 = *(long *)(unaff_x29 + -0xe0);
  puVar11 = *(undefined8 **)(unaff_x29 + -0xd8);
  lVar25 = unaff_x19[3];
  lVar15 = *(long *)(lVar25 + 0xf0) << 4;
  uVar9 = 0xffffffffffffffff;
  plVar14 = *(long **)(lVar25 + 0xe8);
  do {
    if (lVar15 == 0) {
      puVar23 = (undefined *)0x0;
      goto LAB_00522a40;
    }
    lVar16 = *plVar14;
    plVar4 = plVar14 + 1;
    uVar9 = uVar9 + 1;
    lVar26 = lVar26 + 0x20;
    lVar15 = lVar15 + -0x10;
    plVar14 = plVar14 + 2;
  } while (lVar16 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
  if (uVar9 < *(ulong *)(lVar25 + 0x108)) {
    lVar26 = *(long *)(lVar25 + 0x100) + lVar26;
    lVar15 = *(long *)(lVar26 + -0x18);
    puVar23 = (undefined *)
              (*(long *)(lVar26 + -0x20) + (*(long *)(lVar15 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar31 = (**(code **)(lVar15 + 0x18))(puVar23);
    if (auVar31._0_8_ == 0x1414db8803bc16e0 && auVar31._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
      puVar3 = &UNK_008a7b62;
      if (puVar23 != (undefined *)0x0) {
        puVar3 = puVar23;
      }
      *(long *)(unaff_x29 + -200) = lVar25;
      *(undefined **)(unaff_x29 + -0xc0) = puVar3;
      *(long **)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar11,lVar29);
      puVar22 = uStack00000000000000e0;
      in_stack_000000f8 = in_stack_000000e8 + (long)in_stack_000000f0 * 3;
      uStack00000000000000e0 = in_stack_000000e8;
      in_stack_000000f0 = puVar22;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      in_stack_000000f8 = puVar11 + lVar29 * 2;
      in_stack_00000100 = in_stack_00000030;
      in_stack_00000108 = in_stack_00000050;
      in_stack_00000110 = in_stack_00000038;
      in_stack_00000118 = in_stack_00000058;
      uStack00000000000000e0 = puVar11;
      in_stack_000000e8 = puVar11;
      in_stack_000000f0 = (undefined8 *)lVar12;
      in_stack_00000120 = lVar25;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar21 = *(undefined8 *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar21,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar13 = func_0x0051c5b4(lVar25,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        func_0x00187bd4(uVar21,*(long *)(unaff_x29 + -0x90) << 4,8);
      }
      goto joined_r0x00522908;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar9,*(ulong *)(lVar25 + 0x108),&UNK_009e9b68);
  }
LAB_00523024:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x523028);
  (*pcVar6)();
}


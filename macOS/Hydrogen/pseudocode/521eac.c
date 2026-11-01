
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00521eac(void)

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
  long lVar13;
  undefined8 uVar14;
  long *plVar15;
  long *unaff_x19;
  long unaff_x21;
  long lVar16;
  long lVar17;
  long unaff_x22;
  long lVar18;
  long lVar19;
  undefined8 uVar20;
  undefined8 unaff_x23;
  undefined8 *puVar21;
  long *unaff_x24;
  undefined8 *puVar22;
  undefined *puVar23;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
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
  
code_r0x00521eac:
  lVar13 = in_stack_00000048;
  if ((*unaff_x24 != unaff_x22) || (iVar7 = _memcmp(unaff_x24[-1],unaff_x23,unaff_x22), iVar7 != 0))
  goto LAB_00521ea0;
  if (unaff_x24[-5] != 0) {
    puVar22 = (undefined8 *)unaff_x24[-6];
    puVar21 = puVar22 + unaff_x24[-5] * 2;
    lVar24 = unaff_x19[2];
    do {
      uVar14 = *puVar22;
      lVar12 = puVar22[1];
      lVar29 = unaff_x19[1];
      if (lVar24 != 0) {
        plVar15 = (long *)(lVar29 + 0x20);
        lVar26 = lVar24 * 0x28;
        do {
          if ((*plVar15 == lVar12) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar12), iVar7 == 0))
          goto LAB_00521f04;
          plVar15 = plVar15 + 5;
          lVar26 = lVar26 + -0x28;
        } while (lVar26 != 0);
      }
      if (lVar24 == *unaff_x19) {
        func_0x0050c744();
        lVar29 = unaff_x19[1];
      }
      puVar11 = (undefined8 *)(lVar29 + lVar24 * 0x28);
      *puVar11 = 0;
      puVar11[1] = 8;
      puVar11[2] = 0;
      puVar11[3] = uVar14;
      puVar11[4] = lVar12;
      lVar24 = lVar24 + 1;
      unaff_x19[2] = lVar24;
LAB_00521f04:
      puVar22 = puVar22 + 2;
    } while (puVar22 != puVar21);
    unaff_x25 = in_stack_00000050;
    unaff_x26 = in_stack_00000040;
  }
  goto LAB_00521d24;
LAB_00521ea0:
  unaff_x24 = unaff_x24 + 0xc;
  unaff_x21 = unaff_x21 + -0x60;
  if (unaff_x21 == 0) {
LAB_00521d24:
    do {
      while( true ) {
        do {
          in_stack_00000048 = lVar13;
          puVar22 = unaff_x26;
          if (puVar22 == unaff_x25) {
            *(undefined8 *)(unaff_x29 + -0xe0) = 0;
            *(undefined8 *)(unaff_x29 + -0xd8) = 8;
            *(undefined8 *)(unaff_x29 + -0xd0) = 0;
            if (in_stack_00000018 == 0) goto code_r0x00522048;
            lVar24 = unaff_x19[3];
            lVar13 = in_stack_00000038;
            puVar22 = in_stack_00000030;
            goto code_r0x00521fdc;
          }
          if (in_stack_00000048 == in_stack_00000058) {
            func_0x007a23bc(&UNK_009e9bf8);
            goto LAB_00523024;
          }
          unaff_x26 = puVar22 + 2;
          lVar13 = in_stack_00000048 + 0x68;
        } while (*(char *)(in_stack_00000048 + 0x61) == '\0');
        lVar24 = unaff_x19[3];
        if (*(long *)(lVar24 + 0x90) == 0) break;
        uVar14 = *puVar22;
        lVar12 = puVar22[1];
        puVar21 = (undefined8 *)(*(long *)(lVar24 + 0x88) + 0x218);
        lVar29 = *(long *)(lVar24 + 0x90) * 600;
        while ((puVar21[1] != lVar12 || (iVar7 = _memcmp(*puVar21,uVar14,lVar12), iVar7 != 0))) {
          puVar21 = puVar21 + 0x4b;
          lVar29 = lVar29 + -600;
          if (lVar29 == 0) goto code_r0x00521e78;
        }
        func_0x00505d80(&uStack00000000000000e0,lVar24,in_stack_00000048,puVar21);
        puVar21 = in_stack_000000e8;
        puVar22 = uStack00000000000000e0;
        if (in_stack_000000f0 != (undefined8 *)0x0) {
          puVar2 = in_stack_000000e8 + (long)in_stack_000000f0 * 2;
          lVar24 = unaff_x19[2];
          puVar11 = in_stack_000000e8;
          do {
            uVar14 = *puVar11;
            lVar12 = puVar11[1];
            lVar29 = unaff_x19[1];
            if (lVar24 != 0) {
              plVar15 = (long *)(lVar29 + 0x20);
              lVar26 = lVar24 * 0x28;
              do {
                if ((*plVar15 == lVar12) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar12), iVar7 == 0)
                   ) goto code_r0x00521dfc;
                plVar15 = plVar15 + 5;
                lVar26 = lVar26 + -0x28;
              } while (lVar26 != 0);
            }
            if (lVar24 == *unaff_x19) {
              func_0x0050c744();
              lVar29 = unaff_x19[1];
            }
            puVar10 = (undefined8 *)(lVar29 + lVar24 * 0x28);
            *puVar10 = 0;
            puVar10[1] = 8;
            puVar10[2] = 0;
            puVar10[3] = uVar14;
            puVar10[4] = lVar12;
            lVar24 = lVar24 + 1;
            unaff_x19[2] = lVar24;
code_r0x00521dfc:
            puVar11 = puVar11 + 2;
          } while (puVar11 != puVar2);
        }
        unaff_x25 = in_stack_00000050;
        if (puVar22 != (undefined8 *)0x0) {
          func_0x00187bd4(puVar21,(long)puVar22 << 4,8);
        }
      }
code_r0x00521e78:
      unaff_x25 = in_stack_00000050;
    } while (*(long *)(lVar24 + 0xd8) == 0);
    unaff_x23 = *puVar22;
    unaff_x22 = puVar22[1];
    unaff_x24 = (long *)(*(long *)(lVar24 + 0xd0) + 0x50);
    unaff_x21 = *(long *)(lVar24 + 0xd8) * 0x60;
    in_stack_00000040 = unaff_x26;
    in_stack_00000048 = lVar13;
  }
  goto code_r0x00521eac;
  while( true ) {
    uVar9 = func_0x005175a8();
    lVar29 = lVar29 + -0x10;
    if ((uVar9 & 1) != 0) break;
code_r0x005221a4:
    if (lVar29 == 0) {
      if (uStack00000000000000e0 != (undefined8 *)0x0) {
        func_0x00187bd4(puVar22,(long)uStack00000000000000e0 << 4,8);
      }
      uVar14 = *puVar21;
      uVar20 = puVar21[1];
      lVar29 = *(long *)(unaff_x29 + -0xd0);
      if (lVar29 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar22 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar29 * 0x10);
      *puVar22 = uVar14;
      puVar22[1] = uVar20;
      *(long *)(unaff_x29 + -0xd0) = lVar29 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
FUN_005221d4:
  func_0x00187bd4(puVar22,(long)uStack00000000000000e0 << 4,8);
  goto LAB_00522068;
joined_r0x00522118:
  in_stack_000000e8 = puVar22;
  if (uStack00000000000000e0 == (undefined8 *)0x0) goto LAB_00522068;
  goto FUN_005221d4;
code_r0x00521fdc:
  do {
    if (lVar13 == in_stack_00000058) {
      func_0x007a23bc(&UNK_009e9bf8);
      goto LAB_00523024;
    }
    if ((*(char *)(lVar13 + 0x61) != '\0') && (lVar12 = *(long *)(lVar24 + 0x90), lVar12 != 0)) {
      uVar14 = *puVar22;
      lVar29 = puVar22[1];
      puVar21 = (undefined8 *)(*(long *)(lVar24 + 0x88) + 0x218);
      lVar12 = lVar12 * 600;
      do {
        if ((puVar21[1] == lVar29) && (iVar7 = _memcmp(*puVar21,uVar14,lVar29), iVar7 == 0)) {
          if ((*(byte *)((long)puVar21 + 0x39) >> 6 & 1) != 0) {
            uVar5 = 0;
            goto code_r0x00522050;
          }
          break;
        }
        puVar21 = puVar21 + 0x4b;
        lVar12 = lVar12 + -600;
      } while (lVar12 != 0);
    }
    puVar22 = puVar22 + 2;
    lVar13 = lVar13 + 0x68;
  } while (puVar22 != in_stack_00000050);
code_r0x00522048:
  uVar5 = 1;
code_r0x00522050:
  uStack0000000000000028 = 0;
  lVar24 = unaff_x19[1];
  lVar12 = unaff_x19[2];
  lVar13 = lVar24;
LAB_00522068:
  lVar29 = lVar13;
  if (lVar29 != lVar24 + lVar12 * 0x28) {
    uVar9 = func_0x005175a8();
    lVar13 = lVar29 + 0x28;
    if ((uVar9 & 1) == 0) {
      lVar16 = unaff_x19[3];
      lVar26 = *(long *)(lVar16 + 0x90);
      if (lVar26 == 0) {
code_r0x00522128:
        if (*(long *)(lVar16 + 0xd8) != 0) {
          uVar14 = *(undefined8 *)(lVar29 + 0x18);
          lVar29 = *(long *)(lVar29 + 0x20);
          puVar21 = (undefined8 *)(*(long *)(lVar16 + 0xd0) + 0x48);
          lVar26 = *(long *)(lVar16 + 0xd8) * 0x60;
          do {
            if ((puVar21[1] == lVar29) && (iVar7 = _memcmp(*puVar21,uVar14,lVar29), iVar7 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar16,puVar21);
              puVar22 = in_stack_000000e8;
              lVar29 = (long)in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar21 = puVar21 + 0xc;
            lVar26 = lVar26 + -0x60;
          } while (lVar26 != 0);
        }
      }
      else {
        lVar27 = 0;
        lVar30 = *(long *)(lVar16 + 0x88);
        uVar14 = *(undefined8 *)(lVar29 + 0x18);
        lVar19 = *(long *)(lVar29 + 0x20);
        while ((*(long *)(lVar30 + lVar27 + 0x220) != lVar19 ||
               (iVar7 = _memcmp(*(undefined8 *)(lVar30 + lVar27 + 0x218),uVar14,lVar19), iVar7 != 0)
               )) {
          lVar27 = lVar27 + 600;
          if (lVar26 * 600 == lVar27) goto code_r0x00522128;
        }
        if (uVar5 == 0) goto LAB_00522068;
        lVar29 = lVar30 + lVar27;
        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar16,lVar29 + 0x218);
        puVar22 = in_stack_000000e8;
        if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
        if (uStack00000000000000e0 != (undefined8 *)0x0) {
          func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
        }
        lVar26 = *(long *)(lVar16 + 0xd8);
        if (lVar26 != 0) {
          uVar14 = *(undefined8 *)(lVar29 + 0x218);
          lVar25 = *(long *)(lVar29 + 0x220);
          lVar18 = *(long *)(lVar16 + 0xd0);
          lVar19 = lVar18;
          do {
            lVar1 = lVar19 + 0x60;
            if (*(long *)(lVar19 + 0x10) != 0) {
              plVar15 = (long *)(*(long *)(lVar19 + 8) + 8);
              lVar17 = *(long *)(lVar19 + 0x10) << 4;
              do {
                if ((*plVar15 == lVar25) && (iVar7 = _memcmp(plVar15[-1],uVar14,lVar25), iVar7 == 0)
                   ) {
                  uVar20 = *(undefined8 *)(lVar19 + 0x50);
                  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar19 + 0x48);
                  *(undefined8 *)(unaff_x29 + -0x68) = uVar20;
                  func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar16,
                                  unaff_x29 + -0x70);
                  puVar22 = in_stack_000000e8;
                  if (in_stack_000000f0 != (undefined8 *)0x0) goto joined_r0x00522118;
                  if (uStack00000000000000e0 != (undefined8 *)0x0) {
                    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 << 4,8);
                  }
                  break;
                }
                plVar15 = plVar15 + 2;
                lVar17 = lVar17 + -0x10;
              } while (lVar17 != 0);
            }
            lVar19 = lVar1;
          } while (lVar1 != lVar18 + lVar26 * 0x60);
        }
        uVar14 = *(undefined8 *)(lVar29 + 0x218);
        uVar20 = *(undefined8 *)(lVar29 + 0x220);
        lVar29 = *(long *)(unaff_x29 + -0xd0);
        if (lVar29 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
        }
        puVar22 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar29 * 0x10);
        *puVar22 = uVar14;
        puVar22[1] = uVar20;
        *(long *)(unaff_x29 + -0xd0) = lVar29 + 1;
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
  lVar24 = *(long *)(unaff_x19[3] + 0x88);
  lVar12 = *(long *)(unaff_x19[3] + 0x90);
  lVar13 = lVar24;
  while (lVar29 = lVar13, lVar29 != lVar24 + lVar12 * 600) {
    uVar9 = func_0x005175a8();
    lVar13 = lVar29 + 600;
    if ((uVar9 & 1) == 0) {
      if (*(long *)(lVar29 + 0xd8) == 0) {
        uVar28 = 0;
      }
      else {
        uVar28 = 0;
        lVar26 = *(long *)(lVar29 + 0xd0);
        lVar16 = *(long *)(lVar29 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
          in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
          uVar8 = func_0x005175a8();
          uVar28 = uVar8 | uVar28;
          lVar26 = lVar26 + 0x20;
          lVar16 = lVar16 + -0x20;
        } while (lVar16 != 0);
      }
      lVar26 = *(long *)(lVar29 + 0xe8);
      lVar16 = *(long *)(lVar29 + 0xf0) << 5;
      do {
        uVar8 = uVar5;
        if (lVar16 == 0) {
          if (*(long *)(lVar29 + 0xf0) != 0) {
            lVar26 = *(long *)(lVar29 + 0x108);
            if (lVar26 != 0) {
              uVar28 = 1;
              lVar16 = *(long *)(lVar29 + 0x120);
              goto joined_r0x00522584;
            }
            if (*(long *)(lVar29 + 0x120) == 0) goto joined_r0x00522590;
            lVar26 = 0;
            uVar28 = 1;
            lVar16 = *(long *)(lVar29 + 0x120);
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(undefined8 **)(lVar26 + 0x10);
        in_stack_000000e8 = *(undefined8 **)(lVar26 + 0x18);
        uVar9 = func_0x005175a8();
        lVar26 = lVar26 + 0x20;
        lVar16 = lVar16 + -0x20;
      } while ((uVar9 & 1) != 0);
      lVar26 = *(long *)(lVar29 + 0x108);
      if (lVar26 == 0) {
        if (*(long *)(lVar29 + 0x120) != 0) {
          lVar26 = 0;
          lVar16 = *(long *)(lVar29 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar16 = *(long *)(lVar29 + 0x120);
joined_r0x00522584:
        if (lVar16 != 0) {
          lVar16 = lVar16 << 4;
          do {
            if (lVar16 == 0) goto code_r0x0052253c;
            uVar9 = func_0x005175a8();
            lVar16 = lVar16 + -0x10;
          } while ((uVar9 & 1) != 0);
          lVar26 = *(long *)(lVar29 + 0x108);
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
        uVar14 = *(undefined8 *)(lVar29 + 0x218);
        uVar20 = *(undefined8 *)(lVar29 + 0x220);
        lVar26 = *(long *)(unaff_x29 + -0xd0);
        if (lVar26 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar22 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar26 * 0x10);
        *puVar22 = uVar14;
        puVar22[1] = uVar20;
        *(long *)(unaff_x29 + -0xd0) = lVar26 + 1;
        if ((*(byte *)(lVar29 + 0x251) & 1) == 0) {
          if (*(int *)(lVar29 + 0x28) == 1) {
            uVar9 = *(ulong *)(lVar29 + 0x30);
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
     (lVar24 = *(long *)(lVar13 + 0x90), lVar24 != 0)) {
    lVar12 = 0;
    lVar26 = *(long *)(lVar13 + 0x88);
    lVar29 = *(long *)(lVar26 + 0x228);
    lVar13 = lVar26;
    while( true ) {
      if ((lVar29 == 0) && (*(int *)(lVar13 + 0x248) == 0x110000)) {
        iVar7 = func_0x005175a8();
        if ((iVar7 == 0) &&
           ((lVar13 = lVar26 + lVar12, *(int *)(lVar13 + 0x28) != 1 ||
            (*(ulong *)(lVar13 + 0x30) < uStack0000000000000028)))) {
          uVar14 = *(undefined8 *)(lVar26 + lVar12 + 0x218);
          uVar20 = *(undefined8 *)(lVar13 + 0x220);
          lVar13 = *(long *)(unaff_x29 + -0xd0);
          if (lVar13 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar22 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar13 * 0x10);
          *puVar22 = uVar14;
          puVar22[1] = uVar20;
          *(long *)(unaff_x29 + -0xd0) = lVar13 + 1;
        }
      }
      if (lVar24 * 600 + -600 == lVar12) break;
      lVar12 = lVar12 + 600;
      lVar13 = lVar26 + lVar12;
      lVar29 = *(long *)(lVar13 + 0x228);
    }
  }
  lVar13 = *(long *)(unaff_x29 + -0xd0);
  if (lVar13 == 0) {
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
    }
    uVar14 = 0;
joined_r0x00522908:
    if (uStack0000000000000060 != 0) {
      func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
    }
    lVar13 = in_stack_00000080;
    if (in_stack_00000088 != 0) {
      puVar22 = (undefined8 *)(in_stack_00000080 + 8);
      lVar24 = in_stack_00000088;
      do {
        if (puVar22[-1] != 0) {
          func_0x00187bd4(*puVar22,puVar22[-1] << 4,8);
        }
        puVar22 = puVar22 + 3;
        lVar24 = lVar24 + -1;
      } while (lVar24 != 0);
    }
    if (in_stack_00000078 != 0) {
      func_0x00187bd4(lVar13,in_stack_00000078 * 0x18,8);
    }
    return uVar14;
  }
  lVar24 = 0;
  lVar12 = *(long *)(unaff_x29 + -0xe0);
  puVar22 = *(undefined8 **)(unaff_x29 + -0xd8);
  lVar26 = unaff_x19[3];
  lVar29 = *(long *)(lVar26 + 0xf0) << 4;
  uVar9 = 0xffffffffffffffff;
  plVar15 = *(long **)(lVar26 + 0xe8);
  do {
    if (lVar29 == 0) {
      puVar23 = (undefined *)0x0;
      goto LAB_00522a40;
    }
    lVar16 = *plVar15;
    plVar4 = plVar15 + 1;
    uVar9 = uVar9 + 1;
    lVar24 = lVar24 + 0x20;
    lVar29 = lVar29 + -0x10;
    plVar15 = plVar15 + 2;
  } while (lVar16 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
  if (uVar9 < *(ulong *)(lVar26 + 0x108)) {
    lVar24 = *(long *)(lVar26 + 0x100) + lVar24;
    lVar29 = *(long *)(lVar24 + -0x18);
    puVar23 = (undefined *)
              (*(long *)(lVar24 + -0x20) + (*(long *)(lVar29 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar31 = (**(code **)(lVar29 + 0x18))(puVar23);
    if (auVar31._0_8_ == 0x1414db8803bc16e0 && auVar31._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
      puVar3 = &UNK_008a7b62;
      if (puVar23 != (undefined *)0x0) {
        puVar3 = puVar23;
      }
      *(long *)(unaff_x29 + -200) = lVar26;
      *(undefined **)(unaff_x29 + -0xc0) = puVar3;
      *(long **)(unaff_x29 + -0xb8) = unaff_x19;
      func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,puVar22,lVar13);
      puVar21 = uStack00000000000000e0;
      in_stack_000000f8 = in_stack_000000e8 + (long)in_stack_000000f0 * 3;
      uStack00000000000000e0 = in_stack_000000e8;
      in_stack_000000f0 = puVar21;
      func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
      in_stack_000000f8 = puVar22 + lVar13 * 2;
      in_stack_00000100 = in_stack_00000030;
      in_stack_00000108 = in_stack_00000050;
      in_stack_00000110 = in_stack_00000038;
      in_stack_00000118 = in_stack_00000058;
      uStack00000000000000e0 = puVar22;
      in_stack_000000e8 = puVar22;
      in_stack_000000f0 = (undefined8 *)lVar12;
      in_stack_00000120 = lVar26;
      func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
      *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
      *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
      *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar20 = *(undefined8 *)(unaff_x29 + -0x88);
      func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar20,
                      *(undefined8 *)(unaff_x29 + -0x80));
      uVar14 = func_0x0051c5b4(lVar26,unaff_x29 + -0x70,&uStack00000000000000e0);
      if (*(long *)(unaff_x29 + -0x90) != 0) {
        func_0x00187bd4(uVar20,*(long *)(unaff_x29 + -0x90) << 4,8);
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



/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_005221d4(long param_1,long param_2)

{
  long lVar1;
  undefined *puVar2;
  long *plVar3;
  code *pcVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  long *plVar10;
  long unaff_x19;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  long unaff_x23;
  long lVar16;
  long unaff_x24;
  undefined *puVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  uint uVar21;
  long lVar22;
  long unaff_x29;
  undefined1 auVar23 [16];
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  uint in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  
code_r0x005221d4:
  func_0x00187bd4(param_1,param_2,8);
LAB_00522068:
  do {
    lVar18 = unaff_x23;
    if (lVar18 == unaff_x24) {
      lVar8 = *(long *)(*(long *)(unaff_x19 + 0x18) + 0x88);
      lVar11 = *(long *)(*(long *)(unaff_x19 + 0x18) + 0x90);
      lVar18 = lVar8;
      goto code_r0x005223f4;
    }
    uVar7 = func_0x005175a8();
    unaff_x23 = lVar18 + 0x28;
    if ((uVar7 & 1) == 0) {
      lVar11 = *(long *)(unaff_x19 + 0x18);
      lVar8 = *(long *)(lVar11 + 0x90);
      if (lVar8 == 0) {
code_r0x00522128:
        if (*(long *)(lVar11 + 0xd8) != 0) {
          uVar9 = *(undefined8 *)(lVar18 + 0x18);
          lVar18 = *(long *)(lVar18 + 0x20);
          puVar15 = (undefined8 *)(*(long *)(lVar11 + 0xd0) + 0x48);
          lVar8 = *(long *)(lVar11 + 0xd8) * 0x60;
          do {
            if ((puVar15[1] == lVar18) && (iVar5 = _memcmp(*puVar15,uVar9,lVar18), iVar5 == 0)) {
              func_0x00505704(&uStack00000000000000e0,lVar11,puVar15);
              param_1 = in_stack_000000e8;
              lVar18 = in_stack_000000f0 << 4;
              goto code_r0x005221a4;
            }
            puVar15 = puVar15 + 0xc;
            lVar8 = lVar8 + -0x60;
          } while (lVar8 != 0);
        }
      }
      else {
        lVar20 = 0;
        lVar22 = *(long *)(lVar11 + 0x88);
        uVar9 = *(undefined8 *)(lVar18 + 0x18);
        lVar16 = *(long *)(lVar18 + 0x20);
        while ((*(long *)(lVar22 + lVar20 + 0x220) != lVar16 ||
               (iVar5 = _memcmp(*(undefined8 *)(lVar22 + lVar20 + 0x218),uVar9,lVar16), iVar5 != 0))
              ) {
          lVar20 = lVar20 + 600;
          if (lVar8 * 600 == lVar20) goto code_r0x00522128;
        }
        if ((in_stack_00000048 & 1) == 0) goto LAB_00522068;
        lVar18 = lVar22 + lVar20;
        func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar11,lVar18 + 0x218);
        param_1 = in_stack_000000e8;
        if (in_stack_000000f0 != 0) goto joined_r0x00522358;
        if (uStack00000000000000e0 != 0) {
          func_0x00187bd4(in_stack_000000e8,uStack00000000000000e0 << 4,8);
        }
        lVar8 = *(long *)(lVar11 + 0xd8);
        if (lVar8 != 0) {
          uVar9 = *(undefined8 *)(lVar18 + 0x218);
          lVar19 = *(long *)(lVar18 + 0x220);
          lVar13 = *(long *)(lVar11 + 0xd0);
          lVar16 = lVar13;
          do {
            lVar1 = lVar16 + 0x60;
            if (*(long *)(lVar16 + 0x10) != 0) {
              plVar10 = (long *)(*(long *)(lVar16 + 8) + 8);
              lVar12 = *(long *)(lVar16 + 0x10) << 4;
              do {
                if ((*plVar10 == lVar19) && (iVar5 = _memcmp(plVar10[-1],uVar9,lVar19), iVar5 == 0))
                {
                  uVar14 = *(undefined8 *)(lVar16 + 0x50);
                  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(lVar16 + 0x48);
                  *(undefined8 *)(unaff_x29 + -0x68) = uVar14;
                  func_0x00523334(&uStack00000000000000e0,&uStack0000000000000060,lVar11,
                                  unaff_x29 + -0x70);
                  param_1 = in_stack_000000e8;
                  if (in_stack_000000f0 != 0) goto joined_r0x00522358;
                  if (uStack00000000000000e0 != 0) {
                    func_0x00187bd4(in_stack_000000e8,uStack00000000000000e0 << 4,8);
                  }
                  break;
                }
                plVar10 = plVar10 + 2;
                lVar12 = lVar12 + -0x10;
              } while (lVar12 != 0);
            }
            lVar16 = lVar1;
          } while (lVar1 != lVar13 + lVar8 * 0x60);
        }
        uVar9 = *(undefined8 *)(lVar18 + 0x218);
        uVar14 = *(undefined8 *)(lVar18 + 0x220);
        lVar18 = *(long *)(unaff_x29 + -0xd0);
        if (lVar18 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea510);
        }
        puVar15 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar18 * 0x10);
        *puVar15 = uVar9;
        puVar15[1] = uVar14;
        *(long *)(unaff_x29 + -0xd0) = lVar18 + 1;
        if ((*(byte *)(lVar22 + lVar20 + 0x251) & 1) == 0) {
          if (*(int *)(lVar22 + lVar20 + 0x28) == 1) {
            uVar7 = *(ulong *)(lVar22 + lVar20 + 0x30);
          }
          else {
            uVar7 = 0;
          }
          if (uVar7 <= in_stack_00000028) {
            uVar7 = in_stack_00000028;
          }
          in_stack_00000028 = uVar7;
        }
      }
    }
  } while( true );
  while( true ) {
    uVar7 = func_0x005175a8();
    lVar18 = lVar18 + -0x10;
    if ((uVar7 & 1) != 0) break;
code_r0x005221a4:
    if (lVar18 == 0) {
      if (uStack00000000000000e0 != 0) {
        func_0x00187bd4(param_1,uStack00000000000000e0 << 4,8);
      }
      uVar9 = *puVar15;
      uVar14 = puVar15[1];
      lVar18 = *(long *)(unaff_x29 + -0xd0);
      if (lVar18 == *(long *)(unaff_x29 + -0xe0)) {
        func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea528);
      }
      puVar15 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar18 * 0x10);
      *puVar15 = uVar9;
      puVar15[1] = uVar14;
      *(long *)(unaff_x29 + -0xd0) = lVar18 + 1;
      goto LAB_00522068;
    }
  }
  if (uStack00000000000000e0 == 0) goto LAB_00522068;
  param_2 = uStack00000000000000e0 << 4;
  goto code_r0x005221d4;
joined_r0x00522358:
  in_stack_000000e8 = param_1;
  if (uStack00000000000000e0 != 0) {
    param_2 = uStack00000000000000e0 << 4;
    goto code_r0x005221d4;
  }
  goto LAB_00522068;
code_r0x005223f4:
  lVar20 = lVar18;
  if (lVar20 != lVar8 + lVar11 * 600) {
    uVar7 = func_0x005175a8();
    lVar18 = lVar20 + 600;
    if ((uVar7 & 1) == 0) {
      if (*(long *)(lVar20 + 0xd8) == 0) {
        uVar21 = 0;
      }
      else {
        uVar21 = 0;
        lVar16 = *(long *)(lVar20 + 0xd0);
        lVar22 = *(long *)(lVar20 + 0xd8) << 5;
        do {
          uStack00000000000000e0 = *(long *)(lVar16 + 0x10);
          in_stack_000000e8 = *(long *)(lVar16 + 0x18);
          uVar6 = func_0x005175a8();
          uVar21 = uVar6 | uVar21;
          lVar16 = lVar16 + 0x20;
          lVar22 = lVar22 + -0x20;
        } while (lVar22 != 0);
      }
      lVar16 = *(long *)(lVar20 + 0xe8);
      lVar22 = *(long *)(lVar20 + 0xf0) << 5;
      do {
        if (lVar22 == 0) {
          if (*(long *)(lVar20 + 0xf0) != 0) {
            lVar16 = *(long *)(lVar20 + 0x108);
            if (lVar16 == 0) {
              uVar21 = in_stack_00000048;
              if (*(long *)(lVar20 + 0x120) == 0) goto joined_r0x00522590;
              lVar16 = 0;
              uVar21 = 1;
              lVar22 = *(long *)(lVar20 + 0x120);
            }
            else {
              uVar21 = 1;
              lVar22 = *(long *)(lVar20 + 0x120);
            }
            goto joined_r0x00522584;
          }
          break;
        }
        uStack00000000000000e0 = *(long *)(lVar16 + 0x10);
        in_stack_000000e8 = *(long *)(lVar16 + 0x18);
        uVar7 = func_0x005175a8();
        lVar16 = lVar16 + 0x20;
        lVar22 = lVar22 + -0x20;
      } while ((uVar7 & 1) != 0);
      lVar16 = *(long *)(lVar20 + 0x108);
      if (lVar16 == 0) {
        if (*(long *)(lVar20 + 0x120) != 0) {
          lVar16 = 0;
          lVar22 = *(long *)(lVar20 + 0x120);
          goto joined_r0x00522584;
        }
      }
      else {
        lVar22 = *(long *)(lVar20 + 0x120);
joined_r0x00522584:
        if (lVar22 != 0) {
          lVar22 = lVar22 << 4;
          do {
            if (lVar22 == 0) goto code_r0x0052253c;
            uVar7 = func_0x005175a8();
            lVar22 = lVar22 + -0x10;
          } while ((uVar7 & 1) != 0);
          lVar16 = *(long *)(lVar20 + 0x108);
        }
        lVar16 = lVar16 << 4;
        do {
          if (lVar16 == 0) {
            uVar21 = in_stack_00000048 & 1;
            goto joined_r0x00522590;
          }
          uVar7 = func_0x005175a8();
          lVar16 = lVar16 + -0x10;
        } while ((uVar7 & 1) == 0);
      }
code_r0x0052253c:
      uVar21 = in_stack_00000048 & uVar21 & 1;
joined_r0x00522590:
      if (uVar21 != 0) {
        uVar9 = *(undefined8 *)(lVar20 + 0x218);
        uVar14 = *(undefined8 *)(lVar20 + 0x220);
        lVar16 = *(long *)(unaff_x29 + -0xd0);
        if (lVar16 == *(long *)(unaff_x29 + -0xe0)) {
          func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4f8);
        }
        puVar15 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar16 * 0x10);
        *puVar15 = uVar9;
        puVar15[1] = uVar14;
        *(long *)(unaff_x29 + -0xd0) = lVar16 + 1;
        if ((*(byte *)(lVar20 + 0x251) & 1) == 0) {
          if (*(int *)(lVar20 + 0x28) == 1) {
            uVar7 = *(ulong *)(lVar20 + 0x30);
          }
          else {
            uVar7 = 0;
          }
          if (uVar7 <= in_stack_00000028) {
            uVar7 = in_stack_00000028;
          }
          in_stack_00000028 = uVar7;
        }
      }
    }
    goto code_r0x005223f4;
  }
  lVar18 = *(long *)(unaff_x19 + 0x18);
  if ((((*(byte *)(lVar18 + 700) >> 4 & 1) == 0) && ((*(byte *)(lVar18 + 0x2c0) >> 4 & 1) == 0)) &&
     (lVar8 = *(long *)(lVar18 + 0x90), lVar8 != 0)) {
    lVar11 = 0;
    lVar16 = *(long *)(lVar18 + 0x88);
    lVar20 = *(long *)(lVar16 + 0x228);
    lVar18 = lVar16;
    while( true ) {
      if ((lVar20 == 0) && (*(int *)(lVar18 + 0x248) == 0x110000)) {
        iVar5 = func_0x005175a8();
        if ((iVar5 == 0) &&
           ((lVar18 = lVar16 + lVar11, *(int *)(lVar18 + 0x28) != 1 ||
            (*(ulong *)(lVar18 + 0x30) < in_stack_00000028)))) {
          uVar9 = *(undefined8 *)(lVar16 + lVar11 + 0x218);
          uVar14 = *(undefined8 *)(lVar18 + 0x220);
          lVar18 = *(long *)(unaff_x29 + -0xd0);
          if (lVar18 == *(long *)(unaff_x29 + -0xe0)) {
            func_0x0050c0c0(unaff_x29 + -0xe0,&UNK_009ea4e0);
          }
          puVar15 = (undefined8 *)(*(long *)(unaff_x29 + -0xd8) + lVar18 * 0x10);
          *puVar15 = uVar9;
          puVar15[1] = uVar14;
          *(long *)(unaff_x29 + -0xd0) = lVar18 + 1;
        }
      }
      if (lVar8 * 600 + -600 == lVar11) break;
      lVar11 = lVar11 + 600;
      lVar18 = lVar16 + lVar11;
      lVar20 = *(long *)(lVar18 + 0x228);
    }
  }
  lVar18 = *(long *)(unaff_x29 + -0xd0);
  if (lVar18 != 0) {
    lVar8 = 0;
    lVar11 = *(long *)(unaff_x29 + -0xe0);
    lVar20 = *(long *)(unaff_x29 + -0xd8);
    lVar22 = *(long *)(unaff_x19 + 0x18);
    lVar16 = *(long *)(lVar22 + 0xf0) << 4;
    uVar7 = 0xffffffffffffffff;
    plVar10 = *(long **)(lVar22 + 0xe8);
    do {
      if (lVar16 == 0) {
        puVar17 = (undefined *)0x0;
        goto LAB_00522a40;
      }
      lVar13 = *plVar10;
      plVar3 = plVar10 + 1;
      uVar7 = uVar7 + 1;
      lVar8 = lVar8 + 0x20;
      lVar16 = lVar16 + -0x10;
      plVar10 = plVar10 + 2;
    } while (lVar13 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
    if (uVar7 < *(ulong *)(lVar22 + 0x108)) {
      lVar8 = *(long *)(lVar22 + 0x100) + lVar8;
      lVar16 = *(long *)(lVar8 + -0x18);
      puVar17 = (undefined *)
                (*(long *)(lVar8 + -0x20) + (*(long *)(lVar16 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar23 = (**(code **)(lVar16 + 0x18))(puVar17);
      if (auVar23._0_8_ == 0x1414db8803bc16e0 && auVar23._8_8_ == 0x4f7557bbe08e4383) {
LAB_00522a40:
        puVar2 = &UNK_008a7b62;
        if (puVar17 != (undefined *)0x0) {
          puVar2 = puVar17;
        }
        *(long *)(unaff_x29 + -200) = lVar22;
        *(undefined **)(unaff_x29 + -0xc0) = puVar2;
        *(long *)(unaff_x29 + -0xb8) = unaff_x19;
        func_0x00528b6c(&uStack00000000000000e0,unaff_x29 + -200,lVar20,lVar18);
        lVar8 = uStack00000000000000e0;
        in_stack_000000f8 = in_stack_000000e8 + in_stack_000000f0 * 0x18;
        uStack00000000000000e0 = in_stack_000000e8;
        in_stack_000000f0 = lVar8;
        func_0x00516174(unaff_x29 + -0xb0,&uStack00000000000000e0,&UNK_009e7fb0);
        in_stack_000000f8 = lVar20 + lVar18 * 0x10;
        in_stack_00000100 = in_stack_00000030;
        in_stack_00000108 = in_stack_00000050;
        in_stack_00000110 = in_stack_00000038;
        in_stack_00000118 = in_stack_00000058;
        uStack00000000000000e0 = lVar20;
        in_stack_000000e8 = lVar20;
        in_stack_000000f0 = lVar11;
        in_stack_00000120 = lVar22;
        func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
        *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
        *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
        *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
        uVar14 = *(undefined8 *)(unaff_x29 + -0x88);
        func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar14,
                        *(undefined8 *)(unaff_x29 + -0x80));
        uVar9 = func_0x0051c5b4(lVar22,unaff_x29 + -0x70,&uStack00000000000000e0);
        if (*(long *)(unaff_x29 + -0x90) != 0) {
          func_0x00187bd4(uVar14,*(long *)(unaff_x29 + -0x90) << 4,8);
        }
        goto joined_r0x00522908;
      }
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
    else {
      func_0x007a2570(uVar7,*(ulong *)(lVar22 + 0x108),&UNK_009e9b68);
    }
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x523028);
    (*pcVar4)();
  }
  if (*(long *)(unaff_x29 + -0xe0) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4,8);
  }
  uVar9 = 0;
joined_r0x00522908:
  if (uStack0000000000000060 != 0) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060 << 4,8);
  }
  lVar18 = in_stack_00000080;
  if (in_stack_00000088 != 0) {
    puVar15 = (undefined8 *)(in_stack_00000080 + 8);
    lVar8 = in_stack_00000088;
    do {
      if (puVar15[-1] != 0) {
        func_0x00187bd4(*puVar15,puVar15[-1] << 4,8);
      }
      puVar15 = puVar15 + 3;
      lVar8 = lVar8 + -1;
    } while (lVar8 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(lVar18,in_stack_00000078 * 0x18,8);
  }
  return uVar9;
}


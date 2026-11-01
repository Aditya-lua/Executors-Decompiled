
/* WARNING: Possible PIC construction at 0x002a2b3c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002a2b40) */
/* WARNING: Removing unreachable block (ram,0x002a2c48) */
/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_002a2620(ulong param_1)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  bool bVar4;
  int iVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  long *plVar10;
  undefined8 uVar11;
  long *plVar12;
  long lVar13;
  undefined8 uVar14;
  long in_x5;
  uint uVar15;
  long lVar16;
  long in_x9;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  uint uVar20;
  uint uVar21;
  long in_x10;
  long lVar22;
  uint uVar23;
  uint in_w11;
  int iVar24;
  uint uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  int in_w17;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong *puVar29;
  long unaff_x25;
  uint unaff_w26;
  long unaff_x27;
  ulong uVar30;
  undefined8 *puVar31;
  uint uVar32;
  undefined8 unaff_x28;
  long unaff_x29;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  byte bVar48;
  undefined1 auVar49 [16];
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar68;
  byte bVar69;
  byte bVar70;
  byte bVar71;
  byte bVar72;
  byte bVar73;
  undefined8 uVar67;
  byte bVar74;
  byte bVar75;
  byte bVar77;
  byte bVar78;
  byte bVar79;
  byte bVar80;
  byte bVar81;
  byte bVar82;
  undefined8 uVar76;
  byte bVar83;
  ulong uVar84;
  ulong uVar85;
  ulong uVar86;
  ulong uVar87;
  ulong uVar88;
  ulong uVar89;
  undefined1 auVar90 [16];
  undefined1 auVar91 [16];
  undefined8 in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long lStack0000000000000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  long alStack_170 [32];
  long lStack_70;
  undefined8 uStack_60;
  long lStack_58;
  undefined8 *puStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  ulong uStack_30;
  
code_r0x002a2620:
  if ((in_w11 != 3) && (iVar5 = (int)in_x10, iVar5 != 2)) {
    iVar24 = (int)in_stack_00000010;
    uVar27 = (ulong)((uint)(iVar24 - in_w17) >> 6);
    if (uVar27 < param_1) {
      uVar15 = (uint)(*(ulong *)(in_x9 + uVar27 * 8) >> ((ulong)(uint)(iVar24 - in_w17) & 0x3f)) & 1
      ;
    }
    else {
      uVar15 = 0;
    }
    uVar23 = (uint)unaff_x22;
    if (uVar15 != 0) {
      uVar23 = (uint)unaff_x22 << (ulong)((unaff_w26 ^ 3) & 0x1f) | 1;
    }
    unaff_x22 = (ulong)uVar23;
    if (uVar15 != 0) {
      unaff_w26 = 3;
    }
    if ((in_stack_00000000._4_4_ != 4) && (iVar5 != 3)) {
      uVar15 = iVar24 - (int)unaff_x27;
      uVar27 = (ulong)(uVar15 >> 6);
      if (uVar27 < param_1) {
        uVar15 = (uint)(*(ulong *)(in_x9 + uVar27 * 8) >> ((ulong)uVar15 & 0x3f)) & 1;
      }
      else {
        uVar15 = 0;
      }
      if (uVar15 != 0) {
        uVar23 = uVar23 << (ulong)(4 - unaff_w26 & 0x1f) | 1;
      }
      unaff_x22 = (ulong)uVar23;
      if (uVar15 != 0) {
        unaff_w26 = 4;
      }
      if ((in_stack_00000000._4_4_ != 5) && (iVar5 != 4)) {
        uVar15 = iVar24 - (int)unaff_x25;
        uVar27 = (ulong)(uVar15 >> 6);
        if (uVar27 < param_1) {
          uVar15 = (uint)(*(ulong *)(in_x9 + uVar27 * 8) >> ((ulong)uVar15 & 0x3f)) & 1;
        }
        else {
          uVar15 = 0;
        }
        if (uVar15 != 0) {
          uVar23 = uVar23 << (ulong)(5 - unaff_w26 & 0x1f) | 1;
        }
        unaff_x22 = (ulong)uVar23;
        if (uVar15 != 0) {
          unaff_w26 = 5;
        }
      }
    }
  }
LAB_002a2460:
  lVar22 = unaff_x23;
  if ((in_stack_00000008 & 1) == 0) {
    plVar12 = &lStack0000000000000020;
    plVar10 = unaff_x20;
    lVar13 = unaff_x19;
    iVar5 = func_0x003023ac();
    if (iVar5 != 0) {
      if (unaff_w26 != 0) {
        plVar12 = &lStack0000000000000020;
        plVar10 = unaff_x20;
        lVar13 = unaff_x19;
        iVar5 = func_0x003023ac();
        if (iVar5 == 0) goto code_r0x002a2728;
        if (unaff_w26 != 1) {
          plVar12 = &lStack0000000000000020;
          plVar10 = unaff_x20;
          lVar13 = unaff_x19;
          iVar5 = func_0x003023ac();
          if (iVar5 == 0) goto code_r0x002a2728;
          if (unaff_w26 != 2) {
            plVar12 = &lStack0000000000000020;
            plVar10 = unaff_x20;
            lVar13 = unaff_x19;
            iVar5 = func_0x003023ac();
            if (iVar5 == 0) goto code_r0x002a2728;
            if (unaff_w26 != 3) {
              plVar12 = &lStack0000000000000020;
              plVar10 = unaff_x20;
              lVar13 = unaff_x19;
              iVar5 = func_0x003023ac();
              if (iVar5 == 0) goto code_r0x002a2728;
              if (unaff_w26 != 4) {
                plVar12 = &lStack0000000000000020;
                plVar10 = unaff_x20;
                lVar13 = unaff_x19;
                iVar5 = func_0x003023ac();
                if (iVar5 == 0) goto code_r0x002a2728;
                if (unaff_w26 != 5) {
                  plVar12 = &lStack0000000000000020;
                  plVar10 = unaff_x20;
                  lVar13 = unaff_x19;
                  iVar5 = func_0x003023ac();
                  if (iVar5 == 0) goto code_r0x002a2728;
                  if (unaff_w26 != 6) {
                    plVar12 = &lStack0000000000000020;
                    plVar10 = unaff_x20;
                    lVar13 = unaff_x19;
                    iVar5 = func_0x003023ac();
                    if (iVar5 == 0) goto code_r0x002a2728;
                  }
                }
              }
            }
          }
        }
      }
      goto code_r0x002a257c;
    }
code_r0x002a2728:
    puVar31 = (undefined8 *)0x0;
  }
  else {
code_r0x002a257c:
    plVar10 = (long *)alStack_170[(long)((int)unaff_x22 >> 1) + 0x3a];
    plVar12 = &lStack0000000000000020;
    lVar13 = unaff_x19;
    iVar5 = func_0x003023ac();
    if (iVar5 == 0) goto code_r0x002a2728;
    in_stack_00000008 = 0;
    uVar15 = ((int)in_stack_00000010 - unaff_w26) - (int)unaff_x23;
    in_stack_00000010 = (ulong)uVar15;
    unaff_x28 = 1;
    puVar31 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    if (-1 < (int)uVar15) {
      unaff_x22 = 0;
      lVar22 = -1;
      unaff_x24 = 2;
      in_w17 = 3;
      unaff_x27 = 4;
      unaff_x25 = 5;
      unaff_x23 = 1;
      do {
        if (-1 < (int)(uVar15 + (int)unaff_x22)) {
          param_1 = (ulong)(int)unaff_x21[1];
          uVar27 = in_stack_00000010 + unaff_x22 >> 6;
          if ((uVar27 < param_1) &&
             (in_x9 = *unaff_x21,
             (*(ulong *)(in_x9 + uVar27 * 8) >> (in_stack_00000010 + unaff_x22 & 0x3f) & 1) != 0))
          goto code_r0x002a241c;
        }
        plVar12 = &lStack0000000000000020;
        plVar10 = unaff_x20;
        lVar13 = unaff_x19;
        iVar5 = func_0x003023ac();
        if (iVar5 == 0) goto code_r0x002a2728;
        unaff_x23 = unaff_x23 + 1;
        unaff_x25 = unaff_x25 + 1;
        unaff_x27 = unaff_x27 + 1;
        in_w17 = in_w17 + 1;
        unaff_x24 = unaff_x24 + 1;
        unaff_x22 = unaff_x22 - 1;
        lVar22 = lVar22 + 1;
        puVar31 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
        if (uVar15 == (uint)lVar22) break;
      } while( true );
    }
  }
  if (*(char *)(unaff_x19 + 0x28) == '\0') {
    if (*(long *)(unaff_x19 + 0x10) != 0) {
      lVar16 = *(long *)(unaff_x19 + 0x10) + -1;
      *(long *)(unaff_x19 + 0x10) = lVar16;
      *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar16 * 8);
      goto code_r0x002a2750;
    }
    func_0x0079db4c();
  }
  else {
code_r0x002a2750:
    if ((in_stack_00000030._4_4_ >> 1 & 1) == 0) {
      func_0x0036e3d8(lStack0000000000000020);
    }
    if ((in_stack_00000030._4_4_ & 1) == 0) {
      lStack0000000000000020 = 0;
    }
    else {
      func_0x0036e3d8(&lStack0000000000000020);
    }
    if ((in_stack_00000048._4_4_ >> 1 & 1) == 0) {
      func_0x0036e3d8(uStack0000000000000038);
    }
    if ((in_stack_00000048._4_4_ & 1) != 0) {
      func_0x0036e3d8(&uStack0000000000000038);
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return puVar31;
    }
  }
  auVar90 = ___stack_chk_fail();
  auVar91._8_8_ = lVar13;
  auVar91._0_8_ = plVar12;
  puVar9 = auVar90._8_8_;
  puVar6 = auVar90._0_8_;
  uStack_60 = unaff_x28;
  lStack_58 = unaff_x27;
  puStack_50 = puVar31;
  lStack_48 = unaff_x25;
  lStack_40 = unaff_x24;
  lStack_38 = lVar22;
  uStack_30 = unaff_x22;
  lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar15 = *(uint *)(plVar12 + 1);
  uVar27 = (ulong)uVar15;
  if ((int)uVar15 < 1) {
code_r0x002a2800:
    uVar11 = 0x68;
    uVar14 = 0x27d;
  }
  else {
    puVar29 = (ulong *)*plVar12;
    uVar30 = *puVar29;
    if ((uVar30 & 1) == 0) goto code_r0x002a2800;
    if ((int)plVar12[2] == 0) {
      if ((*(int *)(puVar9 + 2) == 0) &&
         (iVar5 = func_0x0029d99c(*puVar9,(long)*(int *)(puVar9 + 1),puVar29,uVar27), iVar5 < 0)) {
        uVar32 = *(uint *)(plVar10 + 1);
        uVar17 = (ulong)uVar32;
        uVar23 = uVar32 & (int)uVar32 >> 0x1f;
        lVar22 = uVar17 * 8;
        goto code_r0x002a28e4;
      }
      uVar11 = 0x6b;
      uVar14 = 0x286;
    }
    else {
      uVar11 = 0x6d;
      uVar14 = 0x281;
    }
  }
  func_0x0028f83c(3,0,uVar11,"/aws-lc/crypto/fipsmodule/bn/exponentiation.c",uVar14);
  puVar31 = (undefined8 *)0x0;
  goto code_r0x002a2894;
code_r0x002a241c:
  if (1 < in_stack_00000000._4_4_) {
    in_x10 = in_stack_00000010 + unaff_x22;
    if ((int)in_x10 != 0) {
      uVar23 = uVar15 - (int)unaff_x23;
      uVar27 = (ulong)(uVar23 >> 6);
      if (uVar27 < param_1) {
        unaff_w26 = (uint)(*(ulong *)(in_x9 + uVar27 * 8) >> ((ulong)uVar23 & 0x3f)) & 1;
      }
      else {
        unaff_w26 = 0;
      }
      uVar23 = 3;
      if (unaff_w26 == 0) {
        uVar23 = 1;
      }
      unaff_x22 = (ulong)uVar23;
      if ((int)in_x10 != 1) goto code_r0x002a25d8;
      goto LAB_002a2460;
    }
  }
  unaff_w26 = 0;
  unaff_x22 = 1;
  goto LAB_002a2460;
code_r0x002a25d8:
  uVar15 = uVar15 - (int)unaff_x24;
  uVar27 = (ulong)(uVar15 >> 6);
  if (uVar27 < param_1) {
    uVar15 = (uint)(*(ulong *)(in_x9 + uVar27 * 8) >> ((ulong)uVar15 & 0x3f)) & 1;
  }
  else {
    uVar15 = 0;
  }
  if (uVar15 != 0) {
    uVar23 = uVar23 << (ulong)(2 - unaff_w26 & 0x1f) | 1;
  }
  unaff_x22 = (ulong)uVar23;
  if (uVar15 != 0) {
    unaff_w26 = 2;
  }
  in_w11 = in_stack_00000000._4_4_;
  goto code_r0x002a2620;
code_r0x002a2cdc:
  uVar21 = 0;
  uVar20 = 1;
  uVar32 = (uint)uVar27;
  if ((1 < uVar23) && (uVar32 != 0)) {
    if (((int)uVar32 < 1) || (uVar17 = (ulong)(uVar32 - 1 >> 6), uVar30 <= uVar17)) {
      uVar21 = 0;
    }
    else {
      uVar21 = (uint)(*(ulong *)(lVar16 + uVar17 * 8) >> ((ulong)(uVar32 - 1) & 0x3f)) & 1;
    }
    uVar20 = 3;
    if (uVar21 == 0) {
      uVar20 = 1;
    }
    if (2 < uVar23) {
      lVar7 = uVar27 << 0x20;
      if (0x100000000 < lVar7) {
        if (((int)uVar32 < 2) || (uVar27 = (ulong)(uVar32 - 2 >> 6), uVar30 <= uVar27)) {
          uVar25 = 0;
        }
        else {
          uVar25 = (uint)(*(ulong *)(lVar16 + uVar27 * 8) >> ((ulong)(uVar32 - 2) & 0x3f)) & 1;
        }
        uVar1 = 2 - uVar21;
        if (uVar25 != 0) {
          uVar21 = 2;
          uVar20 = uVar20 << (ulong)(uVar1 & 0x1f) | 1;
        }
        if ((3 < uVar23) && (0x200000000 < lVar7)) {
          if (((int)uVar32 < 3) || (uVar27 = (ulong)(uVar32 - 3 >> 6), uVar30 <= uVar27)) {
            uVar25 = 0;
          }
          else {
            uVar25 = (uint)(*(ulong *)(lVar16 + uVar27 * 8) >> ((ulong)(uVar32 - 3) & 0x3f)) & 1;
          }
          uVar1 = uVar21 ^ 3;
          if (uVar25 != 0) {
            uVar21 = 3;
            uVar20 = uVar20 << (ulong)uVar1 | 1;
          }
          if ((4 < uVar23) && (0x300000000 < lVar7)) {
            if (((int)uVar32 < 4) || (uVar27 = (ulong)(uVar32 - 4 >> 6), uVar30 <= uVar27)) {
              uVar23 = 0;
            }
            else {
              uVar23 = (uint)(*(ulong *)(lVar16 + uVar27 * 8) >> ((ulong)(uVar32 - 4) & 0x3f)) & 1;
            }
            uVar25 = 4 - uVar21;
            if (uVar23 != 0) {
              uVar21 = 4;
              uVar20 = uVar20 << (ulong)(uVar25 & 0x1f) | 1;
            }
            uVar23 = uVar15;
            if ((5 < uVar15) && (0x400000000 < lVar7)) {
              if (((int)uVar32 < 5) || (uVar27 = (ulong)(uVar32 - 5 >> 6), uVar30 <= uVar27)) {
                uVar23 = 0;
              }
              else {
                uVar23 = (uint)(*(ulong *)(lVar16 + uVar27 * 8) >> ((ulong)(uVar32 - 5) & 0x3f)) & 1
                ;
              }
              uVar25 = 5 - uVar21;
              if (uVar23 != 0) {
                uVar21 = 5;
                uVar20 = uVar20 << (ulong)(uVar25 & 0x1f) | 1;
              }
              uVar23 = uVar15;
            }
          }
        }
      }
    }
  }
  if ((bool)(bVar4 & -1 < (int)uVar21)) {
    iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
    if (iVar5 == 0) goto code_r0x002a3048;
    if (uVar21 != 0) {
      iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
      if (iVar5 == 0) goto code_r0x002a3048;
      if (uVar21 != 1) {
        iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
        if (iVar5 == 0) goto code_r0x002a3048;
        if (uVar21 != 2) {
          iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
          if (iVar5 == 0) goto code_r0x002a3048;
          if (uVar21 != 3) {
            iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
            if (iVar5 == 0) goto code_r0x002a3048;
            uVar23 = uVar15;
            if (uVar21 != 4) {
              iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
              if (iVar5 == 0) goto code_r0x002a3048;
              if (uVar21 != 5) {
                iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
                if (iVar5 == 0) goto code_r0x002a3048;
                if (uVar21 != 6) {
                  iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
                  if (iVar5 == 0) goto code_r0x002a3048;
                }
              }
            }
          }
        }
      }
    }
  }
  if ((uVar20 & 1) != 0) {
    if ((int)uVar20 < 1 << (ulong)uVar15) {
      if (bVar4) {
        iVar5 = func_0x002a3110(lVar22,lVar22,alStack_170[(int)uVar20 >> 1],in_x5,lVar13);
        if (iVar5 == 0) goto code_r0x002a3048;
      }
      else {
        lVar16 = func_0x0029bd80(lVar22,alStack_170[(int)uVar20 >> 1]);
        if (lVar16 == 0) goto code_r0x002a3048;
      }
      if (uVar21 != uVar32) {
        uVar32 = uVar32 + ~uVar21;
        uVar27 = (ulong)uVar32;
        bVar4 = true;
        do {
          if (-1 < (int)uVar32) {
            uVar30 = (ulong)(int)plVar10[1];
            if (uVar27 >> 6 < uVar30) {
              lVar16 = *plVar10;
              if ((*(ulong *)(lVar16 + (uVar27 >> 6) * 8) >> (uVar27 & 0x3f) & 1) != 0)
              goto code_r0x002a2cdc;
            }
          }
          iVar5 = func_0x002a3110(lVar22,lVar22,lVar22,in_x5,lVar13);
          if (iVar5 == 0) goto code_r0x002a3048;
          if (uVar27 == 0) break;
          uVar27 = uVar27 - 1;
          uVar32 = (uint)uVar27;
        } while( true );
      }
      puVar31 = (undefined8 *)func_0x002a3384(puVar6,lVar22,in_x5,lVar13);
      goto code_r0x002a304c;
    }
    goto code_r0x002a3068;
  }
  goto code_r0x002a3064;
  while (lVar16 = *plVar10, *(long *)(lVar16 + lVar22) == 0) {
code_r0x002a28e4:
    lVar22 = lVar22 + -8;
    uVar21 = (uint)uVar17;
    uVar17 = (ulong)(uVar21 - 1);
    if ((int)uVar21 < 1) {
      if (-1 < (int)uVar32) goto code_r0x002a29f0;
      lVar16 = *plVar10;
      goto code_r0x002a290c;
    }
  }
  uVar23 = uVar21;
code_r0x002a290c:
  uVar18 = *(ulong *)(lVar16 + (long)(int)(uVar23 - 1) * 8);
  uVar26 = uVar18 >> 0x20;
  uVar17 = uVar26;
  if (uVar26 == 0) {
    uVar17 = uVar18;
  }
  uVar28 = uVar17 >> 0x10;
  uVar84 = uVar28;
  if (uVar28 == 0) {
    uVar84 = uVar17;
  }
  uVar17 = uVar84 >> 8;
  if (uVar84 < 0x100) {
    uVar17 = uVar84;
  }
  uVar85 = uVar17 >> 4;
  if (uVar17 < 0x10) {
    uVar85 = uVar17;
  }
  uVar86 = uVar85 >> 2;
  if (uVar85 < 4) {
    uVar86 = uVar85;
  }
  uVar23 = (uint)(uVar18 != 0) | (uVar23 - 1) * 0x40 | (uint)(uVar26 != 0) << 5 |
           (uint)(uVar28 != 0) << 4 | (uint)(0xff < uVar84) << 3 | (uint)(0xf < uVar17) << 2 |
           (uint)(3 < uVar85) << 1;
  if (1 < uVar86) {
    uVar23 = uVar23 + 1;
  }
  if (uVar23 == 0) {
code_r0x002a29f0:
    uVar30 = uVar30 ^ 1;
    if (1 < (int)uVar15) {
      if (uVar15 < 9) {
        uVar17 = 1;
      }
      else {
        uVar18 = uVar27 - 1 & 0xfffffffffffffff8;
        uVar17 = uVar18 | 1;
        bVar33 = 0;
        bVar34 = 0;
        bVar35 = 0;
        bVar36 = 0;
        bVar37 = 0;
        bVar38 = 0;
        bVar39 = 0;
        bVar40 = 0;
        bVar41 = 0;
        bVar42 = 0;
        bVar43 = 0;
        bVar44 = 0;
        bVar45 = 0;
        bVar46 = 0;
        bVar47 = 0;
        bVar48 = 0;
        auVar90._8_8_ = 0;
        auVar90._0_8_ = uVar30;
        uVar11 = 0;
        uVar14 = 0;
        uVar67 = 0;
        uVar76 = 0;
        puVar19 = puVar29 + 5;
        uVar30 = uVar18;
        do {
          uVar84 = puVar19[-3];
          uVar26 = puVar19[-4];
          uVar85 = puVar19[-1];
          uVar28 = puVar19[-2];
          uVar87 = puVar19[1];
          uVar86 = *puVar19;
          uVar89 = puVar19[3];
          uVar88 = puVar19[2];
          auVar49[0] = (byte)uVar26 | auVar90[0];
          auVar49[1] = (byte)(uVar26 >> 8) | auVar90[1];
          auVar49[2] = (byte)(uVar26 >> 0x10) | auVar90[2];
          auVar49[3] = (byte)(uVar26 >> 0x18) | auVar90[3];
          auVar49[4] = (byte)(uVar26 >> 0x20) | auVar90[4];
          auVar49[5] = (byte)(uVar26 >> 0x28) | auVar90[5];
          auVar49[6] = (byte)(uVar26 >> 0x30) | auVar90[6];
          auVar49[7] = (byte)(uVar26 >> 0x38) | auVar90[7];
          auVar49[8] = (byte)uVar84 | auVar90[8];
          auVar49[9] = (byte)(uVar84 >> 8) | auVar90[9];
          auVar49[10] = (byte)(uVar84 >> 0x10) | auVar90[10];
          auVar49[0xb] = (byte)(uVar84 >> 0x18) | auVar90[0xb];
          auVar49[0xc] = (byte)(uVar84 >> 0x20) | auVar90[0xc];
          auVar49[0xd] = (byte)(uVar84 >> 0x28) | auVar90[0xd];
          auVar49[0xe] = (byte)(uVar84 >> 0x30) | auVar90[0xe];
          auVar49[0xf] = (byte)(uVar84 >> 0x38) | auVar90[0xf];
          bVar33 = (byte)uVar28 | bVar33;
          bVar34 = (byte)(uVar28 >> 8) | bVar34;
          bVar35 = (byte)(uVar28 >> 0x10) | bVar35;
          bVar36 = (byte)(uVar28 >> 0x18) | bVar36;
          bVar37 = (byte)(uVar28 >> 0x20) | bVar37;
          bVar38 = (byte)(uVar28 >> 0x28) | bVar38;
          bVar39 = (byte)(uVar28 >> 0x30) | bVar39;
          bVar40 = (byte)(uVar28 >> 0x38) | bVar40;
          bVar41 = (byte)uVar85 | bVar41;
          bVar42 = (byte)(uVar85 >> 8) | bVar42;
          bVar43 = (byte)(uVar85 >> 0x10) | bVar43;
          bVar44 = (byte)(uVar85 >> 0x18) | bVar44;
          bVar45 = (byte)(uVar85 >> 0x20) | bVar45;
          bVar46 = (byte)(uVar85 >> 0x28) | bVar46;
          bVar47 = (byte)(uVar85 >> 0x30) | bVar47;
          bVar48 = (byte)(uVar85 >> 0x38) | bVar48;
          bVar50 = (byte)uVar86 | (byte)uVar11;
          bVar51 = (byte)(uVar86 >> 8) | (byte)((ulong)uVar11 >> 8);
          bVar52 = (byte)(uVar86 >> 0x10) | (byte)((ulong)uVar11 >> 0x10);
          bVar53 = (byte)(uVar86 >> 0x18) | (byte)((ulong)uVar11 >> 0x18);
          bVar54 = (byte)(uVar86 >> 0x20) | (byte)((ulong)uVar11 >> 0x20);
          bVar55 = (byte)(uVar86 >> 0x28) | (byte)((ulong)uVar11 >> 0x28);
          bVar56 = (byte)(uVar86 >> 0x30) | (byte)((ulong)uVar11 >> 0x30);
          bVar57 = (byte)(uVar86 >> 0x38) | (byte)((ulong)uVar11 >> 0x38);
          uVar11 = CONCAT17(bVar57,CONCAT16(bVar56,CONCAT15(bVar55,CONCAT14(bVar54,CONCAT13(bVar53,
                                                  CONCAT12(bVar52,CONCAT11(bVar51,bVar50)))))));
          bVar58 = (byte)uVar87 | (byte)uVar14;
          bVar59 = (byte)(uVar87 >> 8) | (byte)((ulong)uVar14 >> 8);
          bVar60 = (byte)(uVar87 >> 0x10) | (byte)((ulong)uVar14 >> 0x10);
          bVar61 = (byte)(uVar87 >> 0x18) | (byte)((ulong)uVar14 >> 0x18);
          bVar62 = (byte)(uVar87 >> 0x20) | (byte)((ulong)uVar14 >> 0x20);
          bVar63 = (byte)(uVar87 >> 0x28) | (byte)((ulong)uVar14 >> 0x28);
          bVar64 = (byte)(uVar87 >> 0x30) | (byte)((ulong)uVar14 >> 0x30);
          bVar65 = (byte)(uVar87 >> 0x38) | (byte)((ulong)uVar14 >> 0x38);
          uVar14 = CONCAT17(bVar65,CONCAT16(bVar64,CONCAT15(bVar63,CONCAT14(bVar62,CONCAT13(bVar61,
                                                  CONCAT12(bVar60,CONCAT11(bVar59,bVar58)))))));
          bVar66 = (byte)uVar88 | (byte)uVar67;
          bVar68 = (byte)(uVar88 >> 8) | (byte)((ulong)uVar67 >> 8);
          bVar69 = (byte)(uVar88 >> 0x10) | (byte)((ulong)uVar67 >> 0x10);
          bVar70 = (byte)(uVar88 >> 0x18) | (byte)((ulong)uVar67 >> 0x18);
          bVar71 = (byte)(uVar88 >> 0x20) | (byte)((ulong)uVar67 >> 0x20);
          bVar72 = (byte)(uVar88 >> 0x28) | (byte)((ulong)uVar67 >> 0x28);
          bVar73 = (byte)(uVar88 >> 0x30) | (byte)((ulong)uVar67 >> 0x30);
          bVar74 = (byte)(uVar88 >> 0x38) | (byte)((ulong)uVar67 >> 0x38);
          uVar67 = CONCAT17(bVar74,CONCAT16(bVar73,CONCAT15(bVar72,CONCAT14(bVar71,CONCAT13(bVar70,
                                                  CONCAT12(bVar69,CONCAT11(bVar68,bVar66)))))));
          bVar75 = (byte)uVar89 | (byte)uVar76;
          bVar77 = (byte)(uVar89 >> 8) | (byte)((ulong)uVar76 >> 8);
          bVar78 = (byte)(uVar89 >> 0x10) | (byte)((ulong)uVar76 >> 0x10);
          bVar79 = (byte)(uVar89 >> 0x18) | (byte)((ulong)uVar76 >> 0x18);
          bVar80 = (byte)(uVar89 >> 0x20) | (byte)((ulong)uVar76 >> 0x20);
          bVar81 = (byte)(uVar89 >> 0x28) | (byte)((ulong)uVar76 >> 0x28);
          bVar82 = (byte)(uVar89 >> 0x30) | (byte)((ulong)uVar76 >> 0x30);
          bVar83 = (byte)(uVar89 >> 0x38) | (byte)((ulong)uVar76 >> 0x38);
          uVar76 = CONCAT17(bVar83,CONCAT16(bVar82,CONCAT15(bVar81,CONCAT14(bVar80,CONCAT13(bVar79,
                                                  CONCAT12(bVar78,CONCAT11(bVar77,bVar75)))))));
          uVar30 = uVar30 - 8;
          puVar19 = puVar19 + 8;
          auVar90 = auVar49;
        } while (uVar30 != 0);
        bVar66 = bVar66 | bVar50 | bVar33 | auVar49[0];
        bVar68 = bVar68 | bVar51 | bVar34 | auVar49[1];
        bVar69 = bVar69 | bVar52 | bVar35 | auVar49[2];
        bVar70 = bVar70 | bVar53 | bVar36 | auVar49[3];
        bVar71 = bVar71 | bVar54 | bVar37 | auVar49[4];
        bVar72 = bVar72 | bVar55 | bVar38 | auVar49[5];
        bVar73 = bVar73 | bVar56 | bVar39 | auVar49[6];
        bVar74 = bVar74 | bVar57 | bVar40 | auVar49[7];
        bVar75 = bVar75 | bVar58 | bVar41 | auVar49[8];
        bVar77 = bVar77 | bVar59 | bVar42 | auVar49[9];
        bVar78 = bVar78 | bVar60 | bVar43 | auVar49[10];
        bVar79 = bVar79 | bVar61 | bVar44 | auVar49[0xb];
        bVar80 = bVar80 | bVar62 | bVar45 | auVar49[0xc];
        bVar81 = bVar81 | bVar63 | bVar46 | auVar49[0xd];
        bVar82 = bVar82 | bVar64 | bVar47 | auVar49[0xe];
        bVar83 = bVar83 | bVar65 | bVar48 | auVar49[0xf];
        auVar2[1] = bVar68;
        auVar2[0] = bVar66;
        auVar2[2] = bVar69;
        auVar2[3] = bVar70;
        auVar2[4] = bVar71;
        auVar2[5] = bVar72;
        auVar2[6] = bVar73;
        auVar2[7] = bVar74;
        auVar2[8] = bVar75;
        auVar2[9] = bVar77;
        auVar2[10] = bVar78;
        auVar2[0xb] = bVar79;
        auVar2[0xc] = bVar80;
        auVar2[0xd] = bVar81;
        auVar2[0xe] = bVar82;
        auVar2[0xf] = bVar83;
        auVar3[1] = bVar68;
        auVar3[0] = bVar66;
        auVar3[2] = bVar69;
        auVar3[3] = bVar70;
        auVar3[4] = bVar71;
        auVar3[5] = bVar72;
        auVar3[6] = bVar73;
        auVar3[7] = bVar74;
        auVar3[8] = bVar75;
        auVar3[9] = bVar77;
        auVar3[10] = bVar78;
        auVar3[0xb] = bVar79;
        auVar3[0xc] = bVar80;
        auVar3[0xd] = bVar81;
        auVar3[0xe] = bVar82;
        auVar3[0xf] = bVar83;
        auVar91 = NEON_ext(auVar2,auVar3,8,1);
        uVar30 = CONCAT17(bVar74 | auVar91[7],
                          CONCAT16(bVar73 | auVar91[6],
                                   CONCAT15(bVar72 | auVar91[5],
                                            CONCAT14(bVar71 | auVar91[4],
                                                     CONCAT13(bVar70 | auVar91[3],
                                                              CONCAT12(bVar69 | auVar91[2],
                                                                       CONCAT11(bVar68 | auVar91[1],
                                                                                bVar66 | auVar91[0])
                                                                      ))))));
        if (uVar27 - 1 == uVar18) goto code_r0x002a2a8c;
      }
      lVar22 = uVar27 - uVar17;
      puVar29 = puVar29 + uVar17;
      do {
        uVar30 = *puVar29 | uVar30;
        lVar22 = lVar22 + -1;
        puVar29 = puVar29 + 1;
      } while (lVar22 != 0);
    }
code_r0x002a2a8c:
    if (uVar30 == 0) {
      *(undefined4 *)(puVar6 + 2) = 0;
      *(undefined4 *)(puVar6 + 1) = 0;
      puVar31 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
      goto code_r0x002a2894;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
      if (*(int *)((long)puVar6 + 0xc) == 0) {
        if ((*(byte *)((long)puVar6 + 0x14) >> 1 & 1) != 0) {
          func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
          return (undefined8 *)0x0;
        }
        puVar31 = (undefined8 *)func_0x0036e358(1,8);
        if (puVar31 == (undefined8 *)0x0) {
          return (undefined8 *)0x0;
        }
        if (*(int *)(puVar6 + 1) != 0) {
          _memcpy(puVar31,*puVar6,(long)*(int *)(puVar6 + 1) << 3);
        }
        func_0x0036e3d8(*puVar6);
        *puVar6 = puVar31;
        *(undefined4 *)((long)puVar6 + 0xc) = 1;
      }
      else {
        puVar31 = (undefined8 *)*puVar6;
      }
      *(undefined4 *)(puVar6 + 2) = 0;
      *puVar31 = 1;
      *(undefined4 *)(puVar6 + 1) = 1;
      return (undefined8 *)((long)&MACH_HEADER.magic + 1);
    }
code_r0x002a3060:
    ___stack_chk_fail();
code_r0x002a3064:
    func_0x0079dc50();
code_r0x002a3068:
    func_0x0079dc78();
  }
  else {
    if (*(char *)(lVar13 + 0x28) == '\0') {
      uVar11 = *(undefined8 *)(lVar13 + 0x20);
      uVar27 = *(ulong *)(lVar13 + 0x10);
      if (uVar27 == *(ulong *)(lVar13 + 0x18)) {
        uVar30 = 0x20;
        if (uVar27 != 0) {
          uVar30 = uVar27 * 3 >> 1;
        }
        if (((uVar30 <= uVar27) || (uVar30 >> 0x3d != 0)) ||
           (lVar22 = func_0x0036e48c(*(undefined8 *)(lVar13 + 8),uVar30 << 3), lVar22 == 0)) {
          *(undefined2 *)(lVar13 + 0x28) = 0x101;
          goto code_r0x002a2afc;
        }
        *(long *)(lVar13 + 8) = lVar22;
        *(ulong *)(lVar13 + 0x18) = uVar30;
        uVar27 = *(ulong *)(lVar13 + 0x10);
      }
      else {
        lVar22 = *(long *)(lVar13 + 8);
      }
      *(undefined8 *)(lVar22 + uVar27 * 8) = uVar11;
      *(long *)(lVar13 + 0x10) = *(long *)(lVar13 + 0x10) + 1;
    }
code_r0x002a2afc:
    lVar22 = func_0x0029e340(lVar13);
    lVar16 = func_0x0029e340(lVar13);
    puVar31 = (undefined8 *)0x0;
    alStack_170[0] = lVar16;
    if ((lVar22 == 0) || (lVar16 == 0)) {
code_r0x002a304c:
      func_0x002a34e0(0);
      func_0x0029e4bc(lVar13);
code_r0x002a2894:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
        return puVar31;
      }
      goto code_r0x002a3060;
    }
    if (in_x5 == 0) goto code_r0x002a3070;
    if (uVar23 < 0x2a0) {
      if (uVar23 < 0xf0) {
        if (uVar23 < 0x50) {
          uVar15 = 3;
          if (uVar23 < 0x18) {
            uVar15 = 1;
          }
        }
        else {
          uVar15 = 4;
        }
      }
      else {
        uVar15 = 5;
      }
    }
    else {
      uVar15 = 6;
    }
    iVar5 = func_0x002a3110(lVar16,puVar9,in_x5,in_x5,lVar13);
    if (iVar5 == 0) {
code_r0x002a3048:
      puVar31 = (undefined8 *)0x0;
      goto code_r0x002a304c;
    }
    if (1 < uVar15) {
      lVar7 = func_0x0029e340(lVar13);
      if ((lVar7 == 0) || (iVar5 = func_0x002a3110(lVar7,lVar16,lVar16,in_x5,lVar13), iVar5 == 0))
      goto code_r0x002a3048;
      lVar16 = 0;
      do {
        lVar8 = func_0x0029e340(lVar13);
        alStack_170[lVar16 + 1] = lVar8;
        if ((lVar8 == 0) ||
           (iVar5 = func_0x002a3110(lVar8,alStack_170[lVar16],lVar7,in_x5,lVar13), iVar5 == 0))
        goto code_r0x002a3048;
        iVar5 = (int)lVar16;
        lVar16 = lVar16 + 1;
      } while (iVar5 + 2U >> (ulong)(uVar15 - 1 & 0x1f) == 0);
    }
    bVar4 = false;
    uVar27 = (ulong)(uVar23 - 1);
    while( true ) {
      if (-1 < (int)uVar27) {
        uVar30 = (ulong)(int)plVar10[1];
        if (uVar27 >> 6 < uVar30) {
          lVar16 = *plVar10;
          uVar23 = uVar15;
          if ((*(ulong *)(lVar16 + (uVar27 >> 6) * 8) >> (uVar27 & 0x3f) & 1) != 0)
          goto code_r0x002a2cdc;
        }
      }
      if (uVar27 == 0) break;
      uVar27 = uVar27 - 1;
    }
  }
  auVar91 = func_0x0079dca0();
code_r0x002a3070:
  puVar31 = (undefined8 *)func_0x0036e274(0x40);
  if (puVar31 != (undefined8 *)0x0) {
    puVar31[3] = 0;
    puVar31[2] = 0;
    puVar31[5] = 0;
    puVar31[4] = 0;
    puVar31[7] = 0;
    puVar31[6] = 0;
    *puVar31 = 0;
    puVar31[1] = 0;
    puVar31[2] = 0;
    puVar31[3] = 0;
    puVar31[4] = 0;
    puVar31[5] = 0;
    iVar5 = func_0x002aa470(puVar31,auVar91._0_8_);
    if ((iVar5 != 0) && (iVar5 = func_0x002aa810(puVar31,auVar91._8_8_), iVar5 != 0)) {
      return puVar31;
    }
  }
  func_0x002a34e0(puVar31);
  return (undefined8 *)0x0;
}


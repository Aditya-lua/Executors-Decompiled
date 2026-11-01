
undefined8 FUN_00600538(void)

{
  bool bVar1;
  char cVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  long *plVar6;
  undefined8 *puVar7;
  ulong *puVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  char *pcVar12;
  uint unaff_w19;
  uint uVar13;
  int unaff_w20;
  long lVar14;
  char *unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  uint uVar15;
  undefined8 uVar16;
  undefined8 unaff_x26;
  ulong uVar17;
  long unaff_x29;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000088;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  ulong uStack00000000000000c8;
  ulong uStack00000000000000d0;
  
  unaff_x24[0x1b] = &DAT_005f6230;
  unaff_x24[0x1c] = &DAT_005f627c;
  *unaff_x24 = &DAT_005f4e6c;
  unaff_x24[1] = &DAT_005f4ed4;
  unaff_x24[2] = &DAT_005f50a8;
  unaff_x24[0x12] = &DAT_005f5e0c;
  unaff_x24[0x13] = &DAT_005f5e38;
  unaff_x24[0x14] = &DAT_005f5eec;
  unaff_x24[9] = &DAT_005f57fc;
  unaff_x24[10] = &DAT_005f5844;
  unaff_x24[0xb] = &DAT_005f5984;
  unaff_x24[0x1d] = &DAT_005f63c0;
  unaff_x24[4] = &DAT_005f6838;
  unaff_x24[0x16] = &DAT_005f9574;
  unaff_x24[0xd] = &DAT_005f850c;
  unaff_x24[0x1f] = &DAT_005fa300;
  *(undefined1 *)(unaff_x23 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  uStack00000000000000d0 = in_stack_00000018;
  uStack00000000000000c8 = in_stack_00000010;
  plVar6 = (long *)func_0x006115d0(0x10);
  *plVar6 = 0;
  plVar6[1] = 0;
  if (unaff_w19 == 0) {
    lVar14 = 0xa3c168;
    if (((bRam0000000000a3c150 & 1) == 0) && (iVar5 = ___cxa_guard_acquire(0xa3c150), iVar5 != 0)) {
      func_0x005fe1e8(0xa3c168,0);
      lVar14 = 0xa3c168;
      ___cxa_atexit(&SUB_00087574,0xa3c168,0);
      ___cxa_guard_release(0xa3c150);
    }
    goto LAB_006010dc;
  }
  uVar13 = unaff_w19 - 1;
  uVar11 = (ulong)((int)unaff_x21[uVar13] - 0x42U);
  if ((int)unaff_x21[uVar13] - 0x42U < 0x2e) {
    if ((1L << (uVar11 & 0x3f) & 0x100000001U) == 0) {
      if ((1L << (uVar11 & 0x3f) & 0x4000000040U) == 0) {
        if ((1L << (uVar11 & 0x3f) & 0x200000002000U) == 0) goto LAB_006006d0;
        uVar16 = 8;
      }
      else {
        uVar16 = 0x10;
      }
    }
    else {
      uVar16 = 2;
    }
  }
  else {
LAB_006006d0:
    uVar16 = 10;
  }
  pcVar12 = unaff_x21 + 1;
  cVar2 = *unaff_x21;
  if (cVar2 != '-') {
    pcVar12 = unaff_x21;
    uVar13 = unaff_w19;
  }
  if (((uVar13 < 3) || (*pcVar12 != '0')) ||
     (uVar11 = (ulong)((byte)pcVar12[1] - 0x4e), 0x2a < (byte)pcVar12[1] - 0x4e)) {
LAB_00600ddc:
    if (unaff_w20 != 1) goto LAB_00600758;
LAB_00600de4:
    if (uVar13 != 0) {
      uVar11 = 0;
      do {
        cVar3 = pcVar12[uVar11];
        uVar10 = (int)cVar3 - 0x30;
        iVar5 = (int)cVar3;
        uVar15 = iVar5 - 0x37;
        if (5 < iVar5 - 0x41U) {
          uVar15 = (uint)uVar16;
        }
        if ((int)cVar3 - 0x61U < 6) {
          uVar15 = iVar5 - 0x57;
        }
        if (uVar10 < 10) {
          uVar15 = uVar10;
        }
        if ((int)uVar15 < (int)(uint)uVar16) {
          DataMemoryBarrier(2,3);
          if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
            unaff_x24[0x1b] = &DAT_005f6230;
            unaff_x24[0x1c] = &DAT_005f627c;
            *unaff_x24 = &DAT_005f4e6c;
            unaff_x24[1] = &DAT_005f4ed4;
            unaff_x24[2] = &DAT_005f50a8;
            unaff_x24[0x12] = &DAT_005f5e0c;
            unaff_x24[0x13] = &DAT_005f5e38;
            unaff_x24[0x14] = &DAT_005f5eec;
            unaff_x24[9] = &DAT_005f57fc;
            unaff_x24[10] = &DAT_005f5844;
            unaff_x24[0xb] = &DAT_005f5984;
            unaff_x24[0x1d] = &DAT_005f63c0;
            unaff_x24[4] = &DAT_005f6838;
            unaff_x24[0x16] = &DAT_005f9574;
            unaff_x24[0xd] = &DAT_005f850c;
            unaff_x24[0x1f] = &DAT_005fa300;
            *(undefined1 *)(unaff_x23 + 0x148) = 1;
            DataMemoryBarrier(2,3);
          }
          puVar7 = (undefined8 *)func_0x006115d0(0x10);
          *puVar7 = uVar16;
          puVar7[1] = 0;
          func_0x00608730(unaff_x29 + -0x88,(long)register0x00000008 + 0xb8,&uStack0000000000000088)
          ;
          func_0x005ffccc((long)register0x00000008 + 0xb8,unaff_x29 + -0x88);
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          lVar14 = *(long *)(unaff_x29 + -0x68);
          uVar17 = *(ulong *)(unaff_x29 + -0x78);
          if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
            uVar17 = *(ulong *)(unaff_x29 + -0x70);
          }
          if (lVar14 != 0) {
            if (uVar17 != 0) {
              do {
                *(undefined8 *)(lVar14 + -8 + uVar17 * 8) = 0;
                uVar17 = uVar17 - 1;
              } while (uVar17 != 0);
            }
            func_0x00611644();
          }
          puVar7[1] = 0;
          *puVar7 = 0;
          uStack0000000000000088 = unaff_x22;
          func_0x00611644(puVar7);
          DataMemoryBarrier(2,3);
          if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
            unaff_x24[0x1b] = &DAT_005f6230;
            unaff_x24[0x1c] = &DAT_005f627c;
            *unaff_x24 = &DAT_005f4e6c;
            unaff_x24[1] = &DAT_005f4ed4;
            unaff_x24[2] = &DAT_005f50a8;
            unaff_x24[0x12] = &DAT_005f5e0c;
            unaff_x24[0x13] = &DAT_005f5e38;
            unaff_x24[0x14] = &DAT_005f5eec;
            unaff_x24[9] = &DAT_005f57fc;
            unaff_x24[10] = &DAT_005f5844;
            unaff_x24[0xb] = &DAT_005f5984;
            unaff_x24[0x1d] = &DAT_005f63c0;
            unaff_x24[4] = &DAT_005f6838;
            unaff_x24[0x16] = &DAT_005f9574;
            unaff_x24[0xd] = &DAT_005f850c;
            unaff_x24[0x1f] = &DAT_005fa300;
            *(undefined1 *)(unaff_x23 + 0x148) = 1;
            DataMemoryBarrier(2,3);
          }
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          *(ulong *)(unaff_x29 + -0x70) = in_stack_00000018;
          *(ulong *)(unaff_x29 + -0x78) = in_stack_00000010;
          puVar8 = (ulong *)func_0x006115d0(0x10);
          *(ulong **)(unaff_x29 + -0x68) = puVar8;
          *(undefined4 *)(unaff_x29 + -0x60) = 0;
          *puVar8 = (ulong)uVar15;
          puVar8[1] = 0;
          func_0x00603158((long)register0x00000008 + 0xb8,unaff_x29 + -0x88);
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          puVar8[1] = 0;
          *puVar8 = 0;
          func_0x00611644(puVar8);
        }
        uVar11 = uVar11 + 1;
      } while (uVar11 != uVar13);
    }
  }
  else {
    if ((1L << (uVar11 & 0x3f) & 0x100000001U) == 0) {
      if ((1L << (uVar11 & 0x3f) & 0x200000002U) == 0) {
        if ((1L << (uVar11 & 0x3f) & 0x40000000400U) != 0) {
          uVar16 = 0x10;
          goto joined_r0x00600754;
        }
      }
      else {
        pcVar12 = pcVar12 + 2;
        uVar13 = uVar13 - 2;
        uVar16 = 8;
      }
      goto LAB_00600ddc;
    }
    uVar16 = 10;
joined_r0x00600754:
    uVar13 = uVar13 - 2;
    pcVar12 = pcVar12 + 2;
    if (unaff_w20 == 1) goto LAB_00600de4;
LAB_00600758:
    uVar15 = (uint)uVar16;
    if ((unaff_w20 == 0) && (uVar15 == 0x10)) {
      if (((bRam0000000000a3c158 & 1) == 0) && (iVar5 = ___cxa_guard_acquire(0xa3c158), iVar5 != 0))
      {
        func_0x005fe1e8(0xa3c198,1);
        ___cxa_atexit(&SUB_00087574,0xa3c198,0);
        ___cxa_guard_release(0xa3c158);
      }
      func_0x005fde88(unaff_x29 + -0x88,0xa3c198);
      if (uVar13 != 0) {
        bVar1 = false;
        uVar17 = (ulong)uVar13 - 1;
        uVar11 = 0;
        uVar15 = 0;
LAB_006007c4:
        do {
          cVar3 = pcVar12[uVar11];
          iVar5 = (int)cVar3;
          uVar10 = iVar5 - 0x30;
          if (uVar10 < 10) {
LAB_006007b0:
            if ((int)uVar10 < 0x10) {
              if (bVar1) {
                DataMemoryBarrier(2,3);
                if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
                  unaff_x24[0x1b] = &DAT_005f6230;
                  unaff_x24[0x1c] = &DAT_005f627c;
                  *unaff_x24 = &DAT_005f4e6c;
                  unaff_x24[1] = &DAT_005f4ed4;
                  unaff_x24[2] = &DAT_005f50a8;
                  unaff_x24[0x12] = &DAT_005f5e0c;
                  unaff_x24[0x13] = &DAT_005f5e38;
                  unaff_x24[0x14] = &DAT_005f5eec;
                  unaff_x24[9] = &DAT_005f57fc;
                  unaff_x24[10] = &DAT_005f5844;
                  unaff_x24[0xb] = &DAT_005f5984;
                  unaff_x24[0x1d] = &DAT_005f63c0;
                  unaff_x24[4] = &DAT_005f6838;
                  unaff_x24[0x16] = &DAT_005f9574;
                  unaff_x24[0xd] = &DAT_005f850c;
                  unaff_x24[0x1f] = &DAT_005fa300;
                  *(undefined1 *)(unaff_x23 + 0x148) = 1;
                  DataMemoryBarrier(2,3);
                }
                puVar8 = (ulong *)func_0x006115d0(0x10);
                *puVar8 = (ulong)(uVar10 | uVar15 << 4);
                puVar8[1] = 0;
                func_0x00608730(&uStack0000000000000088,unaff_x29 + -0x88,&uStack0000000000000058);
                func_0x00603158((long)register0x00000008 + 0xb8,&uStack0000000000000088);
                uVar9 = in_stack_00000098;
                if (in_stack_000000a0 <= in_stack_00000098) {
                  uVar9 = in_stack_000000a0;
                }
                uStack0000000000000088 = unaff_x22;
                if (in_stack_000000a8 != 0) {
                  if (uVar9 != 0) {
                    do {
                      *(undefined8 *)(in_stack_000000a8 + -8 + uVar9 * 8) = 0;
                      uVar9 = uVar9 - 1;
                    } while (uVar9 != 0);
                  }
                  func_0x00611644();
                }
                puVar8[1] = 0;
                *puVar8 = 0;
                uStack0000000000000058 = unaff_x22;
                func_0x00611644(puVar8);
                func_0x006075d4(unaff_x29 + -0x88,8);
                bVar1 = false;
                bVar4 = uVar17 == uVar11;
                uVar11 = uVar11 + 1;
                if (bVar4) goto LAB_00600d9c;
              }
              else {
                bVar1 = true;
                bVar4 = uVar17 == uVar11;
                uVar11 = uVar11 + 1;
                uVar15 = uVar10;
                if (bVar4) goto LAB_00600c4c;
              }
              goto LAB_006007c4;
            }
          }
          else {
            if (iVar5 - 0x61U < 6) {
              uVar10 = (int)cVar3 - 0x57;
              goto LAB_006007b0;
            }
            if ((int)cVar3 - 0x41U < 6) {
              uVar10 = iVar5 - 0x37;
              goto LAB_006007b0;
            }
          }
          uVar11 = uVar11 + 1;
        } while (uVar13 != uVar11);
        uVar10 = uVar15;
        if (bVar1) {
LAB_00600c4c:
          DataMemoryBarrier(2,3);
          if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
            unaff_x24[0x1b] = &DAT_005f6230;
            unaff_x24[0x1c] = &DAT_005f627c;
            *unaff_x24 = &DAT_005f4e6c;
            unaff_x24[1] = &DAT_005f4ed4;
            unaff_x24[2] = &DAT_005f50a8;
            unaff_x24[0x12] = &DAT_005f5e0c;
            unaff_x24[0x13] = &DAT_005f5e38;
            unaff_x24[0x14] = &DAT_005f5eec;
            unaff_x24[9] = &DAT_005f57fc;
            unaff_x24[10] = &DAT_005f5844;
            unaff_x24[0xb] = &DAT_005f5984;
            unaff_x24[0x1d] = &DAT_005f63c0;
            unaff_x24[4] = &DAT_005f6838;
            unaff_x24[0x16] = &DAT_005f9574;
            unaff_x24[0xd] = &DAT_005f850c;
            unaff_x24[0x1f] = &DAT_005fa300;
            *(undefined1 *)(unaff_x23 + 0x148) = 1;
            DataMemoryBarrier(2,3);
          }
          puVar8 = (ulong *)func_0x006115d0(0x10);
          *puVar8 = (ulong)uVar10;
          puVar8[1] = 0;
          func_0x00608730(&uStack0000000000000088,&uStack0000000000000058,unaff_x29 + -0x88);
          func_0x00603158((long)register0x00000008 + 0xb8,&uStack0000000000000088);
          if (in_stack_000000a0 <= in_stack_00000098) {
            in_stack_00000098 = in_stack_000000a0;
          }
          uStack0000000000000088 = unaff_x22;
          if (in_stack_000000a8 != 0) {
            if (in_stack_00000098 != 0) {
              do {
                *(undefined8 *)(in_stack_000000a8 + -8 + in_stack_00000098 * 8) = 0;
                in_stack_00000098 = in_stack_00000098 - 1;
              } while (in_stack_00000098 != 0);
            }
            func_0x00611644();
          }
          puVar8[1] = 0;
          *puVar8 = 0;
          uStack0000000000000058 = unaff_x22;
          func_0x00611644(puVar8);
        }
      }
LAB_00600d9c:
      *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
      lVar14 = *(long *)(unaff_x29 + -0x68);
      uVar11 = *(ulong *)(unaff_x29 + -0x78);
      if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
        uVar11 = *(ulong *)(unaff_x29 + -0x70);
      }
      if (lVar14 != 0) {
        if (uVar11 != 0) {
          do {
            *(undefined8 *)(lVar14 + -8 + uVar11 * 8) = 0;
            uVar11 = uVar11 - 1;
          } while (uVar11 != 0);
        }
        func_0x00611644();
      }
    }
    else if (0 < (int)uVar13) {
      uVar11 = (ulong)uVar13;
      do {
        cVar3 = pcVar12[uVar11 - 1 & 0xffffffff];
        uVar10 = (int)cVar3 - 0x30;
        iVar5 = (int)cVar3;
        uVar13 = iVar5 - 0x37;
        if (5 < iVar5 - 0x41U) {
          uVar13 = uVar15;
        }
        if ((int)cVar3 - 0x61U < 6) {
          uVar13 = iVar5 - 0x57;
        }
        if (uVar10 < 10) {
          uVar13 = uVar10;
        }
        if ((int)uVar13 < (int)uVar15) {
          DataMemoryBarrier(2,3);
          if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
            unaff_x24[0x1b] = &DAT_005f6230;
            unaff_x24[0x1c] = &DAT_005f627c;
            *unaff_x24 = &DAT_005f4e6c;
            unaff_x24[1] = &DAT_005f4ed4;
            unaff_x24[2] = &DAT_005f50a8;
            unaff_x24[0x12] = &DAT_005f5e0c;
            unaff_x24[0x13] = &DAT_005f5e38;
            unaff_x24[0x14] = &DAT_005f5eec;
            unaff_x24[9] = &DAT_005f57fc;
            unaff_x24[10] = &DAT_005f5844;
            unaff_x24[0xb] = &DAT_005f5984;
            unaff_x24[0x1d] = &DAT_005f63c0;
            unaff_x24[4] = &DAT_005f6838;
            unaff_x24[0x16] = &DAT_005f9574;
            unaff_x24[0xd] = &DAT_005f850c;
            unaff_x24[0x1f] = &DAT_005fa300;
            *(undefined1 *)(unaff_x23 + 0x148) = 1;
            DataMemoryBarrier(2,3);
          }
          puVar7 = (undefined8 *)func_0x006115d0(0x10);
          *puVar7 = uVar16;
          puVar7[1] = 0;
          func_0x00608730(unaff_x29 + -0x88,(long)register0x00000008 + 0xb8,&uStack0000000000000088)
          ;
          func_0x005ffccc((long)register0x00000008 + 0xb8,unaff_x29 + -0x88);
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          lVar14 = *(long *)(unaff_x29 + -0x68);
          uVar17 = *(ulong *)(unaff_x29 + -0x78);
          if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
            uVar17 = *(ulong *)(unaff_x29 + -0x70);
          }
          if (lVar14 != 0) {
            if (uVar17 != 0) {
              do {
                *(undefined8 *)(lVar14 + -8 + uVar17 * 8) = 0;
                uVar17 = uVar17 - 1;
              } while (uVar17 != 0);
            }
            func_0x00611644();
          }
          puVar7[1] = 0;
          *puVar7 = 0;
          uStack0000000000000088 = unaff_x22;
          func_0x00611644(puVar7);
          DataMemoryBarrier(2,3);
          if ((*(byte *)(unaff_x23 + 0x148) & 1) == 0) {
            unaff_x24[0x1b] = &DAT_005f6230;
            unaff_x24[0x1c] = &DAT_005f627c;
            *unaff_x24 = &DAT_005f4e6c;
            unaff_x24[1] = &DAT_005f4ed4;
            unaff_x24[2] = &DAT_005f50a8;
            unaff_x24[0x12] = &DAT_005f5e0c;
            unaff_x24[0x13] = &DAT_005f5e38;
            unaff_x24[0x14] = &DAT_005f5eec;
            unaff_x24[9] = &DAT_005f57fc;
            unaff_x24[10] = &DAT_005f5844;
            unaff_x24[0xb] = &DAT_005f5984;
            unaff_x24[0x1d] = &DAT_005f63c0;
            unaff_x24[4] = &DAT_005f6838;
            unaff_x24[0x16] = &DAT_005f9574;
            unaff_x24[0xd] = &DAT_005f850c;
            unaff_x24[0x1f] = &DAT_005fa300;
            *(undefined1 *)(unaff_x23 + 0x148) = 1;
            DataMemoryBarrier(2,3);
          }
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          *(ulong *)(unaff_x29 + -0x70) = in_stack_00000018;
          *(ulong *)(unaff_x29 + -0x78) = in_stack_00000010;
          puVar8 = (ulong *)func_0x006115d0(0x10);
          *(ulong **)(unaff_x29 + -0x68) = puVar8;
          *(undefined4 *)(unaff_x29 + -0x60) = 0;
          *puVar8 = (ulong)uVar13;
          puVar8[1] = 0;
          func_0x00603158((long)register0x00000008 + 0xb8,unaff_x29 + -0x88);
          *(undefined8 *)(unaff_x29 + -0x88) = unaff_x22;
          puVar8[1] = 0;
          *puVar8 = 0;
          func_0x00611644(puVar8);
        }
        bVar1 = 1 < (long)uVar11;
        uVar11 = uVar11 - 1;
      } while (bVar1);
    }
  }
  if (cVar2 == '-') {
    if (*plVar6 == 0) {
      uVar11 = uStack00000000000000d0;
      do {
        if (uVar11 == 0) break;
        lVar14 = uVar11 - 1;
        uVar11 = uVar11 - 1;
      } while (plVar6[lVar14] == 0);
    }
    lVar14 = (long)register0x00000008 + 0xb8;
  }
  else {
    lVar14 = (long)register0x00000008 + 0xb8;
  }
LAB_006010dc:
  func_0x005fde88(&uStack0000000000000028,lVar14);
  uVar11 = uStack00000000000000c8;
  if (uStack00000000000000d0 <= uStack00000000000000c8) {
    uVar11 = uStack00000000000000d0;
  }
  if (plVar6 != (long *)0x0) {
    for (; uVar11 != 0; uVar11 = uVar11 - 1) {
      plVar6[uVar11 - 1] = 0;
    }
    func_0x00611644();
  }
  func_0x005ffccc(unaff_x26,&uStack0000000000000028);
  if (in_stack_00000040 <= in_stack_00000038) {
    in_stack_00000038 = in_stack_00000040;
  }
  if (in_stack_00000048 != 0) {
    if (in_stack_00000038 != 0) {
      do {
        *(undefined8 *)(in_stack_00000048 + -8 + in_stack_00000038 * 8) = 0;
        in_stack_00000038 = in_stack_00000038 - 1;
      } while (in_stack_00000038 != 0);
    }
    func_0x00611644();
  }
  return unaff_x26;
}


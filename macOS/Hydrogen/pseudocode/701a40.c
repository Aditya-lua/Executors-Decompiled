
undefined8 * FUN_00701a40(char *param_1)

{
  int *piVar1;
  ulong *puVar2;
  undefined1 *puVar3;
  uint *puVar4;
  byte bVar5;
  long *plVar6;
  int iVar7;
  byte *pbVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 *puVar11;
  uint uVar12;
  ulong uVar13;
  undefined4 *puVar14;
  long *plVar15;
  ulong uVar16;
  int *piVar17;
  undefined8 *puVar18;
  uint uVar19;
  uint in_w9;
  int iVar20;
  uint uVar21;
  long lVar22;
  uint uVar23;
  uint in_w10;
  byte *pbVar24;
  long lVar25;
  char *pcVar26;
  char cVar27;
  uint in_w11;
  long lVar28;
  byte *pbVar29;
  byte *pbVar30;
  byte *pbVar31;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x26;
  ulong uVar32;
  long unaff_x27;
  long unaff_x29;
  undefined4 uVar33;
  undefined8 in_stack_00000028;
  int in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  uint in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000068;
  undefined1 uStack0000000000000080;
  
  do {
    *(uint *)(unaff_x24 + 0xa4) = in_w10;
    do {
      lVar22 = unaff_x23;
      pcVar26 = param_1;
      unaff_x23 = lVar22 + 1;
      in_w9 = (*(byte *)(unaff_x27 + lVar22) & 0x7f) << (ulong)(in_w11 & 0x1f) | in_w9;
      in_w11 = in_w11 + 7;
      param_1 = pcVar26 + 1;
    } while ((char)*(byte *)(unaff_x27 + lVar22) < '\0');
    if (in_w9 == 0) {
      *(long *)(unaff_x24 + 0x60) = -(unaff_x24 + 0x60);
      if (*(char *)(unaff_x27 + unaff_x23) != '\0') goto LAB_00701a8c;
LAB_00701b7c:
      cVar27 = *(char *)(unaff_x27 + lVar22 + 2);
      lVar22 = lVar22 + 3;
    }
    else {
      *(long *)(unaff_x24 + 0x60) =
           *(long *)(*(long *)(unaff_x19 + 8) + (ulong)(in_w9 - 1) * 8) - (unaff_x24 + 0x60);
      if (*(char *)(unaff_x27 + unaff_x23) == '\0') goto LAB_00701b7c;
LAB_00701a8c:
      lVar22 = lVar22 + 3;
      uVar12 = (uint)*(byte *)(unaff_x27 + unaff_x23 + 1);
      *(uint *)(unaff_x24 + 0xa0) = uVar12;
      iVar7 = *(int *)(unaff_x24 + 0x88) + -1 >> (uVar12 & 0x1f);
      uVar32 = (long)*(int *)(unaff_x24 + 0x88) + 3U & 0xfffffffffffffffc;
      lVar10 = func_0x006f3708();
      *(int *)(unaff_x24 + 0x9c) = (int)uVar32 + iVar7 * 4 + 4;
      puVar2 = (ulong *)(unaff_x24 + 0x40);
      *(long *)(unaff_x24 + 0x38) = lVar10 + unaff_x24 + 0x38;
      *(ulong *)(unaff_x24 + 0x40) = lVar10 + uVar32 ^ (ulong)puVar2;
      if (0 < *(int *)(unaff_x24 + 0x88)) {
        lVar10 = 0;
        cVar27 = '\0';
        do {
          lVar22 = lVar22 + 1;
          cVar27 = *pcVar26 + cVar27;
          *(char *)((*(long *)(unaff_x24 + 0x38) - (unaff_x24 + 0x38)) + lVar10) = cVar27;
          lVar10 = lVar10 + 1;
          pcVar26 = pcVar26 + 1;
        } while (lVar10 < *(int *)(unaff_x24 + 0x88));
      }
      if (-1 < iVar7) {
        iVar20 = 0;
        uVar32 = (ulong)(iVar7 + 1);
        piVar17 = (int *)(*puVar2 ^ (ulong)puVar2);
        do {
          piVar1 = (int *)(unaff_x27 + lVar22);
          lVar22 = lVar22 + 4;
          iVar20 = *piVar1 + iVar20;
          *piVar17 = iVar20;
          uVar32 = uVar32 - 1;
          piVar17 = piVar17 + 1;
        } while (uVar32 != 0);
      }
      cVar27 = *(char *)(unaff_x27 + lVar22);
      lVar22 = lVar22 + 1;
      unaff_x26 = in_stack_00000058;
    }
    if (cVar27 != '\0') {
      uVar12 = 0;
      uVar32 = 0;
      do {
        pbVar8 = (byte *)(unaff_x27 + lVar22);
        lVar22 = lVar22 + 1;
        uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
        uVar32 = (ulong)uVar19;
        uVar12 = uVar12 + 7;
      } while ((char)*pbVar8 < '\0');
      if ((int)uVar19 < 0) {
LAB_00701edc:
        func_0x006f36f4();
code_r0x00701ee4:
        puVar11 = (undefined8 *)___stack_chk_fail();
        if (puVar11[4] != 0) {
          func_0x006f3a2c(puVar11[3],puVar11[4],puVar11[5] << 3,0);
        }
        if (puVar11[1] != 0) {
          func_0x006f3a2c(*puVar11,puVar11[1],puVar11[2] << 3,0);
        }
        return puVar11;
      }
      lVar10 = func_0x006f3708();
      *(long *)(unaff_x24 + 0x48) = lVar10 - (unaff_x24 + 0x48);
      *(uint *)(unaff_x24 + 0x90) = uVar19;
      if (uVar19 != 0) {
        uVar16 = 0;
        lVar25 = lVar22;
        do {
          uVar12 = 0;
          uVar19 = 0;
          lVar22 = lVar25 + 3;
          pbVar8 = (byte *)(unaff_x26 + lVar25);
          do {
            pbVar30 = pbVar8;
            lVar28 = lVar22;
            pbVar29 = (byte *)(unaff_x27 + lVar25);
            lVar25 = lVar25 + 1;
            uVar19 = (*pbVar29 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
            uVar12 = uVar12 + 7;
            lVar22 = lVar28 + 1;
            pbVar8 = pbVar30 + 1;
          } while ((char)*pbVar29 < '\0');
          if (uVar19 == 0) {
            uVar9 = 0;
          }
          else {
            uVar9 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar19 - 1) * 8);
          }
          uVar12 = 0;
          uVar19 = 0;
          *(undefined8 *)(lVar10 + uVar16 * unaff_x22) = uVar9;
          do {
            pbVar29 = pbVar30;
            lVar22 = lVar28;
            pbVar8 = (byte *)(unaff_x27 + lVar25);
            lVar25 = lVar25 + 1;
            uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
            uVar12 = uVar12 + 7;
            lVar28 = lVar22 + 1;
            pbVar30 = pbVar29 + 1;
          } while ((char)*pbVar8 < '\0');
          uVar12 = 0;
          uVar21 = 0;
          *(uint *)(lVar10 + uVar16 * unaff_x22 + 8) = uVar19;
          do {
            pbVar8 = pbVar29 + 1;
            bVar5 = *pbVar29;
            uVar21 = (bVar5 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar21;
            uVar12 = uVar12 + 7;
            lVar22 = lVar22 + 1;
            pbVar29 = pbVar8;
          } while ((char)bVar5 < '\0');
          lVar25 = lVar10 + uVar16 * unaff_x22;
          *(uint *)(lVar25 + 0xc) = uVar21;
          *(byte *)(lVar25 + 0x10) = *pbVar8;
          uVar16 = uVar16 + 1;
          lVar25 = lVar22;
        } while (uVar16 != uVar32);
      }
      uVar12 = 0;
      uVar32 = 0;
      do {
        pbVar8 = (byte *)(unaff_x27 + lVar22);
        lVar22 = lVar22 + 1;
        uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
        uVar32 = (ulong)uVar19;
        uVar12 = uVar12 + 7;
      } while ((char)*pbVar8 < '\0');
      if ((int)uVar19 < 0) goto LAB_00701edc;
      lVar10 = func_0x006f3708();
      plVar15 = (long *)(unaff_x24 + 0x50);
      *(long *)(unaff_x24 + 0x50) = (long)plVar15 - lVar10;
      *(uint *)(unaff_x24 + 0x94) = uVar19;
      if (uVar19 != 0) {
        uVar16 = 0;
        do {
          while( true ) {
            uVar12 = 0;
            uVar19 = 0;
            do {
              pbVar8 = (byte *)(unaff_x27 + lVar22);
              lVar22 = lVar22 + 1;
              uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
              uVar12 = uVar12 + 7;
            } while ((char)*pbVar8 < '\0');
            if (uVar19 == 0) break;
            *(undefined8 *)((long)plVar15 + (uVar16 * 8 - *plVar15)) =
                 *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar19 - 1) * 8);
            uVar16 = uVar16 + 1;
            if (uVar16 == uVar32) goto LAB_00701280;
          }
          *(undefined8 *)((long)plVar15 + (uVar16 * 8 - *plVar15)) = 0;
          uVar16 = uVar16 + 1;
        } while (uVar16 != uVar32);
      }
    }
LAB_00701280:
    *(byte *)(unaff_x24 + 7) = *(byte *)(unaff_x24 + 7) | 0x10;
    *(long *)(*(long *)(unaff_x19 + 0x20) + in_stack_00000068 * 8) = unaff_x24;
    in_stack_00000068 = in_stack_00000068 + 1;
    if (in_stack_00000068 == in_stack_00000040) {
      pcVar26 = (char *)(unaff_x27 + lVar22);
      do {
        cVar27 = *pcVar26;
        pcVar26 = pcVar26 + 1;
      } while (cVar27 < '\0');
      if ((*(byte *)(unaff_x20 + 1) >> 2 & 1) != 0) {
        func_0x006f0ed4();
      }
      puVar11 = (undefined8 *)func_0x006ef684();
      puVar18 = *(undefined8 **)(unaff_x20 + 8);
      *puVar18 = puVar11;
      *(undefined4 *)((long)puVar18 + 0xc) = 7;
      lVar22 = *(long *)(unaff_x20 + 8);
      if (*(long *)(unaff_x20 + 0x28) - lVar22 < 0x11) {
        puVar11 = (undefined8 *)func_0x006ee1d4();
        lVar22 = *(long *)(unaff_x20 + 8);
      }
      *(long *)(unaff_x20 + 8) = lVar22 + 0x10;
      *(undefined4 *)(unaff_x19 + 0x4c) = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return puVar11;
      }
      goto code_r0x00701ee4;
    }
    unaff_x24 = func_0x006ef5d0();
    *(long *)(unaff_x24 + 0x58) = unaff_x24 + 0x58 + in_stack_00000050;
    *(int *)(unaff_x24 + 0xa8) = (int)in_stack_00000068;
    puVar3 = (undefined1 *)(unaff_x27 + lVar22);
    *(undefined1 *)(unaff_x24 + 6) = *puVar3;
    *(undefined1 *)(unaff_x24 + 4) = puVar3[1];
    *(undefined1 *)(unaff_x24 + 3) = puVar3[2];
    unaff_x23 = lVar22 + 4;
    *(undefined1 *)(unaff_x24 + 5) = puVar3[3];
    if (3 < in_stack_00000048) {
      puVar3 = (undefined1 *)(unaff_x27 + unaff_x23);
      unaff_x23 = lVar22 + 5;
      *(undefined1 *)(unaff_x24 + 7) = *puVar3;
      if (in_stack_00000030 == 1) {
        uVar12 = 0;
        uVar32 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x23);
          unaff_x23 = unaff_x23 + 1;
          uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
          uVar32 = (ulong)uVar19;
          uVar12 = uVar12 + 7;
        } while ((char)*pbVar8 < '\0');
        if (uVar19 != 0) {
          uVar12 = 3;
          if (0x7f < uVar19) {
            uVar12 = 4;
          }
          pbVar8 = (byte *)func_0x006f3708();
          puVar2 = (ulong *)(unaff_x24 + 0x70);
          *(ulong *)(unaff_x24 + 0x70) = (ulong)pbVar8 ^ (ulong)puVar2;
          *(uint *)(unaff_x24 + 0xac) = uVar12 + uVar19;
          if (uVar19 < 0x80) {
            *pbVar8 = (byte)uVar19;
            lVar10 = 1;
            lVar22 = 2;
          }
          else {
            *pbVar8 = (byte)uVar19 | 0x80;
            *(char *)((*puVar2 ^ (ulong)puVar2) + 1) = (char)(uVar19 >> 7);
            lVar10 = 2;
            lVar22 = 3;
          }
          *(undefined1 *)((*puVar2 ^ (ulong)puVar2) + lVar10) = 0;
          *(undefined1 *)((*puVar2 ^ (ulong)puVar2) + lVar22) = 0;
          _memcpy((*puVar2 ^ (ulong)puVar2) + (ulong)uVar12,unaff_x27 + unaff_x23,uVar32);
          unaff_x23 = uVar32 + unaff_x23;
        }
      }
      else if (in_stack_00000028._4_4_ == 2) {
        uVar12 = 0;
        uVar32 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x23);
          unaff_x23 = unaff_x23 + 1;
          uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
          uVar32 = (ulong)uVar19;
          uVar12 = uVar12 + 7;
        } while ((char)*pbVar8 < '\0');
        if (uVar19 != 0) {
          uVar16 = func_0x006f3708();
          puVar2 = (ulong *)(unaff_x24 + 0x70);
          *(ulong *)(unaff_x24 + 0x70) = uVar16 ^ (ulong)puVar2;
          *(uint *)(unaff_x24 + 0xac) = uVar19;
          _memcpy(uVar16,unaff_x27 + unaff_x23,uVar32);
          unaff_x23 = uVar32 + unaff_x23;
          if (in_stack_00000030 == 3) {
            lVar22 = 0;
            uVar12 = 0;
            uVar16 = 0;
            uVar32 = *puVar2 ^ (ulong)puVar2;
            pbVar8 = (byte *)(uVar32 + 5);
            lVar10 = uVar32 + 3;
            do {
              lVar25 = lVar10;
              pbVar30 = pbVar8;
              pbVar29 = (byte *)(uVar32 + lVar22);
              lVar22 = lVar22 + 1;
              uVar19 = (*pbVar29 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar16;
              uVar16 = (ulong)uVar19;
              uVar12 = uVar12 + 7;
              pbVar8 = pbVar30 + 1;
              lVar10 = lVar25 + 1;
            } while ((char)*pbVar29 < '\0');
            uVar12 = 0;
            uVar13 = 0;
            pbVar8 = (byte *)(lVar25 + uVar16);
            do {
              pbVar31 = pbVar8;
              pbVar24 = pbVar30;
              pbVar29 = (byte *)(uVar32 + lVar22);
              lVar22 = lVar22 + 1;
              uVar21 = (*pbVar29 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar13;
              uVar13 = (ulong)uVar21;
              uVar12 = uVar12 + 7;
              pbVar30 = pbVar24 + 1;
              pbVar8 = pbVar31 + 1;
            } while ((char)*pbVar29 < '\0');
            uVar12 = 0;
            uVar23 = 0;
            do {
              pbVar30 = pbVar31;
              pbVar29 = pbVar24;
              pbVar8 = (byte *)(uVar32 + lVar22);
              lVar22 = lVar22 + 1;
              uVar23 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar23;
              uVar12 = uVar12 + 7;
              pbVar24 = pbVar29 + 1;
              pbVar31 = pbVar30 + 1;
            } while ((char)*pbVar8 < '\0');
            if (uVar19 != 0) {
              if (2 < uVar19) {
                lVar10 = uVar16 - 2;
                do {
                  if (*pbVar29 - 0x40 < 0x20) {
                    *pbVar29 = (&uStack0000000000000080)[*pbVar29 - 0x40];
                  }
                  pbVar29 = pbVar29 + 1;
                  lVar10 = lVar10 + -1;
                } while (lVar10 != 0);
              }
              lVar22 = lVar22 + uVar16;
            }
            if (uVar21 != 0) {
              uVar16 = uVar13;
              do {
                if (*pbVar30 - 0x40 < 0x20) {
                  *pbVar30 = (&uStack0000000000000080)[*pbVar30 - 0x40];
                }
                pbVar30 = pbVar30 + 1;
                uVar16 = uVar16 - 1;
              } while (uVar16 != 0);
              lVar22 = lVar22 + uVar13;
            }
            if (uVar23 != 0) {
              uVar12 = 0;
              do {
                uVar19 = (int)*(char *)(uVar32 + lVar22) - 0x40;
                if (uVar19 < 0x20) {
                  *(undefined1 *)(uVar32 + lVar22) = (&uStack0000000000000080)[uVar19];
                }
                lVar22 = lVar22 + 2;
                do {
                  pcVar26 = (char *)(uVar32 + lVar22);
                  lVar22 = lVar22 + 1;
                } while (*pcVar26 < '\0');
                do {
                  pcVar26 = (char *)(uVar32 + lVar22);
                  lVar22 = lVar22 + 1;
                } while (*pcVar26 < '\0');
                uVar12 = uVar12 + 1;
              } while (uVar12 != uVar23);
            }
          }
        }
      }
    }
    uVar12 = 0;
    uVar19 = 0;
    do {
      pbVar8 = (byte *)(unaff_x27 + unaff_x23);
      unaff_x23 = unaff_x23 + 1;
      uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
      uVar12 = uVar12 + 7;
    } while ((char)*pbVar8 < '\0');
    if ((int)uVar19 < 0) goto LAB_00701edc;
    lVar22 = func_0x006f3708();
    *(long *)(unaff_x24 + 0x10) = lVar22;
    *(uint *)(unaff_x24 + 0x88) = uVar19;
    if (uVar19 != 0) {
      lVar10 = 0;
      do {
        puVar14 = (undefined4 *)(unaff_x27 + unaff_x23);
        unaff_x23 = unaff_x23 + 4;
        *(undefined4 *)(lVar22 + lVar10 * 4) = *puVar14;
        lVar25 = lRam0000000000a40850;
        lVar10 = lVar10 + 1;
      } while (lVar10 < *(int *)(unaff_x24 + 0x88));
      if (0 < *(int *)(unaff_x24 + 0x88)) {
        lVar10 = 0;
        do {
          uVar12 = *(uint *)(lVar22 + lVar10 * 4);
          lVar28 = 2;
          switch(uVar12 * -0x35 & 0xff) {
          case 7:
          case 8:
          case 0xc:
          case 0xf:
          case 0x10:
          case 0x14:
          case 0x1b:
          case 0x1c:
          case 0x1d:
          case 0x1e:
          case 0x1f:
          case 0x20:
          case 0x35:
          case 0x37:
          case 0x3a:
          case 0x3c:
          case 0x42:
          case 0x4a:
          case 0x4b:
          case 0x4d:
          case 0x4e:
          case 0x4f:
          case 0x50:
            break;
          default:
            lVar28 = 1;
          }
          *(uint *)(lVar22 + lVar10 * 4) =
               uVar12 & 0xffffff00 | (uint)*(byte *)(lVar25 + ((ulong)uVar12 & 0xff));
          lVar10 = lVar28 + lVar10;
        } while ((int)lVar10 < *(int *)(unaff_x24 + 0x88));
      }
    }
    uVar12 = 0;
    uVar32 = 0;
    *(long *)(unaff_x24 + 0x20) = lVar22;
    do {
      pbVar8 = (byte *)(unaff_x27 + unaff_x23);
      unaff_x23 = unaff_x23 + 1;
      uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
      uVar32 = (ulong)uVar19;
      uVar12 = uVar12 + 7;
    } while ((char)*pbVar8 < '\0');
    if ((int)uVar19 < 0) goto LAB_00701edc;
    lVar22 = func_0x006f3708();
    *(long *)(unaff_x24 + 8) = lVar22;
    *(uint *)(unaff_x24 + 0x98) = uVar19;
    if (uVar19 != 0) {
      if (uVar19 < 4) {
        uVar13 = 0;
code_r0x007016bc:
        lVar10 = uVar32 - uVar13;
        puVar14 = (undefined4 *)(lVar22 + uVar13 * 0x10 + 0xc);
        do {
          *puVar14 = 0;
          lVar10 = lVar10 + -1;
          puVar14 = puVar14 + 4;
        } while (lVar10 != 0);
      }
      else {
        uVar13 = uVar32 & 0xfffffffc;
        puVar14 = (undefined4 *)(lVar22 + 0x2c);
        uVar16 = uVar13;
        do {
          puVar14[-8] = 0;
          puVar14[-4] = 0;
          *puVar14 = 0;
          puVar14[4] = 0;
          puVar14 = puVar14 + 0x10;
          uVar16 = uVar16 - 4;
        } while (uVar16 != 0);
        if (uVar13 != uVar32) goto code_r0x007016bc;
      }
      if (0 < (int)uVar19) {
        lVar22 = 0;
        lVar10 = unaff_x23;
        do {
          unaff_x23 = lVar10 + 1;
          switch(*(undefined1 *)(unaff_x27 + lVar10)) {
          case 1:
            pbVar8 = (byte *)(unaff_x27 + unaff_x23);
            unaff_x23 = lVar10 + 2;
            puVar4 = (uint *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *puVar4 = (uint)*pbVar8;
            puVar4[3] = 1;
            break;
          case 2:
            puVar18 = (undefined8 *)(unaff_x27 + unaff_x23);
            unaff_x23 = lVar10 + 9;
            puVar11 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *puVar11 = *puVar18;
            *(undefined4 *)((long)puVar11 + 0xc) = 3;
            break;
          case 3:
            uVar12 = 0;
            uVar19 = 0;
            do {
              pbVar8 = (byte *)(unaff_x27 + unaff_x23);
              unaff_x23 = unaff_x23 + 1;
              uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
              uVar12 = uVar12 + 7;
            } while ((char)*pbVar8 < '\0');
            if (uVar19 == 0) {
              uVar9 = 0;
            }
            else {
              uVar9 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar19 - 1) * 8);
            }
            puVar11 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *puVar11 = uVar9;
            *(undefined4 *)((long)puVar11 + 0xc) = 5;
            break;
          case 4:
            if (*(char *)(*(long *)(unaff_x20 + 0x58) + 5) == '\0') {
              lVar25 = *(long *)(unaff_x20 + 8);
              *(undefined4 *)(lVar25 + 0xc) = 0;
              lVar25 = lVar25 + 0x10;
              *(long *)(unaff_x20 + 8) = lVar25;
            }
            else {
              func_0x006e1e34();
              iVar7 = func_0x006eefcc();
              lVar25 = *(long *)(unaff_x20 + 8);
              if (iVar7 != 0) {
                *(undefined4 *)(lVar25 + -4) = 0;
              }
            }
            unaff_x23 = lVar10 + 5;
            uVar9 = *(undefined8 *)(lVar25 + -0x10);
            puVar11 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            puVar11[1] = *(undefined8 *)(lVar25 + -8);
            *puVar11 = uVar9;
            *(long *)(unaff_x20 + 8) = *(long *)(unaff_x20 + 8) + -0x10;
            break;
          case 5:
            uVar12 = 0;
            uVar19 = 0;
            do {
              pbVar8 = (byte *)(unaff_x27 + unaff_x23);
              unaff_x23 = unaff_x23 + 1;
              uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
              uVar12 = uVar12 + 7;
            } while ((char)*pbVar8 < '\0');
            uVar9 = func_0x006fb408();
            if (0 < (int)uVar19) {
              uVar12 = 0;
              do {
                do {
                  pcVar26 = (char *)(unaff_x27 + unaff_x23);
                  unaff_x23 = unaff_x23 + 1;
                } while (*pcVar26 < '\0');
                puVar11 = (undefined8 *)func_0x006fbae8();
                *puVar11 = 0;
                *(undefined4 *)((long)puVar11 + 0xc) = 3;
                uVar12 = uVar12 + 1;
              } while (uVar12 != uVar19);
            }
            puVar11 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *puVar11 = uVar9;
            *(undefined4 *)((long)puVar11 + 0xc) = 6;
            break;
          case 6:
            do {
              pcVar26 = (char *)(unaff_x27 + unaff_x23);
              unaff_x23 = unaff_x23 + 1;
            } while (*pcVar26 < '\0');
            lVar10 = func_0x006ef684();
            *(bool *)(lVar10 + 6) = *(char *)(lVar10 + 4) != '\0';
            plVar15 = (long *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *plVar15 = lVar10;
            uVar33 = 7;
            goto code_r0x00701708;
          case 7:
            uVar33 = *(undefined4 *)(lVar10 + unaff_x27 + 9);
            plVar6 = (long *)(unaff_x27 + unaff_x23);
            unaff_x23 = lVar10 + 0x11;
            plVar15 = (long *)(*(long *)(unaff_x24 + 8) + lVar22 * 0x10);
            *plVar15 = *plVar6;
            *(undefined4 *)(plVar15 + 1) = uVar33;
            uVar33 = 4;
code_r0x00701708:
            *(undefined4 *)((long)plVar15 + 0xc) = uVar33;
          }
          lVar22 = lVar22 + 1;
          lVar10 = unaff_x23;
        } while (lVar22 < *(int *)(unaff_x24 + 0x98));
      }
    }
    uVar12 = 0;
    uVar32 = 0;
    do {
      pbVar8 = (byte *)(unaff_x27 + unaff_x23);
      unaff_x23 = unaff_x23 + 1;
      uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | (uint)uVar32;
      uVar32 = (ulong)uVar19;
      uVar12 = uVar12 + 7;
    } while ((char)*pbVar8 < '\0');
    if ((int)uVar19 < 0) goto LAB_00701edc;
    uVar9 = func_0x006f3708();
    *(undefined8 *)(unaff_x24 + 0x18) = uVar9;
    *(uint *)(unaff_x24 + 0x8c) = uVar19;
    if (uVar19 != 0) {
      uVar16 = 0;
      do {
        uVar12 = 0;
        uVar19 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x23);
          unaff_x23 = unaff_x23 + 1;
          uVar19 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | uVar19;
          uVar12 = uVar12 + 7;
        } while ((char)*pbVar8 < '\0');
        *(undefined8 *)(*(long *)(unaff_x24 + 0x18) + uVar16 * 8) =
             *(undefined8 *)(*(long *)(unaff_x19 + 0x20) + (ulong)uVar19 * 8);
        uVar16 = uVar16 + 1;
      } while (uVar16 != uVar32);
    }
    uVar12 = 0;
    in_w10 = 0;
    pcVar26 = (char *)(in_stack_00000038 + unaff_x23);
    do {
      param_1 = pcVar26;
      pbVar8 = (byte *)(unaff_x27 + unaff_x23);
      unaff_x23 = unaff_x23 + 1;
      in_w10 = (*pbVar8 & 0x7f) << (ulong)(uVar12 & 0x1f) | in_w10;
      uVar12 = uVar12 + 7;
      pcVar26 = param_1 + 1;
    } while ((char)*pbVar8 < '\0');
    in_w11 = 0;
    in_w9 = 0;
    unaff_x26 = in_stack_00000058;
  } while( true );
}


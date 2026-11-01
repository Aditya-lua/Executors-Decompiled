
undefined8 * FUN_007013e8(ulong param_1,ulong param_2)

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
  undefined8 *puVar10;
  uint uVar11;
  long lVar12;
  undefined4 *puVar13;
  long *plVar14;
  int *piVar15;
  undefined8 *puVar16;
  uint uVar17;
  uint uVar18;
  int iVar19;
  ulong uVar20;
  uint uVar21;
  byte *pbVar22;
  long lVar23;
  char *pcVar24;
  char cVar25;
  ulong uVar26;
  long lVar27;
  char *pcVar28;
  ulong uVar29;
  byte *pbVar30;
  byte *pbVar31;
  byte *pbVar32;
  long lVar33;
  long unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined4 uVar34;
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
    *(ulong *)(unaff_x24 + 0x70) = param_1;
    *(int *)(unaff_x24 + 0xac) = (int)unaff_x25;
    _memcpy(param_2,unaff_x26,unaff_x25);
    unaff_x28 = unaff_x25 + unaff_x28;
    if (in_stack_00000030 == 3) {
      lVar12 = 0;
      uVar11 = 0;
      uVar26 = 0;
      uVar20 = *unaff_x21 ^ (ulong)unaff_x21;
      pbVar8 = (byte *)(uVar20 + 5);
      lVar33 = uVar20 + 3;
      do {
        lVar23 = lVar33;
        pbVar31 = pbVar8;
        pbVar30 = (byte *)(uVar20 + lVar12);
        lVar12 = lVar12 + 1;
        uVar17 = (*pbVar30 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar26;
        uVar26 = (ulong)uVar17;
        uVar11 = uVar11 + 7;
        pbVar8 = pbVar31 + 1;
        lVar33 = lVar23 + 1;
      } while ((char)*pbVar30 < '\0');
      uVar11 = 0;
      uVar29 = 0;
      pbVar8 = (byte *)(lVar23 + uVar26);
      do {
        pbVar32 = pbVar8;
        pbVar22 = pbVar31;
        pbVar30 = (byte *)(uVar20 + lVar12);
        lVar12 = lVar12 + 1;
        uVar18 = (*pbVar30 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar29;
        uVar29 = (ulong)uVar18;
        uVar11 = uVar11 + 7;
        pbVar31 = pbVar22 + 1;
        pbVar8 = pbVar32 + 1;
      } while ((char)*pbVar30 < '\0');
      uVar11 = 0;
      uVar21 = 0;
      do {
        pbVar31 = pbVar32;
        pbVar30 = pbVar22;
        pbVar8 = (byte *)(uVar20 + lVar12);
        lVar12 = lVar12 + 1;
        uVar21 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar21;
        uVar11 = uVar11 + 7;
        pbVar22 = pbVar30 + 1;
        pbVar32 = pbVar31 + 1;
      } while ((char)*pbVar8 < '\0');
      if (uVar17 != 0) {
        if (2 < uVar17) {
          lVar33 = uVar26 - 2;
          do {
            if (*pbVar30 - 0x40 < 0x20) {
              *pbVar30 = (&uStack0000000000000080)[*pbVar30 - 0x40];
            }
            pbVar30 = pbVar30 + 1;
            lVar33 = lVar33 + -1;
          } while (lVar33 != 0);
        }
        lVar12 = lVar12 + uVar26;
      }
      if (uVar18 != 0) {
        uVar26 = uVar29;
        do {
          if (*pbVar31 - 0x40 < 0x20) {
            *pbVar31 = (&uStack0000000000000080)[*pbVar31 - 0x40];
          }
          pbVar31 = pbVar31 + 1;
          uVar26 = uVar26 - 1;
        } while (uVar26 != 0);
        lVar12 = lVar12 + uVar29;
      }
      if (uVar21 != 0) {
        uVar11 = 0;
        do {
          uVar17 = (int)*(char *)(uVar20 + lVar12) - 0x40;
          if (uVar17 < 0x20) {
            *(undefined1 *)(uVar20 + lVar12) = (&uStack0000000000000080)[uVar17];
          }
          lVar12 = lVar12 + 2;
          do {
            pcVar24 = (char *)(uVar20 + lVar12);
            lVar12 = lVar12 + 1;
          } while (*pcVar24 < '\0');
          do {
            pcVar24 = (char *)(uVar20 + lVar12);
            lVar12 = lVar12 + 1;
          } while (*pcVar24 < '\0');
          uVar11 = uVar11 + 1;
        } while (uVar11 != uVar21);
      }
    }
LAB_0070154c:
    do {
      do {
        uVar11 = 0;
        uVar17 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x28);
          unaff_x28 = unaff_x28 + 1;
          uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
          uVar11 = uVar11 + 7;
        } while ((char)*pbVar8 < '\0');
        if ((int)uVar17 < 0) {
LAB_00701edc:
          func_0x006f36f4();
          goto code_r0x00701ee4;
        }
        lVar12 = func_0x006f3708();
        *(long *)(unaff_x24 + 0x10) = lVar12;
        *(uint *)(unaff_x24 + 0x88) = uVar17;
        if (uVar17 != 0) {
          lVar33 = 0;
          do {
            puVar13 = (undefined4 *)(unaff_x27 + unaff_x28);
            unaff_x28 = unaff_x28 + 4;
            *(undefined4 *)(lVar12 + lVar33 * 4) = *puVar13;
            lVar23 = lRam0000000000a40850;
            lVar33 = lVar33 + 1;
          } while (lVar33 < *(int *)(unaff_x24 + 0x88));
          if (0 < *(int *)(unaff_x24 + 0x88)) {
            lVar33 = 0;
            do {
              uVar11 = *(uint *)(lVar12 + lVar33 * 4);
              lVar27 = 2;
              switch(uVar11 * -0x35 & 0xff) {
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
                lVar27 = 1;
              }
              *(uint *)(lVar12 + lVar33 * 4) =
                   uVar11 & 0xffffff00 | (uint)*(byte *)(lVar23 + ((ulong)uVar11 & 0xff));
              lVar33 = lVar27 + lVar33;
            } while ((int)lVar33 < *(int *)(unaff_x24 + 0x88));
          }
        }
        uVar11 = 0;
        uVar20 = 0;
        *(long *)(unaff_x24 + 0x20) = lVar12;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x28);
          unaff_x28 = unaff_x28 + 1;
          uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar20;
          uVar20 = (ulong)uVar17;
          uVar11 = uVar11 + 7;
        } while ((char)*pbVar8 < '\0');
        if ((int)uVar17 < 0) goto LAB_00701edc;
        lVar12 = func_0x006f3708();
        *(long *)(unaff_x24 + 8) = lVar12;
        *(uint *)(unaff_x24 + 0x98) = uVar17;
        if (uVar17 != 0) {
          if (uVar17 < 4) {
            uVar29 = 0;
LAB_007016bc:
            lVar33 = uVar20 - uVar29;
            puVar13 = (undefined4 *)(lVar12 + uVar29 * 0x10 + 0xc);
            do {
              *puVar13 = 0;
              lVar33 = lVar33 + -1;
              puVar13 = puVar13 + 4;
            } while (lVar33 != 0);
          }
          else {
            uVar29 = uVar20 & 0xfffffffc;
            puVar13 = (undefined4 *)(lVar12 + 0x2c);
            uVar26 = uVar29;
            do {
              puVar13[-8] = 0;
              puVar13[-4] = 0;
              *puVar13 = 0;
              puVar13[4] = 0;
              puVar13 = puVar13 + 0x10;
              uVar26 = uVar26 - 4;
            } while (uVar26 != 0);
            if (uVar29 != uVar20) goto LAB_007016bc;
          }
          if (0 < (int)uVar17) {
            lVar12 = 0;
            lVar33 = unaff_x28;
            do {
              unaff_x28 = lVar33 + 1;
              switch(*(undefined1 *)(unaff_x27 + lVar33)) {
              case 1:
                pbVar8 = (byte *)(unaff_x27 + unaff_x28);
                unaff_x28 = lVar33 + 2;
                puVar4 = (uint *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *puVar4 = (uint)*pbVar8;
                puVar4[3] = 1;
                break;
              case 2:
                puVar16 = (undefined8 *)(unaff_x27 + unaff_x28);
                unaff_x28 = lVar33 + 9;
                puVar10 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *puVar10 = *puVar16;
                *(undefined4 *)((long)puVar10 + 0xc) = 3;
                break;
              case 3:
                uVar11 = 0;
                uVar17 = 0;
                do {
                  pbVar8 = (byte *)(unaff_x27 + unaff_x28);
                  unaff_x28 = unaff_x28 + 1;
                  uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
                  uVar11 = uVar11 + 7;
                } while ((char)*pbVar8 < '\0');
                if (uVar17 == 0) {
                  uVar9 = 0;
                }
                else {
                  uVar9 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar17 - 1) * 8);
                }
                puVar10 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *puVar10 = uVar9;
                *(undefined4 *)((long)puVar10 + 0xc) = 5;
                break;
              case 4:
                if (*(char *)(*(long *)(unaff_x20 + 0x58) + 5) == '\0') {
                  lVar23 = *(long *)(unaff_x20 + 8);
                  *(undefined4 *)(lVar23 + 0xc) = 0;
                  lVar23 = lVar23 + 0x10;
                  *(long *)(unaff_x20 + 8) = lVar23;
                }
                else {
                  func_0x006e1e34();
                  iVar7 = func_0x006eefcc();
                  lVar23 = *(long *)(unaff_x20 + 8);
                  if (iVar7 != 0) {
                    *(undefined4 *)(lVar23 + -4) = 0;
                  }
                }
                unaff_x28 = lVar33 + 5;
                uVar9 = *(undefined8 *)(lVar23 + -0x10);
                puVar10 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                puVar10[1] = *(undefined8 *)(lVar23 + -8);
                *puVar10 = uVar9;
                *(long *)(unaff_x20 + 8) = *(long *)(unaff_x20 + 8) + -0x10;
                break;
              case 5:
                uVar11 = 0;
                uVar17 = 0;
                do {
                  pbVar8 = (byte *)(unaff_x27 + unaff_x28);
                  unaff_x28 = unaff_x28 + 1;
                  uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
                  uVar11 = uVar11 + 7;
                } while ((char)*pbVar8 < '\0');
                uVar9 = func_0x006fb408();
                if (0 < (int)uVar17) {
                  uVar11 = 0;
                  do {
                    do {
                      pcVar24 = (char *)(unaff_x27 + unaff_x28);
                      unaff_x28 = unaff_x28 + 1;
                    } while (*pcVar24 < '\0');
                    puVar10 = (undefined8 *)func_0x006fbae8();
                    *puVar10 = 0;
                    *(undefined4 *)((long)puVar10 + 0xc) = 3;
                    uVar11 = uVar11 + 1;
                  } while (uVar11 != uVar17);
                }
                puVar10 = (undefined8 *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *puVar10 = uVar9;
                *(undefined4 *)((long)puVar10 + 0xc) = 6;
                break;
              case 6:
                do {
                  pcVar24 = (char *)(unaff_x27 + unaff_x28);
                  unaff_x28 = unaff_x28 + 1;
                } while (*pcVar24 < '\0');
                lVar33 = func_0x006ef684();
                *(bool *)(lVar33 + 6) = *(char *)(lVar33 + 4) != '\0';
                plVar14 = (long *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *plVar14 = lVar33;
                uVar34 = 7;
                goto code_r0x00701708;
              case 7:
                uVar34 = *(undefined4 *)(lVar33 + unaff_x27 + 9);
                plVar6 = (long *)(unaff_x27 + unaff_x28);
                unaff_x28 = lVar33 + 0x11;
                plVar14 = (long *)(*(long *)(unaff_x24 + 8) + lVar12 * 0x10);
                *plVar14 = *plVar6;
                *(undefined4 *)(plVar14 + 1) = uVar34;
                uVar34 = 4;
code_r0x00701708:
                *(undefined4 *)((long)plVar14 + 0xc) = uVar34;
              }
              lVar12 = lVar12 + 1;
              lVar33 = unaff_x28;
            } while (lVar12 < *(int *)(unaff_x24 + 0x98));
          }
        }
        uVar11 = 0;
        uVar20 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x28);
          unaff_x28 = unaff_x28 + 1;
          uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar20;
          uVar20 = (ulong)uVar17;
          uVar11 = uVar11 + 7;
        } while ((char)*pbVar8 < '\0');
        if ((int)uVar17 < 0) goto LAB_00701edc;
        uVar9 = func_0x006f3708();
        *(undefined8 *)(unaff_x24 + 0x18) = uVar9;
        *(uint *)(unaff_x24 + 0x8c) = uVar17;
        if (uVar17 != 0) {
          uVar26 = 0;
          do {
            uVar11 = 0;
            uVar17 = 0;
            do {
              pbVar8 = (byte *)(unaff_x27 + unaff_x28);
              unaff_x28 = unaff_x28 + 1;
              uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
              uVar11 = uVar11 + 7;
            } while ((char)*pbVar8 < '\0');
            *(undefined8 *)(*(long *)(unaff_x24 + 0x18) + uVar26 * 8) =
                 *(undefined8 *)(*(long *)(unaff_x19 + 0x20) + (ulong)uVar17 * 8);
            uVar26 = uVar26 + 1;
          } while (uVar26 != uVar20);
        }
        uVar11 = 0;
        uVar17 = 0;
        pcVar24 = (char *)(in_stack_00000038 + unaff_x28);
        do {
          pcVar28 = pcVar24;
          pbVar8 = (byte *)(unaff_x27 + unaff_x28);
          unaff_x28 = unaff_x28 + 1;
          uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
          uVar11 = uVar11 + 7;
          pcVar24 = pcVar28 + 1;
        } while ((char)*pbVar8 < '\0');
        uVar11 = 0;
        uVar18 = 0;
        *(uint *)(unaff_x24 + 0xa4) = uVar17;
        do {
          lVar12 = unaff_x28;
          pcVar24 = pcVar28;
          unaff_x28 = lVar12 + 1;
          uVar18 = (*(byte *)(unaff_x27 + lVar12) & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar18;
          uVar11 = uVar11 + 7;
          pcVar28 = pcVar24 + 1;
        } while ((char)*(byte *)(unaff_x27 + lVar12) < '\0');
        if (uVar18 == 0) {
          *(long *)(unaff_x24 + 0x60) = -(unaff_x24 + 0x60);
          if (*(char *)(unaff_x27 + unaff_x28) != '\0') goto LAB_00701a8c;
LAB_00701b7c:
          cVar25 = *(char *)(unaff_x27 + lVar12 + 2);
          lVar12 = lVar12 + 3;
        }
        else {
          *(long *)(unaff_x24 + 0x60) =
               *(long *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar18 - 1) * 8) - (unaff_x24 + 0x60);
          if (*(char *)(unaff_x27 + unaff_x28) == '\0') goto LAB_00701b7c;
LAB_00701a8c:
          lVar12 = lVar12 + 3;
          uVar11 = (uint)*(byte *)(unaff_x27 + unaff_x28 + 1);
          *(uint *)(unaff_x24 + 0xa0) = uVar11;
          iVar7 = *(int *)(unaff_x24 + 0x88) + -1 >> (uVar11 & 0x1f);
          uVar20 = (long)*(int *)(unaff_x24 + 0x88) + 3U & 0xfffffffffffffffc;
          lVar33 = func_0x006f3708();
          *(int *)(unaff_x24 + 0x9c) = (int)uVar20 + iVar7 * 4 + 4;
          puVar2 = (ulong *)(unaff_x24 + 0x40);
          *(long *)(unaff_x24 + 0x38) = lVar33 + unaff_x24 + 0x38;
          *(ulong *)(unaff_x24 + 0x40) = lVar33 + uVar20 ^ (ulong)puVar2;
          if (0 < *(int *)(unaff_x24 + 0x88)) {
            lVar33 = 0;
            cVar25 = '\0';
            do {
              lVar12 = lVar12 + 1;
              cVar25 = *pcVar24 + cVar25;
              *(char *)((*(long *)(unaff_x24 + 0x38) - (unaff_x24 + 0x38)) + lVar33) = cVar25;
              lVar33 = lVar33 + 1;
              pcVar24 = pcVar24 + 1;
            } while (lVar33 < *(int *)(unaff_x24 + 0x88));
          }
          if (-1 < iVar7) {
            iVar19 = 0;
            uVar20 = (ulong)(iVar7 + 1);
            piVar15 = (int *)(*puVar2 ^ (ulong)puVar2);
            do {
              piVar1 = (int *)(unaff_x27 + lVar12);
              lVar12 = lVar12 + 4;
              iVar19 = *piVar1 + iVar19;
              *piVar15 = iVar19;
              uVar20 = uVar20 - 1;
              piVar15 = piVar15 + 1;
            } while (uVar20 != 0);
          }
          cVar25 = *(char *)(unaff_x27 + lVar12);
          lVar12 = lVar12 + 1;
        }
        if (cVar25 != '\0') {
          uVar11 = 0;
          uVar20 = 0;
          do {
            pbVar8 = (byte *)(unaff_x27 + lVar12);
            lVar12 = lVar12 + 1;
            uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar20;
            uVar20 = (ulong)uVar17;
            uVar11 = uVar11 + 7;
          } while ((char)*pbVar8 < '\0');
          if (-1 < (int)uVar17) {
            lVar33 = func_0x006f3708();
            *(long *)(unaff_x24 + 0x48) = lVar33 - (unaff_x24 + 0x48);
            *(uint *)(unaff_x24 + 0x90) = uVar17;
            if (uVar17 != 0) {
              uVar26 = 0;
              lVar23 = lVar12;
              do {
                uVar11 = 0;
                uVar17 = 0;
                lVar12 = lVar23 + 3;
                pbVar8 = (byte *)(in_stack_00000058 + lVar23);
                do {
                  pbVar31 = pbVar8;
                  lVar27 = lVar12;
                  pbVar30 = (byte *)(unaff_x27 + lVar23);
                  lVar23 = lVar23 + 1;
                  uVar17 = (*pbVar30 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
                  uVar11 = uVar11 + 7;
                  lVar12 = lVar27 + 1;
                  pbVar8 = pbVar31 + 1;
                } while ((char)*pbVar30 < '\0');
                if (uVar17 == 0) {
                  uVar9 = 0;
                }
                else {
                  uVar9 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar17 - 1) * 8);
                }
                uVar11 = 0;
                uVar17 = 0;
                *(undefined8 *)(lVar33 + uVar26 * unaff_x22) = uVar9;
                do {
                  pbVar30 = pbVar31;
                  lVar12 = lVar27;
                  pbVar8 = (byte *)(unaff_x27 + lVar23);
                  lVar23 = lVar23 + 1;
                  uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
                  uVar11 = uVar11 + 7;
                  lVar27 = lVar12 + 1;
                  pbVar31 = pbVar30 + 1;
                } while ((char)*pbVar8 < '\0');
                uVar11 = 0;
                uVar18 = 0;
                *(uint *)(lVar33 + uVar26 * unaff_x22 + 8) = uVar17;
                do {
                  pbVar8 = pbVar30 + 1;
                  bVar5 = *pbVar30;
                  uVar18 = (bVar5 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar18;
                  uVar11 = uVar11 + 7;
                  lVar12 = lVar12 + 1;
                  pbVar30 = pbVar8;
                } while ((char)bVar5 < '\0');
                lVar23 = lVar33 + uVar26 * unaff_x22;
                *(uint *)(lVar23 + 0xc) = uVar18;
                *(byte *)(lVar23 + 0x10) = *pbVar8;
                uVar26 = uVar26 + 1;
                lVar23 = lVar12;
              } while (uVar26 != uVar20);
            }
            uVar11 = 0;
            uVar20 = 0;
            do {
              pbVar8 = (byte *)(unaff_x27 + lVar12);
              lVar12 = lVar12 + 1;
              uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar20;
              uVar20 = (ulong)uVar17;
              uVar11 = uVar11 + 7;
            } while ((char)*pbVar8 < '\0');
            if (-1 < (int)uVar17) {
              lVar33 = func_0x006f3708();
              plVar14 = (long *)(unaff_x24 + 0x50);
              *(long *)(unaff_x24 + 0x50) = (long)plVar14 - lVar33;
              *(uint *)(unaff_x24 + 0x94) = uVar17;
              if (uVar17 != 0) {
                uVar26 = 0;
                do {
                  while( true ) {
                    uVar11 = 0;
                    uVar17 = 0;
                    do {
                      pbVar8 = (byte *)(unaff_x27 + lVar12);
                      lVar12 = lVar12 + 1;
                      uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | uVar17;
                      uVar11 = uVar11 + 7;
                    } while ((char)*pbVar8 < '\0');
                    if (uVar17 == 0) break;
                    *(undefined8 *)((long)plVar14 + (uVar26 * 8 - *plVar14)) =
                         *(undefined8 *)(*(long *)(unaff_x19 + 8) + (ulong)(uVar17 - 1) * 8);
                    uVar26 = uVar26 + 1;
                    if (uVar26 == uVar20) goto LAB_00701280;
                  }
                  *(undefined8 *)((long)plVar14 + (uVar26 * 8 - *plVar14)) = 0;
                  uVar26 = uVar26 + 1;
                } while (uVar26 != uVar20);
              }
              goto LAB_00701280;
            }
          }
          goto LAB_00701edc;
        }
LAB_00701280:
        *(byte *)(unaff_x24 + 7) = *(byte *)(unaff_x24 + 7) | 0x10;
        *(long *)(*(long *)(unaff_x19 + 0x20) + in_stack_00000068 * 8) = unaff_x24;
        in_stack_00000068 = in_stack_00000068 + 1;
        if (in_stack_00000068 == in_stack_00000040) {
          pcVar24 = (char *)(unaff_x27 + lVar12);
          do {
            cVar25 = *pcVar24;
            pcVar24 = pcVar24 + 1;
          } while (cVar25 < '\0');
          if ((*(byte *)(unaff_x20 + 1) >> 2 & 1) != 0) {
            func_0x006f0ed4();
          }
          puVar10 = (undefined8 *)func_0x006ef684();
          puVar16 = *(undefined8 **)(unaff_x20 + 8);
          *puVar16 = puVar10;
          *(undefined4 *)((long)puVar16 + 0xc) = 7;
          lVar12 = *(long *)(unaff_x20 + 8);
          if (*(long *)(unaff_x20 + 0x28) - lVar12 < 0x11) {
            puVar10 = (undefined8 *)func_0x006ee1d4();
            lVar12 = *(long *)(unaff_x20 + 8);
          }
          *(long *)(unaff_x20 + 8) = lVar12 + 0x10;
          *(undefined4 *)(unaff_x19 + 0x4c) = 0;
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return puVar10;
          }
code_r0x00701ee4:
          puVar10 = (undefined8 *)___stack_chk_fail();
          if (puVar10[4] != 0) {
            func_0x006f3a2c(puVar10[3],puVar10[4],puVar10[5] << 3,0);
          }
          if (puVar10[1] != 0) {
            func_0x006f3a2c(*puVar10,puVar10[1],puVar10[2] << 3,0);
          }
          return puVar10;
        }
        unaff_x24 = func_0x006ef5d0();
        *(long *)(unaff_x24 + 0x58) = unaff_x24 + 0x58 + in_stack_00000050;
        *(int *)(unaff_x24 + 0xa8) = (int)in_stack_00000068;
        puVar3 = (undefined1 *)(unaff_x27 + lVar12);
        *(undefined1 *)(unaff_x24 + 6) = *puVar3;
        *(undefined1 *)(unaff_x24 + 4) = puVar3[1];
        *(undefined1 *)(unaff_x24 + 3) = puVar3[2];
        unaff_x28 = lVar12 + 4;
        *(undefined1 *)(unaff_x24 + 5) = puVar3[3];
      } while (in_stack_00000048 < 4);
      puVar3 = (undefined1 *)(unaff_x27 + unaff_x28);
      unaff_x28 = lVar12 + 5;
      *(undefined1 *)(unaff_x24 + 7) = *puVar3;
      if (in_stack_00000030 == 1) {
        uVar11 = 0;
        uVar20 = 0;
        do {
          pbVar8 = (byte *)(unaff_x27 + unaff_x28);
          unaff_x28 = unaff_x28 + 1;
          uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)uVar20;
          uVar20 = (ulong)uVar17;
          uVar11 = uVar11 + 7;
        } while ((char)*pbVar8 < '\0');
        if (uVar17 != 0) {
          uVar11 = 3;
          if (0x7f < uVar17) {
            uVar11 = 4;
          }
          pbVar8 = (byte *)func_0x006f3708();
          puVar2 = (ulong *)(unaff_x24 + 0x70);
          *(ulong *)(unaff_x24 + 0x70) = (ulong)pbVar8 ^ (ulong)puVar2;
          *(uint *)(unaff_x24 + 0xac) = uVar11 + uVar17;
          if (uVar17 < 0x80) {
            *pbVar8 = (byte)uVar17;
            lVar33 = 1;
            lVar12 = 2;
          }
          else {
            *pbVar8 = (byte)uVar17 | 0x80;
            *(char *)((*puVar2 ^ (ulong)puVar2) + 1) = (char)(uVar17 >> 7);
            lVar33 = 2;
            lVar12 = 3;
          }
          *(undefined1 *)((*puVar2 ^ (ulong)puVar2) + lVar33) = 0;
          *(undefined1 *)((*puVar2 ^ (ulong)puVar2) + lVar12) = 0;
          _memcpy((*puVar2 ^ (ulong)puVar2) + (ulong)uVar11,unaff_x27 + unaff_x28,uVar20);
          unaff_x28 = uVar20 + unaff_x28;
        }
        goto LAB_0070154c;
      }
      if (in_stack_00000028._4_4_ != 2) goto LAB_0070154c;
      uVar11 = 0;
      unaff_x25 = 0;
      do {
        pbVar8 = (byte *)(unaff_x27 + unaff_x28);
        unaff_x28 = unaff_x28 + 1;
        uVar17 = (*pbVar8 & 0x7f) << (ulong)(uVar11 & 0x1f) | (uint)unaff_x25;
        unaff_x25 = (ulong)uVar17;
        uVar11 = uVar11 + 7;
      } while ((char)*pbVar8 < '\0');
    } while (uVar17 == 0);
    unaff_x26 = unaff_x27 + unaff_x28;
    param_2 = func_0x006f3708();
    unaff_x21 = (ulong *)(unaff_x24 + 0x70);
    param_1 = param_2 ^ (ulong)unaff_x21;
  } while( true );
}


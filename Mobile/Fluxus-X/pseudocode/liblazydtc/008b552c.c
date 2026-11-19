/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b552c
 */

ulong FUN_008b552c(long param_1,ulong param_2)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  undefined8 *puVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  char *pcVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  char *pcVar19;
  uint uVar20;
  undefined8 uVar21;
  char *local_88;
  int local_80;
  int local_78;
  int local_74;
  char *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar17 = 0;
  lVar16 = *(long *)(param_1 + 0x60);
  bVar2 = *(byte *)(lVar16 + 1);
  if (bVar2 < 2) {
    if (bVar2 == 0) {
      FUN_008b5fd4(param_1);
      uVar17 = 0;
    }
    else if (bVar2 == 1) {
      uVar17 = 0;
      bVar5 = *(long *)(lVar16 + 0x58) != 0;
      if ((*(long *)(lVar16 + 0x58) != 0) && (param_2 != 0)) {
        uVar17 = 0;
        do {
          lVar8 = FUN_008b64ec(lVar16);
          uVar17 = lVar8 + uVar17;
          bVar5 = *(long *)(lVar16 + 0x58) != 0;
          if (*(long *)(lVar16 + 0x58) == 0) break;
        } while (uVar17 < param_2);
      }
      if (!bVar5) {
        *(undefined8 *)(lVar16 + 0x58) = *(undefined8 *)(lVar16 + 0x60);
        *(undefined8 *)(lVar16 + 0x60) = 0;
        *(undefined1 *)(lVar16 + 1) = 2;
      }
    }
  }
  else if (bVar2 == 4) {
    if ((DAT_00d1f5f8 & 1) == 0) {
      lVar8 = *(long *)(lVar16 + 0x1e8);
      uVar17 = 0;
      if ((lVar8 != 0) && (param_2 != 0)) {
        uVar17 = 0;
        do {
          lVar8 = FUN_008b87e4(lVar8);
          iVar7 = FUN_008b6de4(param_1,*(undefined8 *)(lVar16 + 0x1e8));
          *(long *)(lVar16 + 0x1e8) = lVar8;
          uVar17 = uVar17 + (long)(iVar7 << 4);
          if (lVar8 == 0) break;
        } while (uVar17 < param_2);
      }
      lVar18 = *(long *)(lVar16 + 0x4c0);
      if ((lVar18 != 0) && (uVar17 < param_2)) {
        do {
          lVar18 = FUN_008b87e4(lVar18);
          iVar7 = FUN_008b6de4(param_1,*(undefined8 *)(lVar16 + 0x4c0));
          *(long *)(lVar16 + 0x4c0) = lVar18;
          uVar17 = uVar17 + (long)(iVar7 << 4);
          if (lVar18 == 0) break;
        } while (uVar17 < param_2);
        lVar8 = *(long *)(lVar16 + 0x1e8);
      }
      if (lVar18 == 0 && lVar8 == 0) {
LAB_008b5788:
        *(byte *)(*(long *)(lVar16 + 0x1e0) + 2) =
             *(byte *)(*(long *)(lVar16 + 0x1e0) + 2) & 0xf8 | *(byte *)(lVar16 + 2) & 3;
        uVar1 = *(uint *)(*(long *)(param_1 + 0x60) + 0x2c);
        uVar20 = uVar1 + 3;
        if (-1 < (int)uVar1) {
          uVar20 = uVar1;
        }
        if ((0x40 < (int)uVar1) &&
           (*(uint *)(*(long *)(param_1 + 0x60) + 0x40) < (uint)((int)uVar20 >> 2))) {
          local_88 = (char *)CONCAT44(local_88._4_4_,uVar1 >> 1);
          FUN_008b3edc(param_1,&LAB_008b71fc,&local_88);
        }
        *(undefined1 *)(lVar16 + 1) = 0;
        if ((DAT_00d1f4f8 == '\x01') && (*(code **)(lVar16 + 0x728) != (code *)0x0)) {
          (**(code **)(lVar16 + 0x728))(*(undefined8 *)(lVar16 + 0x1e0));
        }
      }
    }
    else {
      uVar17 = 0;
      if (param_2 != 0) {
        do {
          lVar8 = *(long *)(lVar16 + 0x1e8);
          if (lVar8 == 0) {
            lVar8 = *(long *)(lVar16 + 0x4c0);
            if (lVar8 == 0) {
              iVar7 = *(int *)(lVar16 + 0x3840);
              if (7 < iVar7) goto LAB_008b5788;
              lVar8 = *(long *)(lVar16 + 0x2f08 + (long)iVar7 * 0x150);
              if (lVar8 == 0) {
                *(int *)(lVar16 + 0x3840) = iVar7 + 1;
              }
              else {
                do {
                  lVar8 = FUN_008b87e4(lVar8);
                  if (iVar7 == 5) {
                    uVar21 = *(undefined8 *)(lVar16 + 0x3598);
                    FUN_008b8780(uVar21,&local_88,&local_70,&local_74,&local_78);
                    pcVar19 = local_88;
                    if (local_88 != local_70) {
                      bVar2 = *(byte *)(*(long *)(param_1 + 0x60) + 2);
                      do {
                        if (*pcVar19 != '\0') {
                          if ((byte)((pcVar19[2] ^ 3U) & (bVar2 ^ 3)) == 0) {
                            if (DAT_00d1f5f8 == 1) {
                              FUN_008af3b4();
                            }
                            else {
                              FUN_008b6448(param_1,pcVar19,uVar21);
                            }
                            local_74 = local_74 + -1;
                            if (local_74 == 0) {
                              iVar6 = 0;
                              if (local_78 != 0) {
                                iVar6 = ((int)pcVar19 - (int)local_88) / local_78;
                              }
                              iVar6 = iVar6 + 1;
                              goto LAB_008b59dc;
                            }
                          }
                          else {
                            pcVar19[2] = pcVar19[2] & 0xf8U | bVar2 & 3;
                          }
                        }
                        pcVar19 = pcVar19 + local_78;
                      } while (pcVar19 != local_70);
                    }
                    iVar6 = 0;
                    if (local_78 != 0) {
                      iVar6 = ((int)pcVar19 - (int)local_88) / local_78;
                    }
                  }
                  else if (iVar7 == -6) {
                    iVar6 = FUN_008b6de4(param_1,*(undefined8 *)(lVar16 + 0x2728));
                  }
                  else {
                    iVar6 = 0;
                  }
LAB_008b59dc:
                  *(long *)(lVar16 + 0x2f08 + (long)iVar7 * 0x150) = lVar8;
                  uVar17 = uVar17 + (long)(iVar6 << 4);
                } while ((lVar8 != 0) && (uVar17 < param_2));
              }
            }
            else {
              do {
                lVar8 = FUN_008b87e4(lVar8);
                iVar7 = FUN_008b6de4(param_1,*(undefined8 *)(lVar16 + 0x4c0));
                *(long *)(lVar16 + 0x4c0) = lVar8;
                uVar17 = uVar17 + (long)(iVar7 << 4);
                if (lVar8 == 0) break;
              } while (uVar17 < param_2);
            }
          }
          else {
            do {
              lVar8 = FUN_008b87e4(lVar8);
              iVar7 = FUN_008b6de4(param_1,*(undefined8 *)(lVar16 + 0x1e8));
              *(long *)(lVar16 + 0x1e8) = lVar8;
              uVar17 = uVar17 + (long)(iVar7 << 4);
              if (lVar8 == 0) break;
            } while (uVar17 < param_2);
          }
        } while (uVar17 < param_2);
      }
    }
  }
  else if (bVar2 == 3) {
    uVar21 = FUN_008b97ec();
    *(undefined8 *)(lVar16 + 0x5578) = uVar21;
    *(undefined8 *)(lVar16 + 0x5558) = *(undefined8 *)(lVar16 + 0x10);
    lVar16 = *(long *)(param_1 + 0x60);
    lVar8 = *(long *)(lVar16 + 0x1d0);
    if (lVar8 == lVar16 + 0x1b8) {
      lVar18 = 0;
    }
    else {
      lVar18 = 0;
      do {
        if ((((*(byte *)(lVar8 + 2) & 7) == 0) && (4 < *(int *)((long)*(long **)(lVar8 + 8) + 0xc)))
           && ((*(byte *)(**(long **)(lVar8 + 8) + 2) & 3) != 0)) {
          FUN_008b61bc(lVar16);
        }
        lVar8 = *(long *)(lVar8 + 0x18);
        lVar18 = lVar18 + 0x28;
      } while (lVar8 != lVar16 + 0x1b8);
    }
    if (*(long *)(lVar16 + 0x58) == 0) {
      lVar8 = 0;
    }
    else {
      lVar8 = 0;
      do {
        lVar9 = FUN_008b64ec(lVar16);
        lVar8 = lVar9 + lVar8;
      } while (*(long *)(lVar16 + 0x58) != 0);
    }
    uVar21 = *(undefined8 *)(lVar16 + 0x68);
    *(undefined8 *)(lVar16 + 0x68) = 0;
    *(undefined8 *)(lVar16 + 0x58) = uVar21;
    if ((*(byte *)(param_1 + 2) & 3) != 0) {
      FUN_008b61bc(lVar16,param_1);
    }
    lVar9 = 0x448;
    do {
      if ((*(long *)(lVar16 + lVar9) != 0) && ((*(byte *)(*(long *)(lVar16 + lVar9) + 2) & 3) != 0))
      {
        FUN_008b61bc(lVar16);
      }
      lVar9 = lVar9 + 8;
    } while (lVar9 != 0x4b0);
    lVar9 = 0x909;
    do {
      lVar12 = *(long *)(lVar16 + lVar9 * 8);
      if ((lVar12 != 0) && ((*(byte *)(lVar12 + 2) & 3) != 0)) {
        FUN_008b61bc(lVar16);
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 != 0x989);
    FUN_008b70e0(lVar16);
    lVar9 = 0xa0d;
    do {
      lVar12 = *(long *)(lVar16 + lVar9 * 8);
      if ((lVar12 != 0) && ((*(byte *)(lVar12 + 2) & 3) != 0)) {
        FUN_008b61bc(lVar16);
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 != 0xa8f);
    if ((*(long *)(lVar16 + 0x5478) != 0) && ((*(byte *)(*(long *)(lVar16 + 0x5478) + 2) & 3) != 0))
    {
      FUN_008b61bc(lVar16);
    }
    if ((*(long *)(lVar16 + 0x5480) != 0) && ((*(byte *)(*(long *)(lVar16 + 0x5480) + 2) & 3) != 0))
    {
      FUN_008b61bc(lVar16);
    }
    if (*(long *)(lVar16 + 0x58) == 0) {
      lVar9 = 0;
    }
    else {
      lVar9 = 0;
      do {
        lVar12 = FUN_008b64ec(lVar16);
        lVar9 = lVar12 + lVar9;
      } while (*(long *)(lVar16 + 0x58) != 0);
    }
    lVar14 = *(long *)(lVar16 + 0x60);
    lVar12 = 0;
    *(long *)(lVar16 + 0x58) = lVar14;
    *(undefined8 *)(lVar16 + 0x60) = 0;
    while (lVar14 != 0) {
      lVar14 = FUN_008b64ec(lVar16);
      lVar12 = lVar14 + lVar12;
      lVar14 = *(long *)(lVar16 + 0x58);
    }
    lVar12 = lVar8 + lVar18 + lVar9 + lVar12;
    if ((DAT_00d1f4b8 == '\x01') && (*(code **)(lVar16 + 0x4c60) != (code *)0x0)) {
      iVar7 = (**(code **)(lVar16 + 0x4c60))(*(undefined8 *)(lVar16 + 0x1e0),FUN_008b7190);
      while (iVar7 != 0) {
        if (*(long *)(lVar16 + 0x58) == 0) {
          lVar8 = 0;
        }
        else {
          lVar8 = 0;
          do {
            lVar18 = FUN_008b64ec(lVar16);
            lVar8 = lVar18 + lVar8;
          } while (*(long *)(lVar16 + 0x58) != 0);
        }
        lVar12 = lVar8 + lVar12;
        iVar7 = (**(code **)(lVar16 + 0x4c60))(*(undefined8 *)(lVar16 + 0x1e0),FUN_008b7190);
      }
    }
    pcVar19 = *(char **)(lVar16 + 0x68);
    if (pcVar19 == (char *)0x0) {
      lVar8 = 0;
    }
    else {
      lVar8 = 0;
      do {
        if (*(undefined **)(pcVar19 + 0x28) == &DAT_00364ca0) {
          uVar17 = 0;
        }
        else {
          uVar20 = 1 << (ulong)((byte)pcVar19[5] & 0x1f);
          uVar17 = -(ulong)(uVar20 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar20 << 5;
        }
        lVar9 = (long)*(int *)(pcVar19 + 8);
        lVar18 = lVar9 * 0x10;
        if (*(int *)(pcVar19 + 8) != 0) {
          lVar14 = lVar18;
          do {
            lVar13 = *(long *)(pcVar19 + 0x20) + lVar14;
            if (4 < *(int *)(lVar13 + -4)) {
              pcVar15 = *(char **)(lVar13 + -0x10);
              if (*pcVar15 == '\x05') {
                pcVar15[2] = pcVar15[2] & 0xf8U | 4;
              }
              else if ((pcVar15[2] & 3U) != 0) {
                *(undefined4 *)(lVar13 + -4) = 0;
              }
            }
            lVar9 = lVar9 + -1;
            lVar14 = lVar14 + -0x10;
          } while (lVar9 != 0);
        }
        iVar7 = 0;
        lVar8 = lVar8 + lVar18 + uVar17 + 0x30;
        lVar18 = (ulong)(uint)~(-1 << (ulong)((byte)pcVar19[5] & 0x1f)) << 5;
        do {
          puVar11 = (undefined8 *)(*(long *)(pcVar19 + 0x28) + lVar18);
          iVar6 = *(int *)((long)puVar11 + 0xc);
          if (iVar6 != 0) {
            uVar20 = *(uint *)((long)puVar11 + 0x1c);
            if ((uVar20 & 0xf) < 5) {
LAB_008b5d8c:
              if (4 < iVar6) {
                pcVar15 = (char *)*puVar11;
                if (*pcVar15 == '\x05') {
                  pcVar15[2] = pcVar15[2] & 0xf8U | 4;
                }
                else if ((pcVar15[2] & 3U) != 0) {
                  uVar20 = *(uint *)((long)puVar11 + 0x1c);
                  *(undefined4 *)((long)puVar11 + 0xc) = 0;
                  if ((uVar20 & 0xf) < 5) goto LAB_008b5d24;
                  goto LAB_008b5dc4;
                }
              }
              iVar7 = iVar7 + 1;
            }
            else {
              pcVar15 = *(char **)(*(long *)(pcVar19 + 0x28) + lVar18 + 0x10);
              if (*pcVar15 == '\x05') {
                pcVar15[2] = pcVar15[2] & 0xf8U | 4;
                iVar6 = *(int *)((long)puVar11 + 0xc);
                goto LAB_008b5d8c;
              }
              if ((pcVar15[2] & 3U) == 0) goto LAB_008b5d8c;
              *(undefined4 *)((long)puVar11 + 0xc) = 0;
LAB_008b5dc4:
              *(uint *)((long)puVar11 + 0x1c) = uVar20 & 0xfffffff0 | 0xd;
            }
          }
LAB_008b5d24:
          bVar5 = lVar18 != 0;
          lVar18 = lVar18 + -0x20;
        } while (bVar5);
        bVar2 = pcVar19[7];
        if ((bVar2 >> 1 & 1) != 0) {
          uVar17 = 0;
          uVar20 = 0;
          lVar18 = -0x10;
          do {
            puVar11 = (undefined8 *)
                      FUN_008bb440(pcVar19,*(undefined8 *)
                                            (*(long *)(param_1 + 0x60) + uVar17 * 8 + 0x338));
            lVar9 = *(long *)(pcVar19 + 0x20);
            uVar21 = *puVar11;
            ((undefined8 *)(lVar9 + lVar18))[1] = puVar11[1];
            *(undefined8 *)(lVar9 + lVar18) = uVar21;
            if ((uVar17 < 8) && (*(int *)((long)puVar11 + 0xc) == 0)) {
              uVar20 = uVar20 | 1 << (ulong)((uint)uVar17 & 0x1f);
            }
            uVar17 = uVar17 + 1;
            lVar18 = lVar18 + -0x10;
          } while (uVar17 != 0x15);
          bVar2 = pcVar19[7];
          pcVar19[6] = (char)uVar20;
        }
        if (((bVar2 == 0) && (lVar18 = *(long *)(pcVar19 + 0x10), lVar18 != 0)) &&
           ((*(byte *)(lVar18 + 6) >> 2 & 1) == 0)) {
          if ((*(byte *)(lVar18 + 7) >> 1 & 1) == 0) {
            plVar10 = (long *)FUN_008bdfe0(lVar18,2,*(undefined8 *)
                                                     (*(long *)(param_1 + 0x60) + 0x348));
            if (plVar10 == (long *)0x0) goto LAB_008b5c30;
          }
          else {
            plVar10 = (long *)(*(long *)(lVar18 + 0x20) + -0x30);
          }
          if ((*(int *)((long)plVar10 + 0xc) == 5) &&
             (pcVar15 = strchr((char *)(*plVar10 + 0x18),0x73), pcVar15 != (char *)0x0)) {
            iVar3 = 3 << (ulong)((byte)pcVar19[5] & 0x1f);
            iVar6 = iVar3 + 7;
            if (-1 < iVar3) {
              iVar6 = iVar3;
            }
            if (iVar7 < iVar6 >> 3) {
              local_88 = pcVar19;
              local_80 = iVar7;
              FUN_008b3edc(param_1,&LAB_008b71ec,&local_88);
            }
          }
        }
LAB_008b5c30:
        pcVar19 = *(char **)(pcVar19 + 0x18);
      } while (pcVar19 != (char *)0x0);
    }
    *(undefined8 *)(lVar16 + 0x68) = 0;
    lVar9 = *(long *)(*(long *)(param_1 + 0x60) + 0x1d0);
    lVar18 = *(long *)(param_1 + 0x60) + 0x1b8;
    if (lVar9 == lVar18) {
      lVar14 = 0;
    }
    else {
      lVar14 = 0;
      do {
        if (*(char *)(lVar9 + 3) == '\0') {
          lVar13 = *(long *)(lVar9 + 0x18);
          FUN_008b501c(param_1,lVar9,(*(byte *)(lVar9 + 2) & 3) != 0);
        }
        else {
          *(undefined1 *)(lVar9 + 3) = 0;
          lVar13 = *(long *)(lVar9 + 0x18);
        }
        lVar14 = lVar14 + 0x28;
        lVar9 = lVar13;
      } while (lVar13 != lVar18);
    }
    bVar2 = DAT_00d1f5f8;
    *(byte *)(lVar16 + 2) = *(byte *)(lVar16 + 2) ^ 3;
    *(undefined8 *)(lVar16 + 0x1e8) = *(undefined8 *)(lVar16 + 0x330);
    *(undefined8 *)(lVar16 + 0x4c0) = *(undefined8 *)(lVar16 + 0x4b8);
    if (bVar2 == 1) {
      *(undefined4 *)(lVar16 + 0x3840) = 0;
      *(undefined8 *)(lVar16 + 0x2f08) = *(undefined8 *)(lVar16 + 0x2f00);
      *(undefined8 *)(lVar16 + 0x3058) = *(undefined8 *)(lVar16 + 0x3050);
      *(undefined8 *)(lVar16 + 0x31a8) = *(undefined8 *)(lVar16 + 0x31a0);
      *(undefined8 *)(lVar16 + 0x32f8) = *(undefined8 *)(lVar16 + 0x32f0);
      *(undefined8 *)(lVar16 + 0x3448) = *(undefined8 *)(lVar16 + 0x3440);
      *(undefined8 *)(lVar16 + 0x3598) = *(undefined8 *)(lVar16 + 0x3590);
      *(undefined8 *)(lVar16 + 0x36e8) = *(undefined8 *)(lVar16 + 0x36e0);
      *(undefined8 *)(lVar16 + 0x3838) = *(undefined8 *)(lVar16 + 0x3830);
    }
    *(undefined1 *)(lVar16 + 1) = 4;
    uVar17 = lVar8 + lVar12 + lVar14;
  }
  else if (bVar2 == 2) {
    uVar17 = 0;
    bVar5 = *(long *)(lVar16 + 0x58) != 0;
    if ((*(long *)(lVar16 + 0x58) != 0) && (param_2 != 0)) {
      uVar17 = 0;
      do {
        lVar8 = FUN_008b64ec(lVar16);
        uVar17 = lVar8 + uVar17;
        bVar5 = *(long *)(lVar16 + 0x58) != 0;
        if (*(long *)(lVar16 + 0x58) == 0) break;
      } while (uVar17 < param_2);
    }
    if (!bVar5) {
      *(undefined1 *)(lVar16 + 1) = 3;
    }
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar17;
}


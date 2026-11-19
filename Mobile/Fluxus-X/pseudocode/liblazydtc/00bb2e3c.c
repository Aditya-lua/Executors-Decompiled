/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2e3c
 */

void ZSTD_decompressStream(long param_1,long *param_2,long *param_3)

{
  uint *puVar1;
  uint *puVar2;
  void *pvVar3;
  void *pvVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  bool bVar11;
  int iVar12;
  int iVar13;
  ulong uVar14;
  void *pvVar15;
  undefined8 uVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  undefined4 uVar20;
  uint uVar21;
  uint uVar22;
  size_t sVar23;
  void *__dest;
  long *plVar24;
  ulong uVar25;
  size_t __n;
  ulong uVar26;
  long lVar27;
  void *local_88;
  int local_80 [2];
  ulong local_78;
  long local_68;
  
  lVar10 = tpidr_el0;
  local_68 = *(long *)(lVar10 + 0x28);
  uVar6 = param_3[1];
  uVar8 = param_3[2];
  if (uVar6 < uVar8) {
    uVar14 = 0xffffffffffffffb8;
  }
  else {
    uVar7 = param_2[1];
    uVar9 = param_2[2];
    if (uVar9 <= uVar7) {
      puVar2 = (uint *)(param_1 + 0x74f8);
      lVar17 = *param_2;
      if ((*(int *)(param_1 + 0x7670) == 1) && (*(int *)(param_1 + 0x761c) != 0)) {
        uVar14 = 0xffffffffffffff98;
        if ((*(long *)(param_1 + 0x7678) != lVar17) ||
           ((*(ulong *)(param_1 + 0x7688) != uVar9 || (*(ulong *)(param_1 + 0x7680) != uVar7))))
        goto LAB_00bb36bc;
      }
      pvVar3 = (void *)(*param_3 + uVar8);
      pvVar4 = (void *)(*param_3 + uVar6);
      lVar27 = lVar17 + uVar7;
      puVar1 = (uint *)(param_1 + 0x176c4);
      plVar5 = (long *)(param_1 + 0x7650);
      __dest = (void *)(lVar17 + uVar9);
      local_88 = pvVar3;
LAB_00bb2f48:
      while( true ) {
        while (iVar13 = *(int *)(param_1 + 0x761c), iVar13 == 4) {
          lVar18 = *(long *)(param_1 + 0x7650);
          uVar25 = lVar27 - (long)__dest;
          uVar14 = *(long *)(param_1 + 0x7658) - lVar18;
          sVar23 = uVar25;
          if (uVar14 <= uVar25) {
            sVar23 = uVar14;
          }
          if (sVar23 != 0) {
            memcpy(__dest,(void *)(*(long *)(param_1 + 0x7640) + lVar18),sVar23);
            lVar18 = *(long *)(param_1 + 0x7650);
          }
          pvVar15 = (void *)((long)__dest + sVar23);
          bVar11 = __dest != (void *)0x0;
          __dest = (void *)0x0;
          if (bVar11) {
            __dest = pvVar15;
          }
          *plVar5 = lVar18 + sVar23;
          if (uVar25 < uVar14) goto LAB_00bb362c;
          *(undefined4 *)(param_1 + 0x761c) = 2;
          if ((*(ulong *)(param_1 + 0x7648) < *(ulong *)(param_1 + 0x74e8)) &&
             (*(ulong *)(param_1 + 0x7648) < lVar18 + sVar23 + (ulong)*puVar2)) {
            *plVar5 = 0;
            *(undefined8 *)(param_1 + 0x7658) = 0;
          }
        }
        if (1 < iVar13) break;
        if (iVar13 == 0) {
          *(undefined8 *)(param_1 + 0x7630) = 0;
          *(undefined4 *)(param_1 + 0x761c) = 1;
          uVar16 = 0;
          *(undefined8 *)(param_1 + 0x7658) = 0;
          *(undefined8 *)(param_1 + 0x7660) = 0;
          *plVar5 = 0;
          *(undefined4 *)(param_1 + 0x7668) = 0;
          lVar19 = param_2[1];
          lVar18 = *param_2;
          *(long *)(param_1 + 0x7688) = param_2[2];
          *(long *)(param_1 + 0x7680) = lVar19;
          *(long *)(param_1 + 0x7678) = lVar18;
        }
        else {
          if (iVar13 != 1) goto LAB_00bb3614;
          uVar16 = *(undefined8 *)(param_1 + 0x7660);
        }
        uVar25 = ZSTD_getFrameHeader_advanced
                           (param_1 + 0x74e8,puVar1,uVar16,*(undefined4 *)(param_1 + 0x7598));
        if (((*(int *)(param_1 + 0x7610) != 0) &&
            (plVar24 = *(long **)(param_1 + 0x7608), plVar24 != (long *)0x0)) &&
           (*(long *)(param_1 + 0x75f0) != 0)) {
          iVar13 = *(int *)(param_1 + 0x7504);
          local_80[0] = iVar13;
          uVar14 = ZSTD_XXH64(local_80,4,0);
          lVar18 = plVar24[1];
          uVar14 = lVar18 - 1U & uVar14;
          do {
            uVar26 = uVar14;
            iVar12 = ZSTD_getDictID_fromDDict(*(undefined8 *)(*plVar24 + uVar26 * 8));
            uVar14 = (uVar26 & lVar18 - 1U) + 1;
          } while (iVar12 != iVar13 && iVar12 != 0);
          lVar18 = *(long *)(*plVar24 + uVar26 * 8);
          if (lVar18 != 0) {
            ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
            *(undefined8 *)(param_1 + 0x75e8) = 0;
            *(long *)(param_1 + 0x75f0) = lVar18;
            *(undefined4 *)(param_1 + 0x75f8) = *(undefined4 *)(param_1 + 0x7504);
            *(undefined4 *)(param_1 + 0x7600) = 0xffffffff;
          }
        }
        if (0xffffffffffffff88 < uVar25) goto LAB_00bb3618;
        if (uVar25 == 0) {
          if (((*(ulong *)(param_1 + 0x74e8) == 0xffffffffffffffff) ||
              (*(int *)(param_1 + 0x74fc) == 1)) ||
             (((ulong)(lVar27 - (long)__dest) < *(ulong *)(param_1 + 0x74e8) ||
              (FUN_00bb04a4(local_80,pvVar3,uVar6 - uVar8,*(undefined4 *)(param_1 + 0x7598)),
              uVar6 - uVar8 < local_78)))) {
            if (((*(int *)(param_1 + 0x7670) == 1) && (*(int *)(param_1 + 0x74fc) != 1)) &&
               ((*(ulong *)(param_1 + 0x74e8) != 0xffffffffffffffff &&
                ((ulong)(lVar27 - (long)__dest) < *(ulong *)(param_1 + 0x74e8))))) {
              uVar25 = 0xffffffffffffffba;
            }
            else {
              if (*(int *)(param_1 + 0x7600) == -1) {
                uVar16 = *(undefined8 *)(param_1 + 0x75f0);
              }
              else if (*(int *)(param_1 + 0x7600) == 1) {
                uVar16 = *(undefined8 *)(param_1 + 0x75f0);
                *(undefined4 *)(param_1 + 0x7600) = 0;
              }
              else {
                ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
                uVar16 = 0;
                *(undefined4 *)(param_1 + 0x7600) = 0;
                *(undefined8 *)(param_1 + 0x75e8) = 0;
                *(undefined8 *)(param_1 + 0x75f0) = 0;
              }
              ZSTD_decompressBegin_usingDDict(param_1,uVar16);
              if ((*(int *)(param_1 + 0x7598) == 0) && (*puVar1 >> 4 == 0x184d2a5)) {
                uVar20 = 7;
                uVar14 = (ulong)*(uint *)(param_1 + 0x176c8);
              }
              else {
                uVar25 = FUN_00bb14e4(param_1,puVar1,*(undefined8 *)(param_1 + 0x7660));
                if (0xffffffffffffff88 < uVar25) goto LAB_00bb3618;
                uVar20 = 2;
                uVar14 = 3;
              }
              uVar25 = *(ulong *)(param_1 + 0x74f0);
              *(ulong *)(param_1 + 0x74e0) = uVar14;
              *(undefined4 *)(param_1 + 0x752c) = uVar20;
              if (uVar25 < 0x401) {
                uVar25 = 0x400;
              }
              *(ulong *)(param_1 + 0x74f0) = uVar25;
              if (uVar25 <= *(ulong *)(param_1 + 0x7638)) {
                uVar22 = *(uint *)(param_1 + 0x7618);
                uVar21 = *puVar2;
                if (uVar22 != 0) {
                  if (uVar22 <= uVar21) {
                    uVar21 = uVar22;
                  }
                  *puVar2 = uVar21;
                }
                uVar22 = uVar21;
                if (uVar21 < 5) {
                  uVar22 = 4;
                }
                uVar14 = (ulong)uVar22;
                if (*(int *)(param_1 + 0x7670) == 0) {
                  uVar26 = uVar25;
                  if (uVar21 <= uVar25) {
                    uVar26 = (ulong)uVar21;
                  }
                  if (0x1ffff < uVar26) {
                    uVar26 = 0x20000;
                  }
                  uVar25 = uVar25 + uVar26 * 2 + 0x40;
                  uVar26 = *(ulong *)(param_1 + 0x74e8);
                  if (uVar25 <= *(ulong *)(param_1 + 0x74e8)) {
                    uVar26 = uVar25;
                  }
                }
                else {
                  uVar26 = 0;
                }
                sVar23 = uVar26 + uVar14;
                if (*(ulong *)(param_1 + 0x7648) + *(ulong *)(param_1 + 0x7628) < sVar23 * 3) {
                  uVar25 = 0;
                }
                else {
                  uVar25 = *(long *)(param_1 + 0x176d8) + 1;
                }
                *(ulong *)(param_1 + 0x176d8) = uVar25;
                if (((*(ulong *)(param_1 + 0x7628) < uVar14) ||
                    (*(ulong *)(param_1 + 0x7648) < uVar26)) || (0x7f < uVar25)) {
                  if (*(long *)(param_1 + 0x75d8) == 0) {
                    if (*(void **)(param_1 + 0x7620) != (void *)0x0) {
                      if (*(code **)(param_1 + 0x75b8) == (code *)0x0) {
                        free(*(void **)(param_1 + 0x7620));
                      }
                      else {
                        (**(code **)(param_1 + 0x75b8))(*(undefined8 *)(param_1 + 0x75c0));
                      }
                    }
                    *(undefined8 *)(param_1 + 0x7628) = 0;
                    *(undefined8 *)(param_1 + 0x7648) = 0;
                    if (*(code **)(param_1 + 0x75b0) == (code *)0x0) {
                      pvVar15 = malloc(sVar23);
                    }
                    else {
                      pvVar15 = (void *)(**(code **)(param_1 + 0x75b0))
                                                  (*(undefined8 *)(param_1 + 0x75c0),sVar23);
                    }
                    *(void **)(param_1 + 0x7620) = pvVar15;
                    if (pvVar15 == (void *)0x0) goto LAB_00bb37c4;
                  }
                  else {
                    if (*(long *)(param_1 + 0x75d8) - 0x176e8U < sVar23) {
LAB_00bb37c4:
                      uVar25 = 0xffffffffffffffc0;
                      goto LAB_00bb3618;
                    }
                    pvVar15 = *(void **)(param_1 + 0x7620);
                  }
                  *(ulong *)(param_1 + 0x7628) = uVar14;
                  *(ulong *)(param_1 + 0x7640) = (long)pvVar15 + uVar14;
                  *(ulong *)(param_1 + 0x7648) = uVar26;
                }
                *(undefined4 *)(param_1 + 0x761c) = 2;
                goto LAB_00bb33d0;
              }
              uVar25 = 0xfffffffffffffff0;
            }
            goto LAB_00bb3618;
          }
          uVar16 = FUN_00bb0da8(param_1);
          uVar14 = FUN_00bb0774(param_1,__dest,lVar27 - (long)__dest,pvVar3,local_78,0,0,uVar16);
          if (uVar14 < 0xffffffffffffff89) {
            pvVar4 = (void *)((long)__dest + uVar14);
            bVar11 = __dest != (void *)0x0;
            local_88 = (void *)((long)pvVar3 + local_78);
            __dest = (void *)0x0;
            if (bVar11) {
              __dest = pvVar4;
            }
            *(undefined8 *)(param_1 + 0x74e0) = 0;
            goto LAB_00bb3770;
          }
          goto LAB_00bb36bc;
        }
        lVar18 = *(long *)(param_1 + 0x7660);
        sVar23 = uVar25 - lVar18;
        __n = (long)pvVar4 - (long)local_88;
        if (__n < sVar23) {
          if (pvVar4 != local_88) {
            memcpy((void *)((long)puVar1 + lVar18),local_88,__n);
            lVar18 = lVar18 + __n;
            *(long *)(param_1 + 0x7660) = lVar18;
          }
          param_3[2] = param_3[1];
          uVar14 = ZSTD_getFrameHeader_advanced
                             (param_1 + 0x74e8,puVar1,lVar18,*(undefined4 *)(param_1 + 0x7598));
          if (uVar14 < 0xffffffffffffff89) {
            uVar6 = 6;
            if (*(int *)(param_1 + 0x7598) != 0) {
              uVar6 = 2;
            }
            if (uVar6 <= uVar25) {
              uVar6 = uVar25;
            }
            uVar14 = (uVar6 - *(long *)(param_1 + 0x7660)) + 3;
          }
          goto LAB_00bb36bc;
        }
        memcpy((void *)((long)puVar1 + lVar18),local_88,sVar23);
        *(ulong *)(param_1 + 0x7660) = uVar25;
        local_88 = (void *)((long)local_88 + sVar23);
      }
      if (iVar13 == 2) {
LAB_00bb33d0:
        iVar13 = *(int *)(param_1 + 0x752c);
        uVar25 = (long)pvVar4 - (long)local_88;
        if (iVar13 - 3U < 2) {
          uVar14 = *(ulong *)(param_1 + 0x74e0);
          if (*(int *)(param_1 + 0x7528) != 0) goto LAB_00bb340c;
          uVar26 = uVar25;
          if (uVar14 <= uVar25) {
            uVar26 = uVar14;
          }
          if (uVar26 < 2) {
            uVar26 = 1;
          }
        }
        else {
          uVar14 = *(ulong *)(param_1 + 0x74e0);
LAB_00bb340c:
          uVar26 = uVar14;
          if (uVar14 == 0) {
LAB_00bb3770:
            *(undefined4 *)(param_1 + 0x761c) = 0;
LAB_00bb362c:
            param_3[2] = (long)local_88 - *param_3;
            lVar18 = param_2[1];
            lVar27 = *param_2;
            param_2[2] = (long)__dest - *param_2;
            *(long *)(param_1 + 0x7688) = (long)__dest - *param_2;
            *(long *)(param_1 + 0x7680) = lVar18;
            *(long *)(param_1 + 0x7678) = lVar27;
            if ((local_88 == pvVar3) && (__dest == (void *)(lVar17 + uVar9))) {
              iVar13 = *(int *)(param_1 + 0x766c);
              *(int *)(param_1 + 0x766c) = iVar13 + 1;
              if (0xe < iVar13) {
                if (uVar9 == uVar7) {
                  uVar14 = 0xffffffffffffffb0;
                  goto LAB_00bb36bc;
                }
                if (uVar6 == uVar8) {
                  uVar14 = 0xffffffffffffffae;
                  goto LAB_00bb36bc;
                }
              }
            }
            else {
              *(undefined4 *)(param_1 + 0x766c) = 0;
            }
            lVar17 = *(long *)(param_1 + 0x74e0);
            if (lVar17 == 0) {
              if (*(long *)(param_1 + 0x7658) == *(long *)(param_1 + 0x7650)) {
                if (*(int *)(param_1 + 0x7668) == 0) {
                  uVar14 = 0;
                }
                else if ((ulong)param_3[2] < (ulong)param_3[1]) {
                  param_3[2] = param_3[2] + 1;
                  uVar14 = 0;
                }
                else {
                  *(undefined4 *)(param_1 + 0x761c) = 2;
                  uVar14 = 1;
                }
              }
              else {
                uVar14 = 1;
                if (*(int *)(param_1 + 0x7668) == 0) {
                  param_3[2] = param_3[2] + -1;
                  *(undefined4 *)(param_1 + 0x7668) = 1;
                }
              }
            }
            else {
              iVar13 = ZSTD_nextInputType(param_1);
              lVar27 = 3;
              if (iVar13 != 2) {
                lVar27 = 0;
              }
              uVar14 = (lVar17 - *(long *)(param_1 + 0x7630)) + lVar27;
            }
            goto LAB_00bb36bc;
          }
        }
        if (uVar25 < uVar26) {
          if (local_88 != pvVar4) {
            *(undefined4 *)(param_1 + 0x761c) = 3;
            goto LAB_00bb3430;
          }
          local_88 = pvVar4;
          goto LAB_00bb362c;
        }
        if (*(int *)(param_1 + 0x7670) == 0) {
          if (iVar13 == 7) {
            lVar19 = *plVar5;
            lVar18 = 0;
          }
          else {
            lVar19 = *(long *)(param_1 + 0x7650);
            lVar18 = *(long *)(param_1 + 0x7648) - lVar19;
          }
          uVar25 = ZSTD_decompressContinue
                             (param_1,*(long *)(param_1 + 0x7640) + lVar19,lVar18,local_88,uVar26);
          if (uVar25 < 0xffffffffffffff89) {
            if ((iVar13 != 7) && (uVar25 == 0)) goto LAB_00bb35e8;
            *(ulong *)(param_1 + 0x7658) = *(long *)(param_1 + 0x7650) + uVar25;
            uVar20 = 4;
LAB_00bb35ec:
            *(undefined4 *)(param_1 + 0x761c) = uVar20;
            local_88 = (void *)((long)local_88 + uVar26);
            goto LAB_00bb2f48;
          }
        }
        else {
          lVar18 = 0;
          if (iVar13 != 7) {
            lVar18 = lVar27 - (long)__dest;
          }
          uVar25 = ZSTD_decompressContinue(param_1,__dest,lVar18,local_88,uVar26);
          if (uVar25 < 0xffffffffffffff89) {
            __dest = (void *)((long)__dest + uVar25);
LAB_00bb35e8:
            uVar20 = 2;
            goto LAB_00bb35ec;
          }
        }
      }
      else {
        if (iVar13 != 3) {
LAB_00bb3614:
          uVar25 = 0xffffffffffffffff;
          goto LAB_00bb3618;
        }
        uVar14 = *(ulong *)(param_1 + 0x74e0);
        iVar13 = *(int *)(param_1 + 0x752c);
LAB_00bb3430:
        lVar18 = *(long *)(param_1 + 0x7630);
        uVar25 = uVar14 - lVar18;
        sVar23 = uVar25;
        if (iVar13 == 7) {
          if ((ulong)((long)pvVar4 - (long)local_88) <= uVar25) {
            sVar23 = (long)pvVar4 - (long)local_88;
          }
          if (sVar23 != 0) {
LAB_00bb34a8:
            local_88 = (void *)((long)local_88 + sVar23);
            *(size_t *)(param_1 + 0x7630) = lVar18 + sVar23;
          }
        }
        else {
          if ((ulong)(*(long *)(param_1 + 0x7628) - lVar18) < uVar25) {
            uVar25 = 0xffffffffffffffec;
            goto LAB_00bb3618;
          }
          if ((ulong)((long)pvVar4 - (long)local_88) <= uVar25) {
            sVar23 = (long)pvVar4 - (long)local_88;
          }
          if (sVar23 != 0) {
            memcpy((void *)(*(long *)(param_1 + 0x7620) + lVar18),local_88,sVar23);
            lVar18 = *(long *)(param_1 + 0x7630);
            goto LAB_00bb34a8;
          }
        }
        if (sVar23 < uVar25) goto LAB_00bb362c;
        iVar13 = *(int *)(param_1 + 0x752c);
        *(undefined8 *)(param_1 + 0x7630) = 0;
        if (*(int *)(param_1 + 0x7670) == 0) {
          if (iVar13 == 7) {
            lVar19 = *plVar5;
            lVar18 = 0;
          }
          else {
            lVar19 = *(long *)(param_1 + 0x7650);
            lVar18 = *(long *)(param_1 + 0x7648) - lVar19;
          }
          uVar25 = ZSTD_decompressContinue
                             (param_1,*(long *)(param_1 + 0x7640) + lVar19,lVar18,
                              *(undefined8 *)(param_1 + 0x7620),uVar14);
          if (uVar25 < 0xffffffffffffff89) {
            if ((iVar13 != 7) && (uVar25 == 0)) goto LAB_00bb3578;
            *(ulong *)(param_1 + 0x7658) = *(long *)(param_1 + 0x7650) + uVar25;
            *(undefined4 *)(param_1 + 0x761c) = 4;
            goto LAB_00bb2f48;
          }
        }
        else {
          lVar18 = 0;
          if (iVar13 != 7) {
            lVar18 = lVar27 - (long)__dest;
          }
          uVar25 = ZSTD_decompressContinue
                             (param_1,__dest,lVar18,*(undefined8 *)(param_1 + 0x7620),uVar14);
          if (uVar25 < 0xffffffffffffff89) {
            __dest = (void *)((long)__dest + uVar25);
LAB_00bb3578:
            *(undefined4 *)(param_1 + 0x761c) = 2;
            goto LAB_00bb2f48;
          }
        }
      }
LAB_00bb3618:
      uVar14 = uVar25;
      goto LAB_00bb36bc;
    }
    uVar14 = 0xffffffffffffffba;
  }
LAB_00bb36bc:
  if (*(long *)(lVar10 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar14);
  }
  return;
}


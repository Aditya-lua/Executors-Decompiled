/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090de5c
 */

int FUN_0090de5c(long *param_1,long param_2)

{
  ulong *puVar1;
  char *pcVar2;
  byte bVar3;
  undefined1 uVar4;
  ushort uVar5;
  long lVar6;
  bool bVar7;
  bool bVar8;
  undefined4 uVar9;
  uint uVar10;
  int iVar11;
  int iVar12;
  uint uVar13;
  undefined4 *puVar14;
  undefined8 uVar15;
  size_t sVar16;
  char *pcVar17;
  undefined1 uVar18;
  long lVar19;
  long lVar20;
  ulong uVar21;
  uint uVar22;
  socklen_t __len;
  char *pcVar23;
  char *pcVar24;
  long lVar25;
  long lVar26;
  char *pcVar27;
  int *piVar28;
  undefined1 auVar29 [16];
  uint local_30c;
  undefined4 local_2fc;
  long *local_2f8;
  char acStack_2f0 [256];
  uint local_1f0 [64];
  sockaddr local_f0;
  undefined4 local_d8;
  
  lVar6 = tpidr_el0;
  lVar19 = *(long *)(lVar6 + 0x28);
  lVar25 = param_1[2];
  auVar29 = FUN_00941cb8();
  *(undefined1 (*) [16])(lVar25 + 0x100) = auVar29;
  if (*(long *)(param_2 + 0x278) == 0) {
    uVar10 = *(uint *)(lVar25 + 0xc) | 0x800;
    *(uint *)(lVar25 + 0xc) = uVar10;
    uVar10 = socket(*(int *)(lVar25 + 8),uVar10,*(int *)(lVar25 + 0x10));
    puVar14 = (undefined4 *)(ulong)uVar10;
    *(uint *)(lVar25 + 0x98) = uVar10;
    if (uVar10 == 0xffffffff) goto LAB_0090df3c;
LAB_0090deec:
    iVar12 = *(int *)(*(long *)(param_2 + 0x20) + 0x568);
    if (iVar12 == 0) {
      lVar20 = *(long *)(param_2 + 0x278);
    }
    else if (*(int *)(lVar25 + 8) == 10) {
      *(int *)(lVar25 + 0x30) = iVar12;
      lVar20 = *(long *)(param_2 + 0x278);
    }
    else {
      lVar20 = *(long *)(param_2 + 0x278);
    }
    iVar12 = 0;
    if (lVar20 == 0) goto LAB_0090df6c;
LAB_0090df10:
    if (iVar12 == 0) goto LAB_0090df7c;
LAB_0090e014:
    iVar11 = *(int *)(lVar25 + 0x98);
    if (iVar11 != -1) {
      lVar20 = param_1[3];
      if ((lVar20 == 0) ||
         (lVar26 = *(long *)(lVar20 + 0x18), FUN_0092e498(param_2,iVar11), lVar26 == 0)) {
        uVar10 = close(iVar11);
        puVar14 = (undefined4 *)(ulong)uVar10;
      }
      else {
        FUN_0092f198(param_2,1);
        (**(code **)(lVar20 + 0x18))(*(undefined8 *)(lVar20 + 0x20),iVar11);
        puVar14 = (undefined4 *)FUN_0092f198(param_2,0);
      }
      *(int *)(lVar25 + 0x98) = -1;
    }
LAB_0090e074:
    bVar3 = *(byte *)(param_2 + 0xa85);
  }
  else {
    FUN_0092f198(param_2,1);
    uVar9 = (**(code **)(param_2 + 0x278))(*(undefined8 *)(param_2 + 0x280),0,lVar25 + 8);
    *(undefined4 *)(lVar25 + 0x98) = uVar9;
    FUN_0092f198(param_2,0);
    puVar14 = (undefined4 *)(ulong)*(uint *)(lVar25 + 0x98);
    if (*(uint *)(lVar25 + 0x98) != 0xffffffff) goto LAB_0090deec;
LAB_0090df3c:
    iVar12 = 7;
    if (*(long *)(param_2 + 0x278) != 0) goto LAB_0090df10;
LAB_0090df6c:
    *(uint *)(lVar25 + 0xc) = *(uint *)(lVar25 + 0xc) & 0xfffff7ff;
    if (iVar12 != 0) goto LAB_0090e014;
LAB_0090df7c:
    piVar28 = (int *)(lVar25 + 0x98);
    lVar20 = param_1[2];
    puVar14 = (undefined4 *)
              FUN_00908a98(lVar20 + 0x18,*(undefined4 *)(lVar20 + 0x14),lVar20 + 0x9c,lVar20 + 0xf8)
    ;
    if (((ulong)puVar14 & 1) == 0) {
      puVar14 = (undefined4 *)__errno();
      *(undefined4 *)(lVar20 + 0x130) = *puVar14;
      uVar9 = *puVar14;
      uVar15 = FUN_00941a94(uVar9,acStack_2f0,0x100);
      puVar14 = (undefined4 *)
                FUN_00904b80(param_2,"sa_addr inet_ntop() failed with errno %d: %s",uVar9,uVar15);
      iVar12 = 2;
      goto LAB_0090e014;
    }
    puVar1 = (ulong *)(param_2 + 0xa82);
    if (*(int *)(lVar25 + 8) == 10) {
      if ((((uint)*puVar1 >> 0x1c & 1) != 0) &&
         ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
        uVar9 = *(undefined4 *)(lVar25 + 0xf8);
        pcVar17 = "  Trying [%s]:%d...";
        goto LAB_0090e124;
      }
    }
    else if ((((uint)*puVar1 >> 0x1c & 1) != 0) &&
            ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
    {
      uVar9 = *(undefined4 *)(lVar25 + 0xf8);
      pcVar17 = "  Trying %s:%d...";
LAB_0090e124:
      puVar14 = (undefined4 *)FUN_00904c98(param_2,pcVar17,lVar25 + 0x9c,uVar9);
    }
    if (((*(uint *)(lVar25 + 8) | 8) == 10) && (*(int *)(lVar25 + 0xc) == 1)) {
      uVar21 = *puVar1;
      if ((uVar21 >> 0x20 & 1) != 0) {
        local_1f0[0] = 1;
        uVar10 = setsockopt(*piVar28,6,1,local_1f0,4);
        puVar14 = (undefined4 *)(ulong)uVar10;
        if ((((int)uVar10 < 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
        {
          puVar14 = (undefined4 *)__errno();
          uVar15 = FUN_00941a94(*puVar14,acStack_2f0,0x100);
          puVar14 = (undefined4 *)FUN_00904c98(param_2,"Could not set TCP_NODELAY: %s",uVar15);
        }
        uVar21 = *puVar1;
      }
      if ((uVar21 >> 0x26 & 1) != 0) {
        iVar12 = *piVar28;
        local_1f0[0] = (uint)(uVar21 >> 0x26) & 1;
        uVar10 = setsockopt(iVar12,1,9,local_1f0,4);
        puVar14 = (undefined4 *)(ulong)uVar10;
        if ((int)uVar10 < 0) {
          if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))
             ) {
            puVar14 = (undefined4 *)__errno();
            uVar9 = *puVar14;
            pcVar17 = "Failed to set SO_KEEPALIVE on fd %d: errno %d";
            goto LAB_0090e32c;
          }
        }
        else {
          local_1f0[0] = FUN_00963a68((long)*(int *)(param_2 + 0xa14));
          iVar11 = setsockopt(iVar12,6,4,local_1f0,4);
          if (((iVar11 < 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
             ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))
             ) {
            puVar14 = (undefined4 *)__errno();
            FUN_00904c98(param_2,"Failed to set TCP_KEEPIDLE on fd %d: errno %d",iVar12,*puVar14);
          }
          local_1f0[0] = FUN_00963a68((long)*(int *)(param_2 + 0xa18));
          iVar11 = setsockopt(iVar12,6,5,local_1f0,4);
          if (((iVar11 < 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
             ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))
             ) {
            puVar14 = (undefined4 *)__errno();
            FUN_00904c98(param_2,"Failed to set TCP_KEEPINTVL on fd %d: errno %d",iVar12,*puVar14);
          }
          local_1f0[0] = FUN_00963a68((long)*(int *)(param_2 + 0xa1c));
          uVar10 = setsockopt(iVar12,6,6,local_1f0,4);
          puVar14 = (undefined4 *)(ulong)uVar10;
          if ((((int)uVar10 < 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
             ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))
             ) {
            puVar14 = (undefined4 *)__errno();
            uVar9 = *puVar14;
            pcVar17 = "Failed to set TCP_KEEPCNT on fd %d: errno %d";
LAB_0090e32c:
            puVar14 = (undefined4 *)FUN_00904c98(param_2,pcVar17,iVar12,uVar9);
          }
        }
      }
    }
    if (*(long *)(param_2 + 0x268) == 0) {
LAB_0090e380:
      bVar8 = false;
    }
    else {
      bVar8 = true;
      FUN_0092f198(param_2,1);
      iVar12 = (**(code **)(param_2 + 0x268))(*(undefined8 *)(param_2 + 0x270),*piVar28,0);
      puVar14 = (undefined4 *)FUN_0092f198(param_2,0);
      if (iVar12 != 2) {
        if (iVar12 != 0) {
          iVar12 = 0x2a;
          goto LAB_0090e014;
        }
        goto LAB_0090e380;
      }
    }
    uVar10 = *(uint *)(lVar25 + 8);
    if ((uVar10 | 8) == 10) {
      lVar20 = param_1[3];
      iVar12 = *(int *)(lVar25 + 0x98);
      puVar14 = (undefined4 *)FUN_00925a5c(lVar25 + 0x18);
      local_2f8 = (long *)0x0;
      pcVar23 = *(char **)(param_2 + 0x830);
      pcVar24 = *(char **)(param_2 + 0x828);
      pcVar27 = *(char **)(param_2 + 0x838);
      uVar5 = *(ushort *)(param_2 + 0x220);
      uVar22 = (uint)uVar5;
      pcVar17 = pcVar24;
      if (pcVar23 != (char *)0x0) {
        pcVar17 = pcVar23;
      }
      pcVar2 = pcVar27;
      if (pcVar27 == (char *)0x0) {
        pcVar2 = pcVar24;
      }
      local_2fc = 1;
      if (((uVar5 != 0) || (pcVar17 != (char *)0x0)) || (pcVar2 != (char *)0x0)) {
        local_30c = (uint)*(ushort *)(param_2 + 0x222);
        memset(&local_f0,0,0x80);
        uVar13 = (uint)uVar5;
        if ((pcVar17 != (char *)0x0) && (sVar16 = strlen(pcVar17), sVar16 < 0xff)) {
          memset(acStack_2f0,0,0x100);
          iVar11 = setsockopt(iVar12,1,0x19,pcVar17,(int)sVar16 + 1);
          if ((pcVar27 == (char *)0x0) && (iVar11 == 0)) {
            puVar14 = (undefined4 *)0x0;
            if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))
                ))) {
              puVar14 = (undefined4 *)
                        FUN_00904c98(param_2,"socket successfully bound to interface \'%s\'",pcVar17
                                    );
            }
            goto LAB_0090e560;
          }
          if (pcVar27 == (char *)0x0) {
            puVar14 = (undefined4 *)
                      FUN_00925b58(uVar10,(ulong)puVar14 & 0xffffffff,
                                   *(undefined4 *)(lVar20 + 0x568),pcVar17,acStack_2f0,0x100);
            iVar11 = (int)puVar14;
            if (iVar11 == 2) {
              if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) ||
                 ((*(long *)(param_2 + 0x12a0) != 0 &&
                  (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1)))) {
                bVar7 = true;
                pcVar17 = acStack_2f0;
              }
              else {
                FUN_00904c98(param_2,"Local Interface %s is ip %s using address family %i",pcVar17,
                             acStack_2f0,uVar10);
                bVar7 = true;
                pcVar17 = acStack_2f0;
              }
joined_r0x0090e874:
              if (pcVar23 == (char *)0x0) {
                pcVar27 = pcVar17;
                goto LAB_0090e6ac;
              }
              if (bVar7) goto LAB_0090e8d0;
              goto LAB_0090e810;
            }
            if (iVar11 == 1) goto LAB_0090e804;
            if (iVar11 != 0) {
              bVar7 = false;
              pcVar17 = pcVar24;
              goto joined_r0x0090e874;
            }
            pcVar27 = pcVar24;
            if (pcVar23 == (char *)0x0) goto LAB_0090e6ac;
            puVar14 = (undefined4 *)__errno();
            uVar9 = *puVar14;
            *(undefined4 *)(param_2 + 0xcb8) = uVar9;
            uVar15 = FUN_00941a94(uVar9,local_1f0,0x100);
            pcVar27 = "Couldn\'t bind to interface \'%s\' with errno %d: %s";
          }
          else {
LAB_0090e6ac:
            pcVar17 = pcVar27;
            uVar4 = *(undefined1 *)(lVar20 + 0x573);
            if (uVar10 == 2) {
              uVar18 = 1;
LAB_0090e744:
              *(undefined1 *)(lVar20 + 0x573) = uVar18;
            }
            else if (uVar10 == 10) {
              uVar18 = 2;
              goto LAB_0090e744;
            }
            iVar11 = FUN_00917358(param_2,pcVar17,0x50,0,&local_2f8);
            if (iVar11 == 1) {
              FUN_0090ebcc(param_2,&local_2f8);
            }
            *(undefined1 *)(lVar20 + 0x573) = uVar4;
            if (local_2f8 != (long *)0x0) {
              FUN_00916bac(*local_2f8,acStack_2f0,0x100);
              if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_2 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
                FUN_00904c98(param_2,"Name \'%s\' family %i resolved to \'%s\' family %i",pcVar17,
                             uVar10,acStack_2f0,*(undefined4 *)(*local_2f8 + 4));
              }
              puVar14 = (undefined4 *)FUN_00917b54(param_2,local_2f8);
              if (*(uint *)(*local_2f8 + 4) != uVar10) {
LAB_0090e804:
                iVar12 = 7;
                goto LAB_0090e014;
              }
LAB_0090e8d0:
              if (uVar10 == 2) {
                iVar11 = inet_pton(2,acStack_2f0,(void *)((ulong)&local_f0 | 4));
                if (iVar11 < 1) {
                  __len = 0;
                }
                else {
                  local_f0.sa_data._0_2_ = uVar5 >> 8 | uVar5 << 8;
                  local_f0.sa_family = 2;
                  __len = 0x10;
                }
              }
              else {
                __len = 0;
                if (uVar10 == 10) {
                  pcVar27 = strchr(acStack_2f0,0x25);
                  pcVar17 = pcVar27;
                  if (pcVar27 != (char *)0x0) {
                    pcVar17 = pcVar27 + 1;
                    *pcVar27 = '\0';
                  }
                  iVar11 = inet_pton(10,acStack_2f0,local_f0.sa_data + 6);
                  if (0 < iVar11) {
                    local_f0.sa_data._0_2_ = uVar5 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
                    local_f0.sa_family = 10;
                    if (pcVar17 != (char *)0x0) {
                      puVar14 = (undefined4 *)strtoul(pcVar17,(char **)0x0,10);
                      if ((ulong)puVar14 >> 0x20 == 0) {
                        local_d8 = SUB84(puVar14,0);
                        __len = 0x1c;
                        goto LAB_0090e4e8;
                      }
                      goto LAB_0090e804;
                    }
                  }
                  __len = 0x1c;
                  goto LAB_0090e4e8;
                }
              }
              goto LAB_0090e4ec;
            }
LAB_0090e810:
            *(uint *)(param_2 + 0x131c) = *(uint *)(param_2 + 0x131c) & 0xfffffff7;
            puVar14 = (undefined4 *)__errno();
            uVar9 = *puVar14;
            *(undefined4 *)(param_2 + 0xcb8) = uVar9;
            uVar15 = FUN_00941a94(uVar9,local_1f0,0x100);
            pcVar27 = "Couldn\'t bind to \'%s\' with errno %d: %s";
          }
          puVar14 = (undefined4 *)FUN_00904b80(param_2,pcVar27,pcVar17,uVar9,uVar15);
          iVar12 = 0x2d;
          goto LAB_0090e014;
        }
        if (uVar10 != 2) {
          __len = 0;
          if (uVar10 == 10) {
            local_f0.sa_data._0_2_ = uVar5 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
            __len = 0x1c;
            local_f0.sa_family = (sa_family_t)uVar10;
          }
          goto LAB_0090e4ec;
        }
        local_f0.sa_data._0_2_ = uVar5 >> 8 | (ushort)((uVar13 & 0xff00ff) << 8);
        __len = 0x10;
        local_f0.sa_family = (sa_family_t)uVar10;
LAB_0090e4e8:
LAB_0090e4ec:
        setsockopt(iVar12,0,0x18,&local_2fc,4);
        uVar13 = bind(iVar12,&local_f0,__len);
        uVar10 = uVar22;
        if ((int)uVar13 < 0) {
          do {
            if ((int)local_30c < 2) {
LAB_0090e664:
              puVar14 = (undefined4 *)__errno();
              uVar9 = *puVar14;
              *(undefined4 *)(param_2 + 0xcb8) = uVar9;
              uVar15 = FUN_00941a94(uVar9,local_1f0,0x100);
              puVar14 = (undefined4 *)
                        FUN_00904b80(param_2,"bind failed with errno %d: %s",uVar9,uVar15);
              iVar12 = 0x2d;
              goto LAB_0090e014;
            }
            uVar22 = uVar10 + 1;
            if ((uVar22 & 0xffff) == 0) goto LAB_0090e664;
            local_30c = local_30c - 1;
            if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_2,"Bind to local port %d failed, trying next",(uVar22 & 0xffff) - 1
                          );
            }
            local_f0.sa_data._0_2_ =
                 (ushort)(uVar22 >> 8) & 0xff | (ushort)((uVar22 & 0xff00ff) << 8);
            uVar13 = bind(iVar12,&local_f0,__len);
            uVar10 = uVar10 + 1;
          } while ((int)uVar13 < 0);
        }
        puVar14 = (undefined4 *)(ulong)uVar13;
        if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
        {
          puVar14 = (undefined4 *)FUN_00904c98(param_2,"Local port: %hu",uVar22 & 0xffff);
        }
        *(ulong *)(lVar20 + 0x3a0) = *(ulong *)(lVar20 + 0x3a0) | 0x200000;
      }
    }
LAB_0090e560:
    if ((*(long *)(param_2 + 0x278) != 0) &&
       (puVar14 = (undefined4 *)FUN_009308ec(*piVar28,1), (int)puVar14 < 0)) {
      puVar14 = (undefined4 *)__errno();
      iVar12 = 1;
      *(undefined4 *)(lVar25 + 0x130) = *puVar14;
      goto LAB_0090e014;
    }
    iVar12 = 0;
    *(byte *)(lVar25 + 0x134) =
         *(byte *)(lVar25 + 0x134) & 0xfb | (*(int *)(lVar25 + 0xc) != 2) << 2;
    if (!bVar8) goto LAB_0090e074;
    FUN_0090db1c(param_1,param_2);
    auVar29 = FUN_00941cb8();
    puVar14 = auVar29._0_8_;
    *(undefined1 (*) [16])(lVar25 + 0x110) = auVar29;
    iVar12 = 0;
    *(byte *)((long)param_1 + 0x24) = *(byte *)((long)param_1 + 0x24) | 1;
    bVar3 = *(byte *)(param_2 + 0xa85);
  }
  if ((bVar3 >> 4 & 1) != 0) {
    if (*(long *)(param_2 + 0x12a0) == 0) {
      if (param_1 == (long *)0x0) goto LAB_0090e0c8;
    }
    else if ((param_1 == (long *)0x0) || (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))
    goto LAB_0090e0c8;
    if (0 < *(int *)(*param_1 + 0xc)) {
      puVar14 = (undefined4 *)
                FUN_00904ddc(param_2,param_1,"cf_socket_open() -> %d, fd=%d",iVar12,
                             *(undefined4 *)(lVar25 + 0x98));
    }
  }
LAB_0090e0c8:
  if (*(long *)(lVar6 + 0x28) != lVar19) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(puVar14);
  }
  return iVar12;
}


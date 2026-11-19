/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aec14
 */

long ssl_create_cipher_list
               (long param_1,undefined8 param_2,long *param_3,long *param_4,char *param_5,
               long param_6)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  long *ptr;
  int *piVar9;
  undefined8 uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  undefined *puVar14;
  long *plVar15;
  long *plVar16;
  long *plVar17;
  long *plVar18;
  long *plVar19;
  long *plVar20;
  long lVar21;
  char *pcVar22;
  int iVar23;
  long *local_70;
  long *local_68;
  
  local_70 = (long *)0x0;
  local_68 = (long *)0x0;
  if (param_4 == (long *)0x0) {
    return 0;
  }
  if (param_3 == (long *)0x0) {
    return 0;
  }
  if (param_5 == (char *)0x0) {
    return 0;
  }
  lVar21 = *(long *)(param_1 + 8);
  iVar7 = strncmp(param_5,"SUITEB128ONLY",0xd);
  if (iVar7 == 0) {
    bVar6 = false;
    uVar11 = 0x10000;
LAB_009aed04:
    *(uint *)(param_6 + 0x1c) = *(uint *)(param_6 + 0x1c) & 0xfffcffff | uVar11;
LAB_009aed14:
    if ((*(byte *)(*(long *)(lVar21 + 0xc0) + 0x60) >> 4 & 1) == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_ciph.c",0x503,"check_suiteb_cipher_list");
      uVar10 = 0x9e;
      goto LAB_009aefc4;
    }
    if (uVar11 == 0x10000) {
      param_5 = "ECDHE-ECDSA-AES128-GCM-SHA256";
    }
    else if (uVar11 == 0x20000) {
      param_5 = "ECDHE-ECDSA-AES256-GCM-SHA384";
    }
    else if ((uVar11 == 0x30000) &&
            (param_5 = "ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384", bVar6)) {
      param_5 = "ECDHE-ECDSA-AES256-GCM-SHA384";
    }
  }
  else {
    iVar7 = strncmp(param_5,"SUITEB128C2",0xb);
    if (iVar7 == 0) {
      bVar6 = true;
      uVar11 = 0x30000;
      goto LAB_009aed04;
    }
    iVar7 = strncmp(param_5,"SUITEB128",9);
    if (iVar7 == 0) {
      bVar6 = false;
      uVar11 = 0x30000;
      goto LAB_009aed04;
    }
    iVar7 = strncmp(param_5,"SUITEB192",9);
    if (iVar7 == 0) {
      bVar6 = false;
      uVar11 = 0x20000;
      goto LAB_009aed04;
    }
    uVar11 = *(uint *)(param_6 + 0x1c) & 0x30000;
    if (uVar11 != 0) {
      bVar6 = false;
      goto LAB_009aed14;
    }
  }
  uVar11 = *(uint *)(param_1 + 0x648);
  uVar1 = *(uint *)(param_1 + 0x640);
  uVar2 = *(uint *)(param_1 + 0x64c);
  uVar3 = *(uint *)(param_1 + 0x644);
  iVar7 = (**(code **)(lVar21 + 0xa8))();
  ptr = CRYPTO_malloc(iVar7 << 5,"ssl/ssl_ciph.c",0x5cb);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_ciph.c",0x5cd,"ssl_create_cipher_list");
    uVar10 = 0xc0100;
LAB_009aefc4:
    ERR_set_error(0x14,uVar10,0);
    return 0;
  }
  if (iVar7 < 1) {
LAB_009aeef0:
    local_68 = (long *)0x0;
    local_70 = (long *)0x0;
  }
  else {
    iVar23 = 0;
    iVar8 = 0;
    do {
      piVar9 = (int *)(**(code **)(lVar21 + 0xb0))(iVar23);
      if (((((piVar9 != (int *)0x0) && (*piVar9 != 0)) && ((piVar9[7] & uVar11) == 0)) &&
          (((piVar9[8] & uVar2) == 0 && ((piVar9[9] & uVar1) == 0)))) && ((piVar9[10] & uVar3) == 0)
         ) {
        if ((*(byte *)(*(long *)(lVar21 + 0xc0) + 0x60) >> 3 & 1) == 0) {
          iVar4 = piVar9[0xb];
        }
        else {
          iVar4 = piVar9[0xd];
        }
        if (iVar4 != 0) {
          lVar12 = (long)iVar8;
          iVar8 = iVar8 + 1;
          plVar20 = ptr + lVar12 * 4;
          *plVar20 = (long)piVar9;
          *(undefined4 *)(plVar20 + 1) = 0;
          plVar20[2] = 0;
          plVar20[3] = 0;
        }
      }
      iVar23 = iVar23 + 1;
    } while (iVar7 != iVar23);
    if (iVar8 < 1) goto LAB_009aeef0;
    lVar21 = 0;
    uVar5 = iVar8 - 1;
    ptr[3] = 0;
    if (uVar5 != 0) {
      ptr[2] = (long)(ptr + 4);
      if (2 < iVar8) {
        uVar13 = (ulong)uVar5 - 1;
        if (uVar13 < 2) {
          lVar21 = 1;
        }
        else {
          lVar12 = uVar13 - (~uVar5 & 1);
          lVar21 = lVar12 + 1;
          plVar20 = ptr + 0xc;
          do {
            lVar12 = lVar12 + -2;
            plVar20[-6] = (long)(plVar20 + -4);
            plVar20[-5] = (long)(plVar20 + -0xc);
            plVar20[-2] = (long)plVar20;
            plVar20[-1] = (long)(plVar20 + -8);
            plVar20 = plVar20 + 8;
          } while (lVar12 != 0);
          if ((~uVar5 & 1) == 0) goto LAB_009af53c;
        }
        lVar12 = (ulong)uVar5 - lVar21;
        plVar20 = ptr + lVar21 * 4;
        do {
          lVar12 = lVar12 + -1;
          plVar20[2] = (long)(plVar20 + 4);
          plVar20[3] = (long)(plVar20 + -4);
          plVar20 = plVar20 + 4;
        } while (lVar12 != 0);
      }
LAB_009af53c:
      lVar21 = (long)(int)uVar5;
      ptr[lVar21 * 4 + 3] = (long)(ptr + (long)(iVar8 + -2) * 4);
    }
    plVar20 = ptr + lVar21 * 4;
    plVar20[2] = 0;
    plVar19 = plVar20;
    plVar18 = ptr;
    if (plVar20 != (long *)0x0) {
      plVar17 = ptr;
      plVar16 = ptr;
      do {
        plVar15 = (long *)plVar16[2];
        plVar18 = plVar17;
        if ((((*(byte *)(*plVar16 + 0x1c) >> 2 & 1) != 0) &&
            ((*(byte *)(*plVar16 + 0x20) >> 3 & 1) != 0)) && ((int)plVar16[1] == 0)) {
          if (plVar16 != plVar19) {
            lVar21 = plVar16[3];
            plVar18 = plVar15;
            if (plVar16 != plVar17) {
              plVar18 = plVar17;
            }
            plVar17 = plVar15;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar15;
              plVar17 = (long *)plVar16[2];
            }
            if (plVar17 != (long *)0x0) {
              plVar17[3] = lVar21;
            }
            plVar19[2] = (long)plVar16;
            plVar16[2] = 0;
            plVar16[3] = (long)plVar19;
            plVar19 = plVar16;
          }
          *(undefined4 *)(plVar16 + 1) = 1;
        }
        if (plVar16 == plVar20) break;
        plVar17 = plVar18;
        plVar16 = plVar15;
      } while (plVar15 != (long *)0x0);
    }
    plVar20 = plVar19;
    if ((plVar18 != (long *)0x0) && (plVar19 != (long *)0x0)) {
      plVar17 = plVar18;
      plVar16 = plVar18;
      do {
        plVar15 = (long *)plVar16[2];
        plVar18 = plVar17;
        if (((*(byte *)(*plVar16 + 0x1c) >> 2 & 1) != 0) && ((int)plVar16[1] == 0)) {
          if (plVar16 != plVar20) {
            lVar21 = plVar16[3];
            plVar18 = plVar15;
            if (plVar16 != plVar17) {
              plVar18 = plVar17;
            }
            plVar17 = plVar15;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar15;
              plVar17 = (long *)plVar16[2];
            }
            if (plVar17 != (long *)0x0) {
              plVar17[3] = lVar21;
            }
            plVar20[2] = (long)plVar16;
            plVar16[2] = 0;
            plVar16[3] = (long)plVar20;
            plVar20 = plVar16;
          }
          *(undefined4 *)(plVar16 + 1) = 1;
        }
        if (plVar16 == plVar19) break;
        plVar17 = plVar18;
        plVar16 = plVar15;
      } while (plVar15 != (long *)0x0);
    }
    if (plVar18 != (long *)0x0) {
      plVar19 = plVar18;
      plVar17 = plVar20;
      plVar16 = plVar20;
      if (plVar20 != (long *)0x0) {
        do {
          plVar15 = (long *)plVar17[3];
          plVar20 = plVar16;
          if (((*(byte *)(*plVar17 + 0x1c) >> 2 & 1) != 0) && ((int)plVar17[1] != 0)) {
            if (plVar17 != plVar19) {
              lVar21 = plVar17[2];
              plVar20 = plVar15;
              if (plVar17 != plVar16) {
                plVar20 = plVar16;
              }
              plVar16 = plVar15;
              if (lVar21 != 0) {
                *(long **)(lVar21 + 0x18) = plVar15;
                plVar16 = (long *)plVar17[3];
              }
              if (plVar16 != (long *)0x0) {
                plVar16[2] = lVar21;
              }
              plVar19[3] = (long)plVar17;
              plVar17[2] = (long)plVar19;
              plVar17[3] = 0;
              plVar19 = plVar17;
            }
            *(undefined4 *)(plVar17 + 1) = 0;
          }
          if (plVar17 == plVar18) break;
          plVar17 = plVar15;
          plVar16 = plVar20;
        } while (plVar15 != (long *)0x0);
        plVar18 = plVar19;
      }
    }
    plVar17 = plVar20;
    plVar19 = plVar18;
    if ((plVar18 != (long *)0x0) && (plVar16 = plVar18, plVar20 != (long *)0x0)) {
      do {
        plVar15 = (long *)plVar16[2];
        plVar19 = plVar18;
        if (((*(byte *)(*plVar16 + 0x25) & 0x30) != 0) && ((int)plVar16[1] == 0)) {
          if (plVar16 != plVar17) {
            lVar21 = plVar16[3];
            plVar19 = plVar15;
            if (plVar16 != plVar18) {
              plVar19 = plVar18;
            }
            plVar18 = plVar15;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar15;
              plVar18 = (long *)plVar16[2];
            }
            if (plVar18 != (long *)0x0) {
              plVar18[3] = lVar21;
            }
            plVar17[2] = (long)plVar16;
            plVar16[2] = 0;
            plVar16[3] = (long)plVar17;
            plVar17 = plVar16;
          }
          *(undefined4 *)(plVar16 + 1) = 1;
        }
        if (plVar16 == plVar20) break;
        plVar18 = plVar19;
        plVar16 = plVar15;
      } while (plVar15 != (long *)0x0);
    }
    plVar18 = plVar17;
    plVar20 = plVar19;
    if ((plVar19 != (long *)0x0) && (plVar16 = plVar19, plVar17 != (long *)0x0)) {
      do {
        plVar15 = (long *)plVar16[2];
        plVar20 = plVar19;
        if (((*(byte *)(*plVar16 + 0x26) >> 3 & 1) != 0) && ((int)plVar16[1] == 0)) {
          if (plVar16 != plVar18) {
            lVar21 = plVar16[3];
            plVar20 = plVar15;
            if (plVar16 != plVar19) {
              plVar20 = plVar19;
            }
            plVar19 = plVar15;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar15;
              plVar19 = (long *)plVar16[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar18[2] = (long)plVar16;
            plVar16[2] = 0;
            plVar16[3] = (long)plVar18;
            plVar18 = plVar16;
          }
          *(undefined4 *)(plVar16 + 1) = 1;
        }
        if (plVar16 == plVar17) break;
        plVar19 = plVar20;
        plVar16 = plVar15;
      } while (plVar15 != (long *)0x0);
    }
    plVar17 = plVar18;
    plVar19 = plVar20;
    if ((plVar20 != (long *)0x0) && (plVar16 = plVar20, plVar18 != (long *)0x0)) {
      do {
        plVar15 = (long *)plVar16[2];
        plVar19 = plVar20;
        if (((*(uint *)(*plVar16 + 0x24) & 0x3c0c0) != 0) && ((int)plVar16[1] == 0)) {
          if (plVar16 != plVar17) {
            lVar21 = plVar16[3];
            plVar19 = plVar15;
            if (plVar16 != plVar20) {
              plVar19 = plVar20;
            }
            plVar20 = plVar15;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar15;
              plVar20 = (long *)plVar16[2];
            }
            if (plVar20 != (long *)0x0) {
              plVar20[3] = lVar21;
            }
            plVar17[2] = (long)plVar16;
            plVar16[2] = 0;
            plVar16[3] = (long)plVar17;
            plVar17 = plVar16;
          }
          *(undefined4 *)(plVar16 + 1) = 1;
        }
        if (plVar16 == plVar18) break;
        plVar20 = plVar19;
        plVar16 = plVar15;
      } while (plVar15 != (long *)0x0);
    }
    plVar20 = plVar17;
    local_68 = plVar19;
    if ((plVar19 != (long *)0x0) && (plVar18 = plVar19, plVar17 != (long *)0x0)) {
      do {
        plVar16 = (long *)plVar18[2];
        local_68 = plVar19;
        if ((int)plVar18[1] == 0) {
          if (plVar18 != plVar20) {
            lVar21 = plVar18[3];
            local_68 = plVar16;
            if (plVar18 != plVar19) {
              local_68 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar16;
              plVar19 = (long *)plVar18[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar20[2] = (long)plVar18;
            plVar18[2] = 0;
            plVar18[3] = (long)plVar20;
            plVar20 = plVar18;
          }
          *(undefined4 *)(plVar18 + 1) = 1;
        }
        if (plVar18 == plVar17) break;
        plVar19 = local_68;
        plVar18 = plVar16;
      } while (plVar16 != (long *)0x0);
    }
    plVar18 = plVar20;
    if (local_68 != (long *)0x0) {
      plVar19 = local_68;
      plVar17 = local_68;
      if (plVar20 != (long *)0x0) {
        do {
          plVar16 = (long *)plVar17[2];
          local_68 = plVar19;
          if ((((*(byte *)(*plVar17 + 0x28) & 1) != 0) && ((int)plVar17[1] != 0)) &&
             (plVar17 != plVar18)) {
            lVar21 = plVar17[3];
            local_68 = plVar16;
            if (plVar17 != plVar19) {
              local_68 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar16;
              plVar19 = (long *)plVar17[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar18[2] = (long)plVar17;
            plVar17[2] = 0;
            plVar17[3] = (long)plVar18;
            plVar18 = plVar17;
          }
          if (plVar17 == plVar20) break;
          plVar19 = local_68;
          plVar17 = plVar16;
        } while (plVar16 != (long *)0x0);
      }
    }
    plVar20 = plVar18;
    if (local_68 != (long *)0x0) {
      plVar19 = local_68;
      plVar17 = local_68;
      if (plVar18 != (long *)0x0) {
        do {
          plVar16 = (long *)plVar17[2];
          local_68 = plVar19;
          if ((((*(byte *)(*plVar17 + 0x20) >> 2 & 1) != 0) && ((int)plVar17[1] != 0)) &&
             (plVar17 != plVar20)) {
            lVar21 = plVar17[3];
            local_68 = plVar16;
            if (plVar17 != plVar19) {
              local_68 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar16;
              plVar19 = (long *)plVar17[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar20[2] = (long)plVar17;
            plVar17[2] = 0;
            plVar17[3] = (long)plVar20;
            plVar20 = plVar17;
          }
          if (plVar17 == plVar18) break;
          plVar19 = local_68;
          plVar17 = plVar16;
        } while (plVar16 != (long *)0x0);
      }
    }
    plVar18 = plVar20;
    if (local_68 != (long *)0x0) {
      plVar19 = local_68;
      plVar17 = local_68;
      if (plVar20 != (long *)0x0) {
        do {
          plVar16 = (long *)plVar17[2];
          local_68 = plVar19;
          if ((((*(byte *)(*plVar17 + 0x1c) & 1) != 0) && ((int)plVar17[1] != 0)) &&
             (plVar17 != plVar18)) {
            lVar21 = plVar17[3];
            local_68 = plVar16;
            if (plVar17 != plVar19) {
              local_68 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar16;
              plVar19 = (long *)plVar17[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar18[2] = (long)plVar17;
            plVar17[2] = 0;
            plVar17[3] = (long)plVar18;
            plVar18 = plVar17;
          }
          if (plVar17 == plVar20) break;
          plVar19 = local_68;
          plVar17 = plVar16;
        } while (plVar16 != (long *)0x0);
      }
    }
    plVar20 = plVar18;
    if (local_68 != (long *)0x0) {
      plVar19 = local_68;
      plVar17 = local_68;
      if (plVar18 != (long *)0x0) {
        do {
          plVar16 = (long *)plVar17[2];
          local_68 = plVar19;
          if ((((*(byte *)(*plVar17 + 0x1c) >> 3 & 1) != 0) && ((int)plVar17[1] != 0)) &&
             (plVar17 != plVar20)) {
            lVar21 = plVar17[3];
            local_68 = plVar16;
            if (plVar17 != plVar19) {
              local_68 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x10) = plVar16;
              plVar19 = (long *)plVar17[2];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[3] = lVar21;
            }
            plVar20[2] = (long)plVar17;
            plVar17[2] = 0;
            plVar17[3] = (long)plVar20;
            plVar20 = plVar17;
          }
          if (plVar17 == plVar18) break;
          plVar19 = local_68;
          plVar17 = plVar16;
        } while (plVar16 != (long *)0x0);
      }
    }
    local_70 = plVar20;
    plVar18 = local_68;
    plVar19 = local_68;
    plVar17 = plVar20;
    if (local_68 != (long *)0x0) {
      do {
        local_68 = plVar19;
        if (plVar17 == (long *)0x0) break;
        plVar17 = (long *)plVar18[2];
        if ((((*(byte *)(*plVar18 + 0x24) >> 2 & 1) != 0) && ((int)plVar18[1] != 0)) &&
           (plVar18 != local_70)) {
          lVar21 = plVar18[3];
          local_68 = plVar17;
          if (plVar18 != plVar19) {
            local_68 = plVar19;
          }
          plVar19 = plVar17;
          if (lVar21 != 0) {
            *(long **)(lVar21 + 0x10) = plVar17;
            plVar19 = (long *)plVar18[2];
          }
          if (plVar19 != (long *)0x0) {
            plVar19[3] = lVar21;
          }
          local_70[2] = (long)plVar18;
          plVar18[2] = 0;
          plVar18[3] = (long)local_70;
          local_70 = plVar18;
        }
        bVar6 = plVar18 != plVar20;
        plVar18 = plVar17;
        plVar19 = local_68;
      } while (bVar6);
    }
  }
  iVar8 = FUN_009afe44(&local_68,&local_70);
  if (iVar8 == 0) {
LAB_009af4b8:
    CRYPTO_free(ptr);
    return 0;
  }
  plVar20 = local_68;
  if ((local_68 != (long *)0x0) && (local_70 != (long *)0x0)) {
    plVar18 = local_70;
    plVar19 = local_70;
    do {
      plVar17 = (long *)plVar19[3];
      local_70 = plVar18;
      if (((*(int *)(*plVar19 + 0x2c) == 0x303) && ((int)plVar19[1] != 0)) && (plVar19 != plVar20))
      {
        lVar21 = plVar19[2];
        local_70 = plVar17;
        if (plVar19 != plVar18) {
          local_70 = plVar18;
        }
        plVar18 = plVar17;
        if (lVar21 != 0) {
          *(long **)(lVar21 + 0x18) = plVar17;
          plVar18 = (long *)plVar19[3];
        }
        if (plVar18 != (long *)0x0) {
          plVar18[2] = lVar21;
        }
        plVar20[3] = (long)plVar19;
        plVar19[2] = (long)plVar20;
        plVar19[3] = 0;
        plVar20 = plVar19;
      }
      if (plVar19 == local_68) break;
      plVar18 = local_70;
      plVar19 = plVar17;
    } while (plVar17 != (long *)0x0);
  }
  if ((plVar20 != (long *)0x0) && (local_70 != (long *)0x0)) {
    plVar18 = local_70;
    plVar19 = plVar20;
    plVar17 = local_70;
    do {
      plVar16 = (long *)plVar17[3];
      local_70 = plVar18;
      if ((((*(byte *)(*plVar17 + 0x28) >> 6 & 1) != 0) && ((int)plVar17[1] != 0)) &&
         (plVar17 != plVar19)) {
        lVar21 = plVar17[2];
        local_70 = plVar16;
        if (plVar17 != plVar18) {
          local_70 = plVar18;
        }
        plVar18 = plVar16;
        if (lVar21 != 0) {
          *(long **)(lVar21 + 0x18) = plVar16;
          plVar18 = (long *)plVar17[3];
        }
        if (plVar18 != (long *)0x0) {
          plVar18[2] = lVar21;
        }
        plVar19[3] = (long)plVar17;
        plVar17[2] = (long)plVar19;
        plVar17[3] = 0;
        plVar19 = plVar17;
      }
      if (plVar17 == plVar20) break;
      plVar18 = local_70;
      plVar17 = plVar16;
    } while (plVar16 != (long *)0x0);
    plVar20 = plVar19;
  }
  plVar18 = plVar20;
  if (plVar20 != (long *)0x0) {
    plVar19 = local_70;
    plVar17 = local_70;
    if (local_70 != (long *)0x0) {
      do {
        plVar16 = (long *)plVar17[3];
        local_70 = plVar19;
        if ((((*(byte *)(*plVar17 + 0x1c) & 6) != 0) && ((int)plVar17[1] != 0)) &&
           (plVar17 != plVar18)) {
          lVar21 = plVar17[2];
          local_70 = plVar16;
          if (plVar17 != plVar19) {
            local_70 = plVar19;
          }
          plVar19 = plVar16;
          if (lVar21 != 0) {
            *(long **)(lVar21 + 0x18) = plVar16;
            plVar19 = (long *)plVar17[3];
          }
          if (plVar19 != (long *)0x0) {
            plVar19[2] = lVar21;
          }
          plVar18[3] = (long)plVar17;
          plVar17[2] = (long)plVar18;
          plVar17[3] = 0;
          plVar18 = plVar17;
        }
        if (plVar17 == plVar20) break;
        plVar19 = local_70;
        plVar17 = plVar16;
      } while (plVar16 != (long *)0x0);
    }
  }
  plVar20 = plVar18;
  if (plVar18 != (long *)0x0) {
    plVar19 = local_70;
    plVar17 = local_70;
    if (local_70 != (long *)0x0) {
      do {
        plVar16 = (long *)plVar17[3];
        local_70 = plVar19;
        if ((((*(byte *)(*plVar17 + 0x1c) & 6) != 0) && ((*(byte *)(*plVar17 + 0x28) >> 6 & 1) != 0)
            ) && (((int)plVar17[1] != 0 && (plVar17 != plVar20)))) {
          lVar21 = plVar17[2];
          local_70 = plVar16;
          if (plVar17 != plVar19) {
            local_70 = plVar19;
          }
          plVar19 = plVar16;
          if (lVar21 != 0) {
            *(long **)(lVar21 + 0x18) = plVar16;
            plVar19 = (long *)plVar17[3];
          }
          if (plVar19 != (long *)0x0) {
            plVar19[2] = lVar21;
          }
          plVar20[3] = (long)plVar17;
          plVar17[2] = (long)plVar20;
          plVar17[3] = 0;
          plVar20 = plVar17;
        }
        if (plVar17 == plVar18) break;
        plVar19 = local_70;
        plVar17 = plVar16;
      } while (plVar16 != (long *)0x0);
    }
  }
  plVar18 = plVar20;
  if (plVar20 != (long *)0x0) {
    plVar19 = local_70;
    plVar17 = local_70;
    if (local_70 != (long *)0x0) {
      do {
        plVar16 = (long *)plVar17[3];
        local_70 = plVar19;
        if ((int)plVar17[1] != 0) {
          if (plVar17 != plVar18) {
            lVar21 = plVar17[2];
            local_70 = plVar16;
            if (plVar17 != plVar19) {
              local_70 = plVar19;
            }
            plVar19 = plVar16;
            if (lVar21 != 0) {
              *(long **)(lVar21 + 0x18) = plVar16;
              plVar19 = (long *)plVar17[3];
            }
            if (plVar19 != (long *)0x0) {
              plVar19[2] = lVar21;
            }
            plVar18[3] = (long)plVar17;
            plVar17[2] = (long)plVar18;
            plVar17[3] = 0;
            plVar18 = plVar17;
          }
          *(undefined4 *)(plVar17 + 1) = 0;
        }
        if (plVar17 == plVar20) break;
        plVar19 = local_70;
        plVar17 = plVar16;
      } while (plVar16 != (long *)0x0);
    }
  }
  local_68 = plVar18;
  plVar20 = CRYPTO_malloc((iVar7 + 0x50) * 8,"ssl/ssl_ciph.c",0x63b);
  if (plVar20 == (long *)0x0) {
    CRYPTO_free(ptr);
    ERR_new();
    ERR_set_debug("ssl/ssl_ciph.c",0x63e,"ssl_create_cipher_list");
    ERR_set_error(0x14,0xc0100,0);
    return 0;
  }
  if (plVar18 == (long *)0x0) {
    plVar19 = plVar20;
  }
  else {
    plVar17 = plVar20;
    do {
      plVar19 = plVar17 + 1;
      *plVar17 = *plVar18;
      plVar18 = (long *)plVar18[2];
      plVar17 = plVar19;
    } while (plVar18 != (long *)0x0);
  }
  puVar14 = &DAT_00c53c80;
  lVar21 = 0x4f;
  do {
    plVar18 = plVar19;
    if (((*(uint *)(puVar14 + 0x1c) == 0) || ((*(uint *)(puVar14 + 0x1c) & ~uVar11) != 0)) &&
       ((((*(uint *)(puVar14 + 0x20) == 0 || ((*(uint *)(puVar14 + 0x20) & ~uVar2) != 0)) &&
         ((*(uint *)(puVar14 + 0x24) == 0 || ((*(uint *)(puVar14 + 0x24) & ~uVar1) != 0)))) &&
        ((*(uint *)(puVar14 + 0x28) == 0 || ((*(uint *)(puVar14 + 0x28) & ~uVar3) != 0)))))) {
      plVar18 = plVar19 + 1;
      *plVar19 = (long)puVar14;
    }
    lVar21 = lVar21 + -1;
    puVar14 = puVar14 + 0x50;
    plVar19 = plVar18;
  } while (lVar21 != 0);
  *plVar18 = 0;
  iVar7 = strncmp(param_5,"DEFAULT",7);
  pcVar22 = param_5;
  if (iVar7 == 0) {
    iVar7 = FUN_009affdc("ALL:!COMPLEMENTOFDEFAULT:!eNULL",&local_68,&local_70,plVar20,param_6);
    pcVar22 = param_5 + 7;
    if (*pcVar22 == ':') {
      pcVar22 = param_5 + 8;
    }
    if (iVar7 == 0) {
      CRYPTO_free(plVar20);
      goto LAB_009af4b8;
    }
  }
  if (*pcVar22 == '\0') {
    CRYPTO_free(plVar20);
  }
  else {
    iVar7 = FUN_009affdc(pcVar22,&local_68,&local_70,plVar20,param_6);
    CRYPTO_free(plVar20);
    if (iVar7 == 0) goto LAB_009af4b8;
  }
  lVar21 = OPENSSL_sk_new_null();
  if (lVar21 == 0) {
    CRYPTO_free(ptr);
    return 0;
  }
  iVar7 = OPENSSL_sk_num(param_2);
  plVar20 = local_68;
  if (0 < iVar7) {
    iVar7 = 0;
    do {
      lVar12 = OPENSSL_sk_value(param_2,iVar7);
      if (((*(uint *)(lVar12 + 0x24) & uVar1) == 0) &&
         ((*(uint *)(param_1 + 0x644) & (&DAT_0074bf1c)[(ulong)*(byte *)(lVar12 + 0x40) * 2]) == 0))
      {
        iVar8 = OPENSSL_sk_push(lVar21,lVar12);
        if (iVar8 == 0) goto LAB_009afb40;
      }
      else {
        OPENSSL_sk_delete(param_2,iVar7);
        iVar7 = iVar7 + -1;
      }
      iVar7 = iVar7 + 1;
      iVar8 = OPENSSL_sk_num(param_2);
      plVar20 = local_68;
    } while (iVar7 < iVar8);
  }
  for (; plVar20 != (long *)0x0; plVar20 = (long *)plVar20[2]) {
    if (((int)plVar20[1] != 0) && (iVar7 = OPENSSL_sk_push(lVar21,*plVar20), iVar7 == 0))
    goto LAB_009afb40;
  }
  CRYPTO_free(ptr);
  lVar12 = OPENSSL_sk_dup(lVar21);
  if (lVar12 != 0) {
    OPENSSL_sk_free(*param_4);
    *param_4 = lVar12;
    OPENSSL_sk_set_cmp_func(lVar12,ssl_cipher_ptr_id_cmp);
    OPENSSL_sk_sort(*param_4);
    OPENSSL_sk_free(*param_3);
    *param_3 = lVar21;
    return lVar21;
  }
LAB_009afb48:
  OPENSSL_sk_free(lVar21);
  return 0;
LAB_009afb40:
  CRYPTO_free(ptr);
  goto LAB_009afb48;
}


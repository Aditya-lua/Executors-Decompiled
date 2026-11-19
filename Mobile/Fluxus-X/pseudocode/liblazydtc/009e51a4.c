/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e51a4
 */

/* WARNING: Removing unreachable block (ram,0x009e5414) */
/* WARNING: Removing unreachable block (ram,0x009e55f4) */

undefined4 ssl_choose_server_version(uint *param_1,long param_2,undefined4 *param_3)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  bool bVar7;
  undefined4 uVar8;
  uint uVar9;
  uint uVar10;
  int *piVar11;
  long lVar12;
  long lVar13;
  byte *pbVar14;
  uint *puVar15;
  ulong uVar16;
  byte *pbVar17;
  undefined8 local_48;
  
  piVar11 = *(int **)(param_1 + 2);
  uVar9 = *(uint *)(param_2 + 4);
  iVar4 = *piVar11;
  param_1[0x283] = uVar9;
  if (iVar4 == 0x10000) {
LAB_009e5210:
    puVar15 = &DAT_00c58798;
  }
  else {
    if (iVar4 != 0x1ffff) {
      if ((((*(uint *)(*(long *)(piVar11 + 0x30) + 0x60) >> 3 & 1) != 0) || (iVar4 < 0x304)) ||
         (iVar4 == 0x10000)) {
        uVar10 = *param_1;
        if (uVar9 != uVar10) {
          if ((*(uint *)(*(long *)(piVar11 + 0x30) + 0x60) >> 3 & 1) == 0) {
            if ((int)uVar9 < (int)uVar10) {
              return 0x10a;
            }
          }
          else {
            uVar1 = 0xff00;
            if (uVar9 != 0x100) {
              uVar1 = uVar9;
            }
            uVar9 = 0xff00;
            if (uVar10 != 0x100) {
              uVar9 = uVar10;
            }
            if ((int)uVar9 < (int)uVar1) {
              return 0x10a;
            }
          }
        }
        *param_3 = 0;
        return 0;
      }
      goto LAB_009e5210;
    }
    puVar15 = &DAT_00c58828;
  }
  lVar12 = *(long *)(param_2 + 0x288);
  if (*(int *)(lVar12 + 0x2b8) == 0) {
    if (param_1[0x23a] != 0) {
      return 0x102;
    }
LAB_009e5280:
    if (uVar9 == 0x304) {
      uVar9 = 0x303;
      uVar10 = *puVar15;
    }
    else if ((*(byte *)(*(long *)(piVar11 + 0x30) + 0x60) >> 3 & 1) == 0) {
      if (0x302 < (int)uVar9) {
        uVar9 = 0x303;
      }
      uVar10 = *puVar15;
    }
    else {
      if ((int)uVar9 < 0x305 && uVar9 != 0x100) {
        uVar9 = 0x303;
      }
      uVar10 = *puVar15;
    }
    if (uVar10 != 0) {
      bVar7 = false;
      uVar1 = 0xff00;
      if (uVar9 != 0x100) {
        uVar1 = uVar9;
      }
      do {
        while( true ) {
          if (*(code **)(puVar15 + 4) == (code *)0x0) goto LAB_009e5368;
          if (uVar9 != uVar10) break;
LAB_009e5330:
          uVar6 = (**(code **)(puVar15 + 4))();
          iVar4 = FUN_009e4f38(param_1,uVar6);
          if (iVar4 == 0) {
            uVar9 = *puVar15;
            if ((uVar9 == 0x303) && (iVar4 = ssl_version_supported(param_1,0x304,0), iVar4 != 0)) {
              uVar8 = 1;
              goto LAB_009e5564;
            }
            if ((0x302 < (int)uVar9) ||
               ((*(uint *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0))
            goto LAB_009e5560;
            iVar4 = **(int **)(param_1 + 2);
            if (iVar4 == 0x10000) {
              piVar11 = &DAT_00c58798;
              iVar4 = 0x304;
            }
            else {
              if (iVar4 != 0x1ffff) {
                if (*param_1 != 0x303) goto LAB_009e5560;
                goto LAB_009e5558;
              }
              piVar11 = &DAT_00c58828;
              iVar4 = 0xfefd;
            }
            goto LAB_009e54ec;
          }
          bVar7 = true;
          puVar15 = puVar15 + 6;
          uVar10 = *puVar15;
          if (uVar10 == 0) goto LAB_009e5370;
        }
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) != 0) {
          uVar2 = 0xff00;
          if (uVar10 != 0x100) {
            uVar2 = uVar10;
          }
          if ((int)uVar2 < (int)uVar1) goto LAB_009e5368;
          goto LAB_009e5330;
        }
        if ((int)uVar10 <= (int)uVar9) goto LAB_009e5330;
LAB_009e5368:
        puVar15 = puVar15 + 6;
        uVar10 = *puVar15;
      } while (uVar10 != 0);
LAB_009e5370:
      if (bVar7) {
        return 0x102;
      }
    }
    return 0x18c;
  }
  if ((*(byte *)(*(long *)(piVar11 + 0x30) + 0x60) >> 3 & 1) != 0) goto LAB_009e5280;
  local_48 = 0;
  lVar13 = *(long *)(lVar12 + 0x2b0);
  *(undefined4 *)(lVar12 + 700) = 1;
  if (lVar13 == 0) {
    return 0x9f;
  }
  pbVar14 = *(byte **)(lVar12 + 0x2a8);
  uVar16 = lVar13 - 1;
  pbVar17 = pbVar14 + 1;
  bVar3 = *pbVar14;
  if (uVar16 != bVar3) {
    return 0x9f;
  }
  *(byte **)(lVar12 + 0x2a8) = pbVar14 + lVar13;
  *(undefined8 *)(lVar12 + 0x2b0) = 0;
  if ((int)uVar9 < 0x301) {
    return 0x124;
  }
  if (1 < bVar3) {
    uVar9 = 0;
LAB_009e544c:
    pbVar14 = pbVar17;
    uVar10 = 0xff00;
    if (uVar9 != 0x100) {
      uVar10 = uVar9;
    }
    do {
      pbVar17 = pbVar14 + 2;
      uVar16 = uVar16 - 2;
      uVar1 = (uint)CONCAT11(*pbVar14,pbVar14[1]);
      if (uVar1 != uVar9) {
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
          if (uVar9 <= uVar1) goto LAB_009e54ac;
        }
        else {
          uVar2 = 0xff00;
          if (uVar1 != 0x100) {
            uVar2 = uVar1;
          }
          if (uVar2 <= uVar10) goto LAB_009e54ac;
        }
      }
      pbVar14 = pbVar17;
      if (uVar16 < 2) goto joined_r0x009e54cc;
    } while( true );
  }
  uVar9 = 0;
joined_r0x009e54cc:
  if (uVar16 != 0) {
    return 0x9f;
  }
  if (uVar9 == 0) {
    return 0x102;
  }
  if (param_1[0x23a] != 0) {
    uVar8 = 0;
    if (uVar9 != 0x304) {
      uVar8 = 0x102;
    }
    return uVar8;
  }
  if ((uVar9 == 0x303) && (iVar4 = ssl_version_supported(param_1,0x304,0), iVar4 != 0)) {
    uVar8 = 1;
    goto LAB_009e5684;
  }
  if ((uVar9 < 0x303) &&
     ((*(uint *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0)) {
    iVar4 = **(int **)(param_1 + 2);
    if (iVar4 == 0x10000) {
      piVar11 = &DAT_00c58798;
      iVar4 = 0x304;
    }
    else {
      if (iVar4 != 0x1ffff) {
        if (*param_1 == 0x303) {
LAB_009e5678:
          uVar8 = 2;
          goto LAB_009e5684;
        }
        goto LAB_009e5680;
      }
      piVar11 = &DAT_00c58828;
      iVar4 = 0xfefd;
    }
    do {
      if (iVar4 == 0x303) {
        if (*(code **)(piVar11 + 2) != (code *)0x0) {
          uVar6 = (**(code **)(piVar11 + 2))();
          iVar4 = FUN_009e4f38(param_1,uVar6);
          if (iVar4 == 0) goto LAB_009e5678;
        }
      }
      else if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
        if (iVar4 < 0x304) break;
      }
      else if ((iVar4 == 0x100) || (0x302 < iVar4)) break;
      iVar4 = piVar11[6];
      piVar11 = piVar11 + 6;
    } while (iVar4 != 0);
  }
LAB_009e5680:
  uVar8 = 0;
LAB_009e5684:
  *param_3 = uVar8;
  *param_1 = uVar9;
  *(undefined8 *)(param_1 + 2) = local_48;
  return 0;
LAB_009e54ac:
  iVar4 = ssl_version_supported(param_1,uVar1,&local_48);
  if (iVar4 != 0) {
    uVar9 = uVar1;
  }
  if (uVar16 < 2) goto joined_r0x009e54cc;
  goto LAB_009e544c;
LAB_009e5558:
  uVar8 = 2;
  goto LAB_009e5564;
  while (iVar4 = piVar11[6], piVar11 = piVar11 + 6, iVar4 != 0) {
LAB_009e54ec:
    if (iVar4 == 0x303) {
      if (*(code **)(piVar11 + 2) != (code *)0x0) {
        uVar5 = (**(code **)(piVar11 + 2))();
        iVar4 = FUN_009e4f38(param_1,uVar5);
        if (iVar4 == 0) goto LAB_009e5558;
      }
    }
    else if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      if (iVar4 < 0x304) break;
    }
    else if ((iVar4 == 0x100) || (0x302 < iVar4)) break;
  }
LAB_009e5560:
  uVar8 = 0;
LAB_009e5564:
  *param_3 = uVar8;
  uVar9 = *puVar15;
  *(undefined8 *)(param_1 + 2) = uVar6;
  *param_1 = uVar9;
  return 0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009472e8
 */

/* WARNING: Removing unreachable block (ram,0x0094a2d8) */
/* WARNING: Removing unreachable block (ram,0x0094a1e4) */
/* WARNING: Removing unreachable block (ram,0x0094a31c) */
/* WARNING: Type propagation algorithm not settling */

int FUN_009472e8(long param_1,long *param_2,undefined1 *param_3)

{
  ulong *puVar1;
  ulong *puVar2;
  long *plVar3;
  long *plVar4;
  undefined8 *puVar5;
  undefined1 *puVar6;
  ushort uVar7;
  uint uVar8;
  long lVar9;
  bool bVar10;
  bool bVar11;
  byte *pbVar12;
  bool bVar13;
  bool bVar14;
  undefined4 uVar15;
  int iVar16;
  uint uVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  undefined8 uVar23;
  size_t sVar24;
  char *pcVar25;
  byte *pbVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  int *piVar29;
  char *pcVar30;
  byte bVar31;
  uint uVar32;
  ulong uVar33;
  long *plVar34;
  ulong uVar35;
  ulong uVar36;
  undefined8 *puVar37;
  undefined1 uVar38;
  char *pcVar39;
  undefined1 *puVar40;
  byte *__s;
  size_t sVar41;
  long *plVar42;
  byte *pbVar43;
  long *plVar44;
  undefined1 auVar45 [16];
  long local_e0;
  char *local_88 [3];
  long local_70;
  
  lVar9 = tpidr_el0;
  local_70 = *(long *)(lVar9 + 0x28);
  uVar18 = FUN_0092f0d8(*(undefined8 *)(param_1 + 0xc0));
  uVar19 = FUN_0092f0e4(*(undefined8 *)(param_1 + 0xc0));
  *param_3 = 0;
  *param_2 = 0;
  if (*(long *)(param_1 + 0x11b8) == 0) {
LAB_00947778:
    iVar16 = 3;
    goto switchD_00947644_caseD_1;
  }
  lVar20 = (*(code *)PTR_calloc_00cc4690)(1,0x578);
  if (lVar20 != 0) {
    *(undefined8 *)(lVar20 + 0x220) = 0xffffffffffffffff;
    *(undefined8 *)(lVar20 + 0x3c8) = 0xffffffffffffffff;
    *(undefined8 *)(lVar20 + 0x28) = 0xffffffffffffffff;
    *(undefined4 *)(lVar20 + 0x15c) = 0xffffffff;
    *(undefined4 *)(lVar20 + 0x560) = 0xffffffff;
    FUN_00908c4c(lVar20,1);
    auVar45 = FUN_00941cb8();
    *(undefined1 (*) [16])(lVar20 + 0x200) = auVar45;
    *(undefined8 *)(lVar20 + 0x3c0) = *(undefined8 *)(lVar20 + 0x208);
    *(undefined8 *)(lVar20 + 0x3b8) = *(undefined8 *)(lVar20 + 0x200);
    bVar31 = *(byte *)(param_1 + 0x6ca);
    *(undefined1 *)(lVar20 + 0xb4) = 4;
    *(byte *)(lVar20 + 0xec) = bVar31;
    uVar33 = 0;
    if (*(char **)(param_1 + 0x868) != (char *)0x0) {
      uVar33 = (ulong)(**(char **)(param_1 + 0x868) != '\0') << 5;
    }
    uVar36 = *(ulong *)(lVar20 + 0x3a0);
    uVar35 = 0;
    puVar1 = (ulong *)(lVar20 + 0x3a0);
    *(ulong *)(lVar20 + 0x3a0) = uVar36 & 0xffffffffffffffdf | uVar33;
    if ((int)uVar33 != 0) {
      if (bVar31 < 3) {
        uVar35 = 1;
      }
      else {
        uVar35 = (ulong)(bVar31 == 3);
      }
    }
    uVar33 = uVar35 | uVar36 & 0xffffffffffffffdc | uVar33 | (uVar35 << 1 ^ 2) & uVar33 >> 4;
    *puVar1 = uVar33;
    if ((*(char **)(param_1 + 0x870) != (char *)0x0) && (**(char **)(param_1 + 0x870) != '\0')) {
      uVar33 = uVar33 | 0x22;
      *puVar1 = uVar33;
    }
    puVar2 = (ulong *)(param_1 + 0xa82);
    uVar35 = uVar33 & 3 | (ulong)(*(long *)(param_1 + 0x1308) != 0) << 2;
    *(ulong *)(lVar20 + 0x3a0) = uVar33 & 0xfffffffffffffff8 | uVar35;
    uVar35 = uVar35 | (*puVar2 >> 8 & 1) << 3;
    *(ulong *)(lVar20 + 0x3a0) = uVar33 & 0xfffffffffffffff0 | uVar35;
    uVar35 = uVar33 & 0xfff0 | uVar35 | (*puVar2 >> 0xd & 1) << 0x10;
    *(ulong *)(lVar20 + 0x3a0) = uVar33 & 0xfffffffffffe0000 | uVar35;
    *(ulong *)(lVar20 + 0x3a0) = uVar33 & 0xfffffffffffc0000 | uVar35 | (*puVar2 >> 0xe & 1) << 0x11
    ;
    *(undefined1 *)(lVar20 + 0x573) = *(undefined1 *)(param_1 + 0x700);
    uVar38 = *(undefined1 *)(param_1 + 0xa81);
    *(undefined1 *)(lVar20 + 0x572) = 3;
    *(undefined1 *)(lVar20 + 0x575) = uVar38;
    FUN_00925c98(lVar20 + 0x3d0,0);
    if (*(long *)(param_1 + 0x828) != 0) {
      lVar21 = (*(code *)PTR_strdup_00cc4688)();
      *(long *)(lVar20 + 0x550) = lVar21;
      if (lVar21 == 0) {
        (*(code *)PTR_free_00cc4678)();
        (*(code *)PTR_free_00cc4678)(lVar20);
        iVar16 = 0x1b;
        goto switchD_00947644_caseD_1;
      }
    }
    *(undefined2 *)(lVar20 + 0x558) = *(undefined2 *)(param_1 + 0x222);
    *(undefined2 *)(lVar20 + 0x56c) = *(undefined2 *)(param_1 + 0x220);
    uVar23 = *(undefined8 *)(param_1 + 0x288);
    *(undefined8 *)(lVar20 + 0x20) = *(undefined8 *)(param_1 + 0x290);
    *(undefined8 *)(lVar20 + 0x18) = uVar23;
    *(undefined8 *)(lVar20 + 0x218) = *(undefined8 *)(lVar20 + 0x208);
    *(undefined8 *)(lVar20 + 0x210) = *(undefined8 *)(lVar20 + 0x200);
    *(undefined1 *)(lVar20 + 0x576) = *(undefined1 *)(param_1 + 0xa10);
    *param_2 = lVar20;
    if (*(long *)(param_1 + 0xa50) == 0) {
      bVar13 = false;
    }
    else {
      bVar13 = (*(byte *)(param_1 + 0x131c) & 2) == 0;
    }
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1178));
    *(undefined8 *)(param_1 + 0x1178) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1180));
    *(undefined8 *)(param_1 + 0x1180) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1188));
    *(undefined8 *)(param_1 + 0x1188) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1190));
    *(undefined8 *)(param_1 + 0x1190) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1198));
    *(undefined8 *)(param_1 + 0x1198) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11a0));
    *(undefined8 *)(param_1 + 0x11a0) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11a8));
    *(undefined8 *)(param_1 + 0x11a8) = 0;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b0));
    *(undefined8 *)(param_1 + 0x11b0) = 0;
    curl_url_cleanup(*(undefined8 *)(param_1 + 0x1170));
    *(undefined8 *)(param_1 + 0x1170) = 0;
    if (bVar13) {
      lVar21 = curl_url_dup(*(undefined8 *)(param_1 + 0xa50));
    }
    else {
      lVar21 = curl_url();
    }
    *(long *)(param_1 + 0x1170) = lVar21;
    if (lVar21 != 0) {
      if ((*(long *)(param_1 + 0x820) != 0) &&
         (lVar22 = FUN_00960bb4(*(undefined8 *)(param_1 + 0x11b8),0,0,1), lVar22 == 0)) {
        lVar22 = curl_maprintf("%s://%s",*(undefined8 *)(param_1 + 0x820),
                               *(undefined8 *)(param_1 + 0x11b8));
        if (lVar22 == 0) goto switchD_00947644_caseD_7;
        uVar32 = *(uint *)(param_1 + 0x131c);
        if ((uVar32 >> 0xe & 1) != 0) {
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
          uVar32 = *(uint *)(param_1 + 0x131c);
        }
        *(long *)(param_1 + 0x11b8) = lVar22;
        *(uint *)(param_1 + 0x131c) = uVar32 | 0x4000;
      }
      if (!bVar13) {
        uVar32 = (uint)(*puVar2 >> 0x20);
        iVar16 = curl_url_set(lVar21,0,*(undefined8 *)(param_1 + 0x11b8),
                              uVar32 >> 10 & 0x20 | uVar32 >> 5 & 0x10 | 0x208);
        if (iVar16 != 0) {
          uVar23 = curl_url_strerror(iVar16);
          FUN_00904b80(param_1,"URL rejected: %s",uVar23);
          if (iVar16 - 5U < 4) {
            iVar16 = *(int *)(&DAT_0029c270 + (long)(int)(iVar16 - 5U) * 4);
            goto switchD_00947644_caseD_1;
          }
          goto LAB_00947778;
        }
        uVar15 = curl_url_get(lVar21,0,local_88,0);
        iVar16 = 3;
        switch(uVar15) {
        case 0:
          uVar32 = *(uint *)(param_1 + 0x131c);
          if ((uVar32 >> 0xe & 1) != 0) {
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
            uVar32 = *(uint *)(param_1 + 0x131c);
          }
          *(char **)(param_1 + 0x11b8) = local_88[0];
          *(uint *)(param_1 + 0x131c) = uVar32 | 0x4000;
          break;
        default:
          goto switchD_00947644_caseD_1;
        case 5:
          goto switchD_00947644_caseD_5;
        case 7:
          goto switchD_00947644_caseD_7;
        case 8:
          goto switchD_00947644_caseD_8;
        }
      }
      puVar37 = (undefined8 *)(param_1 + 0x1178);
      uVar15 = curl_url_get(lVar21,1,puVar37,0);
      iVar16 = 3;
      switch(uVar15) {
      case 0:
        puVar5 = (undefined8 *)(param_1 + 0x1180);
        iVar16 = curl_url_get(lVar21,5,puVar5,0);
        if (iVar16 == 0) {
          pcVar39 = (char *)*puVar5;
          sVar24 = strlen(pcVar39);
          if (0xffff < sVar24) {
            FUN_00904b80(param_1,"Too long hostname (maximum is %d)",0xffff);
            iVar16 = 3;
            goto switchD_00947644_caseD_1;
          }
        }
        else {
          iVar16 = curl_strequal(&DAT_002d74d1,*puVar37);
          if (iVar16 == 0) break;
          pcVar39 = (char *)*puVar5;
        }
        pcVar30 = pcVar39;
        if ((pcVar39 != (char *)0x0) && (*pcVar39 == '[')) {
          pcVar30 = pcVar39 + 1;
          *(ulong *)(lVar20 + 0x3a0) = *(ulong *)(lVar20 + 0x3a0) | 0x800;
          sVar24 = strlen(pcVar30);
          pcVar39[sVar24] = '\0';
          FUN_0094a44c(lVar21,param_1,lVar20);
        }
        pcVar39 = "";
        if (pcVar30 != (char *)0x0) {
          pcVar39 = pcVar30;
        }
        lVar22 = (*(code *)PTR_strdup_00cc4688)(pcVar39);
        plVar34 = (long *)(lVar20 + 0x40);
        *plVar34 = lVar22;
        if (lVar22 != 0) {
          *(long *)(lVar20 + 0x50) = lVar22;
          iVar16 = FUN_0095c6d4(plVar34);
          if (iVar16 != 0) goto switchD_00947644_caseD_1;
          if (((*(long *)(param_1 + 0xa98) != 0) &&
              (iVar16 = curl_strequal(&DAT_002b3577,*puVar37), iVar16 != 0)) &&
             (lVar22 = FUN_00918714(*(undefined8 *)(param_1 + 0xa98),*(undefined8 *)(lVar20 + 0x50),
                                    1), lVar22 != 0)) {
            (*(code *)PTR_free_00cc4678)(*puVar37);
            *puVar37 = 0;
            uVar15 = curl_url_set(lVar21,1,"https",0);
            iVar16 = 3;
            switch(uVar15) {
            case 0:
              if ((*(byte *)(param_1 + 0x131d) >> 6 & 1) != 0) {
                (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
                *(undefined8 *)(param_1 + 0x11b8) = 0;
              }
              uVar15 = curl_url_get(lVar21,0,local_88,0);
              iVar16 = 3;
              switch(uVar15) {
              case 0:
                iVar16 = curl_url_get(lVar21,1,puVar37,0);
                if (iVar16 == 0) {
                  *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x4000;
                  *(char **)(param_1 + 0x11b8) = local_88[0];
                  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                     ((*(long *)(param_1 + 0x12a0) == 0 ||
                      (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                    FUN_00904c98(param_1,"Switched from HTTP to HTTPS due to HSTS => %s");
                  }
                  goto LAB_00947a08;
                }
                (*(code *)PTR_free_00cc4678)(local_88[0]);
                if (3 < iVar16 - 5U) {
                  iVar16 = 3;
                  break;
                }
                iVar16 = *(int *)(&DAT_0029c270 + (long)(int)(iVar16 - 5U) * 4);
              default:
switchD_00947d3c_default:
                break;
              case 1:
              case 2:
              case 3:
              case 4:
              case 6:
                break;
              case 5:
                goto switchD_00947644_caseD_5;
              case 7:
                goto switchD_00947644_caseD_7;
              case 8:
                goto switchD_00947644_caseD_8;
              }
            default:
              goto switchD_00947644_caseD_1;
            case 5:
              goto switchD_00947644_caseD_5;
            case 7:
              goto switchD_00947644_caseD_7;
            case 8:
switchD_00947644_caseD_8:
              iVar16 = 0x43;
              goto switchD_00947644_caseD_1;
            }
          }
LAB_00947a08:
          pcVar39 = (char *)*puVar37;
          sVar24 = strlen(pcVar39);
          if (sVar24 - 1 < 7) {
            sVar41 = 0;
            uVar32 = 0x3d2;
            do {
              uVar17 = FUN_009416e0(pcVar39[sVar41]);
              sVar41 = sVar41 + 1;
              uVar32 = uVar32 * 0x20 + (uVar17 & 0xff);
            } while (sVar24 != sVar41);
            plVar42 = (long *)(&PTR_PTR_00c50448)[uVar32 % 0x43];
            if (((plVar42 == (long *)0x0) ||
                (iVar16 = curl_strnequal(pcVar39,*plVar42,sVar24), iVar16 == 0)) ||
               (*(char *)(*plVar42 + sVar24) != '\0')) goto LAB_00947ae0;
            if ((*(uint *)((long)plVar42 + 0x8c) & *(uint *)(param_1 + 0x9cc)) == 0) {
              pcVar30 = "disabled";
            }
            else {
              if (((*(byte *)(param_1 + 0x131c) >> 1 & 1) == 0) ||
                 ((*(uint *)(param_1 + 0x9d0) & *(uint *)((long)plVar42 + 0x8c)) != 0)) {
                *(long **)(lVar20 + 0x3b0) = plVar42;
                *(long **)(lVar20 + 0x3a8) = plVar42;
                plVar42 = (long *)(lVar20 + 0x3a8);
                if (*(long *)(param_1 + 0x8a8) == 0) {
                  iVar16 = 3;
                  uVar15 = curl_url_get(lVar21,3,(undefined8 *)(param_1 + 0x1198),0);
                  switch(uVar15) {
                  case 0:
                    iVar16 = FUN_0091583c(*(undefined8 *)(param_1 + 0x1198),0,local_88,0,
                                          (*(uint *)(*plVar42 + 0x94) >> 0xd & 1) + 3);
                    if (iVar16 == 0) {
                      *(char **)(lVar20 + 0x1d0) = local_88[0];
                      iVar16 = FUN_00937c50(param_1 + 0x12f8);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      goto switchD_00947c90_caseD_c;
                    }
                    break;
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 6:
                  case 9:
                  case 10:
                  case 0xb:
                    goto switchD_00947644_caseD_1;
                  case 5:
                    goto switchD_00947644_caseD_5;
                  case 7:
                    goto switchD_00947644_caseD_7;
                  case 8:
                    goto switchD_00947644_caseD_8;
                  case 0xc:
                    goto switchD_00947c90_caseD_c;
                  }
                  goto switchD_00947d3c_default;
                }
switchD_00947c90_caseD_c:
                if (*(long *)(param_1 + 0x8a0) == 0) {
                  uVar15 = curl_url_get(lVar21,2,(undefined8 *)(param_1 + 0x1190),0);
                  iVar16 = 3;
                  switch(uVar15) {
                  case 0:
                    iVar16 = FUN_0091583c(*(undefined8 *)(param_1 + 0x1190),0,local_88,0,
                                          (*(uint *)(*plVar42 + 0x94) >> 0xd & 1) + 3);
                    if (iVar16 != 0) goto switchD_00947d3c_default;
                    *(char **)(lVar20 + 0x1c8) = local_88[0];
                    pcVar39 = local_88[0];
LAB_00947dc8:
                    iVar16 = FUN_00937c50(param_1 + 0x12f0,pcVar39);
                    if (iVar16 != 0) goto switchD_00947644_caseD_1;
                    break;
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 6:
                  case 9:
                  case 10:
                    goto switchD_00947644_caseD_1;
                  case 5:
                    goto switchD_00947644_caseD_5;
                  case 7:
                    goto switchD_00947644_caseD_7;
                  case 8:
                    goto switchD_00947644_caseD_8;
                  case 0xb:
                    if (*(long *)(param_1 + 0x12f8) != 0) {
                      pcVar39 = "";
                      goto LAB_00947dc8;
                    }
                    break;
                  default:
                    goto switchD_00947d3c_default;
                  }
                }
                uVar15 = curl_url_get(lVar21,4,(undefined8 *)(param_1 + 0x11a0),0x40);
                iVar16 = 3;
                switch(uVar15) {
                case 0:
                  lVar22 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x11a0));
                  *(long *)(lVar20 + 0x1d8) = lVar22;
                  if (lVar22 != 0) goto switchD_00947ba4_caseD_d;
                  break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 9:
                case 10:
                case 0xb:
                case 0xc:
                  goto switchD_00947644_caseD_1;
                case 5:
                  goto switchD_00947644_caseD_5;
                case 7:
                  break;
                case 8:
                  goto switchD_00947644_caseD_8;
                case 0xd:
switchD_00947ba4_caseD_d:
                  uVar15 = curl_url_get(lVar21,7,param_1 + 0x11a8,0x80);
                  iVar16 = 3;
                  switch(uVar15) {
                  case 0:
                    iVar16 = curl_url_get(lVar21,6,param_1 + 0x1188,1);
                    if (iVar16 != 0) {
                      iVar16 = curl_strequal(&DAT_002d74d1,*puVar37);
                      if (iVar16 != 0) goto LAB_00947e1c;
LAB_0094a068:
                      iVar16 = 0x1b;
                      goto switchD_00947644_caseD_1;
                    }
                    strtoul(*(char **)(param_1 + 0x1188),(char **)0x0,10);
                    uVar32 = (uint)*(ushort *)(param_1 + 0x1e8);
                    if ((*(ushort *)(param_1 + 0x1e8) == 0) ||
                       ((*(byte *)(param_1 + 0x131c) >> 4 & 1) == 0)) {
                      uVar32 = FUN_00963a54();
                    }
                    *(uint *)(lVar20 + 0x560) = uVar32 & 0xffff;
                    *(uint *)(lVar20 + 0x15c) = uVar32 & 0xffff;
LAB_00947e1c:
                    curl_url_get(lVar21,8,param_1 + 0x11b0,0);
                    if (*(int *)(param_1 + 0x9c8) != 0) {
                      *(int *)(lVar20 + 0x568) = *(int *)(param_1 + 0x9c8);
                    }
                    if (*(long *)(param_1 + 0x948) != 0) {
                      lVar21 = (*(code *)PTR_strdup_00cc4688)();
                      *(long *)(lVar20 + 0x1e0) = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                    }
                    if (*(long *)(param_1 + 0x918) != 0) {
                      lVar21 = (*(code *)PTR_strdup_00cc4688)();
                      *(long *)(lVar20 + 0x1e8) = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                    }
                    if (*(long *)(param_1 + 0x920) == 0) {
                      if (((uint)*puVar1 >> 2 & 1) == 0) goto LAB_00947f28;
LAB_00947ed0:
                      puVar40 = *(undefined1 **)(param_1 + 0x1310);
                      puVar6 = &DAT_002ab32c;
                      if (*(undefined1 **)(param_1 + 0x1308) != (undefined1 *)0x0) {
                        puVar6 = *(undefined1 **)(param_1 + 0x1308);
                      }
                      lVar21 = (*(code *)PTR_strdup_00cc4688)(puVar6);
                      *(long *)(lVar20 + 0xf0) = lVar21;
                      if (lVar21 == 0) {
                        pcVar30 = (char *)0x0;
                        iVar16 = 0x1b;
                        pcVar39 = (char *)0x0;
                      }
                      else {
                        puVar6 = &DAT_002ab32c;
                        if (puVar40 != (undefined1 *)0x0) {
                          puVar6 = puVar40;
                        }
                        lVar21 = (*(code *)PTR_strdup_00cc4688)(puVar6);
                        *(long *)(lVar20 + 0xf8) = lVar21;
                        if (lVar21 != 0) goto LAB_00947f28;
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar20 + 0xf0));
                        pcVar30 = (char *)0x0;
                        pcVar39 = (char *)0x0;
                        *(undefined8 *)(lVar20 + 0xf0) = 0;
                        iVar16 = 0x1b;
                      }
                    }
                    else {
                      lVar21 = (*(code *)PTR_strdup_00cc4688)();
                      *(long *)(lVar20 + 0x548) = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                      uVar33 = *puVar1 & 0xfffffffff8000000 |
                               *puVar1 & 0x3ffffff | (*puVar2 >> 0x2e & 1) << 0x1a;
                      *puVar1 = uVar33;
                      if (((uint)uVar33 >> 2 & 1) != 0) goto LAB_00947ed0;
LAB_00947f28:
                      if (*(long *)(param_1 + 0x868) != 0) {
                        pcVar30 = (char *)(*(code *)PTR_strdup_00cc4688)();
                        if (pcVar30 != (char *)0x0) goto LAB_00947f50;
LAB_00947f70:
                        FUN_00904b80(param_1,"memory shortage");
                        pcVar39 = (char *)0x0;
                        iVar16 = 0x1b;
                        goto LAB_0094827c;
                      }
                      pcVar30 = (char *)0x0;
LAB_00947f50:
                      if (*(long *)(param_1 + 0x870) == 0) {
                        pcVar25 = (char *)0x0;
                      }
                      else {
                        pcVar25 = (char *)(*(code *)PTR_strdup_00cc4688)();
                        if (pcVar25 == (char *)0x0) goto LAB_00947f70;
                      }
                      lVar21 = 0;
                      if (*(long *)(param_1 + 0x8c8) == 0) {
                        pcVar39 = "no_proxy";
                        lVar21 = curl_getenv("no_proxy");
                        if (lVar21 == 0) {
                          pcVar39 = "NO_PROXY";
                          lVar21 = curl_getenv("NO_PROXY");
                          if (lVar21 == 0) goto LAB_00948004;
                        }
                        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          FUN_00904c98(param_1,"Uses proxy env variable %s == \'%s\'",pcVar39,lVar21
                                      );
                        }
                      }
LAB_00948004:
                      lVar22 = lVar21;
                      if (*(long *)(param_1 + 0x8c8) != 0) {
                        lVar22 = *(long *)(param_1 + 0x8c8);
                      }
                      uVar33 = FUN_0094ac70(*(undefined8 *)(lVar20 + 0x50),lVar22);
                      if ((uVar33 & 1) == 0) {
                        if (pcVar30 == (char *)0x0 && pcVar25 == (char *)0x0) {
                          pcVar39 = (char *)local_88;
                          curl_msnprintf(local_88,0x14,"%s_proxy",*(undefined8 *)*plVar42);
                          pcVar30 = (char *)curl_getenv(local_88);
                          if (pcVar30 == (char *)0x0) {
                            iVar16 = curl_strequal("http_proxy",local_88);
                            if (iVar16 == 0) {
                              pcVar39 = (char *)local_88;
                              FUN_00941814(local_88,local_88,0x14);
                              pcVar30 = (char *)curl_getenv(local_88);
                              if (pcVar30 != (char *)0x0) goto LAB_0094812c;
                            }
                            pcVar39 = "all_proxy";
                            pcVar30 = (char *)curl_getenv("all_proxy");
                            if (pcVar30 != (char *)0x0) goto LAB_0094812c;
                            pcVar39 = "ALL_PROXY";
                            pcVar30 = (char *)curl_getenv("ALL_PROXY");
                            if (pcVar30 != (char *)0x0) goto LAB_0094812c;
                          }
                          else {
LAB_0094812c:
                            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                               ((*(long *)(param_1 + 0x12a0) == 0 ||
                                (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                              FUN_00904c98(param_1,"Uses proxy env variable %s == \'%s\'",pcVar39,
                                           pcVar30);
                            }
                          }
                          pcVar25 = (char *)0x0;
                        }
                        (*(code *)PTR_free_00cc4678)(lVar21);
                        if ((pcVar30 != (char *)0x0) &&
                           (((*(long *)(lVar20 + 0x548) != 0 || (*pcVar30 == '\0')) ||
                            ((*(byte *)(*plVar42 + 0x94) >> 4 & 1) != 0)))) {
                          (*(code *)PTR_free_00cc4678)(pcVar30);
                          pcVar30 = (char *)0x0;
                        }
                        if (pcVar25 != (char *)0x0) {
                          if ((*pcVar25 == '\0') || ((*(byte *)(*plVar42 + 0x94) >> 4 & 1) != 0)) {
                            (*(code *)PTR_free_00cc4678)(pcVar25);
                            goto LAB_009481e0;
                          }
                          uVar38 = *(undefined1 *)(lVar20 + 0xec);
                          if (pcVar30 != (char *)0x0) {
                            bVar13 = true;
                            goto LAB_009481f0;
                          }
LAB_009489f4:
                          iVar16 = FUN_0094a55c(param_1,lVar20,pcVar25,uVar38);
                          (*(code *)PTR_free_00cc4678)(pcVar25);
                          pcVar25 = (char *)0x0;
                          pcVar30 = (char *)0x0;
                          pcVar39 = (char *)0x0;
                          if (iVar16 != 0) goto LAB_0094827c;
LAB_00948a30:
                          if (*(long *)(lVar20 + 200) == 0) {
                            uVar33 = *puVar1 & 0xfffffffffffffff6;
                          }
                          else {
                            if ((*(byte *)(*plVar42 + 0x8c) & 3) == 0) {
                              uVar33 = *puVar1;
                              if (((*(uint *)(*plVar42 + 0x94) >> 0xb & 1) != 0) &&
                                 (((uint)uVar33 >> 3 & 1) == 0)) {
                                uVar33 = uVar33 | 1;
                                *plVar42 = (long)&PTR_DAT_00c4f380;
                                goto LAB_00948ccc;
                              }
                              uVar33 = uVar33 | 8;
                              *puVar1 = uVar33;
                            }
                            else {
                              uVar33 = *puVar1;
                            }
                            uVar33 = uVar33 | 1;
                          }
LAB_00948ccc:
                          *(ulong *)(lVar20 + 0x3a0) = uVar33;
                          if (*(long *)(lVar20 + 0x90) == 0) {
                            uVar33 = uVar33 & 0xfffffffffffffffd;
                          }
                          else {
                            if ((*(long *)(lVar20 + 200) == 0) && (*(long *)(lVar20 + 0xb8) == 0)) {
                              uVar23 = *(undefined8 *)(lVar20 + 0xf0);
                              *(undefined8 *)(lVar20 + 0xf0) = 0;
                              *(undefined8 *)(lVar20 + 0xb8) = uVar23;
                              (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar20 + 0xc0));
                              uVar23 = *(undefined8 *)(lVar20 + 0xf8);
                              uVar33 = *(ulong *)(lVar20 + 0x3a0);
                              *(undefined8 *)(lVar20 + 0xf8) = 0;
                              *(undefined8 *)(lVar20 + 0xc0) = uVar23;
                            }
                            uVar33 = uVar33 | 2;
                          }
                          goto LAB_00948238;
                        }
LAB_009481e0:
                        if (pcVar30 == (char *)0x0) goto LAB_00948228;
                        uVar38 = *(undefined1 *)(lVar20 + 0xec);
                        pcVar25 = (char *)0x0;
                        bVar13 = false;
LAB_009481f0:
                        iVar16 = FUN_0094a55c(param_1,lVar20,pcVar30,uVar38);
                        (*(code *)PTR_free_00cc4678)(pcVar30);
                        pcVar39 = pcVar25;
                        if (iVar16 == 0) {
                          if (bVar13) goto LAB_009489f4;
                          goto LAB_00948a30;
                        }
                      }
                      else {
                        (*(code *)PTR_free_00cc4678)(pcVar30);
                        (*(code *)PTR_free_00cc4678)(pcVar25);
                        (*(code *)PTR_free_00cc4678)(lVar21);
LAB_00948228:
                        pcVar25 = (char *)0x0;
                        uVar33 = *puVar1 & 0xfffffffffffffffc;
LAB_00948238:
                        uVar35 = (uVar33 & 2) << 4;
                        if ((uVar33 & 1) != 0) {
                          uVar35 = 0x20;
                        }
                        iVar16 = 0;
                        *puVar1 = uVar35 | uVar33 & 0xffffffffffffffdf;
                        pcVar39 = pcVar25;
                        if (uVar35 == 0) {
                          *(ulong *)(lVar20 + 0x3a0) = uVar33 & 0xffffffffffffffd0;
                          *(undefined1 *)(lVar20 + 0xec) = 0;
                        }
                      }
                      pcVar30 = (char *)0x0;
                    }
LAB_0094827c:
                    (*(code *)PTR_free_00cc4678)(pcVar39);
                    (*(code *)PTR_free_00cc4678)(pcVar30);
                    if (iVar16 != 0) goto switchD_00947644_caseD_1;
                    if (((*(byte *)(*(long *)(lVar20 + 0x3b0) + 0x94) & 1) != 0) &&
                       ((*puVar1 & 1) != 0)) {
                      *puVar1 = *puVar1 | 8;
                    }
                    if ((*(ushort *)(param_1 + 0x1e8) != 0) &&
                       ((*(byte *)(param_1 + 0x131c) >> 4 & 1) != 0)) {
                      *(uint *)(lVar20 + 0x560) = (uint)*(ushort *)(param_1 + 0x1e8);
                      curl_msnprintf(local_88,0x10,&DAT_002c6d41);
                      iVar16 = curl_url_set(*(undefined8 *)(param_1 + 0x1170),6,local_88,0);
                      if (iVar16 != 0) goto LAB_0094a068;
                    }
                    if (*(long *)(param_1 + 0x8b0) != 0) {
                      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar20 + 0x1d8));
                      lVar21 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x8b0));
                      *(long *)(lVar20 + 0x1d8) = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                    }
                    plVar3 = (long *)(lVar20 + 0x1c8);
                    plVar4 = (long *)(lVar20 + 0x1d0);
                    if (*(char *)(param_1 + 0x731) == '\x02') {
                      (*(code *)PTR_free_00cc4678)(*plVar3);
                      *plVar3 = 0;
                      (*(code *)PTR_free_00cc4678)(*plVar4);
                      *plVar4 = 0;
                    }
                    *puVar1 = *puVar1 & 0xffffffffffefffff;
                    plVar44 = plVar3;
                    if ((*(char *)(param_1 + 0x731) == '\0') || (*(long *)(param_1 + 0x8a0) != 0)) {
                      lVar21 = *plVar3;
                      if (lVar21 != 0) goto LAB_009483c8;
LAB_009483ec:
                      lVar21 = *(long *)(param_1 + 0x12f0);
                      if (lVar21 != 0) goto LAB_009483f4;
                    }
                    else {
                      lVar21 = *(long *)(param_1 + 0x12f0);
                      if (lVar21 != 0) {
                        plVar44 = (long *)(param_1 + 0x12f0);
                      }
                      iVar16 = FUN_00960438(*(undefined8 *)(lVar20 + 0x50),plVar44,plVar4,
                                            *(undefined8 *)(param_1 + 0x860));
                      if (iVar16 < 1) {
                        if (iVar16 < 0) {
                          FUN_00904b80(param_1,".netrc parser error");
                          iVar16 = 0x1a;
                          goto switchD_00947644_caseD_1;
                        }
                        *puVar1 = *puVar1 | 0x100000;
                      }
                      else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                              ((*(long *)(param_1 + 0x12a0) == 0 ||
                               (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                        pcVar39 = ".netrc";
                        if (*(char **)(param_1 + 0x860) != (char *)0x0) {
                          pcVar39 = *(char **)(param_1 + 0x860);
                        }
                        FUN_00904c98(param_1,"Couldn\'t find host %s in the %s file; using defaults"
                                     ,*(undefined8 *)(lVar20 + 0x50),pcVar39);
                      }
                      if (lVar21 != 0) {
                        (*(code *)PTR_free_00cc4678)(*plVar3);
                        *plVar3 = 0;
                        lVar21 = (*(code *)PTR_strdup_00cc4688)(*plVar44);
                        *plVar3 = lVar21;
                        if (lVar21 == 0) goto LAB_0094a068;
                      }
                      lVar21 = *plVar44;
                      if (lVar21 == 0) {
                        if (*plVar4 == 0) goto LAB_009483ec;
                        lVar21 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c);
                        *plVar44 = lVar21;
                        if (lVar21 == 0) break;
                      }
LAB_009483c8:
                      if (*(long *)(param_1 + 0x12f0) != lVar21) {
                        iVar16 = FUN_00937c50((long *)(param_1 + 0x12f0),lVar21);
                        if (iVar16 != 0) goto switchD_00947644_caseD_1;
                        goto LAB_009483ec;
                      }
LAB_009483f4:
                      uVar15 = curl_url_set(*(undefined8 *)(param_1 + 0x1170),2,lVar21,0x80);
                      iVar16 = 3;
                      switch(uVar15) {
                      case 0:
                        if (*plVar44 == 0) {
                          lVar21 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x12f0))
                          ;
                          *plVar44 = lVar21;
                          if (lVar21 == 0) goto LAB_0094a068;
                        }
                        break;
                      case 1:
                      case 2:
                      case 3:
                      case 4:
                      case 6:
                        goto switchD_00947644_caseD_1;
                      case 5:
                        goto switchD_00947644_caseD_5;
                      case 7:
                        goto switchD_00947644_caseD_7;
                      case 8:
                        goto switchD_00947644_caseD_8;
                      default:
                        goto switchD_00947ba4_default;
                      }
                    }
                    plVar44 = (long *)(param_1 + 0x12f8);
                    if ((*plVar4 != 0) && (iVar16 = FUN_00937c50(plVar44), iVar16 != 0))
                    goto switchD_00947644_caseD_1;
                    if (*plVar44 != 0) {
                      iVar16 = 3;
                      uVar15 = curl_url_set(*(undefined8 *)(param_1 + 0x1170),3,*plVar44,0x80);
                      switch(uVar15) {
                      case 0:
                        if (*plVar4 == 0) {
                          lVar21 = (*(code *)PTR_strdup_00cc4688)(*plVar44);
                          *plVar4 = lVar21;
                          if (lVar21 == 0) goto LAB_0094a068;
                        }
                        break;
                      case 1:
                      case 2:
                      case 3:
                      case 4:
                      case 6:
                        goto switchD_00947644_caseD_1;
                      case 5:
                        goto switchD_00947644_caseD_5;
                      case 7:
                        goto switchD_00947644_caseD_7;
                      case 8:
                        goto switchD_00947644_caseD_8;
                      default:
                        goto switchD_00947ba4_default;
                      }
                    }
                    if (((*(byte *)(*plVar42 + 0x94) >> 5 & 1) == 0) ||
                       (*(long *)(param_1 + 0x12f0) != 0)) {
                      pcVar39 = "";
                      pcVar30 = "";
                    }
                    else {
                      pcVar30 = "ftp@example.com";
                      pcVar39 = "anonymous";
                    }
                    if (*plVar3 == 0) {
                      lVar21 = (*(code *)PTR_strdup_00cc4688)(pcVar39);
                      *plVar3 = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                    }
                    if (*plVar4 == 0) {
                      lVar21 = (*(code *)PTR_strdup_00cc4688)(pcVar30);
                      *plVar4 = lVar21;
                      if (lVar21 == 0) goto LAB_0094a068;
                    }
                    puVar37 = *(undefined8 **)(param_1 + 0x518);
                    if (puVar37 != (undefined8 *)0x0) {
LAB_0094856c:
                      pcVar39 = (char *)*puVar37;
                      if (*pcVar39 == ':') {
LAB_00948604:
                        pcVar30 = pcVar39 + 1;
                        if (*pcVar30 != ':') {
                          pcVar39 = strchr(pcVar30,0x3a);
                          if (pcVar39 != (char *)0x0) {
                            local_88[0] = (char *)0x0;
                            lVar21 = strtol(pcVar30,local_88,10);
                            if (((local_88[0] == pcVar39) && (lVar21 == *(int *)(lVar20 + 0x560)))
                               && (pcVar39[1] != '\0')) goto LAB_00948620;
                          }
                          goto LAB_0094876c;
                        }
                        if (pcVar39[2] == '\0') goto LAB_0094876c;
LAB_00948620:
                        pbVar26 = (byte *)(*(code *)PTR_strdup_00cc4688)();
                        if (pbVar26 != (byte *)0x0) {
                          __s = pbVar26;
                          pbVar43 = pbVar26;
                          if (*pbVar26 == 0x5b) {
                            pbVar43 = pbVar26 + 1;
                            uVar32 = (uint)*pbVar43;
                            __s = pbVar43;
                            if (*pbVar43 != 0) {
                              pbVar12 = pbVar26 + 2;
                              do {
                                __s = pbVar12;
                                if (9 < (uVar32 - 0x30 & 0xff)) {
                                  switch(uVar32) {
                                  case 0x25:
                                    iVar16 = strncmp("%25",(char *)(__s + -1),3);
                                    if (((iVar16 != 0) &&
                                        ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                                      FUN_00904c98(param_1,
                                                  "Please URL encode %% as %%25, see RFC 6874.");
                                    }
                                    bVar31 = *__s;
                                    goto joined_r0x009488f8;
                                  default:
                                    __s = __s + -1;
                                    goto LAB_00948950;
                                  case 0x2e:
                                  case 0x3a:
                                  case 0x41:
                                  case 0x42:
                                  case 0x43:
                                  case 0x44:
                                  case 0x45:
                                  case 0x46:
                                  case 0x61:
                                  case 0x62:
                                  case 99:
                                  case 100:
                                  case 0x65:
                                  case 0x66:
                                    break;
                                  }
                                }
                                uVar32 = (uint)*__s;
                                pbVar12 = __s + 1;
                              } while (uVar32 != 0);
                            }
                            goto LAB_0094869c;
                          }
                          goto LAB_009486cc;
                        }
                      }
                      else {
                        bVar13 = (*(ulong *)(lVar20 + 0x3a0) & 0x800) == 0;
                        puVar6 = &DAT_002b138e;
                        if (bVar13) {
                          puVar6 = &DAT_002ab32c;
                        }
                        puVar40 = &DAT_002c2dc5;
                        if (bVar13) {
                          puVar40 = &DAT_002ab32c;
                        }
                        pcVar30 = (char *)curl_maprintf("%s%s%s",puVar6,
                                                        *(undefined8 *)(lVar20 + 0x50),puVar40);
                        if (pcVar30 != (char *)0x0) {
                          sVar24 = strlen(pcVar30);
                          iVar16 = curl_strnequal(pcVar39,pcVar30,sVar24);
                          (*(code *)PTR_free_00cc4678)(pcVar30);
                          if ((iVar16 != 0) && (pcVar39 = pcVar39 + sVar24, *pcVar39 == ':'))
                          goto LAB_00948604;
LAB_0094876c:
                          pcVar39 = (char *)0x0;
                          uVar33 = 0xffffffff;
                          goto LAB_00948774;
                        }
                      }
                      goto LAB_0094a068;
                    }
                    pcVar39 = (char *)0x0;
                    bVar13 = true;
LAB_00948b9c:
                    if (((bVar13) && (pcVar39 == (char *)0x0)) &&
                       ((lVar21 = *(long *)(param_1 + 0xaa0), lVar21 != 0 &&
                        (*(int *)(*plVar42 + 0x8c) == 2)))) {
                      uVar23 = *(undefined8 *)(lVar20 + 0x40);
                      uVar33 = FUN_009043c8(lVar21,8,uVar23,*(undefined4 *)(lVar20 + 0x560),local_88
                                            ,*(uint *)(lVar21 + 0x28) & 8);
                      if ((uVar33 & 1) != 0) {
                        lVar21 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(local_88[0] + 0x10))
                        ;
                        if (lVar21 == 0) goto LAB_0094a068;
                        uVar33 = *(ulong *)(lVar20 + 0x3a0);
                        *(long *)(lVar20 + 0x70) = lVar21;
                        *(long *)(lVar20 + 0x80) = lVar21;
                        *(ulong *)(lVar20 + 0x3a0) = uVar33 | 0x200;
                        uVar7 = *(ushort *)(local_88[0] + 0x18);
                        *(ulong *)(lVar20 + 0x3a0) = uVar33 | 0x700;
                        *(uint *)(lVar20 + 0x564) = (uint)uVar7;
                        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          uVar27 = FUN_00903228(8);
                          uVar15 = *(undefined4 *)(lVar20 + 0x560);
                          uVar28 = FUN_00903228(*(undefined4 *)(local_88[0] + 0x1c));
                          FUN_00904c98(param_1,"Alt-svc connecting from [%s]%s:%d to [%s]%s:%d",
                                       uVar27,uVar23,uVar15,uVar28,lVar21,
                                       *(undefined2 *)(local_88[0] + 0x18));
                        }
                        if (*(int *)(local_88[0] + 0x1c) == 0x20) {
                          *(undefined1 *)(lVar20 + 0x572) = 5;
                          *(undefined1 *)(lVar20 + 0x574) = 0x1e;
                        }
                        else if (*(int *)(local_88[0] + 0x1c) == 0x10) {
                          *(undefined1 *)(lVar20 + 0x574) = 0x14;
                        }
                      }
                    }
                    uVar33 = *puVar1;
                    if ((uVar33 & 1) != 0) {
                      iVar16 = FUN_0095c6d4(lVar20 + 200);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      uVar33 = *puVar1;
                    }
                    if (((uint)uVar33 >> 1 & 1) != 0) {
                      iVar16 = FUN_0095c6d4(lVar20 + 0x90);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      uVar33 = *puVar1;
                    }
                    if (((uint)uVar33 >> 9 & 1) == 0) goto LAB_00948dd4;
                    iVar16 = FUN_0095c6d4(lVar20 + 0x70);
                    if (iVar16 != 0) goto switchD_00947644_caseD_1;
                    uVar33 = *puVar1;
                    if (((uint)uVar33 >> 9 & 1) == 0) {
LAB_00948dd4:
                      uVar32 = (uint)uVar33;
                    }
                    else {
                      iVar16 = curl_strequal(*(undefined8 *)(lVar20 + 0x80),
                                             *(undefined8 *)(lVar20 + 0x50));
                      uVar33 = *(ulong *)(lVar20 + 0x3a0);
                      if (iVar16 == 0) goto LAB_00948dd4;
                      uVar33 = uVar33 & 0xfffffffffffffdff;
                      *puVar1 = uVar33;
                      uVar32 = (uint)uVar33;
                    }
                    if (((uVar32 >> 10 & 1) != 0) &&
                       (*(int *)(lVar20 + 0x564) == *(int *)(lVar20 + 0x560))) {
                      uVar33 = uVar33 & 0xfffffffffffffbff;
                      *puVar1 = uVar33;
                    }
                    if (((uVar33 & 0x600) != 0) && ((uVar33 & 1) != 0)) {
                      *puVar1 = uVar33 | 8;
                    }
                    lVar21 = *plVar42;
                    if (*(code **)(lVar21 + 8) != (code *)0x0) {
                      iVar16 = (**(code **)(lVar21 + 8))(param_1,lVar20);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      lVar21 = *plVar42;
                    }
                    if (*(int *)(lVar20 + 0x15c) < 0) {
                      *(undefined4 *)(lVar20 + 0x15c) = *(undefined4 *)(lVar21 + 0x88);
                    }
                    if ((*(byte *)(lVar21 + 0x94) >> 4 & 1) != 0) {
                      FUN_00908a04(param_1,lVar20,0);
                      iVar16 = (**(code **)(*(long *)(lVar20 + 0x3a8) + 0x28))(param_1,local_88);
                      if (iVar16 == 0) {
                        FUN_0092bb60(param_1,lVar20);
                        iVar16 = FUN_0090fcf0(param_1);
                        if (iVar16 != 0) goto switchD_00947ba4_default;
                        lVar21 = *(long *)(param_1 + 0x338);
                        *(long *)(param_1 + 0x1118) = lVar21;
                        if ((lVar21 == 0) && (*(long *)(param_1 + 0x878) == 0)) {
                          uVar32 = *(uint *)(param_1 + 0x131c) & 0xfffffeff;
                        }
                        else {
                          if ((*(byte *)(param_1 + 0x131d) >> 1 & 1) != 0) {
                            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1110));
                            lVar21 = *(long *)(param_1 + 0x1118);
                          }
                          if (lVar21 == 0) {
                            lVar21 = (*(code *)PTR_strdup_00cc4688)
                                               (*(undefined8 *)(param_1 + 0x878));
                          }
                          else {
                            lVar21 = curl_maprintf(&DAT_002c51d2);
                          }
                          *(long *)(param_1 + 0x1110) = lVar21;
                          uVar32 = *(uint *)(param_1 + 0x131c) & 0xfffffc00 |
                                   *(uint *)(param_1 + 0x131c) & 0x1ff | (uint)(lVar21 != 0) << 9;
                          *(uint *)(param_1 + 0x131c) = uVar32;
                          if (lVar21 == 0) {
                            iVar16 = 0x1b;
                            (**(code **)(*plVar42 + 0x18))(param_1,0x1b,0);
                            goto switchD_00947644_caseD_1;
                          }
                          uVar32 = uVar32 | 0x100;
                        }
                        *(uint *)(param_1 + 0x131c) = uVar32;
                        FUN_00943194(param_1);
                        iVar16 = 0;
                      }
                      FUN_0094a3a8(param_1,lVar20);
                      goto switchD_00947ba4_default;
                    }
                    *(undefined1 **)(lVar20 + 0x230) = &LAB_00907230;
                    *(undefined1 **)(lVar20 + 0x228) = &LAB_00907230;
                    *(undefined1 **)(lVar20 + 0x240) = &LAB_009072ac;
                    *(undefined1 **)(lVar20 + 0x238) = &LAB_009072ac;
                    *(ulong *)(lVar20 + 0x3a0) =
                         *(ulong *)(lVar20 + 0x3a0) & 0xffffffffff000000 |
                         *(ulong *)(lVar20 + 0x3a0) & 0x7fffff | (*puVar2 >> 0x27 & 1) << 0x17;
                    iVar16 = FUN_00967bdc(param_1);
                    if (iVar16 != 0) goto switchD_00947644_caseD_1;
                    auVar45 = FUN_00941cb8();
                    if (*(long *)(param_1 + 0xd0) != 0) {
                      FUN_0093f628(param_1,5,2);
                    }
                    lVar21 = FUN_00941d54(auVar45._0_8_,auVar45._8_8_,
                                          *(undefined8 *)(*(long *)(param_1 + 0xc38) + 0x48),
                                          *(undefined8 *)(*(long *)(param_1 + 0xc38) + 0x50));
                    if (*(long *)(param_1 + 0xd0) != 0) {
                      FUN_0093f680(param_1,5);
                    }
                    if (999 < lVar21) {
                      local_88[0] = (char *)0x0;
                      uVar33 = FUN_00910008(param_1,*(undefined8 *)(param_1 + 0xc38),local_88,
                                            FUN_0094aa34);
                      pcVar39 = local_88[0];
                      while (local_88[0] = pcVar39, (uVar33 & 1) != 0) {
                        if (*(long *)(pcVar39 + 1000) == 0) {
                          if (*(long *)(pcVar39 + 0x30) != 0) {
                            FUN_00917b54(param_1);
                            pcVar39[0x30] = '\0';
                            pcVar39[0x31] = '\0';
                            pcVar39[0x32] = '\0';
                            pcVar39[0x33] = '\0';
                            pcVar39[0x34] = '\0';
                            pcVar39[0x35] = '\0';
                            pcVar39[0x36] = '\0';
                            pcVar39[0x37] = '\0';
                          }
                          FUN_00924ee4(pcVar39);
                          FUN_009109f8(param_1,pcVar39,pcVar39[0x575] != '\0');
                        }
                        uVar33 = FUN_00910008(param_1,*(undefined8 *)(param_1 + 0xc38),local_88,
                                              FUN_0094aa34);
                        pcVar39 = local_88[0];
                      }
                      if (*(long *)(param_1 + 0xd0) != 0) {
                        FUN_0093f628(param_1,5,2);
                      }
                      *(undefined1 (*) [16])(*(long *)(param_1 + 0xc38) + 0x48) = auVar45;
                      if (*(long *)(param_1 + 0xd0) != 0) {
                        FUN_0093f680(param_1,5);
                      }
                    }
                    if ((((*(byte *)(param_1 + 0xa85) >> 6 & 1) == 0) ||
                        (bVar13 = false, *(long *)(param_1 + 0xcc8) != 0)) &&
                       (bVar13 = false, *(char *)(param_1 + 0xa81) == '\0')) {
                      bVar13 = false;
                      if ((*(byte *)(param_1 + 0xd50) >> 3 & 1) != 0) {
                        bVar13 = (*(byte *)(*plVar42 + 0x8c) & 3) != 0;
                      }
                      bVar14 = false;
                      if (((*(byte *)puVar1 >> 2 & 1) != 0) &&
                         (bVar14 = false, (*(byte *)(param_1 + 0xd70) >> 3 & 1) != 0)) {
                        bVar14 = (*(byte *)(*plVar42 + 0x8c) & 3) != 0;
                      }
                      pbVar26 = (byte *)(param_1 + 0x1318);
                      bVar31 = 0;
                      if (*pbVar26 == 3) {
                        bVar31 = *(byte *)(*plVar42 + 0x8c) & 1;
                      }
                      piVar29 = (int *)FUN_0090fc08(param_1,lVar20,*(undefined8 *)(param_1 + 0xc38))
                      ;
                      if (piVar29 == (int *)0x0) {
                        bVar13 = false;
                        if (*(long *)(param_1 + 0xd0) != 0) {
                          FUN_0093f680(param_1,5);
                          bVar13 = false;
                        }
                        goto LAB_00948fd8;
                      }
                      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                         ((*(long *)(param_1 + 0x12a0) == 0 ||
                          (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                        pcVar39 = "can multiplex";
                        if (*piVar29 != 2) {
                          pcVar39 = "serially";
                        }
                        FUN_00904c98(param_1,"Found bundle for host: %p [%s]",piVar29,pcVar39);
                      }
                      if (((((*(byte *)(*plVar42 + 0x8c) & 3) != 0) &&
                           ((~*(uint *)puVar1 & 0x4040) != 0)) &&
                          (uVar33 = FUN_0092bb50(*(undefined8 *)(param_1 + 0xc0)), (uVar33 & 1) != 0
                          )) && (2 < *pbVar26)) {
                        iVar16 = *piVar29;
                        if (iVar16 == -1) {
                          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                             ((*(long *)(param_1 + 0x12a0) == 0 ||
                              (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                            pcVar39 = "Can not multiplex, even if we wanted to";
LAB_009496c4:
                            FUN_00904c98(param_1,pcVar39);
                          }
                          goto LAB_009496d0;
                        }
                        if (iVar16 == 2) {
                          uVar33 = FUN_0092bb50(*(undefined8 *)(param_1 + 0xc0));
                          if ((uVar33 & 1) == 0) {
                            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                               ((*(long *)(param_1 + 0x12a0) == 0 ||
                                (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                              pcVar39 = "Could multiplex, but not asked to";
                              goto LAB_009496c4;
                            }
                            goto LAB_009496d0;
                          }
                          bVar10 = true;
                          plVar44 = *(long **)(piVar29 + 4);
                          goto joined_r0x0094964c;
                        }
                        if (iVar16 != 0) goto LAB_009496d0;
                        uVar32 = (uint)*puVar2;
                        if ((*puVar2 >> 0x2a & 1) == 0) {
                          if (((uVar32 >> 0x1c & 1) != 0) &&
                             ((*(long *)(param_1 + 0x12a0) == 0 ||
                              (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                            pcVar39 = "Server does not support multiplex (yet)";
                            goto LAB_009496c4;
                          }
                          goto LAB_009496d0;
                        }
                        if (((uVar32 >> 0x1c & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          pcVar39 = "Server does not support multiplex yet, wait";
LAB_00949678:
                          FUN_00904c98(param_1,pcVar39);
                        }
LAB_00949680:
                        if (*(long *)(param_1 + 0xd0) != 0) {
                          FUN_0093f680(param_1,5);
                        }
LAB_00949f7c:
                        bVar13 = true;
                        goto LAB_00948fd8;
                      }
LAB_009496d0:
                      bVar10 = false;
                      plVar44 = *(long **)(piVar29 + 4);
joined_r0x0094964c:
                      if (plVar44 == (long *)0x0) {
                        bVar11 = false;
LAB_00949f48:
                        if (*(long *)(param_1 + 0xd0) != 0) {
                          FUN_0093f680(param_1,5);
                        }
                        bVar13 = false;
                        if (bVar11) {
                          bVar13 = false;
                          if ((*puVar2 >> 0x2a & 1) != 0) {
                            if ((((uint)*puVar2 >> 0x1c & 1) == 0) ||
                               ((*(long *)(param_1 + 0x12a0) != 0 &&
                                (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
                            goto LAB_00949f7c;
                            FUN_00904c98(param_1,
                                         "Found pending candidate for reuse and CURLOPT_PIPEWAIT is set"
                                        );
                            bVar13 = true;
                          }
                        }
                        goto LAB_00948fd8;
                      }
                      local_e0 = 0;
                      bVar11 = false;
                      do {
                        lVar21 = *plVar44;
                        plVar44 = (long *)plVar44[2];
                        lVar22 = local_e0;
                        if (((((*(char *)(lVar21 + 0x575) == '\0') &&
                              ((*(byte *)(lVar21 + 0x3a0) >> 6 & 1) == 0)) &&
                             ((*(char *)(param_1 + 0x700) == '\0' ||
                              (*(char *)(param_1 + 0x700) == *(char *)(lVar21 + 0x573))))) &&
                            ((bVar10 || (*(char *)(lVar21 + 0x100) != '\0')))) &&
                           ((*(long *)(lVar21 + 1000) == 0 ||
                            ((bVar10 &&
                             (*(long *)(**(long **)(lVar21 + 0x3d0) + 0xc0) ==
                              *(long *)(param_1 + 0xc0))))))) {
                          uVar33 = FUN_009077cc(lVar21,0);
                          if ((uVar33 & 1) == 0) {
                            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                               ((*(long *)(param_1 + 0x12a0) == 0 ||
                                (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                              FUN_00904c98(param_1,
                                           "Connection #%ld is not open enough, cannot reuse",
                                           *(undefined8 *)(lVar21 + 0x28));
                            }
                            bVar11 = true;
                          }
                          else {
                            uVar32 = (uint)*(undefined8 *)(lVar21 + 0x3a0);
                            if (((uVar32 >> 0x16 & 1) != 0) || (*(long *)(lVar21 + 1000) == 0)) {
                              pcVar39 = *(char **)(lVar21 + 0x548);
                              if (*(char **)(lVar20 + 0x548) == (char *)0x0) {
                                if (pcVar39 == (char *)0x0) goto LAB_009497f0;
                              }
                              else if (((pcVar39 != (char *)0x0) &&
                                       (iVar16 = strcmp(*(char **)(lVar20 + 0x548),pcVar39),
                                       iVar16 == 0)) &&
                                      (((*(uint *)puVar1 ^ uVar32) >> 0x1a & 1) == 0)) {
LAB_009497f0:
                                if ((((*(uint *)(*(long *)(lVar21 + 0x3a8) + 0x94) ^
                                      *(uint *)(*plVar42 + 0x94)) & 1) == 0) ||
                                   (((uVar32 >> 0x1b & 1) != 0 &&
                                    (*(int *)(*(long *)(lVar21 + 0x3a8) + 0x90) ==
                                     *(int *)(*plVar42 + 0x8c))))) {
                                  uVar33 = *puVar1;
                                  uVar17 = (uint)uVar33;
                                  if ((((uVar17 ^ uVar32) & 0x601) == 0) &&
                                     (uVar8 = uVar17 >> 1 & 1, uVar8 == (uVar32 >> 1 & 1))) {
                                    if (uVar8 != 0) {
                                      if (((*(char *)(lVar20 + 0xb4) != *(char *)(lVar21 + 0xb4)) ||
                                          (*(int *)(lVar20 + 0xb0) != *(int *)(lVar21 + 0xb0))) ||
                                         ((iVar16 = curl_strequal(*(undefined8 *)(lVar20 + 0xa0),
                                                                  *(undefined8 *)(lVar21 + 0xa0)),
                                          iVar16 == 0 ||
                                          ((iVar16 = FUN_009418b0(*(undefined8 *)(lVar20 + 0xb8),
                                                                  *(undefined8 *)(lVar21 + 0xb8)),
                                           iVar16 != 0 ||
                                           (iVar16 = FUN_009418b0(*(undefined8 *)(lVar20 + 0xc0),
                                                                  *(undefined8 *)(lVar21 + 0xc0)),
                                           iVar16 != 0)))))) goto joined_r0x009499d8;
                                      uVar33 = *puVar1;
                                      uVar17 = (uint)uVar33;
                                    }
                                    if (((uVar33 & 1) == 0) ||
                                       (((((((*(uint *)(lVar21 + 0x3a0) ^ uVar17) >> 3 & 1) == 0 &&
                                           (*(char *)(lVar20 + 0xec) == *(char *)(lVar21 + 0xec)))
                                          && (*(int *)(lVar20 + 0xe8) == *(int *)(lVar21 + 0xe8)))
                                         && (iVar16 = curl_strequal(*(undefined8 *)(lVar20 + 0xd8),
                                                                    *(undefined8 *)(lVar21 + 0xd8)),
                                            iVar16 != 0)) &&
                                        (((*(byte *)(lVar20 + 0xec) & 0xfe) != 2 ||
                                         ((*(byte *)(lVar20 + 0xec) == *(byte *)(lVar21 + 0xec) &&
                                          (uVar33 = FUN_009679f8(param_1,lVar21,1),
                                          (uVar33 & 1) != 0)))))))) {
                                      if ((bVar31 == 0) ||
                                         (*(char *)(lVar21 + 0x574) != '\0' || (bool)(bVar10 ^ 1)))
                                      {
                                        pcVar39 = *(char **)(lVar20 + 0x550);
                                        if ((((pcVar39 == (char *)0x0) &&
                                             (*(short *)(lVar20 + 0x56c) == 0)) ||
                                            (((*(short *)(lVar21 + 0x56c) ==
                                               *(short *)(lVar20 + 0x56c) &&
                                              (*(short *)(lVar21 + 0x558) ==
                                               *(short *)(lVar20 + 0x558))) &&
                                             ((pcVar39 == (char *)0x0 ||
                                              ((*(char **)(lVar21 + 0x550) != (char *)0x0 &&
                                               (iVar16 = strcmp(*(char **)(lVar21 + 0x550),pcVar39),
                                               iVar16 == 0)))))))) &&
                                           ((((*(char *)(*plVar42 + 0x94) < '\0' ||
                                              ((((iVar16 = FUN_009418b0(*plVar3,*(undefined8 *)
                                                                                 (lVar21 + 0x1c8)),
                                                 iVar16 == 0 &&
                                                 (iVar16 = FUN_009418b0(*plVar4,*(undefined8 *)
                                                                                 (lVar21 + 0x1d0)),
                                                 iVar16 == 0)) &&
                                                (iVar16 = FUN_009418b0(*(undefined8 *)
                                                                        (lVar20 + 0x1e0),
                                                                       *(undefined8 *)
                                                                        (lVar21 + 0x1e0)),
                                                iVar16 == 0)) &&
                                               (iVar16 = FUN_009418b0(*(undefined8 *)
                                                                       (lVar20 + 0x1e8),
                                                                      *(undefined8 *)
                                                                       (lVar21 + 0x1e8)),
                                               iVar16 == 0)))) &&
                                             (*(char *)(lVar20 + 0x576) == *(char *)(lVar21 + 0x576)
                                             )) && (((puVar37 = (undefined8 *)*plVar42,
                                                     (*(byte *)((long)puVar37 + 0x8c) & 3) == 0 ||
                                                     (*(byte *)(lVar21 + 0x574) < 0x14)) ||
                                                    ((2 < *pbVar26 &&
                                                     ((*(byte *)(lVar21 + 0x574) < 0x1e ||
                                                      (0x1d < *pbVar26)))))))))) {
                                          if ((*(byte *)(puVar37 + 0x12) & 0xc) != 0) {
                                            iVar16 = FUN_009418b0(*(undefined8 *)(lVar20 + 0x4c8),
                                                                  *(undefined8 *)(lVar21 + 0x4c8));
                                            if ((((iVar16 != 0) ||
                                                 (iVar16 = FUN_009418b0(*(undefined8 *)
                                                                         (lVar20 + 0x4d0),
                                                                        *(undefined8 *)
                                                                         (lVar21 + 0x4d0)),
                                                 iVar16 != 0)) ||
                                                (*(char *)(lVar20 + 0x538) !=
                                                 *(char *)(lVar21 + 0x538))) ||
                                               (*(char *)(lVar20 + 0x539) !=
                                                *(char *)(lVar21 + 0x539))) goto joined_r0x009499d8;
                                            puVar37 = (undefined8 *)*plVar42;
                                          }
                                          if (((*(byte *)((long)puVar37 + 0x94) & 1) == 0) &&
                                             ((*puVar1 & 9) == 1)) {
LAB_00949998:
                                            if (bVar13) {
                                              iVar16 = FUN_009418b0(*plVar3,*(undefined8 *)
                                                                             (lVar21 + 0x1c8));
                                              if ((iVar16 == 0) &&
                                                 (iVar16 = FUN_009418b0(*plVar4,*(undefined8 *)
                                                                                 (lVar21 + 0x1d0)),
                                                 iVar16 == 0)) goto LAB_00949be4;
                                              lVar22 = lVar21;
                                              if (*(int *)(lVar21 + 0x3f0) != 0) {
                                                lVar22 = local_e0;
                                              }
                                            }
                                            else if (*(int *)(lVar21 + 0x3f0) == 0) {
LAB_00949be4:
                                              if (bVar14) {
                                                if ((((*(long *)(lVar21 + 0xf0) != 0) &&
                                                     (*(long *)(lVar21 + 0xf8) != 0)) &&
                                                    (iVar16 = FUN_009418b0(*(undefined8 *)
                                                                            (lVar20 + 0xf0)),
                                                    iVar16 == 0)) &&
                                                   (iVar16 = FUN_009418b0(*(undefined8 *)
                                                                           (lVar20 + 0xf8),
                                                                          *(undefined8 *)
                                                                           (lVar21 + 0xf8)),
                                                   iVar16 == 0)) {
LAB_00949c30:
                                                  if (((bVar13) && (*(int *)(lVar21 + 0x3f0) != 0))
                                                     || ((lVar22 = lVar21, bVar14 &&
                                                         (*(int *)(lVar21 + 0x3f4) != 0))))
                                                  goto LAB_00949d68;
                                                }
                                              }
                                              else if (*(int *)(lVar21 + 0x3f4) == 0) {
                                                if (bVar13) goto LAB_00949c30;
                                                uVar33 = *(ulong *)(lVar21 + 1000);
                                                if (uVar33 == 0) {
                                                  uVar33 = FUN_0094aa74(lVar21,param_1);
                                                  if ((uVar33 & 1) == 0) goto LAB_00949d68;
                                                  if (*(long *)(lVar21 + 1000) == 0) {
                                                    if (*(long *)(lVar21 + 0x30) != 0) {
                                                      FUN_00917b54(param_1);
                                                      *(undefined8 *)(lVar21 + 0x30) = 0;
                                                    }
                                                    FUN_00924ee4(lVar21);
                                                    FUN_009109f8(param_1,lVar21,
                                                                 *(char *)(lVar21 + 0x575) != '\0');
                                                  }
                                                }
                                                else {
                                                  uVar35 = FUN_0092f1dc(*(undefined8 *)
                                                                         (param_1 + 0xc0));
                                                  if (uVar33 < (uVar35 & 0xffffffff)) {
                                                    uVar35 = *(ulong *)(lVar21 + 1000);
                                                    uVar33 = FUN_009082b0(param_1,lVar21,0);
                                                    if (uVar35 < uVar33) {
                                                      if ((((uint)*puVar2 >> 0x1c & 1) != 0) &&
                                                         ((*(long *)(param_1 + 0x12a0) == 0 ||
                                                          (0 < *(int *)(*(long *)(param_1 + 0x12a0)
                                                                       + 8))))) {
                                                        FUN_00904c98(param_1,
                                                  "Multiplexed connection found");
                                                  }
                                                  goto LAB_00949d68;
                                                  }
                                                  if ((((uint)*puVar2 >> 0x1c & 1) != 0) &&
                                                     ((*(long *)(param_1 + 0x12a0) == 0 ||
                                                      (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)
                                                      )))) {
                                                    FUN_00904c98(param_1,
                                                  "MAX_CONCURRENT_STREAMS reached, skip (%zu)",
                                                  *(undefined8 *)(lVar21 + 1000));
                                                  }
                                                  }
                                                  else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) !=
                                                            0) && ((*(long *)(param_1 + 0x12a0) == 0
                                                                   || (0 < *(int *)(*(long *)(
                                                  param_1 + 0x12a0) + 8))))) {
                                                    FUN_00904c98(param_1,
                                                  "client side MAX_CONCURRENT_STREAMS reached, skip (%zu)"
                                                  ,*(undefined8 *)(lVar21 + 1000));
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            iVar16 = curl_strequal(*puVar37,**(undefined8 **)
                                                                              (lVar21 + 0x3a8));
                                            if ((iVar16 != 0) ||
                                               ((*(int *)(*(long *)(lVar21 + 0x3a8) + 0x90) ==
                                                 *(int *)(*plVar42 + 0x8c) &&
                                                ((*(byte *)(lVar21 + 0x3a3) >> 3 & 1) != 0)))) {
                                              uVar32 = (uint)*puVar1;
                                              if ((uVar32 >> 9 & 1) != 0) {
                                                iVar16 = curl_strequal(*(undefined8 *)
                                                                        (lVar20 + 0x80),
                                                                       *(undefined8 *)
                                                                        (lVar21 + 0x80));
                                                if (iVar16 == 0) goto joined_r0x009499d8;
                                                uVar32 = (uint)*puVar1;
                                              }
                                              if (((((uVar32 >> 10 & 1) == 0) ||
                                                   (*(int *)(lVar20 + 0x564) ==
                                                    *(int *)(lVar21 + 0x564))) &&
                                                  (iVar16 = curl_strequal(*(undefined8 *)
                                                                           (lVar20 + 0x50),
                                                                          *(undefined8 *)
                                                                           (lVar21 + 0x50)),
                                                  iVar16 != 0)) &&
                                                 ((*(int *)(lVar20 + 0x560) ==
                                                   *(int *)(lVar21 + 0x560) &&
                                                  (((*(byte *)(*plVar42 + 0x94) & 1) == 0 ||
                                                   (uVar33 = FUN_009679f8(param_1,lVar21,0),
                                                   (uVar33 & 1) != 0)))))) goto LAB_00949998;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        uVar32 = (uint)*puVar2;
                                        if ((*puVar2 >> 0x2a & 1) != 0) {
                                          if (((uVar32 >> 0x1c & 1) == 0) ||
                                             ((*(long *)(param_1 + 0x12a0) != 0 &&
                                              (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))))
                                          goto LAB_00949680;
                                          pcVar39 = 
                                          "Server upgrade does not support multiplex yet, wait";
                                          goto LAB_00949678;
                                        }
                                        if (((uVar32 >> 0x1c & 1) != 0) &&
                                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                                          FUN_00904c98(param_1,"Server upgrade cannot be used");
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
joined_r0x009499d8:
                        lVar21 = lVar22;
                        local_e0 = lVar21;
                      } while (plVar44 != (long *)0x0);
                      if (lVar21 == 0) goto LAB_00949f48;
LAB_00949d68:
                      FUN_0092bb60(param_1,lVar21);
                      if (*(long *)(param_1 + 0xd0) != 0) {
                        FUN_0093f680(param_1,5);
                      }
                      if (*plVar3 != 0) {
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0x1c8));
                        *(undefined8 *)(lVar21 + 0x1c8) = 0;
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0x1d0));
                        *(undefined8 *)(lVar21 + 0x1d0) = 0;
                        lVar22 = *plVar3;
                        *(undefined8 *)(lVar21 + 0x1d0) = *(undefined8 *)(lVar20 + 0x1d0);
                        *(long *)(lVar21 + 0x1c8) = lVar22;
                        *plVar3 = 0;
                        *(undefined8 *)(lVar20 + 0x1d0) = 0;
                      }
                      uVar18 = *puVar1;
                      *(ulong *)(lVar21 + 0x3a0) =
                           *(ulong *)(lVar21 + 0x3a0) & 0xfffffffffffffff8 |
                           *(ulong *)(lVar21 + 0x3a0) & 3 | uVar18 & 4;
                      if (((uint)uVar18 >> 2 & 1) != 0) {
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xf0));
                        *(undefined8 *)(lVar21 + 0xf0) = 0;
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xb8));
                        *(undefined8 *)(lVar21 + 0xb8) = 0;
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xf8));
                        *(undefined8 *)(lVar21 + 0xf8) = 0;
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xc0));
                        *(undefined8 *)(lVar21 + 0xc0) = 0;
                        *(undefined8 *)(lVar21 + 0xb8) = *(undefined8 *)(lVar20 + 0xb8);
                        uVar23 = *(undefined8 *)(lVar20 + 0xf0);
                        *(undefined8 *)(lVar21 + 0xf8) = *(undefined8 *)(lVar20 + 0xf8);
                        *(undefined8 *)(lVar21 + 0xf0) = uVar23;
                        *(undefined8 *)(lVar21 + 0xc0) = *(undefined8 *)(lVar20 + 0xc0);
                        *(undefined8 *)(lVar20 + 0xb8) = 0;
                        *(undefined8 *)(lVar20 + 0xc0) = 0;
                        *(undefined8 *)(lVar20 + 0xf0) = 0;
                        *(undefined8 *)(lVar20 + 0xf8) = 0;
                      }
                      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0x40));
                      *(undefined8 *)(lVar21 + 0x40) = 0;
                      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0x70));
                      *(undefined8 *)(lVar21 + 0x70) = 0;
                      uVar23 = *(undefined8 *)(lVar20 + 0x50);
                      *(undefined8 *)(lVar21 + 0x58) = *(undefined8 *)(lVar20 + 0x58);
                      *(undefined8 *)(lVar21 + 0x50) = uVar23;
                      lVar22 = *plVar34;
                      *(undefined8 *)(lVar21 + 0x48) = *(undefined8 *)(lVar20 + 0x48);
                      *(long *)(lVar21 + 0x40) = lVar22;
                      *plVar34 = 0;
                      *(undefined8 *)(lVar20 + 0x48) = 0;
                      uVar23 = *(undefined8 *)(lVar20 + 0x80);
                      *(undefined8 *)(lVar21 + 0x88) = *(undefined8 *)(lVar20 + 0x88);
                      *(undefined8 *)(lVar21 + 0x80) = uVar23;
                      uVar23 = *(undefined8 *)(lVar20 + 0x70);
                      *(undefined8 *)(lVar21 + 0x78) = *(undefined8 *)(lVar20 + 0x78);
                      *(undefined8 *)(lVar21 + 0x70) = uVar23;
                      *(undefined8 *)(lVar20 + 0x70) = 0;
                      *(undefined8 *)(lVar21 + 0x560) = *(undefined8 *)(lVar20 + 0x560);
                      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0x60));
                      *(undefined8 *)(lVar21 + 0x60) = 0;
                      *(undefined8 *)(lVar21 + 0x60) = *(undefined8 *)(lVar20 + 0x60);
                      *(undefined8 *)(lVar20 + 0x60) = 0;
                      *(ulong *)(lVar21 + 0x3a0) = *(ulong *)(lVar21 + 0x3a0) | 0x80;
                      FUN_00946b9c(param_1,lVar20);
                      *param_2 = lVar21;
                      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                         ((*(long *)(param_1 + 0x12a0) == 0 ||
                          (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                        pcVar39 = "host";
                        if ((*(byte *)(lVar21 + 0x3a0) & 0x20) != 0) {
                          pcVar39 = "proxy";
                        }
                        if (*(long *)(lVar21 + 0xa0) == 0) {
                          if (*(long *)(lVar21 + 0xd8) == 0) {
                            puVar37 = (undefined8 *)(lVar21 + 0x58);
                          }
                          else {
                            puVar37 = (undefined8 *)(lVar21 + 0xe0);
                          }
                        }
                        else {
                          puVar37 = (undefined8 *)(lVar21 + 0xa8);
                        }
                        FUN_00904c98(param_1,"Re-using existing connection with %s %s",pcVar39,
                                     *puVar37);
                      }
                    }
                    else {
LAB_00948fd8:
                      if (((*(byte *)(*plVar42 + 0x95) & 1) != 0) &&
                         ((*(byte *)(param_1 + 0xa87) & 1) != 0)) {
                        *puVar1 = *puVar1 | 0x1000000;
                      }
                      if (bVar13) {
LAB_00949008:
                        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          FUN_00904c98(param_1,"No connections available.");
                        }
                        FUN_00946b9c(param_1,lVar20);
                        *param_2 = 0;
                        iVar16 = 0x59;
                        goto switchD_00947644_caseD_1;
                      }
                      lVar21 = FUN_0090fc08(param_1,lVar20,*(undefined8 *)(param_1 + 0xc38));
                      if (((uVar18 == 0) || (lVar21 == 0)) || (*(ulong *)(lVar21 + 8) < uVar18)) {
                        if (*(long *)(param_1 + 0xd0) != 0) {
                          FUN_0093f680(param_1,5);
                        }
                      }
                      else {
                        lVar21 = FUN_00910510(param_1);
                        if (*(long *)(param_1 + 0xd0) != 0) {
                          FUN_0093f680(param_1,5);
                        }
                        if (lVar21 == 0) {
                          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                             ((*(long *)(param_1 + 0x12a0) == 0 ||
                              (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                            FUN_00904c98(param_1,"No more connections allowed to host: %zu",uVar18);
                          }
                          goto LAB_00949008;
                        }
                        if (*(long *)(lVar21 + 1000) == 0) {
                          if (*(long *)(lVar21 + 0x30) != 0) {
                            FUN_00917b54(param_1);
                            *(undefined8 *)(lVar21 + 0x30) = 0;
                          }
                          FUN_00924ee4(lVar21);
                          FUN_009109f8(param_1,lVar21,*(char *)(lVar21 + 0x575) != '\0');
                        }
                      }
                      if ((uVar19 != 0) && (uVar18 = FUN_0090fba8(param_1), uVar19 <= uVar18)) {
                        lVar21 = FUN_00910208(param_1);
                        if (lVar21 == 0) {
                          if (*(long *)(param_1 + 0xa48) == 0) {
                            if ((((uint)*puVar2 >> 0x1c & 1) != 0) &&
                               ((*(long *)(param_1 + 0x12a0) == 0 ||
                                (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                              FUN_00904c98(param_1,"No connections available in cache");
                            }
                            goto LAB_00949008;
                          }
                          if ((((uint)*puVar2 >> 0x1c & 1) != 0) &&
                             ((*(long *)(param_1 + 0x12a0) == 0 ||
                              (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                            FUN_00904c98(param_1,"Allowing DoH to override max connection limit");
                          }
                        }
                        else if (*(long *)(lVar21 + 1000) == 0) {
                          if (*(long *)(lVar21 + 0x30) != 0) {
                            FUN_00917b54(param_1);
                            *(undefined8 *)(lVar21 + 0x30) = 0;
                          }
                          FUN_00924ee4(lVar21);
                          FUN_009109f8(param_1,lVar21,*(char *)(lVar21 + 0x575) != '\0');
                        }
                      }
                      iVar16 = FUN_00967cf0(param_1,lVar20);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      FUN_0092bb60(param_1,lVar20);
                      iVar16 = FUN_0090fcf0(param_1);
                      if (iVar16 != 0) goto switchD_00947644_caseD_1;
                      if (((*(byte *)(param_1 + 0xd58) >> 3 & 1) != 0) &&
                         (bVar31 = *(byte *)(param_1 + 0xd68), (bVar31 & 1) != 0)) {
                        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          FUN_00904c98(param_1,"NTLM picked AND auth done set, clear picked");
                          bVar31 = *(byte *)(param_1 + 0xd68);
                        }
                        *(undefined8 *)(param_1 + 0xd58) = 0;
                        *(byte *)(param_1 + 0xd68) = bVar31 & 0xfe;
                      }
                      lVar21 = lVar20;
                      if (((*(byte *)(param_1 + 0xd78) >> 3 & 1) != 0) &&
                         (bVar31 = *(byte *)(param_1 + 0xd88), (bVar31 & 1) != 0)) {
                        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                           ((*(long *)(param_1 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                          FUN_00904c98(param_1,"NTLM-proxy picked AND auth done set, clear picked");
                          bVar31 = *(byte *)(param_1 + 0xd88);
                        }
                        *(undefined8 *)(param_1 + 0xd78) = 0;
                        *(byte *)(param_1 + 0xd88) = bVar31 & 0xfe;
                      }
                    }
                    FUN_0094a3a8(param_1,lVar21);
                    lVar20 = *(long *)(param_1 + 0x338);
                    *(long *)(param_1 + 0x1118) = lVar20;
                    if ((lVar20 == 0) && (*(long *)(param_1 + 0x878) == 0)) {
                      uVar32 = *(uint *)(param_1 + 0x131c) & 0xfffffeff;
                    }
                    else {
                      if ((*(byte *)(param_1 + 0x131d) >> 1 & 1) != 0) {
                        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1110));
                        lVar20 = *(long *)(param_1 + 0x1118);
                      }
                      if (lVar20 == 0) {
                        lVar20 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x878));
                      }
                      else {
                        lVar20 = curl_maprintf(&DAT_002c51d2);
                      }
                      *(long *)(param_1 + 0x1110) = lVar20;
                      uVar32 = *(uint *)(param_1 + 0x131c) & 0xfffffc00 |
                               *(uint *)(param_1 + 0x131c) & 0x1ff | (uint)(lVar20 != 0) << 9;
                      *(uint *)(param_1 + 0x131c) = uVar32;
                      if (lVar20 == 0) goto LAB_0094a068;
                      uVar32 = uVar32 | 0x100;
                    }
                    *(uint *)(param_1 + 0x131c) = uVar32;
                    uVar32 = (uint)*(undefined8 *)(lVar21 + 0x3a0);
                    if ((uVar32 >> 7 & 1) == 0) {
                      pcVar39 = *(char **)(lVar21 + 0x548);
                      if (pcVar39 == (char *)0x0) {
                        pcVar39 = *(char **)(lVar21 + 0xa0);
                        if ((pcVar39 != (char *)0x0) &&
                           (iVar16 = strncmp("localhost/",pcVar39,10), iVar16 == 0)) {
                          pcVar39 = pcVar39 + 9;
                          goto LAB_0094a090;
                        }
                        if ((uVar32 >> 5 & 1) == 0) {
                          local_88[0] = (char *)0x0;
                          uVar23 = FUN_009086d4(param_1,0,1);
                          lVar20 = lVar21 + 0x40;
                          if ((*(ulong *)(lVar21 + 0x3a0) & 0x200) != 0) {
                            lVar20 = lVar21 + 0x70;
                          }
                          lVar22 = 0x560;
                          if ((*(ulong *)(lVar21 + 0x3a0) & 0x400) != 0) {
                            lVar22 = 0x564;
                          }
                          *(undefined4 *)(lVar21 + 0x15c) = *(undefined4 *)(lVar21 + lVar22);
                          lVar22 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(lVar20 + 0x10));
                          *(long *)(lVar21 + 0x60) = lVar22;
                          if (lVar22 == 0) goto LAB_0094a2cc;
                          iVar16 = FUN_00917b34(param_1,lVar22,*(undefined4 *)(lVar21 + 0x15c),
                                                local_88,uVar23);
                          *(char **)(lVar21 + 0x30) = local_88[0];
                          if (iVar16 == -2) {
                            uVar27 = *(undefined8 *)(lVar20 + 0x18);
                            auVar45 = FUN_00941cb8();
                            uVar23 = FUN_00941d54(auVar45._0_8_,auVar45._8_8_,
                                                  *(undefined8 *)(param_1 + 0xb40),
                                                  *(undefined8 *)(param_1 + 0xb48));
                            FUN_00904b80(param_1,
                                         "Failed to resolve host \'%s\' with timeout after %ld ms",
                                         uVar27,uVar23);
LAB_0094a310:
                            iVar16 = 0x1c;
                            goto switchD_00947644_caseD_1;
                          }
                          if (iVar16 == 1) {
LAB_0094a2b4:
                            *param_3 = 1;
                            goto LAB_0094a348;
                          }
                          iVar16 = 0;
                          if (local_88[0] == (char *)0x0) {
                            FUN_00904b80(param_1,"Could not resolve host: %s",
                                         *(undefined8 *)(lVar20 + 0x18));
                            iVar16 = 6;
                            goto switchD_00947644_caseD_1;
                          }
                          goto joined_r0x0094a344;
                        }
                        local_88[0] = (char *)0x0;
                        uVar23 = FUN_009086d4(param_1,0,1);
                        lVar20 = lVar21 + 200;
                        if ((*(ulong *)(lVar21 + 0x3a0) & 2) != 0) {
                          lVar20 = lVar21 + 0x90;
                        }
                        lVar22 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(lVar20 + 0x10));
                        *(long *)(lVar21 + 0x60) = lVar22;
                        if (lVar22 != 0) {
                          iVar16 = FUN_00917b34(param_1,lVar22,*(undefined4 *)(lVar21 + 0x15c),
                                                local_88,uVar23);
                          *(char **)(lVar21 + 0x30) = local_88[0];
                          if (iVar16 == -2) goto LAB_0094a310;
                          if (iVar16 == 1) goto LAB_0094a2b4;
                          iVar16 = 0;
                          if (local_88[0] == (char *)0x0) {
                            FUN_00904b80(param_1,"Couldn\'t resolve proxy \'%s\'",
                                         *(undefined8 *)(lVar20 + 0x18));
                            iVar16 = 5;
                          }
                          goto joined_r0x0094a344;
                        }
                      }
                      else {
LAB_0094a090:
                        *(undefined1 *)(lVar21 + 0x572) = 6;
                        local_88[0] = (char *)((ulong)local_88[0] & 0xffffffffffffff00);
                        plVar34 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x20);
                        if (plVar34 != (long *)0x0) {
                          lVar20 = FUN_0090f894(pcVar39,local_88,
                                                *(ulong *)(lVar21 + 0x3a0) >> 0x1a & 1);
                          *plVar34 = lVar20;
                          if (lVar20 == 0) {
                            if ((char)local_88[0] != '\0') {
                              FUN_00904b80(param_1,"Unix socket path too long: \'%s\'",pcVar39);
                            }
                            (*(code *)PTR_free_00cc4678)(plVar34);
                            iVar16 = 0x1b;
                            if ((char)local_88[0] != '\0') {
                              iVar16 = 6;
                            }
joined_r0x0094a344:
                            if (iVar16 != 0) goto switchD_00947644_caseD_1;
                          }
                          else {
                            plVar34[2] = plVar34[2] + 1;
                            *(long **)(lVar21 + 0x30) = plVar34;
                          }
                          goto LAB_0094a348;
                        }
                      }
LAB_0094a2cc:
                      iVar16 = 0x1b;
                    }
                    else {
                      *param_3 = 0;
LAB_0094a348:
                      iVar16 = FUN_00907ed4(param_1);
                    }
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 6:
                    goto switchD_00947644_caseD_1;
                  case 5:
                    goto switchD_00947644_caseD_5;
                  case 7:
                    break;
                  case 8:
                    goto switchD_00947644_caseD_8;
                  default:
                    goto switchD_00947ba4_default;
                  }
                default:
switchD_00947ba4_default:
                  goto switchD_00947644_caseD_1;
                }
                break;
              }
              pcVar30 = "disabled";
            }
          }
          else {
LAB_00947ae0:
            pcVar30 = "not supported";
          }
          pcVar25 = "";
          if ((*(uint *)(param_1 + 0x131c) & 2) != 0) {
            pcVar25 = " (in redirect)";
          }
          FUN_00904b80(param_1,"Protocol \"%s\" %s%s",pcVar39,pcVar30,pcVar25);
          goto switchD_00947644_caseD_5;
        }
        break;
      default:
        goto switchD_00947644_caseD_1;
      case 5:
        goto switchD_00947644_caseD_5;
      case 7:
        break;
      case 8:
        goto switchD_00947644_caseD_8;
      }
    }
  }
switchD_00947644_caseD_7:
  iVar16 = 0x1b;
switchD_00947644_caseD_1:
  if (*(long *)(lVar9 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar16;
joined_r0x009488f8:
  uVar32 = (uint)bVar31;
  if (uVar32 == 0) goto LAB_0094869c;
  if (((9 < (uVar32 - 0x30 & 0xff)) && (0x19 < ((uVar32 & 0xffffffdf) - 0x41 & 0xff))) &&
     ((1 < uVar32 - 0x2d && ((uVar32 != 0x7e && (uVar32 != 0x5f)))))) goto LAB_00948950;
  __s = __s + 1;
  bVar31 = *__s;
  goto joined_r0x009488f8;
LAB_00948950:
  if (uVar32 == 0x5d) {
    *__s = 0;
    __s = __s + 1;
  }
  else {
LAB_0094869c:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Invalid IPv6 address format");
    }
  }
LAB_009486cc:
  pcVar39 = strchr((char *)__s,0x3a);
  if (pcVar39 == (char *)0x0) {
LAB_009487e8:
    uVar33 = 0xffffffff;
  }
  else {
    local_88[0] = (char *)0x0;
    *pcVar39 = '\0';
    pcVar39 = pcVar39 + 1;
    if (*pcVar39 == '\0') goto LAB_009487e8;
    uVar33 = strtol(pcVar39,local_88,10);
    if (local_88[0] == (char *)0x0) {
      if (uVar33 >> 0x10 != 0) goto LAB_00948d44;
    }
    else if ((uVar33 >> 0x10 != 0) || (*local_88[0] != '\0')) {
LAB_00948d44:
      FUN_00904b80(param_1,"No valid port number in connect to host string (%s)",pcVar39);
      iVar16 = 0x31;
      goto LAB_00948d5c;
    }
  }
  pcVar39 = (char *)(*(code *)PTR_strdup_00cc4688)(pbVar43);
  if (pcVar39 == (char *)0x0) {
    iVar16 = 0x1b;
LAB_00948d5c:
    (*(code *)PTR_free_00cc4678)(pbVar26);
    goto switchD_00947644_caseD_1;
  }
  (*(code *)PTR_free_00cc4678)(pbVar26);
  if (*pcVar39 == '\0') {
LAB_00948774:
    *puVar1 = *puVar1 & 0xfffffffffffffdff;
    (*(code *)PTR_free_00cc4678)(pcVar39);
    pcVar39 = (char *)0x0;
  }
  else {
    *(char **)(lVar20 + 0x70) = pcVar39;
    *(char **)(lVar20 + 0x80) = pcVar39;
    *(ulong *)(lVar20 + 0x3a0) = *(ulong *)(lVar20 + 0x3a0) | 0x200;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Connecting to hostname: %s",pcVar39);
      iVar16 = (int)uVar33;
      goto joined_r0x0094886c;
    }
  }
  iVar16 = (int)uVar33;
joined_r0x0094886c:
  if (iVar16 < 0) {
    iVar16 = -1;
    *puVar1 = *puVar1 & 0xfffffffffffffbff;
  }
  else {
    iVar16 = (int)uVar33;
    *(int *)(lVar20 + 0x564) = iVar16;
    *(ulong *)(lVar20 + 0x3a0) = *(ulong *)(lVar20 + 0x3a0) | 0x400;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Connecting to port: %d",uVar33 & 0xffffffff);
    }
  }
  bVar13 = iVar16 == -1;
  if (((!bVar13) || (pcVar39 != (char *)0x0)) ||
     (puVar37 = (undefined8 *)puVar37[1], puVar37 == (undefined8 *)0x0)) goto LAB_00948b9c;
  goto LAB_0094856c;
switchD_00947644_caseD_5:
  iVar16 = 1;
  goto switchD_00947644_caseD_1;
}


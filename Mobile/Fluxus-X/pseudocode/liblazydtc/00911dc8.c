/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00911dc8
 */

int FUN_00911dc8(long param_1,long *param_2)

{
  void *__dest;
  char *pcVar1;
  long lVar2;
  uint uVar3;
  byte bVar4;
  char cVar5;
  char cVar6;
  char cVar7;
  char cVar8;
  uint uVar9;
  long lVar10;
  short sVar11;
  int iVar12;
  int iVar13;
  char *pcVar14;
  ulong uVar15;
  undefined8 uVar16;
  size_t sVar17;
  long lVar18;
  long lVar19;
  uint uVar20;
  long lVar21;
  undefined4 uVar22;
  ushort uVar23;
  short sVar24;
  ulong uVar25;
  long lVar26;
  undefined1 *puVar27;
  long lVar28;
  uint *puVar29;
  long lVar30;
  undefined8 *puVar31;
  ulong uVar32;
  uint local_368 [2];
  undefined1 auStack_360 [32];
  undefined1 auStack_340 [32];
  undefined1 auStack_320 [32];
  undefined1 auStack_300 [32];
  undefined4 local_2e0;
  undefined8 local_2dc;
  undefined1 auStack_2cd [461];
  int local_100;
  uint local_fc;
  int local_f8;
  char acStack_f0 [128];
  long local_70;
  
  lVar10 = tpidr_el0;
  local_70 = *(long *)(lVar10 + 0x28);
  lVar28 = *(long *)(param_1 + 0x1a8);
  *param_2 = 0;
  if (lVar28 == 0) {
    iVar13 = 0x1b;
  }
  else if ((*(long *)(lVar28 + 8) == 0) && (*(long *)(lVar28 + 0x240) == 0)) {
    FUN_00904b80(param_1,"Could not DoH-resolve: %s",*(undefined8 *)(param_1 + 0xd90));
    iVar13 = 6 - (*(uint *)(*(long *)(param_1 + 0x20) + 0x3a0) >> 5 & 1);
  }
  else {
    iVar13 = 0;
    if (*(int *)(lVar28 + 0x478) == 0) {
      local_368[0] = 0;
      local_368[1] = 0;
      lVar26 = *(long *)(param_1 + 0x1a8);
      if (lVar26 != 0) {
        lVar19 = *(long *)(lVar26 + 8);
        if (lVar19 != 0) {
          if (*(long *)(lVar19 + 0xc0) != 0) {
            curl_multi_remove_handle();
          }
          FUN_00946590((long *)(lVar26 + 8));
        }
        if (*(long *)(lVar26 + 0x240) != 0) {
          if (*(long *)(*(long *)(lVar26 + 0x240) + 0xc0) != 0) {
            curl_multi_remove_handle();
          }
          FUN_00946590(lVar26 + 0x240);
        }
      }
      memset(auStack_360,0,0x270);
      local_fc = 0x7fffffff;
      FUN_00904528(auStack_360,0x100);
      FUN_00904528(auStack_340,0x100);
      FUN_00904528(auStack_320,0x100);
      FUN_00904528(auStack_300,0x100);
      lVar26 = 0;
LAB_009123a8:
      puVar29 = (uint *)(lVar28 + lVar26 * 0x238 + 0x10);
      if (*puVar29 != 0) {
        lVar19 = lVar28 + lVar26 * 0x238 + 0x220;
        pcVar14 = (char *)FUN_0090497c(lVar19);
        uVar15 = FUN_00904984(lVar19);
        if (uVar15 < 0xc) {
          uVar20 = 4;
        }
        else if (((pcVar14 == (char *)0x0) || (*pcVar14 != '\0')) || (pcVar14[1] != '\0')) {
          uVar20 = 0xc;
        }
        else if ((pcVar14[3] & 0xfU) == 0) {
          uVar3 = *puVar29;
          uVar32 = 0xc;
          for (uVar23 = *(ushort *)(pcVar14 + 4) >> 8 | *(ushort *)(pcVar14 + 4) << 8; uVar23 != 0;
              uVar23 = uVar23 - 1) {
            do {
              uVar20 = (int)uVar32 + 1;
              if (uVar15 < uVar20) goto LAB_00912348;
              bVar4 = pcVar14[uVar32];
              if ((bVar4 & 0xc0) != 0) {
                if ((bVar4 & 0xc0) != 0xc0) goto LAB_00912350;
                uVar20 = (int)uVar32 + 2;
                if (uVar15 < uVar20) goto LAB_00912348;
                break;
              }
              uVar20 = uVar20 + bVar4;
              uVar32 = (ulong)uVar20;
              if (uVar15 < uVar32) goto LAB_00912348;
            } while (bVar4 != 0);
            uVar32 = (ulong)(uVar20 + 4);
            if (uVar15 < uVar32) goto LAB_00912348;
          }
          uVar23 = *(ushort *)(pcVar14 + 6) >> 8 | *(ushort *)(pcVar14 + 6) << 8;
          if (uVar23 == 0) {
            sVar24 = 0;
          }
          else {
LAB_00911f78:
            do {
              uVar20 = (int)uVar32 + 1;
              if (uVar15 < uVar20) goto LAB_00912348;
              bVar4 = pcVar14[uVar32];
              if ((bVar4 & 0xc0) == 0) {
                uVar20 = uVar20 + bVar4;
                uVar32 = (ulong)uVar20;
                if (uVar15 < uVar32) goto LAB_00912348;
                if (bVar4 != 0) goto LAB_00911f78;
              }
              else {
                if ((bVar4 & 0xc0) != 0xc0) goto LAB_00912350;
                uVar20 = (int)uVar32 + 2;
                if (uVar15 < uVar20) goto LAB_00912348;
              }
              if (uVar15 < uVar20 + 2) goto LAB_00912348;
              cVar5 = pcVar14[uVar20];
              cVar6 = pcVar14[uVar20 + 1];
              sVar24 = CONCAT11(cVar5,cVar6);
              if (((CONCAT11(cVar5,cVar6) != 5) && (CONCAT11(cVar5,cVar6) != 0x27)) &&
                 (uVar3 != CONCAT11(cVar5,cVar6))) {
                uVar20 = 9;
                goto LAB_009123fc;
              }
              if (uVar15 < uVar20 + 4) goto LAB_00912348;
              if (CONCAT11(pcVar14[uVar20 + 2],pcVar14[uVar20 + 3]) != 1) {
                uVar20 = 10;
                goto LAB_009123fc;
              }
              if (uVar15 < uVar20 + 8) goto LAB_00912348;
              uVar9 = (*(uint *)(pcVar14 + (uVar20 + 4)) & 0xff00ff00) >> 8 |
                      (*(uint *)(pcVar14 + (uVar20 + 4)) & 0xff00ff) << 8;
              uVar9 = uVar9 >> 0x10 | uVar9 << 0x10;
              if (uVar9 < local_fc) {
                local_fc = uVar9;
              }
              uVar9 = uVar20 + 10;
              uVar25 = (ulong)uVar9;
              if (uVar15 < uVar25) goto LAB_00912348;
              cVar7 = pcVar14[uVar20 + 8];
              cVar8 = pcVar14[uVar20 + 9];
              uVar32 = (ulong)(uVar9 + CONCAT11(cVar7,cVar8));
              if (uVar15 < uVar32) goto LAB_00912348;
              sVar11 = CONCAT11(cVar5,cVar6);
              if (sVar11 == 0x1c) {
                if (CONCAT11(cVar7,cVar8) != 0x10) {
LAB_00912380:
                  uVar20 = 6;
                  goto LAB_009123fc;
                }
                if (local_100 < 0x18) {
                  lVar21 = (long)local_100 * 0x14;
                  *(undefined4 *)(auStack_300 + lVar21 + 0x20) = 0x1c;
                  uVar16 = *(undefined8 *)(pcVar14 + (int)uVar9);
                  *(undefined8 *)(auStack_2cd + lVar21 + -7) =
                       *(undefined8 *)(pcVar14 + (int)uVar9 + 8);
                  *(undefined8 *)(auStack_300 + lVar21 + 0x24) = uVar16;
LAB_009120ec:
                  local_100 = local_100 + 1;
                }
              }
              else if (sVar11 == 5) {
                lVar21 = (long)local_f8;
                if (local_f8 != 4) {
                  local_f8 = local_f8 + 1;
                  puVar27 = auStack_360 + lVar21 * 0x20;
                  iVar13 = -0x80;
                  do {
                    if (uVar15 <= uVar25) {
LAB_00912368:
                      uVar20 = 2;
                      goto LAB_009123fc;
                    }
                    bVar4 = pcVar14[uVar25];
                    if ((bVar4 & 0xc0) == 0) {
                      if (bVar4 == 0) break;
                      lVar21 = FUN_00904984(puVar27);
                      if ((lVar21 != 0) &&
                         (iVar12 = FUN_009045fc(puVar27,&DAT_002ab502,1), iVar12 != 0)) {
                        uVar20 = 5;
                        goto LAB_009123fc;
                      }
                      uVar20 = (int)uVar25 + 1;
                      uVar25 = (ulong)(uVar20 + bVar4);
                      if (uVar15 < uVar25) goto LAB_00912374;
                      iVar12 = FUN_009045fc(puVar27,pcVar14 + uVar20);
                      if (iVar12 != 0) {
                        uVar20 = 5;
                        goto LAB_009123fc;
                      }
                    }
                    else {
                      if ((bVar4 & 0xc0) != 0xc0) {
LAB_00912374:
                        uVar20 = 1;
                        goto LAB_009123fc;
                      }
                      uVar25 = (ulong)((int)uVar25 + 1);
                      if (uVar15 <= uVar25) goto LAB_00912368;
                      if (bVar4 == 0) break;
                      uVar25 = (ulong)((uint)(byte)pcVar14[uVar25] | (bVar4 & 0x3f) << 8);
                    }
                    iVar13 = iVar13 + 1;
                    uVar20 = 3;
                    if (iVar13 == 0) goto LAB_009123fc;
                  } while( true );
                }
              }
              else if (sVar11 == 1) {
                if (CONCAT11(cVar7,cVar8) != 4) goto LAB_00912380;
                lVar21 = (long)local_100;
                if (local_100 < 0x18) {
                  *(undefined4 *)(auStack_300 + lVar21 * 0x14 + 0x20) = 1;
                  *(undefined4 *)(auStack_300 + lVar21 * 0x14 + 0x24) =
                       *(undefined4 *)(pcVar14 + (int)uVar9);
                  goto LAB_009120ec;
                }
              }
              uVar23 = uVar23 - 1;
            } while (uVar23 != 0);
          }
          for (uVar23 = *(ushort *)(pcVar14 + 8) >> 8 | *(ushort *)(pcVar14 + 8) << 8; uVar23 != 0;
              uVar23 = uVar23 - 1) {
            do {
              uVar20 = (int)uVar32 + 1;
              if (uVar15 < uVar20) goto LAB_00912348;
              bVar4 = pcVar14[uVar32];
              if ((bVar4 & 0xc0) != 0) {
                if ((bVar4 & 0xc0) != 0xc0) goto LAB_00912350;
                uVar20 = (int)uVar32 + 2;
                if (uVar15 < uVar20) goto LAB_00912348;
                break;
              }
              uVar20 = uVar20 + bVar4;
              uVar32 = (ulong)uVar20;
              if (uVar15 < uVar32) goto LAB_00912348;
            } while (bVar4 != 0);
            if (((uVar15 < uVar20 + 8) || (uVar15 < uVar20 + 10)) ||
               (uVar32 = (ulong)((uint)CONCAT11(pcVar14[uVar20 + 8],pcVar14[uVar20 + 9]) +
                                uVar20 + 10), uVar15 < uVar32)) goto LAB_00912348;
          }
          for (uVar23 = *(ushort *)(pcVar14 + 10) >> 8 | *(ushort *)(pcVar14 + 10) << 8; uVar23 != 0
              ; uVar23 = uVar23 - 1) {
            do {
              uVar20 = (int)uVar32 + 1;
              if (uVar15 < uVar20) goto LAB_00912348;
              bVar4 = pcVar14[uVar32];
              if ((bVar4 & 0xc0) != 0) {
                if ((bVar4 & 0xc0) != 0xc0) goto LAB_00912350;
                uVar20 = (int)uVar32 + 2;
                if (uVar15 < uVar20) goto LAB_00912348;
                break;
              }
              uVar20 = uVar20 + bVar4;
              uVar32 = (ulong)uVar20;
              if (uVar15 < uVar32) goto LAB_00912348;
            } while (bVar4 != 0);
            if (((uVar15 < uVar20 + 8) || (uVar15 < uVar20 + 10)) ||
               (uVar32 = (ulong)((uint)CONCAT11(pcVar14[uVar20 + 8],pcVar14[uVar20 + 9]) +
                                uVar20 + 10), uVar15 < uVar32)) goto LAB_00912348;
          }
          if (uVar15 == uVar32) {
            uVar20 = 0xb;
            if (sVar24 == 2 || (local_f8 != 0 || local_100 != 0)) {
              uVar20 = 0;
            }
          }
          else {
            uVar20 = 7;
          }
        }
        else {
          uVar20 = 8;
        }
        goto LAB_009123fc;
      }
      goto LAB_0091247c;
    }
  }
LAB_00912a38:
  if (*(long *)(lVar10 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar13;
LAB_00912350:
  uVar20 = 1;
  goto LAB_009123fc;
LAB_00912348:
  uVar20 = 2;
LAB_009123fc:
  local_368[lVar26] = uVar20;
  FUN_00904534(lVar19);
  if (((uVar20 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    pcVar14 = "AAAA";
    if (*puVar29 != 0x1c) {
      pcVar14 = "unknown";
    }
    pcVar1 = "A";
    if (*puVar29 != 1) {
      pcVar1 = pcVar14;
    }
    FUN_00904c98(param_1,"DoH: %s type %s for %s",(&PTR_DAT_00c4f2d8)[uVar20],pcVar1,
                 *(undefined8 *)(lVar28 + 0x480));
  }
LAB_0091247c:
  lVar26 = lVar26 + 1;
  if (lVar26 == 2) goto code_r0x00912488;
  goto LAB_009123a8;
code_r0x00912488:
  if ((local_368[0] == 0) || (local_368[1] == 0)) {
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
        (0 < DAT_00cc4b08)))) {
      FUN_00904c98(param_1,"[DoH] hostname: %s",*(undefined8 *)(lVar28 + 0x480));
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"[DoH] TTL: %u seconds",local_fc);
      }
      if (0 < local_100) {
        lVar26 = 0;
        puVar27 = auStack_2cd;
        do {
          if (*(int *)(puVar27 + -0x13) == 0x1c) {
            iVar13 = curl_msnprintf(acStack_f0,0x80,"[DoH] AAAA: ");
            pcVar14 = acStack_f0 + iVar13;
            lVar19 = 0x80 - (long)iVar13;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002ab32c,puVar27[-0xf],puVar27[-0xe]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-0xd],puVar27[-0xc]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-0xb],puVar27[-10]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-9],puVar27[-8]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-7],puVar27[-6]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-5],puVar27[-4]);
            sVar17 = strlen(pcVar14);
            lVar19 = lVar19 - sVar17;
            pcVar14 = pcVar14 + sVar17;
            curl_msnprintf(pcVar14,lVar19,"%s%02x%02x",&DAT_002bcda4,puVar27[-3],puVar27[-2]);
            sVar17 = strlen(pcVar14);
            curl_msnprintf(pcVar14 + sVar17,lVar19 - sVar17,"%s%02x%02x",&DAT_002bcda4,puVar27[-1],
                           *puVar27);
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1,&DAT_002b6c62,acStack_f0);
            }
          }
          else if (((*(int *)(puVar27 + -0x13) == 1) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
                   ) && ((*(long *)(param_1 + 0x12a0) == 0 ||
                         (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
            FUN_00904c98(param_1,"[DoH] A: %u.%u.%u.%u",puVar27[-0xf],puVar27[-0xe],puVar27[-0xd],
                         puVar27[-0xc]);
          }
          lVar26 = lVar26 + 1;
          puVar27 = puVar27 + 0x14;
        } while (lVar26 < local_100);
      }
      if (0 < local_f8) {
        lVar26 = 0;
        puVar27 = auStack_360;
        iVar13 = local_f8;
        do {
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            uVar16 = FUN_00904974(puVar27);
            FUN_00904c98(param_1,"CNAME: %s",uVar16);
            iVar13 = local_f8;
          }
          lVar26 = lVar26 + 1;
          puVar27 = puVar27 + 0x20;
        } while (lVar26 < iVar13);
      }
    }
    pcVar14 = *(char **)(lVar28 + 0x480);
    uVar20 = *(uint *)(lVar28 + 0x47c);
    sVar17 = strlen(pcVar14);
    if (local_100 == 0) {
      iVar13 = 6;
LAB_009129a4:
      if (0 < local_f8) {
        lVar28 = 0;
        puVar27 = auStack_360;
        do {
          FUN_00904534(puVar27);
          lVar28 = lVar28 + 1;
          puVar27 = puVar27 + 0x20;
        } while (lVar28 < local_f8);
      }
      goto LAB_00912a38;
    }
    if (local_100 < 1) {
      lVar26 = 0;
    }
    else {
      lVar19 = 0;
      puVar31 = &local_2dc;
      lVar21 = 0;
      lVar30 = 0;
      do {
        iVar13 = *(int *)((long)puVar31 + -4);
        lVar2 = 0x1c;
        if (iVar13 != 0x1c) {
          lVar2 = 0x10;
        }
        uVar22 = 10;
        if (iVar13 != 0x1c) {
          uVar22 = 2;
        }
        lVar18 = (*(code *)PTR_calloc_00cc4690)(1,sVar17 + 0x31 + lVar2);
        if (lVar18 == 0) {
          FUN_0090f270(lVar30);
          iVar13 = 0x1b;
          goto LAB_009129a4;
        }
        __dest = (void *)(lVar18 + 0x30 + lVar2);
        *(void **)(lVar18 + 0x18) = __dest;
        *(long *)(lVar18 + 0x20) = lVar18 + 0x30;
        memcpy(__dest,pcVar14,sVar17 + 1);
        lVar26 = lVar18;
        if (lVar30 != 0) {
          lVar26 = lVar30;
        }
        if (lVar21 != 0) {
          *(long *)(lVar21 + 0x28) = lVar18;
        }
        *(undefined4 *)(lVar18 + 4) = uVar22;
        *(undefined4 *)(lVar18 + 8) = 1;
        *(int *)(lVar18 + 0x10) = (int)lVar2;
        if (iVar13 == 0x1c) {
          uVar16 = *puVar31;
          *(undefined8 *)(lVar18 + 0x40) = puVar31[1];
          *(undefined8 *)(lVar18 + 0x38) = uVar16;
        }
        else {
          *(undefined4 *)(lVar18 + 0x34) = *(undefined4 *)puVar31;
        }
        *(short *)(lVar18 + 0x30) = (short)uVar22;
        *(ushort *)(lVar18 + 0x32) =
             (ushort)(uVar20 >> 8) & 0xff | (ushort)((uVar20 & 0xff00ff) << 8);
        lVar19 = lVar19 + 1;
        puVar31 = (undefined8 *)((long)puVar31 + 0x14);
        lVar21 = lVar18;
        lVar30 = lVar26;
      } while (lVar19 < local_100);
    }
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,3,2);
    }
    lVar28 = FUN_00916f7c(param_1,lVar26,*(undefined8 *)(lVar28 + 0x480),0,
                          *(undefined4 *)(lVar28 + 0x47c));
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,3);
    }
    if (lVar28 == 0) {
      FUN_0090f270(lVar26);
      iVar13 = 0;
    }
    else {
      iVar13 = 0;
      *(long *)(param_1 + 0xd98) = lVar28;
      *param_2 = lVar28;
    }
  }
  else {
    iVar13 = 6;
  }
  if (0 < local_f8) {
    lVar28 = 0;
    puVar27 = auStack_360;
    do {
      FUN_00904534(puVar27);
      lVar28 = lVar28 + 1;
      puVar27 = puVar27 + 0x20;
    } while (lVar28 < local_f8);
  }
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1a8));
  *(undefined8 *)(param_1 + 0x1a8) = 0;
  goto LAB_00912a38;
}


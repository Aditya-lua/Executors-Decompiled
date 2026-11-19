/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00933070
 */

int FUN_00933070(long param_1,undefined1 *param_2)

{
  uint *puVar1;
  undefined *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  bool bVar8;
  int iVar9;
  int iVar10;
  long lVar11;
  undefined1 *puVar12;
  undefined1 *puVar13;
  long lVar14;
  size_t sVar15;
  char *pcVar16;
  undefined1 *puVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  undefined1 *puVar20;
  char *pcVar21;
  long lVar22;
  undefined8 *puVar23;
  undefined1 *local_c0;
  char *local_98;
  undefined1 auStack_88 [32];
  long local_68;
  
  lVar7 = tpidr_el0;
  local_68 = *(long *)(lVar7 + 0x28);
  lVar22 = *(long *)(param_1 + 0x20);
  uVar5 = *(uint *)(param_1 + 0x9e0);
  puVar23 = *(undefined8 **)(param_1 + 0x1a0);
  *param_2 = 1;
  FUN_00904528(auStack_88,0x10000);
  *puVar23 = *(undefined8 *)(param_1 + 0x1120);
  puVar23[1] = 0;
  if (*(long *)(param_1 + 0xc90) == 0) {
    lVar11 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(lVar22 + 0x50));
    *(long *)(param_1 + 0xc90) = lVar11;
    if (lVar11 != 0) {
      *(undefined4 *)(param_1 + 0xc98) = *(undefined4 *)(lVar22 + 0x560);
      *(undefined4 *)(param_1 + 0xc9c) = *(undefined4 *)(*(long *)(lVar22 + 0x3a8) + 0x8c);
      goto LAB_00933100;
    }
    goto LAB_009333bc;
  }
LAB_00933100:
  puVar1 = (uint *)(param_1 + 0x1b1);
  uVar6 = *puVar1;
  *puVar1 = uVar6 | 0x8000;
  if (0xb < uVar5 - 1) {
    pcVar16 = "Got invalid RTSP request";
LAB_00933424:
    FUN_00904b80(param_1,pcVar16);
    iVar9 = 0x2b;
    goto LAB_0093352c;
  }
  uVar6 = uVar6 & 0xffff7fff;
  pcVar21 = "SET_PARAMETER";
  pcVar16 = "OPTIONS";
  switch(uVar5) {
  case 2:
    pcVar16 = "DESCRIBE";
    *puVar1 = uVar6;
    break;
  case 3:
    pcVar16 = "ANNOUNCE";
    break;
  case 4:
    pcVar16 = "SETUP";
    break;
  case 5:
    pcVar16 = "PLAY";
    break;
  case 6:
    pcVar16 = "PAUSE";
    break;
  case 7:
    pcVar16 = "TEARDOWN";
    break;
  case 8:
    pcVar16 = "GET_PARAMETER";
    *puVar1 = uVar6;
    lVar11 = *(long *)(param_1 + 0x8d0);
    goto joined_r0x00933184;
  case 10:
    pcVar21 = "RECORD";
  case 9:
    lVar11 = *(long *)(param_1 + 0x8d0);
    pcVar16 = pcVar21;
joined_r0x00933184:
    if (lVar11 != 0) {
      bVar8 = true;
      goto LAB_009331c8;
    }
    FUN_00904b80(param_1,"Refusing to issue an RTSP request [%s] without a session ID.",pcVar16);
    goto LAB_00933520;
  case 0xb:
    *puVar1 = uVar6;
    FUN_00943380(param_1,1,0xffffffffffffffff,1);
    iVar9 = 0;
    goto LAB_00933524;
  case 0xc:
    pcVar16 = "Got invalid RTSP request: RTSPREQ_LAST";
    goto LAB_00933424;
  }
  lVar11 = *(long *)(param_1 + 0x8d0);
  bVar8 = lVar11 != 0;
LAB_009331c8:
  puVar2 = &DAT_002c8dbd;
  if (*(undefined **)(param_1 + 0x8d8) != (undefined *)0x0) {
    puVar2 = *(undefined **)(param_1 + 0x8d8);
  }
  puVar12 = (undefined1 *)FUN_00941e8c(param_1,"Transport",9);
  if ((uVar5 == 4) && (puVar12 == (undefined1 *)0x0)) {
    if (*(long *)(param_1 + 0x8e0) != 0) {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12e0));
      *(undefined8 *)(param_1 + 0x12e0) = 0;
      puVar12 = (undefined1 *)curl_maprintf("Transport: %s\r\n",*(undefined8 *)(param_1 + 0x8e0));
      *(undefined1 **)(param_1 + 0x12e0) = puVar12;
      if (puVar12 == (undefined1 *)0x0) {
LAB_009333bc:
        iVar9 = 0x1b;
        goto LAB_0093352c;
      }
      goto LAB_009332c8;
    }
    pcVar16 = "Refusing to issue an RTSP SETUP without a Transport: header.";
LAB_00933518:
    FUN_00904b80(param_1,pcVar16);
LAB_00933520:
    iVar9 = 0x2b;
  }
  else if (uVar5 == 2) {
    lVar14 = FUN_00941e8c(param_1,"Accept",6);
    local_98 = "Accept: application/sdp\r\n";
    if (lVar14 != 0) {
      local_98 = (char *)0x0;
    }
    lVar14 = FUN_00941e8c(param_1,"Accept-Encoding",0xf);
    if ((lVar14 != 0) || (*(long *)(param_1 + 0x840) == 0)) goto LAB_009332cc;
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b0));
    *(undefined8 *)(param_1 + 0x12b0) = 0;
    puVar13 = (undefined1 *)
              curl_maprintf("Accept-Encoding: %s\r\n",*(undefined8 *)(param_1 + 0x840));
    *(undefined1 **)(param_1 + 0x12b0) = puVar13;
    if (puVar13 != (undefined1 *)0x0) goto LAB_009332d0;
    iVar9 = 0x1b;
  }
  else {
LAB_009332c8:
    local_98 = (char *)0x0;
LAB_009332cc:
    puVar13 = (undefined1 *)0x0;
LAB_009332d0:
    lVar14 = FUN_00941e8c(param_1,"User-Agent",10);
    if ((lVar14 == 0) || (*(long *)(param_1 + 0x12a8) == 0)) {
      lVar14 = FUN_00941e8c(param_1,"User-Agent",10);
      puVar17 = (undefined1 *)0x0;
      if ((lVar14 == 0) && (puVar17 = (undefined1 *)0x0, *(long *)(param_1 + 0x890) != 0)) {
        puVar17 = *(undefined1 **)(param_1 + 0x12a8);
      }
    }
    else {
      (*(code *)PTR_free_00cc4678)();
      puVar17 = (undefined1 *)0x0;
      *(undefined8 *)(param_1 + 0x12a8) = 0;
    }
    iVar9 = FUN_00919fec(param_1,lVar22,pcVar16,0,puVar2,0);
    if (iVar9 == 0) {
      puVar18 = *(undefined1 **)(param_1 + 0x1300);
      puVar19 = *(undefined1 **)(param_1 + 0x12b8);
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12c8));
      *(undefined8 *)(param_1 + 0x12c8) = 0;
      if (*(long *)(param_1 + 0x11c0) == 0) {
        local_c0 = (undefined1 *)0x0;
joined_r0x0093343c:
        if ((uVar5 & 0xf) == 0) goto LAB_009334c0;
LAB_00933464:
        puVar20 = (undefined1 *)0x0;
        if ((*(uint *)(param_1 + 0x131c) >> 8 & 1) != 0) {
          lVar22 = FUN_00941e8c(param_1,"Range",5);
          puVar20 = (undefined1 *)0x0;
          if (lVar22 == 0) {
            if (*(long *)(param_1 + 0x1110) == 0) goto LAB_009334c0;
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12c0));
            *(undefined8 *)(param_1 + 0x12c0) = 0;
            puVar20 = (undefined1 *)curl_maprintf("Range: %s\r\n",*(undefined8 *)(param_1 + 0x1110))
            ;
            *(undefined1 **)(param_1 + 0x12c0) = puVar20;
          }
        }
      }
      else {
        lVar22 = FUN_00941e8c(param_1,"Referer",7);
        if (lVar22 == 0) {
          local_c0 = (undefined1 *)
                     curl_maprintf("Referer: %s\r\n",*(undefined8 *)(param_1 + 0x11c0));
          *(undefined1 **)(param_1 + 0x12c8) = local_c0;
          goto joined_r0x0093343c;
        }
        local_c0 = *(undefined1 **)(param_1 + 0x12c8);
        if ((uVar5 & 0xf) != 0) goto LAB_00933464;
LAB_009334c0:
        puVar20 = (undefined1 *)0x0;
      }
      lVar22 = FUN_00941e8c(param_1,&DAT_002af32c,4);
      if (lVar22 == 0) {
        lVar22 = FUN_00941e8c(param_1,"Session",7);
        if (lVar22 != 0) {
          pcVar16 = "Session ID cannot be set as a custom header.";
          goto LAB_00933518;
        }
        iVar9 = FUN_009048cc(auStack_88,"%s %s RTSP/1.0\r\nCSeq: %ld\r\n",pcVar16,puVar2,*puVar23);
        if ((iVar9 == 0) &&
           ((!bVar8 || (iVar9 = FUN_009048cc(auStack_88,"Session: %s\r\n",lVar11), iVar9 == 0)))) {
          puVar3 = &DAT_002ab32c;
          if (puVar12 != (undefined1 *)0x0) {
            puVar3 = puVar12;
          }
          pcVar16 = "";
          if (local_98 != (char *)0x0) {
            pcVar16 = local_98;
          }
          puVar12 = &DAT_002ab32c;
          if (puVar13 != (undefined1 *)0x0) {
            puVar12 = puVar13;
          }
          puVar13 = &DAT_002ab32c;
          if (puVar20 != (undefined1 *)0x0) {
            puVar13 = puVar20;
          }
          puVar20 = &DAT_002ab32c;
          if (local_c0 != (undefined1 *)0x0) {
            puVar20 = local_c0;
          }
          puVar4 = &DAT_002ab32c;
          if (puVar17 != (undefined1 *)0x0) {
            puVar4 = puVar17;
          }
          puVar17 = &DAT_002ab32c;
          if (puVar18 != (undefined1 *)0x0) {
            puVar17 = puVar18;
          }
          puVar18 = &DAT_002ab32c;
          if (puVar19 != (undefined1 *)0x0) {
            puVar18 = puVar19;
          }
          iVar9 = FUN_009048cc(auStack_88,"%s%s%s%s%s%s%s%s",puVar3,pcVar16,puVar12,puVar13,puVar20,
                               puVar4,puVar17,puVar18);
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b8));
          *(undefined8 *)(param_1 + 0x12b8) = 0;
          if ((iVar9 == 0) &&
             ((((uVar5 != 4 && (uVar5 != 2)) ||
               (iVar9 = FUN_0091afe4(param_1,auStack_88), iVar9 == 0)) &&
              (iVar9 = FUN_0091ac70(param_1,0,auStack_88), iVar9 == 0)))) {
            if ((uVar5 < 10) && ((1 << (ulong)(uVar5 & 0x1f) & 0x308U) != 0)) {
              if ((*(byte *)(param_1 + 0x131e) >> 1 & 1) == 0) {
                pcVar16 = *(char **)(param_1 + 0x208);
                if (pcVar16 == (char *)0x0) {
                  sVar15 = *(size_t *)(param_1 + 0x1158);
                  if ((long)sVar15 < 0) {
                    iVar9 = FUN_00935d48(param_1);
                    sVar15 = 0;
                  }
                  else {
                    iVar9 = FUN_009357d8(param_1,sVar15);
                  }
                }
                else {
                  sVar15 = strlen(pcVar16);
                  iVar9 = FUN_00935e10(param_1,pcVar16,sVar15);
                }
              }
              else {
                sVar15 = *(size_t *)(param_1 + 0x1158);
                *(undefined1 *)(param_1 + 0x131a) = 4;
                iVar9 = FUN_009357d8(param_1,sVar15);
              }
              if (iVar9 == 0) {
                if ((long)sVar15 < 1) {
                  if (uVar5 == 8) {
                    *(undefined1 *)(param_1 + 0x131a) = 5;
                    *puVar1 = *puVar1 | 0x8000;
                  }
                }
                else {
                  lVar22 = FUN_00941e8c(param_1,"Content-Length",0xe);
                  if ((((lVar22 == 0) &&
                       (iVar9 = FUN_009048cc(auStack_88,"Content-Length: %ld\r\n",sVar15),
                       iVar9 != 0)) ||
                      (((uVar5 | 1) == 9 &&
                       ((lVar22 = FUN_00941e8c(param_1,"Content-Type",0xc), lVar22 == 0 &&
                        (iVar9 = FUN_009045fc(auStack_88,"Content-Type: text/parameters\r\n",0x1f),
                        iVar9 != 0)))))) ||
                     ((uVar5 == 3 &&
                      ((lVar22 = FUN_00941e8c(param_1,"Content-Type",0xc), lVar22 == 0 &&
                       (iVar9 = FUN_009045fc(auStack_88,"Content-Type: application/sdp\r\n",0x1f),
                       iVar9 != 0)))))) goto LAB_00933524;
                }
LAB_009337d0:
                iVar9 = FUN_009045fc(auStack_88,&DAT_002b917a,2);
                if (iVar9 == 0) {
                  FUN_00943380(param_1,3,0xffffffffffffffff,1);
                  iVar9 = FUN_00932b04(param_1,auStack_88);
                  if (iVar9 == 0) {
                    *(long *)(param_1 + 0x1120) = *(long *)(param_1 + 0x1120) + 1;
                    if (*(long *)(param_1 + 0xf0) == 0) {
                      iVar9 = 0;
                    }
                    else {
                      FUN_00931fec(param_1);
                      iVar10 = FUN_009314dc(param_1);
                      iVar9 = 0;
                      if (iVar10 != 0) {
                        iVar9 = 0x2a;
                      }
                    }
                  }
                  else {
                    FUN_00904b80(param_1,"Failed sending RTSP request");
                  }
                }
              }
            }
            else {
              iVar9 = FUN_00935d48(param_1);
              if (iVar9 == 0) goto LAB_009337d0;
            }
          }
        }
      }
      else {
        FUN_00904b80(param_1,"CSeq cannot be set as a custom header.");
        iVar9 = 0x55;
      }
    }
  }
LAB_00933524:
  FUN_00904534(auStack_88);
LAB_0093352c:
  if (*(long *)(lVar7 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar9;
}


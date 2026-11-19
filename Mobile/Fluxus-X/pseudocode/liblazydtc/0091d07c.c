/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091d07c
 */

/* WARNING: Type propagation algorithm not settling */

int FUN_0091d07c(long param_1,char *param_2,ulong param_3,undefined8 *param_4)

{
  uint *puVar1;
  byte bVar2;
  long lVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  void *pvVar8;
  size_t sVar9;
  long lVar10;
  undefined8 uVar11;
  char *pcVar12;
  ulong uVar13;
  undefined *puVar14;
  undefined4 uVar15;
  uint uVar16;
  uint uVar17;
  int iVar18;
  char cVar19;
  long lVar20;
  undefined8 *puVar21;
  undefined1 auStack_78 [32];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  *param_4 = 0;
  if ((*param_2 != '\r') && (*param_2 != '\n')) {
    iVar4 = *(int *)(param_1 + 0x114);
    *(int *)(param_1 + 0x114) = iVar4 + 1;
    if (iVar4 == 0) {
      lVar6 = *(long *)(param_1 + 0x20);
      *(undefined4 *)(param_1 + 0x120) = 0;
      uVar16 = *(uint *)(*(long *)(lVar6 + 0x3a8) + 0x8c);
      if ((uVar16 & 3) == 0) {
        if ((uVar16 >> 0x12 & 1) != 0) {
          for (pcVar12 = param_2; (*pcVar12 == ' ' || (*pcVar12 == '\t')); pcVar12 = pcVar12 + 1) {
          }
          iVar4 = strncmp(pcVar12,"RTSP/",5);
          if (iVar4 == 0) {
            if ((((((byte)pcVar12[5] - 0x30 < 10) && (pcVar12[6] == '.')) &&
                 ((byte)pcVar12[7] - 0x30 < 10)) && ((pcVar12[8] == ' ' || (pcVar12[8] == '\t'))))
               && (((byte)pcVar12[9] - 0x30 < 10 &&
                   (((byte)pcVar12[10] - 0x30 < 10 && ((byte)pcVar12[0xb] - 0x30 < 10)))))) {
              *(uint *)(param_1 + 0x124) =
                   (uint)(byte)pcVar12[10] * 10 + (uint)(byte)pcVar12[9] * 100 +
                   (uint)(byte)pcVar12[0xb] + -0x14d0;
              bVar2 = pcVar12[0xc];
              if ((bVar2 == 9) || ((bVar2 == 0x20 || (bVar2 - 10 < 4)))) {
                *(undefined4 *)(param_1 + 0x120) = 0xb;
                goto LAB_0091d520;
              }
            }
            iVar4 = 8;
            goto LAB_0091d9b8;
          }
        }
LAB_0091d418:
        iVar4 = 8;
        *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) & 0xfffffffe;
        goto LAB_0091d9b8;
      }
      for (pcVar12 = param_2; (*pcVar12 == ' ' || (*pcVar12 == '\t')); pcVar12 = pcVar12 + 1) {
      }
      iVar4 = strncmp(pcVar12,"HTTP/",5);
      if (iVar4 != 0) goto LAB_0091d294;
      bVar2 = pcVar12[5];
      if (1 < bVar2 - 0x32) {
        if (bVar2 == 0x31) {
          if (((pcVar12[6] == '.') && (((byte)pcVar12[7] & 0xfe) == 0x30)) &&
             ((pcVar12[8] == ' ' || (pcVar12[8] == '\t')))) {
            *(uint *)(param_1 + 0x120) = (byte)pcVar12[7] - 0x26;
            if ((((byte)pcVar12[9] - 0x30 < 10) && ((byte)pcVar12[10] - 0x30 < 10)) &&
               ((byte)pcVar12[0xb] - 0x30 < 10)) {
              *(uint *)(param_1 + 0x124) =
                   (uint)(byte)pcVar12[10] * 10 + (uint)(byte)pcVar12[9] * 100 +
                   (uint)(byte)pcVar12[0xb] + -0x14d0;
              bVar2 = pcVar12[0xc];
              if (((bVar2 == 9) || (bVar2 == 0x20)) || (bVar2 - 10 < 4)) goto LAB_0091d520;
            }
          }
          pcVar12 = "Unsupported HTTP/1 subversion in response";
        }
        else {
          pcVar12 = "Unsupported HTTP version in response";
        }
        FUN_00904b80(param_1,pcVar12);
        iVar4 = 1;
        goto LAB_0091d9b8;
      }
      if ((pcVar12[6] == ' ') || (pcVar12[6] == '\t')) {
        *(uint *)(param_1 + 0x120) = (uint)bVar2 * 10 + -0x1e0;
        if ((9 < (byte)pcVar12[7] - 0x30) ||
           ((9 < (byte)pcVar12[8] - 0x30 || (9 < (byte)pcVar12[9] - 0x30)))) goto LAB_0091d294;
        *(uint *)(param_1 + 0x124) =
             (uint)(byte)pcVar12[8] * 10 + (uint)(byte)pcVar12[7] * 100 + (uint)(byte)pcVar12[9] +
             -0x14d0;
        bVar2 = pcVar12[10];
        if ((bVar2 != 9) && ((bVar2 != 0x20 && (3 < bVar2 - 10)))) goto LAB_0091d294;
      }
      else {
LAB_0091d294:
        for (puVar21 = *(undefined8 **)(param_1 + 0x6f8); puVar21 != (undefined8 *)0x0;
            puVar21 = (undefined8 *)puVar21[1]) {
          pcVar12 = (char *)*puVar21;
          sVar9 = strlen(pcVar12);
          if (param_3 <= sVar9) {
            sVar9 = param_3;
          }
          iVar4 = curl_strnequal(pcVar12,param_2,sVar9);
          if (iVar4 != 0) {
            cVar19 = '\0';
            if (4 < param_3) goto LAB_0091d510;
            goto LAB_0091d2d4;
          }
        }
        cVar19 = '\x02';
LAB_0091d2d4:
        uVar7 = param_3;
        if (4 < param_3) {
          uVar7 = 5;
        }
        iVar4 = curl_strnequal("HTTP/",param_2,uVar7);
        if (iVar4 != 0) {
          cVar19 = 4 < param_3;
        }
        if (cVar19 != '\x01') goto LAB_0091d418;
LAB_0091d510:
        lVar6 = *(long *)(param_1 + 0x20);
        *(undefined8 *)(param_1 + 0x120) = 0xc80000000a;
      }
LAB_0091d520:
      iVar4 = FUN_0091cdf8(param_1,lVar6);
      if (iVar4 != 0) goto LAB_0091d9b8;
      uVar16 = 0xc;
    }
    else {
      uVar16 = 4;
    }
    pvVar8 = memchr(param_2,0,param_3);
    if (pvVar8 == (void *)0x0) {
      if (((*(int *)(param_1 + 0x114) < 2) ||
          (((*param_2 == ' ' || (*param_2 == '\t')) && (2 < *(int *)(param_1 + 0x114))))) ||
         (pvVar8 = memchr(param_2,0x3a,param_3), pvVar8 != (void *)0x0)) {
        iVar4 = FUN_0091c450(param_1,param_2,param_3);
        if (iVar4 != 0) goto LAB_0091d9b8;
        FUN_00904a98(param_1,1,param_2,param_3);
        uVar17 = uVar16 | 0x20;
        if (99 < *(int *)(param_1 + 0x124) - 100U) {
          uVar17 = uVar16;
        }
        iVar4 = FUN_00934dd0(param_1,uVar17,param_2,param_3);
        if (iVar4 != 0) goto LAB_0091d9b8;
        if (param_3 < 0x4b000) {
          iVar4 = (int)param_3;
          uVar16 = *(int *)(param_1 + 0x10c) + iVar4;
          uVar17 = *(int *)(param_1 + 0x1378) + iVar4;
          *(uint *)(param_1 + 0x1378) = uVar17;
          *(uint *)(param_1 + 0x10c) = uVar16;
          *(int *)(param_1 + 0x108) = *(int *)(param_1 + 0x108) + iVar4;
          if (uVar16 < 0x4b001) {
            iVar4 = 0;
            if (uVar17 < 0x5dc001) goto LAB_0091d9b8;
            param_3 = (ulong)uVar17;
            goto joined_r0x0091dac4;
          }
          param_3 = (ulong)uVar16;
        }
        else {
          param_3 = *(uint *)(param_1 + 0x10c) + param_3;
joined_r0x0091dac4:
          if (param_3 == 0) {
            iVar4 = 0;
            goto LAB_0091d9b8;
          }
        }
        FUN_00904b80(param_1,"Too large response headers: %zu > %u",param_3);
        iVar4 = 0x38;
        goto LAB_0091d9b8;
      }
      pcVar12 = "Header without colon";
    }
    else {
      pcVar12 = "Nul byte in header";
    }
    FUN_00904b80(param_1,pcVar12);
    iVar4 = 8;
    goto LAB_0091d9b8;
  }
  FUN_00904528(auStack_78,param_3 + 1);
  iVar4 = FUN_009045fc(auStack_78,param_2,param_3);
  if (iVar4 != 0) goto LAB_0091d9b8;
  FUN_0090456c(param_1 + 0xc60);
  lVar6 = FUN_00904974(auStack_78);
  uVar7 = FUN_00904984(auStack_78);
  lVar20 = *(long *)(param_1 + 0x20);
  if (*(int *)(param_1 + 300) == 3) {
    if (*(char *)(lVar20 + 0x574) != '\x14') {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Lying server, not serving HTTP/2");
      }
      goto LAB_0091d154;
    }
  }
  else {
LAB_0091d154:
    if (*(byte *)(lVar20 + 0x574) < 0x14) {
      **(undefined4 **)(lVar20 + 0x540) = 0xffffffff;
    }
  }
  iVar4 = *(int *)(param_1 + 0x124);
  iVar18 = (int)uVar7;
  if ((lVar6 == 0) || (199 < iVar4)) {
LAB_0091d62c:
    if (iVar4 < 100) {
      FUN_00904b80(param_1,"Unsupported response code in HTTP response");
      iVar5 = 1;
    }
    else {
      puVar1 = (uint *)(param_1 + 0x1b1);
      uVar16 = *puVar1;
      if (iVar4 < 200) {
        uVar17 = uVar16 | 1;
        *puVar1 = uVar17;
        *(undefined4 *)(param_1 + 0x114) = 0;
        if (iVar4 == 0x65) {
          if (*(char *)(lVar20 + 0x574) == '\v') {
            if (*(int *)(param_1 + 300) == 2) {
              if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_1 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                FUN_00904c98(param_1,"Received 101, Switching to HTTP/2");
                uVar17 = *puVar1;
              }
              *(undefined4 *)(param_1 + 300) = 3;
              *puVar1 = uVar17 | 1;
              *(undefined4 *)(param_1 + 0x114) = 0;
              iVar5 = 1;
            }
            else {
              iVar5 = 0;
              *puVar1 = uVar16 & 0xfffffffe;
            }
          }
          else {
            FUN_00904b80(param_1,"unexpected 101 response code");
            iVar5 = 8;
          }
        }
        else {
          iVar5 = 0;
          if (iVar4 == 100) {
            lVar20 = FUN_009360c8(param_1,&PTR_s_cr_exp100_00c4f4b0);
            if ((lVar20 == 0) || (*(int *)(*(long *)(lVar20 + 0x10) + 0x30) == 0)) {
              iVar5 = 0;
            }
            else {
              *(undefined4 *)(*(long *)(lVar20 + 0x10) + 0x30) = 0;
              *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xffffffbf | 2;
              FUN_0092f02c(param_1,0);
              iVar5 = 0;
            }
          }
        }
      }
      else {
        *puVar1 = uVar16 & 0xfffffffe;
        if (*(int *)(param_1 + 300) == 2) {
          FUN_0092c414(*(undefined8 *)(param_1 + 0xc0));
        }
        if (((((*(long *)(param_1 + 0xd8) == -1) && ((*(byte *)(param_1 + 0x1b2) >> 3 & 1) == 0)) &&
             ((*(byte *)(lVar20 + 0x3a0) >> 6 & 1) == 0)) &&
            ((*(char *)(lVar20 + 0x574) == '\v' &&
             ((*(byte *)(*(long *)(lVar20 + 0x3a8) + 0x8e) >> 2 & 1) == 0)))) &&
           (*(char *)(param_1 + 0x131a) != '\x05')) {
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            FUN_00904c98(param_1,"no chunk, no close, no size. Assume close to signal end");
          }
          FUN_00908c4c(lVar20,2);
        }
        if ((*(byte *)(lVar20 + 0x3a0) >> 6 & 1) == 0) {
LAB_0091da50:
          iVar4 = *(int *)(param_1 + 0x124);
        }
        else {
          iVar4 = *(int *)(param_1 + 0x124);
          if (iVar4 == 0x197) {
            iVar4 = *(int *)(lVar20 + 0x3f4);
joined_r0x0091da14:
            if (iVar4 == 2) {
              if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_1 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                FUN_00904c98(param_1,"Connection closure while negotiating auth (HTTP 1.0?)");
              }
              *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x20;
            }
            goto LAB_0091da50;
          }
          if (iVar4 == 0x191) {
            iVar4 = *(int *)(lVar20 + 0x3f0);
            goto joined_r0x0091da14;
          }
        }
        if (((iVar4 < 400) || (((uint)*(undefined8 *)(param_1 + 0xa82) >> 0x13 & 1) == 0)) ||
           ((*(long *)(param_1 + 0x1118) != 0 &&
            ((iVar4 == 0x1a0 && (*(char *)(param_1 + 0x131a) == '\0')))))) {
LAB_0091daf8:
          iVar5 = FUN_00919af0(param_1);
          if (iVar5 == 0) {
            if (299 < *(int *)(param_1 + 0x124)) {
              if (((((*(byte *)(param_1 + 0x1b3) & 1) == 0) &&
                   ((*(byte *)(lVar20 + 0x3a0) >> 6 & 1) == 0)) &&
                  (uVar13 = FUN_00935424(param_1), (uVar13 & 1) == 0)) &&
                 ((*(byte *)(param_1 + 0x131a) - 1 < 4 &&
                  (uVar13 = FUN_00932e0c(param_1), (uVar13 & 1) == 0)))) {
                if ((*(int *)(param_1 + 0x124) == 0x1a1) &&
                   (lVar10 = FUN_009360c8(param_1,&PTR_s_cr_exp100_00c4f4b0), lVar10 != 0)) {
                  if (((*(long *)(param_1 + 0xf0) == 0) &&
                      (lVar10 = FUN_009360c8(param_1,&PTR_s_cr_exp100_00c4f4b0), lVar10 != 0)) &&
                     (*(int *)(*(long *)(lVar10 + 0x10) + 0x30) == 1)) {
                    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                      FUN_00904c98(param_1,"Got HTTP failure 417 while waiting for a 100");
                    }
                  }
                  else {
                    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                      FUN_00904c98(param_1,"Got HTTP failure 417 while sending data");
                    }
                    FUN_00908c4c(lVar20,2);
                    FUN_00919e70(param_1,lVar20);
                  }
                  *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x80;
                  uVar11 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x11b8));
                  *(undefined8 *)(param_1 + 0x198) = uVar11;
                  FUN_00932ea0(param_1);
                }
                else {
                  uVar16 = (uint)*(undefined8 *)(param_1 + 0xa82);
                  if ((uVar16 >> 0x14 & 1) == 0) {
                    if (((uVar16 >> 0x1c & 1) != 0) &&
                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                      FUN_00904c98(param_1,"HTTP error before end of send, stop sending");
                    }
                    FUN_00908c4c(lVar20,2);
                    iVar5 = FUN_00932ea0(param_1);
                    if (iVar5 != 0) goto joined_r0x0091d744;
                  }
                  else {
                    if (((uVar16 >> 0x1c & 1) != 0) &&
                       ((*(long *)(param_1 + 0x12a0) == 0 ||
                        (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                      FUN_00904c98(param_1,"HTTP error before end of send, keep sending");
                    }
                    lVar20 = FUN_009360c8(param_1,&PTR_s_cr_exp100_00c4f4b0);
                    if ((lVar20 != 0) && (*(int *)(*(long *)(lVar20 + 0x10) + 0x30) != 0)) {
                      *(undefined4 *)(*(long *)(lVar20 + 0x10) + 0x30) = 0;
                      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xffffffbf | 2;
                      FUN_0092f02c(param_1,0);
                    }
                  }
                }
              }
              uVar13 = FUN_00935424(param_1);
              if (((uVar13 & 1) != 0) && (uVar13 = FUN_00932e0c(param_1), (uVar13 & 1) == 0)) {
                if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                   ((*(long *)(param_1 + 0x12a0) == 0 ||
                    (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                  FUN_00904c98(param_1,"Keep sending data to get tossed away");
                }
                *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) | 2;
              }
            }
            uVar16 = *puVar1;
            if ((uVar16 & 0x1800) == 0) {
              lVar20 = *(long *)(param_1 + 0xd8);
              if (lVar20 != -1) {
                if ((*(long *)(param_1 + 0x708) != 0) && (*(long *)(param_1 + 0x708) < lVar20)) {
                  FUN_00904b80(param_1,"Maximum file size exceeded");
                  iVar5 = 0x3f;
                  goto joined_r0x0091d744;
                }
                FUN_00931c24(param_1);
                *(undefined8 *)(param_1 + 0xe0) = *(undefined8 *)(param_1 + 0xd8);
                uVar16 = *puVar1;
              }
            }
            else {
              *(long *)(param_1 + 0xd8) = -1;
              *(undefined8 *)(param_1 + 0xe0) = 0xffffffffffffffff;
            }
            if ((uVar16 >> 0xf & 1) != 0) {
              uVar16 = uVar16 | 8;
              *puVar1 = uVar16;
            }
            if (*(long *)(param_1 + 0xe0) == 0) {
              *puVar1 = uVar16 | 8;
            }
            iVar5 = FUN_0091c1b4(param_1);
          }
        }
        else {
          if (iVar4 == 0x197) {
            if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x3a0) >> 2 & 1) != 0) goto LAB_0091daec;
          }
          else if ((iVar4 == 0x191) && (*(long *)(param_1 + 0x12f0) != 0)) {
LAB_0091daec:
            if ((*(byte *)(param_1 + 0x131c) >> 5 & 1) == 0) goto LAB_0091daf8;
          }
          FUN_00904b80(param_1,"The requested URL returned error: %d");
          iVar5 = 0x16;
        }
      }
    }
joined_r0x0091d744:
    iVar4 = iVar5;
    if (lVar6 != 0) {
      FUN_00904a98(param_1,1,lVar6,uVar7);
      uVar15 = 0x24;
      if (99 < *(int *)(param_1 + 0x124) - 100U) {
        uVar15 = 4;
      }
      iVar4 = FUN_00934dd0(param_1,uVar15,lVar6,uVar7);
      if (iVar4 == 0) {
        if (uVar7 < 0x4b000) {
          uVar16 = *(int *)(param_1 + 0x10c) + iVar18;
          puVar14 = (undefined *)0x4b000;
          uVar17 = *(int *)(param_1 + 0x1378) + iVar18;
          *(uint *)(param_1 + 0x1378) = uVar17;
          *(uint *)(param_1 + 0x10c) = uVar16;
          *(int *)(param_1 + 0x108) = *(int *)(param_1 + 0x108) + iVar18;
          if (uVar16 < 0x4b001) {
            puVar14 = &DAT_005dc000;
            if (0x5dc000 < uVar17) {
              uVar7 = (ulong)uVar17;
              goto joined_r0x0091d820;
            }
            goto LAB_0091d988;
          }
          uVar7 = (ulong)uVar16;
        }
        else {
          puVar14 = (undefined *)0x4b000;
          uVar7 = uVar7 + *(uint *)(param_1 + 0x10c);
joined_r0x0091d820:
          if (uVar7 == 0) {
LAB_0091d988:
            uVar15 = 0;
            if (*(int *)(param_1 + 0x124) - 100U < 100) {
              uVar15 = *(undefined4 *)(param_1 + 0x108);
            }
            iVar4 = 0;
            *(undefined4 *)(param_1 + 0x110) = uVar15;
            goto LAB_0091d9a8;
          }
        }
        FUN_00904b80(param_1,"Too large response headers: %zu > %u",uVar7,puVar14);
        iVar4 = 0x38;
      }
LAB_0091d9a8:
      if (iVar5 != 0) {
        iVar4 = iVar5;
      }
    }
  }
  else {
    FUN_00904a98(param_1,1,lVar6,uVar7);
    uVar15 = 0x24;
    if (99 < *(int *)(param_1 + 0x124) - 100U) {
      uVar15 = 4;
    }
    iVar4 = FUN_00934dd0(param_1,uVar15,lVar6,uVar7);
    if (iVar4 == 0) {
      if (uVar7 < 0x4b000) {
        uVar16 = *(int *)(param_1 + 0x10c) + iVar18;
        puVar14 = (undefined *)0x4b000;
        uVar17 = *(int *)(param_1 + 0x1378) + iVar18;
        *(uint *)(param_1 + 0x1378) = uVar17;
        *(uint *)(param_1 + 0x10c) = uVar16;
        *(int *)(param_1 + 0x108) = *(int *)(param_1 + 0x108) + iVar18;
        if (uVar16 < 0x4b001) {
          puVar14 = &DAT_005dc000;
          if (0x5dc000 < uVar17) {
            uVar13 = (ulong)uVar17;
            goto joined_r0x0091d4e8;
          }
          goto LAB_0091d60c;
        }
        uVar13 = (ulong)uVar16;
      }
      else {
        puVar14 = (undefined *)0x4b000;
        uVar13 = uVar7 + *(uint *)(param_1 + 0x10c);
joined_r0x0091d4e8:
        if (uVar13 == 0) {
LAB_0091d60c:
          iVar4 = *(int *)(param_1 + 0x124);
          uVar15 = 0;
          if (iVar4 - 100U < 100) {
            uVar15 = *(undefined4 *)(param_1 + 0x108);
          }
          lVar6 = 0;
          *(undefined4 *)(param_1 + 0x110) = uVar15;
          goto LAB_0091d62c;
        }
      }
      FUN_00904b80(param_1,"Too large response headers: %zu > %u",uVar13,puVar14);
      iVar4 = 0x38;
    }
  }
  FUN_00904534(auStack_78);
LAB_0091d9b8:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}


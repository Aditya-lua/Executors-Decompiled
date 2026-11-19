/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00962044
 */

undefined4 curl_url_set(long *param_1,int param_2,byte *param_3,uint param_4)

{
  byte bVar1;
  char cVar2;
  long lVar3;
  bool bVar4;
  byte bVar5;
  undefined4 uVar6;
  int iVar7;
  int iVar8;
  fde_table_entry *pfVar9;
  int *piVar10;
  ulong uVar11;
  byte *pbVar12;
  byte *pbVar13;
  char *pcVar14;
  size_t sVar15;
  char *pcVar16;
  size_t sVar17;
  long lVar18;
  char *pcVar19;
  uint uVar20;
  long *plVar21;
  char *pcVar22;
  uint uVar23;
  undefined8 uVar24;
  uint uVar25;
  uint local_ac;
  char *local_a8 [4];
  undefined1 local_88;
  char cStack_87;
  char cStack_86;
  undefined5 uStack_85;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (param_1 == (long *)0x0) {
    uVar6 = 1;
    goto LAB_00962978;
  }
  if (param_3 != (byte *)0x0) {
    pfVar9 = (fde_table_entry *)strlen((char *)param_3);
    if (&fde_table_entry_007a1200 < pfVar9) {
LAB_009620a4:
      uVar6 = 3;
      goto LAB_00962978;
    }
    switch(param_2) {
    case 0:
      if (pfVar9 != (fde_table_entry *)0x0) {
        if ((byte)((*param_3 & 0xdf) + 0xbf) < 0x1a) {
          uVar11 = 1;
          while( true ) {
            bVar5 = param_3[uVar11];
            if (bVar5 == 0) break;
            if (((9 < bVar5 - 0x30) && (0x19 < (byte)((bVar5 & 0xdf) + 0xbf))) &&
               ((0x2e < bVar5 || ((1L << ((ulong)bVar5 & 0x3f) & 0x680000000000U) == 0))))
            goto LAB_00962208;
            uVar11 = uVar11 + 1;
            if (0x27 < uVar11) goto code_r0x00962204;
          }
        }
        goto LAB_00962224;
      }
      goto LAB_009620a4;
    case 1:
      if ((undefined1 *)((long)&pfVar9[-1].data_loc + 3) < (undefined1 *)0x28) {
        if (((param_4 >> 3 & 1) == 0) && (lVar18 = FUN_00946e30(param_3), lVar18 == 0)) {
          uVar6 = 5;
          goto LAB_00962978;
        }
        bVar5 = *param_3;
        if ((byte)((bVar5 & 0xdf) + 0xbf) < 0x1a) {
          if (pfVar9 != (fde_table_entry *)0x1) {
            lVar18 = 2 - (long)pfVar9;
            pbVar12 = param_3;
            while( true ) {
              pbVar12 = pbVar12 + 1;
              if (((0x19 < (byte)((bVar5 & 0xdf) + 0xbf)) && (9 < (byte)(bVar5 - 0x30))) &&
                 ((0x2e < bVar5 || ((1L << ((ulong)bVar5 & 0x3f) & 0x680000000000U) == 0))))
              goto LAB_00962854;
              if (lVar18 == 0) break;
              bVar5 = *pbVar12;
              lVar18 = lVar18 + 1;
            }
          }
          lVar18 = 0;
          uVar25 = 0;
          uVar23 = 0;
          local_ac = 0;
          *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) & 0xfb;
          plVar21 = param_1;
          goto LAB_0096251c;
        }
      }
LAB_00962854:
      uVar6 = 0x1b;
      goto LAB_00962978;
    case 2:
      plVar21 = param_1 + 1;
      break;
    case 3:
      plVar21 = param_1 + 2;
      break;
    case 4:
      plVar21 = param_1 + 3;
      break;
    case 5:
      plVar21 = param_1 + 4;
      (*(code *)PTR_free_00cc4678)(param_1[5]);
      param_1[5] = 0;
      break;
    case 6:
      if (*param_3 - 0x30 < 10) {
        piVar10 = (int *)__errno();
        *piVar10 = 0;
        uVar11 = strtoul((char *)param_3,local_a8,10);
        uVar6 = 4;
        if ((uVar11 >> 0x10 != 0) || (*piVar10 != 0)) goto LAB_00962978;
        if (*local_a8[0] == '\0') {
          lVar18 = (*(code *)PTR_strdup_00cc4688)(param_3);
          if (lVar18 == 0) {
LAB_00962974:
            uVar6 = 7;
          }
          else {
            (*(code *)PTR_free_00cc4678)(param_1[6]);
            uVar6 = 0;
            param_1[6] = lVar18;
            *(short *)(param_1 + 10) = (short)uVar11;
          }
          goto LAB_00962978;
        }
      }
      uVar6 = 4;
      goto LAB_00962978;
    case 7:
      local_ac = 0;
      uVar25 = 0;
      uVar23 = param_4 >> 7 & 1;
      lVar18 = 1;
      plVar21 = param_1 + 7;
      goto LAB_0096251c;
    case 8:
      local_ac = param_4 >> 8 & 1;
      uVar23 = param_4 >> 7 & 1;
      lVar18 = 0;
      *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) | 1;
      plVar21 = param_1 + 8;
      uVar25 = uVar23;
      goto LAB_0096251c;
    case 9:
      plVar21 = param_1 + 9;
      *(byte *)((long)param_1 + 0x52) = *(byte *)((long)param_1 + 0x52) | 2;
      break;
    case 10:
      plVar21 = param_1 + 5;
      break;
    default:
      goto switchD_00962188_default;
    }
    local_ac = 0;
    lVar18 = 0;
    uVar23 = param_4 >> 7 & 1;
    uVar25 = 0;
LAB_0096251c:
    FUN_00904528(local_a8,(long)pfVar9 * 3 + lVar18 + 1);
    if (((int)lVar18 != 0) && (*param_3 != 0x2f)) {
      iVar7 = FUN_009045fc(local_a8,&DAT_002a91de,1);
      uVar6 = 0x1f;
      if (iVar7 != 100) {
        uVar6 = 7;
      }
      if (iVar7 != 0) goto LAB_00962978;
    }
    if (uVar23 != 0) {
      uVar23 = local_ac;
      do {
        bVar5 = *param_3;
        if (bVar5 == 0x20) {
          if (uVar25 == 0) {
LAB_00962640:
            local_88 = 0x25;
            cStack_87 = "0123456789abcdef"[*param_3 >> 4];
            cStack_86 = "0123456789abcdef"[(ulong)*param_3 & 0xf];
            iVar7 = FUN_009045fc(local_a8,&local_88,3);
            if (iVar7 != 0) goto LAB_00962694;
          }
          else {
            iVar7 = FUN_009045fc(local_a8,&DAT_002a3568,1);
            if (iVar7 != 0) goto LAB_00962974;
          }
        }
        else {
          if (bVar5 == 0) goto LAB_00962768;
          uVar20 = (uint)bVar5;
          if ((0x19 < (byte)((bVar5 & 0xdf) + 0xbf)) && (9 < (byte)(bVar5 - 0x30))) {
            if (bVar5 < 0x5f) {
              if (1 < uVar20 - 0x2d) {
                if (uVar20 != 0x2f) goto LAB_0096260c;
                if ((int)lVar18 == 0) goto LAB_00962640;
              }
            }
            else if ((uVar20 != 0x5f) && (uVar20 != 0x7e)) {
LAB_0096260c:
              if ((uVar20 != 0x3d) || (uVar23 != 1)) goto LAB_00962640;
            }
          }
          iVar7 = FUN_009045fc(local_a8,param_3,1);
          if (iVar7 != 0) goto LAB_00962694;
          uVar23 = uVar23 & uVar20 != 0x3d;
        }
        param_3 = param_3 + 1;
      } while( true );
    }
    iVar7 = FUN_00904728(local_a8,param_3);
    if (iVar7 != 0) {
LAB_00962694:
      uVar6 = 0x1f;
      if (iVar7 != 100) {
        uVar6 = 7;
      }
      goto LAB_00962978;
    }
    pbVar12 = (byte *)FUN_00904974(local_a8);
LAB_009626bc:
    while( true ) {
      pbVar13 = pbVar12;
      if (*pbVar13 == 0x25) {
        pbVar12 = pbVar13 + 1;
        bVar5 = *pbVar12;
        if (9 < bVar5 - 0x30) goto code_r0x009626e8;
        goto LAB_00962700;
      }
      if (*pbVar13 == 0) break;
      pbVar12 = pbVar13 + 1;
    }
LAB_00962768:
    pcVar14 = (char *)FUN_00904974(local_a8);
    if (local_ac == 1 && pcVar14 != (char *)0x0) {
      pcVar22 = (char *)param_1[8];
      if ((pcVar22 != (char *)0x0) && (sVar15 = strlen(pcVar22), sVar15 != 0)) {
        cVar2 = pcVar22[sVar15 - 1];
        FUN_00904528(&local_88,&fde_table_entry_007a1200);
        iVar7 = FUN_009045fc(&local_88,param_1[8],sVar15);
        if ((iVar7 == 0) &&
           (((cVar2 == '&' || (iVar7 = FUN_009045fc(&local_88,&DAT_002af0ff,1), iVar7 == 0)) &&
            (iVar7 = FUN_00904728(&local_88,pcVar14), iVar7 == 0)))) {
          FUN_00904534(local_a8);
          (*(code *)PTR_free_00cc4678)(*plVar21);
          lVar18 = FUN_00904974(&local_88);
          uVar6 = 0;
          *plVar21 = lVar18;
        }
        else {
          FUN_00904534(local_a8);
          uVar6 = 7;
        }
        goto LAB_00962978;
      }
    }
    else if ((param_2 == 5) &&
            ((sVar15 = FUN_00904984(local_a8), (param_4 >> 10 & 1) == 0 || (sVar15 != 0)))) {
      if (sVar15 == 0) {
LAB_009628e8:
        FUN_00904534(local_a8);
        uVar6 = 0x15;
        goto LAB_00962978;
      }
      if (*pcVar14 == '[') {
        iVar7 = FUN_009636a0(param_1,pcVar14,sVar15);
        if (iVar7 != 0) goto LAB_009628e8;
      }
      else {
        sVar17 = strcspn(pcVar14," \r\n\t/:#?!@{}[]\\$\'\"^`*<>=;,+&()%");
        if (sVar17 != sVar15) goto LAB_009628e8;
      }
    }
    (*(code *)PTR_free_00cc4678)(*plVar21);
    uVar6 = 0;
    *plVar21 = (long)pcVar14;
    goto LAB_00962978;
  }
  switch(param_2) {
  case 0:
    (*(code *)PTR_free_00cc4678)(*param_1);
    (*(code *)PTR_free_00cc4678)(param_1[1]);
    (*(code *)PTR_free_00cc4678)(param_1[2]);
    (*(code *)PTR_free_00cc4678)(param_1[3]);
    (*(code *)PTR_free_00cc4678)(param_1[4]);
    (*(code *)PTR_free_00cc4678)(param_1[5]);
    (*(code *)PTR_free_00cc4678)(param_1[6]);
    (*(code *)PTR_free_00cc4678)(param_1[7]);
    (*(code *)PTR_free_00cc4678)(param_1[8]);
    (*(code *)PTR_free_00cc4678)(param_1[9]);
    memset(param_1,0,0x58);
    uVar6 = 0;
    goto LAB_00962978;
  case 1:
    bVar5 = *(byte *)((long)param_1 + 0x52) & 0xfb;
    plVar21 = param_1;
    goto LAB_009622f0;
  case 2:
    plVar21 = param_1 + 1;
    lVar18 = *plVar21;
    break;
  case 3:
    plVar21 = param_1 + 2;
    lVar18 = *plVar21;
    break;
  case 4:
    plVar21 = param_1 + 3;
    lVar18 = *plVar21;
    break;
  case 5:
    plVar21 = param_1 + 4;
    lVar18 = *plVar21;
    break;
  case 6:
    *(undefined2 *)(param_1 + 10) = 0;
    plVar21 = param_1 + 6;
    lVar18 = *plVar21;
    break;
  case 7:
    plVar21 = param_1 + 7;
    lVar18 = *plVar21;
    break;
  case 8:
    bVar5 = *(byte *)((long)param_1 + 0x52) & 0xfe;
    plVar21 = param_1 + 8;
    goto LAB_009622f0;
  case 9:
    bVar5 = *(byte *)((long)param_1 + 0x52) & 0xfd;
    plVar21 = param_1 + 9;
LAB_009622f0:
    *(byte *)((long)param_1 + 0x52) = bVar5;
    lVar18 = *plVar21;
    break;
  case 10:
    plVar21 = param_1 + 5;
    lVar18 = *plVar21;
    break;
  default:
switchD_00962188_default:
    uVar6 = 9;
    goto LAB_00962978;
  }
  if (lVar18 == 0) {
    uVar6 = 0;
  }
  else {
    (*(code *)PTR_free_00cc4678)();
    uVar6 = 0;
    *plVar21 = 0;
  }
LAB_00962978:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar6;
code_r0x009626e8:
  uVar23 = bVar5 - 0x41;
  if ((uVar23 < 0x26) && ((1L << ((ulong)uVar23 & 0x3f) & 0x3f0000003fU) != 0)) {
LAB_00962700:
    bVar1 = pbVar13[2];
    if (9 < bVar1 - 0x30) {
      uVar23 = bVar1 - 0x41;
      if ((0x25 < uVar23) || ((1L << ((ulong)uVar23 & 0x3f) & 0x3f0000003fU) == 0))
      goto LAB_009626bc;
    }
    if ((bVar5 - 0x41 < 0x1a) || ((byte)(bVar1 + 0xbf) < 0x1a)) {
      bVar5 = FUN_009416e0((uint)bVar5);
      pbVar13[1] = bVar5;
      bVar5 = FUN_009416e0(pbVar13[2]);
      pbVar13[2] = bVar5;
      pbVar12 = pbVar13 + 3;
    }
  }
  goto LAB_009626bc;
code_r0x00962204:
  bVar5 = param_3[uVar11];
LAB_00962208:
  if ((bVar5 == 0x3a) && (((param_4 & 0x204) == 0 || (param_3[uVar11 + 1] == 0x2f)))) {
LAB_0096223c:
    uVar6 = FUN_00962c10(param_3,param_1,param_4);
    goto LAB_00962978;
  }
LAB_00962224:
  iVar7 = curl_url_get(param_1,0,&local_88,param_4);
  if (iVar7 != 0) goto LAB_0096223c;
  pcVar22 = (char *)CONCAT53(uStack_85,CONCAT12(cStack_86,CONCAT11(cStack_87,local_88)));
  pcVar16 = strstr(pcVar22,"//");
  bVar5 = *param_3;
  pcVar14 = pcVar22;
  if (pcVar16 != (char *)0x0) {
    pcVar14 = pcVar16 + 2;
  }
  if (bVar5 == 0x2f) {
    if (param_3[1] != 0x2f) {
      pcVar19 = strchr(pcVar14,0x2f);
      pcVar16 = strchr(pcVar14,0x3f);
      if (pcVar19 == (char *)0x0) {
        if (pcVar16 != (char *)0x0) {
          *pcVar16 = '\0';
        }
      }
      else {
        if (pcVar16 == (char *)0x0 || pcVar19 <= pcVar16) {
          pcVar16 = pcVar19;
        }
        *pcVar16 = '\0';
      }
      goto LAB_00962b04;
    }
    uVar24 = 0;
    bVar4 = false;
    *pcVar14 = '\0';
    param_3 = param_3 + 2;
  }
  else {
    pcVar16 = strchr(pcVar14,0x3f);
    if (pcVar16 != (char *)0x0) {
      *pcVar16 = '\0';
      bVar5 = *param_3;
    }
    uVar24 = 1;
    if ((bVar5 == 0x23) || (bVar5 == 0x3f)) {
      bVar4 = true;
    }
    else {
      pcVar16 = strrchr(pcVar14,0x2f);
      if (pcVar16 != (char *)0x0) {
        *pcVar16 = '\0';
        bVar5 = *param_3;
      }
      pcVar16 = strchr(pcVar14,0x2f);
      pcVar14 = (char *)0x0;
      if (pcVar16 != (char *)0x0) {
        pcVar14 = pcVar16 + 1;
      }
      if (bVar5 == 0x2e) {
        pbVar12 = param_3 + 2;
        if (param_3[1] != 0x2f) {
          pbVar12 = param_3;
        }
        if (param_3[(ulong)(param_3[1] == 0x2f) * 2] == 0x2e) {
          iVar7 = 0;
          do {
            param_3 = pbVar12;
            if ((pbVar12[1] != 0x2e) || (pbVar12[2] != 0x2f)) break;
            pbVar12 = pbVar12 + 3;
            iVar7 = iVar7 + 1;
            param_3 = pbVar12;
          } while (*pbVar12 == 0x2e);
        }
        else {
          iVar7 = 0;
          param_3 = pbVar12;
        }
      }
      else {
        iVar7 = 0;
      }
      if (pcVar16 == (char *)0x0) {
        pcVar14 = (char *)0x0;
      }
      else if (iVar7 == 0) {
        pcVar14 = pcVar16 + 1;
      }
      else {
        do {
          pcVar16 = strrchr(pcVar14,0x2f);
          if (pcVar16 == (char *)0x0) {
            *pcVar14 = '\0';
            break;
          }
          iVar7 = iVar7 + -1;
          *pcVar16 = '\0';
        } while (iVar7 != 0);
      }
LAB_00962b04:
      bVar4 = false;
      uVar24 = 1;
    }
  }
  FUN_00904528(local_a8,&fde_table_entry_007a1200);
  iVar7 = FUN_00904728(local_a8,pcVar22);
  if (iVar7 == 0) {
    if (*param_3 != 0x2f) {
      if (pcVar14 == (char *)0x0) {
        if (!bVar4) goto LAB_00962b60;
      }
      else if (!bVar4 && *pcVar14 != '\0') {
LAB_00962b60:
        iVar7 = FUN_009045fc(local_a8,&DAT_002a91de,1);
        if (iVar7 != 0) goto LAB_00962b2c;
      }
    }
    sVar15 = strlen((char *)param_3);
    iVar8 = FUN_00961e58(local_a8,param_3,sVar15,uVar24,0);
    if (iVar8 == 0) {
      uVar24 = FUN_00904974(local_a8);
      iVar7 = 0;
    }
    else {
      uVar24 = 0;
      iVar7 = 100;
      if (iVar8 != 0x1f) {
        iVar7 = 0x1b;
      }
    }
  }
  else {
LAB_00962b2c:
    uVar24 = 0;
  }
  (*(code *)PTR_free_00cc4678)(CONCAT53(uStack_85,CONCAT12(cStack_86,CONCAT11(cStack_87,local_88))))
  ;
  if (iVar7 == 0) {
    uVar6 = FUN_00962c10(uVar24,param_1,param_4);
    (*(code *)PTR_free_00cc4678)(uVar24);
    goto LAB_00962978;
  }
  goto LAB_00962694;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090387c
 */

undefined8
FUN_0090387c(long param_1,long param_2,byte *param_3,int param_4,char *param_5,short param_6)

{
  long *plVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  long lVar5;
  undefined8 *puVar6;
  short sVar7;
  int iVar8;
  int iVar9;
  size_t sVar10;
  long lVar11;
  time_t tVar12;
  undefined *puVar13;
  byte bVar14;
  ulong uVar15;
  size_t sVar16;
  byte *pbVar17;
  undefined8 *puVar18;
  char *pcVar19;
  long lVar20;
  byte *pbVar21;
  byte *pbVar22;
  byte *pbVar23;
  bool bVar24;
  size_t sVar25;
  undefined8 *puVar26;
  ulong local_2e8;
  char *local_2d0;
  byte *local_2a8;
  undefined1 local_2a0 [32];
  undefined8 local_280;
  undefined2 local_278;
  char acStack_270 [512];
  long local_70;
  
  lVar5 = tpidr_el0;
  local_70 = *(long *)(lVar5 + 0x28);
  memset(acStack_270,0,0x200);
  local_278 = 0;
  local_280 = 0;
  for (; (bVar14 = *param_3, bVar14 == 9 || (bVar14 == 0x20)); param_3 = param_3 + 1) {
  }
  pbVar23 = param_3;
  while ((0x3d < bVar14 || ((1L << ((ulong)bVar14 & 0x3f) & 0x2800000100000201U) == 0))) {
    pbVar23 = pbVar23 + 1;
    bVar14 = *pbVar23;
  }
  sVar25 = (long)pbVar23 - (long)param_3;
  if (8 < sVar25 - 1) {
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Excessive alt-svc header, ignoring.");
    }
switchD_00903e74_caseD_0:
    if (*(long *)(lVar5 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return 0;
  }
  memcpy(&local_280,param_3,sVar25);
  local_2a0[sVar25 + 0x20] = 0;
  iVar8 = curl_strequal(&local_280,"clear");
  if (iVar8 != 0) {
    puVar26 = *(undefined8 **)(param_2 + 8);
joined_r0x00903974:
    puVar6 = puVar26;
    if (puVar6 != (undefined8 *)0x0) {
      puVar18 = (undefined8 *)*puVar6;
      puVar26 = (undefined8 *)puVar6[2];
      if ((*(int *)((long)puVar18 + 0xc) == param_4) && (*(short *)(puVar18 + 1) == param_6)) {
        pcVar19 = (char *)*puVar18;
        sVar25 = strlen(param_5);
        sVar10 = strlen(pcVar19);
        if (sVar25 == 0) {
          if (sVar10 != 0) goto joined_r0x00903974;
        }
        else {
          sVar16 = sVar25 - 1;
          if (param_5[sVar25 - 1] != '.') {
            sVar16 = sVar25;
          }
          if (sVar16 != sVar10) goto joined_r0x00903974;
        }
        iVar8 = curl_strnequal(param_5,pcVar19);
        if (iVar8 != 0) {
          FUN_00925d80((long *)(param_2 + 8),puVar6,0);
          (*(code *)PTR_free_00cc4678)(*puVar18);
          (*(code *)PTR_free_00cc4678)(puVar18[2]);
          (*(code *)PTR_free_00cc4678)(puVar18);
        }
      }
      goto joined_r0x00903974;
    }
    goto switchD_00903e74_caseD_0;
  }
  plVar1 = (long *)(param_2 + 8);
  uVar15 = (ulong)*pbVar23;
  lVar20 = 0;
  sVar7 = param_6;
LAB_00903a98:
  if ((int)uVar15 != 0x3d) goto switchD_00903e74_caseD_0;
  iVar8 = curl_strequal(&local_280,&DAT_002a16c6);
  if (iVar8 == 0) {
    iVar8 = curl_strequal(&local_280,&DAT_002a7217);
    if (iVar8 == 0) {
      iVar9 = curl_strequal(&local_280,&DAT_002cee98);
      iVar8 = 0;
      if (iVar9 != 0) {
        iVar8 = 0x20;
      }
    }
    else {
      iVar8 = 0x10;
    }
  }
  else {
    iVar8 = 8;
  }
  if (pbVar23[1] != 0x22) goto switchD_00903e74_caseD_0;
  pbVar21 = pbVar23 + 2;
  bVar14 = *pbVar21;
  pbVar22 = pbVar21;
  if (bVar14 == 0) {
    sVar25 = 0;
  }
  else {
    if (bVar14 == 0x3a) {
      bVar14 = 1;
      local_2d0 = param_5;
LAB_00903c48:
      pbVar22 = pbVar21 + 1;
      if (*pbVar22 - 0x30 < 10) {
        uVar15 = strtoul((char *)pbVar22,(char **)&local_2a8,10);
        pbVar23 = local_2a8;
        if (((0xfffe < uVar15 - 1) || (local_2a8 == pbVar22)) || (*local_2a8 != 0x22))
        goto LAB_00903cb0;
        sVar7 = FUN_00963a54();
        pbVar22 = pbVar23;
      }
      else {
        local_2a8 = pbVar22;
LAB_00903cb0:
        if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"Unknown alt-svc port number, ignoring.");
        }
        bVar14 = 0;
      }
      bVar3 = *pbVar22;
      goto LAB_00903cf0;
    }
    if (bVar14 == 0x5b) {
      pbVar23 = pbVar23 + 3;
      sVar10 = strspn((char *)pbVar23,"0123456789abcdefABCDEF:.");
      if (pbVar23[sVar10] == 0x5d) {
        sVar25 = sVar10 + 2;
        pbVar22 = pbVar23 + sVar10 + 1;
        goto LAB_00903bc4;
      }
      goto switchD_00903e74_caseD_0;
    }
    pbVar23 = pbVar23 + 3;
    do {
      pbVar17 = pbVar23;
      if (((1 < (byte)(bVar14 - 0x2d)) && (0x19 < (byte)((bVar14 & 0xdf) + 0xbf))) &&
         (9 < (byte)(bVar14 - 0x30))) break;
      bVar14 = *pbVar17;
      pbVar23 = pbVar17 + 1;
      pbVar22 = pbVar17;
    } while (bVar14 != 0);
    sVar25 = (long)pbVar22 - (long)pbVar21;
  }
LAB_00903bc4:
  if (sVar25 - 1 < 0x1ff) {
    memcpy(acStack_270,pbVar21,sVar25);
    local_2d0 = acStack_270;
    bVar14 = 1;
    acStack_270[sVar25] = '\0';
  }
  else {
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Excessive alt-svc hostname, ignoring.");
    }
    bVar14 = 0;
    local_2d0 = "";
  }
  bVar3 = *pbVar22;
  pbVar21 = pbVar22;
  if (bVar3 == 0x3a) goto LAB_00903c48;
LAB_00903cf0:
  if (bVar3 != 0x22) goto switchD_00903e74_caseD_0;
  bVar24 = false;
  pbVar22 = pbVar22 + 1;
  bVar3 = 0;
  local_2e8 = 0x15180;
LAB_00903d48:
  pbVar21 = pbVar22 + 2;
  while( true ) {
    pbVar23 = pbVar22 + 1;
    bVar4 = *pbVar22;
    if ((bVar4 != 9) && (bVar4 != 0x20)) break;
    pbVar21 = pbVar21 + 1;
    pbVar22 = pbVar23;
  }
  if (bVar4 == 0x3b) {
    bVar4 = *pbVar23;
    uVar15 = (ulong)bVar4;
    if ((0xd < bVar4) || ((1 << (ulong)(bVar4 & 0x1f) & 0x2401U) == 0)) {
      while (((int)uVar15 == 9 || ((int)uVar15 == 0x20))) {
        pbVar23 = pbVar23 + 1;
        pbVar21 = pbVar21 + 1;
        uVar15 = (ulong)*pbVar23;
      }
      pbVar22 = pbVar23;
      while ((0x3d < (uint)uVar15 || ((1L << (uVar15 & 0x3f) & 0x2800000100000201U) == 0))) {
        pbVar22 = pbVar22 + 1;
        pbVar21 = pbVar21 + 1;
        uVar15 = (ulong)*pbVar22;
      }
      sVar25 = (long)pbVar22 - (long)pbVar23;
      if (sVar25 - 1 < 0x1f) {
        memcpy(local_2a0,pbVar23,sVar25);
        local_2a0[sVar25] = 0;
      }
      else {
        local_2a0[0] = 0;
      }
      for (; (bVar4 = *pbVar22, bVar4 == 9 || (bVar4 == 0x20)); pbVar22 = pbVar22 + 1) {
        pbVar21 = pbVar21 + 1;
      }
      if (bVar4 == 0x3d) {
        do {
          uVar15 = (ulong)*pbVar21;
          switch(uVar15) {
          case 0:
            goto switchD_00903e74_caseD_0;
          default:
            goto switchD_00903e74_caseD_1;
          case 9:
          case 0x20:
            pbVar21 = pbVar21 + 1;
            break;
          case 0x22:
            pbVar21 = pbVar21 + 1;
            goto LAB_00903e94;
          }
        } while( true );
      }
      goto switchD_00903e74_caseD_0;
    }
  }
  else {
    pbVar23 = pbVar22;
  }
  if ((iVar8 != 0) && (!(bool)(bVar14 ^ 1))) {
    lVar2 = lVar20 + 1;
    if (lVar20 == 0) {
      puVar26 = (undefined8 *)*plVar1;
      while (puVar6 = puVar26, puVar6 != (undefined8 *)0x0) {
        puVar18 = (undefined8 *)*puVar6;
        puVar26 = (undefined8 *)puVar6[2];
        if ((*(int *)((long)puVar18 + 0xc) == param_4) && (*(short *)(puVar18 + 1) == param_6)) {
          pcVar19 = (char *)*puVar18;
          sVar25 = strlen(param_5);
          sVar10 = strlen(pcVar19);
          if (sVar25 == 0) {
            sVar16 = 0;
          }
          else {
            sVar16 = sVar25 - 1;
            if (param_5[sVar25 - 1] != '.') {
              sVar16 = sVar25;
            }
          }
          if (sVar16 == sVar10) {
            iVar9 = curl_strnequal(param_5,pcVar19);
            if (iVar9 != 0) {
              FUN_00925d80(plVar1,puVar6,0);
              (*(code *)PTR_free_00cc4678)(*puVar18);
              (*(code *)PTR_free_00cc4678)(puVar18[2]);
              (*(code *)PTR_free_00cc4678)(puVar18);
            }
          }
        }
      }
    }
    lVar11 = FUN_00904258(param_5,local_2d0,param_4,iVar8,param_6,sVar7);
    lVar20 = lVar2;
    if (lVar11 != 0) {
      tVar12 = time((time_t *)0x0);
      *(ulong *)(lVar11 + 0x20) = tVar12 + local_2e8;
      *(byte *)(lVar11 + 0x28) = bVar3;
      FUN_00925d10(plVar1,lVar11,lVar11 + 0x30);
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        if (iVar8 == 8) {
          puVar13 = &DAT_002a16c6;
        }
        else if (iVar8 == 0x20) {
          puVar13 = &DAT_002cee98;
        }
        else if (iVar8 == 0x10) {
          puVar13 = &DAT_002a7217;
        }
        else {
          puVar13 = &DAT_002ab32c;
        }
        FUN_00904c98(param_1,"Added alt-svc: %s:%d over %s",local_2d0,sVar7,puVar13);
      }
    }
  }
  bVar14 = *pbVar23;
  pbVar22 = pbVar23;
  if (bVar14 == 0x2c) {
    do {
      do {
        pbVar22 = pbVar22 + 1;
        bVar14 = *pbVar22;
      } while (bVar14 == 0x20);
    } while (bVar14 == 9);
    pbVar23 = pbVar22;
    while ((0x3d < bVar14 || ((1L << ((ulong)bVar14 & 0x3f) & 0x2800000100000201U) == 0))) {
      pbVar23 = pbVar23 + 1;
      bVar14 = *pbVar23;
    }
    sVar25 = (long)pbVar23 - (long)pbVar22;
    if (8 < sVar25 - 1) goto switchD_00903e74_caseD_0;
    memcpy(&local_280,pbVar22,sVar25);
    local_2a0[sVar25 + 0x20] = 0;
    bVar14 = *pbVar23;
  }
  uVar15 = (ulong)bVar14;
  if ((0x3b < bVar14) || ((1L << (uVar15 & 0x3f) & 0x800000000002401U) == 0)) goto LAB_00903a98;
  goto switchD_00903e74_caseD_0;
switchD_00903e74_caseD_1:
  pbVar22 = pbVar21;
  if (bVar24) {
LAB_00903e94:
    pbVar23 = pbVar21;
    do {
      pbVar22 = pbVar23 + 1;
      bVar4 = *pbVar23;
      pbVar23 = pbVar22;
    } while ((bVar4 == 0) != (bVar4 != 0x22));
    if (bVar4 == 0) goto switchD_00903e74_caseD_0;
    bVar24 = true;
  }
  else {
    while ((0x3b < (uint)uVar15 || ((1L << (uVar15 & 0x3f) & 0x800100100000201U) == 0))) {
      pbVar22 = pbVar22 + 1;
      uVar15 = (ulong)*pbVar22;
    }
    bVar24 = false;
  }
  uVar15 = strtoul((char *)pbVar21,(char **)&local_2a8,10);
  if ((uVar15 != 0xffffffffffffffff) && (local_2a8 != pbVar21)) {
    iVar9 = curl_strequal(&DAT_002cee9b,local_2a0);
    if (iVar9 == 0) {
      iVar9 = curl_strequal("persist",local_2a0);
      bVar3 = bVar3 | (uVar15 == 1 && iVar9 != 0);
    }
    else {
      local_2e8 = uVar15;
    }
  }
  goto LAB_00903d48;
}

